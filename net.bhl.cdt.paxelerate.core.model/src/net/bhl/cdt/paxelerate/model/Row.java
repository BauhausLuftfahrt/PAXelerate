/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Row#getSeats <em>Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Row#getRowNumber <em>Row Number</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Seats</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.paxelerate.model.Seat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getRow_Seats()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Seat> getSeats();

	/**
	 * Returns the value of the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Number</em>' attribute.
	 * @see #setRowNumber(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getRow_RowNumber()
	 * @model
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Row#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

} // Row