/**
 */
package com.paxelerate.model.monuments;

import com.paxelerate.model.EPoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aisle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.Aisle#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Aisle#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Aisle#isIgnoreForSimulation <em>Ignore For Simulation</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Aisle#getPath <em>Path</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Aisle#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.monuments.MonumentsPackage#getAisle()
 * @model
 * @generated
 */
public interface Aisle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getAisle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Aisle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getAisle_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Aisle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Ignore For Simulation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore For Simulation</em>' attribute.
	 * @see #setIgnoreForSimulation(boolean)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getAisle_IgnoreForSimulation()
	 * @model default="false"
	 * @generated
	 */
	boolean isIgnoreForSimulation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Aisle#isIgnoreForSimulation <em>Ignore For Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore For Simulation</em>' attribute.
	 * @see #isIgnoreForSimulation()
	 * @generated
	 */
	void setIgnoreForSimulation(boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.EPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference list.
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getAisle_Path()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPoint> getPath();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0.51"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getAisle_Width()
	 * @model default="0.51"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Aisle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

} // Aisle
