/**
 */
package com.paxelerate.model.monuments;

import com.paxelerate.model.enums.TravelClass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.Obstacle#getSeats <em>Seats</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Obstacle#getTravelClass <em>Travel Class</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.monuments.MonumentsPackage#getObstacle()
 * @model
 * @generated
 */
public interface Obstacle extends Monument {
	/**
	 * Returns the value of the '<em><b>Seats</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.monuments.Seat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' containment reference list.
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getObstacle_Seats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Seat> getSeats();

	/**
	 * Returns the value of the '<em><b>Travel Class</b></em>' attribute.
	 * The default value is <code>"ECONOMY"</code>.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.TravelClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Class</em>' attribute.
	 * @see com.paxelerate.model.enums.TravelClass
	 * @see #setTravelClass(TravelClass)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getObstacle_TravelClass()
	 * @model default="ECONOMY"
	 * @generated
	 */
	TravelClass getTravelClass();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Obstacle#getTravelClass <em>Travel Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Class</em>' attribute.
	 * @see com.paxelerate.model.enums.TravelClass
	 * @see #getTravelClass()
	 * @generated
	 */
	void setTravelClass(TravelClass value);

} // Obstacle
