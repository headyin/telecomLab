/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleResponse(Message message) {
		// TODO Auto-generated method stub
		
	}

}
