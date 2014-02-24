/**
 */
package tlMessenger.control.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tlMessenger.control.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tlMessenger.control.ControlPackage
 * @generated
 */
public class ControlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlSwitch() {
		if (modelPackage == null) {
			modelPackage = ControlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ControlPackage.COMMAND_HANDLER: {
				CommandHandler commandHandler = (CommandHandler)theEObject;
				T result = caseCommandHandler(commandHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.COMMAND: {
				command command = (command)theEObject;
				T result = casecommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CEXIT: {
				Cexit cexit = (Cexit)theEObject;
				T result = caseCexit(cexit);
				if (result == null) result = casecommand(cexit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CECHO: {
				Cecho cecho = (Cecho)theEObject;
				T result = caseCecho(cecho);
				if (result == null) result = casecommand(cecho);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CLOGIN: {
				Clogin clogin = (Clogin)theEObject;
				T result = caseClogin(clogin);
				if (result == null) result = casecommand(clogin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CLOGOFF: {
				Clogoff clogoff = (Clogoff)theEObject;
				T result = caseClogoff(clogoff);
				if (result == null) result = casecommand(clogoff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CCREATE_USER: {
				CcreateUser ccreateUser = (CcreateUser)theEObject;
				T result = caseCcreateUser(ccreateUser);
				if (result == null) result = casecommand(ccreateUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CDELETE_USER: {
				CdeleteUser cdeleteUser = (CdeleteUser)theEObject;
				T result = caseCdeleteUser(cdeleteUser);
				if (result == null) result = casecommand(cdeleteUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CCREATE_STORE: {
				CcreateStore ccreateStore = (CcreateStore)theEObject;
				T result = caseCcreateStore(ccreateStore);
				if (result == null) result = casecommand(ccreateStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CSEND_MESSAGE: {
				CsendMessage csendMessage = (CsendMessage)theEObject;
				T result = caseCsendMessage(csendMessage);
				if (result == null) result = casecommand(csendMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControlPackage.CQUERY_MESSAGES: {
				CqueryMessages cqueryMessages = (CqueryMessages)theEObject;
				T result = caseCqueryMessages(cqueryMessages);
				if (result == null) result = casecommand(cqueryMessages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandHandler(CommandHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecommand(command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cexit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cexit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCexit(Cexit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cecho</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cecho</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCecho(Cecho object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clogin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clogin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClogin(Clogin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clogoff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clogoff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClogoff(Clogoff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ccreate User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ccreate User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCcreateUser(CcreateUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cdelete User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cdelete User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdeleteUser(CdeleteUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ccreate Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ccreate Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCcreateStore(CcreateStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csend Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csend Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsendMessage(CsendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cquery Messages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cquery Messages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCqueryMessages(CqueryMessages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ControlSwitch
