/**
 * 
 */
package tlMessenger.data;

/**
 * @author Xinshang, Chandani
 *
 */
public class UserInfo {
	/**
	 * Singleton class instance;
	 */
	private static UserInfo instance = null;
	public static UserInfo getInstance() {
		if (instance == null) {
			instance = new UserInfo();
		}
		return instance;
	}
	
	/**
	 * private constructor
	 */
	private UserInfo() {
		this.loggedIn = false;
		this.storageCreated = false;
	}
	
	/**
	 * indicate if user is logged in or not
	 */
	boolean loggedIn;
	/**
	 * indicate if user storage is created or not
	 */
	boolean storageCreated;
	/**
	 * user name
	 */
	String userName;
	/**
	 * user password
	 */
	String password;
	
	/**
	 * @return the loggedIn
	 */
	public boolean isLoggedIn() {
		return loggedIn;
	}

	/**
	 * @param loggedIn the loggedIn to set
	 */
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	/**
	 * @return the storageCreated
	 */
	public boolean isStorageCreated() {
		return storageCreated;
	}

	/**
	 * @param storageCreated the storageCreated to set
	 */
	public void setStorageCreated(boolean storageCreated) {
		this.storageCreated = storageCreated;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
