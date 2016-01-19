/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.SimulationResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl#getBoardingTimeString <em>Boarding Time String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationResultImpl extends MinimalEObjectImpl.Container implements SimulationResult {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardingTimeString() <em>Boarding Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTimeString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOARDING_TIME_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoardingTimeString() <em>Boarding Time String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTimeString()
	 * @generated
	 * @ordered
	 */
	protected String boardingTimeString = BOARDING_TIME_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.SIMULATION_RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__BOARDING_TIME, oldBoardingTime, boardingTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__PASSENGERS, oldPassengers, passengers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoardingTimeString() {
		return boardingTimeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingTimeString(String newBoardingTimeString) {
		String oldBoardingTimeString = boardingTimeString;
		boardingTimeString = newBoardingTimeString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__BOARDING_TIME_STRING, oldBoardingTimeString, boardingTimeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME:
				return getBoardingTime();
			case CabinPackage.SIMULATION_RESULT__PASSENGERS:
				return getPassengers();
			case CabinPackage.SIMULATION_RESULT__NAME:
				return getName();
			case CabinPackage.SIMULATION_RESULT__ID:
				return getId();
			case CabinPackage.SIMULATION_RESULT__DATE:
				return getDate();
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
				return getBoardingTimeString();
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
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME:
				setBoardingTime((Double)newValue);
				return;
			case CabinPackage.SIMULATION_RESULT__PASSENGERS:
				setPassengers((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_RESULT__NAME:
				setName((String)newValue);
				return;
			case CabinPackage.SIMULATION_RESULT__ID:
				setId((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_RESULT__DATE:
				setDate((Date)newValue);
				return;
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
				setBoardingTimeString((String)newValue);
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
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME:
				setBoardingTime(BOARDING_TIME_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_RESULT__PASSENGERS:
				setPassengers(PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_RESULT__ID:
				setId(ID_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_RESULT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
				setBoardingTimeString(BOARDING_TIME_STRING_EDEFAULT);
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
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME:
				return boardingTime != BOARDING_TIME_EDEFAULT;
			case CabinPackage.SIMULATION_RESULT__PASSENGERS:
				return passengers != PASSENGERS_EDEFAULT;
			case CabinPackage.SIMULATION_RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.SIMULATION_RESULT__ID:
				return id != ID_EDEFAULT;
			case CabinPackage.SIMULATION_RESULT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case CabinPackage.SIMULATION_RESULT__BOARDING_TIME_STRING:
				return BOARDING_TIME_STRING_EDEFAULT == null ? boardingTimeString != null : !BOARDING_TIME_STRING_EDEFAULT.equals(boardingTimeString);
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
		result.append(" (boardingTime: ");
		result.append(boardingTime);
		result.append(", passengers: ");
		result.append(passengers);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", boardingTimeString: ");
		result.append(boardingTimeString);
		result.append(')');
		return result.toString();
	}

} //SimulationResultImpl
