/**
 * 
 */
package tlMessenger.command;

import java.util.HashMap;

import tlMessenger.ui.CommandLineReader;

/**
 * @author Xinshang, Chandani
 *
 */
public class CommandHandler {
	
	/**
	 * The instance of CommandHandler class
	 */
	private static CommandHandler instance = null;
	/**
	 * Reference to the command line reader
	 */
	private CommandLineReader reader;
	
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

}
