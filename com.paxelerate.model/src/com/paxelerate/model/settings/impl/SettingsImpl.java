/**
 */
package com.paxelerate.model.settings.impl;

import com.paxelerate.model.enums.SeatType;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.SortingScheme;

import com.paxelerate.model.settings.LuggageProperties;
import com.paxelerate.model.settings.PassengerProperties;
import com.paxelerate.model.settings.Settings;
import com.paxelerate.model.settings.SettingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getLuggageProperties <em>Luggage Properties</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getPassengerProperties <em>Passenger Properties</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getSimulationType <em>Simulation Type</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#isDisplaySimulation <em>Display Simulation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#isUseCenterLuggageStorage <em>Use Center Luggage Storage</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getSimulationGridResolution <em>Simulation Grid Resolution</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getBoardingConformanceRate <em>Boarding Conformance Rate</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.SettingsImpl#getNumberOfBoardingBlocks <em>Number Of Boarding Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingsImpl extends MinimalEObjectImpl.Container implements Settings {
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
	 * The default value of the '{@link #getSimulationType() <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationType()
	 * @generated
	 * @ordered
	 */
	protected static final SimulationType SIMULATION_TYPE_EDEFAULT = SimulationType.BOARDING;

	/**
	 * The cached value of the '{@link #getSimulationType() <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationType()
	 * @generated
	 * @ordered
	 */
	protected SimulationType simulationType = SIMULATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplaySimulation() <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplaySimulation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_SIMULATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDisplaySimulation() <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplaySimulation()
	 * @generated
	 * @ordered
	 */
	protected boolean displaySimulation = DISPLAY_SIMULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseCenterLuggageStorage() <em>Use Center Luggage Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCenterLuggageStorage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CENTER_LUGGAGE_STORAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseCenterLuggageStorage() <em>Use Center Luggage Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCenterLuggageStorage()
	 * @generated
	 * @ordered
	 */
	protected boolean useCenterLuggageStorage = USE_CENTER_LUGGAGE_STORAGE_EDEFAULT;

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
	 * The default value of the '{@link #getSimulationGridResolution() <em>Simulation Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationGridResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double SIMULATION_GRID_RESOLUTION_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getSimulationGridResolution() <em>Simulation Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationGridResolution()
	 * @generated
	 * @ordered
	 */
	protected double simulationGridResolution = SIMULATION_GRID_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMULATION_SPEED_FACTOR_EDEFAULT = 5;

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
	 * The default value of the '{@link #getPassengerSortingScheme() <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSortingScheme()
	 * @generated
	 * @ordered
	 */
	protected static final SortingScheme PASSENGER_SORTING_SCHEME_EDEFAULT = SortingScheme.RANDOM;

	/**
	 * The cached value of the '{@link #getPassengerSortingScheme() <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSortingScheme()
	 * @generated
	 * @ordered
	 */
	protected SortingScheme passengerSortingScheme = PASSENGER_SORTING_SCHEME_EDEFAULT;

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
	 * The default value of the '{@link #getSidewaysFoldabeSeatPopupTimeMean() <em>Sideways Foldabe Seat Popup Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewaysFoldabeSeatPopupTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getSidewaysFoldabeSeatPopupTimeMean() <em>Sideways Foldabe Seat Popup Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewaysFoldabeSeatPopupTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double sidewaysFoldabeSeatPopupTimeMean = SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSidewaysFoldabeSeatPopupTimeDeviation() <em>Sideways Foldabe Seat Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewaysFoldabeSeatPopupTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSidewaysFoldabeSeatPopupTimeDeviation() <em>Sideways Foldabe Seat Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewaysFoldabeSeatPopupTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double sidewaysFoldabeSeatPopupTimeDeviation = SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiftingSeatPanPopupTimeMean() <em>Lifting Seat Pan Popup Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftingSeatPanPopupTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double LIFTING_SEAT_PAN_POPUP_TIME_MEAN_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getLiftingSeatPanPopupTimeMean() <em>Lifting Seat Pan Popup Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftingSeatPanPopupTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double liftingSeatPanPopupTimeMean = LIFTING_SEAT_PAN_POPUP_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLiftingSeatPanPopupTimeDeviation() <em>Lifting Seat Pan Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftingSeatPanPopupTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getLiftingSeatPanPopupTimeDeviation() <em>Lifting Seat Pan Popup Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiftingSeatPanPopupTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double liftingSeatPanPopupTimeDeviation = LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardingConformanceRate() <em>Boarding Conformance Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingConformanceRate()
	 * @generated
	 * @ordered
	 */
	protected static final double BOARDING_CONFORMANCE_RATE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getBoardingConformanceRate() <em>Boarding Conformance Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingConformanceRate()
	 * @generated
	 * @ordered
	 */
	protected double boardingConformanceRate = BOARDING_CONFORMANCE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBoardingBlocks() <em>Number Of Boarding Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBoardingBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BOARDING_BLOCKS_EDEFAULT = 4;

	/**
	 * The cached value of the '{@link #getNumberOfBoardingBlocks() <em>Number Of Boarding Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBoardingBlocks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBoardingBlocks = NUMBER_OF_BOARDING_BLOCKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.SETTINGS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES, oldLuggageProperties, newLuggageProperties);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) luggageProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES, null, msgs);
			if (newLuggageProperties != null)
				msgs = ((InternalEObject) newLuggageProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES, null, msgs);
			msgs = basicSetLuggageProperties(newLuggageProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES,
					newLuggageProperties, newLuggageProperties));
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
	public NotificationChain basicSetPassengerProperties(PassengerProperties newPassengerProperties,
			NotificationChain msgs) {
		PassengerProperties oldPassengerProperties = passengerProperties;
		passengerProperties = newPassengerProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SettingsPackage.SETTINGS__PASSENGER_PROPERTIES, oldPassengerProperties, newPassengerProperties);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) passengerProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SettingsPackage.SETTINGS__PASSENGER_PROPERTIES, null, msgs);
			if (newPassengerProperties != null)
				msgs = ((InternalEObject) newPassengerProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SettingsPackage.SETTINGS__PASSENGER_PROPERTIES, null, msgs);
			msgs = basicSetPassengerProperties(newPassengerProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__PASSENGER_PROPERTIES,
					newPassengerProperties, newPassengerProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationType getSimulationType() {
		return simulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationType(SimulationType newSimulationType) {
		SimulationType oldSimulationType = simulationType;
		simulationType = newSimulationType == null ? SIMULATION_TYPE_EDEFAULT : newSimulationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__SIMULATION_TYPE,
					oldSimulationType, simulationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplaySimulation() {
		return displaySimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplaySimulation(boolean newDisplaySimulation) {
		boolean oldDisplaySimulation = displaySimulation;
		displaySimulation = newDisplaySimulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__DISPLAY_SIMULATION,
					oldDisplaySimulation, displaySimulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCenterLuggageStorage() {
		return useCenterLuggageStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCenterLuggageStorage(boolean newUseCenterLuggageStorage) {
		boolean oldUseCenterLuggageStorage = useCenterLuggageStorage;
		useCenterLuggageStorage = newUseCenterLuggageStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__USE_CENTER_LUGGAGE_STORAGE,
					oldUseCenterLuggageStorage, useCenterLuggageStorage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__SEAT_TYPE, oldSeatType,
					seatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSimulationGridResolution() {
		return simulationGridResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationGridResolution(double newSimulationGridResolution) {
		double oldSimulationGridResolution = simulationGridResolution;
		simulationGridResolution = newSimulationGridResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__SIMULATION_GRID_RESOLUTION,
					oldSimulationGridResolution, simulationGridResolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__SIMULATION_SPEED_FACTOR,
					oldSimulationSpeedFactor, simulationSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingScheme getPassengerSortingScheme() {
		return passengerSortingScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerSortingScheme(SortingScheme newPassengerSortingScheme) {
		SortingScheme oldPassengerSortingScheme = passengerSortingScheme;
		passengerSortingScheme = newPassengerSortingScheme == null ? PASSENGER_SORTING_SCHEME_EDEFAULT
				: newPassengerSortingScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__PASSENGER_SORTING_SCHEME,
					oldPassengerSortingScheme, passengerSortingScheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__THREAD_SLEEP_TIME_DEFAULT,
					oldThreadSleepTimeDefault, threadSleepTimeDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSidewaysFoldabeSeatPopupTimeMean() {
		return sidewaysFoldabeSeatPopupTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSidewaysFoldabeSeatPopupTimeMean(double newSidewaysFoldabeSeatPopupTimeMean) {
		double oldSidewaysFoldabeSeatPopupTimeMean = sidewaysFoldabeSeatPopupTimeMean;
		sidewaysFoldabeSeatPopupTimeMean = newSidewaysFoldabeSeatPopupTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN,
					oldSidewaysFoldabeSeatPopupTimeMean, sidewaysFoldabeSeatPopupTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSidewaysFoldabeSeatPopupTimeDeviation() {
		return sidewaysFoldabeSeatPopupTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSidewaysFoldabeSeatPopupTimeDeviation(double newSidewaysFoldabeSeatPopupTimeDeviation) {
		double oldSidewaysFoldabeSeatPopupTimeDeviation = sidewaysFoldabeSeatPopupTimeDeviation;
		sidewaysFoldabeSeatPopupTimeDeviation = newSidewaysFoldabeSeatPopupTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION,
					oldSidewaysFoldabeSeatPopupTimeDeviation, sidewaysFoldabeSeatPopupTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLiftingSeatPanPopupTimeMean() {
		return liftingSeatPanPopupTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiftingSeatPanPopupTimeMean(double newLiftingSeatPanPopupTimeMean) {
		double oldLiftingSeatPanPopupTimeMean = liftingSeatPanPopupTimeMean;
		liftingSeatPanPopupTimeMean = newLiftingSeatPanPopupTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN, oldLiftingSeatPanPopupTimeMean,
					liftingSeatPanPopupTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLiftingSeatPanPopupTimeDeviation() {
		return liftingSeatPanPopupTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiftingSeatPanPopupTimeDeviation(double newLiftingSeatPanPopupTimeDeviation) {
		double oldLiftingSeatPanPopupTimeDeviation = liftingSeatPanPopupTimeDeviation;
		liftingSeatPanPopupTimeDeviation = newLiftingSeatPanPopupTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION,
					oldLiftingSeatPanPopupTimeDeviation, liftingSeatPanPopupTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoardingConformanceRate() {
		return boardingConformanceRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingConformanceRate(double newBoardingConformanceRate) {
		double oldBoardingConformanceRate = boardingConformanceRate;
		boardingConformanceRate = newBoardingConformanceRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__BOARDING_CONFORMANCE_RATE,
					oldBoardingConformanceRate, boardingConformanceRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBoardingBlocks() {
		return numberOfBoardingBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBoardingBlocks(int newNumberOfBoardingBlocks) {
		int oldNumberOfBoardingBlocks = numberOfBoardingBlocks;
		numberOfBoardingBlocks = newNumberOfBoardingBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.SETTINGS__NUMBER_OF_BOARDING_BLOCKS,
					oldNumberOfBoardingBlocks, numberOfBoardingBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES:
			return basicSetLuggageProperties(null, msgs);
		case SettingsPackage.SETTINGS__PASSENGER_PROPERTIES:
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
		case SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES:
			return getLuggageProperties();
		case SettingsPackage.SETTINGS__PASSENGER_PROPERTIES:
			return getPassengerProperties();
		case SettingsPackage.SETTINGS__SIMULATION_TYPE:
			return getSimulationType();
		case SettingsPackage.SETTINGS__DISPLAY_SIMULATION:
			return isDisplaySimulation();
		case SettingsPackage.SETTINGS__USE_CENTER_LUGGAGE_STORAGE:
			return isUseCenterLuggageStorage();
		case SettingsPackage.SETTINGS__SEAT_TYPE:
			return getSeatType();
		case SettingsPackage.SETTINGS__SIMULATION_GRID_RESOLUTION:
			return getSimulationGridResolution();
		case SettingsPackage.SETTINGS__SIMULATION_SPEED_FACTOR:
			return getSimulationSpeedFactor();
		case SettingsPackage.SETTINGS__PASSENGER_SORTING_SCHEME:
			return getPassengerSortingScheme();
		case SettingsPackage.SETTINGS__THREAD_SLEEP_TIME_DEFAULT:
			return getThreadSleepTimeDefault();
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
			return getSidewaysFoldabeSeatPopupTimeMean();
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
			return getSidewaysFoldabeSeatPopupTimeDeviation();
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
			return getLiftingSeatPanPopupTimeMean();
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
			return getLiftingSeatPanPopupTimeDeviation();
		case SettingsPackage.SETTINGS__BOARDING_CONFORMANCE_RATE:
			return getBoardingConformanceRate();
		case SettingsPackage.SETTINGS__NUMBER_OF_BOARDING_BLOCKS:
			return getNumberOfBoardingBlocks();
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
		case SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES:
			setLuggageProperties((LuggageProperties) newValue);
			return;
		case SettingsPackage.SETTINGS__PASSENGER_PROPERTIES:
			setPassengerProperties((PassengerProperties) newValue);
			return;
		case SettingsPackage.SETTINGS__SIMULATION_TYPE:
			setSimulationType((SimulationType) newValue);
			return;
		case SettingsPackage.SETTINGS__DISPLAY_SIMULATION:
			setDisplaySimulation((Boolean) newValue);
			return;
		case SettingsPackage.SETTINGS__USE_CENTER_LUGGAGE_STORAGE:
			setUseCenterLuggageStorage((Boolean) newValue);
			return;
		case SettingsPackage.SETTINGS__SEAT_TYPE:
			setSeatType((SeatType) newValue);
			return;
		case SettingsPackage.SETTINGS__SIMULATION_GRID_RESOLUTION:
			setSimulationGridResolution((Double) newValue);
			return;
		case SettingsPackage.SETTINGS__SIMULATION_SPEED_FACTOR:
			setSimulationSpeedFactor((Integer) newValue);
			return;
		case SettingsPackage.SETTINGS__PASSENGER_SORTING_SCHEME:
			setPassengerSortingScheme((SortingScheme) newValue);
			return;
		case SettingsPackage.SETTINGS__THREAD_SLEEP_TIME_DEFAULT:
			setThreadSleepTimeDefault((Integer) newValue);
			return;
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
			setSidewaysFoldabeSeatPopupTimeMean((Double) newValue);
			return;
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
			setSidewaysFoldabeSeatPopupTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
			setLiftingSeatPanPopupTimeMean((Double) newValue);
			return;
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
			setLiftingSeatPanPopupTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.SETTINGS__BOARDING_CONFORMANCE_RATE:
			setBoardingConformanceRate((Double) newValue);
			return;
		case SettingsPackage.SETTINGS__NUMBER_OF_BOARDING_BLOCKS:
			setNumberOfBoardingBlocks((Integer) newValue);
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
		case SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES:
			setLuggageProperties((LuggageProperties) null);
			return;
		case SettingsPackage.SETTINGS__PASSENGER_PROPERTIES:
			setPassengerProperties((PassengerProperties) null);
			return;
		case SettingsPackage.SETTINGS__SIMULATION_TYPE:
			setSimulationType(SIMULATION_TYPE_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__DISPLAY_SIMULATION:
			setDisplaySimulation(DISPLAY_SIMULATION_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__USE_CENTER_LUGGAGE_STORAGE:
			setUseCenterLuggageStorage(USE_CENTER_LUGGAGE_STORAGE_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__SEAT_TYPE:
			setSeatType(SEAT_TYPE_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__SIMULATION_GRID_RESOLUTION:
			setSimulationGridResolution(SIMULATION_GRID_RESOLUTION_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__SIMULATION_SPEED_FACTOR:
			setSimulationSpeedFactor(SIMULATION_SPEED_FACTOR_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__PASSENGER_SORTING_SCHEME:
			setPassengerSortingScheme(PASSENGER_SORTING_SCHEME_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__THREAD_SLEEP_TIME_DEFAULT:
			setThreadSleepTimeDefault(THREAD_SLEEP_TIME_DEFAULT_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
			setSidewaysFoldabeSeatPopupTimeMean(SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
			setSidewaysFoldabeSeatPopupTimeDeviation(SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
			setLiftingSeatPanPopupTimeMean(LIFTING_SEAT_PAN_POPUP_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
			setLiftingSeatPanPopupTimeDeviation(LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__BOARDING_CONFORMANCE_RATE:
			setBoardingConformanceRate(BOARDING_CONFORMANCE_RATE_EDEFAULT);
			return;
		case SettingsPackage.SETTINGS__NUMBER_OF_BOARDING_BLOCKS:
			setNumberOfBoardingBlocks(NUMBER_OF_BOARDING_BLOCKS_EDEFAULT);
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
		case SettingsPackage.SETTINGS__LUGGAGE_PROPERTIES:
			return luggageProperties != null;
		case SettingsPackage.SETTINGS__PASSENGER_PROPERTIES:
			return passengerProperties != null;
		case SettingsPackage.SETTINGS__SIMULATION_TYPE:
			return simulationType != SIMULATION_TYPE_EDEFAULT;
		case SettingsPackage.SETTINGS__DISPLAY_SIMULATION:
			return displaySimulation != DISPLAY_SIMULATION_EDEFAULT;
		case SettingsPackage.SETTINGS__USE_CENTER_LUGGAGE_STORAGE:
			return useCenterLuggageStorage != USE_CENTER_LUGGAGE_STORAGE_EDEFAULT;
		case SettingsPackage.SETTINGS__SEAT_TYPE:
			return seatType != SEAT_TYPE_EDEFAULT;
		case SettingsPackage.SETTINGS__SIMULATION_GRID_RESOLUTION:
			return simulationGridResolution != SIMULATION_GRID_RESOLUTION_EDEFAULT;
		case SettingsPackage.SETTINGS__SIMULATION_SPEED_FACTOR:
			return simulationSpeedFactor != SIMULATION_SPEED_FACTOR_EDEFAULT;
		case SettingsPackage.SETTINGS__PASSENGER_SORTING_SCHEME:
			return passengerSortingScheme != PASSENGER_SORTING_SCHEME_EDEFAULT;
		case SettingsPackage.SETTINGS__THREAD_SLEEP_TIME_DEFAULT:
			return threadSleepTimeDefault != THREAD_SLEEP_TIME_DEFAULT_EDEFAULT;
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
			return sidewaysFoldabeSeatPopupTimeMean != SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN_EDEFAULT;
		case SettingsPackage.SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
			return sidewaysFoldabeSeatPopupTimeDeviation != SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
			return liftingSeatPanPopupTimeMean != LIFTING_SEAT_PAN_POPUP_TIME_MEAN_EDEFAULT;
		case SettingsPackage.SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
			return liftingSeatPanPopupTimeDeviation != LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.SETTINGS__BOARDING_CONFORMANCE_RATE:
			return boardingConformanceRate != BOARDING_CONFORMANCE_RATE_EDEFAULT;
		case SettingsPackage.SETTINGS__NUMBER_OF_BOARDING_BLOCKS:
			return numberOfBoardingBlocks != NUMBER_OF_BOARDING_BLOCKS_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (simulationType: ");
		result.append(simulationType);
		result.append(", displaySimulation: ");
		result.append(displaySimulation);
		result.append(", useCenterLuggageStorage: ");
		result.append(useCenterLuggageStorage);
		result.append(", seatType: ");
		result.append(seatType);
		result.append(", simulationGridResolution: ");
		result.append(simulationGridResolution);
		result.append(", simulationSpeedFactor: ");
		result.append(simulationSpeedFactor);
		result.append(", passengerSortingScheme: ");
		result.append(passengerSortingScheme);
		result.append(", threadSleepTimeDefault: ");
		result.append(threadSleepTimeDefault);
		result.append(", sidewaysFoldabeSeatPopupTimeMean: ");
		result.append(sidewaysFoldabeSeatPopupTimeMean);
		result.append(", sidewaysFoldabeSeatPopupTimeDeviation: ");
		result.append(sidewaysFoldabeSeatPopupTimeDeviation);
		result.append(", liftingSeatPanPopupTimeMean: ");
		result.append(liftingSeatPanPopupTimeMean);
		result.append(", liftingSeatPanPopupTimeDeviation: ");
		result.append(liftingSeatPanPopupTimeDeviation);
		result.append(", boardingConformanceRate: ");
		result.append(boardingConformanceRate);
		result.append(", numberOfBoardingBlocks: ");
		result.append(numberOfBoardingBlocks);
		result.append(')');
		return result.toString();
	}

} //SettingsImpl
