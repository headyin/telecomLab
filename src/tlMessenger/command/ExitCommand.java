/**
 * 
 */
package tlMessenger.command;

import tlMessenger.CommunicationHandler;
import tlMessenger.TLMessenger;
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
		CommunicationHandler.getInstance().disconnect();
		TLMessenger.getInstance().stop();
		return null;
	}

	@Override
	public void handleResponse(Message message) {
		// TODO Auto-generated method stub
		
	}
}
