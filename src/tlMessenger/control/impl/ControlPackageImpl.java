/**
 */
package tlMessenger.control.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tlMessenger.control.CcreateStore;
import tlMessenger.control.CcreateUser;
import tlMessenger.control.CdeleteUser;
import tlMessenger.control.Cecho;
import tlMessenger.control.Cexit;
import tlMessenger.control.Clogin;
import tlMessenger.control.Clogoff;
import tlMessenger.control.CommandHandler;
import tlMessenger.control.ControlFactory;
import tlMessenger.control.ControlPackage;
import tlMessenger.control.CqueryMessages;
import tlMessenger.control.CsendMessage;
import tlMessenger.control.command;

import tlMessenger.data.DataPackage;

import tlMessenger.data.impl.DataPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlPackageImpl extends EPackageImpl implements ControlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cexitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cechoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clogoffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccreateUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdeleteUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ccreateStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cqueryMessagesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tlMessenger.control.ControlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlPackageImpl() {
		super(eNS_URI, ControlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ControlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlPackage init() {
		if (isInited) return (ControlPackage)EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI);

		// Obtain or create and register package
		ControlPackageImpl theControlPackage = (ControlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ControlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ControlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theControlPackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theControlPackage.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlPackage.eNS_URI, theControlPackage);
		return theControlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandHandler() {
		return commandHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandHandler_Type() {
		return (EAttribute)commandHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandHandler_MessageToSend() {
		return (EReference)commandHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandHandler_Parameters() {
		return (EAttribute)commandHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandHandler_MessageReceived() {
		return (EReference)commandHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandHandler__Execute() {
		return commandHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandHandler__CommandHandler__MessageType_String() {
		return commandHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcommand__GetMessageToSend__String() {
		return commandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcommand__HandlerReceivedMessage__Message() {
		return commandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCexit() {
		return cexitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCexit_Type() {
		return (EAttribute)cexitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCecho() {
		return cechoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCecho_Type() {
		return (EAttribute)cechoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClogin() {
		return cloginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClogin_Type() {
		return (EAttribute)cloginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClogoff() {
		return clogoffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClogoff_Type() {
		return (EAttribute)clogoffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCcreateUser() {
		return ccreateUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCcreateUser_Type() {
		return (EAttribute)ccreateUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdeleteUser() {
		return cdeleteUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdeleteUser_Type() {
		return (EAttribute)cdeleteUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCcreateStore() {
		return ccreateStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCcreateStore_Type() {
		return (EAttribute)ccreateStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCsendMessage() {
		return csendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCsendMessage_Type() {
		return (EAttribute)csendMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCqueryMessages() {
		return cqueryMessagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCqueryMessages_Type() {
		return (EAttribute)cqueryMessagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFactory getControlFactory() {
		return (ControlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		commandHandlerEClass = createEClass(COMMAND_HANDLER);
		createEAttribute(commandHandlerEClass, COMMAND_HANDLER__TYPE);
		createEReference(commandHandlerEClass, COMMAND_HANDLER__MESSAGE_TO_SEND);
		createEAttribute(commandHandlerEClass, COMMAND_HANDLER__PARAMETERS);
		createEReference(commandHandlerEClass, COMMAND_HANDLER__MESSAGE_RECEIVED);
		createEOperation(commandHandlerEClass, COMMAND_HANDLER___EXECUTE);
		createEOperation(commandHandlerEClass, COMMAND_HANDLER___COMMAND_HANDLER__MESSAGETYPE_STRING);

		commandEClass = createEClass(COMMAND);
		createEOperation(commandEClass, COMMAND___GET_MESSAGE_TO_SEND__STRING);
		createEOperation(commandEClass, COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE);

		cexitEClass = createEClass(CEXIT);
		createEAttribute(cexitEClass, CEXIT__TYPE);

		cechoEClass = createEClass(CECHO);
		createEAttribute(cechoEClass, CECHO__TYPE);

		cloginEClass = createEClass(CLOGIN);
		createEAttribute(cloginEClass, CLOGIN__TYPE);

		clogoffEClass = createEClass(CLOGOFF);
		createEAttribute(clogoffEClass, CLOGOFF__TYPE);

		ccreateUserEClass = createEClass(CCREATE_USER);
		createEAttribute(ccreateUserEClass, CCREATE_USER__TYPE);

		cdeleteUserEClass = createEClass(CDELETE_USER);
		createEAttribute(cdeleteUserEClass, CDELETE_USER__TYPE);

		ccreateStoreEClass = createEClass(CCREATE_STORE);
		createEAttribute(ccreateStoreEClass, CCREATE_STORE__TYPE);

		csendMessageEClass = createEClass(CSEND_MESSAGE);
		createEAttribute(csendMessageEClass, CSEND_MESSAGE__TYPE);

		cqueryMessagesEClass = createEClass(CQUERY_MESSAGES);
		createEAttribute(cqueryMessagesEClass, CQUERY_MESSAGES__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cexitEClass.getESuperTypes().add(this.getcommand());
		cechoEClass.getESuperTypes().add(this.getcommand());
		cloginEClass.getESuperTypes().add(this.getcommand());
		clogoffEClass.getESuperTypes().add(this.getcommand());
		ccreateUserEClass.getESuperTypes().add(this.getcommand());
		cdeleteUserEClass.getESuperTypes().add(this.getcommand());
		ccreateStoreEClass.getESuperTypes().add(this.getcommand());
		csendMessageEClass.getESuperTypes().add(this.getcommand());
		cqueryMessagesEClass.getESuperTypes().add(this.getcommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandHandlerEClass, CommandHandler.class, "CommandHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandHandler_Type(), theDataPackage.getMessageType(), "type", null, 0, 1, CommandHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandHandler_MessageToSend(), theDataPackage.getMessage(), null, "messageToSend", null, 1, 1, CommandHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandHandler_Parameters(), ecorePackage.getEString(), "parameters", null, 0, 1, CommandHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandHandler_MessageReceived(), theDataPackage.getMessage(), null, "messageReceived", null, 1, 1, CommandHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommandHandler__Execute(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getCommandHandler__CommandHandler__MessageType_String(), null, "CommandHandler", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getMessageType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "parameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandEClass, command.class, "command", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getcommand__GetMessageToSend__String(), theDataPackage.getMessage(), "getMessageToSend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "parameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getcommand__HandlerReceivedMessage__Message(), null, "handlerReceivedMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getMessage(), "receivedMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cexitEClass, Cexit.class, "Cexit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCexit_Type(), theDataPackage.getMessageType(), "type", "Exit", 0, 1, Cexit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cechoEClass, Cecho.class, "Cecho", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCecho_Type(), theDataPackage.getMessageType(), "type", "Echo", 0, 1, Cecho.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloginEClass, Clogin.class, "Clogin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClogin_Type(), theDataPackage.getMessageType(), "type", "Login", 0, 1, Clogin.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clogoffEClass, Clogoff.class, "Clogoff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClogoff_Type(), theDataPackage.getMessageType(), "type", "Logoff", 0, 1, Clogoff.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ccreateUserEClass, CcreateUser.class, "CcreateUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCcreateUser_Type(), theDataPackage.getMessageType(), "type", "CreateUser", 0, 1, CcreateUser.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdeleteUserEClass, CdeleteUser.class, "CdeleteUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdeleteUser_Type(), theDataPackage.getMessageType(), "type", "DeleteUser", 0, 1, CdeleteUser.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ccreateStoreEClass, CcreateStore.class, "CcreateStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCcreateStore_Type(), theDataPackage.getMessageType(), "type", "CreateStore", 0, 1, CcreateStore.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csendMessageEClass, CsendMessage.class, "CsendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCsendMessage_Type(), theDataPackage.getMessageType(), "type", "SendMessage", 0, 1, CsendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cqueryMessagesEClass, CqueryMessages.class, "CqueryMessages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCqueryMessages_Type(), theDataPackage.getMessageType(), "type", "QueryMessages", 0, 1, CqueryMessages.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ControlPackageImpl
