/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.SimulationResult;
import net.bhl.cdt.paxelerate.model.SortingStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isSimulateWithoutUI <em>Simulate Without UI</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isRandomSortBetweenLoops <em>Random Sort Between Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isUseFoldableSeats <em>Use Foldable Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isBringYourOwnSeat <em>Bring Your Own Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPercentageOfWomen <em>Percentage Of Women</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerLuggageStowTimeMean <em>Passenger Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerLuggageStowTimeDeviation <em>Passenger Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getResults <em>Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationPropertiesImpl extends MinimalEObjectImpl.Container implements SimulationProperties {
	/**
	 * The default value of the '{@link #isSimulateWithoutUI() <em>Simulate Without UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulateWithoutUI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMULATE_WITHOUT_UI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSimulateWithoutUI() <em>Simulate Without UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulateWithoutUI()
	 * @generated
	 * @ordered
	 */
	protected boolean simulateWithoutUI = SIMULATE_WITHOUT_UI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSimulationLoops() <em>Number Of Simulation Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSimulationLoops()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SIMULATION_LOOPS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfSimulationLoops() <em>Number Of Simulation Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSimulationLoops()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSimulationLoops = NUMBER_OF_SIMULATION_LOOPS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRandomSortBetweenLoops() <em>Random Sort Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomSortBetweenLoops()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRandomSortBetweenLoops() <em>Random Sort Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomSortBetweenLoops()
	 * @generated
	 * @ordered
	 */
	protected boolean randomSortBetweenLoops = RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFoldableSeats() <em>Use Foldable Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFoldableSeats()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FOLDABLE_SEATS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFoldableSeats() <em>Use Foldable Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFoldableSeats()
	 * @generated
	 * @ordered
	 */
	protected boolean useFoldableSeats = USE_FOLDABLE_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBringYourOwnSeat() <em>Bring Your Own Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBringYourOwnSeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRING_YOUR_OWN_SEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBringYourOwnSeat() <em>Bring Your Own Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBringYourOwnSeat()
	 * @generated
	 * @ordered
	 */
	protected boolean bringYourOwnSeat = BRING_YOUR_OWN_SEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengersBoardingPerMinute() <em>Passengers Boarding Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengersBoardingPerMinute()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT = 18.0;

	/**
	 * The cached value of the '{@link #getPassengersBoardingPerMinute() <em>Passengers Boarding Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengersBoardingPerMinute()
	 * @generated
	 * @ordered
	 */
	protected double passengersBoardingPerMinute = PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthMeanMale() <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_MEAN_MALE_EDEFAULT = 47.0;

	/**
	 * The cached value of the '{@link #getPassengerWidthMeanMale() <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthMeanMale = PASSENGER_WIDTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthDeviationMale() <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT = 2.8;

	/**
	 * The cached value of the '{@link #getPassengerWidthDeviationMale() <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthDeviationMale = PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightMeanMale() <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT = 90.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightMeanMale() <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightMeanMale = PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightDeviationMale() <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightDeviationMale() <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightDeviationMale = PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightMeanMale() <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT = 177.5;

	/**
	 * The cached value of the '{@link #getPassengerHeightMeanMale() <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightMeanMale = PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightDeviationMale() <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT = 11.1;

	/**
	 * The cached value of the '{@link #getPassengerHeightDeviationMale() <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightDeviationMale = PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthMeanMale() <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_MEAN_MALE_EDEFAULT = 30.0;

	/**
	 * The cached value of the '{@link #getPassengerDepthMeanMale() <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthMeanMale = PASSENGER_DEPTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthDeviationMale() <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getPassengerDepthDeviationMale() <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthDeviationMale = PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfWomen() <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfWomen()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_WOMEN_EDEFAULT = 50.0;

	/**
	 * The cached value of the '{@link #getPercentageOfWomen() <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfWomen()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfWomen = PERCENTAGE_OF_WOMEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerLuggageStowTimeMean() <em>Passenger Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_LUGGAGE_STOW_TIME_MEAN_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getPassengerLuggageStowTimeMean() <em>Passenger Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double passengerLuggageStowTimeMean = PASSENGER_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerLuggageStowTimeDeviation() <em>Passenger Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT = 7.0;

	/**
	 * The cached value of the '{@link #getPassengerLuggageStowTimeDeviation() <em>Passenger Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double passengerLuggageStowTimeDeviation = PASSENGER_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthMeanFemale() <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT = 41.4;

	/**
	 * The cached value of the '{@link #getPassengerWidthMeanFemale() <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthMeanFemale = PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthDeviationFemale() <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT = 2.8;

	/**
	 * The cached value of the '{@link #getPassengerWidthDeviationFemale() <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthDeviationFemale = PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightMeanFemale() <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT = 60.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightMeanFemale() <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightMeanFemale = PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightDeviationFemale() <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightDeviationFemale() <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightDeviationFemale = PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightMeanFemale() <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT = 164.5;

	/**
	 * The cached value of the '{@link #getPassengerHeightMeanFemale() <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightMeanFemale = PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightDeviationFemale() <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT = 11.5;

	/**
	 * The cached value of the '{@link #getPassengerHeightDeviationFemale() <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightDeviationFemale = PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthMeanFemale() <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT = 27;

	/**
	 * The cached value of the '{@link #getPassengerDepthMeanFemale() <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected int passengerDepthMeanFemale = PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthDeviationFemale() <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT = 3.0;

	/**
	 * The cached value of the '{@link #getPassengerDepthDeviationFemale() <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthDeviationFemale = PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulationResult> results;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithNoLuggage() <em>Percentage Of Passengers With No Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithNoLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithNoLuggage() <em>Percentage Of Passengers With No Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithNoLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithNoLuggage = PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithSmallLuggage() <em>Percentage Of Passengers With Small Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithSmallLuggage() <em>Percentage Of Passengers With Small Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithSmallLuggage = PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithMediumLuggage() <em>Percentage Of Passengers With Medium Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithMediumLuggage() <em>Percentage Of Passengers With Medium Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithMediumLuggage = PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithBigLuggage() <em>Percentage Of Passengers With Big Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithBigLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithBigLuggage() <em>Percentage Of Passengers With Big Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithBigLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithBigLuggage = PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected static final SortingStyle SORTING_EDEFAULT = SortingStyle.RANDOM;

	/**
	 * The cached value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected SortingStyle sorting = SORTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMULATION_SPEED_FACTOR_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected int simulationSpeedFactor = SIMULATION_SPEED_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.SIMULATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimulateWithoutUI() {
		return simulateWithoutUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulateWithoutUI(boolean newSimulateWithoutUI) {
		boolean oldSimulateWithoutUI = simulateWithoutUI;
		simulateWithoutUI = newSimulateWithoutUI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI, oldSimulateWithoutUI, simulateWithoutUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSimulationLoops() {
		return numberOfSimulationLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSimulationLoops(int newNumberOfSimulationLoops) {
		int oldNumberOfSimulationLoops = numberOfSimulationLoops;
		numberOfSimulationLoops = newNumberOfSimulationLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS, oldNumberOfSimulationLoops, numberOfSimulationLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRandomSortBetweenLoops() {
		return randomSortBetweenLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSortBetweenLoops(boolean newRandomSortBetweenLoops) {
		boolean oldRandomSortBetweenLoops = randomSortBetweenLoops;
		randomSortBetweenLoops = newRandomSortBetweenLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS, oldRandomSortBetweenLoops, randomSortBetweenLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFoldableSeats() {
		return useFoldableSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFoldableSeats(boolean newUseFoldableSeats) {
		boolean oldUseFoldableSeats = useFoldableSeats;
		useFoldableSeats = newUseFoldableSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS, oldUseFoldableSeats, useFoldableSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBringYourOwnSeat() {
		return bringYourOwnSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBringYourOwnSeat(boolean newBringYourOwnSeat) {
		boolean oldBringYourOwnSeat = bringYourOwnSeat;
		bringYourOwnSeat = newBringYourOwnSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT, oldBringYourOwnSeat, bringYourOwnSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengersBoardingPerMinute() {
		return passengersBoardingPerMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengersBoardingPerMinute(double newPassengersBoardingPerMinute) {
		double oldPassengersBoardingPerMinute = passengersBoardingPerMinute;
		passengersBoardingPerMinute = newPassengersBoardingPerMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE, oldPassengersBoardingPerMinute, passengersBoardingPerMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthMeanMale() {
		return passengerWidthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthMeanMale(double newPassengerWidthMeanMale) {
		double oldPassengerWidthMeanMale = passengerWidthMeanMale;
		passengerWidthMeanMale = newPassengerWidthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE, oldPassengerWidthMeanMale, passengerWidthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthDeviationMale() {
		return passengerWidthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthDeviationMale(double newPassengerWidthDeviationMale) {
		double oldPassengerWidthDeviationMale = passengerWidthDeviationMale;
		passengerWidthDeviationMale = newPassengerWidthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE, oldPassengerWidthDeviationMale, passengerWidthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightMeanMale() {
		return passengerWeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightMeanMale(double newPassengerWeightMeanMale) {
		double oldPassengerWeightMeanMale = passengerWeightMeanMale;
		passengerWeightMeanMale = newPassengerWeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE, oldPassengerWeightMeanMale, passengerWeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightDeviationMale() {
		return passengerWeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightDeviationMale(double newPassengerWeightDeviationMale) {
		double oldPassengerWeightDeviationMale = passengerWeightDeviationMale;
		passengerWeightDeviationMale = newPassengerWeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE, oldPassengerWeightDeviationMale, passengerWeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightMeanMale() {
		return passengerHeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightMeanMale(double newPassengerHeightMeanMale) {
		double oldPassengerHeightMeanMale = passengerHeightMeanMale;
		passengerHeightMeanMale = newPassengerHeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE, oldPassengerHeightMeanMale, passengerHeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightDeviationMale() {
		return passengerHeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightDeviationMale(double newPassengerHeightDeviationMale) {
		double oldPassengerHeightDeviationMale = passengerHeightDeviationMale;
		passengerHeightDeviationMale = newPassengerHeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE, oldPassengerHeightDeviationMale, passengerHeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthMeanMale() {
		return passengerDepthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthMeanMale(double newPassengerDepthMeanMale) {
		double oldPassengerDepthMeanMale = passengerDepthMeanMale;
		passengerDepthMeanMale = newPassengerDepthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE, oldPassengerDepthMeanMale, passengerDepthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthDeviationMale() {
		return passengerDepthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthDeviationMale(double newPassengerDepthDeviationMale) {
		double oldPassengerDepthDeviationMale = passengerDepthDeviationMale;
		passengerDepthDeviationMale = newPassengerDepthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE, oldPassengerDepthDeviationMale, passengerDepthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfWomen() {
		return percentageOfWomen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfWomen(double newPercentageOfWomen) {
		double oldPercentageOfWomen = percentageOfWomen;
		percentageOfWomen = newPercentageOfWomen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN, oldPercentageOfWomen, percentageOfWomen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerLuggageStowTimeMean() {
		return passengerLuggageStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerLuggageStowTimeMean(double newPassengerLuggageStowTimeMean) {
		double oldPassengerLuggageStowTimeMean = passengerLuggageStowTimeMean;
		passengerLuggageStowTimeMean = newPassengerLuggageStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN, oldPassengerLuggageStowTimeMean, passengerLuggageStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerLuggageStowTimeDeviation() {
		return passengerLuggageStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerLuggageStowTimeDeviation(double newPassengerLuggageStowTimeDeviation) {
		double oldPassengerLuggageStowTimeDeviation = passengerLuggageStowTimeDeviation;
		passengerLuggageStowTimeDeviation = newPassengerLuggageStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION, oldPassengerLuggageStowTimeDeviation, passengerLuggageStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthMeanFemale() {
		return passengerWidthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthMeanFemale(double newPassengerWidthMeanFemale) {
		double oldPassengerWidthMeanFemale = passengerWidthMeanFemale;
		passengerWidthMeanFemale = newPassengerWidthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE, oldPassengerWidthMeanFemale, passengerWidthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthDeviationFemale() {
		return passengerWidthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthDeviationFemale(double newPassengerWidthDeviationFemale) {
		double oldPassengerWidthDeviationFemale = passengerWidthDeviationFemale;
		passengerWidthDeviationFemale = newPassengerWidthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE, oldPassengerWidthDeviationFemale, passengerWidthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightMeanFemale() {
		return passengerWeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightMeanFemale(double newPassengerWeightMeanFemale) {
		double oldPassengerWeightMeanFemale = passengerWeightMeanFemale;
		passengerWeightMeanFemale = newPassengerWeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE, oldPassengerWeightMeanFemale, passengerWeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightDeviationFemale() {
		return passengerWeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightDeviationFemale(double newPassengerWeightDeviationFemale) {
		double oldPassengerWeightDeviationFemale = passengerWeightDeviationFemale;
		passengerWeightDeviationFemale = newPassengerWeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE, oldPassengerWeightDeviationFemale, passengerWeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightMeanFemale() {
		return passengerHeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightMeanFemale(double newPassengerHeightMeanFemale) {
		double oldPassengerHeightMeanFemale = passengerHeightMeanFemale;
		passengerHeightMeanFemale = newPassengerHeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE, oldPassengerHeightMeanFemale, passengerHeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightDeviationFemale() {
		return passengerHeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightDeviationFemale(double newPassengerHeightDeviationFemale) {
		double oldPassengerHeightDeviationFemale = passengerHeightDeviationFemale;
		passengerHeightDeviationFemale = newPassengerHeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE, oldPassengerHeightDeviationFemale, passengerHeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassengerDepthMeanFemale() {
		return passengerDepthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthMeanFemale(int newPassengerDepthMeanFemale) {
		int oldPassengerDepthMeanFemale = passengerDepthMeanFemale;
		passengerDepthMeanFemale = newPassengerDepthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE, oldPassengerDepthMeanFemale, passengerDepthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthDeviationFemale() {
		return passengerDepthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthDeviationFemale(double newPassengerDepthDeviationFemale) {
		double oldPassengerDepthDeviationFemale = passengerDepthDeviationFemale;
		passengerDepthDeviationFemale = newPassengerDepthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE, oldPassengerDepthDeviationFemale, passengerDepthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulationResult> getResults() {
		if (results == null) {
			results = new EObjectResolvingEList<SimulationResult>(SimulationResult.class, this, CabinPackage.SIMULATION_PROPERTIES__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithNoLuggage() {
		return percentageOfPassengersWithNoLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithNoLuggage(double newPercentageOfPassengersWithNoLuggage) {
		double oldPercentageOfPassengersWithNoLuggage = percentageOfPassengersWithNoLuggage;
		percentageOfPassengersWithNoLuggage = newPercentageOfPassengersWithNoLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE, oldPercentageOfPassengersWithNoLuggage, percentageOfPassengersWithNoLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithSmallLuggage() {
		return percentageOfPassengersWithSmallLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithSmallLuggage(double newPercentageOfPassengersWithSmallLuggage) {
		double oldPercentageOfPassengersWithSmallLuggage = percentageOfPassengersWithSmallLuggage;
		percentageOfPassengersWithSmallLuggage = newPercentageOfPassengersWithSmallLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE, oldPercentageOfPassengersWithSmallLuggage, percentageOfPassengersWithSmallLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithMediumLuggage() {
		return percentageOfPassengersWithMediumLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithMediumLuggage(double newPercentageOfPassengersWithMediumLuggage) {
		double oldPercentageOfPassengersWithMediumLuggage = percentageOfPassengersWithMediumLuggage;
		percentageOfPassengersWithMediumLuggage = newPercentageOfPassengersWithMediumLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE, oldPercentageOfPassengersWithMediumLuggage, percentageOfPassengersWithMediumLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithBigLuggage() {
		return percentageOfPassengersWithBigLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithBigLuggage(double newPercentageOfPassengersWithBigLuggage) {
		double oldPercentageOfPassengersWithBigLuggage = percentageOfPassengersWithBigLuggage;
		percentageOfPassengersWithBigLuggage = newPercentageOfPassengersWithBigLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE, oldPercentageOfPassengersWithBigLuggage, percentageOfPassengersWithBigLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingStyle getSorting() {
		return sorting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorting(SortingStyle newSorting) {
		SortingStyle oldSorting = sorting;
		sorting = newSorting == null ? SORTING_EDEFAULT : newSorting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SORTING, oldSorting, sorting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSimulationSpeedFactor() {
		return simulationSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationSpeedFactor(int newSimulationSpeedFactor) {
		int oldSimulationSpeedFactor = simulationSpeedFactor;
		simulationSpeedFactor = newSimulationSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR, oldSimulationSpeedFactor, simulationSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				return isSimulateWithoutUI();
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				return getNumberOfSimulationLoops();
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				return isRandomSortBetweenLoops();
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				return isUseFoldableSeats();
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				return isBringYourOwnSeat();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				return getPassengersBoardingPerMinute();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				return getPassengerWidthMeanMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				return getPassengerWidthDeviationMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				return getPassengerWeightMeanMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				return getPassengerWeightDeviationMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				return getPassengerHeightMeanMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				return getPassengerHeightDeviationMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				return getPassengerDepthMeanMale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				return getPassengerDepthDeviationMale();
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN:
				return getPercentageOfWomen();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN:
				return getPassengerLuggageStowTimeMean();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION:
				return getPassengerLuggageStowTimeDeviation();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				return getPassengerWidthMeanFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				return getPassengerWidthDeviationFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				return getPassengerWeightMeanFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				return getPassengerWeightDeviationFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				return getPassengerHeightMeanFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				return getPassengerHeightDeviationFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				return getPassengerDepthMeanFemale();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				return getPassengerDepthDeviationFemale();
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				return getResults();
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				return getPercentageOfPassengersWithNoLuggage();
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				return getPercentageOfPassengersWithSmallLuggage();
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				return getPercentageOfPassengersWithMediumLuggage();
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				return getPercentageOfPassengersWithBigLuggage();
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				return getSorting();
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				return getSimulationSpeedFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				setSimulateWithoutUI((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				setNumberOfSimulationLoops((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				setRandomSortBetweenLoops((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				setUseFoldableSeats((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				setBringYourOwnSeat((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				setPassengersBoardingPerMinute((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				setPassengerWidthMeanMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				setPassengerWidthDeviationMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				setPassengerWeightMeanMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				setPassengerWeightDeviationMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				setPassengerHeightMeanMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				setPassengerHeightDeviationMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				setPassengerDepthMeanMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				setPassengerDepthDeviationMale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN:
				setPercentageOfWomen((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN:
				setPassengerLuggageStowTimeMean((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerLuggageStowTimeDeviation((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				setPassengerWidthMeanFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				setPassengerWidthDeviationFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				setPassengerWeightMeanFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				setPassengerWeightDeviationFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				setPassengerHeightMeanFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				setPassengerHeightDeviationFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				setPassengerDepthMeanFemale((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				setPassengerDepthDeviationFemale((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends SimulationResult>)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				setPercentageOfPassengersWithNoLuggage((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				setPercentageOfPassengersWithSmallLuggage((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				setPercentageOfPassengersWithMediumLuggage((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				setPercentageOfPassengersWithBigLuggage((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				setSorting((SortingStyle)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				setSimulationSpeedFactor((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				setSimulateWithoutUI(SIMULATE_WITHOUT_UI_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				setNumberOfSimulationLoops(NUMBER_OF_SIMULATION_LOOPS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				setRandomSortBetweenLoops(RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				setUseFoldableSeats(USE_FOLDABLE_SEATS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				setBringYourOwnSeat(BRING_YOUR_OWN_SEAT_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				setPassengersBoardingPerMinute(PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				setPassengerWidthMeanMale(PASSENGER_WIDTH_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				setPassengerWidthDeviationMale(PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				setPassengerWeightMeanMale(PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				setPassengerWeightDeviationMale(PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				setPassengerHeightMeanMale(PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				setPassengerHeightDeviationMale(PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				setPassengerDepthMeanMale(PASSENGER_DEPTH_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				setPassengerDepthDeviationMale(PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN:
				setPercentageOfWomen(PERCENTAGE_OF_WOMEN_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN:
				setPassengerLuggageStowTimeMean(PASSENGER_LUGGAGE_STOW_TIME_MEAN_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerLuggageStowTimeDeviation(PASSENGER_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				setPassengerWidthMeanFemale(PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				setPassengerWidthDeviationFemale(PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				setPassengerWeightMeanFemale(PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				setPassengerWeightDeviationFemale(PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				setPassengerHeightMeanFemale(PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				setPassengerHeightDeviationFemale(PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				setPassengerDepthMeanFemale(PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				setPassengerDepthDeviationFemale(PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				getResults().clear();
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				setPercentageOfPassengersWithNoLuggage(PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				setPercentageOfPassengersWithSmallLuggage(PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				setPercentageOfPassengersWithMediumLuggage(PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				setPercentageOfPassengersWithBigLuggage(PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				setSorting(SORTING_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				setSimulationSpeedFactor(SIMULATION_SPEED_FACTOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				return simulateWithoutUI != SIMULATE_WITHOUT_UI_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				return numberOfSimulationLoops != NUMBER_OF_SIMULATION_LOOPS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				return randomSortBetweenLoops != RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				return useFoldableSeats != USE_FOLDABLE_SEATS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				return bringYourOwnSeat != BRING_YOUR_OWN_SEAT_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				return passengersBoardingPerMinute != PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				return passengerWidthMeanMale != PASSENGER_WIDTH_MEAN_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				return passengerWidthDeviationMale != PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				return passengerWeightMeanMale != PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				return passengerWeightDeviationMale != PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				return passengerHeightMeanMale != PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				return passengerHeightDeviationMale != PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				return passengerDepthMeanMale != PASSENGER_DEPTH_MEAN_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				return passengerDepthDeviationMale != PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN:
				return percentageOfWomen != PERCENTAGE_OF_WOMEN_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN:
				return passengerLuggageStowTimeMean != PASSENGER_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION:
				return passengerLuggageStowTimeDeviation != PASSENGER_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				return passengerWidthMeanFemale != PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				return passengerWidthDeviationFemale != PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				return passengerWeightMeanFemale != PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				return passengerWeightDeviationFemale != PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				return passengerHeightMeanFemale != PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				return passengerHeightDeviationFemale != PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				return passengerDepthMeanFemale != PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				return passengerDepthDeviationFemale != PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				return results != null && !results.isEmpty();
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				return percentageOfPassengersWithNoLuggage != PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				return percentageOfPassengersWithSmallLuggage != PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				return percentageOfPassengersWithMediumLuggage != PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				return percentageOfPassengersWithBigLuggage != PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				return sorting != SORTING_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				return simulationSpeedFactor != SIMULATION_SPEED_FACTOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simulateWithoutUI: ");
		result.append(simulateWithoutUI);
		result.append(", numberOfSimulationLoops: ");
		result.append(numberOfSimulationLoops);
		result.append(", randomSortBetweenLoops: ");
		result.append(randomSortBetweenLoops);
		result.append(", useFoldableSeats: ");
		result.append(useFoldableSeats);
		result.append(", bringYourOwnSeat: ");
		result.append(bringYourOwnSeat);
		result.append(", passengersBoardingPerMinute: ");
		result.append(passengersBoardingPerMinute);
		result.append(", passengerWidthMeanMale: ");
		result.append(passengerWidthMeanMale);
		result.append(", passengerWidthDeviationMale: ");
		result.append(passengerWidthDeviationMale);
		result.append(", passengerWeightMeanMale: ");
		result.append(passengerWeightMeanMale);
		result.append(", passengerWeightDeviationMale: ");
		result.append(passengerWeightDeviationMale);
		result.append(", passengerHeightMeanMale: ");
		result.append(passengerHeightMeanMale);
		result.append(", passengerHeightDeviationMale: ");
		result.append(passengerHeightDeviationMale);
		result.append(", passengerDepthMeanMale: ");
		result.append(passengerDepthMeanMale);
		result.append(", passengerDepthDeviationMale: ");
		result.append(passengerDepthDeviationMale);
		result.append(", percentageOfWomen: ");
		result.append(percentageOfWomen);
		result.append(", passengerLuggageStowTimeMean: ");
		result.append(passengerLuggageStowTimeMean);
		result.append(", passengerLuggageStowTimeDeviation: ");
		result.append(passengerLuggageStowTimeDeviation);
		result.append(", passengerWidthMeanFemale: ");
		result.append(passengerWidthMeanFemale);
		result.append(", passengerWidthDeviationFemale: ");
		result.append(passengerWidthDeviationFemale);
		result.append(", passengerWeightMeanFemale: ");
		result.append(passengerWeightMeanFemale);
		result.append(", passengerWeightDeviationFemale: ");
		result.append(passengerWeightDeviationFemale);
		result.append(", passengerHeightMeanFemale: ");
		result.append(passengerHeightMeanFemale);
		result.append(", passengerHeightDeviationFemale: ");
		result.append(passengerHeightDeviationFemale);
		result.append(", passengerDepthMeanFemale: ");
		result.append(passengerDepthMeanFemale);
		result.append(", passengerDepthDeviationFemale: ");
		result.append(passengerDepthDeviationFemale);
		result.append(", percentageOfPassengersWithNoLuggage: ");
		result.append(percentageOfPassengersWithNoLuggage);
		result.append(", percentageOfPassengersWithSmallLuggage: ");
		result.append(percentageOfPassengersWithSmallLuggage);
		result.append(", percentageOfPassengersWithMediumLuggage: ");
		result.append(percentageOfPassengersWithMediumLuggage);
		result.append(", percentageOfPassengersWithBigLuggage: ");
		result.append(percentageOfPassengersWithBigLuggage);
		result.append(", sorting: ");
		result.append(sorting);
		result.append(", simulationSpeedFactor: ");
		result.append(simulationSpeedFactor);
		result.append(')');
		return result.toString();
	}

} //SimulationPropertiesImpl
