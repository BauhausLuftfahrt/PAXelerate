/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stairway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Stairway#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Stairway#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Stairway#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Stairway#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Stairway#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getStairway()
 * @model
 * @generated
 */
public interface Stairway extends EObject {
	/**
	 * Returns the value of the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDimension</em>' attribute.
	 * @see #setXDimension(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getStairway_XDimension()
	 * @model
	 * @generated
	 */
	double getXDimension();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Stairway#getXDimension <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDimension</em>' attribute.
	 * @see #getXDimension()
	 * @generated
	 */
	void setXDimension(double value);

	/**
	 * Returns the value of the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDimension</em>' attribute.
	 * @see #setYDimension(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getStairway_YDimension()
	 * @model
	 * @generated
	 */
	double getYDimension();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Stairway#getYDimension <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDimension</em>' attribute.
	 * @see #getYDimension()
	 * @generated
	 */
	void setYDimension(double value);

	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #setXPosition(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getStairway_XPosition()
	 * @model
	 * @generated
	 */
	double getXPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Stairway#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #getXPosition()
	 * @generated
	 */
	void setXPosition(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getStairway_YPosition()
	 * @model
	 * @generated
	 */
	double getYPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Stairway#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(double value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.StairwayDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.StairwayDirection
	 * @see #setDirection(StairwayDirection)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getStairway_Direction()
	 * @model
	 * @generated
	 */
	StairwayDirection getDirection();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Stairway#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.StairwayDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(StairwayDirection value);

} // Stairway
