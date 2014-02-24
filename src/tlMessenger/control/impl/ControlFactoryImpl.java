/**
 */
package tlMessenger.control.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tlMessenger.control.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlFactoryImpl extends EFactoryImpl implements ControlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlFactory init() {
		try {
			ControlFactory theControlFactory = (ControlFactory)EPackage.Registry.INSTANCE.getEFactory(ControlPackage.eNS_URI);
			if (theControlFactory != null) {
				return theControlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ControlPackage.COMMAND_HANDLER: return createCommandHandler();
			case ControlPackage.CEXIT: return createCexit();
			case ControlPackage.CECHO: return createCecho();
			case ControlPackage.CLOGIN: return createClogin();
			case ControlPackage.CLOGOFF: return createClogoff();
			case ControlPackage.CCREATE_USER: return createCcreateUser();
			case ControlPackage.CDELETE_USER: return createCdeleteUser();
			case ControlPackage.CCREATE_STORE: return createCcreateStore();
			case ControlPackage.CSEND_MESSAGE: return createCsendMessage();
			case ControlPackage.CQUERY_MESSAGES: return createCqueryMessages();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandHandler createCommandHandler() {
		CommandHandlerImpl commandHandler = new CommandHandlerImpl();
		return commandHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cexit createCexit() {
		CexitImpl cexit = new CexitImpl();
		return cexit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cecho createCecho() {
		CechoImpl cecho = new CechoImpl();
		return cecho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clogin createClogin() {
		CloginImpl clogin = new CloginImpl();
		return clogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clogoff createClogoff() {
		ClogoffImpl clogoff = new ClogoffImpl();
		return clogoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcreateUser createCcreateUser() {
		CcreateUserImpl ccreateUser = new CcreateUserImpl();
		return ccreateUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdeleteUser createCdeleteUser() {
		CdeleteUserImpl cdeleteUser = new CdeleteUserImpl();
		return cdeleteUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CcreateStore createCcreateStore() {
		CcreateStoreImpl ccreateStore = new CcreateStoreImpl();
		return ccreateStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsendMessage createCsendMessage() {
		CsendMessageImpl csendMessage = new CsendMessageImpl();
		return csendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CqueryMessages createCqueryMessages() {
		CqueryMessagesImpl cqueryMessages = new CqueryMessagesImpl();
		return cqueryMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPackage getControlPackage() {
		return (ControlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControlPackage getPackage() {
		return ControlPackage.eINSTANCE;
	}

} //ControlFactoryImpl
