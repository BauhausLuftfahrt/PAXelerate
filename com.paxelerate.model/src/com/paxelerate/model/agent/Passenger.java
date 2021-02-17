/**
 */
package com.paxelerate.model.agent;

import com.paxelerate.model.EPoint;

import com.paxelerate.model.enums.Gender;
import com.paxelerate.model.enums.PassengerMood;
import com.paxelerate.model.enums.State;

import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Seat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getGender <em>Gender</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getHeight <em>Height</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getAge <em>Age</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDoor <em>Door</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getSeat <em>Seat</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getWidth <em>Width</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDepth <em>Depth</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#isIsSeated <em>Is Seated</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getWalkingSpeed <em>Walking Speed</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getPassengerMood <em>Passenger Mood</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getNumberOfWaits <em>Number Of Waits</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getNumberOfMakeWayOperations <em>Number Of Make Way Operations</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDistanceWalked <em>Distance Walked</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getCostOfPath <em>Cost Of Path</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getTotalTimeWaited <em>Total Time Waited</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getLuggage <em>Luggage</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getPassingDecisionCostFactor <em>Passing Decision Cost Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getPath <em>Path</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getSpeedOnPath <em>Speed On Path</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDesiredPosition <em>Desired Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getGoalPosition <em>Goal Position</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getState <em>State</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getWidthBottom <em>Width Bottom</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getWidthMiddle <em>Width Middle</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getWidthTop <em>Width Top</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDepthBottom <em>Depth Bottom</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDepthMiddle <em>Depth Middle</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getDepthTop <em>Depth Top</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getHeightBottom <em>Height Bottom</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getHeightMiddle <em>Height Middle</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Passenger#getHeightTop <em>Height Top</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.agent.AgentPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.Gender}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see com.paxelerate.model.enums.Gender
	 * @see #setGender(Gender)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see com.paxelerate.model.enums.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Door()
	 * @model required="true"
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDoor <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #setBoardingTime(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_BoardingTime()
	 * @model
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getBoardingTime <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Time</em>' attribute.
	 * @see #getBoardingTime()
	 * @generated
	 */
	void setBoardingTime(double value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' reference.
	 * @see #setSeat(Seat)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Seat()
	 * @model required="true"
	 * @generated
	 */
	Seat getSeat();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getSeat <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' reference.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(Seat value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Depth()
	 * @model
	 * @generated
	 */
	double getDepth();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(double value);

	/**
	 * Returns the value of the '<em><b>Is Seated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Seated</em>' attribute.
	 * @see #setIsSeated(boolean)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_IsSeated()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsSeated();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#isIsSeated <em>Is Seated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Seated</em>' attribute.
	 * @see #isIsSeated()
	 * @generated
	 */
	void setIsSeated(boolean value);

	/**
	 * Returns the value of the '<em><b>Walking Speed</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Walking Speed</em>' attribute.
	 * @see #setWalkingSpeed(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_WalkingSpeed()
	 * @model default="2.0"
	 * @generated
	 */
	double getWalkingSpeed();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getWalkingSpeed <em>Walking Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walking Speed</em>' attribute.
	 * @see #getWalkingSpeed()
	 * @generated
	 */
	void setWalkingSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Start Boarding After Delay</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Boarding After Delay</em>' attribute.
	 * @see #setStartBoardingAfterDelay(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_StartBoardingAfterDelay()
	 * @model default="1.0"
	 * @generated
	 */
	double getStartBoardingAfterDelay();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Boarding After Delay</em>' attribute.
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 */
	void setStartBoardingAfterDelay(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Mood</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.PassengerMood}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Mood</em>' attribute.
	 * @see com.paxelerate.model.enums.PassengerMood
	 * @see #setPassengerMood(PassengerMood)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_PassengerMood()
	 * @model required="true"
	 * @generated
	 */
	PassengerMood getPassengerMood();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getPassengerMood <em>Passenger Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Mood</em>' attribute.
	 * @see com.paxelerate.model.enums.PassengerMood
	 * @see #getPassengerMood()
	 * @generated
	 */
	void setPassengerMood(PassengerMood value);

	/**
	 * Returns the value of the '<em><b>Number Of Waits</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Waits</em>' attribute.
	 * @see #setNumberOfWaits(int)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_NumberOfWaits()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfWaits();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getNumberOfWaits <em>Number Of Waits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Waits</em>' attribute.
	 * @see #getNumberOfWaits()
	 * @generated
	 */
	void setNumberOfWaits(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Make Way Operations</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Make Way Operations</em>' attribute.
	 * @see #setNumberOfMakeWayOperations(int)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_NumberOfMakeWayOperations()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfMakeWayOperations();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getNumberOfMakeWayOperations <em>Number Of Make Way Operations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Make Way Operations</em>' attribute.
	 * @see #getNumberOfMakeWayOperations()
	 * @generated
	 */
	void setNumberOfMakeWayOperations(int value);

	/**
	 * Returns the value of the '<em><b>Distance Walked</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Walked</em>' attribute.
	 * @see #setDistanceWalked(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_DistanceWalked()
	 * @model default="0"
	 * @generated
	 */
	double getDistanceWalked();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDistanceWalked <em>Distance Walked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Walked</em>' attribute.
	 * @see #getDistanceWalked()
	 * @generated
	 */
	void setDistanceWalked(double value);

	/**
	 * Returns the value of the '<em><b>Cost Of Path</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Of Path</em>' attribute.
	 * @see #setCostOfPath(int)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_CostOfPath()
	 * @model default="0"
	 * @generated
	 */
	int getCostOfPath();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getCostOfPath <em>Cost Of Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Of Path</em>' attribute.
	 * @see #getCostOfPath()
	 * @generated
	 */
	void setCostOfPath(int value);

	/**
	 * Returns the value of the '<em><b>Total Time Waited</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Time Waited</em>' attribute.
	 * @see #setTotalTimeWaited(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_TotalTimeWaited()
	 * @model default="0"
	 * @generated
	 */
	double getTotalTimeWaited();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getTotalTimeWaited <em>Total Time Waited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Time Waited</em>' attribute.
	 * @see #getTotalTimeWaited()
	 * @generated
	 */
	void setTotalTimeWaited(double value);

	/**
	 * Returns the value of the '<em><b>Luggage</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.agent.Luggage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage</em>' containment reference list.
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Luggage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Luggage> getLuggage();

	/**
	 * Returns the value of the '<em><b>Passing Decision Cost Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passing Decision Cost Factor</em>' attribute.
	 * @see #setPassingDecisionCostFactor(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_PassingDecisionCostFactor()
	 * @model default="1"
	 * @generated
	 */
	double getPassingDecisionCostFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getPassingDecisionCostFactor <em>Passing Decision Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passing Decision Cost Factor</em>' attribute.
	 * @see #getPassingDecisionCostFactor()
	 * @generated
	 */
	void setPassingDecisionCostFactor(double value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.EPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_Path()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPoint> getPath();

	/**
	 * Returns the value of the '<em><b>Speed On Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed On Path</em>' attribute list.
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_SpeedOnPath()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getSpeedOnPath();

	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' containment reference.
	 * @see #setCurrentPosition(EPoint)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_CurrentPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EPoint getCurrentPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getCurrentPosition <em>Current Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' containment reference.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(EPoint value);

	/**
	 * Returns the value of the '<em><b>Desired Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Position</em>' containment reference.
	 * @see #setDesiredPosition(EPoint)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_DesiredPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EPoint getDesiredPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDesiredPosition <em>Desired Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Position</em>' containment reference.
	 * @see #getDesiredPosition()
	 * @generated
	 */
	void setDesiredPosition(EPoint value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' containment reference.
	 * @see #setStartPosition(EPoint)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_StartPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EPoint getStartPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getStartPosition <em>Start Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' containment reference.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(EPoint value);

	/**
	 * Returns the value of the '<em><b>Goal Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Position</em>' containment reference.
	 * @see #setGoalPosition(EPoint)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_GoalPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EPoint getGoalPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getGoalPosition <em>Goal Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Position</em>' containment reference.
	 * @see #getGoalPosition()
	 * @generated
	 */
	void setGoalPosition(EPoint value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see com.paxelerate.model.enums.State
	 * @see #setState(State)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_State()
	 * @model
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see com.paxelerate.model.enums.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Width Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Bottom</em>' attribute.
	 * @see #setWidthBottom(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_WidthBottom()
	 * @model
	 * @generated
	 */
	double getWidthBottom();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getWidthBottom <em>Width Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Bottom</em>' attribute.
	 * @see #getWidthBottom()
	 * @generated
	 */
	void setWidthBottom(double value);

	/**
	 * Returns the value of the '<em><b>Width Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Middle</em>' attribute.
	 * @see #setWidthMiddle(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_WidthMiddle()
	 * @model
	 * @generated
	 */
	double getWidthMiddle();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getWidthMiddle <em>Width Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Middle</em>' attribute.
	 * @see #getWidthMiddle()
	 * @generated
	 */
	void setWidthMiddle(double value);

	/**
	 * Returns the value of the '<em><b>Width Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Top</em>' attribute.
	 * @see #setWidthTop(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_WidthTop()
	 * @model
	 * @generated
	 */
	double getWidthTop();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getWidthTop <em>Width Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Top</em>' attribute.
	 * @see #getWidthTop()
	 * @generated
	 */
	void setWidthTop(double value);

	/**
	 * Returns the value of the '<em><b>Depth Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Bottom</em>' attribute.
	 * @see #setDepthBottom(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_DepthBottom()
	 * @model
	 * @generated
	 */
	double getDepthBottom();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDepthBottom <em>Depth Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Bottom</em>' attribute.
	 * @see #getDepthBottom()
	 * @generated
	 */
	void setDepthBottom(double value);

	/**
	 * Returns the value of the '<em><b>Depth Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Middle</em>' attribute.
	 * @see #setDepthMiddle(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_DepthMiddle()
	 * @model
	 * @generated
	 */
	double getDepthMiddle();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDepthMiddle <em>Depth Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Middle</em>' attribute.
	 * @see #getDepthMiddle()
	 * @generated
	 */
	void setDepthMiddle(double value);

	/**
	 * Returns the value of the '<em><b>Depth Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Top</em>' attribute.
	 * @see #setDepthTop(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_DepthTop()
	 * @model
	 * @generated
	 */
	double getDepthTop();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getDepthTop <em>Depth Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Top</em>' attribute.
	 * @see #getDepthTop()
	 * @generated
	 */
	void setDepthTop(double value);

	/**
	 * Returns the value of the '<em><b>Height Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Bottom</em>' attribute.
	 * @see #setHeightBottom(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_HeightBottom()
	 * @model
	 * @generated
	 */
	double getHeightBottom();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getHeightBottom <em>Height Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Bottom</em>' attribute.
	 * @see #getHeightBottom()
	 * @generated
	 */
	void setHeightBottom(double value);

	/**
	 * Returns the value of the '<em><b>Height Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Middle</em>' attribute.
	 * @see #setHeightMiddle(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_HeightMiddle()
	 * @model
	 * @generated
	 */
	double getHeightMiddle();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getHeightMiddle <em>Height Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Middle</em>' attribute.
	 * @see #getHeightMiddle()
	 * @generated
	 */
	void setHeightMiddle(double value);

	/**
	 * Returns the value of the '<em><b>Height Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Top</em>' attribute.
	 * @see #setHeightTop(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getPassenger_HeightTop()
	 * @model
	 * @generated
	 */
	double getHeightTop();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Passenger#getHeightTop <em>Height Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Top</em>' attribute.
	 * @see #getHeightTop()
	 * @generated
	 */
	void setHeightTop(double value);

} // Passenger
