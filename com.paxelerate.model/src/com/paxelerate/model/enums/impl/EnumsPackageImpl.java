/**
 */
package com.paxelerate.model.enums.impl;

import com.paxelerate.model.ModelPackage;

import com.paxelerate.model.agent.AgentPackage;

import com.paxelerate.model.agent.impl.AgentPackageImpl;

import com.paxelerate.model.enums.DoorSelection;
import com.paxelerate.model.enums.DoorSide;
import com.paxelerate.model.enums.DoorType;
import com.paxelerate.model.enums.EnumsFactory;
import com.paxelerate.model.enums.EnumsPackage;
import com.paxelerate.model.enums.Gender;
import com.paxelerate.model.enums.LuggageType;
import com.paxelerate.model.enums.PassengerMood;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.SeatType;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.SortingScheme;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.enums.TravelClass;

import com.paxelerate.model.impl.ModelPackageImpl;

import com.paxelerate.model.monuments.MonumentsPackage;

import com.paxelerate.model.monuments.impl.MonumentsPackageImpl;

import com.paxelerate.model.settings.SettingsPackage;

import com.paxelerate.model.settings.impl.SettingsPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumsPackageImpl extends EPackageImpl implements EnumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorSideEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seatLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorSelectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortingSchemeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simulationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum luggageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passengerMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum travelClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.paxelerate.model.enums.EnumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumsPackageImpl() {
		super(eNS_URI, EnumsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumsPackage init() {
		if (isInited)
			return (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumsPackageImpl theEnumsPackage = registeredEnumsPackage instanceof EnumsPackageImpl
				? (EnumsPackageImpl) registeredEnumsPackage
				: new EnumsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theModelPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
				? registeredPackage
				: ModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);
		AgentPackageImpl theAgentPackage = (AgentPackageImpl) (registeredPackage instanceof AgentPackageImpl
				? registeredPackage
				: AgentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);
		SettingsPackageImpl theSettingsPackage = (SettingsPackageImpl) (registeredPackage instanceof SettingsPackageImpl
				? registeredPackage
				: SettingsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MonumentsPackage.eNS_URI);
		MonumentsPackageImpl theMonumentsPackage = (MonumentsPackageImpl) (registeredPackage instanceof MonumentsPackageImpl
				? registeredPackage
				: MonumentsPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumsPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theAgentPackage.createPackageContents();
		theSettingsPackage.createPackageContents();
		theMonumentsPackage.createPackageContents();

		// Initialize created meta-data
		theEnumsPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theAgentPackage.initializePackageContents();
		theSettingsPackage.initializePackageContents();
		theMonumentsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumsPackage.eNS_URI, theEnumsPackage);
		return theEnumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoorSide() {
		return doorSideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeatType() {
		return seatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeatLocation() {
		return seatLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoorSelection() {
		return doorSelectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortingScheme() {
		return sortingSchemeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimulationType() {
		return simulationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLuggageType() {
		return luggageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPassengerMood() {
		return passengerMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTravelClass() {
		return travelClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoorType() {
		return doorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsFactory getEnumsFactory() {
		return (EnumsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create enums
		doorSideEEnum = createEEnum(DOOR_SIDE);
		seatTypeEEnum = createEEnum(SEAT_TYPE);
		seatLocationEEnum = createEEnum(SEAT_LOCATION);
		doorSelectionEEnum = createEEnum(DOOR_SELECTION);
		sortingSchemeEEnum = createEEnum(SORTING_SCHEME);
		simulationTypeEEnum = createEEnum(SIMULATION_TYPE);
		genderEEnum = createEEnum(GENDER);
		luggageTypeEEnum = createEEnum(LUGGAGE_TYPE);
		passengerMoodEEnum = createEEnum(PASSENGER_MOOD);
		stateEEnum = createEEnum(STATE);
		travelClassEEnum = createEEnum(TRAVEL_CLASS);
		doorTypeEEnum = createEEnum(DOOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(doorSideEEnum, DoorSide.class, "DoorSide");
		addEEnumLiteral(doorSideEEnum, DoorSide.PORT);
		addEEnumLiteral(doorSideEEnum, DoorSide.STARBOARD);

		initEEnum(seatTypeEEnum, SeatType.class, "SeatType");
		addEEnumLiteral(seatTypeEEnum, SeatType.DEFAULT);
		addEEnumLiteral(seatTypeEEnum, SeatType.SIDEWAYS_FOLDABLE);
		addEEnumLiteral(seatTypeEEnum, SeatType.LIFTING_SEAT_PAN);
		addEEnumLiteral(seatTypeEEnum, SeatType.BRING_YOUR_OWN);

		initEEnum(seatLocationEEnum, SeatLocation.class, "SeatLocation");
		addEEnumLiteral(seatLocationEEnum, SeatLocation.WINDOW);
		addEEnumLiteral(seatLocationEEnum, SeatLocation.MIDDLE);
		addEEnumLiteral(seatLocationEEnum, SeatLocation.AISLE);

		initEEnum(doorSelectionEEnum, DoorSelection.class, "DoorSelection");
		addEEnumLiteral(doorSelectionEEnum, DoorSelection.CLOSEST);
		addEEnumLiteral(doorSelectionEEnum, DoorSelection.CLOSEST_BEHIND);
		addEEnumLiteral(doorSelectionEEnum, DoorSelection.CLOSEST_IN_FRONT);
		addEEnumLiteral(doorSelectionEEnum, DoorSelection.RANDOM);

		initEEnum(sortingSchemeEEnum, SortingScheme.class, "SortingScheme");
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.RANDOM);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.RTF);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.FTR);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.WTA);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.WTA_RTF);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.WTA_FTR);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.BLOCK);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.BOARDING_CLASS);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.STEFFEN);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.MILNE_KELLY);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.BIG_BAGS_AFT);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.BIG_BAGS_FRONT);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.MAX_BAGS_AFT);
		addEEnumLiteral(sortingSchemeEEnum, SortingScheme.MAX_BAGS_FRONT);

		initEEnum(simulationTypeEEnum, SimulationType.class, "SimulationType");
		addEEnumLiteral(simulationTypeEEnum, SimulationType.BOARDING);
		addEEnumLiteral(simulationTypeEEnum, SimulationType.DEBOARDING);
		addEEnumLiteral(simulationTypeEEnum, SimulationType.EMERGENCY);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.FEMALE);
		addEEnumLiteral(genderEEnum, Gender.MALE);

		initEEnum(luggageTypeEEnum, LuggageType.class, "LuggageType");
		addEEnumLiteral(luggageTypeEEnum, LuggageType.JACKET);
		addEEnumLiteral(luggageTypeEEnum, LuggageType.SMALL_BAG);
		addEEnumLiteral(luggageTypeEEnum, LuggageType.MEDIUM_BAG);
		addEEnumLiteral(luggageTypeEEnum, LuggageType.LARGE_BAG);

		initEEnum(passengerMoodEEnum, PassengerMood.class, "PassengerMood");
		addEEnumLiteral(passengerMoodEEnum, PassengerMood.AGGRESSIVE);
		addEEnumLiteral(passengerMoodEEnum, PassengerMood.PASSIVE);

		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.FOLLOW_PATH);
		addEEnumLiteral(stateEEnum, State.WAIT_FOR_ROW_CLEARING);
		addEEnumLiteral(stateEEnum, State.CLEAR_ROW);
		addEEnumLiteral(stateEEnum, State.STOW_LUGGAGE);
		addEEnumLiteral(stateEEnum, State.RETRIEVE_LUGGAGE);
		addEEnumLiteral(stateEEnum, State.UNFOLD_SEAT);
		addEEnumLiteral(stateEEnum, State.PREPARE);
		addEEnumLiteral(stateEEnum, State.QUEUE_UP);
		addEEnumLiteral(stateEEnum, State.WAIT_FOR_OTHER_PASSENGER_TO_SEAT);
		addEEnumLiteral(stateEEnum, State.RETURN_TO_SEAT);
		addEEnumLiteral(stateEEnum, State.SEATED);
		addEEnumLiteral(stateEEnum, State.CALCULATE_NEW_PATH);
		addEEnumLiteral(stateEEnum, State.CABIN_LEFT);
		addEEnumLiteral(stateEEnum, State.NOT_ACTIVE);

		initEEnum(travelClassEEnum, TravelClass.class, "TravelClass");
		addEEnumLiteral(travelClassEEnum, TravelClass.ECONOMY);
		addEEnumLiteral(travelClassEEnum, TravelClass.PREMIUM_ECONOMY);
		addEEnumLiteral(travelClassEEnum, TravelClass.BUSINESS);
		addEEnumLiteral(travelClassEEnum, TravelClass.FIRST);

		initEEnum(doorTypeEEnum, DoorType.class, "DoorType");
		addEEnumLiteral(doorTypeEEnum, DoorType.I);
		addEEnumLiteral(doorTypeEEnum, DoorType.II);
		addEEnumLiteral(doorTypeEEnum, DoorType.III);
		addEEnumLiteral(doorTypeEEnum, DoorType.IV);
		addEEnumLiteral(doorTypeEEnum, DoorType.A);
		addEEnumLiteral(doorTypeEEnum, DoorType.B);
		addEEnumLiteral(doorTypeEEnum, DoorType.C);
	}

} //EnumsPackageImpl
