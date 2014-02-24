/**
 */
package tlMessenger.control.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tlMessenger.control.CommandHandler;
import tlMessenger.control.ControlPackage;

import tlMessenger.data.Message;
import tlMessenger.data.MessageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tlMessenger.control.impl.CommandHandlerImpl#getType <em>Type</em>}</li>
 *   <li>{@link tlMessenger.control.impl.CommandHandlerImpl#getMessageToSend <em>Message To Send</em>}</li>
 *   <li>{@link tlMessenger.control.impl.CommandHandlerImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link tlMessenger.control.impl.CommandHandlerImpl#getMessageReceived <em>Message Received</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandHandlerImpl extends MinimalEObjectImpl.Container implements CommandHandler {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MessageType TYPE_EDEFAULT = MessageType.EXIT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MessageType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageToSend() <em>Message To Send</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageToSend()
	 * @generated
	 * @ordered
	 */
	protected Message messageToSend;

	/**
	 * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected String parameters = PARAMETERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageReceived() <em>Message Received</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReceived()
	 * @generated
	 * @ordered
	 */
	protected Message messageReceived;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlPackage.Literals.COMMAND_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MessageType newType) {
		MessageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.COMMAND_HANDLER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageToSend() {
		if (messageToSend != null && messageToSend.eIsProxy()) {
			InternalEObject oldMessageToSend = (InternalEObject)messageToSend;
			messageToSend = (Message)eResolveProxy(oldMessageToSend);
			if (messageToSend != oldMessageToSend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.COMMAND_HANDLER__MESSAGE_TO_SEND, oldMessageToSend, messageToSend));
			}
		}
		return messageToSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageToSend() {
		return messageToSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageToSend(Message newMessageToSend) {
		Message oldMessageToSend = messageToSend;
		messageToSend = newMessageToSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.COMMAND_HANDLER__MESSAGE_TO_SEND, oldMessageToSend, messageToSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(String newParameters) {
		String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.COMMAND_HANDLER__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessageReceived() {
		if (messageReceived != null && messageReceived.eIsProxy()) {
			InternalEObject oldMessageReceived = (InternalEObject)messageReceived;
			messageReceived = (Message)eResolveProxy(oldMessageReceived);
			if (messageReceived != oldMessageReceived) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlPackage.COMMAND_HANDLER__MESSAGE_RECEIVED, oldMessageReceived, messageReceived));
			}
		}
		return messageReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessageReceived() {
		return messageReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageReceived(Message newMessageReceived) {
		Message oldMessageReceived = messageReceived;
		messageReceived = newMessageReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlPackage.COMMAND_HANDLER__MESSAGE_RECEIVED, oldMessageReceived, messageReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CommandHandler(MessageType type, String parameters) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlPackage.COMMAND_HANDLER__TYPE:
				return getType();
			case ControlPackage.COMMAND_HANDLER__MESSAGE_TO_SEND:
				if (resolve) return getMessageToSend();
				return basicGetMessageToSend();
			case ControlPackage.COMMAND_HANDLER__PARAMETERS:
				return getParameters();
			case ControlPackage.COMMAND_HANDLER__MESSAGE_RECEIVED:
				if (resolve) return getMessageReceived();
				return basicGetMessageReceived();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlPackage.COMMAND_HANDLER__TYPE:
				setType((MessageType)newValue);
				return;
			case ControlPackage.COMMAND_HANDLER__MESSAGE_TO_SEND:
				setMessageToSend((Message)newValue);
				return;
			case ControlPackage.COMMAND_HANDLER__PARAMETERS:
				setParameters((String)newValue);
				return;
			case ControlPackage.COMMAND_HANDLER__MESSAGE_RECEIVED:
				setMessageReceived((Message)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ControlPackage.COMMAND_HANDLER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ControlPackage.COMMAND_HANDLER__MESSAGE_TO_SEND:
				setMessageToSend((Message)null);
				return;
			case ControlPackage.COMMAND_HANDLER__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case ControlPackage.COMMAND_HANDLER__MESSAGE_RECEIVED:
				setMessageReceived((Message)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ControlPackage.COMMAND_HANDLER__TYPE:
				return type != TYPE_EDEFAULT;
			case ControlPackage.COMMAND_HANDLER__MESSAGE_TO_SEND:
				return messageToSend != null;
			case ControlPackage.COMMAND_HANDLER__PARAMETERS:
				return PARAMETERS_EDEFAULT == null ? parameters != null : !PARAMETERS_EDEFAULT.equals(parameters);
			case ControlPackage.COMMAND_HANDLER__MESSAGE_RECEIVED:
				return messageReceived != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ControlPackage.COMMAND_HANDLER___EXECUTE:
				execute();
				return null;
			case ControlPackage.COMMAND_HANDLER___COMMAND_HANDLER__MESSAGETYPE_STRING:
				CommandHandler((MessageType)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //CommandHandlerImpl
