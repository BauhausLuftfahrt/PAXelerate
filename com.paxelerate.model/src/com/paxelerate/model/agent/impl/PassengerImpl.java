/**
 */
package com.paxelerate.model.agent.impl;

import com.paxelerate.model.EPoint;

import com.paxelerate.model.agent.AgentPackage;
import com.paxelerate.model.agent.Luggage;
import com.paxelerate.model.agent.Passenger;

import com.paxelerate.model.enums.Gender;
import com.paxelerate.model.enums.PassengerMood;
import com.paxelerate.model.enums.State;

import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Seat;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getAge <em>Age</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDoor <em>Door</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getSeat <em>Seat</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#isIsSeated <em>Is Seated</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getWalkingSpeed <em>Walking Speed</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getPassengerMood <em>Passenger Mood</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getNumberOfWaits <em>Number Of Waits</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getNumberOfMakeWayOperations <em>Number Of Make Way Operations</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDistanceWalked <em>Distance Walked</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCostOfPath <em>Cost Of Path</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getTotalTimeWaited <em>Total Time Waited</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getLuggage <em>Luggage</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getPassingDecisionCostFactor <em>Passing Decision Cost Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getSpeedOnPath <em>Speed On Path</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDesiredPosition <em>Desired Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getGoalPosition <em>Goal Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getState <em>State</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getWidthBottom <em>Width Bottom</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getWidthMiddle <em>Width Middle</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getWidthTop <em>Width Top</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDepthBottom <em>Depth Bottom</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDepthMiddle <em>Depth Middle</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getDepthTop <em>Depth Top</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getHeightBottom <em>Height Bottom</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getHeightMiddle <em>Height Middle</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getHeightTop <em>Height Top</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCovidTotalNumberOfContacts <em>Covid Total Number Of Contacts</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCovidAverageDistanceToPassengers <em>Covid Average Distance To Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCovidMinimumDistanceToPassengers <em>Covid Minimum Distance To Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCovidAverageDurationOfContacts <em>Covid Average Duration Of Contacts</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.PassengerImpl#getCovidMaximumDurationOfContact <em>Covid Maximum Duration Of Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerImpl extends MinimalEObjectImpl.Container implements Passenger {
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
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.FEMALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected Door door;

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
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected Seat seat;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected double depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSeated() <em>Is Seated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSeated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSeated() <em>Is Seated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSeated()
	 * @generated
	 * @ordered
	 */
	protected boolean isSeated = IS_SEATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWalkingSpeed() <em>Walking Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalkingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double WALKING_SPEED_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getWalkingSpeed() <em>Walking Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalkingSpeed()
	 * @generated
	 * @ordered
	 */
	protected double walkingSpeed = WALKING_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartBoardingAfterDelay() <em>Start Boarding After Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double START_BOARDING_AFTER_DELAY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getStartBoardingAfterDelay() <em>Start Boarding After Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 * @ordered
	 */
	protected double startBoardingAfterDelay = START_BOARDING_AFTER_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerMood() <em>Passenger Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMood()
	 * @generated
	 * @ordered
	 */
	protected static final PassengerMood PASSENGER_MOOD_EDEFAULT = PassengerMood.AGGRESSIVE;

	/**
	 * The cached value of the '{@link #getPassengerMood() <em>Passenger Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMood()
	 * @generated
	 * @ordered
	 */
	protected PassengerMood passengerMood = PASSENGER_MOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfWaits() <em>Number Of Waits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWaits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_WAITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfWaits() <em>Number Of Waits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWaits()
	 * @generated
	 * @ordered
	 */
	protected int numberOfWaits = NUMBER_OF_WAITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfMakeWayOperations() <em>Number Of Make Way Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMakeWayOperations()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_MAKE_WAY_OPERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfMakeWayOperations() <em>Number Of Make Way Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMakeWayOperations()
	 * @generated
	 * @ordered
	 */
	protected int numberOfMakeWayOperations = NUMBER_OF_MAKE_WAY_OPERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistanceWalked() <em>Distance Walked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceWalked()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_WALKED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistanceWalked() <em>Distance Walked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceWalked()
	 * @generated
	 * @ordered
	 */
	protected double distanceWalked = DISTANCE_WALKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostOfPath() <em>Cost Of Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostOfPath()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_OF_PATH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCostOfPath() <em>Cost Of Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostOfPath()
	 * @generated
	 * @ordered
	 */
	protected int costOfPath = COST_OF_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalTimeWaited() <em>Total Time Waited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeWaited()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_TIME_WAITED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalTimeWaited() <em>Total Time Waited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeWaited()
	 * @generated
	 * @ordered
	 */
	protected double totalTimeWaited = TOTAL_TIME_WAITED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLuggage() <em>Luggage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggage()
	 * @generated
	 * @ordered
	 */
	protected EList<Luggage> luggage;

	/**
	 * The default value of the '{@link #getPassingDecisionCostFactor() <em>Passing Decision Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingDecisionCostFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSING_DECISION_COST_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPassingDecisionCostFactor() <em>Passing Decision Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingDecisionCostFactor()
	 * @generated
	 * @ordered
	 */
	protected double passingDecisionCostFactor = PASSING_DECISION_COST_FACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<EPoint> path;

	/**
	 * The cached value of the '{@link #getSpeedOnPath() <em>Speed On Path</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOnPath()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> speedOnPath;

	/**
	 * The cached value of the '{@link #getCurrentPosition() <em>Current Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPosition()
	 * @generated
	 * @ordered
	 */
	protected EPoint currentPosition;

	/**
	 * The cached value of the '{@link #getDesiredPosition() <em>Desired Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredPosition()
	 * @generated
	 * @ordered
	 */
	protected EPoint desiredPosition;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected EPoint startPosition;

	/**
	 * The cached value of the '{@link #getGoalPosition() <em>Goal Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalPosition()
	 * @generated
	 * @ordered
	 */
	protected EPoint goalPosition;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.FOLLOW_PATH;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthBottom() <em>Width Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthBottom()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_BOTTOM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidthBottom() <em>Width Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthBottom()
	 * @generated
	 * @ordered
	 */
	protected double widthBottom = WIDTH_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthMiddle() <em>Width Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthMiddle()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_MIDDLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidthMiddle() <em>Width Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthMiddle()
	 * @generated
	 * @ordered
	 */
	protected double widthMiddle = WIDTH_MIDDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthTop() <em>Width Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthTop()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidthTop() <em>Width Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthTop()
	 * @generated
	 * @ordered
	 */
	protected double widthTop = WIDTH_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthBottom() <em>Depth Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthBottom()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_BOTTOM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepthBottom() <em>Depth Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthBottom()
	 * @generated
	 * @ordered
	 */
	protected double depthBottom = DEPTH_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthMiddle() <em>Depth Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthMiddle()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_MIDDLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepthMiddle() <em>Depth Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthMiddle()
	 * @generated
	 * @ordered
	 */
	protected double depthMiddle = DEPTH_MIDDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthTop() <em>Depth Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthTop()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepthTop() <em>Depth Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthTop()
	 * @generated
	 * @ordered
	 */
	protected double depthTop = DEPTH_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightBottom() <em>Height Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightBottom()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_BOTTOM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeightBottom() <em>Height Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightBottom()
	 * @generated
	 * @ordered
	 */
	protected double heightBottom = HEIGHT_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightMiddle() <em>Height Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightMiddle()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_MIDDLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeightMiddle() <em>Height Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightMiddle()
	 * @generated
	 * @ordered
	 */
	protected double heightMiddle = HEIGHT_MIDDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightTop() <em>Height Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightTop()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeightTop() <em>Height Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightTop()
	 * @generated
	 * @ordered
	 */
	protected double heightTop = HEIGHT_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCovidTotalNumberOfContacts() <em>Covid Total Number Of Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidTotalNumberOfContacts()
	 * @generated
	 * @ordered
	 */
	protected static final double COVID_TOTAL_NUMBER_OF_CONTACTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCovidTotalNumberOfContacts() <em>Covid Total Number Of Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidTotalNumberOfContacts()
	 * @generated
	 * @ordered
	 */
	protected double covidTotalNumberOfContacts = COVID_TOTAL_NUMBER_OF_CONTACTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCovidAverageDistanceToPassengers() <em>Covid Average Distance To Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidAverageDistanceToPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final double COVID_AVERAGE_DISTANCE_TO_PASSENGERS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCovidAverageDistanceToPassengers() <em>Covid Average Distance To Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidAverageDistanceToPassengers()
	 * @generated
	 * @ordered
	 */
	protected double covidAverageDistanceToPassengers = COVID_AVERAGE_DISTANCE_TO_PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCovidMinimumDistanceToPassengers() <em>Covid Minimum Distance To Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidMinimumDistanceToPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final double COVID_MINIMUM_DISTANCE_TO_PASSENGERS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCovidMinimumDistanceToPassengers() <em>Covid Minimum Distance To Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidMinimumDistanceToPassengers()
	 * @generated
	 * @ordered
	 */
	protected double covidMinimumDistanceToPassengers = COVID_MINIMUM_DISTANCE_TO_PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCovidAverageDurationOfContacts() <em>Covid Average Duration Of Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidAverageDurationOfContacts()
	 * @generated
	 * @ordered
	 */
	protected static final double COVID_AVERAGE_DURATION_OF_CONTACTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCovidAverageDurationOfContacts() <em>Covid Average Duration Of Contacts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidAverageDurationOfContacts()
	 * @generated
	 * @ordered
	 */
	protected double covidAverageDurationOfContacts = COVID_AVERAGE_DURATION_OF_CONTACTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCovidMaximumDurationOfContact() <em>Covid Maximum Duration Of Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidMaximumDurationOfContact()
	 * @generated
	 * @ordered
	 */
	protected static final double COVID_MAXIMUM_DURATION_OF_CONTACT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCovidMaximumDurationOfContact() <em>Covid Maximum Duration Of Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovidMaximumDurationOfContact()
	 * @generated
	 * @ordered
	 */
	protected double covidMaximumDurationOfContact = COVID_MAXIMUM_DURATION_OF_CONTACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.PASSENGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (door != null && door.eIsProxy()) {
			InternalEObject oldDoor = (InternalEObject) door;
			door = (Door) eResolveProxy(oldDoor);
			if (door != oldDoor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentPackage.PASSENGER__DOOR, oldDoor,
							door));
			}
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door basicGetDoor() {
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		Door oldDoor = door;
		door = newDoor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DOOR, oldDoor, door));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__BOARDING_TIME,
					oldBoardingTime, boardingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat getSeat() {
		if (seat != null && seat.eIsProxy()) {
			InternalEObject oldSeat = (InternalEObject) seat;
			seat = (Seat) eResolveProxy(oldSeat);
			if (seat != oldSeat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgentPackage.PASSENGER__SEAT, oldSeat,
							seat));
			}
		}
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat basicGetSeat() {
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeat(Seat newSeat) {
		Seat oldSeat = seat;
		seat = newSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__SEAT, oldSeat, seat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSeated() {
		return isSeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSeated(boolean newIsSeated) {
		boolean oldIsSeated = isSeated;
		isSeated = newIsSeated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__IS_SEATED, oldIsSeated,
					isSeated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWalkingSpeed() {
		return walkingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalkingSpeed(double newWalkingSpeed) {
		double oldWalkingSpeed = walkingSpeed;
		walkingSpeed = newWalkingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__WALKING_SPEED,
					oldWalkingSpeed, walkingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartBoardingAfterDelay() {
		return startBoardingAfterDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartBoardingAfterDelay(double newStartBoardingAfterDelay) {
		double oldStartBoardingAfterDelay = startBoardingAfterDelay;
		startBoardingAfterDelay = newStartBoardingAfterDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__START_BOARDING_AFTER_DELAY,
					oldStartBoardingAfterDelay, startBoardingAfterDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerMood getPassengerMood() {
		return passengerMood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerMood(PassengerMood newPassengerMood) {
		PassengerMood oldPassengerMood = passengerMood;
		passengerMood = newPassengerMood == null ? PASSENGER_MOOD_EDEFAULT : newPassengerMood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__PASSENGER_MOOD,
					oldPassengerMood, passengerMood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfWaits() {
		return numberOfWaits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfWaits(int newNumberOfWaits) {
		int oldNumberOfWaits = numberOfWaits;
		numberOfWaits = newNumberOfWaits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__NUMBER_OF_WAITS,
					oldNumberOfWaits, numberOfWaits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfMakeWayOperations() {
		return numberOfMakeWayOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfMakeWayOperations(int newNumberOfMakeWayOperations) {
		int oldNumberOfMakeWayOperations = numberOfMakeWayOperations;
		numberOfMakeWayOperations = newNumberOfMakeWayOperations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS,
					oldNumberOfMakeWayOperations, numberOfMakeWayOperations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceWalked() {
		return distanceWalked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceWalked(double newDistanceWalked) {
		double oldDistanceWalked = distanceWalked;
		distanceWalked = newDistanceWalked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DISTANCE_WALKED,
					oldDistanceWalked, distanceWalked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCostOfPath() {
		return costOfPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostOfPath(int newCostOfPath) {
		int oldCostOfPath = costOfPath;
		costOfPath = newCostOfPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__COST_OF_PATH, oldCostOfPath,
					costOfPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalTimeWaited() {
		return totalTimeWaited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalTimeWaited(double newTotalTimeWaited) {
		double oldTotalTimeWaited = totalTimeWaited;
		totalTimeWaited = newTotalTimeWaited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__TOTAL_TIME_WAITED,
					oldTotalTimeWaited, totalTimeWaited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Luggage> getLuggage() {
		if (luggage == null) {
			luggage = new EObjectContainmentEList<Luggage>(Luggage.class, this, AgentPackage.PASSENGER__LUGGAGE);
		}
		return luggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassingDecisionCostFactor() {
		return passingDecisionCostFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassingDecisionCostFactor(double newPassingDecisionCostFactor) {
		double oldPassingDecisionCostFactor = passingDecisionCostFactor;
		passingDecisionCostFactor = newPassingDecisionCostFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__PASSING_DECISION_COST_FACTOR,
					oldPassingDecisionCostFactor, passingDecisionCostFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPoint> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList<EPoint>(EPoint.class, this, AgentPackage.PASSENGER__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSpeedOnPath() {
		if (speedOnPath == null) {
			speedOnPath = new EDataTypeEList<Double>(Double.class, this, AgentPackage.PASSENGER__SPEED_ON_PATH);
		}
		return speedOnPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPoint getCurrentPosition() {
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentPosition(EPoint newCurrentPosition, NotificationChain msgs) {
		EPoint oldCurrentPosition = currentPosition;
		currentPosition = newCurrentPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__CURRENT_POSITION, oldCurrentPosition, newCurrentPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(EPoint newCurrentPosition) {
		if (newCurrentPosition != currentPosition) {
			NotificationChain msgs = null;
			if (currentPosition != null)
				msgs = ((InternalEObject) currentPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__CURRENT_POSITION, null, msgs);
			if (newCurrentPosition != null)
				msgs = ((InternalEObject) newCurrentPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__CURRENT_POSITION, null, msgs);
			msgs = basicSetCurrentPosition(newCurrentPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__CURRENT_POSITION,
					newCurrentPosition, newCurrentPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPoint getDesiredPosition() {
		return desiredPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesiredPosition(EPoint newDesiredPosition, NotificationChain msgs) {
		EPoint oldDesiredPosition = desiredPosition;
		desiredPosition = newDesiredPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__DESIRED_POSITION, oldDesiredPosition, newDesiredPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesiredPosition(EPoint newDesiredPosition) {
		if (newDesiredPosition != desiredPosition) {
			NotificationChain msgs = null;
			if (desiredPosition != null)
				msgs = ((InternalEObject) desiredPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__DESIRED_POSITION, null, msgs);
			if (newDesiredPosition != null)
				msgs = ((InternalEObject) newDesiredPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__DESIRED_POSITION, null, msgs);
			msgs = basicSetDesiredPosition(newDesiredPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DESIRED_POSITION,
					newDesiredPosition, newDesiredPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPoint getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartPosition(EPoint newStartPosition, NotificationChain msgs) {
		EPoint oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__START_POSITION, oldStartPosition, newStartPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(EPoint newStartPosition) {
		if (newStartPosition != startPosition) {
			NotificationChain msgs = null;
			if (startPosition != null)
				msgs = ((InternalEObject) startPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__START_POSITION, null, msgs);
			if (newStartPosition != null)
				msgs = ((InternalEObject) newStartPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__START_POSITION, null, msgs);
			msgs = basicSetStartPosition(newStartPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__START_POSITION,
					newStartPosition, newStartPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPoint getGoalPosition() {
		return goalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalPosition(EPoint newGoalPosition, NotificationChain msgs) {
		EPoint oldGoalPosition = goalPosition;
		goalPosition = newGoalPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__GOAL_POSITION, oldGoalPosition, newGoalPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalPosition(EPoint newGoalPosition) {
		if (newGoalPosition != goalPosition) {
			NotificationChain msgs = null;
			if (goalPosition != null)
				msgs = ((InternalEObject) goalPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__GOAL_POSITION, null, msgs);
			if (newGoalPosition != null)
				msgs = ((InternalEObject) newGoalPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AgentPackage.PASSENGER__GOAL_POSITION, null, msgs);
			msgs = basicSetGoalPosition(newGoalPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__GOAL_POSITION,
					newGoalPosition, newGoalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidthBottom() {
		return widthBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthBottom(double newWidthBottom) {
		double oldWidthBottom = widthBottom;
		widthBottom = newWidthBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__WIDTH_BOTTOM, oldWidthBottom,
					widthBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidthMiddle() {
		return widthMiddle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthMiddle(double newWidthMiddle) {
		double oldWidthMiddle = widthMiddle;
		widthMiddle = newWidthMiddle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__WIDTH_MIDDLE, oldWidthMiddle,
					widthMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidthTop() {
		return widthTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthTop(double newWidthTop) {
		double oldWidthTop = widthTop;
		widthTop = newWidthTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__WIDTH_TOP, oldWidthTop,
					widthTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepthBottom() {
		return depthBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthBottom(double newDepthBottom) {
		double oldDepthBottom = depthBottom;
		depthBottom = newDepthBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DEPTH_BOTTOM, oldDepthBottom,
					depthBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepthMiddle() {
		return depthMiddle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthMiddle(double newDepthMiddle) {
		double oldDepthMiddle = depthMiddle;
		depthMiddle = newDepthMiddle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DEPTH_MIDDLE, oldDepthMiddle,
					depthMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepthTop() {
		return depthTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthTop(double newDepthTop) {
		double oldDepthTop = depthTop;
		depthTop = newDepthTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__DEPTH_TOP, oldDepthTop,
					depthTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeightBottom() {
		return heightBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightBottom(double newHeightBottom) {
		double oldHeightBottom = heightBottom;
		heightBottom = newHeightBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__HEIGHT_BOTTOM,
					oldHeightBottom, heightBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeightMiddle() {
		return heightMiddle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightMiddle(double newHeightMiddle) {
		double oldHeightMiddle = heightMiddle;
		heightMiddle = newHeightMiddle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__HEIGHT_MIDDLE,
					oldHeightMiddle, heightMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeightTop() {
		return heightTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightTop(double newHeightTop) {
		double oldHeightTop = heightTop;
		heightTop = newHeightTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.PASSENGER__HEIGHT_TOP, oldHeightTop,
					heightTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovidTotalNumberOfContacts() {
		return covidTotalNumberOfContacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovidTotalNumberOfContacts(double newCovidTotalNumberOfContacts) {
		double oldCovidTotalNumberOfContacts = covidTotalNumberOfContacts;
		covidTotalNumberOfContacts = newCovidTotalNumberOfContacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS, oldCovidTotalNumberOfContacts,
					covidTotalNumberOfContacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovidAverageDistanceToPassengers() {
		return covidAverageDistanceToPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovidAverageDistanceToPassengers(double newCovidAverageDistanceToPassengers) {
		double oldCovidAverageDistanceToPassengers = covidAverageDistanceToPassengers;
		covidAverageDistanceToPassengers = newCovidAverageDistanceToPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS, oldCovidAverageDistanceToPassengers,
					covidAverageDistanceToPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovidMinimumDistanceToPassengers() {
		return covidMinimumDistanceToPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovidMinimumDistanceToPassengers(double newCovidMinimumDistanceToPassengers) {
		double oldCovidMinimumDistanceToPassengers = covidMinimumDistanceToPassengers;
		covidMinimumDistanceToPassengers = newCovidMinimumDistanceToPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS, oldCovidMinimumDistanceToPassengers,
					covidMinimumDistanceToPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovidAverageDurationOfContacts() {
		return covidAverageDurationOfContacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovidAverageDurationOfContacts(double newCovidAverageDurationOfContacts) {
		double oldCovidAverageDurationOfContacts = covidAverageDurationOfContacts;
		covidAverageDurationOfContacts = newCovidAverageDurationOfContacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS, oldCovidAverageDurationOfContacts,
					covidAverageDurationOfContacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovidMaximumDurationOfContact() {
		return covidMaximumDurationOfContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovidMaximumDurationOfContact(double newCovidMaximumDurationOfContact) {
		double oldCovidMaximumDurationOfContact = covidMaximumDurationOfContact;
		covidMaximumDurationOfContact = newCovidMaximumDurationOfContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AgentPackage.PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT, oldCovidMaximumDurationOfContact,
					covidMaximumDurationOfContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AgentPackage.PASSENGER__LUGGAGE:
			return ((InternalEList<?>) getLuggage()).basicRemove(otherEnd, msgs);
		case AgentPackage.PASSENGER__PATH:
			return ((InternalEList<?>) getPath()).basicRemove(otherEnd, msgs);
		case AgentPackage.PASSENGER__CURRENT_POSITION:
			return basicSetCurrentPosition(null, msgs);
		case AgentPackage.PASSENGER__DESIRED_POSITION:
			return basicSetDesiredPosition(null, msgs);
		case AgentPackage.PASSENGER__START_POSITION:
			return basicSetStartPosition(null, msgs);
		case AgentPackage.PASSENGER__GOAL_POSITION:
			return basicSetGoalPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AgentPackage.PASSENGER__ID:
			return getId();
		case AgentPackage.PASSENGER__GENDER:
			return getGender();
		case AgentPackage.PASSENGER__HEIGHT:
			return getHeight();
		case AgentPackage.PASSENGER__AGE:
			return getAge();
		case AgentPackage.PASSENGER__WEIGHT:
			return getWeight();
		case AgentPackage.PASSENGER__DOOR:
			if (resolve)
				return getDoor();
			return basicGetDoor();
		case AgentPackage.PASSENGER__BOARDING_TIME:
			return getBoardingTime();
		case AgentPackage.PASSENGER__SEAT:
			if (resolve)
				return getSeat();
			return basicGetSeat();
		case AgentPackage.PASSENGER__WIDTH:
			return getWidth();
		case AgentPackage.PASSENGER__DEPTH:
			return getDepth();
		case AgentPackage.PASSENGER__IS_SEATED:
			return isIsSeated();
		case AgentPackage.PASSENGER__WALKING_SPEED:
			return getWalkingSpeed();
		case AgentPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
			return getStartBoardingAfterDelay();
		case AgentPackage.PASSENGER__PASSENGER_MOOD:
			return getPassengerMood();
		case AgentPackage.PASSENGER__NUMBER_OF_WAITS:
			return getNumberOfWaits();
		case AgentPackage.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS:
			return getNumberOfMakeWayOperations();
		case AgentPackage.PASSENGER__DISTANCE_WALKED:
			return getDistanceWalked();
		case AgentPackage.PASSENGER__COST_OF_PATH:
			return getCostOfPath();
		case AgentPackage.PASSENGER__TOTAL_TIME_WAITED:
			return getTotalTimeWaited();
		case AgentPackage.PASSENGER__LUGGAGE:
			return getLuggage();
		case AgentPackage.PASSENGER__PASSING_DECISION_COST_FACTOR:
			return getPassingDecisionCostFactor();
		case AgentPackage.PASSENGER__PATH:
			return getPath();
		case AgentPackage.PASSENGER__SPEED_ON_PATH:
			return getSpeedOnPath();
		case AgentPackage.PASSENGER__CURRENT_POSITION:
			return getCurrentPosition();
		case AgentPackage.PASSENGER__DESIRED_POSITION:
			return getDesiredPosition();
		case AgentPackage.PASSENGER__START_POSITION:
			return getStartPosition();
		case AgentPackage.PASSENGER__GOAL_POSITION:
			return getGoalPosition();
		case AgentPackage.PASSENGER__STATE:
			return getState();
		case AgentPackage.PASSENGER__WIDTH_BOTTOM:
			return getWidthBottom();
		case AgentPackage.PASSENGER__WIDTH_MIDDLE:
			return getWidthMiddle();
		case AgentPackage.PASSENGER__WIDTH_TOP:
			return getWidthTop();
		case AgentPackage.PASSENGER__DEPTH_BOTTOM:
			return getDepthBottom();
		case AgentPackage.PASSENGER__DEPTH_MIDDLE:
			return getDepthMiddle();
		case AgentPackage.PASSENGER__DEPTH_TOP:
			return getDepthTop();
		case AgentPackage.PASSENGER__HEIGHT_BOTTOM:
			return getHeightBottom();
		case AgentPackage.PASSENGER__HEIGHT_MIDDLE:
			return getHeightMiddle();
		case AgentPackage.PASSENGER__HEIGHT_TOP:
			return getHeightTop();
		case AgentPackage.PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS:
			return getCovidTotalNumberOfContacts();
		case AgentPackage.PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS:
			return getCovidAverageDistanceToPassengers();
		case AgentPackage.PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS:
			return getCovidMinimumDistanceToPassengers();
		case AgentPackage.PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS:
			return getCovidAverageDurationOfContacts();
		case AgentPackage.PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT:
			return getCovidMaximumDurationOfContact();
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
		case AgentPackage.PASSENGER__ID:
			setId((Integer) newValue);
			return;
		case AgentPackage.PASSENGER__GENDER:
			setGender((Gender) newValue);
			return;
		case AgentPackage.PASSENGER__HEIGHT:
			setHeight((Double) newValue);
			return;
		case AgentPackage.PASSENGER__AGE:
			setAge((Integer) newValue);
			return;
		case AgentPackage.PASSENGER__WEIGHT:
			setWeight((Double) newValue);
			return;
		case AgentPackage.PASSENGER__DOOR:
			setDoor((Door) newValue);
			return;
		case AgentPackage.PASSENGER__BOARDING_TIME:
			setBoardingTime((Double) newValue);
			return;
		case AgentPackage.PASSENGER__SEAT:
			setSeat((Seat) newValue);
			return;
		case AgentPackage.PASSENGER__WIDTH:
			setWidth((Double) newValue);
			return;
		case AgentPackage.PASSENGER__DEPTH:
			setDepth((Double) newValue);
			return;
		case AgentPackage.PASSENGER__IS_SEATED:
			setIsSeated((Boolean) newValue);
			return;
		case AgentPackage.PASSENGER__WALKING_SPEED:
			setWalkingSpeed((Double) newValue);
			return;
		case AgentPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
			setStartBoardingAfterDelay((Double) newValue);
			return;
		case AgentPackage.PASSENGER__PASSENGER_MOOD:
			setPassengerMood((PassengerMood) newValue);
			return;
		case AgentPackage.PASSENGER__NUMBER_OF_WAITS:
			setNumberOfWaits((Integer) newValue);
			return;
		case AgentPackage.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS:
			setNumberOfMakeWayOperations((Integer) newValue);
			return;
		case AgentPackage.PASSENGER__DISTANCE_WALKED:
			setDistanceWalked((Double) newValue);
			return;
		case AgentPackage.PASSENGER__COST_OF_PATH:
			setCostOfPath((Integer) newValue);
			return;
		case AgentPackage.PASSENGER__TOTAL_TIME_WAITED:
			setTotalTimeWaited((Double) newValue);
			return;
		case AgentPackage.PASSENGER__LUGGAGE:
			getLuggage().clear();
			getLuggage().addAll((Collection<? extends Luggage>) newValue);
			return;
		case AgentPackage.PASSENGER__PASSING_DECISION_COST_FACTOR:
			setPassingDecisionCostFactor((Double) newValue);
			return;
		case AgentPackage.PASSENGER__PATH:
			getPath().clear();
			getPath().addAll((Collection<? extends EPoint>) newValue);
			return;
		case AgentPackage.PASSENGER__SPEED_ON_PATH:
			getSpeedOnPath().clear();
			getSpeedOnPath().addAll((Collection<? extends Double>) newValue);
			return;
		case AgentPackage.PASSENGER__CURRENT_POSITION:
			setCurrentPosition((EPoint) newValue);
			return;
		case AgentPackage.PASSENGER__DESIRED_POSITION:
			setDesiredPosition((EPoint) newValue);
			return;
		case AgentPackage.PASSENGER__START_POSITION:
			setStartPosition((EPoint) newValue);
			return;
		case AgentPackage.PASSENGER__GOAL_POSITION:
			setGoalPosition((EPoint) newValue);
			return;
		case AgentPackage.PASSENGER__STATE:
			setState((State) newValue);
			return;
		case AgentPackage.PASSENGER__WIDTH_BOTTOM:
			setWidthBottom((Double) newValue);
			return;
		case AgentPackage.PASSENGER__WIDTH_MIDDLE:
			setWidthMiddle((Double) newValue);
			return;
		case AgentPackage.PASSENGER__WIDTH_TOP:
			setWidthTop((Double) newValue);
			return;
		case AgentPackage.PASSENGER__DEPTH_BOTTOM:
			setDepthBottom((Double) newValue);
			return;
		case AgentPackage.PASSENGER__DEPTH_MIDDLE:
			setDepthMiddle((Double) newValue);
			return;
		case AgentPackage.PASSENGER__DEPTH_TOP:
			setDepthTop((Double) newValue);
			return;
		case AgentPackage.PASSENGER__HEIGHT_BOTTOM:
			setHeightBottom((Double) newValue);
			return;
		case AgentPackage.PASSENGER__HEIGHT_MIDDLE:
			setHeightMiddle((Double) newValue);
			return;
		case AgentPackage.PASSENGER__HEIGHT_TOP:
			setHeightTop((Double) newValue);
			return;
		case AgentPackage.PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS:
			setCovidTotalNumberOfContacts((Double) newValue);
			return;
		case AgentPackage.PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS:
			setCovidAverageDistanceToPassengers((Double) newValue);
			return;
		case AgentPackage.PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS:
			setCovidMinimumDistanceToPassengers((Double) newValue);
			return;
		case AgentPackage.PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS:
			setCovidAverageDurationOfContacts((Double) newValue);
			return;
		case AgentPackage.PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT:
			setCovidMaximumDurationOfContact((Double) newValue);
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
		case AgentPackage.PASSENGER__ID:
			setId(ID_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__DOOR:
			setDoor((Door) null);
			return;
		case AgentPackage.PASSENGER__BOARDING_TIME:
			setBoardingTime(BOARDING_TIME_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__SEAT:
			setSeat((Seat) null);
			return;
		case AgentPackage.PASSENGER__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__DEPTH:
			setDepth(DEPTH_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__IS_SEATED:
			setIsSeated(IS_SEATED_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__WALKING_SPEED:
			setWalkingSpeed(WALKING_SPEED_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
			setStartBoardingAfterDelay(START_BOARDING_AFTER_DELAY_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__PASSENGER_MOOD:
			setPassengerMood(PASSENGER_MOOD_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__NUMBER_OF_WAITS:
			setNumberOfWaits(NUMBER_OF_WAITS_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS:
			setNumberOfMakeWayOperations(NUMBER_OF_MAKE_WAY_OPERATIONS_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__DISTANCE_WALKED:
			setDistanceWalked(DISTANCE_WALKED_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__COST_OF_PATH:
			setCostOfPath(COST_OF_PATH_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__TOTAL_TIME_WAITED:
			setTotalTimeWaited(TOTAL_TIME_WAITED_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__LUGGAGE:
			getLuggage().clear();
			return;
		case AgentPackage.PASSENGER__PASSING_DECISION_COST_FACTOR:
			setPassingDecisionCostFactor(PASSING_DECISION_COST_FACTOR_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__PATH:
			getPath().clear();
			return;
		case AgentPackage.PASSENGER__SPEED_ON_PATH:
			getSpeedOnPath().clear();
			return;
		case AgentPackage.PASSENGER__CURRENT_POSITION:
			setCurrentPosition((EPoint) null);
			return;
		case AgentPackage.PASSENGER__DESIRED_POSITION:
			setDesiredPosition((EPoint) null);
			return;
		case AgentPackage.PASSENGER__START_POSITION:
			setStartPosition((EPoint) null);
			return;
		case AgentPackage.PASSENGER__GOAL_POSITION:
			setGoalPosition((EPoint) null);
			return;
		case AgentPackage.PASSENGER__STATE:
			setState(STATE_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__WIDTH_BOTTOM:
			setWidthBottom(WIDTH_BOTTOM_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__WIDTH_MIDDLE:
			setWidthMiddle(WIDTH_MIDDLE_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__WIDTH_TOP:
			setWidthTop(WIDTH_TOP_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__DEPTH_BOTTOM:
			setDepthBottom(DEPTH_BOTTOM_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__DEPTH_MIDDLE:
			setDepthMiddle(DEPTH_MIDDLE_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__DEPTH_TOP:
			setDepthTop(DEPTH_TOP_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__HEIGHT_BOTTOM:
			setHeightBottom(HEIGHT_BOTTOM_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__HEIGHT_MIDDLE:
			setHeightMiddle(HEIGHT_MIDDLE_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__HEIGHT_TOP:
			setHeightTop(HEIGHT_TOP_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS:
			setCovidTotalNumberOfContacts(COVID_TOTAL_NUMBER_OF_CONTACTS_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS:
			setCovidAverageDistanceToPassengers(COVID_AVERAGE_DISTANCE_TO_PASSENGERS_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS:
			setCovidMinimumDistanceToPassengers(COVID_MINIMUM_DISTANCE_TO_PASSENGERS_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS:
			setCovidAverageDurationOfContacts(COVID_AVERAGE_DURATION_OF_CONTACTS_EDEFAULT);
			return;
		case AgentPackage.PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT:
			setCovidMaximumDurationOfContact(COVID_MAXIMUM_DURATION_OF_CONTACT_EDEFAULT);
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
		case AgentPackage.PASSENGER__ID:
			return id != ID_EDEFAULT;
		case AgentPackage.PASSENGER__GENDER:
			return gender != GENDER_EDEFAULT;
		case AgentPackage.PASSENGER__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case AgentPackage.PASSENGER__AGE:
			return age != AGE_EDEFAULT;
		case AgentPackage.PASSENGER__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case AgentPackage.PASSENGER__DOOR:
			return door != null;
		case AgentPackage.PASSENGER__BOARDING_TIME:
			return boardingTime != BOARDING_TIME_EDEFAULT;
		case AgentPackage.PASSENGER__SEAT:
			return seat != null;
		case AgentPackage.PASSENGER__WIDTH:
			return width != WIDTH_EDEFAULT;
		case AgentPackage.PASSENGER__DEPTH:
			return depth != DEPTH_EDEFAULT;
		case AgentPackage.PASSENGER__IS_SEATED:
			return isSeated != IS_SEATED_EDEFAULT;
		case AgentPackage.PASSENGER__WALKING_SPEED:
			return walkingSpeed != WALKING_SPEED_EDEFAULT;
		case AgentPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
			return startBoardingAfterDelay != START_BOARDING_AFTER_DELAY_EDEFAULT;
		case AgentPackage.PASSENGER__PASSENGER_MOOD:
			return passengerMood != PASSENGER_MOOD_EDEFAULT;
		case AgentPackage.PASSENGER__NUMBER_OF_WAITS:
			return numberOfWaits != NUMBER_OF_WAITS_EDEFAULT;
		case AgentPackage.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS:
			return numberOfMakeWayOperations != NUMBER_OF_MAKE_WAY_OPERATIONS_EDEFAULT;
		case AgentPackage.PASSENGER__DISTANCE_WALKED:
			return distanceWalked != DISTANCE_WALKED_EDEFAULT;
		case AgentPackage.PASSENGER__COST_OF_PATH:
			return costOfPath != COST_OF_PATH_EDEFAULT;
		case AgentPackage.PASSENGER__TOTAL_TIME_WAITED:
			return totalTimeWaited != TOTAL_TIME_WAITED_EDEFAULT;
		case AgentPackage.PASSENGER__LUGGAGE:
			return luggage != null && !luggage.isEmpty();
		case AgentPackage.PASSENGER__PASSING_DECISION_COST_FACTOR:
			return passingDecisionCostFactor != PASSING_DECISION_COST_FACTOR_EDEFAULT;
		case AgentPackage.PASSENGER__PATH:
			return path != null && !path.isEmpty();
		case AgentPackage.PASSENGER__SPEED_ON_PATH:
			return speedOnPath != null && !speedOnPath.isEmpty();
		case AgentPackage.PASSENGER__CURRENT_POSITION:
			return currentPosition != null;
		case AgentPackage.PASSENGER__DESIRED_POSITION:
			return desiredPosition != null;
		case AgentPackage.PASSENGER__START_POSITION:
			return startPosition != null;
		case AgentPackage.PASSENGER__GOAL_POSITION:
			return goalPosition != null;
		case AgentPackage.PASSENGER__STATE:
			return state != STATE_EDEFAULT;
		case AgentPackage.PASSENGER__WIDTH_BOTTOM:
			return widthBottom != WIDTH_BOTTOM_EDEFAULT;
		case AgentPackage.PASSENGER__WIDTH_MIDDLE:
			return widthMiddle != WIDTH_MIDDLE_EDEFAULT;
		case AgentPackage.PASSENGER__WIDTH_TOP:
			return widthTop != WIDTH_TOP_EDEFAULT;
		case AgentPackage.PASSENGER__DEPTH_BOTTOM:
			return depthBottom != DEPTH_BOTTOM_EDEFAULT;
		case AgentPackage.PASSENGER__DEPTH_MIDDLE:
			return depthMiddle != DEPTH_MIDDLE_EDEFAULT;
		case AgentPackage.PASSENGER__DEPTH_TOP:
			return depthTop != DEPTH_TOP_EDEFAULT;
		case AgentPackage.PASSENGER__HEIGHT_BOTTOM:
			return heightBottom != HEIGHT_BOTTOM_EDEFAULT;
		case AgentPackage.PASSENGER__HEIGHT_MIDDLE:
			return heightMiddle != HEIGHT_MIDDLE_EDEFAULT;
		case AgentPackage.PASSENGER__HEIGHT_TOP:
			return heightTop != HEIGHT_TOP_EDEFAULT;
		case AgentPackage.PASSENGER__COVID_TOTAL_NUMBER_OF_CONTACTS:
			return covidTotalNumberOfContacts != COVID_TOTAL_NUMBER_OF_CONTACTS_EDEFAULT;
		case AgentPackage.PASSENGER__COVID_AVERAGE_DISTANCE_TO_PASSENGERS:
			return covidAverageDistanceToPassengers != COVID_AVERAGE_DISTANCE_TO_PASSENGERS_EDEFAULT;
		case AgentPackage.PASSENGER__COVID_MINIMUM_DISTANCE_TO_PASSENGERS:
			return covidMinimumDistanceToPassengers != COVID_MINIMUM_DISTANCE_TO_PASSENGERS_EDEFAULT;
		case AgentPackage.PASSENGER__COVID_AVERAGE_DURATION_OF_CONTACTS:
			return covidAverageDurationOfContacts != COVID_AVERAGE_DURATION_OF_CONTACTS_EDEFAULT;
		case AgentPackage.PASSENGER__COVID_MAXIMUM_DURATION_OF_CONTACT:
			return covidMaximumDurationOfContact != COVID_MAXIMUM_DURATION_OF_CONTACT_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", gender: ");
		result.append(gender);
		result.append(", height: ");
		result.append(height);
		result.append(", age: ");
		result.append(age);
		result.append(", weight: ");
		result.append(weight);
		result.append(", boardingTime: ");
		result.append(boardingTime);
		result.append(", width: ");
		result.append(width);
		result.append(", depth: ");
		result.append(depth);
		result.append(", isSeated: ");
		result.append(isSeated);
		result.append(", walkingSpeed: ");
		result.append(walkingSpeed);
		result.append(", startBoardingAfterDelay: ");
		result.append(startBoardingAfterDelay);
		result.append(", passengerMood: ");
		result.append(passengerMood);
		result.append(", numberOfWaits: ");
		result.append(numberOfWaits);
		result.append(", numberOfMakeWayOperations: ");
		result.append(numberOfMakeWayOperations);
		result.append(", distanceWalked: ");
		result.append(distanceWalked);
		result.append(", costOfPath: ");
		result.append(costOfPath);
		result.append(", totalTimeWaited: ");
		result.append(totalTimeWaited);
		result.append(", passingDecisionCostFactor: ");
		result.append(passingDecisionCostFactor);
		result.append(", speedOnPath: ");
		result.append(speedOnPath);
		result.append(", state: ");
		result.append(state);
		result.append(", widthBottom: ");
		result.append(widthBottom);
		result.append(", widthMiddle: ");
		result.append(widthMiddle);
		result.append(", widthTop: ");
		result.append(widthTop);
		result.append(", depthBottom: ");
		result.append(depthBottom);
		result.append(", depthMiddle: ");
		result.append(depthMiddle);
		result.append(", depthTop: ");
		result.append(depthTop);
		result.append(", heightBottom: ");
		result.append(heightBottom);
		result.append(", heightMiddle: ");
		result.append(heightMiddle);
		result.append(", heightTop: ");
		result.append(heightTop);
		result.append(", covidTotalNumberOfContacts: ");
		result.append(covidTotalNumberOfContacts);
		result.append(", covidAverageDistanceToPassengers: ");
		result.append(covidAverageDistanceToPassengers);
		result.append(", covidMinimumDistanceToPassengers: ");
		result.append(covidMinimumDistanceToPassengers);
		result.append(", covidAverageDurationOfContacts: ");
		result.append(covidAverageDurationOfContacts);
		result.append(", covidMaximumDurationOfContact: ");
		result.append(covidMaximumDurationOfContact);
		result.append(')');
		return result.toString();
	}

} //PassengerImpl
