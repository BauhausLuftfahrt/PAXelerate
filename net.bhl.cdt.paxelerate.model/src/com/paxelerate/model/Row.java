/**
 */
package com.paxelerate.model;

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
 *   <li>{@link com.paxelerate.model.Row#getSeats <em>Seats</em>}</li>
 *   <li>{@link com.paxelerate.model.Row#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link com.paxelerate.model.Row#isOffsetInRow <em>Offset In Row</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.CabinPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Seats</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.Seat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' containment reference list.
	 * @see com.paxelerate.model.CabinPackage#getRow_Seats()
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
	 * @see com.paxelerate.model.CabinPackage#getRow_RowNumber()
	 * @model
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Row#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

	/**
	 * Returns the value of the '<em><b>Offset In Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset In Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset In Row</em>' attribute.
	 * @see #setOffsetInRow(boolean)
	 * @see com.paxelerate.model.CabinPackage#getRow_OffsetInRow()
	 * @model
	 * @generated
	 */
	boolean isOffsetInRow();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Row#isOffsetInRow <em>Offset In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset In Row</em>' attribute.
	 * @see #isOffsetInRow()
	 * @generated
	 */
	void setOffsetInRow(boolean value);

} // Row
