/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Galley;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Galley</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.GalleyImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.GalleyImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.GalleyImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.GalleyImpl#getYDimension <em>YDimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GalleyImpl extends MinimalEObjectImpl.Container implements Galley {
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
	 * The default value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected static final double XDIMENSION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected double xDimension = XDIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected static final double YDIMENSION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected double yDimension = YDIMENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GalleyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.GALLEY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.GALLEY__XPOSITION, oldXPosition, xPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.GALLEY__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXDimension() {
		return xDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDimension(double newXDimension) {
		double oldXDimension = xDimension;
		xDimension = newXDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.GALLEY__XDIMENSION, oldXDimension, xDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYDimension() {
		return yDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDimension(double newYDimension) {
		double oldYDimension = yDimension;
		yDimension = newYDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.GALLEY__YDIMENSION, oldYDimension, yDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.GALLEY__XPOSITION:
				return getXPosition();
			case CabinPackage.GALLEY__YPOSITION:
				return getYPosition();
			case CabinPackage.GALLEY__XDIMENSION:
				return getXDimension();
			case CabinPackage.GALLEY__YDIMENSION:
				return getYDimension();
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
			case CabinPackage.GALLEY__XPOSITION:
				setXPosition((Double)newValue);
				return;
			case CabinPackage.GALLEY__YPOSITION:
				setYPosition((Double)newValue);
				return;
			case CabinPackage.GALLEY__XDIMENSION:
				setXDimension((Double)newValue);
				return;
			case CabinPackage.GALLEY__YDIMENSION:
				setYDimension((Double)newValue);
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
			case CabinPackage.GALLEY__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CabinPackage.GALLEY__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
				return;
			case CabinPackage.GALLEY__XDIMENSION:
				setXDimension(XDIMENSION_EDEFAULT);
				return;
			case CabinPackage.GALLEY__YDIMENSION:
				setYDimension(YDIMENSION_EDEFAULT);
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
			case CabinPackage.GALLEY__XPOSITION:
				return xPosition != XPOSITION_EDEFAULT;
			case CabinPackage.GALLEY__YPOSITION:
				return yPosition != YPOSITION_EDEFAULT;
			case CabinPackage.GALLEY__XDIMENSION:
				return xDimension != XDIMENSION_EDEFAULT;
			case CabinPackage.GALLEY__YDIMENSION:
				return yDimension != YDIMENSION_EDEFAULT;
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
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(", xDimension: ");
		result.append(xDimension);
		result.append(", yDimension: ");
		result.append(yDimension);
		result.append(')');
		return result.toString();
	}

} //GalleyImpl
