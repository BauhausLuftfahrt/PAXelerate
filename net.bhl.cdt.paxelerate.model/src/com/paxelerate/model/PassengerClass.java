/**
 */
package com.paxelerate.model;

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
 *   <li>{@link com.paxelerate.model.PassengerClass#getType <em>Type</em>}</li>
 *   <li>{@link com.paxelerate.model.PassengerClass#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link com.paxelerate.model.PassengerClass#getRows <em>Rows</em>}</li>
 *   <li>{@link com.paxelerate.model.PassengerClass#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.paxelerate.model.CabinPackage#getPassengerClass()
 * @model
 * @generated
 */
public interface PassengerClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.ClassType
	 * @see #setType(ClassType)
	 * @see com.paxelerate.model.CabinPackage#getPassengerClass_Type()
	 * @model
	 * @generated
	 */
	ClassType getType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PassengerClass#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.ClassType
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
	 * @see com.paxelerate.model.CabinPackage#getPassengerClass_AvailableSeats()
	 * @model
	 * @generated
	 */
	int getAvailableSeats();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PassengerClass#getAvailableSeats <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Seats</em>' attribute.
	 * @see #getAvailableSeats()
	 * @generated
	 */
	void setAvailableSeats(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see com.paxelerate.model.CabinPackage#getPassengerClass_Rows()
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
	 * @see com.paxelerate.model.CabinPackage#getPassengerClass_Sequence()
	 * @model
	 * @generated
	 */
	int getSequence();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PassengerClass#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(int value);

} // PassengerClass