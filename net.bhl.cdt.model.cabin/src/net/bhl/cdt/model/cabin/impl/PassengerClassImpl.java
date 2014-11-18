/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
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
 * An implementation of the model object '<em><b>Passenger Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getAvailableSeats <em>Available Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getSeatDimensionY <em>Seat Dimension Y</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getSeatDimensionX <em>Seat Dimension X</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl#getSeatPitch <em>Seat Pitch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassengerClassImpl extends MinimalEObjectImpl.Container implements PassengerClass {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ClassType TYPE_EDEFAULT = ClassType.FIRST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getSeatDimensionY() <em>Seat Dimension Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatDimensionY()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_DIMENSION_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeatDimensionY() <em>Seat Dimension Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatDimensionY()
	 * @generated
	 * @ordered
	 */
	protected double seatDimensionY = SEAT_DIMENSION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatDimensionX() <em>Seat Dimension X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatDimensionX()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_DIMENSION_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSeatDimensionX() <em>Seat Dimension X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatDimensionX()
	 * @generated
	 * @ordered
	 */
	protected double seatDimensionX = SEAT_DIMENSION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatPitch() <em>Seat Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitch()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_PITCH_EDEFAULT = 50.0;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.PASSENGER_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassType newType) {
		ClassType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_CLASS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_CLASS__AVAILABLE_SEATS, oldAvailableSeats, availableSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<Row>(Row.class, this, CabinPackage.PASSENGER_CLASS__ROWS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_CLASS__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatDimensionY() {
		return seatDimensionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatDimensionY(double newSeatDimensionY) {
		double oldSeatDimensionY = seatDimensionY;
		seatDimensionY = newSeatDimensionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_Y, oldSeatDimensionY, seatDimensionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatDimensionX() {
		return seatDimensionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatDimensionX(double newSeatDimensionX) {
		double oldSeatDimensionX = seatDimensionX;
		seatDimensionX = newSeatDimensionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_X, oldSeatDimensionX, seatDimensionX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_CLASS__SEAT_PITCH, oldSeatPitch, seatPitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.PASSENGER_CLASS__ROWS:
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
			case CabinPackage.PASSENGER_CLASS__TYPE:
				return getType();
			case CabinPackage.PASSENGER_CLASS__AVAILABLE_SEATS:
				return getAvailableSeats();
			case CabinPackage.PASSENGER_CLASS__ROWS:
				return getRows();
			case CabinPackage.PASSENGER_CLASS__SEQUENCE:
				return getSequence();
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_Y:
				return getSeatDimensionY();
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_X:
				return getSeatDimensionX();
			case CabinPackage.PASSENGER_CLASS__SEAT_PITCH:
				return getSeatPitch();
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
			case CabinPackage.PASSENGER_CLASS__TYPE:
				setType((ClassType)newValue);
				return;
			case CabinPackage.PASSENGER_CLASS__AVAILABLE_SEATS:
				setAvailableSeats((Integer)newValue);
				return;
			case CabinPackage.PASSENGER_CLASS__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends Row>)newValue);
				return;
			case CabinPackage.PASSENGER_CLASS__SEQUENCE:
				setSequence((Integer)newValue);
				return;
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_Y:
				setSeatDimensionY((Double)newValue);
				return;
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_X:
				setSeatDimensionX((Double)newValue);
				return;
			case CabinPackage.PASSENGER_CLASS__SEAT_PITCH:
				setSeatPitch((Double)newValue);
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
			case CabinPackage.PASSENGER_CLASS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_CLASS__AVAILABLE_SEATS:
				setAvailableSeats(AVAILABLE_SEATS_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_CLASS__ROWS:
				getRows().clear();
				return;
			case CabinPackage.PASSENGER_CLASS__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_Y:
				setSeatDimensionY(SEAT_DIMENSION_Y_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_X:
				setSeatDimensionX(SEAT_DIMENSION_X_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_CLASS__SEAT_PITCH:
				setSeatPitch(SEAT_PITCH_EDEFAULT);
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
			case CabinPackage.PASSENGER_CLASS__TYPE:
				return type != TYPE_EDEFAULT;
			case CabinPackage.PASSENGER_CLASS__AVAILABLE_SEATS:
				return availableSeats != AVAILABLE_SEATS_EDEFAULT;
			case CabinPackage.PASSENGER_CLASS__ROWS:
				return rows != null && !rows.isEmpty();
			case CabinPackage.PASSENGER_CLASS__SEQUENCE:
				return sequence != SEQUENCE_EDEFAULT;
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_Y:
				return seatDimensionY != SEAT_DIMENSION_Y_EDEFAULT;
			case CabinPackage.PASSENGER_CLASS__SEAT_DIMENSION_X:
				return seatDimensionX != SEAT_DIMENSION_X_EDEFAULT;
			case CabinPackage.PASSENGER_CLASS__SEAT_PITCH:
				return seatPitch != SEAT_PITCH_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", availableSeats: ");
		result.append(availableSeats);
		result.append(", sequence: ");
		result.append(sequence);
		result.append(", seatDimensionY: ");
		result.append(seatDimensionY);
		result.append(", seatDimensionX: ");
		result.append(seatDimensionX);
		result.append(", seatPitch: ");
		result.append(seatPitch);
		result.append(')');
		return result.toString();
	}

} //PassengerClassImpl
