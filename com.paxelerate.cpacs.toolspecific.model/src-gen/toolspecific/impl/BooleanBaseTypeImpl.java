/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import toolspecific.BooleanBaseType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.BooleanBaseTypeImpl#isValue <em>Value</em>}</li>
 *   <li>{@link toolspecific.impl.BooleanBaseTypeImpl#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link toolspecific.impl.BooleanBaseTypeImpl#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link toolspecific.impl.BooleanBaseTypeImpl#getExternalFileName <em>External File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanBaseTypeImpl extends MinimalEObjectImpl.Container implements BooleanBaseType {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getExternalDataDirectory() <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DATA_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDataDirectory() <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected String externalDataDirectory = EXTERNAL_DATA_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDataNodePath() <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataNodePath()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DATA_NODE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDataNodePath() <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataNodePath()
	 * @generated
	 * @ordered
	 */
	protected String externalDataNodePath = EXTERNAL_DATA_NODE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalFileName() <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalFileName() <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileName()
	 * @generated
	 * @ordered
	 */
	protected String externalFileName = EXTERNAL_FILE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.BOOLEAN_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.BOOLEAN_BASE_TYPE__VALUE,
					oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		boolean oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.BOOLEAN_BASE_TYPE__VALUE,
					oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDataDirectory() {
		return externalDataDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDataDirectory(String newExternalDataDirectory) {
		String oldExternalDataDirectory = externalDataDirectory;
		externalDataDirectory = newExternalDataDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY, oldExternalDataDirectory,
					externalDataDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDataNodePath() {
		return externalDataNodePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDataNodePath(String newExternalDataNodePath) {
		String oldExternalDataNodePath = externalDataNodePath;
		externalDataNodePath = newExternalDataNodePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH, oldExternalDataNodePath,
					externalDataNodePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalFileName() {
		return externalFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalFileName(String newExternalFileName) {
		String oldExternalFileName = externalFileName;
		externalFileName = newExternalFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME, oldExternalFileName, externalFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__VALUE:
			return isValue();
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			return getExternalDataDirectory();
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			return getExternalDataNodePath();
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME:
			return getExternalFileName();
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
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__VALUE:
			setValue((Boolean) newValue);
			return;
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			setExternalDataDirectory((String) newValue);
			return;
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			setExternalDataNodePath((String) newValue);
			return;
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME:
			setExternalFileName((String) newValue);
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
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__VALUE:
			unsetValue();
			return;
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			setExternalDataDirectory(EXTERNAL_DATA_DIRECTORY_EDEFAULT);
			return;
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			setExternalDataNodePath(EXTERNAL_DATA_NODE_PATH_EDEFAULT);
			return;
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME:
			setExternalFileName(EXTERNAL_FILE_NAME_EDEFAULT);
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
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__VALUE:
			return isSetValue();
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			return EXTERNAL_DATA_DIRECTORY_EDEFAULT == null ? externalDataDirectory != null
					: !EXTERNAL_DATA_DIRECTORY_EDEFAULT.equals(externalDataDirectory);
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			return EXTERNAL_DATA_NODE_PATH_EDEFAULT == null ? externalDataNodePath != null
					: !EXTERNAL_DATA_NODE_PATH_EDEFAULT.equals(externalDataNodePath);
		case ToolspecificPackage.BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME:
			return EXTERNAL_FILE_NAME_EDEFAULT == null ? externalFileName != null
					: !EXTERNAL_FILE_NAME_EDEFAULT.equals(externalFileName);
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
		if (valueESet)
			result.append(value);
		else
			result.append("<unset>");
		result.append(", externalDataDirectory: ");
		result.append(externalDataDirectory);
		result.append(", externalDataNodePath: ");
		result.append(externalDataNodePath);
		result.append(", externalFileName: ");
		result.append(externalFileName);
		result.append(')');
		return result.toString();
	}

} //BooleanBaseTypeImpl
