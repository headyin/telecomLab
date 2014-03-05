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
public class CreateStoreCommand extends Command {

	CreateStoreCommand() {
		this.name = "create-store";
	}

	@Override
	public Message execute(String parameter) {		
		Message message = new Message(MessageType.CREATE_STORE, 0, " ");
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		boolean created = false;
		System.out.println(message.toString());
		switch (message.getSubMessageType()){
		case 0:
			System.out.println("Store Created Successfully");
			created = true;
			break;
		case 1:
			System.out.println("Store already Exists");
			created = true;
			break;
		case 2:
			System.out.println("Not Logged In"); break;
		}
		if (created) {
			UserInfo.getInstance().setStorageCreated(true);
		}
	}

}
