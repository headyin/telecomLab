/**
 */
package tlMessenger.data.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tlMessenger.control.ControlPackage;

import tlMessenger.control.impl.ControlPackageImpl;

import tlMessenger.data.DataFactory;
import tlMessenger.data.DataPackage;
import tlMessenger.data.Message;
import tlMessenger.data.MessageData;
import tlMessenger.data.MessageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageTypeEEnum = null;

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
	 * @see tlMessenger.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ControlPackageImpl theControlPackage = (ControlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI) instanceof ControlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ControlPackage.eNS_URI) : ControlPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theControlPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theControlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageData() {
		return messageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageData_UserFrom() {
		return (EAttribute)messageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageData_UserTo() {
		return (EAttribute)messageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageData_Time() {
		return (EAttribute)messageDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageData_Text() {
		return (EAttribute)messageDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageData__GetReceivedMessageString() {
		return messageDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageData__GetMessageStringToSend() {
		return messageDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageData__MessageData__String() {
		return messageDataEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageData__MessageData__String_String() {
		return messageDataEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Type() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_SubType() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Size() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Data() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Message__MessageType_String() {
		return messageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__GetBytesToSend() {
		return messageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__SetReceivedMessage__byte() {
		return messageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageType() {
		return messageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
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
		messageDataEClass = createEClass(MESSAGE_DATA);
		createEAttribute(messageDataEClass, MESSAGE_DATA__USER_FROM);
		createEAttribute(messageDataEClass, MESSAGE_DATA__USER_TO);
		createEAttribute(messageDataEClass, MESSAGE_DATA__TIME);
		createEAttribute(messageDataEClass, MESSAGE_DATA__TEXT);
		createEOperation(messageDataEClass, MESSAGE_DATA___GET_RECEIVED_MESSAGE_STRING);
		createEOperation(messageDataEClass, MESSAGE_DATA___GET_MESSAGE_STRING_TO_SEND);
		createEOperation(messageDataEClass, MESSAGE_DATA___MESSAGE_DATA__STRING);
		createEOperation(messageDataEClass, MESSAGE_DATA___MESSAGE_DATA__STRING_STRING);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__TYPE);
		createEAttribute(messageEClass, MESSAGE__SUB_TYPE);
		createEAttribute(messageEClass, MESSAGE__SIZE);
		createEAttribute(messageEClass, MESSAGE__DATA);
		createEOperation(messageEClass, MESSAGE___MESSAGE__MESSAGETYPE_STRING);
		createEOperation(messageEClass, MESSAGE___GET_BYTES_TO_SEND);
		createEOperation(messageEClass, MESSAGE___SET_RECEIVED_MESSAGE__BYTE);

		// Create enums
		messageTypeEEnum = createEEnum(MESSAGE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(messageDataEClass, MessageData.class, "MessageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageData_UserFrom(), ecorePackage.getEString(), "userFrom", null, 0, 1, MessageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageData_UserTo(), ecorePackage.getEString(), "userTo", null, 0, 1, MessageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageData_Time(), ecorePackage.getEDate(), "time", null, 0, 1, MessageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageData_Text(), ecorePackage.getEString(), "text", null, 0, 1, MessageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMessageData__GetReceivedMessageString(), ecorePackage.getEString(), "getReceivedMessageString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessageData__GetMessageStringToSend(), ecorePackage.getEString(), "getMessageStringToSend", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getMessageData__MessageData__String(), null, "MessageData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "receivedText", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessageData__MessageData__String_String(), null, "MessageData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "destUser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Type(), this.getMessageType(), "type", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_SubType(), ecorePackage.getEInt(), "subType", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Data(), ecorePackage.getEString(), "data", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMessage__Message__MessageType_String(), null, "Message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "data", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessage__GetBytesToSend(), ecorePackage.getEByteArray(), "getBytesToSend", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__SetReceivedMessage__byte(), null, "setReceivedMessage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(messageTypeEEnum, MessageType.class, "MessageType");
		addEEnumLiteral(messageTypeEEnum, MessageType.EXIT);
		addEEnumLiteral(messageTypeEEnum, MessageType.BADLY_FORMATTED_MESSAGE);
		addEEnumLiteral(messageTypeEEnum, MessageType.ECHO);
		addEEnumLiteral(messageTypeEEnum, MessageType.LOGIN);
		addEEnumLiteral(messageTypeEEnum, MessageType.LOGOFF);
		addEEnumLiteral(messageTypeEEnum, MessageType.CREATE_USER);
		addEEnumLiteral(messageTypeEEnum, MessageType.DELETE_USER);
		addEEnumLiteral(messageTypeEEnum, MessageType.CREATE_STORE);
		addEEnumLiteral(messageTypeEEnum, MessageType.SEND_MESSAGE);
		addEEnumLiteral(messageTypeEEnum, MessageType.QUERY_MESSAGES);

		// Create resource
		createResource(eNS_URI);
	}

} //DataPackageImpl
