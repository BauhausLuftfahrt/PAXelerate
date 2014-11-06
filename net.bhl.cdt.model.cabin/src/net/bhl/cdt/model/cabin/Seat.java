/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getSeatNumber <em>Seat Number</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getSeatType <em>Seat Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends EObject {
	/**
	 * Returns the value of the '<em><b>Seat Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Number</em>' attribute.
	 * @see #setSeatNumber(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_SeatNumber()
	 * @model
	 * @generated
	 */
	int getSeatNumber();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getSeatNumber <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Number</em>' attribute.
	 * @see #getSeatNumber()
	 * @generated
	 */
	void setSeatNumber(int value);

	/**
	 * Returns the value of the '<em><b>Seat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Type</em>' attribute.
	 * @see #setSeatType(String)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_SeatType()
	 * @model
	 * @generated
	 */
	String getSeatType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getSeatType <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Type</em>' attribute.
	 * @see #getSeatType()
	 * @generated
	 */
	void setSeatType(String value);

} // Seat
