/**
 */
package com.paxelerate.model.settings;

import com.paxelerate.model.enums.SeatType;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.SortingScheme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.settings.Settings#getLuggageProperties <em>Luggage Properties</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getPassengerProperties <em>Passenger Properties</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getSimulationType <em>Simulation Type</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#isDisplaySimulation <em>Display Simulation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#isUseCenterLuggageStorage <em>Use Center Luggage Storage</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getSimulationGridResolution <em>Simulation Grid Resolution</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getBoardingConformanceRate <em>Boarding Conformance Rate</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.Settings#getNumberOfBoardingBlocks <em>Number Of Boarding Blocks</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.settings.SettingsPackage#getSettings()
 * @model
 * @generated
 */
public interface Settings extends EObject {
	/**
	 * Returns the value of the '<em><b>Luggage Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Properties</em>' containment reference.
	 * @see #setLuggageProperties(LuggageProperties)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_LuggageProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LuggageProperties getLuggageProperties();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getLuggageProperties <em>Luggage Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Properties</em>' containment reference.
	 * @see #getLuggageProperties()
	 * @generated
	 */
	void setLuggageProperties(LuggageProperties value);

	/**
	 * Returns the value of the '<em><b>Passenger Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Properties</em>' containment reference.
	 * @see #setPassengerProperties(PassengerProperties)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_PassengerProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PassengerProperties getPassengerProperties();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getPassengerProperties <em>Passenger Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Properties</em>' containment reference.
	 * @see #getPassengerProperties()
	 * @generated
	 */
	void setPassengerProperties(PassengerProperties value);

	/**
	 * Returns the value of the '<em><b>Simulation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.SimulationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SimulationType
	 * @see #setSimulationType(SimulationType)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_SimulationType()
	 * @model
	 * @generated
	 */
	SimulationType getSimulationType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getSimulationType <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SimulationType
	 * @see #getSimulationType()
	 * @generated
	 */
	void setSimulationType(SimulationType value);

