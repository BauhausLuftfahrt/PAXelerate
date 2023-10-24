/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.PaxelerateSettingsType#isDisplaySimulation <em>Display Simulation</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getPaxelerateSettingsType()
 * @model extendedMetaData="name='paxelerateSettingsType' kind='elementOnly'"
 * @generated
 */
public interface PaxelerateSettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Simulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Simulation</em>' attribute.
	 * @see #isSetDisplaySimulation()
	 * @see #unsetDisplaySimulation()
	 * @see #setDisplaySimulation(boolean)
	 * @see paxelerate.PaxeleratePackage#getPaxelerateSettingsType_DisplaySimulation()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='displaySimulation' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDisplaySimulation();

	/**
	 * Sets the value of the '{@link paxelerate.PaxelerateSettingsType#isDisplaySimulation <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Simulation</em>' attribute.
	 * @see #isSetDisplaySimulation()
	 * @see #unsetDisplaySimulation()
	 * @see #isDisplaySimulation()
	 * @generated
	 */
	void setDisplaySimulation(boolean value);

	/**
	 * Unsets the value of the '{@link paxelerate.PaxelerateSettingsType#isDisplaySimulation <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplaySimulation()
	 * @see #isDisplaySimulation()
	 * @see #setDisplaySimulation(boolean)
	 * @generated
	 */
	void unsetDisplaySimulation();

	/**
	 * Returns whether the value of the '{@link paxelerate.PaxelerateSettingsType#isDisplaySimulation <em>Display Simulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Simulation</em>' attribute is set.
	 * @see #unsetDisplaySimulation()
	 * @see #isDisplaySimulation()
	 * @see #setDisplaySimulation(boolean)
	 * @generated
	 */
	boolean isSetDisplaySimulation();

} // PaxelerateSettingsType
