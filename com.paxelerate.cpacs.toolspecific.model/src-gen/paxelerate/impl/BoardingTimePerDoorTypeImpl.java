/**
 */
package paxelerate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paxelerate.BoardingTimePerDoorType;
import paxelerate.PaxeleratePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boarding Time Per Door Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.BoardingTimePerDoorTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link paxelerate.impl.BoardingTimePerDoorTypeImpl#getDoorUID <em>Door UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardingTimePerDoorTypeImpl extends MinimalEObjectImpl.Container implements BoardingTimePerDoorType {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected double time = TIME_EDEFAULT;

	/**
	 * This is true if the Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeESet;

	/**
	 * The default value of the '{@link #getDoorUID() <em>Door UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorUID()
	 * @generated
	 * @ordered
	 */
	protected static final String DOOR_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoorUID() <em>Door UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorUID()
	 * @generated
	 * @ordered
	 */
	protected String doorUID = DOOR_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardingTimePerDoorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.BOARDING_TIME_PER_DOOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(double newTime) {
		double oldTime = time;
		time = newTime;
		boolean oldTimeESet = timeESet;
		timeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__TIME,
					oldTime, time, !oldTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTime() {
		double oldTime = time;
		boolean oldTimeESet = timeESet;
		time = TIME_EDEFAULT;
		timeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__TIME,
					oldTime, TIME_EDEFAULT, oldTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTime() {
		return timeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDoorUID() {
		return doorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorUID(String newDoorUID) {
		String oldDoorUID = doorUID;
		doorUID = newDoorUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID, oldDoorUID, doorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__TIME:
			return getTime();
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID:
			return getDoorUID();
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
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__TIME:
			setTime((Double) newValue);
			return;
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID:
			setDoorUID((String) newValue);
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
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__TIME:
			unsetTime();
			return;
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID:
			setDoorUID(DOOR_UID_EDEFAULT);
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
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__TIME:
			return isSetTime();
		case PaxeleratePackage.BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID:
			return DOOR_UID_EDEFAULT == null ? doorUID != null : !DOOR_UID_EDEFAULT.equals(doorUID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (time: ");
		if (timeESet)
			result.append(time);
		else
			result.append("<unset>");
		result.append(", doorUID: ");
		result.append(doorUID);
		result.append(')');
		return result.toString();
	}

} //BoardingTimePerDoorTypeImpl
