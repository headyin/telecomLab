/**
 */
package tlMessenger.data;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tlMessenger.data.MessageData#getUserFrom <em>User From</em>}</li>
 *   <li>{@link tlMessenger.data.MessageData#getUserTo <em>User To</em>}</li>
 *   <li>{@link tlMessenger.data.MessageData#getTime <em>Time</em>}</li>
 *   <li>{@link tlMessenger.data.MessageData#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see tlMessenger.data.DataPackage#getMessageData()
 * @model
 * @generated
 */
public interface MessageData extends EObject {
	/**
	 * Returns the value of the '<em><b>User From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User From</em>' attribute.
	 * @see #setUserFrom(String)
	 * @see tlMessenger.data.DataPackage#getMessageData_UserFrom()
	 * @model
	 * @generated
	 */
	String getUserFrom();

	/**
	 * Sets the value of the '{@link tlMessenger.data.MessageData#getUserFrom <em>User From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User From</em>' attribute.
	 * @see #getUserFrom()
	 * @generated
	 */
	void setUserFrom(String value);

	/**
	 * Returns the value of the '<em><b>User To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User To</em>' attribute.
	 * @see #setUserTo(String)
	 * @see tlMessenger.data.DataPackage#getMessageData_UserTo()
	 * @model
	 * @generated
	 */
	String getUserTo();

	/**
	 * Sets the value of the '{@link tlMessenger.data.MessageData#getUserTo <em>User To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User To</em>' attribute.
	 * @see #getUserTo()
	 * @generated
	 */
	void setUserTo(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see tlMessenger.data.DataPackage#getMessageData_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link tlMessenger.data.MessageData#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see tlMessenger.data.DataPackage#getMessageData_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link tlMessenger.data.MessageData#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getReceivedMessageString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getMessageStringToSend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MessageData(String receivedText);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void MessageData(String destUser, String text);

} // MessageData
