/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.PaxelerateOutputType#getStudiesOutput <em>Studies Output</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getPaxelerateOutputType()
 * @model extendedMetaData="name='paxelerateOutputType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Studies Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studies Output</em>' containment reference.
	 * @see #setStudiesOutput(StudiesOutputType)
	 * @see paxelerate.PaxeleratePackage#getPaxelerateOutputType_StudiesOutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='studiesOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	StudiesOutputType getStudiesOutput();

	/**
	 * Sets the value of the '{@link paxelerate.PaxelerateOutputType#getStudiesOutput <em>Studies Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studies Output</em>' containment reference.
	 * @see #getStudiesOutput()
	 * @generated
	 */
	void setStudiesOutput(StudiesOutputType value);

} // PaxelerateOutputType
