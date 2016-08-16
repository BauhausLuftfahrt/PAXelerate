/**
 */
package net.bhl.cdt.paxelerate.model;

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
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getDate <em>Date</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingSkipped <em>Waymaking Skipped</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingCompleted <em>Waymaking Completed</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getLayoutConceptType <em>Layout Concept Type</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.SimulationResult#getSimulationTime <em>Simulation Time</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult()
 * @model
 * @generated
 */
public interface SimulationResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boarding Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #setBoardingTime(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_BoardingTime()
	 * @model
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTime <em>Boarding Time</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' attribute.
	 * @see #setPassengers(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_Passengers()
	 * @model
	 * @generated
	 */
	int getPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getPassengers <em>Passengers</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getId <em>Id</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getDate <em>Date</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Boarding Time String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time String</em>' attribute.
	 * @see #setBoardingTimeString(String)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_BoardingTimeString()
	 * @model
	 * @generated
	 */
	String getBoardingTimeString();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Waymaking Skipped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waymaking Skipped</em>' attribute.
	 * @see #setWaymakingSkipped(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_WaymakingSkipped()
	 * @model
	 * @generated
	 */
	int getWaymakingSkipped();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingSkipped <em>Waymaking Skipped</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Waymaking Completed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waymaking Completed</em>' attribute.
	 * @see #setWaymakingCompleted(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_WaymakingCompleted()
	 * @model
	 * @generated
	 */
	int getWaymakingCompleted();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingCompleted <em>Waymaking Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waymaking Completed</em>' attribute.
	 * @see #getWaymakingCompleted()
	 * @generated
	 */
	void setWaymakingCompleted(int value);

	/**
	 * Returns the value of the '<em><b>Layout Concept Type</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link net.bhl.cdt.paxelerate.model.LayoutConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Concept Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Concept Type</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
	 * @see #setLayoutConceptType(LayoutConcept)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_LayoutConceptType()
	 * @model default="Default" required="true"
	 * @generated
	 */
	LayoutConcept getLayoutConceptType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getLayoutConceptType <em>Layout Concept Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Concept Type</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
	 * @see #getLayoutConceptType()
	 * @generated
	 */
	void setLayoutConceptType(LayoutConcept value);

	/**
	 * Returns the value of the '<em><b>Simulation Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Time</em>' attribute.
	 * @see #setSimulationTime(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getSimulationResult_SimulationTime()
	 * @model default="0"
	 * @generated
	 */
	double getSimulationTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getSimulationTime <em>Simulation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Time</em>' attribute.
	 * @see #getSimulationTime()
	 * @generated
	 */
	void setSimulationTime(double value);

} // SimulationResult
