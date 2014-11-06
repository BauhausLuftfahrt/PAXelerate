/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getSeat <em>Seat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengerImpl extends MinimalEObjectImpl.Container implements Passenger {
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
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final Sex SEX_EDEFAULT = Sex.MALE;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected Sex sex = SEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected Seat seat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.PASSENGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(Sex newSex) {
		Sex oldSex = sex;
		sex = newSex == null ? SEX_EDEFAULT : newSex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__SEX, oldSex, sex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat getSeat() {
		if (seat != null && seat.eIsProxy()) {
			InternalEObject oldSeat = (InternalEObject)seat;
			seat = (Seat)eResolveProxy(oldSeat);
			if (seat != oldSeat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.PASSENGER__SEAT, oldSeat, seat));
			}
		}
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat basicGetSeat() {
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeat(Seat newSeat) {
		Seat oldSeat = seat;
		seat = newSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__SEAT, oldSeat, seat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.PASSENGER__ID:
				return getId();
			case CabinPackage.PASSENGER__SEX:
				return getSex();
			case CabinPackage.PASSENGER__SEAT:
				if (resolve) return getSeat();
				return basicGetSeat();
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
			case CabinPackage.PASSENGER__ID:
				setId((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__SEX:
				setSex((Sex)newValue);
				return;
			case CabinPackage.PASSENGER__SEAT:
				setSeat((Seat)newValue);
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
			case CabinPackage.PASSENGER__ID:
				setId(ID_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__SEX:
				setSex(SEX_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__SEAT:
				setSeat((Seat)null);
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
			case CabinPackage.PASSENGER__ID:
				return id != ID_EDEFAULT;
			case CabinPackage.PASSENGER__SEX:
				return sex != SEX_EDEFAULT;
			case CabinPackage.PASSENGER__SEAT:
				return seat != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", sex: ");
		result.append(sex);
		result.append(')');
		return result.toString();
	}

} //PassengerImpl
