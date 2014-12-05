/**
 */
package net.bhl.cdt.model.cabin;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getSeatId <em>Seat Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getSeatNumber <em>Seat Number</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#isSeatBlocked <em>Seat Blocked</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#isCrewSeat <em>Crew Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getLetter <em>Letter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends PhysicalObject {
	/**
	 * Returns the value of the '<em><b>Seat Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Number</em>' attribute.
	 * @see #setSeatNumber(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_SeatNumber()
	 * @model
	 * @generated
	 */
	int getSeatNumber();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getSeatNumber <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Number</em>' attribute.
	 * @see #getSeatNumber()
	 * @generated
	 */
	void setSeatNumber(int value);

	/**
	 * Returns the value of the '<em><b>Seat Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Blocked</em>' attribute.
	 * @see #setSeatBlocked(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_SeatBlocked()
	 * @model
	 * @generated
	 */
	boolean isSeatBlocked();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#isSeatBlocked <em>Seat Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Blocked</em>' attribute.
	 * @see #isSeatBlocked()
	 * @generated
	 */
	void setSeatBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Crew Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crew Seat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew Seat</em>' attribute.
	 * @see #setCrewSeat(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_CrewSeat()
	 * @model
	 * @generated
	 */
	boolean isCrewSeat();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#isCrewSeat <em>Crew Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew Seat</em>' attribute.
	 * @see #isCrewSeat()
	 * @generated
	 */
	void setCrewSeat(boolean value);

	/**
	 * Returns the value of the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter</em>' attribute.
	 * @see #setLetter(String)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_Letter()
	 * @model
	 * @generated
	 */
	String getLetter();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getLetter <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter</em>' attribute.
	 * @see #getLetter()
	 * @generated
	 */
	void setLetter(String value);

	/**
	 * Returns the value of the '<em><b>Seat Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Id</em>' attribute.
	 * @see #setSeatId(String)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_SeatId()
	 * @model
	 * @generated
	 */
	String getSeatId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getSeatId <em>Seat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Id</em>' attribute.
	 * @see #getSeatId()
	 * @generated
	 */
	void setSeatId(String value);

} // Seat
