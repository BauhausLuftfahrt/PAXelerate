/**
 */
package paxelerate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paxelerate.DoorSelectionType;
import paxelerate.PassengerSortingSchemeType;
import paxelerate.PaxeleratePackage;
import paxelerate.SeatTypeType;
import paxelerate.SimulationTypeType;
import paxelerate.StudyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getActiveDoorUIDs <em>Active Door UI Ds</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getSimulationType <em>Simulation Type</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getSimulationGridResolution <em>Simulation Grid Resolution</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getDoorSelection <em>Door Selection</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}</li>
 *   <li>{@link paxelerate.impl.StudyTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyTypeImpl extends MinimalEObjectImpl.Container implements StudyType {
	/**
	 * The default value of the '{@link #getLoadFactor() <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double LOAD_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLoadFactor() <em>Load Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected double loadFactor = LOAD_FACTOR_EDEFAULT;

	/**
	 * This is true if the Load Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loadFactorESet;

	/**
	 * The default value of the '{@link #getActiveDoorUIDs() <em>Active Door UI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveDoorUIDs()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_DOOR_UI_DS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveDoorUIDs() <em>Active Door UI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveDoorUIDs()
	 * @generated
	 * @ordered
	 */
	protected String activeDoorUIDs = ACTIVE_DOOR_UI_DS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * This is true if the Iterations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iterationsESet;

	/**
	 * The default value of the '{@link #getSimulationType() <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationType()
	 * @generated
	 * @ordered
	 */
	protected static final SimulationTypeType SIMULATION_TYPE_EDEFAULT = SimulationTypeType.BOARDING;

	/**
	 * The cached value of the '{@link #getSimulationType() <em>Simulation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationType()
	 * @generated
	 * @ordered
	 */
	protected SimulationTypeType simulationType = SIMULATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Simulation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simulationTypeESet;

	/**
	 * The default value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected static final SeatTypeType SEAT_TYPE_EDEFAULT = SeatTypeType.DEFAULT;

	/**
	 * The cached value of the '{@link #getSeatType() <em>Seat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected SeatTypeType seatType = SEAT_TYPE_EDEFAULT;

	/**
	 * This is true if the Seat Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seatTypeESet;

	/**
	 * The default value of the '{@link #getSimulationGridResolution() <em>Simulation Grid Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationGridResolution()
	 * @generated
	 * @ordered
	 */
	protected static final double SIMULATION_GRID_RESOLUTION_EDEFAULT = 0.0;

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
	 * This is true if the Simulation Grid Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simulationGridResolutionESet;

	/**
	 * The default value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SIMULATION_SPEED_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double simulationSpeedFactor = SIMULATION_SPEED_FACTOR_EDEFAULT;

	/**
	 * This is true if the Simulation Speed Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simulationSpeedFactorESet;

	/**
	 * The default value of the '{@link #getPassengerSortingScheme() <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSortingScheme()
	 * @generated
	 * @ordered
	 */
	protected static final PassengerSortingSchemeType PASSENGER_SORTING_SCHEME_EDEFAULT = PassengerSortingSchemeType.RANDOM;

	/**
	 * The cached value of the '{@link #getPassengerSortingScheme() <em>Passenger Sorting Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSortingScheme()
	 * @generated
	 * @ordered
	 */
	protected PassengerSortingSchemeType passengerSortingScheme = PASSENGER_SORTING_SCHEME_EDEFAULT;

	/**
	 * This is true if the Passenger Sorting Scheme attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean passengerSortingSchemeESet;

	/**
	 * The default value of the '{@link #getDoorSelection() <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSelection()
	 * @generated
	 * @ordered
	 */
	protected static final DoorSelectionType DOOR_SELECTION_EDEFAULT = DoorSelectionType.CLOSEST;

	/**
	 * The cached value of the '{@link #getDoorSelection() <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSelection()
	 * @generated
	 * @ordered
	 */
	protected DoorSelectionType doorSelection = DOOR_SELECTION_EDEFAULT;

	/**
	 * This is true if the Door Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean doorSelectionESet;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithJackets() <em>Percentage Of Passengers With Jackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithJackets()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_JACKETS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithJackets() <em>Percentage Of Passengers With Jackets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithJackets()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithJackets = PERCENTAGE_OF_PASSENGERS_WITH_JACKETS_EDEFAULT;

	/**
	 * This is true if the Percentage Of Passengers With Jackets attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentageOfPassengersWithJacketsESet;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithSmallBags() <em>Percentage Of Passengers With Small Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithSmallBags() <em>Percentage Of Passengers With Small Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithSmallBags = PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS_EDEFAULT;

	/**
	 * This is true if the Percentage Of Passengers With Small Bags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentageOfPassengersWithSmallBagsESet;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithMediumBags() <em>Percentage Of Passengers With Medium Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithMediumBags() <em>Percentage Of Passengers With Medium Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithMediumBags = PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS_EDEFAULT;

	/**
	 * This is true if the Percentage Of Passengers With Medium Bags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentageOfPassengersWithMediumBagsESet;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithLargeBags() <em>Percentage Of Passengers With Large Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithLargeBags() <em>Percentage Of Passengers With Large Bags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithLargeBags = PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS_EDEFAULT;

	/**
	 * This is true if the Percentage Of Passengers With Large Bags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean percentageOfPassengersWithLargeBagsESet;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.STUDY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLoadFactor() {
		return loadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadFactor(double newLoadFactor) {
		double oldLoadFactor = loadFactor;
		loadFactor = newLoadFactor;
		boolean oldLoadFactorESet = loadFactorESet;
		loadFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__LOAD_FACTOR,
					oldLoadFactor, loadFactor, !oldLoadFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLoadFactor() {
		double oldLoadFactor = loadFactor;
		boolean oldLoadFactorESet = loadFactorESet;
		loadFactor = LOAD_FACTOR_EDEFAULT;
		loadFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PaxeleratePackage.STUDY_TYPE__LOAD_FACTOR,
					oldLoadFactor, LOAD_FACTOR_EDEFAULT, oldLoadFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLoadFactor() {
		return loadFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiveDoorUIDs() {
		return activeDoorUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveDoorUIDs(String newActiveDoorUIDs) {
		String oldActiveDoorUIDs = activeDoorUIDs;
		activeDoorUIDs = newActiveDoorUIDs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__ACTIVE_DOOR_UI_DS,
					oldActiveDoorUIDs, activeDoorUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		boolean oldIterationsESet = iterationsESet;
		iterationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__ITERATIONS,
					oldIterations, iterations, !oldIterationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIterations() {
		int oldIterations = iterations;
		boolean oldIterationsESet = iterationsESet;
		iterations = ITERATIONS_EDEFAULT;
		iterationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PaxeleratePackage.STUDY_TYPE__ITERATIONS,
					oldIterations, ITERATIONS_EDEFAULT, oldIterationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIterations() {
		return iterationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTypeType getSimulationType() {
		return simulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationType(SimulationTypeType newSimulationType) {
		SimulationTypeType oldSimulationType = simulationType;
		simulationType = newSimulationType == null ? SIMULATION_TYPE_EDEFAULT : newSimulationType;
		boolean oldSimulationTypeESet = simulationTypeESet;
		simulationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__SIMULATION_TYPE,
					oldSimulationType, simulationType, !oldSimulationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimulationType() {
		SimulationTypeType oldSimulationType = simulationType;
		boolean oldSimulationTypeESet = simulationTypeESet;
		simulationType = SIMULATION_TYPE_EDEFAULT;
		simulationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PaxeleratePackage.STUDY_TYPE__SIMULATION_TYPE,
					oldSimulationType, SIMULATION_TYPE_EDEFAULT, oldSimulationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimulationType() {
		return simulationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatTypeType getSeatType() {
		return seatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatType(SeatTypeType newSeatType) {
		SeatTypeType oldSeatType = seatType;
		seatType = newSeatType == null ? SEAT_TYPE_EDEFAULT : newSeatType;
		boolean oldSeatTypeESet = seatTypeESet;
		seatTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__SEAT_TYPE, oldSeatType,
					seatType, !oldSeatTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeatType() {
		SeatTypeType oldSeatType = seatType;
		boolean oldSeatTypeESet = seatTypeESet;
		seatType = SEAT_TYPE_EDEFAULT;
		seatTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PaxeleratePackage.STUDY_TYPE__SEAT_TYPE,
					oldSeatType, SEAT_TYPE_EDEFAULT, oldSeatTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeatType() {
		return seatTypeESet;
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
		boolean oldSimulationGridResolutionESet = simulationGridResolutionESet;
		simulationGridResolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_TYPE__SIMULATION_GRID_RESOLUTION, oldSimulationGridResolution,
					simulationGridResolution, !oldSimulationGridResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimulationGridResolution() {
		double oldSimulationGridResolution = simulationGridResolution;
		boolean oldSimulationGridResolutionESet = simulationGridResolutionESet;
		simulationGridResolution = SIMULATION_GRID_RESOLUTION_EDEFAULT;
		simulationGridResolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__SIMULATION_GRID_RESOLUTION, oldSimulationGridResolution,
					SIMULATION_GRID_RESOLUTION_EDEFAULT, oldSimulationGridResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimulationGridResolution() {
		return simulationGridResolutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSimulationSpeedFactor() {
		return simulationSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationSpeedFactor(double newSimulationSpeedFactor) {
		double oldSimulationSpeedFactor = simulationSpeedFactor;
		simulationSpeedFactor = newSimulationSpeedFactor;
		boolean oldSimulationSpeedFactorESet = simulationSpeedFactorESet;
		simulationSpeedFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__SIMULATION_SPEED_FACTOR,
					oldSimulationSpeedFactor, simulationSpeedFactor, !oldSimulationSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimulationSpeedFactor() {
		double oldSimulationSpeedFactor = simulationSpeedFactor;
		boolean oldSimulationSpeedFactorESet = simulationSpeedFactorESet;
		simulationSpeedFactor = SIMULATION_SPEED_FACTOR_EDEFAULT;
		simulationSpeedFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__SIMULATION_SPEED_FACTOR, oldSimulationSpeedFactor,
					SIMULATION_SPEED_FACTOR_EDEFAULT, oldSimulationSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimulationSpeedFactor() {
		return simulationSpeedFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerSortingSchemeType getPassengerSortingScheme() {
		return passengerSortingScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerSortingScheme(PassengerSortingSchemeType newPassengerSortingScheme) {
		PassengerSortingSchemeType oldPassengerSortingScheme = passengerSortingScheme;
		passengerSortingScheme = newPassengerSortingScheme == null ? PASSENGER_SORTING_SCHEME_EDEFAULT
				: newPassengerSortingScheme;
		boolean oldPassengerSortingSchemeESet = passengerSortingSchemeESet;
		passengerSortingSchemeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_TYPE__PASSENGER_SORTING_SCHEME, oldPassengerSortingScheme,
					passengerSortingScheme, !oldPassengerSortingSchemeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPassengerSortingScheme() {
		PassengerSortingSchemeType oldPassengerSortingScheme = passengerSortingScheme;
		boolean oldPassengerSortingSchemeESet = passengerSortingSchemeESet;
		passengerSortingScheme = PASSENGER_SORTING_SCHEME_EDEFAULT;
		passengerSortingSchemeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__PASSENGER_SORTING_SCHEME, oldPassengerSortingScheme,
					PASSENGER_SORTING_SCHEME_EDEFAULT, oldPassengerSortingSchemeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPassengerSortingScheme() {
		return passengerSortingSchemeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorSelectionType getDoorSelection() {
		return doorSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorSelection(DoorSelectionType newDoorSelection) {
		DoorSelectionType oldDoorSelection = doorSelection;
		doorSelection = newDoorSelection == null ? DOOR_SELECTION_EDEFAULT : newDoorSelection;
		boolean oldDoorSelectionESet = doorSelectionESet;
		doorSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__DOOR_SELECTION,
					oldDoorSelection, doorSelection, !oldDoorSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDoorSelection() {
		DoorSelectionType oldDoorSelection = doorSelection;
		boolean oldDoorSelectionESet = doorSelectionESet;
		doorSelection = DOOR_SELECTION_EDEFAULT;
		doorSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PaxeleratePackage.STUDY_TYPE__DOOR_SELECTION,
					oldDoorSelection, DOOR_SELECTION_EDEFAULT, oldDoorSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDoorSelection() {
		return doorSelectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithJackets() {
		return percentageOfPassengersWithJackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithJackets(double newPercentageOfPassengersWithJackets) {
		double oldPercentageOfPassengersWithJackets = percentageOfPassengersWithJackets;
		percentageOfPassengersWithJackets = newPercentageOfPassengersWithJackets;
		boolean oldPercentageOfPassengersWithJacketsESet = percentageOfPassengersWithJacketsESet;
		percentageOfPassengersWithJacketsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS,
					oldPercentageOfPassengersWithJackets, percentageOfPassengersWithJackets,
					!oldPercentageOfPassengersWithJacketsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentageOfPassengersWithJackets() {
		double oldPercentageOfPassengersWithJackets = percentageOfPassengersWithJackets;
		boolean oldPercentageOfPassengersWithJacketsESet = percentageOfPassengersWithJacketsESet;
		percentageOfPassengersWithJackets = PERCENTAGE_OF_PASSENGERS_WITH_JACKETS_EDEFAULT;
		percentageOfPassengersWithJacketsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS,
					oldPercentageOfPassengersWithJackets, PERCENTAGE_OF_PASSENGERS_WITH_JACKETS_EDEFAULT,
					oldPercentageOfPassengersWithJacketsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentageOfPassengersWithJackets() {
		return percentageOfPassengersWithJacketsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithSmallBags() {
		return percentageOfPassengersWithSmallBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithSmallBags(double newPercentageOfPassengersWithSmallBags) {
		double oldPercentageOfPassengersWithSmallBags = percentageOfPassengersWithSmallBags;
		percentageOfPassengersWithSmallBags = newPercentageOfPassengersWithSmallBags;
		boolean oldPercentageOfPassengersWithSmallBagsESet = percentageOfPassengersWithSmallBagsESet;
		percentageOfPassengersWithSmallBagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS,
					oldPercentageOfPassengersWithSmallBags, percentageOfPassengersWithSmallBags,
					!oldPercentageOfPassengersWithSmallBagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentageOfPassengersWithSmallBags() {
		double oldPercentageOfPassengersWithSmallBags = percentageOfPassengersWithSmallBags;
		boolean oldPercentageOfPassengersWithSmallBagsESet = percentageOfPassengersWithSmallBagsESet;
		percentageOfPassengersWithSmallBags = PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS_EDEFAULT;
		percentageOfPassengersWithSmallBagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS,
					oldPercentageOfPassengersWithSmallBags, PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS_EDEFAULT,
					oldPercentageOfPassengersWithSmallBagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentageOfPassengersWithSmallBags() {
		return percentageOfPassengersWithSmallBagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithMediumBags() {
		return percentageOfPassengersWithMediumBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithMediumBags(double newPercentageOfPassengersWithMediumBags) {
		double oldPercentageOfPassengersWithMediumBags = percentageOfPassengersWithMediumBags;
		percentageOfPassengersWithMediumBags = newPercentageOfPassengersWithMediumBags;
		boolean oldPercentageOfPassengersWithMediumBagsESet = percentageOfPassengersWithMediumBagsESet;
		percentageOfPassengersWithMediumBagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS,
					oldPercentageOfPassengersWithMediumBags, percentageOfPassengersWithMediumBags,
					!oldPercentageOfPassengersWithMediumBagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentageOfPassengersWithMediumBags() {
		double oldPercentageOfPassengersWithMediumBags = percentageOfPassengersWithMediumBags;
		boolean oldPercentageOfPassengersWithMediumBagsESet = percentageOfPassengersWithMediumBagsESet;
		percentageOfPassengersWithMediumBags = PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS_EDEFAULT;
		percentageOfPassengersWithMediumBagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS,
					oldPercentageOfPassengersWithMediumBags, PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS_EDEFAULT,
					oldPercentageOfPassengersWithMediumBagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentageOfPassengersWithMediumBags() {
		return percentageOfPassengersWithMediumBagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPercentageOfPassengersWithLargeBags() {
		return percentageOfPassengersWithLargeBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentageOfPassengersWithLargeBags(double newPercentageOfPassengersWithLargeBags) {
		double oldPercentageOfPassengersWithLargeBags = percentageOfPassengersWithLargeBags;
		percentageOfPassengersWithLargeBags = newPercentageOfPassengersWithLargeBags;
		boolean oldPercentageOfPassengersWithLargeBagsESet = percentageOfPassengersWithLargeBagsESet;
		percentageOfPassengersWithLargeBagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS,
					oldPercentageOfPassengersWithLargeBags, percentageOfPassengersWithLargeBags,
					!oldPercentageOfPassengersWithLargeBagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPercentageOfPassengersWithLargeBags() {
		double oldPercentageOfPassengersWithLargeBags = percentageOfPassengersWithLargeBags;
		boolean oldPercentageOfPassengersWithLargeBagsESet = percentageOfPassengersWithLargeBagsESet;
		percentageOfPassengersWithLargeBags = PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS_EDEFAULT;
		percentageOfPassengersWithLargeBagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS,
					oldPercentageOfPassengersWithLargeBags, PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS_EDEFAULT,
					oldPercentageOfPassengersWithLargeBagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPercentageOfPassengersWithLargeBags() {
		return percentageOfPassengersWithLargeBagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_TYPE__LOAD_FACTOR:
			return getLoadFactor();
		case PaxeleratePackage.STUDY_TYPE__ACTIVE_DOOR_UI_DS:
			return getActiveDoorUIDs();
		case PaxeleratePackage.STUDY_TYPE__ITERATIONS:
			return getIterations();
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_TYPE:
			return getSimulationType();
		case PaxeleratePackage.STUDY_TYPE__SEAT_TYPE:
			return getSeatType();
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_GRID_RESOLUTION:
			return getSimulationGridResolution();
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_SPEED_FACTOR:
			return getSimulationSpeedFactor();
		case PaxeleratePackage.STUDY_TYPE__PASSENGER_SORTING_SCHEME:
			return getPassengerSortingScheme();
		case PaxeleratePackage.STUDY_TYPE__DOOR_SELECTION:
			return getDoorSelection();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			return getPercentageOfPassengersWithJackets();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			return getPercentageOfPassengersWithSmallBags();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			return getPercentageOfPassengersWithMediumBags();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			return getPercentageOfPassengersWithLargeBags();
		case PaxeleratePackage.STUDY_TYPE__UID:
			return getUID();
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
		case PaxeleratePackage.STUDY_TYPE__LOAD_FACTOR:
			setLoadFactor((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__ACTIVE_DOOR_UI_DS:
			setActiveDoorUIDs((String) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__ITERATIONS:
			setIterations((Integer) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_TYPE:
			setSimulationType((SimulationTypeType) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__SEAT_TYPE:
			setSeatType((SeatTypeType) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_GRID_RESOLUTION:
			setSimulationGridResolution((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_SPEED_FACTOR:
			setSimulationSpeedFactor((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__PASSENGER_SORTING_SCHEME:
			setPassengerSortingScheme((PassengerSortingSchemeType) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__DOOR_SELECTION:
			setDoorSelection((DoorSelectionType) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			setPercentageOfPassengersWithJackets((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			setPercentageOfPassengersWithSmallBags((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			setPercentageOfPassengersWithMediumBags((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			setPercentageOfPassengersWithLargeBags((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_TYPE__UID:
			setUID((String) newValue);
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
		case PaxeleratePackage.STUDY_TYPE__LOAD_FACTOR:
			unsetLoadFactor();
			return;
		case PaxeleratePackage.STUDY_TYPE__ACTIVE_DOOR_UI_DS:
			setActiveDoorUIDs(ACTIVE_DOOR_UI_DS_EDEFAULT);
			return;
		case PaxeleratePackage.STUDY_TYPE__ITERATIONS:
			unsetIterations();
			return;
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_TYPE:
			unsetSimulationType();
			return;
		case PaxeleratePackage.STUDY_TYPE__SEAT_TYPE:
			unsetSeatType();
			return;
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_GRID_RESOLUTION:
			unsetSimulationGridResolution();
			return;
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_SPEED_FACTOR:
			unsetSimulationSpeedFactor();
			return;
		case PaxeleratePackage.STUDY_TYPE__PASSENGER_SORTING_SCHEME:
			unsetPassengerSortingScheme();
			return;
		case PaxeleratePackage.STUDY_TYPE__DOOR_SELECTION:
			unsetDoorSelection();
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			unsetPercentageOfPassengersWithJackets();
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			unsetPercentageOfPassengersWithSmallBags();
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			unsetPercentageOfPassengersWithMediumBags();
			return;
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			unsetPercentageOfPassengersWithLargeBags();
			return;
		case PaxeleratePackage.STUDY_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case PaxeleratePackage.STUDY_TYPE__LOAD_FACTOR:
			return isSetLoadFactor();
		case PaxeleratePackage.STUDY_TYPE__ACTIVE_DOOR_UI_DS:
			return ACTIVE_DOOR_UI_DS_EDEFAULT == null ? activeDoorUIDs != null
					: !ACTIVE_DOOR_UI_DS_EDEFAULT.equals(activeDoorUIDs);
		case PaxeleratePackage.STUDY_TYPE__ITERATIONS:
			return isSetIterations();
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_TYPE:
			return isSetSimulationType();
		case PaxeleratePackage.STUDY_TYPE__SEAT_TYPE:
			return isSetSeatType();
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_GRID_RESOLUTION:
			return isSetSimulationGridResolution();
		case PaxeleratePackage.STUDY_TYPE__SIMULATION_SPEED_FACTOR:
			return isSetSimulationSpeedFactor();
		case PaxeleratePackage.STUDY_TYPE__PASSENGER_SORTING_SCHEME:
			return isSetPassengerSortingScheme();
		case PaxeleratePackage.STUDY_TYPE__DOOR_SELECTION:
			return isSetDoorSelection();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			return isSetPercentageOfPassengersWithJackets();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			return isSetPercentageOfPassengersWithSmallBags();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			return isSetPercentageOfPassengersWithMediumBags();
		case PaxeleratePackage.STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			return isSetPercentageOfPassengersWithLargeBags();
		case PaxeleratePackage.STUDY_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
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
		result.append(" (loadFactor: ");
		if (loadFactorESet)
			result.append(loadFactor);
		else
			result.append("<unset>");
		result.append(", activeDoorUIDs: ");
		result.append(activeDoorUIDs);
		result.append(", iterations: ");
		if (iterationsESet)
			result.append(iterations);
		else
			result.append("<unset>");
		result.append(", simulationType: ");
		if (simulationTypeESet)
			result.append(simulationType);
		else
			result.append("<unset>");
		result.append(", seatType: ");
		if (seatTypeESet)
			result.append(seatType);
		else
			result.append("<unset>");
		result.append(", simulationGridResolution: ");
		if (simulationGridResolutionESet)
			result.append(simulationGridResolution);
		else
			result.append("<unset>");
		result.append(", simulationSpeedFactor: ");
		if (simulationSpeedFactorESet)
			result.append(simulationSpeedFactor);
		else
			result.append("<unset>");
		result.append(", passengerSortingScheme: ");
		if (passengerSortingSchemeESet)
			result.append(passengerSortingScheme);
		else
			result.append("<unset>");
		result.append(", doorSelection: ");
		if (doorSelectionESet)
			result.append(doorSelection);
		else
			result.append("<unset>");
		result.append(", percentageOfPassengersWithJackets: ");
		if (percentageOfPassengersWithJacketsESet)
			result.append(percentageOfPassengersWithJackets);
		else
			result.append("<unset>");
		result.append(", percentageOfPassengersWithSmallBags: ");
		if (percentageOfPassengersWithSmallBagsESet)
			result.append(percentageOfPassengersWithSmallBags);
		else
			result.append("<unset>");
		result.append(", percentageOfPassengersWithMediumBags: ");
		if (percentageOfPassengersWithMediumBagsESet)
			result.append(percentageOfPassengersWithMediumBags);
		else
			result.append("<unset>");
		result.append(", percentageOfPassengersWithLargeBags: ");
		if (percentageOfPassengersWithLargeBagsESet)
			result.append(percentageOfPassengersWithLargeBags);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //StudyTypeImpl
