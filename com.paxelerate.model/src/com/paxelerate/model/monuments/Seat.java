/**
 */
package com.paxelerate.model.monuments;

import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.SeatType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.Seat#getLetter <em>Letter</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Seat#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Seat#getSeatLocation <em>Seat Location</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.Seat#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.monuments.MonumentsPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends EObject {
	/**
	 * Returns the value of the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter</em>' attribute.
	 * @see #setLetter(char)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getSeat_Letter()
	 * @model
	 * @generated
	 */
	char getLetter();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Seat#getLetter <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter</em>' attribute.
	 * @see #getLetter()
	 * @generated
	 */
	void setLetter(char value);

	/**
	 * Returns the value of the '<em><b>Seat Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.SeatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatType
	 * @see #setSeatType(SeatType)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getSeat_SeatType()
	 * @model required="true"
	 * @generated
	 */
	SeatType getSeatType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Seat#getSeatType <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Type</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatType
	 * @see #getSeatType()
	 * @generated
	 */
	void setSeatType(SeatType value);

	/**
	 * Returns the value of the '<em><b>Seat Location</b></em>' attribute.
	 * The default value is <code>"WINDOW"</code>.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.SeatLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Location</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatLocation
	 * @see #setSeatLocation(SeatLocation)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getSeat_SeatLocation()
	 * @model default="WINDOW"
	 * @generated
	 */
	SeatLocation getSeatLocation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Seat#getSeatLocation <em>Seat Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Location</em>' attribute.
	 * @see com.paxelerate.model.enums.SeatLocation
	 * @see #getSeatLocation()
	 * @generated
	 */
	void setSeatLocation(SeatLocation value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.paxelerate.model.monuments.MonumentsPackage#getSeat_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.monuments.Seat#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Seat
