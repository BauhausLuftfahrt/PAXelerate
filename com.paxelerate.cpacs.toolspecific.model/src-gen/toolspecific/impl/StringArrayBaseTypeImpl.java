/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import toolspecific.StringArrayBaseType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Array Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.StringArrayBaseTypeImpl#getMapType <em>Map Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringArrayBaseTypeImpl extends StringBaseTypeImpl implements StringArrayBaseType {
	/**
	 * The default value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_TYPE_EDEFAULT = "array";

	/**
	 * The cached value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected String mapType = MAP_TYPE_EDEFAULT;

	/**
	 * This is true if the Map Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mapTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringArrayBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.STRING_ARRAY_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapType() {
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType(String newMapType) {
		String oldMapType = mapType;
		mapType = newMapType;
		boolean oldMapTypeESet = mapTypeESet;
		mapTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_ARRAY_BASE_TYPE__MAP_TYPE,
					oldMapType, mapType, !oldMapTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMapType() {
		String oldMapType = mapType;
		boolean oldMapTypeESet = mapTypeESet;
		mapType = MAP_TYPE_EDEFAULT;
		mapTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					ToolspecificPackage.STRING_ARRAY_BASE_TYPE__MAP_TYPE, oldMapType, MAP_TYPE_EDEFAULT,
					oldMapTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMapType() {
		return mapTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.STRING_ARRAY_BASE_TYPE__MAP_TYPE:
			return getMapType();
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
		case ToolspecificPackage.STRING_ARRAY_BASE_TYPE__MAP_TYPE:
			setMapType((String) newValue);
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
		case ToolspecificPackage.STRING_ARRAY_BASE_TYPE__MAP_TYPE:
			unsetMapType();
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
		case ToolspecificPackage.STRING_ARRAY_BASE_TYPE__MAP_TYPE:
			return isSetMapType();
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
		result.append(" (mapType: ");
		if (mapTypeESet)
			result.append(mapType);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StringArrayBaseTypeImpl
