/**
 */
package com.paxelerate.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.paxelerate.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.paxelerate.model.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.impl.SimulationResultImpl
	 * @see com.paxelerate.model.impl.ModelPackageImpl#getSimulationResult()
	 * @generated
	 */
	int SIMULATION_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__BOARDING_TIME = 0;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__PASSENGERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__ID = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__DATE = 4;

	/**
	 * The feature id for the '<em><b>Boarding Time String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__BOARDING_TIME_STRING = 5;

	/**
	 * The feature id for the '<em><b>Waymaking Skipped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__WAYMAKING_SKIPPED = 6;

	/**
	 * The feature id for the '<em><b>Waymaking Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__WAYMAKING_COMPLETED = 7;

	/**
	 * The feature id for the '<em><b>Layout Concept Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Simulation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__SIMULATION_TIME = 9;

	/**
	 * The feature id for the '<em><b>Not Stored Luggage Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS = 10;

	/**
	 * The feature id for the '<em><b>Luggage Storage Filling Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE = 11;

	/**
	 * The feature id for the '<em><b>Total Large Bags Stowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED = 12;

	/**
	 * The feature id for the '<em><b>Total Storage Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__TOTAL_STORAGE_VOLUME = 13;

	/**
	 * The feature id for the '<em><b>Passengers Looking For Luggage Spot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT = 14;

	/**
	 * The feature id for the '<em><b>Volume Of Not Stored Luggage Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS = 15;

	/**
	 * The feature id for the '<em><b>Max Number Of Active Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS = 16;

	/**
	 * The feature id for the '<em><b>Average Number Of Active Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS = 17;

	/**
	 * The feature id for the '<em><b>Average Number Of Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS = 18;

	/**
	 * The number of structural features of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.impl.EPointImpl <em>EPoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.impl.EPointImpl
	 * @see com.paxelerate.model.impl.ModelPackageImpl#getEPoint()
	 * @generated
	 */
	int EPOINT = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPOINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPOINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPOINT__Z = 2;

	/**
	 * The number of structural features of the '<em>EPoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EPoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.impl.DeckImpl <em>Deck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.impl.DeckImpl
	 * @see com.paxelerate.model.impl.ModelPackageImpl#getDeck()
	 * @generated
	 */
	int DECK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__ROWS = 2;

	/**
	 * The feature id for the '<em><b>Obstacles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__OBSTACLES = 3;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__DOORS = 4;

	/**
	 * The feature id for the '<em><b>Aisles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__AISLES = 5;

	/**
	 * The feature id for the '<em><b>Shape Floor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__SHAPE_FLOOR = 6;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK__PASSENGERS = 7;

	/**
	 * The number of structural features of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Deck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.impl.ModelImpl
	 * @see com.paxelerate.model.impl.ModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Deck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DECK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SETTINGS = 2;

	/**
	 * The feature id for the '<em><b>Simulation Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SIMULATION_RESULTS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.SimulationResult <em>Simulation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Result</em>'.
	 * @see com.paxelerate.model.SimulationResult
	 * @generated
	 */
	EClass getSimulationResult();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see com.paxelerate.model.SimulationResult#getBoardingTime()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_BoardingTime();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers</em>'.
	 * @see com.paxelerate.model.SimulationResult#getPassengers()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.paxelerate.model.SimulationResult#getName()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.paxelerate.model.SimulationResult#getId()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.paxelerate.model.SimulationResult#getDate()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time String</em>'.
	 * @see com.paxelerate.model.SimulationResult#getBoardingTimeString()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_BoardingTimeString();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getWaymakingSkipped <em>Waymaking Skipped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waymaking Skipped</em>'.
	 * @see com.paxelerate.model.SimulationResult#getWaymakingSkipped()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_WaymakingSkipped();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getWaymakingCompleted <em>Waymaking Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waymaking Completed</em>'.
	 * @see com.paxelerate.model.SimulationResult#getWaymakingCompleted()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_WaymakingCompleted();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getLayoutConceptType <em>Layout Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Concept Type</em>'.
	 * @see com.paxelerate.model.SimulationResult#getLayoutConceptType()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_LayoutConceptType();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getSimulationTime <em>Simulation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Time</em>'.
	 * @see com.paxelerate.model.SimulationResult#getSimulationTime()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_SimulationTime();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getNotStoredLuggageItems <em>Not Stored Luggage Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Stored Luggage Items</em>'.
	 * @see com.paxelerate.model.SimulationResult#getNotStoredLuggageItems()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_NotStoredLuggageItems();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getLuggageStorageFillingDegree <em>Luggage Storage Filling Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Storage Filling Degree</em>'.
	 * @see com.paxelerate.model.SimulationResult#getLuggageStorageFillingDegree()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_LuggageStorageFillingDegree();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getTotalLargeBagsStowed <em>Total Large Bags Stowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Large Bags Stowed</em>'.
	 * @see com.paxelerate.model.SimulationResult#getTotalLargeBagsStowed()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_TotalLargeBagsStowed();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getTotalStorageVolume <em>Total Storage Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Storage Volume</em>'.
	 * @see com.paxelerate.model.SimulationResult#getTotalStorageVolume()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_TotalStorageVolume();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getPassengersLookingForLuggageSpot <em>Passengers Looking For Luggage Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers Looking For Luggage Spot</em>'.
	 * @see com.paxelerate.model.SimulationResult#getPassengersLookingForLuggageSpot()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_PassengersLookingForLuggageSpot();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getVolumeOfNotStoredLuggageItems <em>Volume Of Not Stored Luggage Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume Of Not Stored Luggage Items</em>'.
	 * @see com.paxelerate.model.SimulationResult#getVolumeOfNotStoredLuggageItems()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_VolumeOfNotStoredLuggageItems();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getMaxNumberOfActivePassengers <em>Max Number Of Active Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Active Passengers</em>'.
	 * @see com.paxelerate.model.SimulationResult#getMaxNumberOfActivePassengers()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_MaxNumberOfActivePassengers();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getAverageNumberOfActivePassengers <em>Average Number Of Active Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Number Of Active Passengers</em>'.
	 * @see com.paxelerate.model.SimulationResult#getAverageNumberOfActivePassengers()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_AverageNumberOfActivePassengers();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.SimulationResult#getAverageNumberOfBags <em>Average Number Of Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Number Of Bags</em>'.
	 * @see com.paxelerate.model.SimulationResult#getAverageNumberOfBags()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_AverageNumberOfBags();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.EPoint <em>EPoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPoint</em>'.
	 * @see com.paxelerate.model.EPoint
	 * @generated
	 */
	EClass getEPoint();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.EPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.paxelerate.model.EPoint#getX()
	 * @see #getEPoint()
	 * @generated
	 */
	EAttribute getEPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.EPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.paxelerate.model.EPoint#getY()
	 * @see #getEPoint()
	 * @generated
	 */
	EAttribute getEPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.EPoint#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see com.paxelerate.model.EPoint#getZ()
	 * @see #getEPoint()
	 * @generated
	 */
	EAttribute getEPoint_Z();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.Deck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deck</em>'.
	 * @see com.paxelerate.model.Deck
	 * @generated
	 */
	EClass getDeck();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.Deck#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.paxelerate.model.Deck#getName()
	 * @see #getDeck()
	 * @generated
	 */
	EAttribute getDeck_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.Deck#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.paxelerate.model.Deck#getHeight()
	 * @see #getDeck()
	 * @generated
	 */
	EAttribute getDeck_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Deck#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see com.paxelerate.model.Deck#getRows()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Rows();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Deck#getObstacles <em>Obstacles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obstacles</em>'.
	 * @see com.paxelerate.model.Deck#getObstacles()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Obstacles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Deck#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doors</em>'.
	 * @see com.paxelerate.model.Deck#getDoors()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Doors();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Deck#getAisles <em>Aisles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aisles</em>'.
	 * @see com.paxelerate.model.Deck#getAisles()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Aisles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Deck#getShapeFloor <em>Shape Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shape Floor</em>'.
	 * @see com.paxelerate.model.Deck#getShapeFloor()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_ShapeFloor();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Deck#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passengers</em>'.
	 * @see com.paxelerate.model.Deck#getPassengers()
	 * @see #getDeck()
	 * @generated
	 */
	EReference getDeck_Passengers();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.paxelerate.model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.Model#getDeck <em>Deck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deck</em>'.
	 * @see com.paxelerate.model.Model#getDeck()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Deck();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.paxelerate.model.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.Model#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see com.paxelerate.model.Model#getSettings()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Settings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.Model#getSimulationResults <em>Simulation Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simulation Results</em>'.
	 * @see com.paxelerate.model.Model#getSimulationResults()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_SimulationResults();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.paxelerate.model.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.impl.SimulationResultImpl
		 * @see com.paxelerate.model.impl.ModelPackageImpl#getSimulationResult()
		 * @generated
		 */
		EClass SIMULATION_RESULT = eINSTANCE.getSimulationResult();

		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__BOARDING_TIME = eINSTANCE.getSimulationResult_BoardingTime();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__PASSENGERS = eINSTANCE.getSimulationResult_Passengers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__NAME = eINSTANCE.getSimulationResult_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__ID = eINSTANCE.getSimulationResult_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__DATE = eINSTANCE.getSimulationResult_Date();

		/**
		 * The meta object literal for the '<em><b>Boarding Time String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__BOARDING_TIME_STRING = eINSTANCE.getSimulationResult_BoardingTimeString();

		/**
		 * The meta object literal for the '<em><b>Waymaking Skipped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__WAYMAKING_SKIPPED = eINSTANCE.getSimulationResult_WaymakingSkipped();

		/**
		 * The meta object literal for the '<em><b>Waymaking Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__WAYMAKING_COMPLETED = eINSTANCE.getSimulationResult_WaymakingCompleted();

		/**
		 * The meta object literal for the '<em><b>Layout Concept Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE = eINSTANCE.getSimulationResult_LayoutConceptType();

		/**
		 * The meta object literal for the '<em><b>Simulation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__SIMULATION_TIME = eINSTANCE.getSimulationResult_SimulationTime();

		/**
		 * The meta object literal for the '<em><b>Not Stored Luggage Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS = eINSTANCE.getSimulationResult_NotStoredLuggageItems();

		/**
		 * The meta object literal for the '<em><b>Luggage Storage Filling Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE = eINSTANCE
				.getSimulationResult_LuggageStorageFillingDegree();

		/**
		 * The meta object literal for the '<em><b>Total Large Bags Stowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED = eINSTANCE.getSimulationResult_TotalLargeBagsStowed();

		/**
		 * The meta object literal for the '<em><b>Total Storage Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__TOTAL_STORAGE_VOLUME = eINSTANCE.getSimulationResult_TotalStorageVolume();

		/**
		 * The meta object literal for the '<em><b>Passengers Looking For Luggage Spot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT = eINSTANCE
				.getSimulationResult_PassengersLookingForLuggageSpot();

		/**
		 * The meta object literal for the '<em><b>Volume Of Not Stored Luggage Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS = eINSTANCE
				.getSimulationResult_VolumeOfNotStoredLuggageItems();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Active Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS = eINSTANCE
				.getSimulationResult_MaxNumberOfActivePassengers();

		/**
		 * The meta object literal for the '<em><b>Average Number Of Active Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS = eINSTANCE
				.getSimulationResult_AverageNumberOfActivePassengers();

		/**
		 * The meta object literal for the '<em><b>Average Number Of Bags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS = eINSTANCE.getSimulationResult_AverageNumberOfBags();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.impl.EPointImpl <em>EPoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.impl.EPointImpl
		 * @see com.paxelerate.model.impl.ModelPackageImpl#getEPoint()
		 * @generated
		 */
		EClass EPOINT = eINSTANCE.getEPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPOINT__X = eINSTANCE.getEPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPOINT__Y = eINSTANCE.getEPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPOINT__Z = eINSTANCE.getEPoint_Z();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.impl.DeckImpl <em>Deck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.impl.DeckImpl
		 * @see com.paxelerate.model.impl.ModelPackageImpl#getDeck()
		 * @generated
		 */
		EClass DECK = eINSTANCE.getDeck();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECK__NAME = eINSTANCE.getDeck_Name();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECK__HEIGHT = eINSTANCE.getDeck_Height();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__ROWS = eINSTANCE.getDeck_Rows();

		/**
		 * The meta object literal for the '<em><b>Obstacles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__OBSTACLES = eINSTANCE.getDeck_Obstacles();

		/**
		 * The meta object literal for the '<em><b>Doors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__DOORS = eINSTANCE.getDeck_Doors();

		/**
		 * The meta object literal for the '<em><b>Aisles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__AISLES = eINSTANCE.getDeck_Aisles();

		/**
		 * The meta object literal for the '<em><b>Shape Floor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__SHAPE_FLOOR = eINSTANCE.getDeck_ShapeFloor();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECK__PASSENGERS = eINSTANCE.getDeck_Passengers();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.impl.ModelImpl
		 * @see com.paxelerate.model.impl.ModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Deck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DECK = eINSTANCE.getModel_Deck();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SETTINGS = eINSTANCE.getModel_Settings();

		/**
		 * The meta object literal for the '<em><b>Simulation Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SIMULATION_RESULTS = eINSTANCE.getModel_SimulationResults();

	}

} //ModelPackage
