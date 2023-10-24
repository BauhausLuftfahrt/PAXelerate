/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.PaxelerateInputType#getStudies <em>Studies</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getPaxelerateInputType()
 * @model extendedMetaData="name='paxelerateInputType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateInputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studies</em>' containment reference.
	 * @see #setStudies(StudiesType)
	 * @see paxelerate.PaxeleratePackage#getPaxelerateInputType_Studies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='studies' namespace='##targetNamespace'"
	 * @generated
	 */
	StudiesType getStudies();

	/**
	 * Sets the value of the '{@link paxelerate.PaxelerateInputType#getStudies <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studies</em>' containment reference.
	 * @see #getStudies()
	 * @generated
	 */
	void setStudies(StudiesType value);

} // PaxelerateInputType
