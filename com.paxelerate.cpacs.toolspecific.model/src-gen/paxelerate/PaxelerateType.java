/**
 */
package paxelerate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.PaxelerateType#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getPaxelerateType()
 * @model extendedMetaData="name='paxelerateType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(PaxelerateInputType)
	 * @see paxelerate.PaxeleratePackage#getPaxelerateType_Input()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	PaxelerateInputType getInput();

	/**
	 * Sets the value of the '{@link paxelerate.PaxelerateType#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(PaxelerateInputType value);

} // PaxelerateType
