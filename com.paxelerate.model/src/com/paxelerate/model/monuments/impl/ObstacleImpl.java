/**
 */
package com.paxelerate.model.monuments.impl;

import com.paxelerate.model.enums.TravelClass;

import com.paxelerate.model.monuments.MonumentsPackage;
import com.paxelerate.model.monuments.Obstacle;
import com.paxelerate.model.monuments.Seat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.impl.ObstacleImpl#getSeats <em>Seats</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.ObstacleImpl#getTravelClass <em>Travel Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObstacleImpl extends MonumentImpl implements Obstacle {
	/**
	 * The cached value of the '{@link #getSeats() <em>Seats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeats()
	 * @generated
	 * @ordered
	 */
	protected EList<Seat> seats;

	/**
	 * The default value of the '{@link #getTravelClass() <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected static final TravelClass TRAVEL_CLASS_EDEFAULT = TravelClass.ECONOMY;

	/**
	 * The cached value of the '{@link #getTravelClass() <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected TravelClass travelClass = TRAVEL_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstacleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonumentsPackage.Literals.OBSTACLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seat> getSeats() {
		if (seats == null) {
			seats = new EObjectContainmentEList<Seat>(Seat.class, this, MonumentsPackage.OBSTACLE__SEATS);
		}
		return seats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelClass getTravelClass() {
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelClass(TravelClass newTravelClass) {
		TravelClass oldTravelClass = travelClass;
		travelClass = newTravelClass == null ? TRAVEL_CLASS_EDEFAULT : newTravelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.OBSTACLE__TRAVEL_CLASS,
					oldTravelClass, travelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MonumentsPackage.OBSTACLE__SEATS:
			return ((InternalEList<?>) getSeats()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MonumentsPackage.OBSTACLE__SEATS:
			return getSeats();
		case MonumentsPackage.OBSTACLE__TRAVEL_CLASS:
			return getTravelClass();
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
		case MonumentsPackage.OBSTACLE__SEATS:
			getSeats().clear();
			getSeats().addAll((Collection<? extends Seat>) newValue);
			return;
		case MonumentsPackage.OBSTACLE__TRAVEL_CLASS:
			setTravelClass((TravelClass) newValue);
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
		case MonumentsPackage.OBSTACLE__SEATS:
			getSeats().clear();
			return;
		case MonumentsPackage.OBSTACLE__TRAVEL_CLASS:
			setTravelClass(TRAVEL_CLASS_EDEFAULT);
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
		case MonumentsPackage.OBSTACLE__SEATS:
			return seats != null && !seats.isEmpty();
		case MonumentsPackage.OBSTACLE__TRAVEL_CLASS:
			return travelClass != TRAVEL_CLASS_EDEFAULT;
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
		result.append(" (travelClass: ");
		result.append(travelClass);
		result.append(')');
		return result.toString();
	}

} //ObstacleImpl
