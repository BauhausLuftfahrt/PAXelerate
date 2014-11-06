/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinDoors;
import net.bhl.cdt.model.cabin.CabinPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinDoorsImpl#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinDoorsImpl#getYCoordinate <em>YCoordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CabinDoorsImpl extends MinimalEObjectImpl.Container implements CabinDoors {
	/**
	 * The default value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final int XCOORDINATE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getXCoordinate() <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCoordinate()
	 * @generated
	 * @ordered
	 */
	protected int xCoordinate = XCOORDINATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final int YCOORDINATE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getYCoordinate() <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCoordinate()
	 * @generated
	 * @ordered
	 */
	protected int yCoordinate = YCOORDINATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinDoorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.CABIN_DOORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXCoordinate() {
		return xCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCoordinate(int newXCoordinate) {
		int oldXCoordinate = xCoordinate;
		xCoordinate = newXCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_DOORS__XCOORDINATE, oldXCoordinate, xCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYCoordinate() {
		return yCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCoordinate(int newYCoordinate) {
		int oldYCoordinate = yCoordinate;
		yCoordinate = newYCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_DOORS__YCOORDINATE, oldYCoordinate, yCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.CABIN_DOORS__XCOORDINATE:
				return getXCoordinate();
			case CabinPackage.CABIN_DOORS__YCOORDINATE:
				return getYCoordinate();
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
			case CabinPackage.CABIN_DOORS__XCOORDINATE:
				setXCoordinate((Integer)newValue);
				return;
			case CabinPackage.CABIN_DOORS__YCOORDINATE:
				setYCoordinate((Integer)newValue);
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
			case CabinPackage.CABIN_DOORS__XCOORDINATE:
				setXCoordinate(XCOORDINATE_EDEFAULT);
				return;
			case CabinPackage.CABIN_DOORS__YCOORDINATE:
				setYCoordinate(YCOORDINATE_EDEFAULT);
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
			case CabinPackage.CABIN_DOORS__XCOORDINATE:
				return xCoordinate != XCOORDINATE_EDEFAULT;
			case CabinPackage.CABIN_DOORS__YCOORDINATE:
				return yCoordinate != YCOORDINATE_EDEFAULT;
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
		result.append(" (xCoordinate: ");
		result.append(xCoordinate);
		result.append(", yCoordinate: ");
		result.append(yCoordinate);
		result.append(')');
		return result.toString();
	}

} //CabinDoorsImpl
