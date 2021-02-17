/**
 */
package com.paxelerate.model.monuments;

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
 * @see com.paxelerate.model.monuments.MonumentsFactory
 * @model kind="package"
 * @generated
 */
public interface MonumentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "monuments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.paxelerate.core.model/monuments/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.paxelerate.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonumentsPackage eINSTANCE = com.paxelerate.model.monuments.impl.MonumentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.RowImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 0;

	/**
	 * The feature id for the '<em><b>Seat Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SEAT_GROUPS = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.MonumentImpl <em>Monument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.MonumentImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getMonument()
	 * @generated
	 */
	int MONUMENT = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONUMENT__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONUMENT__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Monument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Monument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.SeatGroupImpl <em>Seat Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.SeatGroupImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getSeatGroup()
	 * @generated
	 */
	int SEAT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_GROUP__POSITION = MONUMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_GROUP__SIZE = MONUMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_GROUP__SEATS = MONUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_GROUP__TRAVEL_CLASS = MONUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Seat Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_GROUP_FEATURE_COUNT = MONUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Seat Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_GROUP_OPERATION_COUNT = MONUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.ObstacleImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__POSITION = MONUMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__SIZE = MONUMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__SEATS = MONUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__TRAVEL_CLASS = MONUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = MONUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = MONUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.SeatImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 4;

	/**
	 * The feature id for the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__LETTER = 0;

	/**
	 * The feature id for the '<em><b>Seat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Seat Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__ID = 3;

	/**
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.DoorImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 5;

	/**
	 * The feature id for the '<em><b>Passenger Throughput Per Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__PASSENGER_THROUGHPUT_PER_MINUTE = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Waiting Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__WAITING_PASSENGERS = 2;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__SIDE = 3;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__XPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ID = 5;

	/**
	 * The feature id for the '<em><b>Emergency Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__EMERGENCY_ONLY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.AisleImpl <em>Aisle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.AisleImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getAisle()
	 * @generated
	 */
	int AISLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Ignore For Simulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE__IGNORE_FOR_SIMULATION = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE__PATH = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE__WIDTH = 4;

	/**
	 * The number of structural features of the '<em>Aisle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Aisle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AISLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.monuments.impl.OverheadBinImpl <em>Overhead Bin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.monuments.impl.OverheadBinImpl
	 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getOverheadBin()
	 * @generated
	 */
	int OVERHEAD_BIN = 7;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_BIN__POSITION = MONUMENT__POSITION;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_BIN__SIZE = MONUMENT__SIZE;

	/**
	 * The number of structural features of the '<em>Overhead Bin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_BIN_FEATURE_COUNT = MONUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Overhead Bin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERHEAD_BIN_OPERATION_COUNT = MONUMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see com.paxelerate.model.monuments.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.monuments.Row#getSeatGroups <em>Seat Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seat Groups</em>'.
	 * @see com.paxelerate.model.monuments.Row#getSeatGroups()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_SeatGroups();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.Monument <em>Monument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monument</em>'.
	 * @see com.paxelerate.model.monuments.Monument
	 * @generated
	 */
	EClass getMonument();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.monuments.Monument#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see com.paxelerate.model.monuments.Monument#getPosition()
	 * @see #getMonument()
	 * @generated
	 */
	EReference getMonument_Position();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.monuments.Monument#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see com.paxelerate.model.monuments.Monument#getSize()
	 * @see #getMonument()
	 * @generated
	 */
	EReference getMonument_Size();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.SeatGroup <em>Seat Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat Group</em>'.
	 * @see com.paxelerate.model.monuments.SeatGroup
	 * @generated
	 */
	EClass getSeatGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.monuments.SeatGroup#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seats</em>'.
	 * @see com.paxelerate.model.monuments.SeatGroup#getSeats()
	 * @see #getSeatGroup()
	 * @generated
	 */
	EReference getSeatGroup_Seats();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.SeatGroup#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Class</em>'.
	 * @see com.paxelerate.model.monuments.SeatGroup#getTravelClass()
	 * @see #getSeatGroup()
	 * @generated
	 */
	EAttribute getSeatGroup_TravelClass();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see com.paxelerate.model.monuments.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.monuments.Obstacle#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seats</em>'.
	 * @see com.paxelerate.model.monuments.Obstacle#getSeats()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_Seats();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Obstacle#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Class</em>'.
	 * @see com.paxelerate.model.monuments.Obstacle#getTravelClass()
	 * @see #getObstacle()
	 * @generated
	 */
	EAttribute getObstacle_TravelClass();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see com.paxelerate.model.monuments.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Seat#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter</em>'.
	 * @see com.paxelerate.model.monuments.Seat#getLetter()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Letter();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Seat#getSeatType <em>Seat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Type</em>'.
	 * @see com.paxelerate.model.monuments.Seat#getSeatType()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatType();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Seat#getSeatLocation <em>Seat Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Location</em>'.
	 * @see com.paxelerate.model.monuments.Seat#getSeatLocation()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatLocation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Seat#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.paxelerate.model.monuments.Seat#getId()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Id();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see com.paxelerate.model.monuments.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#getPassengerThroughputPerMinute <em>Passenger Throughput Per Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Throughput Per Minute</em>'.
	 * @see com.paxelerate.model.monuments.Door#getPassengerThroughputPerMinute()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_PassengerThroughputPerMinute();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see com.paxelerate.model.monuments.Door#isActive()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Active();

	/**
	 * Returns the meta object for the reference list '{@link com.paxelerate.model.monuments.Door#getWaitingPassengers <em>Waiting Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waiting Passengers</em>'.
	 * @see com.paxelerate.model.monuments.Door#getWaitingPassengers()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_WaitingPassengers();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see com.paxelerate.model.monuments.Door#getSide()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Side();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see com.paxelerate.model.monuments.Door#getXPosition()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.paxelerate.model.monuments.Door#getId()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#isEmergencyOnly <em>Emergency Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency Only</em>'.
	 * @see com.paxelerate.model.monuments.Door#isEmergencyOnly()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_EmergencyOnly();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Door#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.paxelerate.model.monuments.Door#getType()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Type();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.Aisle <em>Aisle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aisle</em>'.
	 * @see com.paxelerate.model.monuments.Aisle
	 * @generated
	 */
	EClass getAisle();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Aisle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.paxelerate.model.monuments.Aisle#getName()
	 * @see #getAisle()
	 * @generated
	 */
	EAttribute getAisle_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Aisle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.paxelerate.model.monuments.Aisle#getId()
	 * @see #getAisle()
	 * @generated
	 */
	EAttribute getAisle_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Aisle#isIgnoreForSimulation <em>Ignore For Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore For Simulation</em>'.
	 * @see com.paxelerate.model.monuments.Aisle#isIgnoreForSimulation()
	 * @see #getAisle()
	 * @generated
	 */
	EAttribute getAisle_IgnoreForSimulation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.monuments.Aisle#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see com.paxelerate.model.monuments.Aisle#getPath()
	 * @see #getAisle()
	 * @generated
	 */
	EReference getAisle_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.monuments.Aisle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.paxelerate.model.monuments.Aisle#getWidth()
	 * @see #getAisle()
	 * @generated
	 */
	EAttribute getAisle_Width();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.monuments.OverheadBin <em>Overhead Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overhead Bin</em>'.
	 * @see com.paxelerate.model.monuments.OverheadBin
	 * @generated
	 */
	EClass getOverheadBin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MonumentsFactory getMonumentsFactory();

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
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.RowImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Seat Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SEAT_GROUPS = eINSTANCE.getRow_SeatGroups();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.MonumentImpl <em>Monument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.MonumentImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getMonument()
		 * @generated
		 */
		EClass MONUMENT = eINSTANCE.getMonument();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONUMENT__POSITION = eINSTANCE.getMonument_Position();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONUMENT__SIZE = eINSTANCE.getMonument_Size();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.SeatGroupImpl <em>Seat Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.SeatGroupImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getSeatGroup()
		 * @generated
		 */
		EClass SEAT_GROUP = eINSTANCE.getSeatGroup();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT_GROUP__SEATS = eINSTANCE.getSeatGroup_Seats();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT_GROUP__TRAVEL_CLASS = eINSTANCE.getSeatGroup_TravelClass();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.ObstacleImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE__SEATS = eINSTANCE.getObstacle_Seats();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSTACLE__TRAVEL_CLASS = eINSTANCE.getObstacle_TravelClass();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.SeatImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getSeat()
		 * @generated
		 */
		EClass SEAT = eINSTANCE.getSeat();

		/**
		 * The meta object literal for the '<em><b>Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__LETTER = eINSTANCE.getSeat_Letter();

		/**
		 * The meta object literal for the '<em><b>Seat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_TYPE = eINSTANCE.getSeat_SeatType();

		/**
		 * The meta object literal for the '<em><b>Seat Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_LOCATION = eINSTANCE.getSeat_SeatLocation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__ID = eINSTANCE.getSeat_Id();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.DoorImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Passenger Throughput Per Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__PASSENGER_THROUGHPUT_PER_MINUTE = eINSTANCE.getDoor_PassengerThroughputPerMinute();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__ACTIVE = eINSTANCE.getDoor_Active();

		/**
		 * The meta object literal for the '<em><b>Waiting Passengers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__WAITING_PASSENGERS = eINSTANCE.getDoor_WaitingPassengers();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__SIDE = eINSTANCE.getDoor_Side();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__XPOSITION = eINSTANCE.getDoor_XPosition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__ID = eINSTANCE.getDoor_Id();

		/**
		 * The meta object literal for the '<em><b>Emergency Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__EMERGENCY_ONLY = eINSTANCE.getDoor_EmergencyOnly();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__TYPE = eINSTANCE.getDoor_Type();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.AisleImpl <em>Aisle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.AisleImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getAisle()
		 * @generated
		 */
		EClass AISLE = eINSTANCE.getAisle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AISLE__NAME = eINSTANCE.getAisle_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AISLE__ID = eINSTANCE.getAisle_Id();

		/**
		 * The meta object literal for the '<em><b>Ignore For Simulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AISLE__IGNORE_FOR_SIMULATION = eINSTANCE.getAisle_IgnoreForSimulation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AISLE__PATH = eINSTANCE.getAisle_Path();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AISLE__WIDTH = eINSTANCE.getAisle_Width();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.monuments.impl.OverheadBinImpl <em>Overhead Bin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.monuments.impl.OverheadBinImpl
		 * @see com.paxelerate.model.monuments.impl.MonumentsPackageImpl#getOverheadBin()
		 * @generated
		 */
		EClass OVERHEAD_BIN = eINSTANCE.getOverheadBin();

	}

} //MonumentsPackage
