/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;
import tlMessenger.ui.CommandLineReader;

/**
 * @author Xinshang, Chandani
 *
 */
public class SendMessageCommand extends Command {

	SendMessageCommand () {
		this.name = MessageType.SEND_MESSAGE.getCommandName();
	}

	@Override
	public Message execute(String parameter) {
		String destUserName = CommandLineReader.getInstance().readLine("dest_username:");
		while (destUserName.indexOf(",") != -1) {
			System.out.println("User name cannot contain a comma, please enter again");
			destUserName = CommandLineReader.getInstance().readLine("est_username:");
		}
		String sentMessage = CommandLineReader.getInstance().readLine("message:");
		Message message = new Message(MessageType.SEND_MESSAGE, 0, destUserName + "," + sentMessage);
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		System.out.println(message.toString());
		switch (message.getSubMessageType()){
		case 0:
			System.out.println("Message Sent"); break;
		case 1:
			System.out.println("Failed to write to the user's data store"); break;
		case 2:
			System.out.println("User doesn't exist"); break;
		case 3:
			System.out.println("Not Logged In"); break;
		case 4:
			System.out.println("Badly Formatted"); break;
		}

	}

}
