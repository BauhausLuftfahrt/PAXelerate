/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;


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
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getLength <em>Length</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Seat#getLetter <em>Letter</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat()
 * @model
 * @generated
 */
public interface Seat extends EObject {
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
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_XPosition()
	 * @model
	 * @generated
	 */
	double getXPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getXPosition <em>XPosition</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSeat_YPosition()
	 * @model
	 * @generated
	 */
	double getYPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Seat#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(double value);

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
