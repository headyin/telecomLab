/**
 * 
 */
package tlMessenger;

import tlMessenger.command.CommandHandler;

/**
 * @author Xinshang, Chandani
 *
 */
public final class TLMessenger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommandHandler.getInstance().start();
	}

}
