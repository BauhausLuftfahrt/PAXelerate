/**
 */
package com.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emergency Exits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.paxelerate.model.EmergencyExits#getExitInRow <em>Exit In Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.paxelerate.model.CabinPackage#getEmergencyExits()
 * @model
 * @generated
 */
public interface EmergencyExits extends EObject {
	/**
	 * Returns the value of the '<em><b>Exit In Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit In Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit In Row</em>' attribute.
	 * @see #setExitInRow(int)
	 * @see com.paxelerate.model.CabinPackage#getEmergencyExits_ExitInRow()
	 * @model
	 * @generated
	 */
	int getExitInRow();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.EmergencyExits#getExitInRow <em>Exit In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit In Row</em>' attribute.
	 * @see #getExitInRow()
	 * @generated
	 */
	void setExitInRow(int value);

} // EmergencyExits