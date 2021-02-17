/**
 */
package com.paxelerate.model;

import com.paxelerate.model.enums.SeatType;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.SimulationResult#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getDate <em>Date</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getWaymakingSkipped <em>Waymaking Skipped</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getWaymakingCompleted <em>Waymaking Completed</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getLayoutConceptType <em>Layout Concept Type</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getSimulationTime <em>Simulation Time</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getNotStoredLuggageItems <em>Not Stored Luggage Items</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getLuggageStorageFillingDegree <em>Luggage Storage Filling Degree</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getTotalLargeBagsStowed <em>Total Large Bags Stowed</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getTotalStorageVolume <em>Total Storage Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getPassengersLookingForLuggageSpot <em>Passengers Looking For Luggage Spot</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getVolumeOfNotStoredLuggageItems <em>Volume Of Not Stored Luggage Items</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getMaxNumberOfActivePassengers <em>Max Number Of Active Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getAverageNumberOfActivePassengers <em>Average Number Of Active Passengers</em>}</li>
 *   <li>{@link com.paxelerate.model.SimulationResult#getAverageNumberOfBags <em>Average Number Of Bags</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.ModelPackage#getSimulationResult()
 * @model
 * @generated
 */
public interface SimulationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #setBoardingTime(double)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_BoardingTime()
	 * @model
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getBoardingTime <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Time</em>' attribute.
	 * @see #getBoardingTime()
	 * @generated
	 */
	void setBoardingTime(double value);

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' attribute.
	 * @see #setPassengers(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_Passengers()
	 * @model
	 * @generated
	 */
	int getPassengers();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getPassengers <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passengers</em>' attribute.
	 * @see #getPassengers()
	 * @generated
	 */
	void setPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Boarding Time String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time String</em>' attribute.
	 * @see #setBoardingTimeString(String)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_BoardingTimeString()
	 * @model
	 * @generated
	 */
	String getBoardingTimeString();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Time String</em>' attribute.
	 * @see #getBoardingTimeString()
	 * @generated
	 */
	void setBoardingTimeString(String value);

	/**
	 * Returns the value of the '<em><b>Waymaking Skipped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waymaking Skipped</em>' attribute.
	 * @see #setWaymakingSkipped(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_WaymakingSkipped()
	 * @model
	 * @generated
	 */
	int getWaymakingSkipped();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getWaymakingSkipped <em>Waymaking Skipped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waymaking Skipped</em>' attribute.
	 * @see #getWaymakingSkipped()
	 * @generated
	 */
	void setWaymakingSkipped(int value);

	/**
	 * Returns the value of the '<em><b>Waymaking Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waymaking Completed</em>' attribute.
	 * @see #setWaymakingCompleted(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_WaymakingCompleted()
	 * @model
	 * @generated
	 */
	int getWaymakingCompleted();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getWaymakingCompleted <em>Waymaking Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waymaking Completed</em>' attribute.
	 * @see #getWaymakingCompleted()
	 * @generated
	 */
	void setWaymakingCompleted(int value);

	/**
	 * Returns the value of the '<em><b>Layout Concept Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.SeatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Concept Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatType
	 * @see #setLayoutConceptType(SeatType)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_LayoutConceptType()
	 * @model required="true"
	 * @generated
	 */
	SeatType getLayoutConceptType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getLayoutConceptType <em>Layout Concept Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Concept Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatType
	 * @see #getLayoutConceptType()
	 * @generated
	 */
	void setLayoutConceptType(SeatType value);

	/**
	 * Returns the value of the '<em><b>Simulation Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time</em>' attribute.
	 * @see #setSimulationTime(double)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_SimulationTime()
	 * @model default="0"
	 * @generated
	 */
	double getSimulationTime();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getSimulationTime <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time</em>' attribute.
	 * @see #getSimulationTime()
	 * @generated
	 */
	void setSimulationTime(double value);

	/**
	 * Returns the value of the '<em><b>Not Stored Luggage Items</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Stored Luggage Items</em>' attribute.
	 * @see #setNotStoredLuggageItems(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_NotStoredLuggageItems()
	 * @model default="0"
	 * @generated
	 */
	int getNotStoredLuggageItems();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getNotStoredLuggageItems <em>Not Stored Luggage Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Stored Luggage Items</em>' attribute.
	 * @see #getNotStoredLuggageItems()
	 * @generated
	 */
	void setNotStoredLuggageItems(int value);

	/**
	 * Returns the value of the '<em><b>Luggage Storage Filling Degree</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Storage Filling Degree</em>' attribute.
	 * @see #setLuggageStorageFillingDegree(double)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_LuggageStorageFillingDegree()
	 * @model default="0"
	 * @generated
	 */
	double getLuggageStorageFillingDegree();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getLuggageStorageFillingDegree <em>Luggage Storage Filling Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Storage Filling Degree</em>' attribute.
	 * @see #getLuggageStorageFillingDegree()
	 * @generated
	 */
	void setLuggageStorageFillingDegree(double value);

	/**
	 * Returns the value of the '<em><b>Total Large Bags Stowed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Large Bags Stowed</em>' attribute.
	 * @see #setTotalLargeBagsStowed(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_TotalLargeBagsStowed()
	 * @model default="0"
	 * @generated
	 */
	int getTotalLargeBagsStowed();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getTotalLargeBagsStowed <em>Total Large Bags Stowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Large Bags Stowed</em>' attribute.
	 * @see #getTotalLargeBagsStowed()
	 * @generated
	 */
	void setTotalLargeBagsStowed(int value);

	/**
	 * Returns the value of the '<em><b>Total Storage Volume</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Storage Volume</em>' attribute.
	 * @see #setTotalStorageVolume(double)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_TotalStorageVolume()
	 * @model default="0"
	 * @generated
	 */
	double getTotalStorageVolume();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getTotalStorageVolume <em>Total Storage Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Storage Volume</em>' attribute.
	 * @see #getTotalStorageVolume()
	 * @generated
	 */
	void setTotalStorageVolume(double value);

	/**
	 * Returns the value of the '<em><b>Passengers Looking For Luggage Spot</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers Looking For Luggage Spot</em>' attribute.
	 * @see #setPassengersLookingForLuggageSpot(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_PassengersLookingForLuggageSpot()
	 * @model default="0"
	 * @generated
	 */
	int getPassengersLookingForLuggageSpot();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getPassengersLookingForLuggageSpot <em>Passengers Looking For Luggage Spot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passengers Looking For Luggage Spot</em>' attribute.
	 * @see #getPassengersLookingForLuggageSpot()
	 * @generated
	 */
	void setPassengersLookingForLuggageSpot(int value);

	/**
	 * Returns the value of the '<em><b>Volume Of Not Stored Luggage Items</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Of Not Stored Luggage Items</em>' attribute.
	 * @see #setVolumeOfNotStoredLuggageItems(double)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_VolumeOfNotStoredLuggageItems()
	 * @model default="0"
	 * @generated
	 */
	double getVolumeOfNotStoredLuggageItems();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getVolumeOfNotStoredLuggageItems <em>Volume Of Not Stored Luggage Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Of Not Stored Luggage Items</em>' attribute.
	 * @see #getVolumeOfNotStoredLuggageItems()
	 * @generated
	 */
	void setVolumeOfNotStoredLuggageItems(double value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Active Passengers</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Active Passengers</em>' attribute.
	 * @see #setMaxNumberOfActivePassengers(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_MaxNumberOfActivePassengers()
	 * @model default="0"
	 * @generated
	 */
	int getMaxNumberOfActivePassengers();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getMaxNumberOfActivePassengers <em>Max Number Of Active Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Active Passengers</em>' attribute.
	 * @see #getMaxNumberOfActivePassengers()
	 * @generated
	 */
	void setMaxNumberOfActivePassengers(int value);

	/**
	 * Returns the value of the '<em><b>Average Number Of Active Passengers</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Number Of Active Passengers</em>' attribute.
	 * @see #setAverageNumberOfActivePassengers(int)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_AverageNumberOfActivePassengers()
	 * @model default="0"
	 * @generated
	 */
	int getAverageNumberOfActivePassengers();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getAverageNumberOfActivePassengers <em>Average Number Of Active Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Number Of Active Passengers</em>' attribute.
	 * @see #getAverageNumberOfActivePassengers()
	 * @generated
	 */
	void setAverageNumberOfActivePassengers(int value);

	/**
	 * Returns the value of the '<em><b>Average Number Of Bags</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Number Of Bags</em>' attribute.
	 * @see #setAverageNumberOfBags(double)
	 * @see com.paxelerate.model.ModelPackage#getSimulationResult_AverageNumberOfBags()
	 * @model default="0"
	 * @generated
	 */
	double getAverageNumberOfBags();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.SimulationResult#getAverageNumberOfBags <em>Average Number Of Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Number Of Bags</em>' attribute.
	 * @see #getAverageNumberOfBags()
	 * @generated
	 */
	void setAverageNumberOfBags(double value);

} // SimulationResult
