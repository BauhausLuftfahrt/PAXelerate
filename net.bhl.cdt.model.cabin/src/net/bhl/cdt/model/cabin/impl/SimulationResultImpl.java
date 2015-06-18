/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Date;
import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.SimulationResult;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getTestObject <em>Test Object</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.SimulationResultImpl#getTestObject2 <em>Test Object2</em>}</li>
 * </ul>
 * </p>
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
	 * The cached value of the '{@link #getTestObject() <em>Test Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestObject()
	 * @generated
	 * @ordered
	 */
	protected Unit<?> testObject;

	/**
	 * The default value of the '{@link #getTestObject2() <em>Test Object2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestObject2()
	 * @generated
	 * @ordered
	 */
	protected static final Quantity TEST_OBJECT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestObject2() <em>Test Object2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestObject2()
	 * @generated
	 * @ordered
	 */
	protected Quantity testObject2 = TEST_OBJECT2_EDEFAULT;

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
	public Unit<?> getTestObject() {
		return testObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestObject(Unit<?> newTestObject) {
		Unit<?> oldTestObject = testObject;
		testObject = newTestObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__TEST_OBJECT, oldTestObject, testObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getTestObject2() {
		return testObject2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestObject2(Quantity newTestObject2) {
		Quantity oldTestObject2 = testObject2;
		testObject2 = newTestObject2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_RESULT__TEST_OBJECT2, oldTestObject2, testObject2));
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
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT:
				return getTestObject();
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT2:
				return getTestObject2();
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
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT:
				setTestObject((Unit<?>)newValue);
				return;
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT2:
				setTestObject2((Quantity)newValue);
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
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT:
				setTestObject((Unit<?>)null);
				return;
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT2:
				setTestObject2(TEST_OBJECT2_EDEFAULT);
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
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT:
				return testObject != null;
			case CabinPackage.SIMULATION_RESULT__TEST_OBJECT2:
				return TEST_OBJECT2_EDEFAULT == null ? testObject2 != null : !TEST_OBJECT2_EDEFAULT.equals(testObject2);
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
		result.append(" (BoardingTime: ");
		result.append(boardingTime);
		result.append(", Passengers: ");
		result.append(passengers);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", testObject: ");
		result.append(testObject);
		result.append(", testObject2: ");
		result.append(testObject2);
		result.append(')');
		return result.toString();
	}

} //SimulationResultImpl
