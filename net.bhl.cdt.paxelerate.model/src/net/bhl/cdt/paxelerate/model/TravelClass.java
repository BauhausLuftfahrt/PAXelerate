/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Travel Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getRows <em>Rows</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getSequence <em>Sequence</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getSeatPitch <em>Seat Pitch</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getXDimensionOfSeats <em>XDimension Of Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getYDimensionOfSeats <em>YDimension Of Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getRowStructure <em>Row Structure</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.TravelClass#getLoadFactor <em>Load Factor</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass()
 * @model abstract="true"
 * @generated
 */
public interface TravelClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.paxelerate.model.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_Rows()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_Sequence()
	 * @model
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' attribute.
	 * @see #setPassengers(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_Passengers()
	 * @model default="0"
	 * @generated
	 */
	int getPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getPassengers <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passengers</em>' attribute.
	 * @see #getPassengers()
	 * @generated
	 */
	void setPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Available Seats</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Seats</em>' attribute.
	 * @see #setAvailableSeats(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_AvailableSeats()
	 * @model default="0"
	 * @generated
	 */
	int getAvailableSeats();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getAvailableSeats <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Seats</em>' attribute.
	 * @see #getAvailableSeats()
	 * @generated
	 */
	void setAvailableSeats(int value);

	/**
	 * Returns the value of the '<em><b>Seat Pitch</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Pitch</em>' attribute.
	 * @see #setSeatPitch(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_SeatPitch()
	 * @model default="0"
	 * @generated
	 */
	int getSeatPitch();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getSeatPitch <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Pitch</em>' attribute.
	 * @see #getSeatPitch()
	 * @generated
	 */
	void setSeatPitch(int value);

	/**
	 * Returns the value of the '<em><b>XDimension Of Seats</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDimension Of Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDimension Of Seats</em>' attribute.
	 * @see #setXDimensionOfSeats(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_XDimensionOfSeats()
	 * @model default="0"
	 * @generated
	 */
	int getXDimensionOfSeats();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getXDimensionOfSeats <em>XDimension Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDimension Of Seats</em>' attribute.
	 * @see #getXDimensionOfSeats()
	 * @generated
	 */
	void setXDimensionOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>YDimension Of Seats</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDimension Of Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDimension Of Seats</em>' attribute.
	 * @see #setYDimensionOfSeats(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_YDimensionOfSeats()
	 * @model default="0"
	 * @generated
	 */
	int getYDimensionOfSeats();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getYDimensionOfSeats <em>YDimension Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDimension Of Seats</em>' attribute.
	 * @see #getYDimensionOfSeats()
	 * @generated
	 */
	void setYDimensionOfSeats(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Placeholder String"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_Name()
	 * @model default="Placeholder String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Row Structure</b></em>' attribute.
	 * The default value is <code>"3-3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Structure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Structure</em>' attribute.
	 * @see #setRowStructure(String)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_RowStructure()
	 * @model default="3-3"
	 * @generated
	 */
	String getRowStructure();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getRowStructure <em>Row Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Structure</em>' attribute.
	 * @see #getRowStructure()
	 * @generated
	 */
	void setRowStructure(String value);

	/**
	 * Returns the value of the '<em><b>Load Factor</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Factor</em>' attribute.
	 * @see #setLoadFactor(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getTravelClass_LoadFactor()
	 * @model default="0"
	 * @generated
	 */
	int getLoadFactor();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.TravelClass#getLoadFactor <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor</em>' attribute.
	 * @see #getLoadFactor()
	 * @generated
	 */
	void setLoadFactor(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean tooManyPassengers(DiagnosticChain chain, Map<?, ?> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean wrongRowStructure(DiagnosticChain chain, Map<?, ?> context);

} // TravelClass
