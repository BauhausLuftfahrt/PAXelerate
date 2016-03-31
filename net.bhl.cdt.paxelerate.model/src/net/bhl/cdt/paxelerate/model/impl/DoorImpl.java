/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#isOnBothSides <em>On Both Sides</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#getNumberOfSimultaneousPassengers <em>Number Of Simultaneous Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl#getWaitingPassengers <em>Waiting Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DoorImpl extends MinimalEObjectImpl.Container implements Door {
	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int XPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected int xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnBothSides() <em>On Both Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnBothSides()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_BOTH_SIDES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnBothSides() <em>On Both Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnBothSides()
	 * @generated
	 * @ordered
	 */
	protected boolean onBothSides = ON_BOTH_SIDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

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
	 * The default value of the '{@link #getNumberOfSimultaneousPassengers() <em>Number Of Simultaneous Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSimultaneousPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SIMULTANEOUS_PASSENGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSimultaneousPassengers() <em>Number Of Simultaneous Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSimultaneousPassengers()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSimultaneousPassengers = NUMBER_OF_SIMULTANEOUS_PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

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
		return CabinPackage.Literals.DOOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(int newXPosition) {
		int oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__XPOSITION, oldXPosition, xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnBothSides() {
		return onBothSides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBothSides(boolean newOnBothSides) {
		boolean oldOnBothSides = onBothSides;
		onBothSides = newOnBothSides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__ON_BOTH_SIDES, oldOnBothSides, onBothSides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSimultaneousPassengers() {
		return numberOfSimultaneousPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSimultaneousPassengers(int newNumberOfSimultaneousPassengers) {
		int oldNumberOfSimultaneousPassengers = numberOfSimultaneousPassengers;
		numberOfSimultaneousPassengers = newNumberOfSimultaneousPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS, oldNumberOfSimultaneousPassengers, numberOfSimultaneousPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passenger> getWaitingPassengers() {
		if (waitingPassengers == null) {
			waitingPassengers = new EObjectResolvingEList<Passenger>(Passenger.class, this, CabinPackage.DOOR__WAITING_PASSENGERS);
		}
		return waitingPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.DOOR__XPOSITION:
				return getXPosition();
			case CabinPackage.DOOR__ON_BOTH_SIDES:
				return isOnBothSides();
			case CabinPackage.DOOR__WIDTH:
				return getWidth();
			case CabinPackage.DOOR__ID:
				return getId();
			case CabinPackage.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS:
				return getNumberOfSimultaneousPassengers();
			case CabinPackage.DOOR__IS_ACTIVE:
				return isIsActive();
			case CabinPackage.DOOR__WAITING_PASSENGERS:
				return getWaitingPassengers();
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
			case CabinPackage.DOOR__XPOSITION:
				setXPosition((Integer)newValue);
				return;
			case CabinPackage.DOOR__ON_BOTH_SIDES:
				setOnBothSides((Boolean)newValue);
				return;
			case CabinPackage.DOOR__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CabinPackage.DOOR__ID:
				setId((Integer)newValue);
				return;
			case CabinPackage.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS:
				setNumberOfSimultaneousPassengers((Integer)newValue);
				return;
			case CabinPackage.DOOR__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case CabinPackage.DOOR__WAITING_PASSENGERS:
				getWaitingPassengers().clear();
				getWaitingPassengers().addAll((Collection<? extends Passenger>)newValue);
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
			case CabinPackage.DOOR__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CabinPackage.DOOR__ON_BOTH_SIDES:
				setOnBothSides(ON_BOTH_SIDES_EDEFAULT);
				return;
			case CabinPackage.DOOR__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CabinPackage.DOOR__ID:
				setId(ID_EDEFAULT);
				return;
			case CabinPackage.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS:
				setNumberOfSimultaneousPassengers(NUMBER_OF_SIMULTANEOUS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.DOOR__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case CabinPackage.DOOR__WAITING_PASSENGERS:
				getWaitingPassengers().clear();
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
			case CabinPackage.DOOR__XPOSITION:
				return xPosition != XPOSITION_EDEFAULT;
			case CabinPackage.DOOR__ON_BOTH_SIDES:
				return onBothSides != ON_BOTH_SIDES_EDEFAULT;
			case CabinPackage.DOOR__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CabinPackage.DOOR__ID:
				return id != ID_EDEFAULT;
			case CabinPackage.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS:
				return numberOfSimultaneousPassengers != NUMBER_OF_SIMULTANEOUS_PASSENGERS_EDEFAULT;
			case CabinPackage.DOOR__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case CabinPackage.DOOR__WAITING_PASSENGERS:
				return waitingPassengers != null && !waitingPassengers.isEmpty();
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
		result.append(" (xPosition: ");
		result.append(xPosition);
		result.append(", onBothSides: ");
		result.append(onBothSides);
		result.append(", width: ");
		result.append(width);
		result.append(", id: ");
		result.append(id);
		result.append(", numberOfSimultaneousPassengers: ");
		result.append(numberOfSimultaneousPassengers);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //DoorImpl
