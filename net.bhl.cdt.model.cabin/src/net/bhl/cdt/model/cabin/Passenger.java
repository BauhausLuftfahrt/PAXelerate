/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getSex <em>Sex</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getHeight <em>Height</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getAge <em>Age</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getWeight <em>Weight</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getDoor <em>Door</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getSeat <em>Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getSeatRef <em>Seat Ref</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getDepth <em>Depth</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getOrientationInDegree <em>Orientation In Degree</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getPositionX <em>Position X</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#isIsSeated <em>Is Seated</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getWalkingSpeed <em>Walking Speed</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getNumberOfWaits <em>Number Of Waits</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#isHasLuggage <em>Has Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getLuggageStowTime <em>Luggage Stow Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.Sex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see #setSex(Sex)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Sex()
	 * @model
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' attribute.
	 * @see #setSeat(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Seat()
	 * @model
	 * @generated
	 */
	int getSeat();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getSeat <em>Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' attribute.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Mr. Placeholder"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Name()
	 * @model default="Mr. Placeholder"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.ClassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see #setClass(ClassType)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Class()
	 * @model
	 * @generated
	 */
	ClassType getClass_();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ClassType value);

	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boarding Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #setBoardingTime(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_BoardingTime()
	 * @model
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getBoardingTime <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Time</em>' attribute.
	 * @see #getBoardingTime()
	 * @generated
	 */
	void setBoardingTime(double value);

	/**
	 * Returns the value of the '<em><b>Seat Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Ref</em>' reference.
	 * @see #setSeatRef(Seat)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_SeatRef()
	 * @model required="true"
	 * @generated
	 */
	Seat getSeatRef();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getSeatRef <em>Seat Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Ref</em>' reference.
	 * @see #getSeatRef()
	 * @generated
	 */
	void setSeatRef(Seat value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Depth()
	 * @model
	 * @generated
	 */
	double getDepth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(double value);

	/**
	 * Returns the value of the '<em><b>Orientation In Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation In Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation In Degree</em>' attribute.
	 * @see #setOrientationInDegree(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_OrientationInDegree()
	 * @model
	 * @generated
	 */
	double getOrientationInDegree();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getOrientationInDegree <em>Orientation In Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation In Degree</em>' attribute.
	 * @see #getOrientationInDegree()
	 * @generated
	 */
	void setOrientationInDegree(double value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' attribute.
	 * @see #setPositionX(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_PositionX()
	 * @model
	 * @generated
	 */
	double getPositionX();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getPositionX <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' attribute.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(double value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Y</em>' attribute.
	 * @see #setPositionY(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_PositionY()
	 * @model
	 * @generated
	 */
	double getPositionY();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getPositionY <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' attribute.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(double value);

	/**
	 * Returns the value of the '<em><b>Is Seated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Seated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Seated</em>' attribute.
	 * @see #setIsSeated(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_IsSeated()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsSeated();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#isIsSeated <em>Is Seated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Seated</em>' attribute.
	 * @see #isIsSeated()
	 * @generated
	 */
	void setIsSeated(boolean value);

	/**
	 * Returns the value of the '<em><b>Walking Speed</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Walking Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Walking Speed</em>' attribute.
	 * @see #setWalkingSpeed(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_WalkingSpeed()
	 * @model default="2.0"
	 * @generated
	 */
	double getWalkingSpeed();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getWalkingSpeed <em>Walking Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walking Speed</em>' attribute.
	 * @see #getWalkingSpeed()
	 * @generated
	 */
	void setWalkingSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Start Boarding After Delay</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Boarding After Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Boarding After Delay</em>' attribute.
	 * @see #setStartBoardingAfterDelay(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_StartBoardingAfterDelay()
	 * @model default="1.0"
	 * @generated
	 */
	double getStartBoardingAfterDelay();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Boarding After Delay</em>' attribute.
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 */
	void setStartBoardingAfterDelay(double value);

	/**
	 * Returns the value of the '<em><b>Number Of Waits</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Waits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Waits</em>' attribute.
	 * @see #setNumberOfWaits(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_NumberOfWaits()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfWaits();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getNumberOfWaits <em>Number Of Waits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Waits</em>' attribute.
	 * @see #getNumberOfWaits()
	 * @generated
	 */
	void setNumberOfWaits(int value);

	/**
	 * Returns the value of the '<em><b>Has Luggage</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Luggage</em>' attribute.
	 * @see #setHasLuggage(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_HasLuggage()
	 * @model default="false"
	 * @generated
	 */
	boolean isHasLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#isHasLuggage <em>Has Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Luggage</em>' attribute.
	 * @see #isHasLuggage()
	 * @generated
	 */
	void setHasLuggage(boolean value);

	/**
	 * Returns the value of the '<em><b>Luggage Stow Time</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luggage Stow Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Stow Time</em>' attribute.
	 * @see #setLuggageStowTime(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_LuggageStowTime()
	 * @model default="1.0"
	 * @generated
	 */
	double getLuggageStowTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getLuggageStowTime <em>Luggage Stow Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Stow Time</em>' attribute.
	 * @see #getLuggageStowTime()
	 * @generated
	 */
	void setLuggageStowTime(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Door()
	 * @model required="true"
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getDoor <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

} // Passenger
