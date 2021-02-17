/**
 */
package com.paxelerate.model.impl;

import com.paxelerate.model.ModelPackage;
import com.paxelerate.model.SimulationResult;

import com.paxelerate.model.enums.SeatType;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getDate <em>Date</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getBoardingTimeString <em>Boarding Time String</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getWaymakingSkipped <em>Waymaking Skipped</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getWaymakingCompleted <em>Waymaking Completed</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getLayoutConceptType <em>Layout Concept Type</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getSimulationTime <em>Simulation Time</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getNotStoredLuggageItems <em>Not Stored Luggage Items</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getLuggageStorageFillingDegree <em>Luggage Storage Filling Degree</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getTotalLargeBagsStowed <em>Total Large Bags Stowed</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getTotalStorageVolume <em>Total Storage Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getPassengersLookingForLuggageSpot <em>Passengers Looking For Luggage Spot</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getVolumeOfNotStoredLuggageItems <em>Volume Of Not Stored Luggage Items</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getMaxNumberOfActivePassengers <em>Max Number Of Active Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getAverageNumberOfActivePassengers <em>Average Number Of Active Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.SimulationResultImpl#getAverageNumberOfBags <em>Average Number Of Bags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationResultImpl extends MinimalEObjectImpl.Container implements SimulationResult {
	/**
	 * The default value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double BOARDING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected double boardingTime = BOARDING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengers() <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected int passengers = PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardingTimeString() <em>Boarding Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTimeString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARDING_TIME_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoardingTimeString() <em>Boarding Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTimeString()
	 * @generated
	 * @ordered
	 */
	protected String boardingTimeString = BOARDING_TIME_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaymakingSkipped() <em>Waymaking Skipped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaymakingSkipped()
	 * @generated
	 * @ordered
	 */
	protected static final int WAYMAKING_SKIPPED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWaymakingSkipped() <em>Waymaking Skipped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaymakingSkipped()
	 * @generated
	 * @ordered
	 */
	protected int waymakingSkipped = WAYMAKING_SKIPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaymakingCompleted() <em>Waymaking Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaymakingCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final int WAYMAKING_COMPLETED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWaymakingCompleted() <em>Waymaking Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaymakingCompleted()
	 * @generated
	 * @ordered
	 */
	protected int waymakingCompleted = WAYMAKING_COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutConceptType() <em>Layout Concept Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutConceptType()
	 * @generated
	 * @ordered
	 */
	protected static final SeatType LAYOUT_CONCEPT_TYPE_EDEFAULT = SeatType.DEFAULT;

	/**
	 * The cached value of the '{@link #getLayoutConceptType() <em>Layout Concept Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutConceptType()
	 * @generated
	 * @ordered
	 */
	protected SeatType layoutConceptType = LAYOUT_CONCEPT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTime()
	 * @generated
	 * @ordered
	 */
	protected static final double SIMULATION_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSimulationTime() <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationTime()
	 * @generated
	 * @ordered
	 */
	protected double simulationTime = SIMULATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotStoredLuggageItems() <em>Not Stored Luggage Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotStoredLuggageItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NOT_STORED_LUGGAGE_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNotStoredLuggageItems() <em>Not Stored Luggage Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotStoredLuggageItems()
	 * @generated
	 * @ordered
	 */
	protected int notStoredLuggageItems = NOT_STORED_LUGGAGE_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuggageStorageFillingDegree() <em>Luggage Storage Filling Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStorageFillingDegree()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STORAGE_FILLING_DEGREE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLuggageStorageFillingDegree() <em>Luggage Storage Filling Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStorageFillingDegree()
	 * @generated
	 * @ordered
	 */
	protected double luggageStorageFillingDegree = LUGGAGE_STORAGE_FILLING_DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalLargeBagsStowed() <em>Total Large Bags Stowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLargeBagsStowed()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_LARGE_BAGS_STOWED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalLargeBagsStowed() <em>Total Large Bags Stowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLargeBagsStowed()
	 * @generated
	 * @ordered
	 */
	protected int totalLargeBagsStowed = TOTAL_LARGE_BAGS_STOWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalStorageVolume() <em>Total Storage Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalStorageVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_STORAGE_VOLUME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalStorageVolume() <em>Total Storage Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalStorageVolume()
	 * @generated
	 * @ordered
	 */
	protected double totalStorageVolume = TOTAL_STORAGE_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengersLookingForLuggageSpot() <em>Passengers Looking For Luggage Spot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengersLookingForLuggageSpot()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassengersLookingForLuggageSpot() <em>Passengers Looking For Luggage Spot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengersLookingForLuggageSpot()
	 * @generated
	 * @ordered
	 */
	protected int passengersLookingForLuggageSpot = PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeOfNotStoredLuggageItems() <em>Volume Of Not Stored Luggage Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeOfNotStoredLuggageItems()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolumeOfNotStoredLuggageItems() <em>Volume Of Not Stored Luggage Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeOfNotStoredLuggageItems()
	 * @generated
	 * @ordered
	 */
	protected double volumeOfNotStoredLuggageItems = VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfActivePassengers() <em>Max Number Of Active Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfActivePassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumberOfActivePassengers() <em>Max Number Of Active Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfActivePassengers()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberOfActivePassengers = MAX_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageNumberOfActivePassengers() <em>Average Number Of Active Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageNumberOfActivePassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAverageNumberOfActivePassengers() <em>Average Number Of Active Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageNumberOfActivePassengers()
	 * @generated
	 * @ordered
	 */
	protected int averageNumberOfActivePassengers = AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageNumberOfBags() <em>Average Number Of Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageNumberOfBags()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_NUMBER_OF_BAGS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAverageNumberOfBags() <em>Average Number Of Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageNumberOfBags()
	 * @generated
	 * @ordered
	 */
	protected double averageNumberOfBags = AVERAGE_NUMBER_OF_BAGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SIMULATION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoardingTime() {
		return boardingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingTime(double newBoardingTime) {
		double oldBoardingTime = boardingTime;
		boardingTime = newBoardingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__BOARDING_TIME,
					oldBoardingTime, boardingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassengers() {
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengers(int newPassengers) {
		int oldPassengers = passengers;
		passengers = newPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__PASSENGERS,
					oldPassengers, passengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoardingTimeString() {
		return boardingTimeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingTimeString(String newBoardingTimeString) {
		String oldBoardingTimeString = boardingTimeString;
		boardingTimeString = newBoardingTimeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__BOARDING_TIME_STRING,
					oldBoardingTimeString, boardingTimeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWaymakingSkipped() {
		return waymakingSkipped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaymakingSkipped(int newWaymakingSkipped) {
		int oldWaymakingSkipped = waymakingSkipped;
		waymakingSkipped = newWaymakingSkipped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__WAYMAKING_SKIPPED,
					oldWaymakingSkipped, waymakingSkipped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWaymakingCompleted() {
		return waymakingCompleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaymakingCompleted(int newWaymakingCompleted) {
		int oldWaymakingCompleted = waymakingCompleted;
		waymakingCompleted = newWaymakingCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__WAYMAKING_COMPLETED,
					oldWaymakingCompleted, waymakingCompleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatType getLayoutConceptType() {
		return layoutConceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutConceptType(SeatType newLayoutConceptType) {
		SeatType oldLayoutConceptType = layoutConceptType;
		layoutConceptType = newLayoutConceptType == null ? LAYOUT_CONCEPT_TYPE_EDEFAULT : newLayoutConceptType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE,
					oldLayoutConceptType, layoutConceptType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSimulationTime() {
		return simulationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationTime(double newSimulationTime) {
		double oldSimulationTime = simulationTime;
		simulationTime = newSimulationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__SIMULATION_TIME,
					oldSimulationTime, simulationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNotStoredLuggageItems() {
		return notStoredLuggageItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotStoredLuggageItems(int newNotStoredLuggageItems) {
		int oldNotStoredLuggageItems = notStoredLuggageItems;
		notStoredLuggageItems = newNotStoredLuggageItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS, oldNotStoredLuggageItems,
					notStoredLuggageItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLuggageStorageFillingDegree() {
		return luggageStorageFillingDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuggageStorageFillingDegree(double newLuggageStorageFillingDegree) {
		double oldLuggageStorageFillingDegree = luggageStorageFillingDegree;
		luggageStorageFillingDegree = newLuggageStorageFillingDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE, oldLuggageStorageFillingDegree,
					luggageStorageFillingDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalLargeBagsStowed() {
		return totalLargeBagsStowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLargeBagsStowed(int newTotalLargeBagsStowed) {
		int oldTotalLargeBagsStowed = totalLargeBagsStowed;
		totalLargeBagsStowed = newTotalLargeBagsStowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED, oldTotalLargeBagsStowed,
					totalLargeBagsStowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalStorageVolume() {
		return totalStorageVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalStorageVolume(double newTotalStorageVolume) {
		double oldTotalStorageVolume = totalStorageVolume;
		totalStorageVolume = newTotalStorageVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMULATION_RESULT__TOTAL_STORAGE_VOLUME,
					oldTotalStorageVolume, totalStorageVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassengersLookingForLuggageSpot() {
		return passengersLookingForLuggageSpot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengersLookingForLuggageSpot(int newPassengersLookingForLuggageSpot) {
		int oldPassengersLookingForLuggageSpot = passengersLookingForLuggageSpot;
		passengersLookingForLuggageSpot = newPassengersLookingForLuggageSpot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT,
					oldPassengersLookingForLuggageSpot, passengersLookingForLuggageSpot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolumeOfNotStoredLuggageItems() {
		return volumeOfNotStoredLuggageItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeOfNotStoredLuggageItems(double newVolumeOfNotStoredLuggageItems) {
		double oldVolumeOfNotStoredLuggageItems = volumeOfNotStoredLuggageItems;
		volumeOfNotStoredLuggageItems = newVolumeOfNotStoredLuggageItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS,
					oldVolumeOfNotStoredLuggageItems, volumeOfNotStoredLuggageItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberOfActivePassengers() {
		return maxNumberOfActivePassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfActivePassengers(int newMaxNumberOfActivePassengers) {
		int oldMaxNumberOfActivePassengers = maxNumberOfActivePassengers;
		maxNumberOfActivePassengers = newMaxNumberOfActivePassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS, oldMaxNumberOfActivePassengers,
					maxNumberOfActivePassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAverageNumberOfActivePassengers() {
		return averageNumberOfActivePassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageNumberOfActivePassengers(int newAverageNumberOfActivePassengers) {
		int oldAverageNumberOfActivePassengers = averageNumberOfActivePassengers;
		averageNumberOfActivePassengers = newAverageNumberOfActivePassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS,
					oldAverageNumberOfActivePassengers, averageNumberOfActivePassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverageNumberOfBags() {
		return averageNumberOfBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageNumberOfBags(double newAverageNumberOfBags) {
		double oldAverageNumberOfBags = averageNumberOfBags;
		averageNumberOfBags = newAverageNumberOfBags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS, oldAverageNumberOfBags,
					averageNumberOfBags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME:
			return getBoardingTime();
		case ModelPackage.SIMULATION_RESULT__PASSENGERS:
			return getPassengers();
		case ModelPackage.SIMULATION_RESULT__NAME:
			return getName();
		case ModelPackage.SIMULATION_RESULT__ID:
			return getId();
		case ModelPackage.SIMULATION_RESULT__DATE:
			return getDate();
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
			return getBoardingTimeString();
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_SKIPPED:
			return getWaymakingSkipped();
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_COMPLETED:
			return getWaymakingCompleted();
		case ModelPackage.SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE:
			return getLayoutConceptType();
		case ModelPackage.SIMULATION_RESULT__SIMULATION_TIME:
			return getSimulationTime();
		case ModelPackage.SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS:
			return getNotStoredLuggageItems();
		case ModelPackage.SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE:
			return getLuggageStorageFillingDegree();
		case ModelPackage.SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED:
			return getTotalLargeBagsStowed();
		case ModelPackage.SIMULATION_RESULT__TOTAL_STORAGE_VOLUME:
			return getTotalStorageVolume();
		case ModelPackage.SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT:
			return getPassengersLookingForLuggageSpot();
		case ModelPackage.SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS:
			return getVolumeOfNotStoredLuggageItems();
		case ModelPackage.SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS:
			return getMaxNumberOfActivePassengers();
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS:
			return getAverageNumberOfActivePassengers();
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS:
			return getAverageNumberOfBags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME:
			setBoardingTime((Double) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__PASSENGERS:
			setPassengers((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__ID:
			setId((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__DATE:
			setDate((Date) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
			setBoardingTimeString((String) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_SKIPPED:
			setWaymakingSkipped((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_COMPLETED:
			setWaymakingCompleted((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE:
			setLayoutConceptType((SeatType) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__SIMULATION_TIME:
			setSimulationTime((Double) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS:
			setNotStoredLuggageItems((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE:
			setLuggageStorageFillingDegree((Double) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED:
			setTotalLargeBagsStowed((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__TOTAL_STORAGE_VOLUME:
			setTotalStorageVolume((Double) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT:
			setPassengersLookingForLuggageSpot((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS:
			setVolumeOfNotStoredLuggageItems((Double) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS:
			setMaxNumberOfActivePassengers((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS:
			setAverageNumberOfActivePassengers((Integer) newValue);
			return;
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS:
			setAverageNumberOfBags((Double) newValue);
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
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME:
			setBoardingTime(BOARDING_TIME_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__PASSENGERS:
			setPassengers(PASSENGERS_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__ID:
			setId(ID_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
			setBoardingTimeString(BOARDING_TIME_STRING_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_SKIPPED:
			setWaymakingSkipped(WAYMAKING_SKIPPED_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_COMPLETED:
			setWaymakingCompleted(WAYMAKING_COMPLETED_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE:
			setLayoutConceptType(LAYOUT_CONCEPT_TYPE_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__SIMULATION_TIME:
			setSimulationTime(SIMULATION_TIME_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS:
			setNotStoredLuggageItems(NOT_STORED_LUGGAGE_ITEMS_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE:
			setLuggageStorageFillingDegree(LUGGAGE_STORAGE_FILLING_DEGREE_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED:
			setTotalLargeBagsStowed(TOTAL_LARGE_BAGS_STOWED_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__TOTAL_STORAGE_VOLUME:
			setTotalStorageVolume(TOTAL_STORAGE_VOLUME_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT:
			setPassengersLookingForLuggageSpot(PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS:
			setVolumeOfNotStoredLuggageItems(VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS:
			setMaxNumberOfActivePassengers(MAX_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS:
			setAverageNumberOfActivePassengers(AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT);
			return;
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS:
			setAverageNumberOfBags(AVERAGE_NUMBER_OF_BAGS_EDEFAULT);
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
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME:
			return boardingTime != BOARDING_TIME_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__PASSENGERS:
			return passengers != PASSENGERS_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.SIMULATION_RESULT__ID:
			return id != ID_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case ModelPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
			return BOARDING_TIME_STRING_EDEFAULT == null ? boardingTimeString != null
					: !BOARDING_TIME_STRING_EDEFAULT.equals(boardingTimeString);
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_SKIPPED:
			return waymakingSkipped != WAYMAKING_SKIPPED_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__WAYMAKING_COMPLETED:
			return waymakingCompleted != WAYMAKING_COMPLETED_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE:
			return layoutConceptType != LAYOUT_CONCEPT_TYPE_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__SIMULATION_TIME:
			return simulationTime != SIMULATION_TIME_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS:
			return notStoredLuggageItems != NOT_STORED_LUGGAGE_ITEMS_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE:
			return luggageStorageFillingDegree != LUGGAGE_STORAGE_FILLING_DEGREE_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED:
			return totalLargeBagsStowed != TOTAL_LARGE_BAGS_STOWED_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__TOTAL_STORAGE_VOLUME:
			return totalStorageVolume != TOTAL_STORAGE_VOLUME_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT:
			return passengersLookingForLuggageSpot != PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS:
			return volumeOfNotStoredLuggageItems != VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS:
			return maxNumberOfActivePassengers != MAX_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS:
			return averageNumberOfActivePassengers != AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS_EDEFAULT;
		case ModelPackage.SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS:
			return averageNumberOfBags != AVERAGE_NUMBER_OF_BAGS_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (boardingTime: ");
		result.append(boardingTime);
		result.append(", passengers: ");
		result.append(passengers);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", boardingTimeString: ");
		result.append(boardingTimeString);
		result.append(", waymakingSkipped: ");
		result.append(waymakingSkipped);
		result.append(", waymakingCompleted: ");
		result.append(waymakingCompleted);
		result.append(", layoutConceptType: ");
		result.append(layoutConceptType);
		result.append(", simulationTime: ");
		result.append(simulationTime);
		result.append(", notStoredLuggageItems: ");
		result.append(notStoredLuggageItems);
		result.append(", luggageStorageFillingDegree: ");
		result.append(luggageStorageFillingDegree);
		result.append(", totalLargeBagsStowed: ");
		result.append(totalLargeBagsStowed);
		result.append(", totalStorageVolume: ");
		result.append(totalStorageVolume);
		result.append(", passengersLookingForLuggageSpot: ");
		result.append(passengersLookingForLuggageSpot);
		result.append(", volumeOfNotStoredLuggageItems: ");
		result.append(volumeOfNotStoredLuggageItems);
		result.append(", maxNumberOfActivePassengers: ");
		result.append(maxNumberOfActivePassengers);
		result.append(", averageNumberOfActivePassengers: ");
		result.append(averageNumberOfActivePassengers);
		result.append(", averageNumberOfBags: ");
		result.append(averageNumberOfBags);
		result.append(')');
		return result.toString();
	}

} //SimulationResultImpl
