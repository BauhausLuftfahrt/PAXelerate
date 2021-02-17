/**
 */
package com.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.EPoint#getX <em>X</em>}</li>
 *   <li>{@link com.paxelerate.model.EPoint#getY <em>Y</em>}</li>
 *   <li>{@link com.paxelerate.model.EPoint#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.ModelPackage#getEPoint()
 * @model
 * @generated
 */
public interface EPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see com.paxelerate.model.ModelPackage#getEPoint_X()
	 * @model default="0"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.EPoint#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see com.paxelerate.model.ModelPackage#getEPoint_Y()
	 * @model default="0"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.EPoint#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see com.paxelerate.model.ModelPackage#getEPoint_Z()
	 * @model
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.EPoint#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

} // EPoint
