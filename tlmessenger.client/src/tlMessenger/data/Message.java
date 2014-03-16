/**
 * 
 */
package tlMessenger.data;

import java.nio.ByteBuffer;

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
		this.binaryFormatMessage = new byte[binaryMessage.length];
		System.arraycopy(binaryMessage, 0, binaryFormatMessage, 0, binaryMessage.length);
		this.disassembleMessage();
		this.fieldChanged = false;
	}
	
	/**
	 * Create a message with specified binary message
	 * @param first12Bytes, the first 12 bytes
	 * @param dataBytes, the data bytes
	 */
	public Message(byte[] first12Bytes, byte[] dataBytes) {
		this.binaryFormatMessage = new byte[12 + dataBytes.length];
		System.arraycopy(first12Bytes, 0, this.binaryFormatMessage, 0, 12);
		System.arraycopy(dataBytes, 0, this.binaryFormatMessage, 12, dataBytes.length);
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
		int dataLength = data.length();
		if (dataLength > MAX_DATA_LENGTH) {
			dataLength = MAX_DATA_LENGTH;
		}
		this.data = new String(data.substring(0, dataLength));
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
	 * indicate if this message sent to server will have a response message or not
	 */
	private boolean haveRespones;
	
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
		this.binaryFormatMessage = new byte[binaryFormatMessage.length];
		System.arraycopy(binaryFormatMessage, 0, binaryFormatMessage, 0, binaryFormatMessage.length);
		this.disassembleMessage();
	}
	
	/**
	 * reassemble the message to binary format
	 */
	private void ressambleMessage() {
		this.size = data.length();
		if (this.size > MAX_DATA_LENGTH) {
			this.size = MAX_DATA_LENGTH;
		}
		byte[] messageTypeInByte = ByteBuffer.allocate(4).putInt(this.messageType.getValue()).array();
		byte[] subMessageTypeInByte = ByteBuffer.allocate(4).putInt(this.subMessageType).array();
		byte[] sizeInByte = ByteBuffer.allocate(4).putInt(this.size).array();
		byte[] dataInByte = this.data.getBytes();
		this.binaryFormatMessage = new byte[4*3 + dataInByte.length];
		//System.out.println(this.data.length() + "\n" + dataInByte.length);
		System.arraycopy(messageTypeInByte, 0, this.binaryFormatMessage, 0, 4);
		System.arraycopy(subMessageTypeInByte, 0, this.binaryFormatMessage, 4, 4);
		System.arraycopy(sizeInByte, 0, this.binaryFormatMessage, 8, 4);
		System.arraycopy(dataInByte, 0, this.binaryFormatMessage, 12, this.size);
		this.fieldChanged = false;
	}
	
	/**
	 * disassemble the binary format message to the 4 fields
	 */
	private void disassembleMessage() {
		byte[] messageTypeInByte = new byte[4];
		byte[] subMessageTypeInByte = new byte[4];
		byte[] sizeInByte = new byte[4];
		System.arraycopy(this.binaryFormatMessage, 0, messageTypeInByte, 0, 4);
		System.arraycopy(this.binaryFormatMessage, 4, subMessageTypeInByte, 0, 4);
		System.arraycopy(this.binaryFormatMessage, 8, sizeInByte, 0, 4);
		this.messageType = MessageType.getByValue(ByteBuffer.wrap(messageTypeInByte).getInt());
		this.subMessageType = ByteBuffer.wrap(subMessageTypeInByte).getInt();
		this.size = ByteBuffer.wrap(sizeInByte).getInt();
		byte[] dataInByte = new byte[this.size];
		System.arraycopy(this.binaryFormatMessage, 12, dataInByte, 0, this.size);
		this.data = new String(dataInByte);
		this.fieldChanged = false;
	}
	
	/**
	 * 
	 * @param binaryMessage
	 * @return
	 */
	public static int expectedDataSize(byte[] binaryMessage) {
		byte[] sizeInByte = new byte[4];
		System.arraycopy(binaryMessage, 8, sizeInByte, 0, 4);
		return ByteBuffer.wrap(sizeInByte).getInt();		
	}
	
	public String toString() {
		return this.messageType.getName() + " : " + Integer.toString(this.subMessageType)
				+ " : " + Integer.toString(this.size) + " : " + this.data;
	}

	/**
	 * @return the haveRespones
	 */
	public boolean isHaveRespones() {
		return haveRespones;
	}

	/**
	 * @param haveRespones the haveRespones to set
	 */
	public void setHaveRespones(boolean haveRespones) {
		this.haveRespones = haveRespones;
	}

}
