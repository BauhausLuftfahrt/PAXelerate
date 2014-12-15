/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.TravelClass;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getSeatId <em>Seat Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getSeatNumber <em>Seat Number</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#isSeatBlocked <em>Seat Blocked</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#isCrewSeat <em>Crew Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getLetter <em>Letter</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SeatImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeatImpl extends PhysicalObjectImpl implements Seat {
	/**
	 * The default value of the '{@link #getSeatId() <em>Seat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeatId() <em>Seat Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatId()
	 * @generated
	 * @ordered
	 */
	protected String seatId = SEAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatNumber() <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatNumber() <em>Seat Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatNumber()
	 * @generated
	 * @ordered
	 */
	protected int seatNumber = SEAT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeatBlocked() <em>Seat Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeatBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEAT_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeatBlocked() <em>Seat Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeatBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean seatBlocked = SEAT_BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCrewSeat() <em>Crew Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrewSeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREW_SEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCrewSeat() <em>Crew Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrewSeat()
	 * @generated
	 * @ordered
	 */
	protected boolean crewSeat = CREW_SEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected static final String LETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected String letter = LETTER_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Placeholder";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.SEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatNumber(int newSeatNumber) {
		int oldSeatNumber = seatNumber;
		seatNumber = newSeatNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__SEAT_NUMBER, oldSeatNumber, seatNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeatBlocked() {
		return seatBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatBlocked(boolean newSeatBlocked) {
		boolean oldSeatBlocked = seatBlocked;
		seatBlocked = newSeatBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__SEAT_BLOCKED, oldSeatBlocked, seatBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCrewSeat() {
		return crewSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrewSeat(boolean newCrewSeat) {
		boolean oldCrewSeat = crewSeat;
		crewSeat = newCrewSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__CREW_SEAT, oldCrewSeat, crewSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLetter() {
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetter(String newLetter) {
		String oldLetter = letter;
		letter = newLetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__LETTER, oldLetter, letter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.SEAT__TRAVEL_CLASS, oldTravelClass, travelClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__TRAVEL_CLASS, oldTravelClass, travelClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeatId() {
		return seatId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatId(String newSeatId) {
		String oldSeatId = seatId;
		seatId = newSeatId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__SEAT_ID, oldSeatId, seatId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.SEAT__SEAT_ID:
				return getSeatId();
			case CabinPackage.SEAT__SEAT_NUMBER:
				return getSeatNumber();
			case CabinPackage.SEAT__SEAT_BLOCKED:
				return isSeatBlocked();
			case CabinPackage.SEAT__CREW_SEAT:
				return isCrewSeat();
			case CabinPackage.SEAT__LETTER:
				return getLetter();
			case CabinPackage.SEAT__TRAVEL_CLASS:
				if (resolve) return getTravelClass();
				return basicGetTravelClass();
			case CabinPackage.SEAT__NAME:
				return getName();
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
			case CabinPackage.SEAT__SEAT_ID:
				setSeatId((String)newValue);
				return;
			case CabinPackage.SEAT__SEAT_NUMBER:
				setSeatNumber((Integer)newValue);
				return;
			case CabinPackage.SEAT__SEAT_BLOCKED:
				setSeatBlocked((Boolean)newValue);
				return;
			case CabinPackage.SEAT__CREW_SEAT:
				setCrewSeat((Boolean)newValue);
				return;
			case CabinPackage.SEAT__LETTER:
				setLetter((String)newValue);
				return;
			case CabinPackage.SEAT__TRAVEL_CLASS:
				setTravelClass((TravelClass)newValue);
				return;
			case CabinPackage.SEAT__NAME:
				setName((String)newValue);
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
			case CabinPackage.SEAT__SEAT_ID:
				setSeatId(SEAT_ID_EDEFAULT);
				return;
			case CabinPackage.SEAT__SEAT_NUMBER:
				setSeatNumber(SEAT_NUMBER_EDEFAULT);
				return;
			case CabinPackage.SEAT__SEAT_BLOCKED:
				setSeatBlocked(SEAT_BLOCKED_EDEFAULT);
				return;
			case CabinPackage.SEAT__CREW_SEAT:
				setCrewSeat(CREW_SEAT_EDEFAULT);
				return;
			case CabinPackage.SEAT__LETTER:
				setLetter(LETTER_EDEFAULT);
				return;
			case CabinPackage.SEAT__TRAVEL_CLASS:
				setTravelClass((TravelClass)null);
				return;
			case CabinPackage.SEAT__NAME:
				setName(NAME_EDEFAULT);
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
			case CabinPackage.SEAT__SEAT_ID:
				return SEAT_ID_EDEFAULT == null ? seatId != null : !SEAT_ID_EDEFAULT.equals(seatId);
			case CabinPackage.SEAT__SEAT_NUMBER:
				return seatNumber != SEAT_NUMBER_EDEFAULT;
			case CabinPackage.SEAT__SEAT_BLOCKED:
				return seatBlocked != SEAT_BLOCKED_EDEFAULT;
			case CabinPackage.SEAT__CREW_SEAT:
				return crewSeat != CREW_SEAT_EDEFAULT;
			case CabinPackage.SEAT__LETTER:
				return LETTER_EDEFAULT == null ? letter != null : !LETTER_EDEFAULT.equals(letter);
			case CabinPackage.SEAT__TRAVEL_CLASS:
				return travelClass != null;
			case CabinPackage.SEAT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (seatId: ");
		result.append(seatId);
		result.append(", seatNumber: ");
		result.append(seatNumber);
		result.append(", seatBlocked: ");
		result.append(seatBlocked);
		result.append(", crewSeat: ");
		result.append(crewSeat);
		result.append(", letter: ");
		result.append(letter);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
