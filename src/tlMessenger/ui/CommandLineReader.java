/**
 * 
 */
package tlMessenger.ui;

import java.io.IOException;
import java.io.InputStream;

import jline.ConsoleReader;
import jline.SimpleCompletor;

/**
 * @author Xinshang, Chandani
 *
 */
public class CommandLineReader {
	
	/**
	 * the sole instance of CommandLineReader;
	 */
	private static CommandLineReader instance = null;
	
	public static CommandLineReader getInstance() {
		if (instance == null) {
			instance = new CommandLineReader();
		}
		return instance;
	}
	
	/**
	 * jline console reader
	 */
	private ConsoleReader reader;
	
	/**
	 * private constructor
	 */
	private CommandLineReader(){
	}
	
	/**
	 * use system.in as input for the line reader
	 * @param completorString
	 */
	public void init(){
		this.init(System.in, null);
	}
	
	/**
	 * use system.in as input and specified auto-completors for the line reader
	 * @param completorString
	 */
	public void init(String[] completorString){
		this.init(System.in, completorString);
	}

	/**
	 * Use specified input, and auto-completors for the line reader
	 * @param in
	 * @param completorString
	 */
	public void init (InputStream in, String[] completorString){
		try {
			this.reader = new ConsoleReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.setInput(in);
		reader.setBellEnabled(false);
		SimpleCompletor completor = new SimpleCompletor(completorString);
		reader.addCompletor(completor);
	}
	
	/**
	 * read one line
	 * @return
	 */
	public String readLine() {
		return this.readLine("", null);
	}
	/**
	 * read one line show prompt
	 * @param prompt
	 * @return
	 */
	public String readLine(String prompt) {
		return this.readLine(prompt, null);
	}
	
	/**
	 * read one line show mask instead of user input
	 * @param mask
	 * @return
	 */
	public String readLine(Character mask) {
		return this.readLine("", mask);
	}
	
	/**
	 * read one line with specified prompt and mask
	 * @param prompt
	 * @return
	 */
	public String readLine(String prompt, Character mask)
	{
		String line = "";
		try {
			line = this.reader.readLine(prompt, mask);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

}
