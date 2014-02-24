/**
 */
package tlMessenger.data.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tlMessenger.data.DataPackage;
import tlMessenger.data.MessageData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tlMessenger.data.impl.MessageDataImpl#getUserFrom <em>User From</em>}</li>
 *   <li>{@link tlMessenger.data.impl.MessageDataImpl#getUserTo <em>User To</em>}</li>
 *   <li>{@link tlMessenger.data.impl.MessageDataImpl#getTime <em>Time</em>}</li>
 *   <li>{@link tlMessenger.data.impl.MessageDataImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageDataImpl extends MinimalEObjectImpl.Container implements MessageData {
	/**
	 * The default value of the '{@link #getUserFrom() <em>User From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserFrom() <em>User From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserFrom()
	 * @generated
	 * @ordered
	 */
	protected String userFrom = USER_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserTo() <em>User To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTo()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserTo() <em>User To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTo()
	 * @generated
	 * @ordered
	 */
	protected String userTo = USER_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.MESSAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserFrom() {
		return userFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserFrom(String newUserFrom) {
		String oldUserFrom = userFrom;
		userFrom = newUserFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MESSAGE_DATA__USER_FROM, oldUserFrom, userFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserTo() {
		return userTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTo(String newUserTo) {
		String oldUserTo = userTo;
		userTo = newUserTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MESSAGE_DATA__USER_TO, oldUserTo, userTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MESSAGE_DATA__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MESSAGE_DATA__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReceivedMessageString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageStringToSend() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void MessageData(String receivedText) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void MessageData(String destUser, String text) {
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
			case DataPackage.MESSAGE_DATA__USER_FROM:
				return getUserFrom();
			case DataPackage.MESSAGE_DATA__USER_TO:
				return getUserTo();
			case DataPackage.MESSAGE_DATA__TIME:
				return getTime();
			case DataPackage.MESSAGE_DATA__TEXT:
				return getText();
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
			case DataPackage.MESSAGE_DATA__USER_FROM:
				setUserFrom((String)newValue);
				return;
			case DataPackage.MESSAGE_DATA__USER_TO:
				setUserTo((String)newValue);
				return;
			case DataPackage.MESSAGE_DATA__TIME:
				setTime((Date)newValue);
				return;
			case DataPackage.MESSAGE_DATA__TEXT:
				setText((String)newValue);
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
			case DataPackage.MESSAGE_DATA__USER_FROM:
				setUserFrom(USER_FROM_EDEFAULT);
				return;
			case DataPackage.MESSAGE_DATA__USER_TO:
				setUserTo(USER_TO_EDEFAULT);
				return;
			case DataPackage.MESSAGE_DATA__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case DataPackage.MESSAGE_DATA__TEXT:
				setText(TEXT_EDEFAULT);
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
			case DataPackage.MESSAGE_DATA__USER_FROM:
				return USER_FROM_EDEFAULT == null ? userFrom != null : !USER_FROM_EDEFAULT.equals(userFrom);
			case DataPackage.MESSAGE_DATA__USER_TO:
				return USER_TO_EDEFAULT == null ? userTo != null : !USER_TO_EDEFAULT.equals(userTo);
			case DataPackage.MESSAGE_DATA__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case DataPackage.MESSAGE_DATA__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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
			case DataPackage.MESSAGE_DATA___GET_RECEIVED_MESSAGE_STRING:
				return getReceivedMessageString();
			case DataPackage.MESSAGE_DATA___GET_MESSAGE_STRING_TO_SEND:
				return getMessageStringToSend();
			case DataPackage.MESSAGE_DATA___MESSAGE_DATA__STRING:
				MessageData((String)arguments.get(0));
				return null;
			case DataPackage.MESSAGE_DATA___MESSAGE_DATA__STRING_STRING:
				MessageData((String)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (userFrom: ");
		result.append(userFrom);
		result.append(", userTo: ");
		result.append(userTo);
		result.append(", time: ");
		result.append(time);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //MessageDataImpl
