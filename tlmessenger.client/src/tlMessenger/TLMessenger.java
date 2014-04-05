/**
 * 
 */
package tlMessenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import tlMessenger.command.CommandHandler;
import tlMessenger.data.UserInfo;
import tlMessenger.ui.CommandLineReader;

/**
 * @author Xinshang, Chandani
 *
 */
public final class TLMessenger {

	public static final String configfile = "./config/client.cfg";
	
	/**
	 * Singleton class instance
	 */
	private static TLMessenger instance = null;
	
	/**
	 * message poller thread
	 */
	private Thread pollerThread;
	
	/**
	 * receiver thread
	 */
	private Thread receiverThread;
	
	/**
	 * 
	 * @return instance of TLMessenger
	 */
	public static TLMessenger getInstance() {
		if (instance == null) {
			instance = new TLMessenger();
		}
		return instance;
	}
	
	private TLMessenger() {
		this.isRunning = false;
	}
	
	private boolean isRunning;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File configfolder = new File("./config");
		if (!configfolder.exists()) {
			System.out.println("Creating config directory");
			configfolder.mkdir();
		}
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(configfile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String server = props.getProperty("server","localhost");
		int port = Integer.parseInt(props.getProperty("port","5000"));
		
		System.setProperty("javax.net.ssl.trustStore", "./certificate/server.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "ECSE489");
		
		System.setProperty("javax.net.ssl.keyStore", "./certificate/client.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "ECSE489");
		
		TLMessenger tlMessenger = TLMessenger.getInstance();
		//initialize the command line reader with command auto completes
		CommandLineReader.getInstance().init(System.in,
				CommandHandler.getInstance().getCommandNameArray());
		tlMessenger.start(server, port);
	}
	
	/**
	 * Check if TLMessenger is running or not
	 * @return true: running; false: not running
	 */
	public boolean isRunning() {
		return this.isRunning;
	}
	
	/**
	 * 
	 */
	public void start(String server, int port) {
		this.isRunning = CommunicationHandler.getInstance().connect(server, port);
		
		if (this.isRunning) {
			MessagePoller.getInstance().init(UserInfo.getInstance(), CommandHandler.getInstance());
			this.pollerThread = new Thread(MessagePoller.getInstance());
			this.receiverThread = new Thread(CommunicationHandler.getInstance());
			
			this.receiverThread.start();
			//this.pollerThread.start();
		}

		
		while (this.isRunning) {
			String line = CommandLineReader.getInstance().readLine(">>");
			CommandHandler.getInstance().handleInputCommand(line);
		}
		//wait until poller thread ends
		try {
			if (this.pollerThread != null) {
				this.pollerThread.join();
			}
			if (this.receiverThread != null) {
				this.receiverThread.join(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommunicationHandler.getInstance().disconnect();
	}
	
	/**
	 * stop TLMessenger
	 */
	public void stop() {
		MessagePoller.getInstance().stop();
		CommunicationHandler.getInstance().stop();
		this.isRunning = false;
	}

}
