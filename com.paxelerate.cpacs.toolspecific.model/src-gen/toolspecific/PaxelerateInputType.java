/**
 */
package toolspecific;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paxelerate Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.PaxelerateInputType#getStudies <em>Studies</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType()
 * @model extendedMetaData="name='paxelerateInputType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateInputType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studies</em>' containment reference.
	 * @see #setStudies(StudiesType)
	 * @see toolspecific.ToolspecificPackage#getPaxelerateInputType_Studies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='studies' namespace='##targetNamespace'"
	 * @generated
	 */
	StudiesType getStudies();

	/**
	 * Sets the value of the '{@link toolspecific.PaxelerateInputType#getStudies <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studies</em>' containment reference.
	 * @see #getStudies()
	 * @generated
	 */
	void setStudies(StudiesType value);

} // PaxelerateInputType
