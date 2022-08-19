/**
 */
package paxelerate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.StudiesType#getStudy <em>Study</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getStudiesType()
 * @model extendedMetaData="name='studiesType' kind='elementOnly'"
 * @generated
 */
public interface StudiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link paxelerate.StudyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see paxelerate.PaxeleratePackage#getStudiesType_Study()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StudyType> getStudy();

} // StudiesType
