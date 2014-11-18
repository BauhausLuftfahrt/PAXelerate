/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getType <em>Type</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getRows <em>Rows</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getSequence <em>Sequence</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getSeatDimensionY <em>Seat Dimension Y</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getSeatDimensionX <em>Seat Dimension X</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.PassengerClass#getSeatPitch <em>Seat Pitch</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass()
 * @model
 * @generated
 */
public interface PassengerClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see #setType(ClassType)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_Type()
	 * @model
	 * @generated
	 */
	ClassType getType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.PassengerClass#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassType value);

	/**
	 * Returns the value of the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Seats</em>' attribute.
	 * @see #setAvailableSeats(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_AvailableSeats()
	 * @model
	 * @generated
	 */
	int getAvailableSeats();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.PassengerClass#getAvailableSeats <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Seats</em>' attribute.
	 * @see #getAvailableSeats()
	 * @generated
	 */
	void setAvailableSeats(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_Rows()
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_Sequence()
	 * @model
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.PassengerClass#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

	/**
	 * Returns the value of the '<em><b>Seat Dimension Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Dimension Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Dimension Y</em>' attribute.
	 * @see #setSeatDimensionY(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_SeatDimensionY()
	 * @model
	 * @generated
	 */
	double getSeatDimensionY();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.PassengerClass#getSeatDimensionY <em>Seat Dimension Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Dimension Y</em>' attribute.
	 * @see #getSeatDimensionY()
	 * @generated
	 */
	void setSeatDimensionY(double value);

	/**
	 * Returns the value of the '<em><b>Seat Dimension X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Dimension X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Dimension X</em>' attribute.
	 * @see #setSeatDimensionX(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_SeatDimensionX()
	 * @model
	 * @generated
	 */
	double getSeatDimensionX();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.PassengerClass#getSeatDimensionX <em>Seat Dimension X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Dimension X</em>' attribute.
	 * @see #getSeatDimensionX()
	 * @generated
	 */
	void setSeatDimensionX(double value);

	/**
	 * Returns the value of the '<em><b>Seat Pitch</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Pitch</em>' attribute.
	 * @see #setSeatPitch(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassengerClass_SeatPitch()
	 * @model default="50"
	 * @generated
	 */
	double getSeatPitch();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.PassengerClass#getSeatPitch <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Pitch</em>' attribute.
	 * @see #getSeatPitch()
	 * @generated
	 */
	void setSeatPitch(double value);

} // PassengerClass
