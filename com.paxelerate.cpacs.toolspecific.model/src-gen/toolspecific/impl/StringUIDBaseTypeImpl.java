/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import toolspecific.StringUIDBaseType;
import toolspecific.SymmetryType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String UID Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.StringUIDBaseTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link toolspecific.impl.StringUIDBaseTypeImpl#getIsLink <em>Is Link</em>}</li>
 *   <li>{@link toolspecific.impl.StringUIDBaseTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringUIDBaseTypeImpl extends MinimalEObjectImpl.Container implements StringUIDBaseType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLink() <em>Is Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLink()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_LINK_EDEFAULT = "True";

	/**
	 * The cached value of the '{@link #getIsLink() <em>Is Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLink()
	 * @generated
	 * @ordered
	 */
	protected String isLink = IS_LINK_EDEFAULT;

	/**
	 * This is true if the Is Link attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isLinkESet;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryType SYMMETRY_EDEFAULT = SymmetryType.DEF;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringUIDBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.STRING_UID_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_UID_BASE_TYPE__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsLink() {
		return isLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLink(String newIsLink) {
		String oldIsLink = isLink;
		isLink = newIsLink;
		boolean oldIsLinkESet = isLinkESet;
		isLinkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_UID_BASE_TYPE__IS_LINK,
					oldIsLink, isLink, !oldIsLinkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsLink() {
		String oldIsLink = isLink;
		boolean oldIsLinkESet = isLinkESet;
		isLink = IS_LINK_EDEFAULT;
		isLinkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.STRING_UID_BASE_TYPE__IS_LINK,
					oldIsLink, IS_LINK_EDEFAULT, oldIsLinkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsLink() {
		return isLinkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymmetry(SymmetryType newSymmetry) {
		SymmetryType oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_UID_BASE_TYPE__SYMMETRY,
					oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSymmetry() {
		SymmetryType oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.STRING_UID_BASE_TYPE__SYMMETRY,
					oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSymmetry() {
		return symmetryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.STRING_UID_BASE_TYPE__VALUE:
			return getValue();
		case ToolspecificPackage.STRING_UID_BASE_TYPE__IS_LINK:
			return getIsLink();
		case ToolspecificPackage.STRING_UID_BASE_TYPE__SYMMETRY:
			return getSymmetry();
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
		case ToolspecificPackage.STRING_UID_BASE_TYPE__VALUE:
			setValue((String) newValue);
			return;
		case ToolspecificPackage.STRING_UID_BASE_TYPE__IS_LINK:
			setIsLink((String) newValue);
			return;
		case ToolspecificPackage.STRING_UID_BASE_TYPE__SYMMETRY:
			setSymmetry((SymmetryType) newValue);
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
		case ToolspecificPackage.STRING_UID_BASE_TYPE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_UID_BASE_TYPE__IS_LINK:
			unsetIsLink();
			return;
		case ToolspecificPackage.STRING_UID_BASE_TYPE__SYMMETRY:
			unsetSymmetry();
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
		case ToolspecificPackage.STRING_UID_BASE_TYPE__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ToolspecificPackage.STRING_UID_BASE_TYPE__IS_LINK:
			return isSetIsLink();
		case ToolspecificPackage.STRING_UID_BASE_TYPE__SYMMETRY:
			return isSetSymmetry();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", isLink: ");
		if (isLinkESet)
			result.append(isLink);
		else
			result.append("<unset>");
		result.append(", symmetry: ");
		if (symmetryESet)
			result.append(symmetry);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StringUIDBaseTypeImpl
