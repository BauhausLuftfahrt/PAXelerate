/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emergency Exit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.EmergencyExit#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.EmergencyExit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getEmergencyExit()
 * @model
 * @generated
 */
public interface EmergencyExit extends EObject {
	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getEmergencyExit_YPosition()
	 * @model
	 * @generated
	 */
	double getYPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.EmergencyExit#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.DoorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.DoorType
	 * @see #setType(DoorType)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getEmergencyExit_Type()
	 * @model
	 * @generated
	 */
	DoorType getType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.EmergencyExit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.DoorType
	 * @see #getType()
	 * @generated
	 */
	void setType(DoorType value);

} // EmergencyExit
