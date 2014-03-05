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
public class DeleteUserCommand extends Command {
	
	DeleteUserCommand () {
		this.name = "delete-user";
	}

	@Override
	public Message execute(String parameter) {
		Message message = new Message(MessageType.DELETE_USER, 0, " ");
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		boolean deleted = false;
		System.out.println(message.toString());
		switch (message.getSubMessageType()){
		case 0:
			System.out.println("User Deletion Success");
			deleted = true;
			break;
		case 1:
			System.out.println("Not Logged In");
			deleted = true;
			break;
		case 2:
			System.out.println("General Error"); break;
		}
		if (deleted) {
			UserInfo.getInstance().setLoggedIn(false);
			UserInfo.getInstance().setStorageCreated(false);
		}
		
	}

}
