/**
 */
package com.paxelerate.model.monuments;

import com.paxelerate.model.agent.Passenger;

import com.paxelerate.model.enums.DoorSide;

import com.paxelerate.model.enums.DoorType;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.Door#getPassengerThroughputPerMinute <em>Passenger Throughput Per Minute</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#isActive <em>Active</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#getWaitingPassengers <em>Waiting Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#getSide <em>Side</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#isEmergencyOnly <em>Emergency Only</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#getType <em>Type</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Door#getTimeInUse <em>Time In Use</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger Throughput Per Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Throughput Per Minute</em>' attribute.
	 * @see #setPassengerThroughputPerMinute(double)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_PassengerThroughputPerMinute()
	 * @model
	 * @generated
	 */
	double getPassengerThroughputPerMinute();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#getPassengerThroughputPerMinute <em>Passenger Throughput Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Throughput Per Minute</em>' attribute.
	 * @see #getPassengerThroughputPerMinute()
	 * @generated
	 */
	void setPassengerThroughputPerMinute(double value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_Active()
	 * @model default="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Waiting Passengers</b></em>' reference list.
	 * The list contents are of type {@link com.paxelerate.model.agent.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Passengers</em>' reference list.
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_WaitingPassengers()
	 * @model
	 * @generated
	 */
	EList<Passenger> getWaitingPassengers();

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.DoorSide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see com.paxelerate.model.enums.DoorSide
	 * @see #setSide(DoorSide)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_Side()
	 * @model
	 * @generated
	 */
	DoorSide getSide();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see com.paxelerate.model.enums.DoorSide
	 * @see #getSide()
	 * @generated
	 */
	void setSide(DoorSide value);

	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #setXPosition(double)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_XPosition()
	 * @model
	 * @generated
	 */
	double getXPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #getXPosition()
	 * @generated
	 */
	void setXPosition(double value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_Id()
	 * @model default="0"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Emergency Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency Only</em>' attribute.
	 * @see #setEmergencyOnly(boolean)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_EmergencyOnly()
	 * @model default="false"
	 * @generated
	 */
	boolean isEmergencyOnly();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#isEmergencyOnly <em>Emergency Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Only</em>' attribute.
	 * @see #isEmergencyOnly()
	 * @generated
	 */
	void setEmergencyOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.DoorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.enums.DoorType
	 * @see #setType(DoorType)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_Type()
	 * @model
	 * @generated
	 */
	DoorType getType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.enums.DoorType
	 * @see #getType()
	 * @generated
	 */
	void setType(DoorType value);

	/**
	 * Returns the value of the '<em><b>Time In Use</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time In Use</em>' attribute.
	 * @see #setTimeInUse(double)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getDoor_TimeInUse()
	 * @model default="0"
	 * @generated
	 */
	double getTimeInUse();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Door#getTimeInUse <em>Time In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time In Use</em>' attribute.
	 * @see #getTimeInUse()
	 * @generated
	 */
	void setTimeInUse(double value);

} // Door
