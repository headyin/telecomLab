/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;
import tlMessenger.data.UserInfo;
import tlMessenger.ui.CommandLineReader;

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
		// TODO Auto-generated method stub
		//String messageToStore = CommandLineReader.getInstance().readLine("");
		//while(messageToStore.){
			
		//}
		UserInfo.getInstance().setStorageCreated(true);
		
		Message message = new Message(MessageType.CREATE_STORE, 0,null);
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		// TODO Auto-generated method stub
		System.out.println(message.toString());
		switch (message.getSubMessageType()){
		case 0:
			System.out.println("Store Created Successfully"); break;
		case 1:
			System.out.println("Store already Exists"); break;
		case 2:
			System.out.println("Not Logged In"); break;
		}
	}

}
