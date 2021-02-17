/**
 */
package com.paxelerate.model.settings.impl;

import com.paxelerate.model.settings.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SettingsFactoryImpl extends EFactoryImpl implements SettingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SettingsFactory init() {
		try {
			SettingsFactory theSettingsFactory = (SettingsFactory) EPackage.Registry.INSTANCE
					.getEFactory(SettingsPackage.eNS_URI);
			if (theSettingsFactory != null) {
				return theSettingsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SettingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SettingsPackage.SETTINGS:
			return createSettings();
		case SettingsPackage.LUGGAGE_PROPERTIES:
			return createLuggageProperties();
		case SettingsPackage.PASSENGER_PROPERTIES:
			return createPassengerProperties();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings createSettings() {
		SettingsImpl settings = new SettingsImpl();
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageProperties createLuggageProperties() {
		LuggagePropertiesImpl luggageProperties = new LuggagePropertiesImpl();
		return luggageProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerProperties createPassengerProperties() {
		PassengerPropertiesImpl passengerProperties = new PassengerPropertiesImpl();
		return passengerProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsPackage getSettingsPackage() {
		return (SettingsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SettingsPackage getPackage() {
		return SettingsPackage.eINSTANCE;
	}

} //SettingsFactoryImpl
