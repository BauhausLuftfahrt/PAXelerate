/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SeatType;
import net.bhl.cdt.paxelerate.model.TravelClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#isSeatBlocked <em>Seat Blocked</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#isCrewSeat <em>Crew Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#getLetter <em>Letter</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#getTravelClass <em>Travel Class</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#getRow <em>Row</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#isOccupied <em>Occupied</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#getPassenger <em>Passenger</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl#getSeatType <em>Seat Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatImpl extends PhysicalObjectImpl implements Seat {
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
	 * The cached value of the '{@link #getRow() <em>Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected Row row;

	/**
	 * The default value of the '{@link #isOccupied() <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OCCUPIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOccupied() <em>Occupied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOccupied()
	 * @generated
	 * @ordered
	 */
	protected boolean occupied = OCCUPIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassenger() <em>Passenger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassenger()
	 * @generated
	 * @ordered
	 */
	protected Passenger passenger;

	/**
	 * The default value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected static final SeatType SEAT_TYPE_EDEFAULT = SeatType.DEFAULT;

	/**
	 * The cached value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected SeatType seatType = SEAT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected SeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the e class
	 * @generated 
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.SEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return true, if is seat blocked
	 * @generated 
	 */
	public boolean isSeatBlocked() {
		return seatBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newSeatBlocked the new seat blocked
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
	 * <!-- end-user-doc -->.
	 *
	 * @return true, if is crew seat
	 * @generated 
	 */
	public boolean isCrewSeat() {
		return crewSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newCrewSeat the new crew seat
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the letter
	 * @generated 
	 */
	public String getLetter() {
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newLetter the new letter
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class
	 * @generated 
	 */
	public TravelClass basicGetTravelClass() {
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newTravelClass the new travel class
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the row
	 * @generated 
	 */
	public Row getRow() {
		if (row != null && row.eIsProxy()) {
			InternalEObject oldRow = (InternalEObject)row;
			row = (Row)eResolveProxy(oldRow);
			if (row != oldRow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.SEAT__ROW, oldRow, row));
			}
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the row
	 * @generated 
	 */
	public Row basicGetRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newRow the new row
	 * @generated 
	 */
	public void setRow(Row newRow) {
		Row oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return true, if is occupied
	 * @generated 
	 */
	public boolean isOccupied() {
		return occupied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newOccupied the new occupied
	 * @generated 
	 */
	public void setOccupied(boolean newOccupied) {
		boolean oldOccupied = occupied;
		occupied = newOccupied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__OCCUPIED, oldOccupied, occupied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger
	 * @generated 
	 */
	public Passenger getPassenger() {
		if (passenger != null && passenger.eIsProxy()) {
			InternalEObject oldPassenger = (InternalEObject)passenger;
			passenger = (Passenger)eResolveProxy(oldPassenger);
			if (passenger != oldPassenger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CabinPackage.SEAT__PASSENGER, oldPassenger, passenger));
			}
		}
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger
	 * @generated 
	 */
	public Passenger basicGetPassenger() {
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassenger the new passenger
	 * @generated 
	 */
	public void setPassenger(Passenger newPassenger) {
		Passenger oldPassenger = passenger;
		passenger = newPassenger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__PASSENGER, oldPassenger, passenger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatType getSeatType() {
		return seatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatType(SeatType newSeatType) {
		SeatType oldSeatType = seatType;
		seatType = newSeatType == null ? SEAT_TYPE_EDEFAULT : newSeatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SEAT__SEAT_TYPE, oldSeatType, seatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param resolve the resolve
	 * @param coreType the core type
	 * @return the object
	 * @generated 
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.SEAT__SEAT_BLOCKED:
				return isSeatBlocked();
			case CabinPackage.SEAT__CREW_SEAT:
				return isCrewSeat();
			case CabinPackage.SEAT__LETTER:
				return getLetter();
			case CabinPackage.SEAT__TRAVEL_CLASS:
				if (resolve) return getTravelClass();
				return basicGetTravelClass();
			case CabinPackage.SEAT__ROW:
				if (resolve) return getRow();
				return basicGetRow();
			case CabinPackage.SEAT__OCCUPIED:
				return isOccupied();
			case CabinPackage.SEAT__PASSENGER:
				if (resolve) return getPassenger();
				return basicGetPassenger();
			case CabinPackage.SEAT__SEAT_TYPE:
				return getSeatType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param newValue the new value
	 * @generated 
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case CabinPackage.SEAT__ROW:
				setRow((Row)newValue);
				return;
			case CabinPackage.SEAT__OCCUPIED:
				setOccupied((Boolean)newValue);
				return;
			case CabinPackage.SEAT__PASSENGER:
				setPassenger((Passenger)newValue);
				return;
			case CabinPackage.SEAT__SEAT_TYPE:
				setSeatType((SeatType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @generated 
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
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
			case CabinPackage.SEAT__ROW:
				setRow((Row)null);
				return;
			case CabinPackage.SEAT__OCCUPIED:
				setOccupied(OCCUPIED_EDEFAULT);
				return;
			case CabinPackage.SEAT__PASSENGER:
				setPassenger((Passenger)null);
				return;
			case CabinPackage.SEAT__SEAT_TYPE:
				setSeatType(SEAT_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @return true, if successful
	 * @generated 
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.SEAT__SEAT_BLOCKED:
				return seatBlocked != SEAT_BLOCKED_EDEFAULT;
			case CabinPackage.SEAT__CREW_SEAT:
				return crewSeat != CREW_SEAT_EDEFAULT;
			case CabinPackage.SEAT__LETTER:
				return LETTER_EDEFAULT == null ? letter != null : !LETTER_EDEFAULT.equals(letter);
			case CabinPackage.SEAT__TRAVEL_CLASS:
				return travelClass != null;
			case CabinPackage.SEAT__ROW:
				return row != null;
			case CabinPackage.SEAT__OCCUPIED:
				return occupied != OCCUPIED_EDEFAULT;
			case CabinPackage.SEAT__PASSENGER:
				return passenger != null;
			case CabinPackage.SEAT__SEAT_TYPE:
				return seatType != SEAT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the string
	 * @generated 
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (seatBlocked: ");
		result.append(seatBlocked);
		result.append(", crewSeat: ");
		result.append(crewSeat);
		result.append(", letter: ");
		result.append(letter);
		result.append(", occupied: ");
		result.append(occupied);
		result.append(", seatType: ");
		result.append(seatType);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
