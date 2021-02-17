/**
 */
package com.paxelerate.model.monuments;

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
 *   <li>{@link com.paxelerate.model.monuments.Row#getSeatGroups <em>Seat Groups</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.monuments.MonumentsPackage#getRow()
 * @model
 * @generated
 */
public interface Row extends EObject {
	/**
	 * Returns the value of the '<em><b>Seat Groups</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.monuments.SeatGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Groups</em>' containment reference list.
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getRow_SeatGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SeatGroup> getSeatGroups();

} // Row
