/**
 */
package tlMessenger.control;

import tlMessenger.data.MessageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cecho</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tlMessenger.control.Cecho#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see tlMessenger.control.ControlPackage#getCecho()
 * @model
 * @generated
 */
public interface Cecho extends command {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Echo"</code>.
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
	 * @see tlMessenger.control.ControlPackage#getCecho_Type()
	 * @model default="Echo" unsettable="true" changeable="false"
	 * @generated
	 */
	MessageType getType();

	/**
	 * Returns whether the value of the '{@link tlMessenger.control.Cecho#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

} // Cecho
