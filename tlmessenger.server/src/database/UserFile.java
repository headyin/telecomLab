package database;

import networking.protocol.IncomingPacketHandler;

public class UserFile {
	public String username;
	public String filename;
	public String time;
	public byte[] data;
	public int filesize;
	
	public UserFile() {
		username = "";
		filename = "";
		time = "";
		data = null;
		filesize = 0;
	}
	
	public UserFile(String username, String filename, byte[] data, int filesize, String time) {
		this.username = username;
		this.filename = filename;
		this.time = time;
		this.data = data;
		this.filesize = filesize;
	}
	
	public String format() {
		StringBuilder sb = new StringBuilder();
		sb.append(username);
		sb.append(IncomingPacketHandler.FIELD_TERMINATOR);
		sb.append(time);
		sb.append(IncomingPacketHandler.FIELD_TERMINATOR);
		sb.append(filename);
		sb.append(IncomingPacketHandler.FIELD_TERMINATOR);
		sb.append(new String(data));
		return sb.toString();
	}
	
	public byte[] binaryFormat() {
		StringBuilder sb = new StringBuilder();
		sb.append(username);
		sb.append(IncomingPacketHandler.FIELD_TERMINATOR);
		sb.append(time);
		sb.append(IncomingPacketHandler.FIELD_TERMINATOR);
		sb.append(filename);
		sb.append(IncomingPacketHandler.FIELD_TERMINATOR);
		String data1 = sb.toString();
		byte[] bdata = new byte[data1.length() + data.length];
		System.arraycopy(data1.getBytes(), 0, bdata, 0, data1.length());
		System.arraycopy(data, 0, bdata, data1.length(), data.length);
		return bdata;
	}


}
