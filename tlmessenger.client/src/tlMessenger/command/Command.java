/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;

/**
 * @author Xinshang, Chandani
 *
 */
public abstract class Command {
	
	/**
	 * The name of the command
	 */
	protected String name;
	
	/**
	 * Get the name of the command
	 * @return String: the name of the command
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * generate the message needed to sent to the server according to parameter
	 * @param parameter
	 * @return Message to sent to the server
	 */
	public abstract Message execute(String parameter);
	
	/**
	 * Handler the response message received from the server
	 * @param message
	 */
	public abstract void handleResponse(Message message);

}
