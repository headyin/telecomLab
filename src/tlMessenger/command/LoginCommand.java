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
public class LoginCommand extends Command {
	
	LoginCommand () {
		this.name = "login";
	}

	@Override
	public Message execute(String parameter) {
		String userName = CommandLineReader.getInstance().readLine("user name:");
		while (userName.indexOf(",") != -1) {
			System.out.println("User name cannot contain a comma, please enter again");
			userName = CommandLineReader.getInstance().readLine("user name:");
		}
		String password = CommandLineReader.getInstance().readLine("password:",
				new Character('*'));
		Message message = new Message(MessageType.LOGIN, 0, userName + "," + password);
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		System.out.println(message.toString());
		switch (message.getSubMessageType()) {
		case 0: System.out.println("Login Ok"); break;
		case 1: System.out.println("User already logged in"); break;
		case 2: System.out.println("Bad credentials"); break;
		case 3: System.out.println("Badly formatted message"); break;
		}		
	}

}
