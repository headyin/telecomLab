/**
 * 
 */
package tlMessenger.command;

import tlMessenger.data.Message;

/**
 * @author Xinshang, Chandani
 *
 */
public class QueryMessageCommand extends Command {
	
	QueryMessageCommand () {
		this.name = "query-message";
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
