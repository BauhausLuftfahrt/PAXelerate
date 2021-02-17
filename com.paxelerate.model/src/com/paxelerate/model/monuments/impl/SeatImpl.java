/**
 */
package com.paxelerate.model.monuments.impl;

import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.SeatType;

import com.paxelerate.model.monuments.MonumentsPackage;
import com.paxelerate.model.monuments.Seat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.impl.SeatImpl#getLetter <em>Letter</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.SeatImpl#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.SeatImpl#getSeatLocation <em>Seat Location</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.SeatImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatImpl extends MinimalEObjectImpl.Container implements Seat {
	/**
	 * The default value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected static final char LETTER_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected char letter = LETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected static final SeatType SEAT_TYPE_EDEFAULT = SeatType.DEFAULT;

	/**
	 * The cached value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected SeatType seatType = SEAT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatLocation() <em>Seat Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLocation()
	 * @generated
	 * @ordered
	 */
	protected static final SeatLocation SEAT_LOCATION_EDEFAULT = SeatLocation.WINDOW;

	/**
	 * The cached value of the '{@link #getSeatLocation() <em>Seat Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLocation()
	 * @generated
	 * @ordered
	 */
	protected SeatLocation seatLocation = SEAT_LOCATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonumentsPackage.Literals.SEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getLetter() {
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetter(char newLetter) {
		char oldLetter = letter;
		letter = newLetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.SEAT__LETTER, oldLetter, letter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatType getSeatType() {
		return seatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatType(SeatType newSeatType) {
		SeatType oldSeatType = seatType;
		seatType = newSeatType == null ? SEAT_TYPE_EDEFAULT : newSeatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.SEAT__SEAT_TYPE, oldSeatType,
					seatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatLocation getSeatLocation() {
		return seatLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLocation(SeatLocation newSeatLocation) {
		SeatLocation oldSeatLocation = seatLocation;
		seatLocation = newSeatLocation == null ? SEAT_LOCATION_EDEFAULT : newSeatLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.SEAT__SEAT_LOCATION, oldSeatLocation,
					seatLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.SEAT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MonumentsPackage.SEAT__LETTER:
			return getLetter();
		case MonumentsPackage.SEAT__SEAT_TYPE:
			return getSeatType();
		case MonumentsPackage.SEAT__SEAT_LOCATION:
			return getSeatLocation();
		case MonumentsPackage.SEAT__ID:
			return getId();
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
		case MonumentsPackage.SEAT__LETTER:
			setLetter((Character) newValue);
			return;
		case MonumentsPackage.SEAT__SEAT_TYPE:
			setSeatType((SeatType) newValue);
			return;
		case MonumentsPackage.SEAT__SEAT_LOCATION:
			setSeatLocation((SeatLocation) newValue);
			return;
		case MonumentsPackage.SEAT__ID:
			setId((Integer) newValue);
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
		case MonumentsPackage.SEAT__LETTER:
			setLetter(LETTER_EDEFAULT);
			return;
		case MonumentsPackage.SEAT__SEAT_TYPE:
			setSeatType(SEAT_TYPE_EDEFAULT);
			return;
		case MonumentsPackage.SEAT__SEAT_LOCATION:
			setSeatLocation(SEAT_LOCATION_EDEFAULT);
			return;
		case MonumentsPackage.SEAT__ID:
			setId(ID_EDEFAULT);
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
		case MonumentsPackage.SEAT__LETTER:
			return letter != LETTER_EDEFAULT;
		case MonumentsPackage.SEAT__SEAT_TYPE:
			return seatType != SEAT_TYPE_EDEFAULT;
		case MonumentsPackage.SEAT__SEAT_LOCATION:
			return seatLocation != SEAT_LOCATION_EDEFAULT;
		case MonumentsPackage.SEAT__ID:
			return id != ID_EDEFAULT;
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
		result.append(" (letter: ");
		result.append(letter);
		result.append(", seatType: ");
		result.append(seatType);
		result.append(", seatLocation: ");
		result.append(seatLocation);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
