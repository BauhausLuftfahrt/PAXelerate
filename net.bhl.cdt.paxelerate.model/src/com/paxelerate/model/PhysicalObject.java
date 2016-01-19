/**
 */
package com.paxelerate.model;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.PhysicalObject#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link com.paxelerate.model.PhysicalObject#getYNowXPosition <em>YNow XPosition</em>}</li>
 *   <li>{@link com.paxelerate.model.PhysicalObject#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link com.paxelerate.model.PhysicalObject#getYNowXDimension <em>YNow XDimension</em>}</li>
 *   <li>{@link com.paxelerate.model.PhysicalObject#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.PhysicalObject#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.CabinPackage#getPhysicalObject()
 * @model
 * @generated
 */
public interface PhysicalObject extends EObject {
	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(int)
	 * @see com.paxelerate.model.CabinPackage#getPhysicalObject_YPosition()
	 * @model
	 * @generated
	 */
	int getYPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PhysicalObject#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(int value);

	/**
	 * Returns the value of the '<em><b>YNow XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YNow XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YNow XPosition</em>' attribute.
	 * @see #setYNowXPosition(int)
	 * @see com.paxelerate.model.CabinPackage#getPhysicalObject_YNowXPosition()
	 * @model
	 * @generated
	 */
	int getYNowXPosition();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PhysicalObject#getYNowXPosition <em>YNow XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YNow XPosition</em>' attribute.
	 * @see #getYNowXPosition()
	 * @generated
	 */
	void setYNowXPosition(int value);

	/**
	 * Returns the value of the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDimension</em>' attribute.
	 * @see #setYDimension(int)
	 * @see com.paxelerate.model.CabinPackage#getPhysicalObject_YDimension()
	 * @model
	 * @generated
	 */
	int getYDimension();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PhysicalObject#getYDimension <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDimension</em>' attribute.
	 * @see #getYDimension()
	 * @generated
	 */
	void setYDimension(int value);

	/**
	 * Returns the value of the '<em><b>YNow XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YNow XDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YNow XDimension</em>' attribute.
	 * @see #setYNowXDimension(int)
	 * @see com.paxelerate.model.CabinPackage#getPhysicalObject_YNowXDimension()
	 * @model
	 * @generated
	 */
	int getYNowXDimension();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PhysicalObject#getYNowXDimension <em>YNow XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YNow XDimension</em>' attribute.
	 * @see #getYNowXDimension()
	 * @generated
	 */
	void setYNowXDimension(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.paxelerate.model.CabinPackage#getPhysicalObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PhysicalObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.paxelerate.model.CabinPackage#getPhysicalObject_Id()
	 * @model default="0"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.PhysicalObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean outOfBounds(DiagnosticChain chain, Map<?, ?> context);

} // PhysicalObject
