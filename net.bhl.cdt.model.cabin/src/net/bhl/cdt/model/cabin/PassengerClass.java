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

} // PassengerClass
