/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;

/**
 * @author Xinshang, Chandani
 *
 */
public class ExitCommand extends Command {

	ExitCommand() {
		this.name = "exit";
	}

	@Override
	public Message execute(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleResponse(Message message) {
		// TODO Auto-generated method stub
		
	}
}
