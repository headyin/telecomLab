/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;
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
		String password = CommandLineReader.getInstance().readLine("password:",
				new Character('*'));
		//System.out.println(userName + ", " + password);
		UserInfo.getInstance().setUserName(userName);
		UserInfo.getInstance().setPassword(password);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleResponse(Message message) {
		// TODO Auto-generated method stub
		
	}

}
