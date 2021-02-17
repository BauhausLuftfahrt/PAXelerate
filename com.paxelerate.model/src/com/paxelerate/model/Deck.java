/**
 */
package com.paxelerate.model;

import com.paxelerate.model.agent.Passenger;

import com.paxelerate.model.monuments.Aisle;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Obstacle;
import com.paxelerate.model.monuments.Row;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.Deck#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getHeight <em>Height</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getRows <em>Rows</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getObstacles <em>Obstacles</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getDoors <em>Doors</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getAisles <em>Aisles</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getShapeFloor <em>Shape Floor</em>}</li>
 *   <li>{@link com.paxelerate.model.Deck#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.ModelPackage#getDeck()
 * @model
 * @generated
 */
public interface Deck extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.paxelerate.model.ModelPackage#getDeck_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Deck#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"2.15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see com.paxelerate.model.ModelPackage#getDeck_Height()
	 * @model default="2.15"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Deck#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.monuments.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getDeck_Rows()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Obstacles</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.monuments.Obstacle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obstacles</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getDeck_Obstacles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Obstacle> getObstacles();

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.monuments.Door}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getDeck_Doors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Aisles</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.monuments.Aisle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisles</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getDeck_Aisles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aisle> getAisles();

	/**
	 * Returns the value of the '<em><b>Shape Floor</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.EPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Floor</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getDeck_ShapeFloor()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPoint> getShapeFloor();

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.agent.Passenger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' containment reference list.
	 * @see com.paxelerate.model.ModelPackage#getDeck_Passengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Passenger> getPassengers();

} // Deck
