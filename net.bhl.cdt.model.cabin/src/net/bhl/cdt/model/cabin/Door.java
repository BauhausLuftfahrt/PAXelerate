/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#isOnBothSides <em>On Both Sides</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends EObject {
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_YPosition()
	 * @model
	 * @generated
	 */
	int getYPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(int value);

	/**
	 * Returns the value of the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Both Sides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Both Sides</em>' attribute.
	 * @see #setOnBothSides(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_OnBothSides()
	 * @model
	 * @generated
	 */
	boolean isOnBothSides();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#isOnBothSides <em>On Both Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Both Sides</em>' attribute.
	 * @see #isOnBothSides()
	 * @generated
	 */
	void setOnBothSides(boolean value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Door
