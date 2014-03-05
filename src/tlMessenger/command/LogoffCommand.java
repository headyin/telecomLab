/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;
import tlMessenger.data.UserInfo;

/**
 * @author Xinshang, Chandani
 *
 */
public class LogoffCommand extends Command {
	
	LogoffCommand () {
		this.name = "logoff";
	}

	@Override
	public Message execute(String parameter) {
		Message message = new Message(MessageType.LOGOFF, 0, " ");
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		System.out.println(message.toString());
		switch (message.getSubMessageType()) {
		case 0: System.out.println("Logoff OK"); break;
		case 1: System.out.println("Not Logged In"); break;
		case 2: System.out.println("Session Expired"); break;
		}
		UserInfo.getInstance().setLoggedIn(false);
		UserInfo.getInstance().setStorageCreated(false);
	}

}
