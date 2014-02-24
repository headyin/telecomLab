/**
 */
package tlMessenger.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tlMessenger.data.DataPackage#getMessageType()
 * @model
 * @generated
 */
public enum MessageType implements Enumerator {
	/**
	 * The '<em><b>Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXIT(0, "Exit", "Exit"),

	/**
	 * The '<em><b>Badly Formatted Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BADLY_FORMATTED_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	BADLY_FORMATTED_MESSAGE(1, "BadlyFormattedMessage", "BadlyFormattedMessage"),

	/**
	 * The '<em><b>Echo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECHO_VALUE
	 * @generated
	 * @ordered
	 */
	ECHO(2, "Echo", "Echo"),

	/**
	 * The '<em><b>Login</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN(3, "Login", "Login"),

	/**
	 * The '<em><b>Logoff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGOFF_VALUE
	 * @generated
	 * @ordered
	 */
	LOGOFF(4, "Logoff", "Logoff"),

	/**
	 * The '<em><b>Create User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_USER_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_USER(5, "CreateUser", "CreateUser"),

	/**
	 * The '<em><b>Delete User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_USER_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE_USER(6, "DeleteUser", "DeleteUser"),

	/**
	 * The '<em><b>Create Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_STORE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_STORE(7, "CreateStore", "CreateStore"),

	/**
	 * The '<em><b>Send Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEND_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SEND_MESSAGE(8, "SendMessage", "SendMessage"),

	/**
	 * The '<em><b>Query Messages</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_MESSAGES_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY_MESSAGES(9, "QueryMessages", "QueryMessages");

	/**
	 * The '<em><b>Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIT
	 * @model name="Exit"
	 * @generated
	 * @ordered
	 */
	public static final int EXIT_VALUE = 0;

	/**
	 * The '<em><b>Badly Formatted Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Badly Formatted Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BADLY_FORMATTED_MESSAGE
	 * @model name="BadlyFormattedMessage"
	 * @generated
	 * @ordered
	 */
	public static final int BADLY_FORMATTED_MESSAGE_VALUE = 1;

	/**
	 * The '<em><b>Echo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Echo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECHO
	 * @model name="Echo"
	 * @generated
	 * @ordered
	 */
	public static final int ECHO_VALUE = 2;

	/**
	 * The '<em><b>Login</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Login</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGIN
	 * @model name="Login"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_VALUE = 3;

	/**
	 * The '<em><b>Logoff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logoff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGOFF
	 * @model name="Logoff"
	 * @generated
	 * @ordered
	 */
	public static final int LOGOFF_VALUE = 4;

	/**
	 * The '<em><b>Create User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_USER
	 * @model name="CreateUser"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_USER_VALUE = 5;

	/**
	 * The '<em><b>Delete User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete User</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_USER
	 * @model name="DeleteUser"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_USER_VALUE = 6;

	/**
	 * The '<em><b>Create Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create Store</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_STORE
	 * @model name="CreateStore"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_STORE_VALUE = 7;

	/**
	 * The '<em><b>Send Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Send Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEND_MESSAGE
	 * @model name="SendMessage"
	 * @generated
	 * @ordered
	 */
	public static final int SEND_MESSAGE_VALUE = 8;

	/**
	 * The '<em><b>Query Messages</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Query Messages</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY_MESSAGES
	 * @model name="QueryMessages"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_MESSAGES_VALUE = 9;

	/**
	 * An array of all the '<em><b>Message Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageType[] VALUES_ARRAY =
		new MessageType[] {
			EXIT,
			BADLY_FORMATTED_MESSAGE,
			ECHO,
			LOGIN,
			LOGOFF,
			CREATE_USER,
			DELETE_USER,
			CREATE_STORE,
			SEND_MESSAGE,
			QUERY_MESSAGES,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageType get(int value) {
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
			case QUERY_MESSAGES_VALUE: return QUERY_MESSAGES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MessageType
