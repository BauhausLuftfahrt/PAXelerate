/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
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
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getSeatRef <em>Seat Ref</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getOrientationInDegree <em>Orientation In Degree</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerImpl#isIsSeated <em>Is Seated</em>}</li>
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
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

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
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final ClassType CLASS_EDEFAULT = ClassType.FIRST;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected ClassType class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double BOARDING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected double boardingTime = BOARDING_TIME_EDEFAULT;

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
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected double depth = DEPTH_EDEFAULT;

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
	public ClassType getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(ClassType newClass) {
		ClassType oldClass = class_;
		class_ = newClass == null ? CLASS_EDEFAULT : newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoardingTime() {
		return boardingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingTime(double newBoardingTime) {
		double oldBoardingTime = boardingTime;
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
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		double oldDepth = depth;
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
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
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
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
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
			case CabinPackage.PASSENGER__CLASS:
				return getClass_();
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
				setHeight((Double)newValue);
				return;
			case CabinPackage.PASSENGER__AGE:
				setAge((Integer)newValue);
				return;
			case CabinPackage.PASSENGER__WEIGHT:
				setWeight((Double)newValue);
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
			case CabinPackage.PASSENGER__CLASS:
				setClass((ClassType)newValue);
				return;
			case CabinPackage.PASSENGER__BOARDING_TIME:
				setBoardingTime((Double)newValue);
				return;
			case CabinPackage.PASSENGER__SEAT_REF:
				setSeatRef((Seat)newValue);
				return;
			case CabinPackage.PASSENGER__WIDTH:
				setWidth((Double)newValue);
				return;
			case CabinPackage.PASSENGER__DEPTH:
				setDepth((Double)newValue);
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
			case CabinPackage.PASSENGER__CLASS:
				setClass(CLASS_EDEFAULT);
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
			case CabinPackage.PASSENGER__CLASS:
				return class_ != CLASS_EDEFAULT;
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
		result.append(", class: ");
		result.append(class_);
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
		result.append(')');
		return result.toString();
	}

} //PassengerImpl
