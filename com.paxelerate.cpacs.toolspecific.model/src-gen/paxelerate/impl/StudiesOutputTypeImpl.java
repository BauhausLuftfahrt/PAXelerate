/**
 */
package paxelerate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import paxelerate.PaxeleratePackage;
import paxelerate.StudiesOutputType;
import paxelerate.StudyOutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studies Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.StudiesOutputTypeImpl#getStudyOutput <em>Study Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudiesOutputTypeImpl extends MinimalEObjectImpl.Container implements StudiesOutputType {
	/**
	 * The cached value of the '{@link #getStudyOutput() <em>Study Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyOutputType> studyOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudiesOutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.STUDIES_OUTPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyOutputType> getStudyOutput() {
		if (studyOutput == null) {
			studyOutput = new EObjectContainmentEList<StudyOutputType>(StudyOutputType.class, this,
					PaxeleratePackage.STUDIES_OUTPUT_TYPE__STUDY_OUTPUT);
		}
		return studyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PaxeleratePackage.STUDIES_OUTPUT_TYPE__STUDY_OUTPUT:
			return ((InternalEList<?>) getStudyOutput()).basicRemove(otherEnd, msgs);
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
		case PaxeleratePackage.STUDIES_OUTPUT_TYPE__STUDY_OUTPUT:
			return getStudyOutput();
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
		case PaxeleratePackage.STUDIES_OUTPUT_TYPE__STUDY_OUTPUT:
			getStudyOutput().clear();
			getStudyOutput().addAll((Collection<? extends StudyOutputType>) newValue);
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
		case PaxeleratePackage.STUDIES_OUTPUT_TYPE__STUDY_OUTPUT:
			getStudyOutput().clear();
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
		case PaxeleratePackage.STUDIES_OUTPUT_TYPE__STUDY_OUTPUT:
			return studyOutput != null && !studyOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudiesOutputTypeImpl
