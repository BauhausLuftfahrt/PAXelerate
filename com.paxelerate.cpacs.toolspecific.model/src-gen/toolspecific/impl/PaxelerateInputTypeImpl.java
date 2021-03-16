/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import toolspecific.BooleanBaseType;
import toolspecific.DoorSelectionType;
import toolspecific.DoubleBaseType;
import toolspecific.IntegerBaseType;
import toolspecific.PassengerSortingSchemeType;
import toolspecific.PaxelerateInputType;
import toolspecific.SeatTypeType;
import toolspecific.SimulationTypeType;
import toolspecific.StringVectorBaseType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paxelerate Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getActiveDoorUIDs <em>Active Door UI Ds</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getSimulationType <em>Simulation Type</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getDisplaySimulation <em>Display Simulation</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getSeatType <em>Seat Type</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getSimulationGridResolution <em>Simulation Grid Resolution</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getPassengerAgressiveMoodShare <em>Passenger Agressive Mood Share</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getDoorSelection <em>Door Selection</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}</li>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxelerateInputTypeImpl extends ComplexBaseTypeImpl implements PaxelerateInputType {
	/**
	 * The cached value of the '{@link #getLoadFactor() <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType loadFactor;

	/**
	 * The cached value of the '{@link #getActiveDoorUIDs() <em>Active Door UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveDoorUIDs()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType activeDoorUIDs;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType iterations;

	/**
	 * The cached value of the '{@link #getSimulationType() <em>Simulation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationType()
	 * @generated
	 * @ordered
	 */
	protected SimulationTypeType simulationType;

	/**
	 * The cached value of the '{@link #getDisplaySimulation() <em>Display Simulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaySimulation()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType displaySimulation;

	/**
	 * The cached value of the '{@link #getSeatType() <em>Seat Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatType()
	 * @generated
	 * @ordered
	 */
	protected SeatTypeType seatType;

	/**
	 * The cached value of the '{@link #getSimulationGridResolution() <em>Simulation Grid Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationGridResolution()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType simulationGridResolution;

	/**
	 * The cached value of the '{@link #getSimulationSpeedFactor() <em>Simulation Speed Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType simulationSpeedFactor;

	/**
	 * The cached value of the '{@link #getPassengerSortingScheme() <em>Passenger Sorting Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSortingScheme()
	 * @generated
	 * @ordered
	 */
	protected PassengerSortingSchemeType passengerSortingScheme;

	/**
	 * The cached value of the '{@link #getPassengerAgressiveMoodShare() <em>Passenger Agressive Mood Share</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerAgressiveMoodShare()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType passengerAgressiveMoodShare;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTimeMean() <em>Seat Interference Process Time Mean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeMean()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType seatInterferenceProcessTimeMean;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTimeDeviation() <em>Seat Interference Process Time Deviation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType seatInterferenceProcessTimeDeviation;

	/**
	 * The cached value of the '{@link #getDoorSelection() <em>Door Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSelection()
	 * @generated
	 * @ordered
	 */
	protected DoorSelectionType doorSelection;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithJackets() <em>Percentage Of Passengers With Jackets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithJackets()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType percentageOfPassengersWithJackets;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithSmallBags() <em>Percentage Of Passengers With Small Bags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallBags()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType percentageOfPassengersWithSmallBags;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithMediumBags() <em>Percentage Of Passengers With Medium Bags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumBags()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType percentageOfPassengersWithMediumBags;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithLargeBags() <em>Percentage Of Passengers With Large Bags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithLargeBags()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType percentageOfPassengersWithLargeBags;

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
	protected PaxelerateInputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.PAXELERATE_INPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getLoadFactor() {
		return loadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadFactor(DoubleBaseType newLoadFactor, NotificationChain msgs) {
		DoubleBaseType oldLoadFactor = loadFactor;
		loadFactor = newLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR, oldLoadFactor, newLoadFactor);
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
	public void setLoadFactor(DoubleBaseType newLoadFactor) {
		if (newLoadFactor != loadFactor) {
			NotificationChain msgs = null;
			if (loadFactor != null)
				msgs = ((InternalEObject) loadFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR, null, msgs);
			if (newLoadFactor != null)
				msgs = ((InternalEObject) newLoadFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR, null, msgs);
			msgs = basicSetLoadFactor(newLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR, newLoadFactor, newLoadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVectorBaseType getActiveDoorUIDs() {
		return activeDoorUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActiveDoorUIDs(StringVectorBaseType newActiveDoorUIDs, NotificationChain msgs) {
		StringVectorBaseType oldActiveDoorUIDs = activeDoorUIDs;
		activeDoorUIDs = newActiveDoorUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS, oldActiveDoorUIDs, newActiveDoorUIDs);
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
	public void setActiveDoorUIDs(StringVectorBaseType newActiveDoorUIDs) {
		if (newActiveDoorUIDs != activeDoorUIDs) {
			NotificationChain msgs = null;
			if (activeDoorUIDs != null)
				msgs = ((InternalEObject) activeDoorUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS, null,
						msgs);
			if (newActiveDoorUIDs != null)
				msgs = ((InternalEObject) newActiveDoorUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS, null,
						msgs);
			msgs = basicSetActiveDoorUIDs(newActiveDoorUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS, newActiveDoorUIDs,
					newActiveDoorUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBaseType getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIterations(IntegerBaseType newIterations, NotificationChain msgs) {
		IntegerBaseType oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS, oldIterations, newIterations);
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
	public void setIterations(IntegerBaseType newIterations) {
		if (newIterations != iterations) {
			NotificationChain msgs = null;
			if (iterations != null)
				msgs = ((InternalEObject) iterations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS, null, msgs);
			if (newIterations != null)
				msgs = ((InternalEObject) newIterations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS, null, msgs);
			msgs = basicSetIterations(newIterations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS,
					newIterations, newIterations));
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
	public NotificationChain basicSetSimulationType(SimulationTypeType newSimulationType, NotificationChain msgs) {
		SimulationTypeType oldSimulationType = simulationType;
		simulationType = newSimulationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE, oldSimulationType, newSimulationType);
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
	public void setSimulationType(SimulationTypeType newSimulationType) {
		if (newSimulationType != simulationType) {
			NotificationChain msgs = null;
			if (simulationType != null)
				msgs = ((InternalEObject) simulationType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE, null,
						msgs);
			if (newSimulationType != null)
				msgs = ((InternalEObject) newSimulationType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE, null,
						msgs);
			msgs = basicSetSimulationType(newSimulationType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE, newSimulationType, newSimulationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBaseType getDisplaySimulation() {
		return displaySimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplaySimulation(BooleanBaseType newDisplaySimulation, NotificationChain msgs) {
		BooleanBaseType oldDisplaySimulation = displaySimulation;
		displaySimulation = newDisplaySimulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION, oldDisplaySimulation,
					newDisplaySimulation);
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
	public void setDisplaySimulation(BooleanBaseType newDisplaySimulation) {
		if (newDisplaySimulation != displaySimulation) {
			NotificationChain msgs = null;
			if (displaySimulation != null)
				msgs = ((InternalEObject) displaySimulation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION, null,
						msgs);
			if (newDisplaySimulation != null)
				msgs = ((InternalEObject) newDisplaySimulation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION, null,
						msgs);
			msgs = basicSetDisplaySimulation(newDisplaySimulation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION, newDisplaySimulation,
					newDisplaySimulation));
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
	public NotificationChain basicSetSeatType(SeatTypeType newSeatType, NotificationChain msgs) {
		SeatTypeType oldSeatType = seatType;
		seatType = newSeatType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE, oldSeatType, newSeatType);
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
	public void setSeatType(SeatTypeType newSeatType) {
		if (newSeatType != seatType) {
			NotificationChain msgs = null;
			if (seatType != null)
				msgs = ((InternalEObject) seatType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE, null, msgs);
			if (newSeatType != null)
				msgs = ((InternalEObject) newSeatType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE, null, msgs);
			msgs = basicSetSeatType(newSeatType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE,
					newSeatType, newSeatType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getSimulationGridResolution() {
		return simulationGridResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationGridResolution(DoubleBaseType newSimulationGridResolution,
			NotificationChain msgs) {
		DoubleBaseType oldSimulationGridResolution = simulationGridResolution;
		simulationGridResolution = newSimulationGridResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION, oldSimulationGridResolution,
					newSimulationGridResolution);
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
	public void setSimulationGridResolution(DoubleBaseType newSimulationGridResolution) {
		if (newSimulationGridResolution != simulationGridResolution) {
			NotificationChain msgs = null;
			if (simulationGridResolution != null)
				msgs = ((InternalEObject) simulationGridResolution).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION,
						null, msgs);
			if (newSimulationGridResolution != null)
				msgs = ((InternalEObject) newSimulationGridResolution).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION,
						null, msgs);
			msgs = basicSetSimulationGridResolution(newSimulationGridResolution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION, newSimulationGridResolution,
					newSimulationGridResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getSimulationSpeedFactor() {
		return simulationSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationSpeedFactor(DoubleBaseType newSimulationSpeedFactor,
			NotificationChain msgs) {
		DoubleBaseType oldSimulationSpeedFactor = simulationSpeedFactor;
		simulationSpeedFactor = newSimulationSpeedFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR, oldSimulationSpeedFactor,
					newSimulationSpeedFactor);
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
	public void setSimulationSpeedFactor(DoubleBaseType newSimulationSpeedFactor) {
		if (newSimulationSpeedFactor != simulationSpeedFactor) {
			NotificationChain msgs = null;
			if (simulationSpeedFactor != null)
				msgs = ((InternalEObject) simulationSpeedFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR,
						null, msgs);
			if (newSimulationSpeedFactor != null)
				msgs = ((InternalEObject) newSimulationSpeedFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR,
						null, msgs);
			msgs = basicSetSimulationSpeedFactor(newSimulationSpeedFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR, newSimulationSpeedFactor,
					newSimulationSpeedFactor));
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
	public NotificationChain basicSetPassengerSortingScheme(PassengerSortingSchemeType newPassengerSortingScheme,
			NotificationChain msgs) {
		PassengerSortingSchemeType oldPassengerSortingScheme = passengerSortingScheme;
		passengerSortingScheme = newPassengerSortingScheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME, oldPassengerSortingScheme,
					newPassengerSortingScheme);
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
	public void setPassengerSortingScheme(PassengerSortingSchemeType newPassengerSortingScheme) {
		if (newPassengerSortingScheme != passengerSortingScheme) {
			NotificationChain msgs = null;
			if (passengerSortingScheme != null)
				msgs = ((InternalEObject) passengerSortingScheme).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME,
						null, msgs);
			if (newPassengerSortingScheme != null)
				msgs = ((InternalEObject) newPassengerSortingScheme).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME,
						null, msgs);
			msgs = basicSetPassengerSortingScheme(newPassengerSortingScheme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME, newPassengerSortingScheme,
					newPassengerSortingScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getPassengerAgressiveMoodShare() {
		return passengerAgressiveMoodShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassengerAgressiveMoodShare(DoubleBaseType newPassengerAgressiveMoodShare,
			NotificationChain msgs) {
		DoubleBaseType oldPassengerAgressiveMoodShare = passengerAgressiveMoodShare;
		passengerAgressiveMoodShare = newPassengerAgressiveMoodShare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE,
					oldPassengerAgressiveMoodShare, newPassengerAgressiveMoodShare);
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
	public void setPassengerAgressiveMoodShare(DoubleBaseType newPassengerAgressiveMoodShare) {
		if (newPassengerAgressiveMoodShare != passengerAgressiveMoodShare) {
			NotificationChain msgs = null;
			if (passengerAgressiveMoodShare != null)
				msgs = ((InternalEObject) passengerAgressiveMoodShare).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE,
						null, msgs);
			if (newPassengerAgressiveMoodShare != null)
				msgs = ((InternalEObject) newPassengerAgressiveMoodShare).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE,
						null, msgs);
			msgs = basicSetPassengerAgressiveMoodShare(newPassengerAgressiveMoodShare, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE,
					newPassengerAgressiveMoodShare, newPassengerAgressiveMoodShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getSeatInterferenceProcessTimeMean() {
		return seatInterferenceProcessTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeatInterferenceProcessTimeMean(DoubleBaseType newSeatInterferenceProcessTimeMean,
			NotificationChain msgs) {
		DoubleBaseType oldSeatInterferenceProcessTimeMean = seatInterferenceProcessTimeMean;
		seatInterferenceProcessTimeMean = newSeatInterferenceProcessTimeMean;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN,
					oldSeatInterferenceProcessTimeMean, newSeatInterferenceProcessTimeMean);
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
	public void setSeatInterferenceProcessTimeMean(DoubleBaseType newSeatInterferenceProcessTimeMean) {
		if (newSeatInterferenceProcessTimeMean != seatInterferenceProcessTimeMean) {
			NotificationChain msgs = null;
			if (seatInterferenceProcessTimeMean != null)
				msgs = ((InternalEObject) seatInterferenceProcessTimeMean).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN,
						null, msgs);
			if (newSeatInterferenceProcessTimeMean != null)
				msgs = ((InternalEObject) newSeatInterferenceProcessTimeMean).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN,
						null, msgs);
			msgs = basicSetSeatInterferenceProcessTimeMean(newSeatInterferenceProcessTimeMean, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN,
					newSeatInterferenceProcessTimeMean, newSeatInterferenceProcessTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getSeatInterferenceProcessTimeDeviation() {
		return seatInterferenceProcessTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeatInterferenceProcessTimeDeviation(
			DoubleBaseType newSeatInterferenceProcessTimeDeviation, NotificationChain msgs) {
		DoubleBaseType oldSeatInterferenceProcessTimeDeviation = seatInterferenceProcessTimeDeviation;
		seatInterferenceProcessTimeDeviation = newSeatInterferenceProcessTimeDeviation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION,
					oldSeatInterferenceProcessTimeDeviation, newSeatInterferenceProcessTimeDeviation);
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
	public void setSeatInterferenceProcessTimeDeviation(DoubleBaseType newSeatInterferenceProcessTimeDeviation) {
		if (newSeatInterferenceProcessTimeDeviation != seatInterferenceProcessTimeDeviation) {
			NotificationChain msgs = null;
			if (seatInterferenceProcessTimeDeviation != null)
				msgs = ((InternalEObject) seatInterferenceProcessTimeDeviation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION,
						null, msgs);
			if (newSeatInterferenceProcessTimeDeviation != null)
				msgs = ((InternalEObject) newSeatInterferenceProcessTimeDeviation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION,
						null, msgs);
			msgs = basicSetSeatInterferenceProcessTimeDeviation(newSeatInterferenceProcessTimeDeviation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION,
					newSeatInterferenceProcessTimeDeviation, newSeatInterferenceProcessTimeDeviation));
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
	public NotificationChain basicSetDoorSelection(DoorSelectionType newDoorSelection, NotificationChain msgs) {
		DoorSelectionType oldDoorSelection = doorSelection;
		doorSelection = newDoorSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION, oldDoorSelection, newDoorSelection);
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
	public void setDoorSelection(DoorSelectionType newDoorSelection) {
		if (newDoorSelection != doorSelection) {
			NotificationChain msgs = null;
			if (doorSelection != null)
				msgs = ((InternalEObject) doorSelection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION, null, msgs);
			if (newDoorSelection != null)
				msgs = ((InternalEObject) newDoorSelection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION, null, msgs);
			msgs = basicSetDoorSelection(newDoorSelection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION, newDoorSelection, newDoorSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getPercentageOfPassengersWithJackets() {
		return percentageOfPassengersWithJackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentageOfPassengersWithJackets(
			DoubleBaseType newPercentageOfPassengersWithJackets, NotificationChain msgs) {
		DoubleBaseType oldPercentageOfPassengersWithJackets = percentageOfPassengersWithJackets;
		percentageOfPassengersWithJackets = newPercentageOfPassengersWithJackets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS,
					oldPercentageOfPassengersWithJackets, newPercentageOfPassengersWithJackets);
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
	public void setPercentageOfPassengersWithJackets(DoubleBaseType newPercentageOfPassengersWithJackets) {
		if (newPercentageOfPassengersWithJackets != percentageOfPassengersWithJackets) {
			NotificationChain msgs = null;
			if (percentageOfPassengersWithJackets != null)
				msgs = ((InternalEObject) percentageOfPassengersWithJackets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS,
						null, msgs);
			if (newPercentageOfPassengersWithJackets != null)
				msgs = ((InternalEObject) newPercentageOfPassengersWithJackets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS,
						null, msgs);
			msgs = basicSetPercentageOfPassengersWithJackets(newPercentageOfPassengersWithJackets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS,
					newPercentageOfPassengersWithJackets, newPercentageOfPassengersWithJackets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getPercentageOfPassengersWithSmallBags() {
		return percentageOfPassengersWithSmallBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentageOfPassengersWithSmallBags(
			DoubleBaseType newPercentageOfPassengersWithSmallBags, NotificationChain msgs) {
		DoubleBaseType oldPercentageOfPassengersWithSmallBags = percentageOfPassengersWithSmallBags;
		percentageOfPassengersWithSmallBags = newPercentageOfPassengersWithSmallBags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS,
					oldPercentageOfPassengersWithSmallBags, newPercentageOfPassengersWithSmallBags);
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
	public void setPercentageOfPassengersWithSmallBags(DoubleBaseType newPercentageOfPassengersWithSmallBags) {
		if (newPercentageOfPassengersWithSmallBags != percentageOfPassengersWithSmallBags) {
			NotificationChain msgs = null;
			if (percentageOfPassengersWithSmallBags != null)
				msgs = ((InternalEObject) percentageOfPassengersWithSmallBags).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS,
						null, msgs);
			if (newPercentageOfPassengersWithSmallBags != null)
				msgs = ((InternalEObject) newPercentageOfPassengersWithSmallBags).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS,
						null, msgs);
			msgs = basicSetPercentageOfPassengersWithSmallBags(newPercentageOfPassengersWithSmallBags, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS,
					newPercentageOfPassengersWithSmallBags, newPercentageOfPassengersWithSmallBags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getPercentageOfPassengersWithMediumBags() {
		return percentageOfPassengersWithMediumBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentageOfPassengersWithMediumBags(
			DoubleBaseType newPercentageOfPassengersWithMediumBags, NotificationChain msgs) {
		DoubleBaseType oldPercentageOfPassengersWithMediumBags = percentageOfPassengersWithMediumBags;
		percentageOfPassengersWithMediumBags = newPercentageOfPassengersWithMediumBags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS,
					oldPercentageOfPassengersWithMediumBags, newPercentageOfPassengersWithMediumBags);
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
	public void setPercentageOfPassengersWithMediumBags(DoubleBaseType newPercentageOfPassengersWithMediumBags) {
		if (newPercentageOfPassengersWithMediumBags != percentageOfPassengersWithMediumBags) {
			NotificationChain msgs = null;
			if (percentageOfPassengersWithMediumBags != null)
				msgs = ((InternalEObject) percentageOfPassengersWithMediumBags).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS,
						null, msgs);
			if (newPercentageOfPassengersWithMediumBags != null)
				msgs = ((InternalEObject) newPercentageOfPassengersWithMediumBags).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS,
						null, msgs);
			msgs = basicSetPercentageOfPassengersWithMediumBags(newPercentageOfPassengersWithMediumBags, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS,
					newPercentageOfPassengersWithMediumBags, newPercentageOfPassengersWithMediumBags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType getPercentageOfPassengersWithLargeBags() {
		return percentageOfPassengersWithLargeBags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPercentageOfPassengersWithLargeBags(
			DoubleBaseType newPercentageOfPassengersWithLargeBags, NotificationChain msgs) {
		DoubleBaseType oldPercentageOfPassengersWithLargeBags = percentageOfPassengersWithLargeBags;
		percentageOfPassengersWithLargeBags = newPercentageOfPassengersWithLargeBags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS,
					oldPercentageOfPassengersWithLargeBags, newPercentageOfPassengersWithLargeBags);
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
	public void setPercentageOfPassengersWithLargeBags(DoubleBaseType newPercentageOfPassengersWithLargeBags) {
		if (newPercentageOfPassengersWithLargeBags != percentageOfPassengersWithLargeBags) {
			NotificationChain msgs = null;
			if (percentageOfPassengersWithLargeBags != null)
				msgs = ((InternalEObject) percentageOfPassengersWithLargeBags).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS,
						null, msgs);
			if (newPercentageOfPassengersWithLargeBags != null)
				msgs = ((InternalEObject) newPercentageOfPassengersWithLargeBags).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS,
						null, msgs);
			msgs = basicSetPercentageOfPassengersWithLargeBags(newPercentageOfPassengersWithLargeBags, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS,
					newPercentageOfPassengersWithLargeBags, newPercentageOfPassengersWithLargeBags));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.PAXELERATE_INPUT_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR:
			return basicSetLoadFactor(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS:
			return basicSetActiveDoorUIDs(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS:
			return basicSetIterations(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE:
			return basicSetSimulationType(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION:
			return basicSetDisplaySimulation(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE:
			return basicSetSeatType(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION:
			return basicSetSimulationGridResolution(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR:
			return basicSetSimulationSpeedFactor(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME:
			return basicSetPassengerSortingScheme(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE:
			return basicSetPassengerAgressiveMoodShare(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			return basicSetSeatInterferenceProcessTimeMean(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			return basicSetSeatInterferenceProcessTimeDeviation(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION:
			return basicSetDoorSelection(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			return basicSetPercentageOfPassengersWithJackets(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			return basicSetPercentageOfPassengersWithSmallBags(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			return basicSetPercentageOfPassengersWithMediumBags(null, msgs);
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			return basicSetPercentageOfPassengersWithLargeBags(null, msgs);
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR:
			return getLoadFactor();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS:
			return getActiveDoorUIDs();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS:
			return getIterations();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE:
			return getSimulationType();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION:
			return getDisplaySimulation();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE:
			return getSeatType();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION:
			return getSimulationGridResolution();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR:
			return getSimulationSpeedFactor();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME:
			return getPassengerSortingScheme();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE:
			return getPassengerAgressiveMoodShare();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			return getSeatInterferenceProcessTimeMean();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			return getSeatInterferenceProcessTimeDeviation();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION:
			return getDoorSelection();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			return getPercentageOfPassengersWithJackets();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			return getPercentageOfPassengersWithSmallBags();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			return getPercentageOfPassengersWithMediumBags();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			return getPercentageOfPassengersWithLargeBags();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__UID:
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR:
			setLoadFactor((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS:
			setActiveDoorUIDs((StringVectorBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS:
			setIterations((IntegerBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE:
			setSimulationType((SimulationTypeType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION:
			setDisplaySimulation((BooleanBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE:
			setSeatType((SeatTypeType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION:
			setSimulationGridResolution((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR:
			setSimulationSpeedFactor((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME:
			setPassengerSortingScheme((PassengerSortingSchemeType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE:
			setPassengerAgressiveMoodShare((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			setSeatInterferenceProcessTimeMean((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			setSeatInterferenceProcessTimeDeviation((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION:
			setDoorSelection((DoorSelectionType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			setPercentageOfPassengersWithJackets((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			setPercentageOfPassengersWithSmallBags((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			setPercentageOfPassengersWithMediumBags((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			setPercentageOfPassengersWithLargeBags((DoubleBaseType) newValue);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__UID:
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR:
			setLoadFactor((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS:
			setActiveDoorUIDs((StringVectorBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS:
			setIterations((IntegerBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE:
			setSimulationType((SimulationTypeType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION:
			setDisplaySimulation((BooleanBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE:
			setSeatType((SeatTypeType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION:
			setSimulationGridResolution((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR:
			setSimulationSpeedFactor((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME:
			setPassengerSortingScheme((PassengerSortingSchemeType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE:
			setPassengerAgressiveMoodShare((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			setSeatInterferenceProcessTimeMean((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			setSeatInterferenceProcessTimeDeviation((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION:
			setDoorSelection((DoorSelectionType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			setPercentageOfPassengersWithJackets((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			setPercentageOfPassengersWithSmallBags((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			setPercentageOfPassengersWithMediumBags((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			setPercentageOfPassengersWithLargeBags((DoubleBaseType) null);
			return;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__UID:
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__LOAD_FACTOR:
			return loadFactor != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS:
			return activeDoorUIDs != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__ITERATIONS:
			return iterations != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_TYPE:
			return simulationType != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION:
			return displaySimulation != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_TYPE:
			return seatType != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION:
			return simulationGridResolution != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR:
			return simulationSpeedFactor != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME:
			return passengerSortingScheme != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE:
			return passengerAgressiveMoodShare != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			return seatInterferenceProcessTimeMean != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			return seatInterferenceProcessTimeDeviation != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__DOOR_SELECTION:
			return doorSelection != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS:
			return percentageOfPassengersWithJackets != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS:
			return percentageOfPassengersWithSmallBags != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS:
			return percentageOfPassengersWithMediumBags != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS:
			return percentageOfPassengersWithLargeBags != null;
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__UID:
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
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //PaxelerateInputTypeImpl
