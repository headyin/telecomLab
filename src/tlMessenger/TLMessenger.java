/**
 * 
 */
package tlMessenger;

import tlMessenger.command.CommandHandler;
import tlMessenger.data.UserInfo;
import tlMessenger.ui.CommandLineReader;

/**
 * @author Xinshang, Chandani
 *
 */
public final class TLMessenger {
	
	/**
	 * Singleton class instance
	 */
	private static TLMessenger instance = null;
	
	/**
	 * message poller thread
	 */
	private Thread pollerThread;
	
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
		TLMessenger tlMessenger = TLMessenger.getInstance();
		//initialize the command line reader with command auto completes
		CommandLineReader.getInstance().init(System.in,
				CommandHandler.getInstance().getCommandNameArray());
		tlMessenger.start();
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
	public void start() {
		this.isRunning = CommunicationHandler.getInstance().connect("dsp2014.ece.mcgill.ca", 5000);
		MessagePoller.getInstance().init(UserInfo.getInstance(), CommandHandler.getInstance());
		this.pollerThread = new Thread(MessagePoller.getInstance());
		pollerThread.start();
		while (this.isRunning) {
			String line = CommandLineReader.getInstance().readLine(">>");
			CommandHandler.getInstance().handleInputCommand(line);
		}
		//wait until poller thread ends
		try {
			this.pollerThread.join();;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * stop TLMessenger
	 */
	public void stop() {
		MessagePoller.getInstance().stop();
		this.isRunning = false;
	}

}
