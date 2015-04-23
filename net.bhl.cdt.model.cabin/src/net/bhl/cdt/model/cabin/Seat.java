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
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#isSeatBlocked <em>Seat Blocked</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#isCrewSeat <em>Crew Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getLetter <em>Letter</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getRow <em>Row</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#isOccupied <em>Occupied</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getPassenger <em>Passenger</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends PhysicalObject {
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
	 * Returns the value of the '<em><b>Travel Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Class</em>' reference.
	 * @see #setTravelClass(TravelClass)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_TravelClass()
	 * @model required="true"
	 * @generated
	 */
	TravelClass getTravelClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getTravelClass <em>Travel Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Class</em>' reference.
	 * @see #getTravelClass()
	 * @generated
	 */
	void setTravelClass(TravelClass value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' reference.
	 * @see #setRow(Row)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_Row()
	 * @model required="true"
	 * @generated
	 */
	Row getRow();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getRow <em>Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(Row value);

	/**
	 * Returns the value of the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied</em>' attribute.
	 * @see #setOccupied(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_Occupied()
	 * @model
	 * @generated
	 */
	boolean isOccupied();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#isOccupied <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied</em>' attribute.
	 * @see #isOccupied()
	 * @generated
	 */
	void setOccupied(boolean value);

	/**
	 * Returns the value of the '<em><b>Passenger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger</em>' reference.
	 * @see #setPassenger(Passenger)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_Passenger()
	 * @model required="true"
	 * @generated
	 */
	Passenger getPassenger();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getPassenger <em>Passenger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger</em>' reference.
	 * @see #getPassenger()
	 * @generated
	 */
	void setPassenger(Passenger value);

} // Seat
