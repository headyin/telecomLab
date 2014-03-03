/**
 * 
 */
package tlMessenger.command;

import tlMessenger.CommunicationHandler;
import tlMessenger.data.Message;
import tlMessenger.data.MessageType;

/**
 * @author Xinshang, Chandani
 *
 */
public class EchoCommand extends Command {
	
	EchoCommand() {
		this.name = "echo";
	}

	@Override
	public Message execute(String parameter) {
		Message message = new Message(MessageType.ECHO, 0, parameter);
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		System.out.println(message.toString());	
	}

}
