/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import toolspecific.DoubleConstraintBaseType;
import toolspecific.RelationalOperatorType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Constraint Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.DoubleConstraintBaseTypeImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleConstraintBaseTypeImpl extends DoubleBaseTypeImpl implements DoubleConstraintBaseType {
	/**
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperatorType RELATIONAL_OPERATOR_EDEFAULT = RelationalOperatorType.LT;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperatorType relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Relational Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationalOperatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleConstraintBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.DOUBLE_CONSTRAINT_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorType getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationalOperator(RelationalOperatorType newRelationalOperator) {
		RelationalOperatorType oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator == null ? RELATIONAL_OPERATOR_EDEFAULT : newRelationalOperator;
		boolean oldRelationalOperatorESet = relationalOperatorESet;
		relationalOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR, oldRelationalOperator,
					relationalOperator, !oldRelationalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationalOperator() {
		RelationalOperatorType oldRelationalOperator = relationalOperator;
		boolean oldRelationalOperatorESet = relationalOperatorESet;
		relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;
		relationalOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR, oldRelationalOperator,
					RELATIONAL_OPERATOR_EDEFAULT, oldRelationalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationalOperator() {
		return relationalOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			return getRelationalOperator();
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
		case ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			setRelationalOperator((RelationalOperatorType) newValue);
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
		case ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			unsetRelationalOperator();
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
		case ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			return isSetRelationalOperator();
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
		result.append(" (relationalOperator: ");
		if (relationalOperatorESet)
			result.append(relationalOperator);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DoubleConstraintBaseTypeImpl