	/**
	 * Returns the value of the '<em><b>Display Simulation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Simulation</em>' attribute.
	 * @see #setDisplaySimulation(boolean)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_DisplaySimulation()
	 * @model default="true"
	 * @generated
	 */
	boolean isDisplaySimulation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#isDisplaySimulation <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Simulation</em>' attribute.
	 * @see #isDisplaySimulation()
	 * @generated
	 */
	void setDisplaySimulation(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Center Luggage Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Center Luggage Storage</em>' attribute.
	 * @see #setUseCenterLuggageStorage(boolean)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_UseCenterLuggageStorage()
	 * @model
	 * @generated
	 */
	boolean isUseCenterLuggageStorage();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#isUseCenterLuggageStorage <em>Use Center Luggage Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Center Luggage Storage</em>' attribute.
	 * @see #isUseCenterLuggageStorage()
	 * @generated
	 */
	void setUseCenterLuggageStorage(boolean value);

	/**
	 * Returns the value of the '<em><b>Seat Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.SeatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatType
	 * @see #setSeatType(SeatType)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_SeatType()
	 * @model required="true"
	 * @generated
	 */
	SeatType getSeatType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getSeatType <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatType
	 * @see #getSeatType()
	 * @generated
	 */
	void setSeatType(SeatType value);

	/**
	 * Returns the value of the '<em><b>Simulation Grid Resolution</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Grid Resolution</em>' attribute.
	 * @see #setSimulationGridResolution(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_SimulationGridResolution()
	 * @model default="0.1"
	 * @generated
	 */
	double getSimulationGridResolution();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getSimulationGridResolution <em>Simulation Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Grid Resolution</em>' attribute.
	 * @see #getSimulationGridResolution()
	 * @generated
	 */
	void setSimulationGridResolution(double value);

	/**
	 * Returns the value of the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #setSimulationSpeedFactor(int)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_SimulationSpeedFactor()
	 * @model default="5"
	 * @generated
	 */
	int getSimulationSpeedFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 */
	void setSimulationSpeedFactor(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Sorting Scheme</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.SortingScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Sorting Scheme</em>' attribute.
	 * @see com.paxelerate.model.enums.SortingScheme
	 * @see #setPassengerSortingScheme(SortingScheme)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_PassengerSortingScheme()
	 * @model
	 * @generated
	 */
	SortingScheme getPassengerSortingScheme();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Sorting Scheme</em>' attribute.
	 * @see com.paxelerate.model.enums.SortingScheme
	 * @see #getPassengerSortingScheme()
	 * @generated
	 */
	void setPassengerSortingScheme(SortingScheme value);

	/**
	 * Returns the value of the '<em><b>Thread Sleep Time Default</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Sleep Time Default</em>' attribute.
	 * @see #setThreadSleepTimeDefault(int)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_ThreadSleepTimeDefault()
	 * @model default="10"
	 * @generated
	 */
	int getThreadSleepTimeDefault();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Sleep Time Default</em>' attribute.
	 * @see #getThreadSleepTimeDefault()
	 * @generated
	 */
	void setThreadSleepTimeDefault(int value);

	/**
	 * Returns the value of the '<em><b>Sideways Foldabe Seat Popup Time Mean</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sideways Foldabe Seat Popup Time Mean</em>' attribute.
	 * @see #setSidewaysFoldabeSeatPopupTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_SidewaysFoldabeSeatPopupTimeMean()
	 * @model default="5"
	 * @generated
	 */
	double getSidewaysFoldabeSeatPopupTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sideways Foldabe Seat Popup Time Mean</em>' attribute.
	 * @see #getSidewaysFoldabeSeatPopupTimeMean()
	 * @generated
	 */
	void setSidewaysFoldabeSeatPopupTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Sideways Foldabe Seat Popup Time Deviation</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sideways Foldabe Seat Popup Time Deviation</em>' attribute.
	 * @see #setSidewaysFoldabeSeatPopupTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_SidewaysFoldabeSeatPopupTimeDeviation()
	 * @model default="1"
	 * @generated
	 */
	double getSidewaysFoldabeSeatPopupTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sideways Foldabe Seat Popup Time Deviation</em>' attribute.
	 * @see #getSidewaysFoldabeSeatPopupTimeDeviation()
	 * @generated
	 */
	void setSidewaysFoldabeSeatPopupTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Lifting Seat Pan Popup Time Mean</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifting Seat Pan Popup Time Mean</em>' attribute.
	 * @see #setLiftingSeatPanPopupTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_LiftingSeatPanPopupTimeMean()
	 * @model default="2"
	 * @generated
	 */
	double getLiftingSeatPanPopupTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifting Seat Pan Popup Time Mean</em>' attribute.
	 * @see #getLiftingSeatPanPopupTimeMean()
	 * @generated
	 */
	void setLiftingSeatPanPopupTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Lifting Seat Pan Popup Time Deviation</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifting Seat Pan Popup Time Deviation</em>' attribute.
	 * @see #setLiftingSeatPanPopupTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_LiftingSeatPanPopupTimeDeviation()
	 * @model default="0.5"
	 * @generated
	 */
	double getLiftingSeatPanPopupTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifting Seat Pan Popup Time Deviation</em>' attribute.
	 * @see #getLiftingSeatPanPopupTimeDeviation()
	 * @generated
	 */
	void setLiftingSeatPanPopupTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Boarding Conformance Rate</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Conformance Rate</em>' attribute.
	 * @see #setBoardingConformanceRate(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_BoardingConformanceRate()
	 * @model default="1"
	 * @generated
	 */
	double getBoardingConformanceRate();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getBoardingConformanceRate <em>Boarding Conformance Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Conformance Rate</em>' attribute.
	 * @see #getBoardingConformanceRate()
	 * @generated
	 */
	void setBoardingConformanceRate(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Boarding Blocks</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Boarding Blocks</em>' attribute.
	 * @see #setNumberOfBoardingBlocks(int)
	 * @see com.paxelerate.model.settings.SettingsPackage#getSettings_NumberOfBoardingBlocks()
	 * @model default="4"
	 * @generated
	 */
	int getNumberOfBoardingBlocks();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.Settings#getNumberOfBoardingBlocks <em>Number Of Boarding Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Boarding Blocks</em>' attribute.
	 * @see #getNumberOfBoardingBlocks()
	 * @generated
	 */
	void setNumberOfBoardingBlocks(int value);

} // Settings
