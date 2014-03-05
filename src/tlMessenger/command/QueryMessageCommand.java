/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;

/**
 * @author Xinshang, Chandani
 *
 */
public class QueryMessageCommand extends Command {
	
	QueryMessageCommand () {
		this.name = "query-message";
	}

	@Override
	public Message execute(String parameter) {
		Message message = new Message(MessageType.QUERY_MESSAGE, 0, " ");
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		switch (message.getSubMessageType()){
		case 0: break;
		case 1:
			System.out.println("New Message: " + message.getData()); break;
		}
	}

}
