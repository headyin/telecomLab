/**
 */
package tlMessenger.control;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tlMessenger.control.ControlPackage
 * @generated
 */
public interface ControlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlFactory eINSTANCE = tlMessenger.control.impl.ControlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Command Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Handler</em>'.
	 * @generated
	 */
	CommandHandler createCommandHandler();

	/**
	 * Returns a new object of class '<em>Cexit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cexit</em>'.
	 * @generated
	 */
	Cexit createCexit();

	/**
	 * Returns a new object of class '<em>Cecho</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cecho</em>'.
	 * @generated
	 */
	Cecho createCecho();

	/**
	 * Returns a new object of class '<em>Clogin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clogin</em>'.
	 * @generated
	 */
	Clogin createClogin();

	/**
	 * Returns a new object of class '<em>Clogoff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clogoff</em>'.
	 * @generated
	 */
	Clogoff createClogoff();

	/**
	 * Returns a new object of class '<em>Ccreate User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ccreate User</em>'.
	 * @generated
	 */
	CcreateUser createCcreateUser();

	/**
	 * Returns a new object of class '<em>Cdelete User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cdelete User</em>'.
	 * @generated
	 */
	CdeleteUser createCdeleteUser();

	/**
	 * Returns a new object of class '<em>Ccreate Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ccreate Store</em>'.
	 * @generated
	 */
	CcreateStore createCcreateStore();

	/**
	 * Returns a new object of class '<em>Csend Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csend Message</em>'.
	 * @generated
	 */
	CsendMessage createCsendMessage();

	/**
	 * Returns a new object of class '<em>Cquery Messages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cquery Messages</em>'.
	 * @generated
	 */
	CqueryMessages createCqueryMessages();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControlPackage getControlPackage();

} //ControlFactory
