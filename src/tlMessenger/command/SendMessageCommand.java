/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;

/**
 * @author Xinshang, Chandani
 *
 */
public class SendMessageCommand extends Command {
	
	SendMessageCommand () {
		this.name = "send-message";
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
