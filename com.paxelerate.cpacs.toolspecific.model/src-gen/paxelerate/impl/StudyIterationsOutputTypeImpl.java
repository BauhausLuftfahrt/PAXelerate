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
import paxelerate.StudyIterationOutputType;
import paxelerate.StudyIterationsOutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Iterations Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.StudyIterationsOutputTypeImpl#getStudyIterationOutput <em>Study Iteration Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyIterationsOutputTypeImpl extends MinimalEObjectImpl.Container implements StudyIterationsOutputType {
	/**
	 * The cached value of the '{@link #getStudyIterationOutput() <em>Study Iteration Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyIterationOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyIterationOutputType> studyIterationOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyIterationsOutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.STUDY_ITERATIONS_OUTPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyIterationOutputType> getStudyIterationOutput() {
		if (studyIterationOutput == null) {
			studyIterationOutput = new EObjectContainmentEList<StudyIterationOutputType>(StudyIterationOutputType.class,
					this, PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT);
		}
		return studyIterationOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT:
			return ((InternalEList<?>) getStudyIterationOutput()).basicRemove(otherEnd, msgs);
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
		case PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT:
			return getStudyIterationOutput();
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
		case PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT:
			getStudyIterationOutput().clear();
			getStudyIterationOutput().addAll((Collection<? extends StudyIterationOutputType>) newValue);
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
		case PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT:
			getStudyIterationOutput().clear();
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
		case PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT:
			return studyIterationOutput != null && !studyIterationOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudyIterationsOutputTypeImpl
