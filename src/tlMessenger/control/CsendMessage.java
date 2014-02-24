/**
 */
package tlMessenger.control;

import tlMessenger.data.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csend Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tlMessenger.control.CsendMessage#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see tlMessenger.control.ControlPackage#getCsendMessage()
 * @model
 * @generated
 */
public interface CsendMessage extends command {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"SendMessage"</code>.
	 * The literals are from the enumeration {@link tlMessenger.data.MessageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tlMessenger.data.MessageType
	 * @see #isSetType()
	 * @see tlMessenger.control.ControlPackage#getCsendMessage_Type()
	 * @model default="SendMessage" unsettable="true" changeable="false"
	 * @generated
	 */
	MessageType getType();

	/**
	 * Returns whether the value of the '{@link tlMessenger.control.CsendMessage#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

} // CsendMessage
