/**
 */
package net.bhl.cdt.model.cabin;

import java.util.Date;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getDate <em>Date</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getTestObject <em>Test Object</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationResult#getTestObject2 <em>Test Object2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult()
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_BoardingTime()
	 * @model
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getBoardingTime <em>Boarding Time</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_Passengers()
	 * @model
	 * @generated
	 */
	int getPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getPassengers <em>Passengers</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getName <em>Name</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getId <em>Id</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Test Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Object</em>' attribute.
	 * @see #setTestObject(Unit)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_TestObject()
	 * @model dataType="net.bhl.cdt.model.units.Unit<?>"
	 * @generated
	 */
	Unit<?> getTestObject();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getTestObject <em>Test Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Object</em>' attribute.
	 * @see #getTestObject()
	 * @generated
	 */
	void setTestObject(Unit<?> value);

	/**
	 * Returns the value of the '<em><b>Test Object2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Object2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Object2</em>' attribute.
	 * @see #setTestObject2(Quantity)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationResult_TestObject2()
	 * @model dataType="net.bhl.cdt.model.units.Quantity"
	 * @generated
	 */
	Quantity getTestObject2();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationResult#getTestObject2 <em>Test Object2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Object2</em>' attribute.
	 * @see #getTestObject2()
	 * @generated
	 */
	void setTestObject2(Quantity value);

} // SimulationResult
