/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link paxelerate.PaxelerateType#getOutput <em>Output</em>}</li>
 *   <li>{@link paxelerate.PaxelerateType#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getPaxelerateType()
 * @model extendedMetaData="name='paxelerateType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateType extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(PaxelerateOutputType)
	 * @see paxelerate.PaxeleratePackage#getPaxelerateType_Output()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	PaxelerateOutputType getOutput();

	/**
	 * Sets the value of the '{@link paxelerate.PaxelerateType#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(PaxelerateOutputType value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(PaxelerateSettingsType)
	 * @see paxelerate.PaxeleratePackage#getPaxelerateType_Settings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='settings' namespace='##targetNamespace'"
	 * @generated
	 */
	PaxelerateSettingsType getSettings();

	/**
	 * Sets the value of the '{@link paxelerate.PaxelerateType#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(PaxelerateSettingsType value);

} // PaxelerateType
