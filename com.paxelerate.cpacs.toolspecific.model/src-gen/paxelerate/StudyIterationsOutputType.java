/**
 */
package paxelerate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Iterations Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.StudyIterationsOutputType#getStudyIterationOutput <em>Study Iteration Output</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getStudyIterationsOutputType()
 * @model extendedMetaData="name='studyIterationsOutputType' kind='elementOnly'"
 * @generated
 */
public interface StudyIterationsOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Iteration Output</b></em>' containment reference list.
	 * The list contents are of type {@link paxelerate.StudyIterationOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Iteration Output</em>' containment reference list.
	 * @see paxelerate.PaxeleratePackage#getStudyIterationsOutputType_StudyIterationOutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='studyIterationOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StudyIterationOutputType> getStudyIterationOutput();

} // StudyIterationsOutputType
