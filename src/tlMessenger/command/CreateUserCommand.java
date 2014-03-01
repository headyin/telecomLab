/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
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
		//System.out.println(userName + ", " + password);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleResponse(Message message) {
		// TODO Auto-generated method stub
		
	}

}
