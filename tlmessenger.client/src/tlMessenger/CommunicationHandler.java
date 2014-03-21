/**
 * 
 */
package tlMessenger;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;



import tlMessenger.command.CommandHandler;
import tlMessenger.data.Message;

/**
 * @author Xinshang, Chandani
 *
 */
public class CommunicationHandler implements Runnable{
	/**
	 * indicate if the communication handler receiver thread is running or not
	 */
	boolean running;
	
	/**
	 * @return the running
	 */
	public synchronized boolean isRunning() {
		return running;
	}

	/**
	 * @param running the running to set
	 */
	public synchronized void setRunning(boolean running) {
		this.running = running;
	}

	
	private SSLSocketFactory sslsocketfactory;
    private SSLSocket sslsocket;

    
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
		System.setProperty("javax.net.ssl.keyStore", "./certificate/cacert.key");
		System.setProperty("javax.net.ssl.keyStorePassword", "ECSE489");
		try {
			sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
			sslsocket = (SSLSocket) sslsocketfactory.createSocket(serverIp, port);
			//serverSocket = new Socket(serverIp, port);
			outputStream = new DataOutputStream(sslsocket.getOutputStream());
			inputStream = sslsocket.getInputStream();
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
		if ((this.sslsocket.isConnected()) && (!this.sslsocket.isClosed())) {
			try {
				this.sslsocket.close();
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
			System.out.println("sending data: " + message);
			outputStream.write(message);
			System.out.println("sending data complet...: " + message);
			outputStream.flush();
			System.out.println("sending data complete: " + message);

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
			while ((pos < length) && this.isRunning()) {
				if (inputStream.available() > 0) {
					pos += inputStream.read(buffer, pos , length - pos);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer;		
	}
	
	public void stop() {
		this.setRunning(false);
	}

	@Override
	public void run() {
		this.setRunning(true);
		while (this.isRunning()) {
			byte[] receiveByte1 = this.receive(12);
			int dataLength = Message.expectedDataSize(receiveByte1);
			byte[] receiveByte2 = this.receive(dataLength);
			Message responesMessage = new Message(receiveByte1, receiveByte2);
			CommandHandler.getInstance().handleInputMessage(responesMessage);
		}
		System.out.println("Message receiver thread stops");
	}
}
