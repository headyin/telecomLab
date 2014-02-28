/**
 * 
 */
package tlMessenger.command;

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

}
