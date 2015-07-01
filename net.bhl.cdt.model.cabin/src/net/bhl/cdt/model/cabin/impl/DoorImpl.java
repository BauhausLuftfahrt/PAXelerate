/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Door;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#isOnBothSides <em>On Both Sides</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#getNumberOfSimultaneousPassengers <em>Number Of Simultaneous Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#isIsActive <em>Is Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoorImpl extends MinimalEObjectImpl.Container implements Door {
	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int YPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected int yPosition = YPOSITION_EDEFAULT;

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
	public int getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPosition(int newYPosition) {
		int oldYPosition = yPosition;
		yPosition = newYPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__YPOSITION, oldYPosition, yPosition));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.DOOR__YPOSITION:
				return getYPosition();
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
			case CabinPackage.DOOR__YPOSITION:
				setYPosition((Integer)newValue);
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
			case CabinPackage.DOOR__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
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
			case CabinPackage.DOOR__YPOSITION:
				return yPosition != YPOSITION_EDEFAULT;
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
		result.append(" (yPosition: ");
		result.append(yPosition);
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
