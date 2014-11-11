/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stairway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.StairwayImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.StairwayImpl#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.StairwayImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.StairwayImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.StairwayImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StairwayImpl extends MinimalEObjectImpl.Container implements Stairway {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final StairwayDirection DIRECTION_EDEFAULT = StairwayDirection.UP;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected StairwayDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StairwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.STAIRWAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.STAIRWAY__XDIMENSION, oldXDimension, xDimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.STAIRWAY__YDIMENSION, oldYDimension, yDimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.STAIRWAY__XPOSITION, oldXPosition, xPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.STAIRWAY__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StairwayDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(StairwayDirection newDirection) {
		StairwayDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.STAIRWAY__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.STAIRWAY__XDIMENSION:
				return getXDimension();
			case CabinPackage.STAIRWAY__YDIMENSION:
				return getYDimension();
			case CabinPackage.STAIRWAY__XPOSITION:
				return getXPosition();
			case CabinPackage.STAIRWAY__YPOSITION:
				return getYPosition();
			case CabinPackage.STAIRWAY__DIRECTION:
				return getDirection();
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
			case CabinPackage.STAIRWAY__XDIMENSION:
				setXDimension((Double)newValue);
				return;
			case CabinPackage.STAIRWAY__YDIMENSION:
				setYDimension((Double)newValue);
				return;
			case CabinPackage.STAIRWAY__XPOSITION:
				setXPosition((Double)newValue);
				return;
			case CabinPackage.STAIRWAY__YPOSITION:
				setYPosition((Double)newValue);
				return;
			case CabinPackage.STAIRWAY__DIRECTION:
				setDirection((StairwayDirection)newValue);
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
			case CabinPackage.STAIRWAY__XDIMENSION:
				setXDimension(XDIMENSION_EDEFAULT);
				return;
			case CabinPackage.STAIRWAY__YDIMENSION:
				setYDimension(YDIMENSION_EDEFAULT);
				return;
			case CabinPackage.STAIRWAY__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CabinPackage.STAIRWAY__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
				return;
			case CabinPackage.STAIRWAY__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case CabinPackage.STAIRWAY__XDIMENSION:
				return xDimension != XDIMENSION_EDEFAULT;
			case CabinPackage.STAIRWAY__YDIMENSION:
				return yDimension != YDIMENSION_EDEFAULT;
			case CabinPackage.STAIRWAY__XPOSITION:
				return xPosition != XPOSITION_EDEFAULT;
			case CabinPackage.STAIRWAY__YPOSITION:
				return yPosition != YPOSITION_EDEFAULT;
			case CabinPackage.STAIRWAY__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(" (xDimension: ");
		result.append(xDimension);
		result.append(", yDimension: ");
		result.append(yDimension);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //StairwayImpl
