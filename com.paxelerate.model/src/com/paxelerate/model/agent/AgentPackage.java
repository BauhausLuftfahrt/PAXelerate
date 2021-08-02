/**
 */
package com.paxelerate.model.agent;

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
 * @see com.paxelerate.model.agent.AgentFactory
 * @model kind="package"
 * @generated
 */
public interface AgentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.paxelerate.core.model/agent/";

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
	AgentPackage eINSTANCE = com.paxelerate.model.agent.impl.AgentPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.paxelerate.model.agent.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.agent.impl.PassengerImpl
	 * @see com.paxelerate.model.agent.impl.AgentPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__GENDER = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__AGE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DOOR = 5;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__BOARDING_TIME = 6;

	/**
	 * The feature id for the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WIDTH = 8;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DEPTH = 9;

	/**
	 * The feature id for the '<em><b>Is Seated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__IS_SEATED = 10;

	/**
	 * The feature id for the '<em><b>Walking Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WALKING_SPEED = 11;

	/**
	 * The feature id for the '<em><b>Start Boarding After Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__START_BOARDING_AFTER_DELAY = 12;

	/**
	 * The feature id for the '<em><b>Passenger Mood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PASSENGER_MOOD = 13;

	/**
	 * The feature id for the '<em><b>Number Of Waits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_WAITS = 14;

	/**
	 * The feature id for the '<em><b>Number Of Make Way Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS = 15;

	/**
	 * The feature id for the '<em><b>Distance Walked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DISTANCE_WALKED = 16;

	/**
	 * The feature id for the '<em><b>Cost Of Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COST_OF_PATH = 17;

	/**
	 * The feature id for the '<em><b>Total Time Waited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__TOTAL_TIME_WAITED = 18;

	/**
	 * The feature id for the '<em><b>Luggage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE = 19;

	/**
	 * The feature id for the '<em><b>Passing Decision Cost Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PASSING_DECISION_COST_FACTOR = 20;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PATH = 21;

	/**
	 * The feature id for the '<em><b>Speed On Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SPEED_ON_PATH = 22;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__CURRENT_POSITION = 23;

	/**
	 * The feature id for the '<em><b>Desired Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DESIRED_POSITION = 24;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__START_POSITION = 25;

	/**
	 * The feature id for the '<em><b>Goal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__GOAL_POSITION = 26;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__STATE = 27;

	/**
	 * The feature id for the '<em><b>Width Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WIDTH_BOTTOM = 28;

	/**
	 * The feature id for the '<em><b>Width Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WIDTH_MIDDLE = 29;

	/**
	 * The feature id for the '<em><b>Width Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WIDTH_TOP = 30;

	/**
	 * The feature id for the '<em><b>Depth Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DEPTH_BOTTOM = 31;

	/**
	 * The feature id for the '<em><b>Depth Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DEPTH_MIDDLE = 32;

	/**
	 * The feature id for the '<em><b>Depth Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DEPTH_TOP = 33;

	/**
	 * The feature id for the '<em><b>Height Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HEIGHT_BOTTOM = 34;

	/**
	 * The feature id for the '<em><b>Height Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HEIGHT_MIDDLE = 35;

	/**
	 * The feature id for the '<em><b>Height Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HEIGHT_TOP = 36;

	/**
	 * The feature id for the '<em><b>Covid Total Number Of Contacts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS = 37;

	/**
	 * The feature id for the '<em><b>Covid Average Distance To Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS = 38;

	/**
	 * The feature id for the '<em><b>Covid Minimum Distance To Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS = 39;

	/**
	 * The feature id for the '<em><b>Covid Average Duration Of Contacts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS = 40;

	/**
	 * The feature id for the '<em><b>Covid Maximum Duration Of Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT = 41;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.agent.impl.LuggageImpl <em>Luggage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.agent.impl.LuggageImpl
	 * @see com.paxelerate.model.agent.impl.AgentPackageImpl#getLuggage()
	 * @generated
	 */
	int LUGGAGE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Stow Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__STOW_TIME = 1;

	/**
	 * The feature id for the '<em><b>Stow Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__STOW_DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__VOLUME = 4;

	/**
	 * The number of structural features of the '<em>Luggage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Luggage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.agent.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see com.paxelerate.model.agent.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getId()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getGender()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Gender();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getHeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getAge()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Age();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getWeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Weight();

	/**
	 * Returns the meta object for the reference '{@link com.paxelerate.model.agent.Passenger#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDoor()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Door();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getBoardingTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_BoardingTime();

	/**
	 * Returns the meta object for the reference '{@link com.paxelerate.model.agent.Passenger#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getSeat()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Seat();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getWidth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDepth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Depth();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#isIsSeated <em>Is Seated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Seated</em>'.
	 * @see com.paxelerate.model.agent.Passenger#isIsSeated()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_IsSeated();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getWalkingSpeed <em>Walking Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Walking Speed</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getWalkingSpeed()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WalkingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Boarding After Delay</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getStartBoardingAfterDelay()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_StartBoardingAfterDelay();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getPassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Mood</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getPassengerMood()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PassengerMood();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getNumberOfWaits <em>Number Of Waits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Waits</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getNumberOfWaits()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfWaits();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getNumberOfMakeWayOperations <em>Number Of Make Way Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Make Way Operations</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getNumberOfMakeWayOperations()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfMakeWayOperations();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getDistanceWalked <em>Distance Walked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Walked</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDistanceWalked()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_DistanceWalked();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getCostOfPath <em>Cost Of Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Of Path</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCostOfPath()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CostOfPath();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getTotalTimeWaited <em>Total Time Waited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time Waited</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getTotalTimeWaited()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_TotalTimeWaited();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.agent.Passenger#getLuggage <em>Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Luggage</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getLuggage()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Luggage();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getPassingDecisionCostFactor <em>Passing Decision Cost Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passing Decision Cost Factor</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getPassingDecisionCostFactor()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PassingDecisionCostFactor();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.agent.Passenger#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Path</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getPath()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Path();

	/**
	 * Returns the meta object for the attribute list '{@link com.paxelerate.model.agent.Passenger#getSpeedOnPath <em>Speed On Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Speed On Path</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getSpeedOnPath()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_SpeedOnPath();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.agent.Passenger#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Position</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCurrentPosition()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_CurrentPosition();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.agent.Passenger#getDesiredPosition <em>Desired Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Desired Position</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDesiredPosition()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_DesiredPosition();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.agent.Passenger#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Position</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getStartPosition()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_StartPosition();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.agent.Passenger#getGoalPosition <em>Goal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal Position</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getGoalPosition()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_GoalPosition();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getState()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_State();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getWidthBottom <em>Width Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Bottom</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getWidthBottom()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WidthBottom();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getWidthMiddle <em>Width Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Middle</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getWidthMiddle()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WidthMiddle();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getWidthTop <em>Width Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Top</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getWidthTop()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WidthTop();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getDepthBottom <em>Depth Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Bottom</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDepthBottom()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_DepthBottom();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getDepthMiddle <em>Depth Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Middle</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDepthMiddle()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_DepthMiddle();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getDepthTop <em>Depth Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth Top</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getDepthTop()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_DepthTop();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getHeightBottom <em>Height Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Bottom</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getHeightBottom()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_HeightBottom();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getHeightMiddle <em>Height Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Middle</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getHeightMiddle()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_HeightMiddle();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getHeightTop <em>Height Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Top</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getHeightTop()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_HeightTop();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getCovidTotalNumberOfContacts <em>Covid Total Number Of Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covid Total Number Of Contacts</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCovidTotalNumberOfContacts()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CovidTotalNumberOfContacts();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getCovidAverageDistanceToPassengers <em>Covid Average Distance To Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covid Average Distance To Passengers</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCovidAverageDistanceToPassengers()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CovidAverageDistanceToPassengers();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getCovidMinimumDistanceToPassengers <em>Covid Minimum Distance To Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covid Minimum Distance To Passengers</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCovidMinimumDistanceToPassengers()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CovidMinimumDistanceToPassengers();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getCovidAverageDurationOfContacts <em>Covid Average Duration Of Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covid Average Duration Of Contacts</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCovidAverageDurationOfContacts()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CovidAverageDurationOfContacts();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Passenger#getCovidMaximumDurationOfContact <em>Covid Maximum Duration Of Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Covid Maximum Duration Of Contact</em>'.
	 * @see com.paxelerate.model.agent.Passenger#getCovidMaximumDurationOfContact()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CovidMaximumDurationOfContact();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.agent.Luggage <em>Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage</em>'.
	 * @see com.paxelerate.model.agent.Luggage
	 * @generated
	 */
	EClass getLuggage();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Luggage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.paxelerate.model.agent.Luggage#getId()
	 * @see #getLuggage()
	 * @generated
	 */
	EAttribute getLuggage_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Luggage#getStowTime <em>Stow Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stow Time</em>'.
	 * @see com.paxelerate.model.agent.Luggage#getStowTime()
	 * @see #getLuggage()
	 * @generated
	 */
	EAttribute getLuggage_StowTime();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Luggage#getStowDistance <em>Stow Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stow Distance</em>'.
	 * @see com.paxelerate.model.agent.Luggage#getStowDistance()
	 * @see #getLuggage()
	 * @generated
	 */
	EAttribute getLuggage_StowDistance();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Luggage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.paxelerate.model.agent.Luggage#getType()
	 * @see #getLuggage()
	 * @generated
	 */
	EAttribute getLuggage_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.agent.Luggage#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see com.paxelerate.model.agent.Luggage#getVolume()
	 * @see #getLuggage()
	 * @generated
	 */
	EAttribute getLuggage_Volume();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgentFactory getAgentFactory();

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
		 * The meta object literal for the '{@link com.paxelerate.model.agent.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.agent.impl.PassengerImpl
		 * @see com.paxelerate.model.agent.impl.AgentPackageImpl#getPassenger()
		 * @generated
		 */
		EClass PASSENGER = eINSTANCE.getPassenger();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__ID = eINSTANCE.getPassenger_Id();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__GENDER = eINSTANCE.getPassenger_Gender();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__HEIGHT = eINSTANCE.getPassenger_Height();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__AGE = eINSTANCE.getPassenger_Age();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WEIGHT = eINSTANCE.getPassenger_Weight();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__DOOR = eINSTANCE.getPassenger_Door();

		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__BOARDING_TIME = eINSTANCE.getPassenger_BoardingTime();

		/**
		 * The meta object literal for the '<em><b>Seat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__SEAT = eINSTANCE.getPassenger_Seat();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WIDTH = eINSTANCE.getPassenger_Width();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DEPTH = eINSTANCE.getPassenger_Depth();

		/**
		 * The meta object literal for the '<em><b>Is Seated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__IS_SEATED = eINSTANCE.getPassenger_IsSeated();

		/**
		 * The meta object literal for the '<em><b>Walking Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WALKING_SPEED = eINSTANCE.getPassenger_WalkingSpeed();

		/**
		 * The meta object literal for the '<em><b>Start Boarding After Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__START_BOARDING_AFTER_DELAY = eINSTANCE.getPassenger_StartBoardingAfterDelay();

		/**
		 * The meta object literal for the '<em><b>Passenger Mood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__PASSENGER_MOOD = eINSTANCE.getPassenger_PassengerMood();

		/**
		 * The meta object literal for the '<em><b>Number Of Waits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__NUMBER_OF_WAITS = eINSTANCE.getPassenger_NumberOfWaits();

		/**
		 * The meta object literal for the '<em><b>Number Of Make Way Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS = eINSTANCE.getPassenger_NumberOfMakeWayOperations();

		/**
		 * The meta object literal for the '<em><b>Distance Walked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DISTANCE_WALKED = eINSTANCE.getPassenger_DistanceWalked();

		/**
		 * The meta object literal for the '<em><b>Cost Of Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COST_OF_PATH = eINSTANCE.getPassenger_CostOfPath();

		/**
		 * The meta object literal for the '<em><b>Total Time Waited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__TOTAL_TIME_WAITED = eINSTANCE.getPassenger_TotalTimeWaited();

		/**
		 * The meta object literal for the '<em><b>Luggage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__LUGGAGE = eINSTANCE.getPassenger_Luggage();

		/**
		 * The meta object literal for the '<em><b>Passing Decision Cost Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__PASSING_DECISION_COST_FACTOR = eINSTANCE.getPassenger_PassingDecisionCostFactor();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__PATH = eINSTANCE.getPassenger_Path();

		/**
		 * The meta object literal for the '<em><b>Speed On Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__SPEED_ON_PATH = eINSTANCE.getPassenger_SpeedOnPath();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__CURRENT_POSITION = eINSTANCE.getPassenger_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Desired Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__DESIRED_POSITION = eINSTANCE.getPassenger_DesiredPosition();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__START_POSITION = eINSTANCE.getPassenger_StartPosition();

		/**
		 * The meta object literal for the '<em><b>Goal Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__GOAL_POSITION = eINSTANCE.getPassenger_GoalPosition();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__STATE = eINSTANCE.getPassenger_State();

		/**
		 * The meta object literal for the '<em><b>Width Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WIDTH_BOTTOM = eINSTANCE.getPassenger_WidthBottom();

		/**
		 * The meta object literal for the '<em><b>Width Middle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WIDTH_MIDDLE = eINSTANCE.getPassenger_WidthMiddle();

		/**
		 * The meta object literal for the '<em><b>Width Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WIDTH_TOP = eINSTANCE.getPassenger_WidthTop();

		/**
		 * The meta object literal for the '<em><b>Depth Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DEPTH_BOTTOM = eINSTANCE.getPassenger_DepthBottom();

		/**
		 * The meta object literal for the '<em><b>Depth Middle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DEPTH_MIDDLE = eINSTANCE.getPassenger_DepthMiddle();

		/**
		 * The meta object literal for the '<em><b>Depth Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DEPTH_TOP = eINSTANCE.getPassenger_DepthTop();

		/**
		 * The meta object literal for the '<em><b>Height Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__HEIGHT_BOTTOM = eINSTANCE.getPassenger_HeightBottom();

		/**
		 * The meta object literal for the '<em><b>Height Middle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__HEIGHT_MIDDLE = eINSTANCE.getPassenger_HeightMiddle();

		/**
		 * The meta object literal for the '<em><b>Height Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__HEIGHT_TOP = eINSTANCE.getPassenger_HeightTop();

		/**
		 * The meta object literal for the '<em><b>Covid Total Number Of Contacts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS = eINSTANCE.getPassenger_CovidTotalNumberOfContacts();

		/**
		 * The meta object literal for the '<em><b>Covid Average Distance To Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS = eINSTANCE
				.getPassenger_CovidAverageDistanceToPassengers();

		/**
		 * The meta object literal for the '<em><b>Covid Minimum Distance To Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS = eINSTANCE
				.getPassenger_CovidMinimumDistanceToPassengers();

		/**
		 * The meta object literal for the '<em><b>Covid Average Duration Of Contacts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS = eINSTANCE
				.getPassenger_CovidAverageDurationOfContacts();

		/**
		 * The meta object literal for the '<em><b>Covid Maximum Duration Of Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT = eINSTANCE
				.getPassenger_CovidMaximumDurationOfContact();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.agent.impl.LuggageImpl <em>Luggage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.agent.impl.LuggageImpl
		 * @see com.paxelerate.model.agent.impl.AgentPackageImpl#getLuggage()
		 * @generated
		 */
		EClass LUGGAGE = eINSTANCE.getLuggage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE__ID = eINSTANCE.getLuggage_Id();

		/**
		 * The meta object literal for the '<em><b>Stow Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE__STOW_TIME = eINSTANCE.getLuggage_StowTime();

		/**
		 * The meta object literal for the '<em><b>Stow Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE__STOW_DISTANCE = eINSTANCE.getLuggage_StowDistance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE__TYPE = eINSTANCE.getLuggage_Type();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE__VOLUME = eINSTANCE.getLuggage_Volume();

	}

} //AgentPackage
