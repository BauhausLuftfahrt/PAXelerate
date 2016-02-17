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
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfWomen <em>Percentage Of Women</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerSmallLuggageStowTimeMean <em>Passenger Small Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerSmallLuggageStowTimeDeviation <em>Passenger Small Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerMediumLuggageStowTimeMean <em>Passenger Medium Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerMediumLuggageStowTimeDeviation <em>Passenger Medium Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerBigLuggageStowTimeMean <em>Passenger Big Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerBigLuggageStowTimeDeviation <em>Passenger Big Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getResults <em>Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSorting <em>Sorting</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDeveloperMode <em>Developer Mode</em>}</li>
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
	 * Returns the value of the '<em><b>Passenger Width Mean Male</b></em>' attribute.
	 * The default value is <code>"47"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Mean Male</em>' attribute.
	 * @see #setPassengerWidthMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWidthMeanMale()
	 * @model default="47"
	 * @generated
	 */
	double getPassengerWidthMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Male</em>' attribute.
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 */
	void setPassengerWidthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Male</b></em>' attribute.
	 * The default value is <code>"2.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Male</em>' attribute.
	 * @see #setPassengerWidthDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWidthDeviationMale()
	 * @model default="2.8"
	 * @generated
	 */
	double getPassengerWidthDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Deviation Male</em>' attribute.
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 */
	void setPassengerWidthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Mean Male</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Mean Male</em>' attribute.
	 * @see #setPassengerWeightMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWeightMeanMale()
	 * @model default="90"
	 * @generated
	 */
	double getPassengerWeightMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Mean Male</em>' attribute.
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 */
	void setPassengerWeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Deviation Male</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Deviation Male</em>' attribute.
	 * @see #setPassengerWeightDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWeightDeviationMale()
	 * @model default="20"
	 * @generated
	 */
	double getPassengerWeightDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Deviation Male</em>' attribute.
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 */
	void setPassengerWeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Mean Male</b></em>' attribute.
	 * The default value is <code>"177.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Mean Male</em>' attribute.
	 * @see #setPassengerHeightMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerHeightMeanMale()
	 * @model default="177.5"
	 * @generated
	 */
	double getPassengerHeightMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Mean Male</em>' attribute.
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 */
	void setPassengerHeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Deviation Male</b></em>' attribute.
	 * The default value is <code>"11.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Deviation Male</em>' attribute.
	 * @see #setPassengerHeightDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerHeightDeviationMale()
	 * @model default="11.1"
	 * @generated
	 */
	double getPassengerHeightDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Deviation Male</em>' attribute.
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 */
	void setPassengerHeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Mean Male</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Mean Male</em>' attribute.
	 * @see #setPassengerDepthMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerDepthMeanMale()
	 * @model default="30"
	 * @generated
	 */
	double getPassengerDepthMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Male</em>' attribute.
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 */
	void setPassengerDepthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Deviation Male</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Deviation Male</em>' attribute.
	 * @see #setPassengerDepthDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerDepthDeviationMale()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerDepthDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Deviation Male</em>' attribute.
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 */
	void setPassengerDepthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Women</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Women</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Women</em>' attribute.
	 * @see #setPercentageOfWomen(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PercentageOfWomen()
	 * @model default="50"
	 * @generated
	 */
	double getPercentageOfWomen();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfWomen <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Women</em>' attribute.
	 * @see #getPercentageOfWomen()
	 * @generated
	 */
	void setPercentageOfWomen(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Small Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Small Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Small Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerSmallLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerSmallLuggageStowTimeMean()
	 * @model default="10"
	 * @generated
	 */
	double getPassengerSmallLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerSmallLuggageStowTimeMean <em>Passenger Small Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Small Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerSmallLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerSmallLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Small Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Small Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Small Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerSmallLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerSmallLuggageStowTimeDeviation()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerSmallLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerSmallLuggageStowTimeDeviation <em>Passenger Small Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Small Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerSmallLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerSmallLuggageStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Medium Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Medium Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Medium Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerMediumLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerMediumLuggageStowTimeMean()
	 * @model default="15"
	 * @generated
	 */
	double getPassengerMediumLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerMediumLuggageStowTimeMean <em>Passenger Medium Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Medium Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerMediumLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerMediumLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Medium Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Medium Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Medium Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerMediumLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerMediumLuggageStowTimeDeviation()
	 * @model default="7"
	 * @generated
	 */
	double getPassengerMediumLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerMediumLuggageStowTimeDeviation <em>Passenger Medium Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Medium Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerMediumLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerMediumLuggageStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Big Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Big Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Big Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerBigLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerBigLuggageStowTimeMean()
	 * @model default="20"
	 * @generated
	 */
	double getPassengerBigLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerBigLuggageStowTimeMean <em>Passenger Big Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Big Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerBigLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerBigLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Big Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Big Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Big Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerBigLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerBigLuggageStowTimeDeviation()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerBigLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerBigLuggageStowTimeDeviation <em>Passenger Big Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Big Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerBigLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerBigLuggageStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Mean Female</b></em>' attribute.
	 * The default value is <code>"41.4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #setPassengerWidthMeanFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWidthMeanFemale()
	 * @model default="41.4"
	 * @generated
	 */
	double getPassengerWidthMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 */
	void setPassengerWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"2.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #setPassengerWidthDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWidthDeviationFemale()
	 * @model default="2.8"
	 * @generated
	 */
	double getPassengerWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 */
	void setPassengerWidthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Mean Female</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Mean Female</em>' attribute.
	 * @see #setPassengerWeightMeanFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWeightMeanFemale()
	 * @model default="60"
	 * @generated
	 */
	double getPassengerWeightMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Mean Female</em>' attribute.
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 */
	void setPassengerWeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Deviation Female</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Deviation Female</em>' attribute.
	 * @see #setPassengerWeightDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerWeightDeviationFemale()
	 * @model default="15"
	 * @generated
	 */
	double getPassengerWeightDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Deviation Female</em>' attribute.
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 */
	void setPassengerWeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Mean Female</b></em>' attribute.
	 * The default value is <code>"164.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Mean Female</em>' attribute.
	 * @see #setPassengerHeightMeanFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerHeightMeanFemale()
	 * @model default="164.5"
	 * @generated
	 */
	double getPassengerHeightMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Mean Female</em>' attribute.
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 */
	void setPassengerHeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Deviation Female</b></em>' attribute.
	 * The default value is <code>"11.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Deviation Female</em>' attribute.
	 * @see #setPassengerHeightDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerHeightDeviationFemale()
	 * @model default="11.5"
	 * @generated
	 */
	double getPassengerHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Deviation Female</em>' attribute.
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 */
	void setPassengerHeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Mean Female</b></em>' attribute.
	 * The default value is <code>"27"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #setPassengerDepthMeanFemale(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerDepthMeanFemale()
	 * @model default="27"
	 * @generated
	 */
	int getPassengerDepthMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 */
	void setPassengerDepthMeanFemale(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Deviation Female</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Deviation Female</em>' attribute.
	 * @see #setPassengerDepthDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PassengerDepthDeviationFemale()
	 * @model default="3"
	 * @generated
	 */
	double getPassengerDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Deviation Female</em>' attribute.
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 */
	void setPassengerDepthDeviationFemale(double value);

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
	 * Returns the value of the '<em><b>Percentage Of Passengers With No Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With No Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With No Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithNoLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PercentageOfPassengersWithNoLuggage()
	 * @model
	 * @generated
	 */
	double getPercentageOfPassengersWithNoLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With No Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithNoLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithNoLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Small Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With Small Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Small Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithSmallLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PercentageOfPassengersWithSmallLuggage()
	 * @model
	 * @generated
	 */
	double getPercentageOfPassengersWithSmallLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Small Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithSmallLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithSmallLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Medium Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With Medium Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Medium Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithMediumLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PercentageOfPassengersWithMediumLuggage()
	 * @model
	 * @generated
	 */
	double getPercentageOfPassengersWithMediumLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Medium Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithMediumLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithMediumLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Big Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With Big Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Big Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithBigLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationProperties_PercentageOfPassengersWithBigLuggage()
	 * @model
	 * @generated
	 */
	double getPercentageOfPassengersWithBigLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Big Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithBigLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithBigLuggage(double value);

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

} // SimulationProperties
