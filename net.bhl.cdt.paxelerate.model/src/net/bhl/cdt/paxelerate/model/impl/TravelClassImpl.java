/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

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

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.model.util.CabinValidator;
import net.bhl.cdt.paxelerate.util.input.InputChecker;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Travel Class</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getSeatPitch <em>Seat Pitch</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getXDimensionOfSeats <em>XDimension Of Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getYDimensionOfSeats <em>YDimension Of Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getRowStructure <em>Row Structure</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl#getTravelOption <em>Travel Option</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getXDimensionOfSeats() <em>XDimension Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimensionOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int XDIMENSION_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXDimensionOfSeats() <em>XDimension Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimensionOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int xDimensionOfSeats = XDIMENSION_OF_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDimensionOfSeats() <em>YDimension Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimensionOfSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int YDIMENSION_OF_SEATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYDimensionOfSeats() <em>YDimension Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimensionOfSeats()
	 * @generated
	 * @ordered
	 */
	protected int yDimensionOfSeats = YDIMENSION_OF_SEATS_EDEFAULT;

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
	 * The default value of the '{@link #getLoadFactor() <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int LOAD_FACTOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLoadFactor() <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected int loadFactor = LOAD_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelOption() <em>Travel Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelOption()
	 * @generated
	 * @ordered
	 */
	protected static final TravelOption TRAVEL_OPTION_EDEFAULT = TravelOption.ECONOMY_CLASS;

	/**
	 * The cached value of the '{@link #getTravelOption() <em>Travel Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelOption()
	 * @generated
	 * @ordered
	 */
	protected TravelOption travelOption = TRAVEL_OPTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXDimensionOfSeats() {
		return xDimensionOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDimensionOfSeats(int newXDimensionOfSeats) {
		int oldXDimensionOfSeats = xDimensionOfSeats;
		xDimensionOfSeats = newXDimensionOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__XDIMENSION_OF_SEATS, oldXDimensionOfSeats, xDimensionOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYDimensionOfSeats() {
		return yDimensionOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYDimensionOfSeats(int newYDimensionOfSeats) {
		int oldYDimensionOfSeats = yDimensionOfSeats;
		yDimensionOfSeats = newYDimensionOfSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__YDIMENSION_OF_SEATS, oldYDimensionOfSeats, yDimensionOfSeats));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLoadFactor() {
		return loadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadFactor(int newLoadFactor) {
		int oldLoadFactor = loadFactor;
		loadFactor = newLoadFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__LOAD_FACTOR, oldLoadFactor, loadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelOption getTravelOption() {
		return travelOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelOption(TravelOption newTravelOption) {
		TravelOption oldTravelOption = travelOption;
		travelOption = newTravelOption == null ? TRAVEL_OPTION_EDEFAULT : newTravelOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.TRAVEL_CLASS__TRAVEL_OPTION, oldTravelOption, travelOption));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean tooManyPassengers(DiagnosticChain chain, Map<?, ?> context) {
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
	 * 
	 * @generated NOT
	 */
	public boolean wrongRowStructure(DiagnosticChain chain, Map<?, ?> context) {
		if (!InputChecker.noIssuesDetected(getRowStructure())) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR,
						CabinValidator.DIAGNOSTIC_SOURCE,
						CabinValidator.TRAVEL_CLASS__WRONG_ROW_STRUCTURE,
						"Wrong row structure. Please use A-A structure!",
						new Object[] {
								this,
								CabinPackage.eINSTANCE
										.getTravelClass_RowStructure() }));
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
			case CabinPackage.TRAVEL_CLASS__XDIMENSION_OF_SEATS:
				return getXDimensionOfSeats();
			case CabinPackage.TRAVEL_CLASS__YDIMENSION_OF_SEATS:
				return getYDimensionOfSeats();
			case CabinPackage.TRAVEL_CLASS__NAME:
				return getName();
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				return getRowStructure();
			case CabinPackage.TRAVEL_CLASS__LOAD_FACTOR:
				return getLoadFactor();
			case CabinPackage.TRAVEL_CLASS__TRAVEL_OPTION:
				return getTravelOption();
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
			case CabinPackage.TRAVEL_CLASS__XDIMENSION_OF_SEATS:
				setXDimensionOfSeats((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__YDIMENSION_OF_SEATS:
				setYDimensionOfSeats((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__NAME:
				setName((String)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				setRowStructure((String)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__LOAD_FACTOR:
				setLoadFactor((Integer)newValue);
				return;
			case CabinPackage.TRAVEL_CLASS__TRAVEL_OPTION:
				setTravelOption((TravelOption)newValue);
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
			case CabinPackage.TRAVEL_CLASS__XDIMENSION_OF_SEATS:
				setXDimensionOfSeats(XDIMENSION_OF_SEATS_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__YDIMENSION_OF_SEATS:
				setYDimensionOfSeats(YDIMENSION_OF_SEATS_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				setRowStructure(ROW_STRUCTURE_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__LOAD_FACTOR:
				setLoadFactor(LOAD_FACTOR_EDEFAULT);
				return;
			case CabinPackage.TRAVEL_CLASS__TRAVEL_OPTION:
				setTravelOption(TRAVEL_OPTION_EDEFAULT);
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
			case CabinPackage.TRAVEL_CLASS__XDIMENSION_OF_SEATS:
				return xDimensionOfSeats != XDIMENSION_OF_SEATS_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__YDIMENSION_OF_SEATS:
				return yDimensionOfSeats != YDIMENSION_OF_SEATS_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
				return ROW_STRUCTURE_EDEFAULT == null ? rowStructure != null : !ROW_STRUCTURE_EDEFAULT.equals(rowStructure);
			case CabinPackage.TRAVEL_CLASS__LOAD_FACTOR:
				return loadFactor != LOAD_FACTOR_EDEFAULT;
			case CabinPackage.TRAVEL_CLASS__TRAVEL_OPTION:
				return travelOption != TRAVEL_OPTION_EDEFAULT;
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
			case CabinPackage.TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP:
				return wrongRowStructure((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
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
		result.append(", xDimensionOfSeats: ");
		result.append(xDimensionOfSeats);
		result.append(", yDimensionOfSeats: ");
		result.append(yDimensionOfSeats);
		result.append(", name: ");
		result.append(name);
		result.append(", rowStructure: ");
		result.append(rowStructure);
		result.append(", loadFactor: ");
		result.append(loadFactor);
		result.append(", travelOption: ");
		result.append(travelOption);
		result.append(')');
		return result.toString();
	}

} // TravelClassImpl
