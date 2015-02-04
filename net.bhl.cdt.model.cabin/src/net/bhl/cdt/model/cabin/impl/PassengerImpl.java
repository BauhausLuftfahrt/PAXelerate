/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.TravelClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getAge <em>Age</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getDoor <em>Door</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getSeat <em>Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getSeatRef <em>Seat Ref</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getOrientationInDegree <em>Orientation In Degree</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#isIsSeated <em>Is Seated</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getWalkingSpeed <em>Walking Speed</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getNumberOfWaits <em>Number Of Waits</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#isHasLuggage <em>Has Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getLuggageStowTime <em>Luggage Stow Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getPassengerMood <em>Passenger Mood</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengerImpl extends MinimalEObjectImpl.Container implements Passenger {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final Sex SEX_EDEFAULT = Sex.MALE;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected Sex sex = SEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoor() <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoor()
	 * @generated
	 * @ordered
	 */
	protected Door door;

	/**
	 * The default value of the '{@link #getSeat() <em>Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeat() <em>Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeat()
	 * @generated
	 * @ordered
	 */
	protected int seat = SEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Mr. Placeholder";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected static final int BOARDING_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected int boardingTime = BOARDING_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeatRef() <em>Seat Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatRef()
	 * @generated
	 * @ordered
	 */
	protected Seat seatRef;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientationInDegree() <em>Orientation In Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationInDegree()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIENTATION_IN_DEGREE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOrientationInDegree() <em>Orientation In Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationInDegree()
	 * @generated
	 * @ordered
	 */
	protected double orientationInDegree = ORIENTATION_IN_DEGREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected double positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected double positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSeated() <em>Is Seated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSeated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSeated() <em>Is Seated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSeated()
	 * @generated
	 * @ordered
	 */
	protected boolean isSeated = IS_SEATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getWalkingSpeed() <em>Walking Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalkingSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double WALKING_SPEED_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getWalkingSpeed() <em>Walking Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalkingSpeed()
	 * @generated
	 * @ordered
	 */
	protected double walkingSpeed = WALKING_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartBoardingAfterDelay() <em>Start Boarding After Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double START_BOARDING_AFTER_DELAY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getStartBoardingAfterDelay() <em>Start Boarding After Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartBoardingAfterDelay()
	 * @generated
	 * @ordered
	 */
	protected double startBoardingAfterDelay = START_BOARDING_AFTER_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfWaits() <em>Number Of Waits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWaits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_WAITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfWaits() <em>Number Of Waits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWaits()
	 * @generated
	 * @ordered
	 */
	protected int numberOfWaits = NUMBER_OF_WAITS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasLuggage() <em>Has Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_LUGGAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasLuggage() <em>Has Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasLuggage()
	 * @generated
	 * @ordered
	 */
	protected boolean hasLuggage = HAS_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuggageStowTime() <em>Luggage Stow Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowTime()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STOW_TIME_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getLuggageStowTime() <em>Luggage Stow Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowTime()
	 * @generated
	 * @ordered
	 */
	protected double luggageStowTime = LUGGAGE_STOW_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTravelClass() <em>Travel Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelClass()
	 * @generated
	 * @ordered
	 */
	protected TravelClass travelClass;

	/**
	 * The default value of the '{@link #getPassengerMood() <em>Passenger Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMood()
	 * @generated
	 * @ordered
	 */
	protected static final PassengerMood PASSENGER_MOOD_EDEFAULT = PassengerMood.AGRESSIVE;

	/**
	 * The cached value of the '{@link #getPassengerMood() <em>Passenger Mood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMood()
	 * @generated
	 * @ordered
	 */
	protected PassengerMood passengerMood = PASSENGER_MOOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.PASSENGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(Sex newSex) {
		Sex oldSex = sex;
		sex = newSex == null ? SEX_EDEFAULT : newSex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__SEX, oldSex, sex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeat() {
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeat(int newSeat) {
		int oldSeat = seat;
		seat = newSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__SEAT, oldSeat, seat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBoardingTime() {
		return boardingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingTime(int newBoardingTime) {
		int oldBoardingTime = boardingTime;
		boardingTime = newBoardingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__BOARDING_TIME, oldBoardingTime, boardingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat getSeatRef() {
		if (seatRef != null && seatRef.eIsProxy()) {
			InternalEObject oldSeatRef = (InternalEObject)seatRef;
			seatRef = (Seat)eResolveProxy(oldSeatRef);
			if (seatRef != oldSeatRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.PASSENGER__SEAT_REF, oldSeatRef, seatRef));
			}
		}
		return seatRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat basicGetSeatRef() {
		return seatRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatRef(Seat newSeatRef) {
		Seat oldSeatRef = seatRef;
		seatRef = newSeatRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__SEAT_REF, oldSeatRef, seatRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOrientationInDegree() {
		return orientationInDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientationInDegree(double newOrientationInDegree) {
		double oldOrientationInDegree = orientationInDegree;
		orientationInDegree = newOrientationInDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__ORIENTATION_IN_DEGREE, oldOrientationInDegree, orientationInDegree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(double newPositionX) {
		double oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(double newPositionY) {
		double oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSeated() {
		return isSeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSeated(boolean newIsSeated) {
		boolean oldIsSeated = isSeated;
		isSeated = newIsSeated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__IS_SEATED, oldIsSeated, isSeated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWalkingSpeed() {
		return walkingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWalkingSpeed(double newWalkingSpeed) {
		double oldWalkingSpeed = walkingSpeed;
		walkingSpeed = newWalkingSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__WALKING_SPEED, oldWalkingSpeed, walkingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartBoardingAfterDelay() {
		return startBoardingAfterDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartBoardingAfterDelay(double newStartBoardingAfterDelay) {
		double oldStartBoardingAfterDelay = startBoardingAfterDelay;
		startBoardingAfterDelay = newStartBoardingAfterDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__START_BOARDING_AFTER_DELAY, oldStartBoardingAfterDelay, startBoardingAfterDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfWaits() {
		return numberOfWaits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfWaits(int newNumberOfWaits) {
		int oldNumberOfWaits = numberOfWaits;
		numberOfWaits = newNumberOfWaits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__NUMBER_OF_WAITS, oldNumberOfWaits, numberOfWaits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasLuggage() {
		return hasLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLuggage(boolean newHasLuggage) {
		boolean oldHasLuggage = hasLuggage;
		hasLuggage = newHasLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__HAS_LUGGAGE, oldHasLuggage, hasLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLuggageStowTime() {
		return luggageStowTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuggageStowTime(double newLuggageStowTime) {
		double oldLuggageStowTime = luggageStowTime;
		luggageStowTime = newLuggageStowTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__LUGGAGE_STOW_TIME, oldLuggageStowTime, luggageStowTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelClass getTravelClass() {
		if (travelClass != null && travelClass.eIsProxy()) {
			InternalEObject oldTravelClass = (InternalEObject)travelClass;
			travelClass = (TravelClass)eResolveProxy(oldTravelClass);
			if (travelClass != oldTravelClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.PASSENGER__TRAVEL_CLASS, oldTravelClass, travelClass));
			}
		}
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelClass basicGetTravelClass() {
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelClass(TravelClass newTravelClass) {
		TravelClass oldTravelClass = travelClass;
		travelClass = newTravelClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__TRAVEL_CLASS, oldTravelClass, travelClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerMood getPassengerMood() {
		return passengerMood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerMood(PassengerMood newPassengerMood) {
		PassengerMood oldPassengerMood = passengerMood;
		passengerMood = newPassengerMood == null ? PASSENGER_MOOD_EDEFAULT : newPassengerMood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__PASSENGER_MOOD, oldPassengerMood, passengerMood));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (door != null && door.eIsProxy()) {
			InternalEObject oldDoor = (InternalEObject)door;
			door = (Door)eResolveProxy(oldDoor);
			if (door != oldDoor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.PASSENGER__DOOR, oldDoor, door));
			}
		}
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door basicGetDoor() {
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		Door oldDoor = door;
		door = newDoor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__DOOR, oldDoor, door));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.PASSENGER__ID:
				return getId();
			case CabinPackage.PASSENGER__SEX:
				return getSex();
			case CabinPackage.PASSENGER__HEIGHT:
				return getHeight();
			case CabinPackage.PASSENGER__AGE:
				return getAge();
			case CabinPackage.PASSENGER__WEIGHT:
				return getWeight();
			case CabinPackage.PASSENGER__DOOR:
				if (resolve) return getDoor();
				return basicGetDoor();
			case CabinPackage.PASSENGER__SEAT:
				return getSeat();
			case CabinPackage.PASSENGER__NAME:
				return getName();
			case CabinPackage.PASSENGER__BOARDING_TIME:
				return getBoardingTime();
			case CabinPackage.PASSENGER__SEAT_REF:
				if (resolve) return getSeatRef();
				return basicGetSeatRef();
			case CabinPackage.PASSENGER__WIDTH:
				return getWidth();
			case CabinPackage.PASSENGER__DEPTH:
				return getDepth();
			case CabinPackage.PASSENGER__ORIENTATION_IN_DEGREE:
				return getOrientationInDegree();
			case CabinPackage.PASSENGER__POSITION_X:
				return getPositionX();
			case CabinPackage.PASSENGER__POSITION_Y:
				return getPositionY();
			case CabinPackage.PASSENGER__IS_SEATED:
				return isIsSeated();
			case CabinPackage.PASSENGER__WALKING_SPEED:
				return getWalkingSpeed();
			case CabinPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
				return getStartBoardingAfterDelay();
			case CabinPackage.PASSENGER__NUMBER_OF_WAITS:
				return getNumberOfWaits();
			case CabinPackage.PASSENGER__HAS_LUGGAGE:
				return isHasLuggage();
			case CabinPackage.PASSENGER__LUGGAGE_STOW_TIME:
				return getLuggageStowTime();
			case CabinPackage.PASSENGER__TRAVEL_CLASS:
				if (resolve) return getTravelClass();
				return basicGetTravelClass();
			case CabinPackage.PASSENGER__PASSENGER_MOOD:
				return getPassengerMood();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.PASSENGER__ID:
				setId((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__SEX:
				setSex((Sex)newValue);
				return;
			case CabinPackage.PASSENGER__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__AGE:
				setAge((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__DOOR:
				setDoor((Door)newValue);
				return;
			case CabinPackage.PASSENGER__SEAT:
				setSeat((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__NAME:
				setName((String)newValue);
				return;
			case CabinPackage.PASSENGER__BOARDING_TIME:
				setBoardingTime((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__SEAT_REF:
				setSeatRef((Seat)newValue);
				return;
			case CabinPackage.PASSENGER__WIDTH:
				setWidth((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__DEPTH:
				setDepth((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__ORIENTATION_IN_DEGREE:
				setOrientationInDegree((Double)newValue);
				return;
			case CabinPackage.PASSENGER__POSITION_X:
				setPositionX((Double)newValue);
				return;
			case CabinPackage.PASSENGER__POSITION_Y:
				setPositionY((Double)newValue);
				return;
			case CabinPackage.PASSENGER__IS_SEATED:
				setIsSeated((Boolean)newValue);
				return;
			case CabinPackage.PASSENGER__WALKING_SPEED:
				setWalkingSpeed((Double)newValue);
				return;
			case CabinPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
				setStartBoardingAfterDelay((Double)newValue);
				return;
			case CabinPackage.PASSENGER__NUMBER_OF_WAITS:
				setNumberOfWaits((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__HAS_LUGGAGE:
				setHasLuggage((Boolean)newValue);
				return;
			case CabinPackage.PASSENGER__LUGGAGE_STOW_TIME:
				setLuggageStowTime((Double)newValue);
				return;
			case CabinPackage.PASSENGER__TRAVEL_CLASS:
				setTravelClass((TravelClass)newValue);
				return;
			case CabinPackage.PASSENGER__PASSENGER_MOOD:
				setPassengerMood((PassengerMood)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.PASSENGER__ID:
				setId(ID_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__SEX:
				setSex(SEX_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__DOOR:
				setDoor((Door)null);
				return;
			case CabinPackage.PASSENGER__SEAT:
				setSeat(SEAT_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__BOARDING_TIME:
				setBoardingTime(BOARDING_TIME_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__SEAT_REF:
				setSeatRef((Seat)null);
				return;
			case CabinPackage.PASSENGER__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__ORIENTATION_IN_DEGREE:
				setOrientationInDegree(ORIENTATION_IN_DEGREE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__IS_SEATED:
				setIsSeated(IS_SEATED_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__WALKING_SPEED:
				setWalkingSpeed(WALKING_SPEED_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
				setStartBoardingAfterDelay(START_BOARDING_AFTER_DELAY_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__NUMBER_OF_WAITS:
				setNumberOfWaits(NUMBER_OF_WAITS_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__HAS_LUGGAGE:
				setHasLuggage(HAS_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__LUGGAGE_STOW_TIME:
				setLuggageStowTime(LUGGAGE_STOW_TIME_EDEFAULT);
				return;
			case CabinPackage.PASSENGER__TRAVEL_CLASS:
				setTravelClass((TravelClass)null);
				return;
			case CabinPackage.PASSENGER__PASSENGER_MOOD:
				setPassengerMood(PASSENGER_MOOD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.PASSENGER__ID:
				return id != ID_EDEFAULT;
			case CabinPackage.PASSENGER__SEX:
				return sex != SEX_EDEFAULT;
			case CabinPackage.PASSENGER__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case CabinPackage.PASSENGER__AGE:
				return age != AGE_EDEFAULT;
			case CabinPackage.PASSENGER__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case CabinPackage.PASSENGER__DOOR:
				return door != null;
			case CabinPackage.PASSENGER__SEAT:
				return seat != SEAT_EDEFAULT;
			case CabinPackage.PASSENGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.PASSENGER__BOARDING_TIME:
				return boardingTime != BOARDING_TIME_EDEFAULT;
			case CabinPackage.PASSENGER__SEAT_REF:
				return seatRef != null;
			case CabinPackage.PASSENGER__WIDTH:
				return width != WIDTH_EDEFAULT;
			case CabinPackage.PASSENGER__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case CabinPackage.PASSENGER__ORIENTATION_IN_DEGREE:
				return orientationInDegree != ORIENTATION_IN_DEGREE_EDEFAULT;
			case CabinPackage.PASSENGER__POSITION_X:
				return positionX != POSITION_X_EDEFAULT;
			case CabinPackage.PASSENGER__POSITION_Y:
				return positionY != POSITION_Y_EDEFAULT;
			case CabinPackage.PASSENGER__IS_SEATED:
				return isSeated != IS_SEATED_EDEFAULT;
			case CabinPackage.PASSENGER__WALKING_SPEED:
				return walkingSpeed != WALKING_SPEED_EDEFAULT;
			case CabinPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
				return startBoardingAfterDelay != START_BOARDING_AFTER_DELAY_EDEFAULT;
			case CabinPackage.PASSENGER__NUMBER_OF_WAITS:
				return numberOfWaits != NUMBER_OF_WAITS_EDEFAULT;
			case CabinPackage.PASSENGER__HAS_LUGGAGE:
				return hasLuggage != HAS_LUGGAGE_EDEFAULT;
			case CabinPackage.PASSENGER__LUGGAGE_STOW_TIME:
				return luggageStowTime != LUGGAGE_STOW_TIME_EDEFAULT;
			case CabinPackage.PASSENGER__TRAVEL_CLASS:
				return travelClass != null;
			case CabinPackage.PASSENGER__PASSENGER_MOOD:
				return passengerMood != PASSENGER_MOOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", sex: ");
		result.append(sex);
		result.append(", height: ");
		result.append(height);
		result.append(", age: ");
		result.append(age);
		result.append(", weight: ");
		result.append(weight);
		result.append(", seat: ");
		result.append(seat);
		result.append(", Name: ");
		result.append(name);
		result.append(", boardingTime: ");
		result.append(boardingTime);
		result.append(", width: ");
		result.append(width);
		result.append(", depth: ");
		result.append(depth);
		result.append(", orientationInDegree: ");
		result.append(orientationInDegree);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", isSeated: ");
		result.append(isSeated);
		result.append(", walkingSpeed: ");
		result.append(walkingSpeed);
		result.append(", startBoardingAfterDelay: ");
		result.append(startBoardingAfterDelay);
		result.append(", numberOfWaits: ");
		result.append(numberOfWaits);
		result.append(", hasLuggage: ");
		result.append(hasLuggage);
		result.append(", luggageStowTime: ");
		result.append(luggageStowTime);
		result.append(", passengerMood: ");
		result.append(passengerMood);
		result.append(')');
		return result.toString();
	}

} //PassengerImpl
