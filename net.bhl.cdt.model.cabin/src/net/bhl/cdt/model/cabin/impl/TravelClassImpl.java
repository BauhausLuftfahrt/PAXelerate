/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.TravelClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Travel Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatPitch <em>Seat Pitch</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatsPerRow <em>Seats Per Row</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatLength <em>Seat Length</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatWidth <em>Seat Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatsPerRowString <em>Seats Per Row String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TravelClassImpl extends MinimalEObjectImpl.Container implements TravelClass {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected int sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengers() <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected int passengers = PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableSeats() <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableSeats() <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSeats()
	 * @generated
	 * @ordered
	 */
	protected int availableSeats = AVAILABLE_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatPitch() <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitch()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_PITCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeatPitch() <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitch()
	 * @generated
	 * @ordered
	 */
	protected double seatPitch = SEAT_PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatsPerRow() <em>Seats Per Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRow()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatsPerRow() <em>Seats Per Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRow()
	 * @generated
	 * @ordered
	 */
	protected int seatsPerRow = SEATS_PER_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatLength() <em>Seat Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLength()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeatLength() <em>Seat Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLength()
	 * @generated
	 * @ordered
	 */
	protected double seatLength = SEAT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatWidth() <em>Seat Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeatWidth() <em>Seat Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidth()
	 * @generated
	 * @ordered
	 */
	protected double seatWidth = SEAT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Placeholder String";

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
	 * The default value of the '{@link #getSeatsPerRowString() <em>Seats Per Row String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowString()
	 * @generated
	 * @ordered
	 */
	protected static final String SEATS_PER_ROW_STRING_EDEFAULT = "3-3";

	/**
	 * The cached value of the '{@link #getSeatsPerRowString() <em>Seats Per Row String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowString()
	 * @generated
	 * @ordered
	 */
	protected String seatsPerRowString = SEATS_PER_ROW_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.TRAVEL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<Row>(Row.class, this, CabinPackage.TRAVEL_CLASS__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(int newSequence) {
		int oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassengers() {
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengers(int newPassengers) {
		int oldPassengers = passengers;
		passengers = newPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__PASSENGERS, oldPassengers, passengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableSeats() {
		return availableSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableSeats(int newAvailableSeats) {
		int oldAvailableSeats = availableSeats;
		availableSeats = newAvailableSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS, oldAvailableSeats, availableSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatPitch() {
		return seatPitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatPitch(double newSeatPitch) {
		double oldSeatPitch = seatPitch;
		seatPitch = newSeatPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEAT_PITCH, oldSeatPitch, seatPitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsPerRow() {
		return seatsPerRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsPerRow(int newSeatsPerRow) {
		int oldSeatsPerRow = seatsPerRow;
		seatsPerRow = newSeatsPerRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW, oldSeatsPerRow, seatsPerRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatLength() {
		return seatLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLength(double newSeatLength) {
		double oldSeatLength = seatLength;
		seatLength = newSeatLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEAT_LENGTH, oldSeatLength, seatLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatWidth() {
		return seatWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatWidth(double newSeatWidth) {
		double oldSeatWidth = seatWidth;
		seatWidth = newSeatWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEAT_WIDTH, oldSeatWidth, seatWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeatsPerRowString() {
		return seatsPerRowString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsPerRowString(String newSeatsPerRowString) {
		String oldSeatsPerRowString = seatsPerRowString;
		seatsPerRowString = newSeatsPerRowString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW_STRING, oldSeatsPerRowString, seatsPerRowString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.TRAVEL_CLASS__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.TRAVEL_CLASS__ROWS:
				return getRows();
			case CabinPackage.TRAVEL_CLASS__SEQUENCE:
				return getSequence();
			case CabinPackage.TRAVEL_CLASS__PASSENGERS:
				return getPassengers();
			case CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS:
				return getAvailableSeats();
			case CabinPackage.TRAVEL_CLASS__SEAT_PITCH:
				return getSeatPitch();
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW:
				return getSeatsPerRow();
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				return getSeatLength();
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				return getSeatWidth();
			case CabinPackage.TRAVEL_CLASS__NAME:
				return getName();
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW_STRING:
				return getSeatsPerRowString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.TRAVEL_CLASS__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEQUENCE:
				setSequence((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__PASSENGERS:
				setPassengers((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS:
				setAvailableSeats((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_PITCH:
				setSeatPitch((Double)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW:
				setSeatsPerRow((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				setSeatLength((Double)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				setSeatWidth((Double)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__NAME:
				setName((String)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW_STRING:
				setSeatsPerRowString((String)newValue);
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
			case CabinPackage.TRAVEL_CLASS__ROWS:
				getRows().clear();
				return;
			case CabinPackage.TRAVEL_CLASS__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__PASSENGERS:
				setPassengers(PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS:
				setAvailableSeats(AVAILABLE_SEATS_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_PITCH:
				setSeatPitch(SEAT_PITCH_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW:
				setSeatsPerRow(SEATS_PER_ROW_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				setSeatLength(SEAT_LENGTH_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				setSeatWidth(SEAT_WIDTH_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW_STRING:
				setSeatsPerRowString(SEATS_PER_ROW_STRING_EDEFAULT);
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
			case CabinPackage.TRAVEL_CLASS__ROWS:
				return rows != null && !rows.isEmpty();
			case CabinPackage.TRAVEL_CLASS__SEQUENCE:
				return sequence != SEQUENCE_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__PASSENGERS:
				return passengers != PASSENGERS_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS:
				return availableSeats != AVAILABLE_SEATS_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__SEAT_PITCH:
				return seatPitch != SEAT_PITCH_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW:
				return seatsPerRow != SEATS_PER_ROW_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				return seatLength != SEAT_LENGTH_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				return seatWidth != SEAT_WIDTH_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.TRAVEL_CLASS__SEATS_PER_ROW_STRING:
				return SEATS_PER_ROW_STRING_EDEFAULT == null ? seatsPerRowString != null : !SEATS_PER_ROW_STRING_EDEFAULT.equals(seatsPerRowString);
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
		result.append(" (sequence: ");
		result.append(sequence);
		result.append(", passengers: ");
		result.append(passengers);
		result.append(", availableSeats: ");
		result.append(availableSeats);
		result.append(", seatPitch: ");
		result.append(seatPitch);
		result.append(", seatsPerRow: ");
		result.append(seatsPerRow);
		result.append(", seatLength: ");
		result.append(seatLength);
		result.append(", seatWidth: ");
		result.append(seatWidth);
		result.append(", name: ");
		result.append(name);
		result.append(", seatsPerRowString: ");
		result.append(seatsPerRowString);
		result.append(')');
		return result.toString();
	}

} //TravelClassImpl
