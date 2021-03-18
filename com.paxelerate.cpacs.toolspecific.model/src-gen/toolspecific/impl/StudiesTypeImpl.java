/**
 */
package toolspecific.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import toolspecific.StudiesType;
import toolspecific.StudyType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.StudiesTypeImpl#getStudy <em>Study</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudiesTypeImpl extends ComplexBaseTypeImpl implements StudiesType {
	/**
	 * The cached value of the '{@link #getStudy() <em>Study</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudy()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyType> study;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.STUDIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyType> getStudy() {
		if (study == null) {
			study = new EObjectContainmentEList<StudyType>(StudyType.class, this,
					ToolspecificPackage.STUDIES_TYPE__STUDY);
		}
		return study;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToolspecificPackage.STUDIES_TYPE__STUDY:
			return ((InternalEList<?>) getStudy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.STUDIES_TYPE__STUDY:
			return getStudy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ToolspecificPackage.STUDIES_TYPE__STUDY:
			getStudy().clear();
			getStudy().addAll((Collection<? extends StudyType>) newValue);
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
		case ToolspecificPackage.STUDIES_TYPE__STUDY:
			getStudy().clear();
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
		case ToolspecificPackage.STUDIES_TYPE__STUDY:
			return study != null && !study.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudiesTypeImpl
