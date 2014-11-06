/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Seat;

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
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getSeatNumber <em>Seat Number</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getSeatType <em>Seat Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeatImpl extends MinimalEObjectImpl.Container implements Seat {
	/**
	 * The default value of the '{@link #getSeatNumber() <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatNumber() <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatNumber()
	 * @generated
	 * @ordered
	 */
	protected int seatNumber = SEAT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected String seatType = SEAT_TYPE_EDEFAULT;

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
		return CabinPackage.Literals.SEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatNumber(int newSeatNumber) {
		int oldSeatNumber = seatNumber;
		seatNumber = newSeatNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__SEAT_NUMBER, oldSeatNumber, seatNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeatType() {
		return seatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatType(String newSeatType) {
		String oldSeatType = seatType;
		seatType = newSeatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__SEAT_TYPE, oldSeatType, seatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.SEAT__SEAT_NUMBER:
				return getSeatNumber();
			case CabinPackage.SEAT__SEAT_TYPE:
				return getSeatType();
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
			case CabinPackage.SEAT__SEAT_NUMBER:
				setSeatNumber((Integer)newValue);
				return;
			case CabinPackage.SEAT__SEAT_TYPE:
				setSeatType((String)newValue);
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
			case CabinPackage.SEAT__SEAT_NUMBER:
				setSeatNumber(SEAT_NUMBER_EDEFAULT);
				return;
			case CabinPackage.SEAT__SEAT_TYPE:
				setSeatType(SEAT_TYPE_EDEFAULT);
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
			case CabinPackage.SEAT__SEAT_NUMBER:
				return seatNumber != SEAT_NUMBER_EDEFAULT;
			case CabinPackage.SEAT__SEAT_TYPE:
				return SEAT_TYPE_EDEFAULT == null ? seatType != null : !SEAT_TYPE_EDEFAULT.equals(seatType);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (seatNumber: ");
		result.append(seatNumber);
		result.append(", seatType: ");
		result.append(seatType);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
