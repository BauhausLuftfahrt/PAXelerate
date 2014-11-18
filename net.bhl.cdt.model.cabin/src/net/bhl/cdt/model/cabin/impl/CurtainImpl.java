/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Curtain;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curtain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#getPostitionAfterRow <em>Postition After Row</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#isCurtainOpen <em>Curtain Open</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CurtainImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurtainImpl extends MinimalEObjectImpl.Container implements Curtain {
	/**
	 * The default value of the '{@link #getPostitionAfterRow() <em>Postition After Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostitionAfterRow()
	 * @generated
	 * @ordered
	 */
	protected static final int POSTITION_AFTER_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPostitionAfterRow() <em>Postition After Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostitionAfterRow()
	 * @generated
	 * @ordered
	 */
	protected int postitionAfterRow = POSTITION_AFTER_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurtainOpen() <em>Curtain Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurtainOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURTAIN_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurtainOpen() <em>Curtain Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurtainOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean curtainOpen = CURTAIN_OPEN_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurtainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.CURTAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPostitionAfterRow() {
		return postitionAfterRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostitionAfterRow(int newPostitionAfterRow) {
		int oldPostitionAfterRow = postitionAfterRow;
		postitionAfterRow = newPostitionAfterRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__POSTITION_AFTER_ROW, oldPostitionAfterRow, postitionAfterRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurtainOpen() {
		return curtainOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurtainOpen(boolean newCurtainOpen) {
		boolean oldCurtainOpen = curtainOpen;
		curtainOpen = newCurtainOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__CURTAIN_OPEN, oldCurtainOpen, curtainOpen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__XPOSITION, oldXPosition, xPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__YPOSITION, oldYPosition, yPosition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__XDIMENSION, oldXDimension, xDimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__YDIMENSION, oldYDimension, yDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CURTAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.CURTAIN__POSTITION_AFTER_ROW:
				return getPostitionAfterRow();
			case CabinPackage.CURTAIN__CURTAIN_OPEN:
				return isCurtainOpen();
			case CabinPackage.CURTAIN__XPOSITION:
				return getXPosition();
			case CabinPackage.CURTAIN__YPOSITION:
				return getYPosition();
			case CabinPackage.CURTAIN__XDIMENSION:
				return getXDimension();
			case CabinPackage.CURTAIN__YDIMENSION:
				return getYDimension();
			case CabinPackage.CURTAIN__NAME:
				return getName();
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
			case CabinPackage.CURTAIN__POSTITION_AFTER_ROW:
				setPostitionAfterRow((Integer)newValue);
				return;
			case CabinPackage.CURTAIN__CURTAIN_OPEN:
				setCurtainOpen((Boolean)newValue);
				return;
			case CabinPackage.CURTAIN__XPOSITION:
				setXPosition((Double)newValue);
				return;
			case CabinPackage.CURTAIN__YPOSITION:
				setYPosition((Double)newValue);
				return;
			case CabinPackage.CURTAIN__XDIMENSION:
				setXDimension((Double)newValue);
				return;
			case CabinPackage.CURTAIN__YDIMENSION:
				setYDimension((Double)newValue);
				return;
			case CabinPackage.CURTAIN__NAME:
				setName((String)newValue);
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
			case CabinPackage.CURTAIN__POSTITION_AFTER_ROW:
				setPostitionAfterRow(POSTITION_AFTER_ROW_EDEFAULT);
				return;
			case CabinPackage.CURTAIN__CURTAIN_OPEN:
				setCurtainOpen(CURTAIN_OPEN_EDEFAULT);
				return;
			case CabinPackage.CURTAIN__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CabinPackage.CURTAIN__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
				return;
			case CabinPackage.CURTAIN__XDIMENSION:
				setXDimension(XDIMENSION_EDEFAULT);
				return;
			case CabinPackage.CURTAIN__YDIMENSION:
				setYDimension(YDIMENSION_EDEFAULT);
				return;
			case CabinPackage.CURTAIN__NAME:
				setName(NAME_EDEFAULT);
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
			case CabinPackage.CURTAIN__POSTITION_AFTER_ROW:
				return postitionAfterRow != POSTITION_AFTER_ROW_EDEFAULT;
			case CabinPackage.CURTAIN__CURTAIN_OPEN:
				return curtainOpen != CURTAIN_OPEN_EDEFAULT;
			case CabinPackage.CURTAIN__XPOSITION:
				return xPosition != XPOSITION_EDEFAULT;
			case CabinPackage.CURTAIN__YPOSITION:
				return yPosition != YPOSITION_EDEFAULT;
			case CabinPackage.CURTAIN__XDIMENSION:
				return xDimension != XDIMENSION_EDEFAULT;
			case CabinPackage.CURTAIN__YDIMENSION:
				return yDimension != YDIMENSION_EDEFAULT;
			case CabinPackage.CURTAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (postitionAfterRow: ");
		result.append(postitionAfterRow);
		result.append(", curtainOpen: ");
		result.append(curtainOpen);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", yPosition: ");
		result.append(yPosition);
		result.append(", xDimension: ");
		result.append(xDimension);
		result.append(", yDimension: ");
		result.append(yDimension);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CurtainImpl
