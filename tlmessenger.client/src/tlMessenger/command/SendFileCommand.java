package tlMessenger.command;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;
import tlMessenger.ui.CommandLineReader;

public class SendFileCommand extends Command {
		
	SendFileCommand () {
		this.name = MessageType.SEND_FILE.getCommandName();
	}

	@SuppressWarnings("resource")
	@Override
	public Message execute(String parameter) {
		String destUserName = CommandLineReader.getInstance().readLine("dest_username:");
		while (destUserName.indexOf(",") != -1) {
			System.out.println("User name cannot contain a comma, please enter again");
			destUserName = CommandLineReader.getInstance().readLine("est_username:");
		}
		String sendFilePath = CommandLineReader.getInstance().readLine("file:");
		File file = new File(sendFilePath);
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		try {
			if (file.length() > Message.MAX_DATA_LENGTH) {
				System.out.println("The file is too large (maximum 100MB)");
				return null;
			}
			String fileName = file.getName();
			int fileSize = (int) file.length(); 
			fileInputStream = new FileInputStream(file);
			bufferedInputStream = new BufferedInputStream(fileInputStream, fileSize);
			String data1 = destUserName + "," + fileName + ",";
			byte[] buffer = new byte[fileSize + data1.length()];
			System.arraycopy(data1.getBytes(),0, buffer, 0, data1.length());
			int totalByteRead = 0, byteRead = 0;
			while ((totalByteRead < fileSize) &&
					((byteRead = bufferedInputStream.read(buffer, totalByteRead + data1.length(), fileSize - totalByteRead)) != -1)) {
				totalByteRead += byteRead;
			}
			Message message = new Message(MessageType.SEND_FILE, 0,buffer);
			message.setHaveRespones(true);
			return message;
		} catch (Exception e) {
			System.out.println("File not found");
		}
		return null;
	}

	@Override
	public void handleResponse(Message message) {
		System.out.println(message.toString());
		switch (message.getSubMessageType()){
		case 0:
			System.out.println("File Sent"); break;
		case 1:
			System.out.println("Failed to write to the user's file store"); break;
		case 2:
			System.out.println("User doesn't exist"); break;
		case 3:
			System.out.println("Not Logged In"); break;
		case 4:
			System.out.println("Badly Formatted"); break;
		}
	}

}
