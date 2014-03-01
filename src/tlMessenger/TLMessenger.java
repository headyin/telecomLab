/**
 * 
 */
package tlMessenger;

import tlMessenger.command.CommandHandler;
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
		this.isRunning = true;
		while (this.isRunning) {
			String line = CommandLineReader.getInstance().readLine(">>");
			CommandHandler.getInstance().handleInputCommand(line);
		}
	}
	
	/**
	 * 
	 */
	public void stop() {
		this.isRunning = false;
	}

}
