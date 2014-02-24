/**
 */
package tlMessenger.control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tlMessenger.control.ControlFactory
 * @model kind="package"
 * @generated
 */
public interface ControlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "control";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tlMessenger.ecore/control";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "control";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlPackage eINSTANCE = tlMessenger.control.impl.ControlPackageImpl.init();

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CommandHandlerImpl <em>Command Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CommandHandlerImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCommandHandler()
	 * @generated
	 */
	int COMMAND_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Message To Send</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER__MESSAGE_TO_SEND = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Message Received</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER__MESSAGE_RECEIVED = 3;

	/**
	 * The number of structural features of the '<em>Command Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER___EXECUTE = 0;

	/**
	 * The operation id for the '<em>Command Handler</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER___COMMAND_HANDLER__MESSAGETYPE_STRING = 1;

	/**
	 * The number of operations of the '<em>Command Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_HANDLER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tlMessenger.control.command <em>command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.command
	 * @see tlMessenger.control.impl.ControlPackageImpl#getcommand()
	 * @generated
	 */
	int COMMAND = 1;

	/**
	 * The number of structural features of the '<em>command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___GET_MESSAGE_TO_SEND__STRING = 0;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE = 1;

	/**
	 * The number of operations of the '<em>command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CexitImpl <em>Cexit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CexitImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCexit()
	 * @generated
	 */
	int CEXIT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXIT__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cexit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXIT_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXIT___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXIT___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Cexit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEXIT_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CechoImpl <em>Cecho</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CechoImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCecho()
	 * @generated
	 */
	int CECHO = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CECHO__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cecho</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CECHO_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CECHO___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CECHO___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Cecho</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CECHO_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CloginImpl <em>Clogin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CloginImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getClogin()
	 * @generated
	 */
	int CLOGIN = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIN__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clogin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIN_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIN___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIN___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Clogin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGIN_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.ClogoffImpl <em>Clogoff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.ClogoffImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getClogoff()
	 * @generated
	 */
	int CLOGOFF = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGOFF__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clogoff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGOFF_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGOFF___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGOFF___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Clogoff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOGOFF_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CcreateUserImpl <em>Ccreate User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CcreateUserImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCcreateUser()
	 * @generated
	 */
	int CCREATE_USER = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_USER__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ccreate User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_USER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_USER___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_USER___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Ccreate User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_USER_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CdeleteUserImpl <em>Cdelete User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CdeleteUserImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCdeleteUser()
	 * @generated
	 */
	int CDELETE_USER = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDELETE_USER__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cdelete User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDELETE_USER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDELETE_USER___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDELETE_USER___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Cdelete User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDELETE_USER_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CcreateStoreImpl <em>Ccreate Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CcreateStoreImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCcreateStore()
	 * @generated
	 */
	int CCREATE_STORE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_STORE__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ccreate Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_STORE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_STORE___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_STORE___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Ccreate Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCREATE_STORE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CsendMessageImpl <em>Csend Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CsendMessageImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCsendMessage()
	 * @generated
	 */
	int CSEND_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSEND_MESSAGE__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Csend Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSEND_MESSAGE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSEND_MESSAGE___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSEND_MESSAGE___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Csend Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSEND_MESSAGE_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tlMessenger.control.impl.CqueryMessagesImpl <em>Cquery Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.control.impl.CqueryMessagesImpl
	 * @see tlMessenger.control.impl.ControlPackageImpl#getCqueryMessages()
	 * @generated
	 */
	int CQUERY_MESSAGES = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQUERY_MESSAGES__TYPE = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cquery Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQUERY_MESSAGES_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Message To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQUERY_MESSAGES___GET_MESSAGE_TO_SEND__STRING = COMMAND___GET_MESSAGE_TO_SEND__STRING;

	/**
	 * The operation id for the '<em>Handler Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQUERY_MESSAGES___HANDLER_RECEIVED_MESSAGE__MESSAGE = COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE;

	/**
	 * The number of operations of the '<em>Cquery Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CQUERY_MESSAGES_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tlMessenger.control.CommandHandler <em>Command Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Handler</em>'.
	 * @see tlMessenger.control.CommandHandler
	 * @generated
	 */
	EClass getCommandHandler();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CommandHandler#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.CommandHandler#getType()
	 * @see #getCommandHandler()
	 * @generated
	 */
	EAttribute getCommandHandler_Type();

	/**
	 * Returns the meta object for the reference '{@link tlMessenger.control.CommandHandler#getMessageToSend <em>Message To Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message To Send</em>'.
	 * @see tlMessenger.control.CommandHandler#getMessageToSend()
	 * @see #getCommandHandler()
	 * @generated
	 */
	EReference getCommandHandler_MessageToSend();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CommandHandler#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see tlMessenger.control.CommandHandler#getParameters()
	 * @see #getCommandHandler()
	 * @generated
	 */
	EAttribute getCommandHandler_Parameters();

	/**
	 * Returns the meta object for the reference '{@link tlMessenger.control.CommandHandler#getMessageReceived <em>Message Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Received</em>'.
	 * @see tlMessenger.control.CommandHandler#getMessageReceived()
	 * @see #getCommandHandler()
	 * @generated
	 */
	EReference getCommandHandler_MessageReceived();

	/**
	 * Returns the meta object for the '{@link tlMessenger.control.CommandHandler#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see tlMessenger.control.CommandHandler#execute()
	 * @generated
	 */
	EOperation getCommandHandler__Execute();

	/**
	 * Returns the meta object for the '{@link tlMessenger.control.CommandHandler#CommandHandler(tlMessenger.data.MessageType, java.lang.String) <em>Command Handler</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Command Handler</em>' operation.
	 * @see tlMessenger.control.CommandHandler#CommandHandler(tlMessenger.data.MessageType, java.lang.String)
	 * @generated
	 */
	EOperation getCommandHandler__CommandHandler__MessageType_String();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.command <em>command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>command</em>'.
	 * @see tlMessenger.control.command
	 * @generated
	 */
	EClass getcommand();

	/**
	 * Returns the meta object for the '{@link tlMessenger.control.command#getMessageToSend(java.lang.String) <em>Get Message To Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message To Send</em>' operation.
	 * @see tlMessenger.control.command#getMessageToSend(java.lang.String)
	 * @generated
	 */
	EOperation getcommand__GetMessageToSend__String();

	/**
	 * Returns the meta object for the '{@link tlMessenger.control.command#handlerReceivedMessage(tlMessenger.data.Message) <em>Handler Received Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handler Received Message</em>' operation.
	 * @see tlMessenger.control.command#handlerReceivedMessage(tlMessenger.data.Message)
	 * @generated
	 */
	EOperation getcommand__HandlerReceivedMessage__Message();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.Cexit <em>Cexit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cexit</em>'.
	 * @see tlMessenger.control.Cexit
	 * @generated
	 */
	EClass getCexit();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.Cexit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.Cexit#getType()
	 * @see #getCexit()
	 * @generated
	 */
	EAttribute getCexit_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.Cecho <em>Cecho</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cecho</em>'.
	 * @see tlMessenger.control.Cecho
	 * @generated
	 */
	EClass getCecho();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.Cecho#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.Cecho#getType()
	 * @see #getCecho()
	 * @generated
	 */
	EAttribute getCecho_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.Clogin <em>Clogin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clogin</em>'.
	 * @see tlMessenger.control.Clogin
	 * @generated
	 */
	EClass getClogin();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.Clogin#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.Clogin#getType()
	 * @see #getClogin()
	 * @generated
	 */
	EAttribute getClogin_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.Clogoff <em>Clogoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clogoff</em>'.
	 * @see tlMessenger.control.Clogoff
	 * @generated
	 */
	EClass getClogoff();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.Clogoff#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.Clogoff#getType()
	 * @see #getClogoff()
	 * @generated
	 */
	EAttribute getClogoff_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.CcreateUser <em>Ccreate User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ccreate User</em>'.
	 * @see tlMessenger.control.CcreateUser
	 * @generated
	 */
	EClass getCcreateUser();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CcreateUser#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.CcreateUser#getType()
	 * @see #getCcreateUser()
	 * @generated
	 */
	EAttribute getCcreateUser_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.CdeleteUser <em>Cdelete User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cdelete User</em>'.
	 * @see tlMessenger.control.CdeleteUser
	 * @generated
	 */
	EClass getCdeleteUser();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CdeleteUser#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.CdeleteUser#getType()
	 * @see #getCdeleteUser()
	 * @generated
	 */
	EAttribute getCdeleteUser_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.CcreateStore <em>Ccreate Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ccreate Store</em>'.
	 * @see tlMessenger.control.CcreateStore
	 * @generated
	 */
	EClass getCcreateStore();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CcreateStore#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.CcreateStore#getType()
	 * @see #getCcreateStore()
	 * @generated
	 */
	EAttribute getCcreateStore_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.CsendMessage <em>Csend Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Csend Message</em>'.
	 * @see tlMessenger.control.CsendMessage
	 * @generated
	 */
	EClass getCsendMessage();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CsendMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.CsendMessage#getType()
	 * @see #getCsendMessage()
	 * @generated
	 */
	EAttribute getCsendMessage_Type();

	/**
	 * Returns the meta object for class '{@link tlMessenger.control.CqueryMessages <em>Cquery Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cquery Messages</em>'.
	 * @see tlMessenger.control.CqueryMessages
	 * @generated
	 */
	EClass getCqueryMessages();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.control.CqueryMessages#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.control.CqueryMessages#getType()
	 * @see #getCqueryMessages()
	 * @generated
	 */
	EAttribute getCqueryMessages_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlFactory getControlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CommandHandlerImpl <em>Command Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CommandHandlerImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCommandHandler()
		 * @generated
		 */
		EClass COMMAND_HANDLER = eINSTANCE.getCommandHandler();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_HANDLER__TYPE = eINSTANCE.getCommandHandler_Type();

		/**
		 * The meta object literal for the '<em><b>Message To Send</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_HANDLER__MESSAGE_TO_SEND = eINSTANCE.getCommandHandler_MessageToSend();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_HANDLER__PARAMETERS = eINSTANCE.getCommandHandler_Parameters();

		/**
		 * The meta object literal for the '<em><b>Message Received</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_HANDLER__MESSAGE_RECEIVED = eINSTANCE.getCommandHandler_MessageReceived();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_HANDLER___EXECUTE = eINSTANCE.getCommandHandler__Execute();

		/**
		 * The meta object literal for the '<em><b>Command Handler</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_HANDLER___COMMAND_HANDLER__MESSAGETYPE_STRING = eINSTANCE.getCommandHandler__CommandHandler__MessageType_String();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.command <em>command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.command
		 * @see tlMessenger.control.impl.ControlPackageImpl#getcommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getcommand();

		/**
		 * The meta object literal for the '<em><b>Get Message To Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___GET_MESSAGE_TO_SEND__STRING = eINSTANCE.getcommand__GetMessageToSend__String();

		/**
		 * The meta object literal for the '<em><b>Handler Received Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___HANDLER_RECEIVED_MESSAGE__MESSAGE = eINSTANCE.getcommand__HandlerReceivedMessage__Message();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CexitImpl <em>Cexit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CexitImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCexit()
		 * @generated
		 */
		EClass CEXIT = eINSTANCE.getCexit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CEXIT__TYPE = eINSTANCE.getCexit_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CechoImpl <em>Cecho</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CechoImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCecho()
		 * @generated
		 */
		EClass CECHO = eINSTANCE.getCecho();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CECHO__TYPE = eINSTANCE.getCecho_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CloginImpl <em>Clogin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CloginImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getClogin()
		 * @generated
		 */
		EClass CLOGIN = eINSTANCE.getClogin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOGIN__TYPE = eINSTANCE.getClogin_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.ClogoffImpl <em>Clogoff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.ClogoffImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getClogoff()
		 * @generated
		 */
		EClass CLOGOFF = eINSTANCE.getClogoff();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOGOFF__TYPE = eINSTANCE.getClogoff_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CcreateUserImpl <em>Ccreate User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CcreateUserImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCcreateUser()
		 * @generated
		 */
		EClass CCREATE_USER = eINSTANCE.getCcreateUser();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCREATE_USER__TYPE = eINSTANCE.getCcreateUser_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CdeleteUserImpl <em>Cdelete User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CdeleteUserImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCdeleteUser()
		 * @generated
		 */
		EClass CDELETE_USER = eINSTANCE.getCdeleteUser();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDELETE_USER__TYPE = eINSTANCE.getCdeleteUser_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CcreateStoreImpl <em>Ccreate Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CcreateStoreImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCcreateStore()
		 * @generated
		 */
		EClass CCREATE_STORE = eINSTANCE.getCcreateStore();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CCREATE_STORE__TYPE = eINSTANCE.getCcreateStore_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CsendMessageImpl <em>Csend Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CsendMessageImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCsendMessage()
		 * @generated
		 */
		EClass CSEND_MESSAGE = eINSTANCE.getCsendMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSEND_MESSAGE__TYPE = eINSTANCE.getCsendMessage_Type();

		/**
		 * The meta object literal for the '{@link tlMessenger.control.impl.CqueryMessagesImpl <em>Cquery Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.control.impl.CqueryMessagesImpl
		 * @see tlMessenger.control.impl.ControlPackageImpl#getCqueryMessages()
		 * @generated
		 */
		EClass CQUERY_MESSAGES = eINSTANCE.getCqueryMessages();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CQUERY_MESSAGES__TYPE = eINSTANCE.getCqueryMessages_Type();

	}

} //ControlPackage
