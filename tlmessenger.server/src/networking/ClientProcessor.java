package networking;

import java.io.*;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;

import javax.net.ssl.SSLSocket;

import database.IResource;
import logging.LogLevel;
import logging.Logfile;
import networking.auth.AuthenticationManager;
import networking.protocol.*;
import networking.protocol.types.MessageType;

public class ClientProcessor extends Thread implements IAsyncClientWriter {

	private boolean alive;
	private SSLSocket s;

	private InputStream rawIn;
	private OutputStream rawOut;

	private IncomingPacketHandler processor;
	private static final int MAXIMUM_PACKET_SIZE = 0x7FFFFFFF; // 2 G, not bytes = 256 KB

	public ClientProcessor(SSLSocket s, IResource resource,
			AuthenticationManager manager) {
		try {
			this.s = s;
			this.alive = true;
			this.rawIn = s.getInputStream();
			this.rawOut = s.getOutputStream();

			processor = new IncomingPacketHandler(manager, resource, this);
		} catch (IOException e) {
			Logfile.writeToFile(
					"Failed to create the client stream readers and writers",
					LogLevel.ERROR);
			this.alive = false;
		}
	}

	public UnformattedPacket readPacket() {
		try {

			byte[] headers = new byte[12];
			int bytesRead = 0;
			while(bytesRead < 12) {
				if (this.s.isClosed()) {
					return null;
				}
				if (bytesRead < 0) {
					return null;
				}
			  bytesRead += rawIn.read(headers, bytesRead, 12 - bytesRead);
			}
			
			byte[] hArray = Arrays.copyOfRange(headers,0,4);
			byte[] h2Array = Arrays.copyOfRange(headers,4,8);
			byte[] sArray = Arrays.copyOfRange(headers,8,12);
			
			int s = ByteBuffer.wrap(sArray).getInt();

			if (s >= MAXIMUM_PACKET_SIZE || s < 0) {
				// dump the remaining data on the socket (it's assumed garbage)
				int avail = 0;
				while ((avail = rawIn.available()) > 0) {
					rawIn.read(new byte[avail], 0, avail);
				}
				Logfile.writeToFile("Bad packet size of " + s + " received from " + getHost().getHostAddress(), LogLevel.ERROR);
				
				return new UnformattedPacket(
						0,
						0,
						("Bad packet size in the header. Size must be between 0 and "
								+ MAXIMUM_PACKET_SIZE + ", inclusive")
								.getBytes());
			}
			System.out.println("s=" + s + "\n");

			byte[] data = new byte[s];
			int totalByteRead = 0;
			int byteRead = 0;
			while ((totalByteRead < s) &&
				   ((byteRead = rawIn.read(data, totalByteRead, s - totalByteRead)) != -1)) {
				totalByteRead += byteRead;
			}
			System.out.println("total byte read: " + totalByteRead + "\n");

			return new UnformattedPacket(hArray, h2Array, sArray, data);
		} catch (IOException e) {
			Logfile.writeToFile("Failed to read from socket "
					+ getHost().getHostAddress(), LogLevel.ERROR);
			this.closeConnection();
			return null;
		}
	}

	public void writePacket(UnformattedPacket pkt) {
		try {
			rawOut.write(pkt.serialize());
			rawOut.flush();
		} catch (IOException e) {
			Logfile.writeToFile("Could not send packet to client "
					+ getHost().getHostAddress(), LogLevel.INFO);
			this.closeConnection();
		}
	}

	public void run() {
		while (alive) {
			// packet processing
			UnformattedPacket p = readPacket();
			if (p == null) {
				closeConnection();
				continue;
			}

			Logfile.writeToFile("Received message from "
					+ getHost().getHostAddress(), LogLevel.INFO);
			UnformattedPacket response = processor.keepAliveProcess(p);
			if (response.getHeader() == MessageType.EXIT.getInt()) {
				this.closeConnection();
				Logfile.writeToFile("Exit requested from client "
						+ getHost().getHostAddress(), LogLevel.INFO);
			} else {
				writePacket(response);
			}
		}
	}

	public void closeConnection() {
		this.alive = false;
		try {
			this.rawOut.close();
			this.rawIn.close();
			this.s.close();
			Logfile.writeToFile("Closed connection from: "
					+ getHost().getHostAddress(), LogLevel.INFO);
		} catch (IOException e) {
			Logfile.writeToFile("Failed to close the client socket",
					LogLevel.ERROR);
		}
	}

	public InetAddress getHost() {
		return this.s.getInetAddress();
	}

}
