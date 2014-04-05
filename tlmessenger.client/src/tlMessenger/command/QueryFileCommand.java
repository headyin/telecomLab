package tlMessenger.command;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;

public class QueryFileCommand extends Command {
	
	QueryFileCommand() {
		this.name = MessageType.QUERY_FILE.getCommandName();
	}

	@Override
	public Message execute(String parameter) {
		Message message = new Message(MessageType.QUERY_FILE, 0, " ");
		message.setHaveRespones(true);
		return message;
	}

	@Override
	public void handleResponse(Message message) {
		if (!message.getMessageType().equals(MessageType.QUERY_FILE)) {
			return;
		}
		boolean newFile = false;
		switch (message.getSubMessageType()){
		case 0: break;
		case 1: newFile = true; break;
		}
		if (newFile) {
			String text = message.getData();
			if (text == null) {
				return;
			}
			String userFrom = null;
			String time = null;
			String fileName = null;
			byte[] fileData = null;
			StringTokenizer st = new StringTokenizer(text, ",");
			if (st.countTokens() >= 4) {
				userFrom = st.nextToken();
				time = st.nextToken();
				fileName = st.nextToken();
				String temps = userFrom + "," + time + "," + fileName + ",";
				fileData = new byte[message.getbData().length - temps.length()];
				System.arraycopy(message.getbData(), temps.length(), fileData, 0, fileData.length);
				System.out.println("file data lenght: "+ fileData.length);
				System.out.println("New file from " + userFrom + " at " + time + " : " + fileName + "\n");
				File file = new File(fileName);
				FileOutputStream fileOutputStream = null;
				try {
					fileOutputStream = new FileOutputStream(file);
					fileOutputStream.write(fileData);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (fileOutputStream != null) {
						try {
							fileOutputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

}
