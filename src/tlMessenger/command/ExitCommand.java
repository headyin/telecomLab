/**
 * 
 */
package tlMessenger.command;

import tlMessenger.TLMessenger;
import tlMessenger.data.Message;
import tlMessenger.data.MessageType;

/**
 * @author Xinshang, Chandani
 *
 */
public class ExitCommand extends Command {

	ExitCommand() {
		this.name = MessageType.EXIT.getCommandName();
	}

	@Override
	public Message execute(String parameter) {
		TLMessenger.getInstance().stop();
		return null;
	}

	@Override
	public void handleResponse(Message message) {		
	}
}
