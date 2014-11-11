/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;

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
 *   <li>{@link net.bhl.cdt.model.cabin.impl.DoorImpl#getDoorType <em>Door Type</em>}</li>
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
	protected static final double YPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected double yPosition = YPOSITION_EDEFAULT;

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
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

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
	 * The default value of the '{@link #getDoorType() <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorType()
	 * @generated
	 * @ordered
	 */
	protected static final DoorType DOOR_TYPE_EDEFAULT = DoorType.MAIN_DOOR;

	/**
	 * The cached value of the '{@link #getDoorType() <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorType()
	 * @generated
	 * @ordered
	 */
	protected DoorType doorType = DOOR_TYPE_EDEFAULT;

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
	public double getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPosition(double newYPosition) {
		double oldYPosition = yPosition;
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
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
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
	public DoorType getDoorType() {
		return doorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorType(DoorType newDoorType) {
		DoorType oldDoorType = doorType;
		doorType = newDoorType == null ? DOOR_TYPE_EDEFAULT : newDoorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.DOOR__DOOR_TYPE, oldDoorType, doorType));
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
			case CabinPackage.DOOR__DOOR_TYPE:
				return getDoorType();
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
				setYPosition((Double)newValue);
				return;
			case CabinPackage.DOOR__ON_BOTH_SIDES:
				setOnBothSides((Boolean)newValue);
				return;
			case CabinPackage.DOOR__WIDTH:
				setWidth((Double)newValue);
				return;
			case CabinPackage.DOOR__ID:
				setId((Integer)newValue);
				return;
			case CabinPackage.DOOR__DOOR_TYPE:
				setDoorType((DoorType)newValue);
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
			case CabinPackage.DOOR__DOOR_TYPE:
				setDoorType(DOOR_TYPE_EDEFAULT);
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
			case CabinPackage.DOOR__DOOR_TYPE:
				return doorType != DOOR_TYPE_EDEFAULT;
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
		result.append(", doorType: ");
		result.append(doorType);
		result.append(')');
		return result.toString();
	}

} //DoorImpl
