/**
 * 
 */
package tlMessenger;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import tlMessenger.command.CommandHandler;
import tlMessenger.data.Message;
import tlMessenger.ui.CommandLineReader;

/**
 * @author Xinshang, Chandani
 *
 */
public class MessagePoller implements Runnable {
	Socket socket;
	int port;
	String host;
	boolean connected;

	public MessagePoller(String host, Socket socket) throws Exception
	{
		this.host = host;
		this.socket = socket;
		this.connected=true;
	}

	/**
	 * Implement the run() method of the Runnable interface. 
	 */
	@Override
	public void run()
	{
		while(connected){
			try {
				checkMessage();
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	private void checkMessage() throws Exception{
		InputStream input = socket.getInputStream();
		//OutputStream output = socket.getOutputStream();

		BufferedReader inputStream = new BufferedReader(new InputStreamReader(input));
		//DataOutputStream outputStream = new DataOutputStream(output);

		while(true){
			String requestLine= inputStream.readLine();		
			System.out.println(requestLine);
		}
	}




}
