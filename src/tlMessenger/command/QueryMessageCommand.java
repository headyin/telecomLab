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
		this.name = MessageType.QUERY_MESSAGE.getCommandName();
	}

	@Override
	public Message execute(String parameter) {
		Message message = new Message(MessageType.QUERY_MESSAGE, 0, " ");
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		if (!message.getMessageType().equals(MessageType.QUERY_MESSAGE)) {
			return;
		}
		boolean newMessage = false;
		switch (message.getSubMessageType()){
		case 0: break;
		case 1: newMessage = true; break;
		}
		if (newMessage) {
			String text = message.getData();
			if (text == null) {
				return;
			}
			String userFrom = "Unknown";
			String time = "Unknown";
			int firstComma = text.indexOf(",");
			if (firstComma != -1) {
				userFrom = text.substring(0, firstComma);
				text = text.substring(firstComma + 1);
				int secondComma = text.indexOf(",");
				if (secondComma != -1) {
					time = text.substring(0,secondComma);
					text = text.substring(secondComma + 1);
				}
			}
			System.out.println("New message from " + userFrom + " at " + time + " \n" + text);
		}
	}

}
