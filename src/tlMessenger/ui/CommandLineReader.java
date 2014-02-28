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
	 * jline console reader
	 */
	private ConsoleReader reader;
	
	/**
	 * use system.in as input for the line reader
	 * @throws IOException
	 */
	public CommandLineReader(){
		this(System.in, null);	
	}
	
	/**
	 * use system.in as input and specified auto-completors for the line reader
	 * @param completorString
	 * @throws IOException
	 */
	public CommandLineReader(String[] completorString){
		this(System.in, completorString);
	}

	/**
	 * Use specified input, and auto-completors for the line reader
	 * @param in
	 * @param completorString
	 * @throws IOException
	 */
	public CommandLineReader(InputStream in, String[] completorString){
		try {
			this.reader = new ConsoleReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader.setInput(in);
		reader.setBellEnabled(false);
		SimpleCompletor completor = new SimpleCompletor(completorString);
		reader.addCompletor(completor);
	}
	
	/**
	 * read one line with prompt >>
	 * @return
	 */
	public String readLine() {
		return this.readLine(">>");
	}
	
	/**
	 * read one line with specified prompt
	 * @param prompt
	 * @return
	 */
	public String readLine(String prompt)
	{
		String line = "";
		try {
			line = this.reader.readLine(prompt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

}
