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
import net.bhl.cdt.paxelerate.model.LayoutConcept;
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
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getResults <em>Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getLuggageProperties <em>Luggage Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengerProperties <em>Passenger Properties</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getLayoutConcept <em>Layout Concept</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isUsePresetSettings <em>Use Preset Settings</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isSimulateWithoutUI <em>Simulate Without UI</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isDeveloperMode <em>Developer Mode</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isDataExport <em>Data Export</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isDisplayMap <em>Display Map</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#isSortPassengerBetweenLoops <em>Sort Passenger Between Loops</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationPropertiesImpl extends MinimalEObjectImpl.Container implements SimulationProperties {
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
	 * The default value of the '{@link #getLayoutConcept() <em>Layout Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutConcept()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutConcept LAYOUT_CONCEPT_EDEFAULT = LayoutConcept.DEFAULT;

	/**
	 * The cached value of the '{@link #getLayoutConcept() <em>Layout Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutConcept()
	 * @generated
	 * @ordered
	 */
	protected LayoutConcept layoutConcept = LAYOUT_CONCEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected int scale = SCALE_EDEFAULT;

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
	 * The default value of the '{@link #isUsePresetSettings() <em>Use Preset Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePresetSettings()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_PRESET_SETTINGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsePresetSettings() <em>Use Preset Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePresetSettings()
	 * @generated
	 * @ordered
	 */
	protected boolean usePresetSettings = USE_PRESET_SETTINGS_EDEFAULT;

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
	protected static final int NUMBER_OF_SIMULATION_LOOPS_EDEFAULT = 10;

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
	 * The default value of the '{@link #isDeveloperMode() <em>Developer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeveloperMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPER_MODE_EDEFAULT = true;

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
	 * The default value of the '{@link #isDataExport() <em>Data Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_EXPORT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDataExport() <em>Data Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataExport()
	 * @generated
	 * @ordered
	 */
	protected boolean dataExport = DATA_EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayMap() <em>Display Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayMap()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_MAP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplayMap() <em>Display Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayMap()
	 * @generated
	 * @ordered
	 */
	protected boolean displayMap = DISPLAY_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #isSortPassengerBetweenLoops() <em>Sort Passenger Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortPassengerBetweenLoops()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORT_PASSENGER_BETWEEN_LOOPS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSortPassengerBetweenLoops() <em>Sort Passenger Between Loops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSortPassengerBetweenLoops()
	 * @generated
	 * @ordered
	 */
	protected boolean sortPassengerBetweenLoops = SORT_PASSENGER_BETWEEN_LOOPS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected SimulationPropertiesImpl() {
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
		return CabinPackage.Literals.SIMULATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the scale
	 * @generated 
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newScale the new scale
	 * @generated 
	 */
	public void setScale(int newScale) {
		int oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return true, if is use preset settings
	 * @generated 
	 */
	public boolean isUsePresetSettings() {
		return usePresetSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newUsePresetSettings the new use preset settings
	 * @generated 
	 */
	public void setUsePresetSettings(boolean newUsePresetSettings) {
		boolean oldUsePresetSettings = usePresetSettings;
		usePresetSettings = newUsePresetSettings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS, oldUsePresetSettings, usePresetSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return true, if is simulate without ui
	 * @generated 
	 */
	public boolean isSimulateWithoutUI() {
		return simulateWithoutUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newSimulateWithoutUI the new simulate without ui
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the number of simulation loops
	 * @generated 
	 */
	public int getNumberOfSimulationLoops() {
		return numberOfSimulationLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newNumberOfSimulationLoops the new number of simulation loops
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the results
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the sorting
	 * @generated 
	 */
	public SortingStyle getSorting() {
		return sorting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newSorting the new sorting
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation speed factor
	 * @generated 
	 */
	public int getSimulationSpeedFactor() {
		return simulationSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newSimulationSpeedFactor the new simulation speed factor
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the thread sleep time default
	 * @generated 
	 */
	public int getThreadSleepTimeDefault() {
		return threadSleepTimeDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newThreadSleepTimeDefault the new thread sleep time default
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
	 * <!-- end-user-doc -->.
	 *
	 * @return true, if is developer mode
	 * @generated 
	 */
	public boolean isDeveloperMode() {
		return developerMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newDeveloperMode the new developer mode
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
	public boolean isSortPassengerBetweenLoops() {
		return sortPassengerBetweenLoops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortPassengerBetweenLoops(boolean newSortPassengerBetweenLoops) {
		boolean oldSortPassengerBetweenLoops = sortPassengerBetweenLoops;
		sortPassengerBetweenLoops = newSortPassengerBetweenLoops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS, oldSortPassengerBetweenLoops, sortPassengerBetweenLoops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties
	 * @generated 
	 */
	public LuggageProperties getLuggageProperties() {
		return luggageProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newLuggageProperties the new luggage properties
	 * @param msgs the msgs
	 * @return the notification chain
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
	 * <!-- end-user-doc -->.
	 *
	 * @param newLuggageProperties the new luggage properties
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties
	 * @generated 
	 */
	public PassengerProperties getPassengerProperties() {
		return passengerProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerProperties the new passenger properties
	 * @param msgs the msgs
	 * @return the notification chain
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
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerProperties the new passenger properties
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the passengers boarding per minute
	 * @generated 
	 */
	public double getPassengersBoardingPerMinute() {
		return passengersBoardingPerMinute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengersBoardingPerMinute the new passengers boarding per minute
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
	public boolean isDataExport() {
		return dataExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExport(boolean newDataExport) {
		boolean oldDataExport = dataExport;
		dataExport = newDataExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__DATA_EXPORT, oldDataExport, dataExport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplayMap() {
		return displayMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayMap(boolean newDisplayMap) {
		boolean oldDisplayMap = displayMap;
		displayMap = newDisplayMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__DISPLAY_MAP, oldDisplayMap, displayMap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN, oldSidewaysFoldabeSeatPopupTimeMean, sidewaysFoldabeSeatPopupTimeMean));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION, oldSidewaysFoldabeSeatPopupTimeDeviation, sidewaysFoldabeSeatPopupTimeDeviation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN, oldLiftingSeatPanPopupTimeMean, liftingSeatPanPopupTimeMean));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION, oldLiftingSeatPanPopupTimeDeviation, liftingSeatPanPopupTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutConcept getLayoutConcept() {
		return layoutConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutConcept(LayoutConcept newLayoutConcept) {
		LayoutConcept oldLayoutConcept = layoutConcept;
		layoutConcept = newLayoutConcept == null ? LAYOUT_CONCEPT_EDEFAULT : newLayoutConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.SIMULATION_PROPERTIES__LAYOUT_CONCEPT, oldLayoutConcept, layoutConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param otherEnd the other end
	 * @param featureID the feature id
	 * @param msgs the msgs
	 * @return the notification chain
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
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				return getResults();
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				return getLuggageProperties();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				return getPassengerProperties();
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				return getPassengersBoardingPerMinute();
			case CabinPackage.SIMULATION_PROPERTIES__LAYOUT_CONCEPT:
				return getLayoutConcept();
			case CabinPackage.SIMULATION_PROPERTIES__SCALE:
				return getScale();
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				return getSimulationSpeedFactor();
			case CabinPackage.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS:
				return isUsePresetSettings();
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				return isSimulateWithoutUI();
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				return getNumberOfSimulationLoops();
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				return isDeveloperMode();
			case CabinPackage.SIMULATION_PROPERTIES__DATA_EXPORT:
				return isDataExport();
			case CabinPackage.SIMULATION_PROPERTIES__DISPLAY_MAP:
				return isDisplayMap();
			case CabinPackage.SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS:
				return isSortPassengerBetweenLoops();
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				return getSorting();
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				return getThreadSleepTimeDefault();
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
				return getSidewaysFoldabeSeatPopupTimeMean();
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
				return getSidewaysFoldabeSeatPopupTimeDeviation();
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
				return getLiftingSeatPanPopupTimeMean();
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
				return getLiftingSeatPanPopupTimeDeviation();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends SimulationResult>)newValue);
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
			case CabinPackage.SIMULATION_PROPERTIES__LAYOUT_CONCEPT:
				setLayoutConcept((LayoutConcept)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SCALE:
				setScale((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				setSimulationSpeedFactor((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS:
				setUsePresetSettings((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				setSimulateWithoutUI((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				setNumberOfSimulationLoops((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				setDeveloperMode((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DATA_EXPORT:
				setDataExport((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DISPLAY_MAP:
				setDisplayMap((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS:
				setSortPassengerBetweenLoops((Boolean)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				setSorting((SortingStyle)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				setThreadSleepTimeDefault((Integer)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
				setSidewaysFoldabeSeatPopupTimeMean((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
				setSidewaysFoldabeSeatPopupTimeDeviation((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
				setLiftingSeatPanPopupTimeMean((Double)newValue);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
				setLiftingSeatPanPopupTimeDeviation((Double)newValue);
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
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				getResults().clear();
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
			case CabinPackage.SIMULATION_PROPERTIES__LAYOUT_CONCEPT:
				setLayoutConcept(LAYOUT_CONCEPT_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				setSimulationSpeedFactor(SIMULATION_SPEED_FACTOR_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS:
				setUsePresetSettings(USE_PRESET_SETTINGS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				setSimulateWithoutUI(SIMULATE_WITHOUT_UI_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				setNumberOfSimulationLoops(NUMBER_OF_SIMULATION_LOOPS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				setDeveloperMode(DEVELOPER_MODE_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DATA_EXPORT:
				setDataExport(DATA_EXPORT_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__DISPLAY_MAP:
				setDisplayMap(DISPLAY_MAP_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS:
				setSortPassengerBetweenLoops(SORT_PASSENGER_BETWEEN_LOOPS_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				setSorting(SORTING_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				setThreadSleepTimeDefault(THREAD_SLEEP_TIME_DEFAULT_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
				setSidewaysFoldabeSeatPopupTimeMean(SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
				setSidewaysFoldabeSeatPopupTimeDeviation(SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
				setLiftingSeatPanPopupTimeMean(LIFTING_SEAT_PAN_POPUP_TIME_MEAN_EDEFAULT);
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
				setLiftingSeatPanPopupTimeDeviation(LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION_EDEFAULT);
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
			case CabinPackage.SIMULATION_PROPERTIES__RESULTS:
				return results != null && !results.isEmpty();
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
				return luggageProperties != null;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				return passengerProperties != null;
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
				return passengersBoardingPerMinute != PASSENGERS_BOARDING_PER_MINUTE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__LAYOUT_CONCEPT:
				return layoutConcept != LAYOUT_CONCEPT_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SCALE:
				return scale != SCALE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
				return simulationSpeedFactor != SIMULATION_SPEED_FACTOR_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS:
				return usePresetSettings != USE_PRESET_SETTINGS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
				return simulateWithoutUI != SIMULATE_WITHOUT_UI_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
				return numberOfSimulationLoops != NUMBER_OF_SIMULATION_LOOPS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
				return developerMode != DEVELOPER_MODE_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__DATA_EXPORT:
				return dataExport != DATA_EXPORT_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__DISPLAY_MAP:
				return displayMap != DISPLAY_MAP_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS:
				return sortPassengerBetweenLoops != SORT_PASSENGER_BETWEEN_LOOPS_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
				return sorting != SORTING_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
				return threadSleepTimeDefault != THREAD_SLEEP_TIME_DEFAULT_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN:
				return sidewaysFoldabeSeatPopupTimeMean != SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION:
				return sidewaysFoldabeSeatPopupTimeDeviation != SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN:
				return liftingSeatPanPopupTimeMean != LIFTING_SEAT_PAN_POPUP_TIME_MEAN_EDEFAULT;
			case CabinPackage.SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION:
				return liftingSeatPanPopupTimeDeviation != LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION_EDEFAULT;
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
		result.append(" (passengersBoardingPerMinute: ");
		result.append(passengersBoardingPerMinute);
		result.append(", layoutConcept: ");
		result.append(layoutConcept);
		result.append(", scale: ");
		result.append(scale);
		result.append(", simulationSpeedFactor: ");
		result.append(simulationSpeedFactor);
		result.append(", usePresetSettings: ");
		result.append(usePresetSettings);
		result.append(", simulateWithoutUI: ");
		result.append(simulateWithoutUI);
		result.append(", numberOfSimulationLoops: ");
		result.append(numberOfSimulationLoops);
		result.append(", developerMode: ");
		result.append(developerMode);
		result.append(", dataExport: ");
		result.append(dataExport);
		result.append(", displayMap: ");
		result.append(displayMap);
		result.append(", sortPassengerBetweenLoops: ");
		result.append(sortPassengerBetweenLoops);
		result.append(", sorting: ");
		result.append(sorting);
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
		result.append(')');
		return result.toString();
	}

} //SimulationPropertiesImpl
