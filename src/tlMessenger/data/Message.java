/**
 * 
 */
package tlMessenger.data;

import java.io.ByteArrayInputStream;

/**
 * @author Xinshang, Chandani
 *
 */
public class Message {
	/**
	 * Create a message object with specified binary message
	 * @param binaryMessage
	 */
	public Message(byte[] binaryMessage) {
		this.binaryFormatMessage = new byte[MAX_MESSAGE_SIZE];
		if (binaryMessage != null) {
			for (int i = 0; i < binaryMessage.length; i++) {
				this.binaryFormatMessage[i] = binaryMessage[i];
			}
		}
		this.disassembleMessage();
		this.fieldChanged = false;
	}
	
	/**
	 * create a message object with message type, sub type and data
	 * @param messageType
	 * @param subMessageType
	 * @param data
	 */
	public Message(MessageType messageType, int subMessageType, String data) {
		if (messageType == null) {
			messageType = MessageType.BADLY_FORMATTED_MESSAGE;
		}
		if (data == null) {
			data = "";
		}
		this.binaryFormatMessage = new byte[MAX_MESSAGE_SIZE];
		this.messageType = messageType;
		this.subMessageType = subMessageType;
		this.data = new String(data.substring(0, MAX_DATA_LENGTH));
		this.size = this.data.length();
		this.ressambleMessage();
		this.fieldChanged = false;
	}
	
	/**
	 * the maximum packet size is 262157 bytes
	 */
	private final int MAX_MESSAGE_SIZE  = 262156;
	
	/**
	 * the maximum data size
	 */
	private final int MAX_DATA_LENGTH = 256144;
	
	private boolean fieldChanged;
	
	/**
	 * The entire message in binary format
	 */
	byte[] binaryFormatMessage;
	
	/**
	 * Message Type field
	 */
	private MessageType messageType;
	
	/**
	 * Sub-message type field
	 */
	private int subMessageType;
	
	/**
	 * message size field
	 */
	private int size;
	
	/**
	 * message data field
	 */
	private String data;
	
	/**
	 * @return the messageType
	 */
	public MessageType getMessageType() {
		return messageType;
	}
	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
		this.fieldChanged = true;
	}
	/**
	 * @return the subMessageType
	 */
	public int getSubMessageType() {
		return subMessageType;
	}
	/**
	 * @param subMessageType the subMessageType to set
	 */
	public void setSubMessageType(int subMessageType) {
		this.subMessageType = subMessageType;
		this.fieldChanged = true;
	}
	/**
	 * @return the size
	 */
	public int getDataSize() {
		return size;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = new String(data);
		this.fieldChanged = true;
	}
	
	/**
	 * @return the binaryFormatMessage
	 */
	public byte[] getBinaryFormatMessage() {
		if (this.fieldChanged) {
			this.ressambleMessage();
		}
		return binaryFormatMessage;
	}
	/**
	 * @param binaryFormatMessage the binaryFormatMessage to set
	 */
	public void setBinaryFormatMessage(byte[] binaryFormatMessage) {
		this.binaryFormatMessage = binaryFormatMessage;
		this.disassembleMessage();
	}
	
	/**
	 * reassemble the message to binary format
	 */
	private void ressambleMessage() {
		this.size = data.length();
		//TODO:
		this.fieldChanged = false;
	}
	
	/**
	 * disassemble the binary format message to the 4 fields
	 */
	private void disassembleMessage() {
		//TODO:
		this.fieldChanged = false;
	}

}
