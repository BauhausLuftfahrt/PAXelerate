/**
 */
package com.paxelerate.model.monuments;

import com.paxelerate.model.EPoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.Monument#getPosition <em>Position</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Monument#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.monuments.MonumentsPackage#getMonument()
 * @model abstract="true"
 * @generated
 */
public interface Monument extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(EPoint)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getMonument_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EPoint getPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Monument#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(EPoint value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(EPoint)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getMonument_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EPoint getSize();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Monument#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(EPoint value);

} // Monument
