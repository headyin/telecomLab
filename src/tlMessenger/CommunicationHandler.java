/**
 * 
 */
package tlMessenger;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Xinshang, Chandani
 *
 */
public class CommunicationHandler {
	/**
	 * socket connection to the char server
	 */
	private Socket serverSocket;
	
	/**
	 * Stream for sending data to server
	 */
	DataOutputStream outputStream;
	
	/**
	 * Stream for receiving data from server
	 */
	InputStream inputStream;
	
	
	/**
	 * singleton class instance
	 */
	private static CommunicationHandler instance = null;
	
	/**
	 * get the singleton class instance
	 * @return
	 */
	public static CommunicationHandler getInstance() {
		if (instance == null) {
			instance = new CommunicationHandler();
		}
		return instance;
	}
	
	/**
	 * private default constructor
	 */
	private CommunicationHandler() {
	}
	
	/**
	 * Connect to chat server
	 * @param serverName
	 * @param port
	 * @return true: successful; false: failed
	 */
	public boolean connect(String serverName, int port) {
		InetAddress serverIp;
		try {
			serverIp = InetAddress.getByName(serverName);
		} catch (UnknownHostException e) {
			System.out.println("Cannot get server IP address");
			return false;
		}
		try {
			serverSocket = new Socket(serverIp, port);
			outputStream = new DataOutputStream(serverSocket.getOutputStream());
			inputStream = serverSocket.getInputStream();
		} catch (IOException e) {
			System.out.println("Cannot connect to the server.");
			return false;
		}
		return true;		
	}
	
	/**
	 * Disconnect from chat server
	 * @return true: successful; false: failed
	 */
	public boolean disconnect() {
		if ((this.serverSocket.isConnected()) && (!this.serverSocket.isClosed())) {
			try {
				this.serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Send a message to server
	 * @param message
	 * @return true: successful; false: failed
	 */
	public boolean send(byte[] message) {
		try {
			outputStream.write(message);
			outputStream.flush();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public byte[] receive(int length) {
		byte[] buffer = new byte[length];
		int pos = 0;
		try {
			while ((pos < length)) {
				pos += inputStream.read(buffer, pos , length - pos);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer;		
	}

}
