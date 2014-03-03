/**
 * 
 */
package tlMessenger.data;

/**
 * @author Xinshang, Chandani
 *
 */
public enum MessageType {
	EXIT(0, "EXIT"),
	BADLY_FORMATTED_MESSAGE(1, "BADLY_FORMATTED_MESSAGE"),
	ECHO(2, "ECHO"),
	LOGIN(3, "LOGIN"),
	LOGOFF(4, "LOGOFF"),
	CREATE_USER(5, "CREATE_USER"),
	DELETE_USER(6, "DELETE_USER"),
	CREATE_STORE(7, "CREATE_STORE"),
	SEND_MESSAGE(8, "SEND_MESSAGE"),
	QUERY_MESSAGE(9, "QUERY_MESSAGE");

	public static final int EXIT_VALUE = 0;
	public static final int BADLY_FORMATTED_MESSAGE_VALUE = 1;
	public static final int ECHO_VALUE = 2;
	public static final int LOGIN_VALUE = 3;
	public static final int LOGOFF_VALUE = 4;
	public static final int CREATE_USER_VALUE = 5;
	public static final int DELETE_USER_VALUE = 6;
	public static final int CREATE_STORE_VALUE = 7;
	public static final int SEND_MESSAGE_VALUE = 8;
	public static final int QUERY_MESSAGE_VALUE = 9;
	/**
	 * the value of message type
	 */
	private final int value;
	
	/**
	 * the name of the message type
	 */
	private final String name;
	
	/**
	 * get the value of the message type
	 * @return
	 */
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * get the message type by value
	 * @param value
	 * @return message type
	 */
	public static MessageType getByValue(int value) {
		switch (value) {
		case EXIT_VALUE: return EXIT;
		case BADLY_FORMATTED_MESSAGE_VALUE: return BADLY_FORMATTED_MESSAGE;
		case ECHO_VALUE: return ECHO;
		case LOGIN_VALUE: return LOGIN;
		case LOGOFF_VALUE: return LOGOFF;
		case CREATE_USER_VALUE: return CREATE_USER;
		case DELETE_USER_VALUE: return DELETE_USER;
		case CREATE_STORE_VALUE: return CREATE_STORE;
		case SEND_MESSAGE_VALUE: return SEND_MESSAGE;
		case QUERY_MESSAGE_VALUE: return QUERY_MESSAGE;
		default: return null;
		}
	}
	
	/**
	 * private constructor
	 * @param value
	 */
	private MessageType(int value, String name) {
		this.value = value;
		this.name = name;
	}
}
