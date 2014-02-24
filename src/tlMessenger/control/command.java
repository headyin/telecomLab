/**
 */
package tlMessenger.control;

import org.eclipse.emf.ecore.EObject;

import tlMessenger.data.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>command</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see tlMessenger.control.ControlPackage#getcommand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface command extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Message getMessageToSend(String parameters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void handlerReceivedMessage(Message receivedMessage);

} // command
