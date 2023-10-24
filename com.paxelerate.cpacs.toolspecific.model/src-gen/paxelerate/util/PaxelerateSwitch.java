/**
 */
package paxelerate.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import paxelerate.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage
 * @generated
 */
public class PaxelerateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaxeleratePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateSwitch() {
		if (modelPackage == null) {
			modelPackage = PaxeleratePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PaxeleratePackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.PAXELERATE_INPUT_TYPE: {
			PaxelerateInputType paxelerateInputType = (PaxelerateInputType) theEObject;
			T result = casePaxelerateInputType(paxelerateInputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.PAXELERATE_OUTPUT_TYPE: {
			PaxelerateOutputType paxelerateOutputType = (PaxelerateOutputType) theEObject;
			T result = casePaxelerateOutputType(paxelerateOutputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.PAXELERATE_SETTINGS_TYPE: {
			PaxelerateSettingsType paxelerateSettingsType = (PaxelerateSettingsType) theEObject;
			T result = casePaxelerateSettingsType(paxelerateSettingsType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.PAXELERATE_TYPE: {
			PaxelerateType paxelerateType = (PaxelerateType) theEObject;
			T result = casePaxelerateType(paxelerateType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.STUDIES_OUTPUT_TYPE: {
			StudiesOutputType studiesOutputType = (StudiesOutputType) theEObject;
			T result = caseStudiesOutputType(studiesOutputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.STUDIES_TYPE: {
			StudiesType studiesType = (StudiesType) theEObject;
			T result = caseStudiesType(studiesType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.STUDY_ITERATION_OUTPUT_TYPE: {
			StudyIterationOutputType studyIterationOutputType = (StudyIterationOutputType) theEObject;
			T result = caseStudyIterationOutputType(studyIterationOutputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.STUDY_ITERATIONS_OUTPUT_TYPE: {
			StudyIterationsOutputType studyIterationsOutputType = (StudyIterationsOutputType) theEObject;
			T result = caseStudyIterationsOutputType(studyIterationsOutputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.STUDY_OUTPUT_TYPE: {
			StudyOutputType studyOutputType = (StudyOutputType) theEObject;
			T result = caseStudyOutputType(studyOutputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PaxeleratePackage.STUDY_TYPE: {
			StudyType studyType = (StudyType) theEObject;
			T result = caseStudyType(studyType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxelerateInputType(PaxelerateInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxelerateOutputType(PaxelerateOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxelerateSettingsType(PaxelerateSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxelerateType(PaxelerateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Studies Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Studies Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudiesOutputType(StudiesOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Studies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Studies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudiesType(StudiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Iteration Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Iteration Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyIterationOutputType(StudyIterationOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Iterations Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Iterations Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyIterationsOutputType(StudyIterationsOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyOutputType(StudyOutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyType(StudyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PaxelerateSwitch
