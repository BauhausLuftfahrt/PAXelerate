/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Passenger</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getId <em>Id</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getSex <em>Sex</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getHeight <em>Height</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getAge <em>Age</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getWeight <em>Weight</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getDoor <em>Door</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getSeat <em>Seat</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getName <em>Name</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getBoardingTime
 * <em>Boarding Time</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getSeatRef
 * <em>Seat Ref</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getWidth <em>Width</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getDepth <em>Depth</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getOrientationInDegree
 * <em>Orientation In Degree</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getPositionX
 * <em>Position X</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getPositionY
 * <em>Position Y</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#isIsSeated
 * <em>Is Seated</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getWalkingSpeed
 * <em>Walking Speed</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getStartBoardingAfterDelay
 * <em>Start Boarding After Delay</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getNumberOfWaits
 * <em>Number Of Waits</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getLuggageStowTime
 * <em>Luggage Stow Time</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getTravelClass
 * <em>Travel Class</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getPassengerMood
 * <em>Passenger Mood</em>}</li>
 * <li>
 * {@link net.bhl.cdt.paxelerate.model.Passenger#getNumberOfMakeWayOperations
 * <em>Number Of Make Way Operations</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Passenger#getLuggage <em>Luggage</em>
 * }</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute. The literals
	 * are from the enumeration {@link net.bhl.cdt.paxelerate.model.Sex}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.Sex
	 * @see #setSex(Sex)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Sex()
	 * @model
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getSex <em>Sex</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Sex</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.Sex
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Seat</em>' attribute.
	 * @see #setSeat(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Seat()
	 * @model
	 * @generated
	 */
	int getSeat();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getSeat <em>Seat</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Seat</em>' attribute.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. The default
	 * value is <code>"Mr. Placeholder"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Name()
	 * @model default="Mr. Placeholder"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boarding Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #setBoardingTime(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_BoardingTime()
	 * @model
	 * @generated
	 */
	int getBoardingTime();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getBoardingTime
	 * <em>Boarding Time</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Boarding Time</em>' attribute.
	 * @see #getBoardingTime()
	 * @generated
	 */
	void setBoardingTime(int value);

	/**
	 * Returns the value of the '<em><b>Seat Ref</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Ref</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Seat Ref</em>' reference.
	 * @see #setSeatRef(Seat)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_SeatRef()
	 * @model required="true"
	 * @generated
	 */
	Seat getSeatRef();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getSeatRef
	 * <em>Seat Ref</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Seat Ref</em>' reference.
	 * @see #getSeatRef()
	 * @generated
	 */
	void setSeatRef(Seat value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getWidth <em>Width</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Depth()
	 * @model
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getDepth <em>Depth</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Orientation In Degree</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation In Degree</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Orientation In Degree</em>' attribute.
	 * @see #setOrientationInDegree(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_OrientationInDegree()
	 * @model
	 * @generated
	 */
	double getOrientationInDegree();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getOrientationInDegree
	 * <em>Orientation In Degree</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Orientation In Degree</em>'
	 *            attribute.
	 * @see #getOrientationInDegree()
	 * @generated
	 */
	void setOrientationInDegree(double value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position X</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_PositionX()
	 * @model
	 * @generated
	 */
	double getPositionX();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getPositionX
	 * <em>Position X</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(double value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Y</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_PositionY()
	 * @model
	 * @generated
	 */
	double getPositionY();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getPositionY
	 * <em>Position Y</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(double value);

	/**
	 * Returns the value of the '<em><b>Is Seated</b></em>' attribute. The
	 * default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Seated</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Is Seated</em>' attribute.
	 * @see #setIsSeated(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_IsSeated()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsSeated();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#isIsSeated
	 * <em>Is Seated</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Seated</em>' attribute.
	 * @see #isIsSeated()
	 * @generated
	 */
	void setIsSeated(boolean value);

	/**
	 * Returns the value of the '<em><b>Walking Speed</b></em>' attribute. The
	 * default value is <code>"2.0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Walking Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Walking Speed</em>' attribute.
	 * @see #setWalkingSpeed(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_WalkingSpeed()
	 * @model default="2.0"
	 * @generated
	 */
	double getWalkingSpeed();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getWalkingSpeed
	 * <em>Walking Speed</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Walking Speed</em>' attribute.
	 * @see #getWalkingSpeed()
	 * @generated
	 */
	void setWalkingSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Start Boarding After Delay</b></em>'
	 * attribute. The default value is <code>"1.0"</code>. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Start Boarding After Delay</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start Boarding After Delay</em>' attribute.
	 * @see #setStartBoardingAfterDelay(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_StartBoardingAfterDelay()
	 * @model default="1.0"
	 * @generated
	 */
	double getStartBoardingAfterDelay();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getStartBoardingAfterDelay
	 * <em>Start Boarding After Delay</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Start Boarding After Delay</em>'
	 *            attribute.
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 */
	void setStartBoardingAfterDelay(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Waits</b></em>' attribute. The
	 * default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Waits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Number Of Waits</em>' attribute.
	 * @see #setNumberOfWaits(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_NumberOfWaits()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfWaits();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getNumberOfWaits
	 * <em>Number Of Waits</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Number Of Waits</em>' attribute.
	 * @see #getNumberOfWaits()
	 * @generated
	 */
	void setNumberOfWaits(int value);

	/**
	 * Returns the value of the '<em><b>Luggage Stow Time</b></em>' attribute.
	 * The default value is <code>"1.0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luggage Stow Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Luggage Stow Time</em>' attribute.
	 * @see #setLuggageStowTime(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_LuggageStowTime()
	 * @model default="1.0"
	 * @generated
	 */
	double getLuggageStowTime();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getLuggageStowTime
	 * <em>Luggage Stow Time</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Luggage Stow Time</em>' attribute.
	 * @see #getLuggageStowTime()
	 * @generated
	 */
	void setLuggageStowTime(double value);

	/**
	 * Returns the value of the '<em><b>Travel Class</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Travel Class</em>' reference.
	 * @see #setTravelClass(TravelClass)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_TravelClass()
	 * @model required="true"
	 * @generated
	 */
	TravelClass getTravelClass();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getTravelClass
	 * <em>Travel Class</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Travel Class</em>' reference.
	 * @see #getTravelClass()
	 * @generated
	 */
	void setTravelClass(TravelClass value);

	/**
	 * Returns the value of the '<em><b>Passenger Mood</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link net.bhl.cdt.paxelerate.model.PassengerMood}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Passenger Mood</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Passenger Mood</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.PassengerMood
	 * @see #setPassengerMood(PassengerMood)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_PassengerMood()
	 * @model required="true"
	 * @generated
	 */
	PassengerMood getPassengerMood();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getPassengerMood
	 * <em>Passenger Mood</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Passenger Mood</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.PassengerMood
	 * @see #getPassengerMood()
	 * @generated
	 */
	void setPassengerMood(PassengerMood value);

	/**
	 * Returns the value of the '<em><b>Number Of Make Way Operations</b></em>'
	 * attribute. The default value is <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Make Way Operations</em>' attribute
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Number Of Make Way Operations</em>'
	 *         attribute.
	 * @see #setNumberOfMakeWayOperations(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_NumberOfMakeWayOperations()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfMakeWayOperations();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getNumberOfMakeWayOperations
	 * <em>Number Of Make Way Operations</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Number Of Make Way Operations</em>'
	 *            attribute.
	 * @see #getNumberOfMakeWayOperations()
	 * @generated
	 */
	void setNumberOfMakeWayOperations(int value);

	/**
	 * Returns the value of the '<em><b>Luggage</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link net.bhl.cdt.paxelerate.model.LuggageSize}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luggage</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Luggage</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.LuggageSize
	 * @see #setLuggage(LuggageSize)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Luggage()
	 * @model
	 * @generated
	 */
	LuggageSize getLuggage();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getLuggage <em>Luggage</em>
	 * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Luggage</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.LuggageSize
	 * @see #getLuggage()
	 * @generated
	 */
	void setLuggage(LuggageSize value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getHeight <em>Height</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getAge <em>Age</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getWeight <em>Weight</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassenger_Door()
	 * @model required="true"
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Passenger#getDoor <em>Door</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

} // Passenger
