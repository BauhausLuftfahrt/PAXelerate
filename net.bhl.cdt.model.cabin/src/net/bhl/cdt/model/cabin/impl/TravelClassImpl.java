/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.cabin.util.CabinValidator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Travel Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatPitch <em>Seat Pitch</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatLength <em>Seat Length</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getSeatWidth <em>Seat Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl#getRowStructure <em>Row Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TravelClassImpl extends MinimalEObjectImpl.Container implements
		TravelClass {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> rows;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected int sequence = SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengers() <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected int passengers = PASSENGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableSeats() <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAvailableSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailableSeats() <em>Available Seats</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAvailableSeats()
	 * @generated
	 * @ordered
	 */
	protected int availableSeats = AVAILABLE_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatPitch() <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeatPitch()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_PITCH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatPitch() <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeatPitch()
	 * @generated
	 * @ordered
	 */
	protected int seatPitch = SEAT_PITCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatLength() <em>Seat Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeatLength()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatLength() <em>Seat Length</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeatLength()
	 * @generated
	 * @ordered
	 */
	protected int seatLength = SEAT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatWidth() <em>Seat Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeatWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeatWidth() <em>Seat Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSeatWidth()
	 * @generated
	 * @ordered
	 */
	protected int seatWidth = SEAT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Placeholder String";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowStructure() <em>Row Structure</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRowStructure()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_STRUCTURE_EDEFAULT = "3-3";

	/**
	 * The cached value of the '{@link #getRowStructure() <em>Row Structure</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRowStructure()
	 * @generated
	 * @ordered
	 */
	protected String rowStructure = ROW_STRUCTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TravelClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.TRAVEL_CLASS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<Row>(Row.class, this, CabinPackage.TRAVEL_CLASS__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(int newSequence) {
		int oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassengers() {
		return passengers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengers(int newPassengers) {
		int oldPassengers = passengers;
		passengers = newPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__PASSENGERS, oldPassengers, passengers));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailableSeats() {
		return availableSeats;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableSeats(int newAvailableSeats) {
		int oldAvailableSeats = availableSeats;
		availableSeats = newAvailableSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS, oldAvailableSeats, availableSeats));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatPitch() {
		return seatPitch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatPitch(int newSeatPitch) {
		int oldSeatPitch = seatPitch;
		seatPitch = newSeatPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEAT_PITCH, oldSeatPitch, seatPitch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatLength() {
		return seatLength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLength(int newSeatLength) {
		int oldSeatLength = seatLength;
		seatLength = newSeatLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEAT_LENGTH, oldSeatLength, seatLength));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatWidth() {
		return seatWidth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatWidth(int newSeatWidth) {
		int oldSeatWidth = seatWidth;
		seatWidth = newSeatWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__SEAT_WIDTH, oldSeatWidth, seatWidth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowStructure() {
		return rowStructure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowStructure(String newRowStructure) {
		String oldRowStructure = rowStructure;
		rowStructure = newRowStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE, oldRowStructure, rowStructure));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean tooManyPassengers(DiagnosticChain chain, Map<?, ?> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and
		// message
		// Ensure that you remove @generated or mark it @generated NOT

		if (getAvailableSeats() < getPassengers()) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR,
						CabinValidator.DIAGNOSTIC_SOURCE,
						CabinValidator.TRAVEL_CLASS__TOO_MANY_PASSENGERS,
						"Too many passengers for the available seats",
						new Object[] {
								this,
								CabinPackage.eINSTANCE
										.getTravelClass_Passengers() }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.TRAVEL_CLASS__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				return getSeatLength();
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				return getSeatWidth();
			case CabinPackage.TRAVEL_CLASS__NAME:
				return getName();
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				return getRowStructure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
				setSeatPitch((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				setSeatLength((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				setSeatWidth((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__NAME:
				setName((String)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				setRowStructure((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				setSeatLength(SEAT_LENGTH_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				setSeatWidth(SEAT_WIDTH_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				setRowStructure(ROW_STRUCTURE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case CabinPackage.TRAVEL_CLASS__SEAT_LENGTH:
				return seatLength != SEAT_LENGTH_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__SEAT_WIDTH:
				return seatWidth != SEAT_WIDTH_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				return ROW_STRUCTURE_EDEFAULT == null ? rowStructure != null : !ROW_STRUCTURE_EDEFAULT.equals(rowStructure);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case CabinPackage.TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP:
				return tooManyPassengers((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", seatLength: ");
		result.append(seatLength);
		result.append(", seatWidth: ");
		result.append(seatWidth);
		result.append(", name: ");
		result.append(name);
		result.append(", rowStructure: ");
		result.append(rowStructure);
		result.append(')');
		return result.toString();
	}

} // TravelClassImpl
