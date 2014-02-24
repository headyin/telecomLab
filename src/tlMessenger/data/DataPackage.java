/**
 */
package tlMessenger.data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see tlMessenger.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///tlMessenger.ecore/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = tlMessenger.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link tlMessenger.data.impl.MessageDataImpl <em>Message Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.data.impl.MessageDataImpl
	 * @see tlMessenger.data.impl.DataPackageImpl#getMessageData()
	 * @generated
	 */
	int MESSAGE_DATA = 0;

	/**
	 * The feature id for the '<em><b>User From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA__USER_FROM = 0;

	/**
	 * The feature id for the '<em><b>User To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA__USER_TO = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA__TIME = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA__TEXT = 3;

	/**
	 * The number of structural features of the '<em>Message Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Received Message String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA___GET_RECEIVED_MESSAGE_STRING = 0;

	/**
	 * The operation id for the '<em>Get Message String To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA___GET_MESSAGE_STRING_TO_SEND = 1;

	/**
	 * The operation id for the '<em>Message Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA___MESSAGE_DATA__STRING = 2;

	/**
	 * The operation id for the '<em>Message Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA___MESSAGE_DATA__STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Message Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link tlMessenger.data.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.data.impl.MessageImpl
	 * @see tlMessenger.data.impl.DataPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SUB_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DATA = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___MESSAGE__MESSAGETYPE_STRING = 0;

	/**
	 * The operation id for the '<em>Get Bytes To Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_BYTES_TO_SEND = 1;

	/**
	 * The operation id for the '<em>Set Received Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SET_RECEIVED_MESSAGE__BYTE = 2;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link tlMessenger.data.MessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tlMessenger.data.MessageType
	 * @see tlMessenger.data.impl.DataPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link tlMessenger.data.MessageData <em>Message Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Data</em>'.
	 * @see tlMessenger.data.MessageData
	 * @generated
	 */
	EClass getMessageData();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.MessageData#getUserFrom <em>User From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User From</em>'.
	 * @see tlMessenger.data.MessageData#getUserFrom()
	 * @see #getMessageData()
	 * @generated
	 */
	EAttribute getMessageData_UserFrom();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.MessageData#getUserTo <em>User To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User To</em>'.
	 * @see tlMessenger.data.MessageData#getUserTo()
	 * @see #getMessageData()
	 * @generated
	 */
	EAttribute getMessageData_UserTo();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.MessageData#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see tlMessenger.data.MessageData#getTime()
	 * @see #getMessageData()
	 * @generated
	 */
	EAttribute getMessageData_Time();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.MessageData#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see tlMessenger.data.MessageData#getText()
	 * @see #getMessageData()
	 * @generated
	 */
	EAttribute getMessageData_Text();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.MessageData#getReceivedMessageString() <em>Get Received Message String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Received Message String</em>' operation.
	 * @see tlMessenger.data.MessageData#getReceivedMessageString()
	 * @generated
	 */
	EOperation getMessageData__GetReceivedMessageString();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.MessageData#getMessageStringToSend() <em>Get Message String To Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Message String To Send</em>' operation.
	 * @see tlMessenger.data.MessageData#getMessageStringToSend()
	 * @generated
	 */
	EOperation getMessageData__GetMessageStringToSend();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.MessageData#MessageData(java.lang.String) <em>Message Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Data</em>' operation.
	 * @see tlMessenger.data.MessageData#MessageData(java.lang.String)
	 * @generated
	 */
	EOperation getMessageData__MessageData__String();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.MessageData#MessageData(java.lang.String, java.lang.String) <em>Message Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message Data</em>' operation.
	 * @see tlMessenger.data.MessageData#MessageData(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getMessageData__MessageData__String_String();

	/**
	 * Returns the meta object for class '{@link tlMessenger.data.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see tlMessenger.data.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.Message#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tlMessenger.data.Message#getType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Type();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.Message#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see tlMessenger.data.Message#getSubType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_SubType();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.Message#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see tlMessenger.data.Message#getSize()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Size();

	/**
	 * Returns the meta object for the attribute '{@link tlMessenger.data.Message#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see tlMessenger.data.Message#getData()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Data();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.Message#Message(tlMessenger.data.MessageType, java.lang.String) <em>Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Message</em>' operation.
	 * @see tlMessenger.data.Message#Message(tlMessenger.data.MessageType, java.lang.String)
	 * @generated
	 */
	EOperation getMessage__Message__MessageType_String();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.Message#getBytesToSend() <em>Get Bytes To Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bytes To Send</em>' operation.
	 * @see tlMessenger.data.Message#getBytesToSend()
	 * @generated
	 */
	EOperation getMessage__GetBytesToSend();

	/**
	 * Returns the meta object for the '{@link tlMessenger.data.Message#setReceivedMessage(byte[]) <em>Set Received Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Received Message</em>' operation.
	 * @see tlMessenger.data.Message#setReceivedMessage(byte[])
	 * @generated
	 */
	EOperation getMessage__SetReceivedMessage__byte();

	/**
	 * Returns the meta object for enum '{@link tlMessenger.data.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see tlMessenger.data.MessageType
	 * @generated
	 */
	EEnum getMessageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link tlMessenger.data.impl.MessageDataImpl <em>Message Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.data.impl.MessageDataImpl
		 * @see tlMessenger.data.impl.DataPackageImpl#getMessageData()
		 * @generated
		 */
		EClass MESSAGE_DATA = eINSTANCE.getMessageData();

		/**
		 * The meta object literal for the '<em><b>User From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DATA__USER_FROM = eINSTANCE.getMessageData_UserFrom();

		/**
		 * The meta object literal for the '<em><b>User To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DATA__USER_TO = eINSTANCE.getMessageData_UserTo();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DATA__TIME = eINSTANCE.getMessageData_Time();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_DATA__TEXT = eINSTANCE.getMessageData_Text();

		/**
		 * The meta object literal for the '<em><b>Get Received Message String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_DATA___GET_RECEIVED_MESSAGE_STRING = eINSTANCE.getMessageData__GetReceivedMessageString();

		/**
		 * The meta object literal for the '<em><b>Get Message String To Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_DATA___GET_MESSAGE_STRING_TO_SEND = eINSTANCE.getMessageData__GetMessageStringToSend();

		/**
		 * The meta object literal for the '<em><b>Message Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_DATA___MESSAGE_DATA__STRING = eINSTANCE.getMessageData__MessageData__String();

		/**
		 * The meta object literal for the '<em><b>Message Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_DATA___MESSAGE_DATA__STRING_STRING = eINSTANCE.getMessageData__MessageData__String_String();

		/**
		 * The meta object literal for the '{@link tlMessenger.data.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.data.impl.MessageImpl
		 * @see tlMessenger.data.impl.DataPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TYPE = eINSTANCE.getMessage_Type();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SUB_TYPE = eINSTANCE.getMessage_SubType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__SIZE = eINSTANCE.getMessage_Size();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DATA = eINSTANCE.getMessage_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___MESSAGE__MESSAGETYPE_STRING = eINSTANCE.getMessage__Message__MessageType_String();

		/**
		 * The meta object literal for the '<em><b>Get Bytes To Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___GET_BYTES_TO_SEND = eINSTANCE.getMessage__GetBytesToSend();

		/**
		 * The meta object literal for the '<em><b>Set Received Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___SET_RECEIVED_MESSAGE__BYTE = eINSTANCE.getMessage__SetReceivedMessage__byte();

		/**
		 * The meta object literal for the '{@link tlMessenger.data.MessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tlMessenger.data.MessageType
		 * @see tlMessenger.data.impl.DataPackageImpl#getMessageType()
		 * @generated
		 */
		EEnum MESSAGE_TYPE = eINSTANCE.getMessageType();

	}

} //DataPackage
