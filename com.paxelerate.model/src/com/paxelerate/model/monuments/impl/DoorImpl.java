/**
 */
package com.paxelerate.model.monuments.impl;

import com.paxelerate.model.agent.Passenger;

import com.paxelerate.model.enums.DoorSide;

import com.paxelerate.model.enums.DoorType;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.MonumentsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#getPassengerThroughputPerMinute <em>Passenger Throughput Per Minute</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#isActive <em>Active</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#getWaitingPassengers <em>Waiting Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#getSide <em>Side</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#isEmergencyOnly <em>Emergency Only</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.DoorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorImpl extends MinimalEObjectImpl.Container implements Door {
	/**
	 * The default value of the '{@link #getPassengerThroughputPerMinute() <em>Passenger Throughput Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerThroughputPerMinute()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_THROUGHPUT_PER_MINUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPassengerThroughputPerMinute() <em>Passenger Throughput Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerThroughputPerMinute()
	 * @generated
	 * @ordered
	 */
	protected double passengerThroughputPerMinute = PASSENGER_THROUGHPUT_PER_MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWaitingPassengers() <em>Waiting Passengers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> waitingPassengers;

	/**
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final DoorSide SIDE_EDEFAULT = DoorSide.PORT;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected DoorSide side = SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double XPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected double xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmergencyOnly() <em>Emergency Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmergencyOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMERGENCY_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmergencyOnly() <em>Emergency Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmergencyOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean emergencyOnly = EMERGENCY_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DoorType TYPE_EDEFAULT = DoorType.I;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DoorType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonumentsPackage.Literals.DOOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerThroughputPerMinute() {
		return passengerThroughputPerMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerThroughputPerMinute(double newPassengerThroughputPerMinute) {
		double oldPassengerThroughputPerMinute = passengerThroughputPerMinute;
		passengerThroughputPerMinute = newPassengerThroughputPerMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MonumentsPackage.DOOR__PASSENGER_THROUGHPUT_PER_MINUTE, oldPassengerThroughputPerMinute,
					passengerThroughputPerMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.DOOR__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passenger> getWaitingPassengers() {
		if (waitingPassengers == null) {
			waitingPassengers = new EObjectResolvingEList<Passenger>(Passenger.class, this,
					MonumentsPackage.DOOR__WAITING_PASSENGERS);
		}
		return waitingPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorSide getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(DoorSide newSide) {
		DoorSide oldSide = side;
		side = newSide == null ? SIDE_EDEFAULT : newSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.DOOR__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(double newXPosition) {
		double oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.DOOR__XPOSITION, oldXPosition,
					xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.DOOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmergencyOnly() {
		return emergencyOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmergencyOnly(boolean newEmergencyOnly) {
		boolean oldEmergencyOnly = emergencyOnly;
		emergencyOnly = newEmergencyOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.DOOR__EMERGENCY_ONLY,
					oldEmergencyOnly, emergencyOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DoorType newType) {
		DoorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.DOOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MonumentsPackage.DOOR__PASSENGER_THROUGHPUT_PER_MINUTE:
			return getPassengerThroughputPerMinute();
		case MonumentsPackage.DOOR__ACTIVE:
			return isActive();
		case MonumentsPackage.DOOR__WAITING_PASSENGERS:
			return getWaitingPassengers();
		case MonumentsPackage.DOOR__SIDE:
			return getSide();
		case MonumentsPackage.DOOR__XPOSITION:
			return getXPosition();
		case MonumentsPackage.DOOR__ID:
			return getId();
		case MonumentsPackage.DOOR__EMERGENCY_ONLY:
			return isEmergencyOnly();
		case MonumentsPackage.DOOR__TYPE:
			return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MonumentsPackage.DOOR__PASSENGER_THROUGHPUT_PER_MINUTE:
			setPassengerThroughputPerMinute((Double) newValue);
			return;
		case MonumentsPackage.DOOR__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case MonumentsPackage.DOOR__WAITING_PASSENGERS:
			getWaitingPassengers().clear();
			getWaitingPassengers().addAll((Collection<? extends Passenger>) newValue);
			return;
		case MonumentsPackage.DOOR__SIDE:
			setSide((DoorSide) newValue);
			return;
		case MonumentsPackage.DOOR__XPOSITION:
			setXPosition((Double) newValue);
			return;
		case MonumentsPackage.DOOR__ID:
			setId((Integer) newValue);
			return;
		case MonumentsPackage.DOOR__EMERGENCY_ONLY:
			setEmergencyOnly((Boolean) newValue);
			return;
		case MonumentsPackage.DOOR__TYPE:
			setType((DoorType) newValue);
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
		case MonumentsPackage.DOOR__PASSENGER_THROUGHPUT_PER_MINUTE:
			setPassengerThroughputPerMinute(PASSENGER_THROUGHPUT_PER_MINUTE_EDEFAULT);
			return;
		case MonumentsPackage.DOOR__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case MonumentsPackage.DOOR__WAITING_PASSENGERS:
			getWaitingPassengers().clear();
			return;
		case MonumentsPackage.DOOR__SIDE:
			setSide(SIDE_EDEFAULT);
			return;
		case MonumentsPackage.DOOR__XPOSITION:
			setXPosition(XPOSITION_EDEFAULT);
			return;
		case MonumentsPackage.DOOR__ID:
			setId(ID_EDEFAULT);
			return;
		case MonumentsPackage.DOOR__EMERGENCY_ONLY:
			setEmergencyOnly(EMERGENCY_ONLY_EDEFAULT);
			return;
		case MonumentsPackage.DOOR__TYPE:
			setType(TYPE_EDEFAULT);
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
		case MonumentsPackage.DOOR__PASSENGER_THROUGHPUT_PER_MINUTE:
			return passengerThroughputPerMinute != PASSENGER_THROUGHPUT_PER_MINUTE_EDEFAULT;
		case MonumentsPackage.DOOR__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case MonumentsPackage.DOOR__WAITING_PASSENGERS:
			return waitingPassengers != null && !waitingPassengers.isEmpty();
		case MonumentsPackage.DOOR__SIDE:
			return side != SIDE_EDEFAULT;
		case MonumentsPackage.DOOR__XPOSITION:
			return xPosition != XPOSITION_EDEFAULT;
		case MonumentsPackage.DOOR__ID:
			return id != ID_EDEFAULT;
		case MonumentsPackage.DOOR__EMERGENCY_ONLY:
			return emergencyOnly != EMERGENCY_ONLY_EDEFAULT;
		case MonumentsPackage.DOOR__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (passengerThroughputPerMinute: ");
		result.append(passengerThroughputPerMinute);
		result.append(", active: ");
		result.append(active);
		result.append(", side: ");
		result.append(side);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", id: ");
		result.append(id);
		result.append(", emergencyOnly: ");
		result.append(emergencyOnly);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DoorImpl
