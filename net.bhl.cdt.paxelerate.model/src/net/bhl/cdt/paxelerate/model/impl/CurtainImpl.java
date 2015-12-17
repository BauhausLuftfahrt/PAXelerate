/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.Curtain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curtain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CurtainImpl#getPostitionAfterRow <em>Postition After Row</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CurtainImpl#isCurtainOpen <em>Curtain Open</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurtainImpl extends PhysicalObjectImpl implements Curtain {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.CURTAIN__POSTITION_AFTER_ROW:
				return getPostitionAfterRow();
			case CabinPackage.CURTAIN__CURTAIN_OPEN:
				return isCurtainOpen();
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
		result.append(')');
		return result.toString();
	}

} //CurtainImpl
