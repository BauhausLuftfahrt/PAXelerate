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
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSimulateWithoutUI <em>Simulate Without UI</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isRandomSortBetweenLoops <em>Random Sort Between Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isUseFoldableSeats <em>Use Foldable Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isBringYourOwnSeat <em>Bring Your Own Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getResults <em>Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSorting <em>Sorting</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDeveloperMode <em>Developer Mode</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageProperties <em>Luggage Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerProperties <em>Passenger Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties()
 * @model
 * @generated
 */
public interface SimulationProperties extends EObject {
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
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Simulation Loops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Simulation Loops</em>' attribute.
	 * @see #setNumberOfSimulationLoops(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_NumberOfSimulationLoops()
	 * @model default="1"
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
	 * Returns the value of the '<em><b>Random Sort Between Loops</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Sort Between Loops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Sort Between Loops</em>' attribute.
	 * @see #setRandomSortBetweenLoops(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_RandomSortBetweenLoops()
	 * @model default="true"
	 * @generated
	 */
	boolean isRandomSortBetweenLoops();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isRandomSortBetweenLoops <em>Random Sort Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Sort Between Loops</em>' attribute.
	 * @see #isRandomSortBetweenLoops()
	 * @generated
	 */
	void setRandomSortBetweenLoops(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Foldable Seats</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Foldable Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Foldable Seats</em>' attribute.
	 * @see #setUseFoldableSeats(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_UseFoldableSeats()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseFoldableSeats();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isUseFoldableSeats <em>Use Foldable Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Foldable Seats</em>' attribute.
	 * @see #isUseFoldableSeats()
	 * @generated
	 */
	void setUseFoldableSeats(boolean value);

	/**
	 * Returns the value of the '<em><b>Bring Your Own Seat</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bring Your Own Seat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bring Your Own Seat</em>' attribute.
	 * @see #setBringYourOwnSeat(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_BringYourOwnSeat()
	 * @model default="false"
	 * @generated
	 */
	boolean isBringYourOwnSeat();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isBringYourOwnSeat <em>Bring Your Own Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bring Your Own Seat</em>' attribute.
	 * @see #isBringYourOwnSeat()
	 * @generated
	 */
	void setBringYourOwnSeat(boolean value);

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
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Speed Factor</em>' attribute.
	 * @see #setSimulationSpeedFactor(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_SimulationSpeedFactor()
	 * @model default="10"
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
	 * Returns the value of the '<em><b>Developer Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developer Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developer Mode</em>' attribute.
	 * @see #setDeveloperMode(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_DeveloperMode()
	 * @model default="false"
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

} // SimulationProperties
