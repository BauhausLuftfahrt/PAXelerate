/**
 */
package paxelerate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studies Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.StudiesOutputType#getStudyOutput <em>Study Output</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getStudiesOutputType()
 * @model extendedMetaData="name='studiesOutputType' kind='elementOnly'"
 * @generated
 */
public interface StudiesOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Output</b></em>' containment reference list.
	 * The list contents are of type {@link paxelerate.StudyOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Output</em>' containment reference list.
	 * @see paxelerate.PaxeleratePackage#getStudiesOutputType_StudyOutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='studyOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StudyOutputType> getStudyOutput();

} // StudiesOutputType
