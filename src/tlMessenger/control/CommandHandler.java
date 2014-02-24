/**
 */
package tlMessenger.control;

import org.eclipse.emf.ecore.EObject;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tlMessenger.control.CommandHandler#getType <em>Type</em>}</li>
 *   <li>{@link tlMessenger.control.CommandHandler#getMessageToSend <em>Message To Send</em>}</li>
 *   <li>{@link tlMessenger.control.CommandHandler#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tlMessenger.control.CommandHandler#getMessageReceived <em>Message Received</em>}</li>
 * </ul>
 * </p>
 *
 * @see tlMessenger.control.ControlPackage#getCommandHandler()
 * @model
 * @generated
 */
public interface CommandHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tlMessenger.data.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tlMessenger.data.MessageType
	 * @see #setType(MessageType)
	 * @see tlMessenger.control.ControlPackage#getCommandHandler_Type()
	 * @model
	 * @generated
	 */
	MessageType getType();

	/**
	 * Sets the value of the '{@link tlMessenger.control.CommandHandler#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tlMessenger.data.MessageType
	 * @see #getType()
	 * @generated
	 */
	void setType(MessageType value);

	/**
	 * Returns the value of the '<em><b>Message To Send</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message To Send</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message To Send</em>' reference.
	 * @see #setMessageToSend(Message)
	 * @see tlMessenger.control.ControlPackage#getCommandHandler_MessageToSend()
	 * @model required="true"
	 * @generated
	 */
	Message getMessageToSend();

	/**
	 * Sets the value of the '{@link tlMessenger.control.CommandHandler#getMessageToSend <em>Message To Send</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message To Send</em>' reference.
	 * @see #getMessageToSend()
	 * @generated
	 */
	void setMessageToSend(Message value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(String)
	 * @see tlMessenger.control.ControlPackage#getCommandHandler_Parameters()
	 * @model
	 * @generated
	 */
	String getParameters();

	/**
	 * Sets the value of the '{@link tlMessenger.control.CommandHandler#getParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(String value);

	/**
	 * Returns the value of the '<em><b>Message Received</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Received</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Received</em>' reference.
	 * @see #setMessageReceived(Message)
	 * @see tlMessenger.control.ControlPackage#getCommandHandler_MessageReceived()
	 * @model required="true"
	 * @generated
	 */
	Message getMessageReceived();

	/**
	 * Sets the value of the '{@link tlMessenger.control.CommandHandler#getMessageReceived <em>Message Received</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Received</em>' reference.
	 * @see #getMessageReceived()
	 * @generated
	 */
	void setMessageReceived(Message value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CommandHandler(MessageType type, String parameters);

} // CommandHandler
