/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.SimulationResult;
import net.bhl.cdt.paxelerate.model.SortingStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isSimulateWithoutUI <em>Simulate Without UI</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isRandomSortBetweenLoops <em>Random Sort Between Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isUseFoldableSeats <em>Use Foldable Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isBringYourOwnSeat <em>Bring Your Own Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getResults <em>Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSeatInterferenceStandingUpPassengerWaitingTime <em>Seat Interference Standing Up Passenger Waiting Time</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSeatInterferenceProcessTime <em>Seat Interference Process Time</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isDeveloperMode <em>Developer Mode</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getLuggageProperties <em>Luggage Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerProperties <em>Passenger Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationPropertiesImpl extends MinimalEObjectImpl.Container implements SimulationProperties {
	/**
	 * The default value of the '{@link #isSimulateWithoutUI() <em>Simulate Without UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulateWithoutUI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMULATE_WITHOUT_UI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSimulateWithoutUI() <em>Simulate Without UI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulateWithoutUI()
	 * @generated
	 * @ordered
	 */
	protected boolean simulateWithoutUI = SIMULATE_WITHOUT_UI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSimulationLoops() <em>Number Of Simulation Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSimulationLoops()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SIMULATION_LOOPS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfSimulationLoops() <em>Number Of Simulation Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSimulationLoops()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSimulationLoops = NUMBER_OF_SIMULATION_LOOPS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRandomSortBetweenLoops() <em>Random Sort Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomSortBetweenLoops()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRandomSortBetweenLoops() <em>Random Sort Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRandomSortBetweenLoops()
	 * @generated
	 * @ordered
	 */
	protected boolean randomSortBetweenLoops = RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFoldableSeats() <em>Use Foldable Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFoldableSeats()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FOLDABLE_SEATS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFoldableSeats() <em>Use Foldable Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFoldableSeats()
	 * @generated
	 * @ordered
	 */
	protected boolean useFoldableSeats = USE_FOLDABLE_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBringYourOwnSeat() <em>Bring Your Own Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBringYourOwnSeat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BRING_YOUR_OWN_SEAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBringYourOwnSeat() <em>Bring Your Own Seat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBringYourOwnSeat()
	 * @generated
	 * @ordered
	 */
	protected boolean bringYourOwnSeat = BRING_YOUR_OWN_SEAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulationResult> results;

	/**
	 * The default value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected static final SortingStyle SORTING_EDEFAULT = SortingStyle.RANDOM;

	/**
	 * The cached value of the '{@link #getSorting() <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorting()
	 * @generated
	 * @ordered
	 */
	protected SortingStyle sorting = SORTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMULATION_SPEED_FACTOR_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected int simulationSpeedFactor = SIMULATION_SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatInterferenceStandingUpPassengerWaitingTime() <em>Seat Interference Standing Up Passenger Waiting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceStandingUpPassengerWaitingTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getSeatInterferenceStandingUpPassengerWaitingTime() <em>Seat Interference Standing Up Passenger Waiting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceStandingUpPassengerWaitingTime()
	 * @generated
	 * @ordered
	 */
	protected int seatInterferenceStandingUpPassengerWaitingTime = SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatInterferenceProcessTime() <em>Seat Interference Process Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SEAT_INTERFERENCE_PROCESS_TIME_EDEFAULT = 7;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTime() <em>Seat Interference Process Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTime()
	 * @generated
	 * @ordered
	 */
	protected int seatInterferenceProcessTime = SEAT_INTERFERENCE_PROCESS_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadSleepTimeDefault() <em>Thread Sleep Time Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSleepTimeDefault()
	 * @generated
	 * @ordered
	 */
	protected static final int THREAD_SLEEP_TIME_DEFAULT_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getThreadSleepTimeDefault() <em>Thread Sleep Time Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadSleepTimeDefault()
	 * @generated
	 * @ordered
	 */
	protected int threadSleepTimeDefault = THREAD_SLEEP_TIME_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeveloperMode() <em>Developer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeveloperMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPER_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeveloperMode() <em>Developer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeveloperMode()
	 * @generated
	 * @ordered
	 */
	protected boolean developerMode = DEVELOPER_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLuggageProperties() <em>Luggage Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageProperties()
	 * @generated
	 * @ordered
	 */
	protected LuggageProperties luggageProperties;

	/**
	 * The cached value of the '{@link #getPassengerProperties() <em>Passenger Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerProperties()
	 * @generated
	 * @ordered
	 */
	protected PassengerProperties passengerProperties;

	/**
	 * The default value of the '{@link #getPassengersBoardingPerMinute() <em>Passengers Boarding Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengersBoardingPerMinute()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT = 18.0;

	/**
	 * The cached value of the '{@link #getPassengersBoardingPerMinute() <em>Passengers Boarding Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengersBoardingPerMinute()
	 * @generated
	 * @ordered
	 */
	protected double passengersBoardingPerMinute = PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.SIMULATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimulateWithoutUI() {
		return simulateWithoutUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulateWithoutUI(boolean newSimulateWithoutUI) {
		boolean oldSimulateWithoutUI = simulateWithoutUI;
		simulateWithoutUI = newSimulateWithoutUI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI, oldSimulateWithoutUI, simulateWithoutUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSimulationLoops() {
		return numberOfSimulationLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSimulationLoops(int newNumberOfSimulationLoops) {
		int oldNumberOfSimulationLoops = numberOfSimulationLoops;
		numberOfSimulationLoops = newNumberOfSimulationLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS, oldNumberOfSimulationLoops, numberOfSimulationLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRandomSortBetweenLoops() {
		return randomSortBetweenLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSortBetweenLoops(boolean newRandomSortBetweenLoops) {
		boolean oldRandomSortBetweenLoops = randomSortBetweenLoops;
		randomSortBetweenLoops = newRandomSortBetweenLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS, oldRandomSortBetweenLoops, randomSortBetweenLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFoldableSeats() {
		return useFoldableSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFoldableSeats(boolean newUseFoldableSeats) {
		boolean oldUseFoldableSeats = useFoldableSeats;
		useFoldableSeats = newUseFoldableSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS, oldUseFoldableSeats, useFoldableSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBringYourOwnSeat() {
		return bringYourOwnSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBringYourOwnSeat(boolean newBringYourOwnSeat) {
		boolean oldBringYourOwnSeat = bringYourOwnSeat;
		bringYourOwnSeat = newBringYourOwnSeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT, oldBringYourOwnSeat, bringYourOwnSeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulationResult> getResults() {
		if (results == null) {
			results = new EObjectResolvingEList<SimulationResult>(SimulationResult.class, this, CabinPackage.SIMULATION_PROPERTIES__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingStyle getSorting() {
		return sorting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorting(SortingStyle newSorting) {
		SortingStyle oldSorting = sorting;
		sorting = newSorting == null ? SORTING_EDEFAULT : newSorting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SORTING, oldSorting, sorting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSimulationSpeedFactor() {
		return simulationSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationSpeedFactor(int newSimulationSpeedFactor) {
		int oldSimulationSpeedFactor = simulationSpeedFactor;
		simulationSpeedFactor = newSimulationSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR, oldSimulationSpeedFactor, simulationSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatInterferenceStandingUpPassengerWaitingTime() {
		return seatInterferenceStandingUpPassengerWaitingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceStandingUpPassengerWaitingTime(int newSeatInterferenceStandingUpPassengerWaitingTime) {
		int oldSeatInterferenceStandingUpPassengerWaitingTime = seatInterferenceStandingUpPassengerWaitingTime;
		seatInterferenceStandingUpPassengerWaitingTime = newSeatInterferenceStandingUpPassengerWaitingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME, oldSeatInterferenceStandingUpPassengerWaitingTime, seatInterferenceStandingUpPassengerWaitingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatInterferenceProcessTime() {
		return seatInterferenceProcessTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceProcessTime(int newSeatInterferenceProcessTime) {
		int oldSeatInterferenceProcessTime = seatInterferenceProcessTime;
		seatInterferenceProcessTime = newSeatInterferenceProcessTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME, oldSeatInterferenceProcessTime, seatInterferenceProcessTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreadSleepTimeDefault() {
		return threadSleepTimeDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadSleepTimeDefault(int newThreadSleepTimeDefault) {
		int oldThreadSleepTimeDefault = threadSleepTimeDefault;
		threadSleepTimeDefault = newThreadSleepTimeDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT, oldThreadSleepTimeDefault, threadSleepTimeDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeveloperMode() {
		return developerMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeveloperMode(boolean newDeveloperMode) {
		boolean oldDeveloperMode = developerMode;
		developerMode = newDeveloperMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE, oldDeveloperMode, developerMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageProperties getLuggageProperties() {
		return luggageProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLuggageProperties(LuggageProperties newLuggageProperties, NotificationChain msgs) {
		LuggageProperties oldLuggageProperties = luggageProperties;
		luggageProperties = newLuggageProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES, oldLuggageProperties, newLuggageProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuggageProperties(LuggageProperties newLuggageProperties) {
		if (newLuggageProperties != luggageProperties) {
			NotificationChain msgs = null;
			if (luggageProperties != null)
				msgs = ((InternalEObject)luggageProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES, null, msgs);
			if (newLuggageProperties != null)
				msgs = ((InternalEObject)newLuggageProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES, null, msgs);
			msgs = basicSetLuggageProperties(newLuggageProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES, newLuggageProperties, newLuggageProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerProperties getPassengerProperties() {
		return passengerProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassengerProperties(PassengerProperties newPassengerProperties, NotificationChain msgs) {
		PassengerProperties oldPassengerProperties = passengerProperties;
		passengerProperties = newPassengerProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES, oldPassengerProperties, newPassengerProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerProperties(PassengerProperties newPassengerProperties) {
		if (newPassengerProperties != passengerProperties) {
			NotificationChain msgs = null;
			if (passengerProperties != null)
				msgs = ((InternalEObject)passengerProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES, null, msgs);
			if (newPassengerProperties != null)
				msgs = ((InternalEObject)newPassengerProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES, null, msgs);
			msgs = basicSetPassengerProperties(newPassengerProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES, newPassengerProperties, newPassengerProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengersBoardingPerMinute() {
		return passengersBoardingPerMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengersBoardingPerMinute(double newPassengersBoardingPerMinute) {
		double oldPassengersBoardingPerMinute = passengersBoardingPerMinute;
		passengersBoardingPerMinute = newPassengersBoardingPerMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE, oldPassengersBoardingPerMinute, passengersBoardingPerMinute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				return basicSetLuggageProperties(null, msgs);
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				return basicSetPassengerProperties(null, msgs);
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
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				return isSimulateWithoutUI();
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				return getNumberOfSimulationLoops();
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				return isRandomSortBetweenLoops();
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				return isUseFoldableSeats();
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				return isBringYourOwnSeat();
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				return getResults();
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				return getSorting();
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				return getSimulationSpeedFactor();
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME:
				return getSeatInterferenceStandingUpPassengerWaitingTime();
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME:
				return getSeatInterferenceProcessTime();
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				return getThreadSleepTimeDefault();
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				return isDeveloperMode();
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				return getLuggageProperties();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				return getPassengerProperties();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				return getPassengersBoardingPerMinute();
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
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				setSimulateWithoutUI((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				setNumberOfSimulationLoops((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				setRandomSortBetweenLoops((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				setUseFoldableSeats((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				setBringYourOwnSeat((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends SimulationResult>)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				setSorting((SortingStyle)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				setSimulationSpeedFactor((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME:
				setSeatInterferenceStandingUpPassengerWaitingTime((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME:
				setSeatInterferenceProcessTime((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				setThreadSleepTimeDefault((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				setDeveloperMode((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				setLuggageProperties((LuggageProperties)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				setPassengerProperties((PassengerProperties)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				setPassengersBoardingPerMinute((Double)newValue);
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
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				setSimulateWithoutUI(SIMULATE_WITHOUT_UI_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				setNumberOfSimulationLoops(NUMBER_OF_SIMULATION_LOOPS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				setRandomSortBetweenLoops(RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				setUseFoldableSeats(USE_FOLDABLE_SEATS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				setBringYourOwnSeat(BRING_YOUR_OWN_SEAT_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				getResults().clear();
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				setSorting(SORTING_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				setSimulationSpeedFactor(SIMULATION_SPEED_FACTOR_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME:
				setSeatInterferenceStandingUpPassengerWaitingTime(SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME:
				setSeatInterferenceProcessTime(SEAT_INTERFERENCE_PROCESS_TIME_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				setThreadSleepTimeDefault(THREAD_SLEEP_TIME_DEFAULT_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				setDeveloperMode(DEVELOPER_MODE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				setLuggageProperties((LuggageProperties)null);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				setPassengerProperties((PassengerProperties)null);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				setPassengersBoardingPerMinute(PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT);
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
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				return simulateWithoutUI != SIMULATE_WITHOUT_UI_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				return numberOfSimulationLoops != NUMBER_OF_SIMULATION_LOOPS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
				return randomSortBetweenLoops != RANDOM_SORT_BETWEEN_LOOPS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
				return useFoldableSeats != USE_FOLDABLE_SEATS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
				return bringYourOwnSeat != BRING_YOUR_OWN_SEAT_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				return results != null && !results.isEmpty();
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				return sorting != SORTING_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				return simulationSpeedFactor != SIMULATION_SPEED_FACTOR_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME:
				return seatInterferenceStandingUpPassengerWaitingTime != SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME:
				return seatInterferenceProcessTime != SEAT_INTERFERENCE_PROCESS_TIME_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				return threadSleepTimeDefault != THREAD_SLEEP_TIME_DEFAULT_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				return developerMode != DEVELOPER_MODE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				return luggageProperties != null;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				return passengerProperties != null;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				return passengersBoardingPerMinute != PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT;
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
		result.append(" (simulateWithoutUI: ");
		result.append(simulateWithoutUI);
		result.append(", numberOfSimulationLoops: ");
		result.append(numberOfSimulationLoops);
		result.append(", randomSortBetweenLoops: ");
		result.append(randomSortBetweenLoops);
		result.append(", useFoldableSeats: ");
		result.append(useFoldableSeats);
		result.append(", bringYourOwnSeat: ");
		result.append(bringYourOwnSeat);
		result.append(", sorting: ");
		result.append(sorting);
		result.append(", simulationSpeedFactor: ");
		result.append(simulationSpeedFactor);
		result.append(", seatInterferenceStandingUpPassengerWaitingTime: ");
		result.append(seatInterferenceStandingUpPassengerWaitingTime);
		result.append(", seatInterferenceProcessTime: ");
		result.append(seatInterferenceProcessTime);
		result.append(", threadSleepTimeDefault: ");
		result.append(threadSleepTimeDefault);
		result.append(", developerMode: ");
		result.append(developerMode);
		result.append(", passengersBoardingPerMinute: ");
		result.append(passengersBoardingPerMinute);
		result.append(')');
		return result.toString();
	}

} //SimulationPropertiesImpl
