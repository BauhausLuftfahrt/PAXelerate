/**
 */
package paxelerate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import paxelerate.BoardingTimePerDoorType;
import paxelerate.BoardingTimesPerDoorType;
import paxelerate.PaxeleratePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boarding Times Per Door Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.BoardingTimesPerDoorTypeImpl#getBoardingTimePerDoor <em>Boarding Time Per Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardingTimesPerDoorTypeImpl extends MinimalEObjectImpl.Container implements BoardingTimesPerDoorType {
	/**
	 * The cached value of the '{@link #getBoardingTimePerDoor() <em>Boarding Time Per Door</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTimePerDoor()
	 * @generated
	 * @ordered
	 */
	protected EList<BoardingTimePerDoorType> boardingTimePerDoor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardingTimesPerDoorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.BOARDING_TIMES_PER_DOOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoardingTimePerDoorType> getBoardingTimePerDoor() {
		if (boardingTimePerDoor == null) {
			boardingTimePerDoor = new EObjectContainmentEList<BoardingTimePerDoorType>(BoardingTimePerDoorType.class,
					this, PaxeleratePackage.BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR);
		}
		return boardingTimePerDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PaxeleratePackage.BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR:
			return ((InternalEList<?>) getBoardingTimePerDoor()).basicRemove(otherEnd, msgs);
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
		case PaxeleratePackage.BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR:
			return getBoardingTimePerDoor();
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
		case PaxeleratePackage.BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR:
			getBoardingTimePerDoor().clear();
			getBoardingTimePerDoor().addAll((Collection<? extends BoardingTimePerDoorType>) newValue);
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
		case PaxeleratePackage.BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR:
			getBoardingTimePerDoor().clear();
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
		case PaxeleratePackage.BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR:
			return boardingTimePerDoor != null && !boardingTimePerDoor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoardingTimesPerDoorTypeImpl
