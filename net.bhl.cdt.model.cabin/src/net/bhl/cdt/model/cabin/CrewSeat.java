/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.CrewSeat#getSeatNumber <em>Seat Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getCrewSeat()
 * @model
 * @generated
 */
public interface CrewSeat extends EObject {
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCrewSeat_SeatNumber()
	 * @model
	 * @generated
	 */
	int getSeatNumber();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.CrewSeat#getSeatNumber <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Number</em>' attribute.
	 * @see #getSeatNumber()
	 * @generated
	 */
	void setSeatNumber(int value);

} // CrewSeat
