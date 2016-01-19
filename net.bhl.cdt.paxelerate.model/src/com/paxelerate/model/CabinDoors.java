/**
 */
package com.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.paxelerate.model.CabinDoors#getXCoordinate <em>XCoordinate</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinDoors#getYCoordinate <em>YCoordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.paxelerate.model.CabinPackage#getCabinDoors()
 * @model
 * @generated
 */
public interface CabinDoors extends EObject {

	/**
	 * Returns the value of the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XCoordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XCoordinate</em>' attribute.
	 * @see #setXCoordinate(int)
	 * @see com.paxelerate.model.CabinPackage#getCabinDoors_XCoordinate()
	 * @model
	 * @generated
	 */
	int getXCoordinate();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinDoors#getXCoordinate <em>XCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCoordinate</em>' attribute.
	 * @see #getXCoordinate()
	 * @generated
	 */
	void setXCoordinate(int value);

	/**
	 * Returns the value of the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCoordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCoordinate</em>' attribute.
	 * @see #setYCoordinate(int)
	 * @see com.paxelerate.model.CabinPackage#getCabinDoors_YCoordinate()
	 * @model
	 * @generated
	 */
	int getYCoordinate();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinDoors#getYCoordinate <em>YCoordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCoordinate</em>' attribute.
	 * @see #getYCoordinate()
	 * @generated
	 */
	void setYCoordinate(int value);
} // CabinDoors
