/**
 */
package com.paxelerate.model;

import com.paxelerate.model.settings.Settings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.Model#getDeck <em>Deck</em>}</li>
 *   <li>{@link com.paxelerate.model.Model#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.Model#getSettings <em>Settings</em>}</li>
 *   <li>{@link com.paxelerate.model.Model#getSimulationResults <em>Simulation Results</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.ModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck</em>' containment reference.
	 * @see #setDeck(Deck)
	 * @see com.paxelerate.model.ModelPackage#getModel_Deck()
	 * @model containment="true"
	 * @generated
	 */
	Deck getDeck();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Model#getDeck <em>Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck</em>' containment reference.
	 * @see #getDeck()
	 * @generated
	 */
	void setDeck(Deck value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.paxelerate.model.ModelPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(Settings)
	 * @see com.paxelerate.model.ModelPackage#getModel_Settings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Settings getSettings();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Model#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(Settings value);

	/**
	 * Returns the value of the '<em><b>Simulation Results</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.SimulationResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Results</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getModel_SimulationResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimulationResult> getSimulationResults();

} // Model
