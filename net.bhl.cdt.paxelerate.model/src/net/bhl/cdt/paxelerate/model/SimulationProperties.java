/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getResults <em>Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageProperties <em>Luggage Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerProperties <em>Passenger Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLayoutConcept <em>Layout Concept</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getScale <em>Scale</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isUsePresetSettings <em>Use Preset Settings</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSimulateWithoutUI <em>Simulate Without UI</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDeveloperMode <em>Developer Mode</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDataExport <em>Data Export</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDisplayMap <em>Display Map</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSortPassengerBetweenLoops <em>Sort Passenger Between Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSorting <em>Sorting</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties()
 * @model
 * @generated
 */
public interface SimulationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_Scale()
	 * @model default="10"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Use Preset Settings</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Preset Settings</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Preset Settings</em>' attribute.
	 * @see #setUsePresetSettings(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_UsePresetSettings()
	 * @model default="false"
	 * @generated
	 */
	boolean isUsePresetSettings();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isUsePresetSettings <em>Use Preset Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Preset Settings</em>' attribute.
	 * @see #isUsePresetSettings()
	 * @generated
	 */
	void setUsePresetSettings(boolean value);

	/**
	 * Returns the value of the '<em><b>Simulate Without UI</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulate Without UI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulate Without UI</em>' attribute.
	 * @see #setSimulateWithoutUI(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_SimulateWithoutUI()
	 * @model default="false"
	 * @generated
	 */
	boolean isSimulateWithoutUI();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSimulateWithoutUI <em>Simulate Without UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulate Without UI</em>' attribute.
	 * @see #isSimulateWithoutUI()
	 * @generated
	 */
	void setSimulateWithoutUI(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Simulation Loops</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Simulation Loops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Simulation Loops</em>' attribute.
	 * @see #setNumberOfSimulationLoops(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_NumberOfSimulationLoops()
	 * @model default="10"
	 * @generated
	 */
	int getNumberOfSimulationLoops();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Simulation Loops</em>' attribute.
	 * @see #getNumberOfSimulationLoops()
	 * @generated
	 */
	void setNumberOfSimulationLoops(int value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.paxelerate.model.SimulationResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_Results()
	 * @model
	 * @generated
	 */
	EList<SimulationResult> getResults();

	/**
	 * Returns the value of the '<em><b>Sorting</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.paxelerate.model.SortingStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.SortingStyle
	 * @see #setSorting(SortingStyle)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_Sorting()
	 * @model
	 * @generated
	 */
	SortingStyle getSorting();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSorting <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.SortingStyle
	 * @see #getSorting()
	 * @generated
	 */
	void setSorting(SortingStyle value);

	/**
	 * Returns the value of the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #setSimulationSpeedFactor(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_SimulationSpeedFactor()
	 * @model default="5"
	 * @generated
	 */
	int getSimulationSpeedFactor();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 */
	void setSimulationSpeedFactor(int value);

	/**
	 * Returns the value of the '<em><b>Thread Sleep Time Default</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Sleep Time Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Sleep Time Default</em>' attribute.
	 * @see #setThreadSleepTimeDefault(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_ThreadSleepTimeDefault()
	 * @model default="10"
	 * @generated
	 */
	int getThreadSleepTimeDefault();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Sleep Time Default</em>' attribute.
	 * @see #getThreadSleepTimeDefault()
	 * @generated
	 */
	void setThreadSleepTimeDefault(int value);

	/**
	 * Returns the value of the '<em><b>Developer Mode</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developer Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developer Mode</em>' attribute.
	 * @see #setDeveloperMode(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_DeveloperMode()
	 * @model default="true"
	 * @generated
	 */
	boolean isDeveloperMode();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDeveloperMode <em>Developer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developer Mode</em>' attribute.
	 * @see #isDeveloperMode()
	 * @generated
	 */
	void setDeveloperMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Sort Passenger Between Loops</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Passenger Between Loops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Passenger Between Loops</em>' attribute.
	 * @see #setSortPassengerBetweenLoops(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_SortPassengerBetweenLoops()
	 * @model default="true"
	 * @generated
	 */
	boolean isSortPassengerBetweenLoops();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSortPassengerBetweenLoops <em>Sort Passenger Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Passenger Between Loops</em>' attribute.
	 * @see #isSortPassengerBetweenLoops()
	 * @generated
	 */
	void setSortPassengerBetweenLoops(boolean value);

	/**
	 * Returns the value of the '<em><b>Luggage Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luggage Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Properties</em>' containment reference.
	 * @see #setLuggageProperties(LuggageProperties)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_LuggageProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LuggageProperties getLuggageProperties();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageProperties <em>Luggage Properties</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Passenger Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Properties</em>' containment reference.
	 * @see #setPassengerProperties(PassengerProperties)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PassengerProperties getPassengerProperties();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerProperties <em>Passenger Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Properties</em>' containment reference.
	 * @see #getPassengerProperties()
	 * @generated
	 */
	void setPassengerProperties(PassengerProperties value);

	/**
	 * Returns the value of the '<em><b>Passengers Boarding Per Minute</b></em>' attribute.
	 * The default value is <code>"18"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passengers Boarding Per Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers Boarding Per Minute</em>' attribute.
	 * @see #setPassengersBoardingPerMinute(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengersBoardingPerMinute()
	 * @model default="18" required="true"
	 * @generated
	 */
	double getPassengersBoardingPerMinute();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passengers Boarding Per Minute</em>' attribute.
	 * @see #getPassengersBoardingPerMinute()
	 * @generated
	 */
	void setPassengersBoardingPerMinute(double value);

	/**
	 * Returns the value of the '<em><b>Data Export</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Export</em>' attribute.
	 * @see #setDataExport(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_DataExport()
	 * @model default="true"
	 * @generated
	 */
	boolean isDataExport();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDataExport <em>Data Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Export</em>' attribute.
	 * @see #isDataExport()
	 * @generated
	 */
	void setDataExport(boolean value);

	/**
	 * Returns the value of the '<em><b>Display Map</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Map</em>' attribute.
	 * @see #setDisplayMap(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_DisplayMap()
	 * @model default="false"
	 * @generated
	 */
	boolean isDisplayMap();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDisplayMap <em>Display Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Map</em>' attribute.
	 * @see #isDisplayMap()
	 * @generated
	 */
	void setDisplayMap(boolean value);

	/**
	 * Returns the value of the '<em><b>Sideways Foldabe Seat Popup Time Mean</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sideways Foldabe Seat Popup Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sideways Foldabe Seat Popup Time Mean</em>' attribute.
	 * @see #setSidewaysFoldabeSeatPopupTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_SidewaysFoldabeSeatPopupTimeMean()
	 * @model default="5"
	 * @generated
	 */
	double getSidewaysFoldabeSeatPopupTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Sideways Foldabe Seat Popup Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sideways Foldabe Seat Popup Time Deviation</em>' attribute.
	 * @see #setSidewaysFoldabeSeatPopupTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_SidewaysFoldabeSeatPopupTimeDeviation()
	 * @model default="1"
	 * @generated
	 */
	double getSidewaysFoldabeSeatPopupTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Lifting Seat Pan Popup Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifting Seat Pan Popup Time Mean</em>' attribute.
	 * @see #setLiftingSeatPanPopupTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_LiftingSeatPanPopupTimeMean()
	 * @model default="2"
	 * @generated
	 */
	double getLiftingSeatPanPopupTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Lifting Seat Pan Popup Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifting Seat Pan Popup Time Deviation</em>' attribute.
	 * @see #setLiftingSeatPanPopupTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_LiftingSeatPanPopupTimeDeviation()
	 * @model default="0.5"
	 * @generated
	 */
	double getLiftingSeatPanPopupTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifting Seat Pan Popup Time Deviation</em>' attribute.
	 * @see #getLiftingSeatPanPopupTimeDeviation()
	 * @generated
	 */
	void setLiftingSeatPanPopupTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Layout Concept</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link net.bhl.cdt.paxelerate.model.LayoutConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Concept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Concept</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
	 * @see #setLayoutConcept(LayoutConcept)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_LayoutConcept()
	 * @model default="Default" required="true"
	 * @generated
	 */
	LayoutConcept getLayoutConcept();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLayoutConcept <em>Layout Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Concept</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
	 * @see #getLayoutConcept()
	 * @generated
	 */
	void setLayoutConcept(LayoutConcept value);

} // SimulationProperties
