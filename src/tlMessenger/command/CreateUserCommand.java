/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;
import tlMessenger.ui.CommandLineReader;

/**
 * @author headyin
 *
 */
public class CreateUserCommand extends Command {
	
	CreateUserCommand () {
		this.name = "create-user";
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
		String passwordConfirm = CommandLineReader.getInstance().readLine("password confirm:",
				new Character('*'));
		while (! password.equals(passwordConfirm)) {
			System.out.println("Password doesn't not match, please enter again.");
			password = CommandLineReader.getInstance().readLine("password:",
					new Character('*'));
			passwordConfirm = CommandLineReader.getInstance().readLine("password confirm:",
					new Character('*'));
		}
		Message message = new Message(MessageType.CREATE_USER, 0, userName + "," + password);
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		System.out.println(message.toString());
		switch (message.getSubMessageType()) {
		case 0: System.out.println("User Creation Success"); break;
		case 1: System.out.println("User Already Exists"); break;
		case 2: System.out.println("User Already Logged In"); break;
		case 3: System.out.println("Badly Formatted Create User Request"); break;
		}
	}

}
