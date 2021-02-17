/**
 */
package com.paxelerate.model.settings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.settings.SettingsPackage
 * @generated
 */
public interface SettingsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SettingsFactory eINSTANCE = com.paxelerate.model.settings.impl.SettingsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings</em>'.
	 * @generated
	 */
	Settings createSettings();

	/**
	 * Returns a new object of class '<em>Luggage Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Luggage Properties</em>'.
	 * @generated
	 */
	LuggageProperties createLuggageProperties();

	/**
	 * Returns a new object of class '<em>Passenger Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Properties</em>'.
	 * @generated
	 */
	PassengerProperties createPassengerProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SettingsPackage getSettingsPackage();

} //SettingsFactory
