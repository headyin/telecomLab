/**
 * 
 */
package tlMessenger;

import tlMessenger.command.CommandHandler;
import tlMessenger.data.MessageType;
import tlMessenger.data.UserInfo;

/**
 * @author Xinshang, Chandani
 *
 */
public class MessagePoller implements Runnable {
	/**
	 * reference of userInfo
	 */
	private UserInfo userInfo;
	
	/**
	 * reference of commmandHandler;
	 */
	private CommandHandler commandHandler;
	
	private boolean running;
	
	/**
	 * singleton class instance
	 */
	private static MessagePoller instance = null;

	/**
	 * private constructor
	 */
	private MessagePoller()	{
		this.running = false;
	}
	
	/**
	 * @return the userInfo
	 */
	public synchronized UserInfo getUserInfo() {
		return userInfo;
	}

	/**
	 * @param userInfo the userInfo to set
	 */
	public synchronized void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * @return the commandHandler
	 */
	public synchronized CommandHandler getCommandHandler() {
		return this.commandHandler;
	}

	/**
	 * @param commandHandler the commandHandler to set
	 */
	public synchronized void setCommandHandler(CommandHandler commandHandler) {
		this.commandHandler = commandHandler;
	}

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
	
	/**
	 * stop messagePoller
	 */
	public synchronized void stop() {
		this.setRunning(false);
	}

	/**
	 * get the singleton instance of messagePoller
	 * @return
	 */
	public static MessagePoller getInstance() {
		if (instance == null) {
			instance = new MessagePoller();
		}
		return instance;
	}
	
	/**
	 * initialize message poller with userinfo and commandhandler
	 * @param userInfo
	 * @param commandHandler
	 */
	public void init(UserInfo userInfo, CommandHandler commandHandler) {
		this.userInfo = userInfo;
		this.commandHandler = commandHandler;
	}

	/**
	 * Implement the run() method of the Runnable interface. 
	 */
	@Override
	public void run()
	{
		this.setRunning(true);
		int seconds = 0;
		while (this.isRunning()) {
			try {
				seconds ++;
				if (this.userInfo.isLoggedIn() && this.userInfo.isStorageCreated()) {
					this.commandHandler.handleInputCommand(MessageType.QUERY_MESSAGE.getCommandName());
					if (seconds % 10 ==0) {
						Thread.sleep(1000);
						this.commandHandler.handleInputCommand(MessageType.QUERY_FILE.getCommandName());
						seconds = 0;
					}
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Message poller thread stops.");
	}
}
