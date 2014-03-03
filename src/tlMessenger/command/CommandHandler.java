/**
 * 
 */
package tlMessenger.command;

import java.util.HashMap;

import tlMessenger.CommunicationHandler;
import tlMessenger.data.Message;
/**
 * @author Xinshang, Chandani
 *
 */
public class CommandHandler {
	
	/**
	 * The instance of CommandHandler class
	 */
	private static CommandHandler instance = null;
	public static CommandHandler getInstance() {
		if (CommandHandler.instance == null) {
			CommandHandler.instance = new CommandHandler();
		}
		return CommandHandler.instance;
	}
	
	/**
	 * A map of command name to command
	 */
	private HashMap<String, Command> commandMap;
	
	/**
	 * an array contains all the command names
	 */
	private String[] commandNameArray;
	
	/**
	 * Get an array contains all the command names
	 * @return Sting[]: command name array
	 */
	public String[] getCommandNameArray() {
		return commandNameArray;
	}
	
	/**
	 * Private constructor
	 */
	private CommandHandler () {
		this.commandMap = new HashMap<String, Command>();
		
		//create exit command
		Command command = new ExitCommand();
		commandMap.put(command.getName(), command);
		//create echo command
		command = new EchoCommand();
		commandMap.put(command.getName(), command);
		//create login command
		command = new LoginCommand();
		commandMap.put(command.getName(), command);
		//create logoff command
		command = new LogoffCommand();
		commandMap.put(command.getName(), command);
		//create create-user command
		command = new CreateUserCommand();
		commandMap.put(command.getName(), command);
		//create delete-user command
		command = new DeleteUserCommand();
		commandMap.put(command.getName(), command);
		//create create-store command
		command = new CreateStoreCommand();
		commandMap.put(command.getName(), command);
		//create send-message command
		command = new SendMessageCommand();
		commandMap.put(command.getName(), command);
		//create query-message command
		command = new QueryMessageCommand();
		commandMap.put(command.getName(), command);
		
		commandNameArray = new String[commandMap.size()];
		commandMap.keySet().toArray(commandNameArray);
	}
	
	/**
	 * get the command key word
	 * @param s
	 * @return
	 */
	private String getCommandKey(String s) {
		int firstSpcaePos = s.indexOf(" ");
		if (firstSpcaePos < 0) {
			firstSpcaePos = s.length();
		}
		String command = s.substring(0, firstSpcaePos);
		return command;
	}
	
	private String getCommandParameter(String s) {
		while (s.charAt(s.length() - 1) == ' ') {
			s = s.substring(0, s.length() - 1);
		}
		if (s.indexOf(" ") == -1) {
			return "";
		}
		String parameter = s.substring(s.indexOf(" ") + 1);
		while (parameter.charAt(0) == ' ') {
			parameter = parameter.substring(1);
		}
		return parameter;
	}
	
	/**
	 * Handle the input command
	 * @param command
	 */
	public void handleInputCommand(String userInput) {
		String commandKey = this.getCommandKey(userInput);
		String parameter = this.getCommandParameter(userInput);
		
		//System.out.println(commandKey);
		//System.out.println(parameter);
		
		Command command = commandMap.get(commandKey);
		if (command == null) {
			System.out.println("Command " + commandKey + " not found");
			return;
		}
		//execute the command
		Message message = command.execute(parameter);
		if (message != null) {
			 //send message to server
			CommunicationHandler.getInstance().send(message.getBinaryFormatMessage());
			if (message.isHaveRespones()) {
				//if there is response message, wait to receive the response message and handle it in the same command
				byte[] receiveByte1 = CommunicationHandler.getInstance().receive(12);
				int dataLength = Message.expectedDataSize(receiveByte1);
				byte[] receiveByte2 = CommunicationHandler.getInstance().receive(dataLength);
				Message responesMessage = new Message(receiveByte1, receiveByte2);
				command.handleResponse(responesMessage);				
			}
		}
	}

}
