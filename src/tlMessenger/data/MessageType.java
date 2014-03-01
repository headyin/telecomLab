/**
 * 
 */
package tlMessenger.data;

/**
 * @author Xinshang, Chandani
 *
 */
public enum MessageType {
	EXIT(0),
	BADLY_FORMATTED_MESSAGE(1),
	ECHO(2),
	LOGIN(3),
	LOGOFF(4),
	CREATE_USER(5),
	DELETE_USER(6),
	CREATE_STORE(7),
	SEND_MESSAGE(8),
	QUERY_MESSAGE(9);

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
	 * get the value of the message type
	 * @return
	 */
	public int getValue() {
		return this.value;
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
	private MessageType(int value) {
		this.value = value;
	}
}
