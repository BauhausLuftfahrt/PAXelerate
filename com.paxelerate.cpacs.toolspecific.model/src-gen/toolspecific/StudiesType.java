/**
 */
package toolspecific;

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
 *   <li>{@link toolspecific.StudiesType#getStudy <em>Study</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getStudiesType()
 * @model extendedMetaData="name='studiesType' kind='elementOnly'"
 * @generated
 */
public interface StudiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Study</b></em>' containment reference list.
	 * The list contents are of type {@link toolspecific.StudyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study</em>' containment reference list.
	 * @see toolspecific.ToolspecificPackage#getStudiesType_Study()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='study' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StudyType> getStudy();

} // StudiesType
