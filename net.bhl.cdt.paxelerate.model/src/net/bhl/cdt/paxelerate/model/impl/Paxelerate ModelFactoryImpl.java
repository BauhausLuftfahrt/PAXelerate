/**
 */
package model.impl;

import model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Paxelerate ModelFactoryImpl extends EFactoryImpl implements Paxelerate ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Paxelerate ModelFactory init() {
		try {
			Paxelerate ModelFactory thePaxelerate ModelFactory = (Paxelerate ModelFactory)EPackage.Registry.INSTANCE.getEFactory(Paxelerate ModelPackage.eNS_URI);
			if (thePaxelerate ModelFactory != null) {
				return thePaxelerate ModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Paxelerate ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paxelerate ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Paxelerate ModelPackage.CABIN: return createCabin();
			case Paxelerate ModelPackage.ROW: return createRow();
			case Paxelerate ModelPackage.TRAVEL_CLASS: return createTravelClass();
			case Paxelerate ModelPackage.BUSINESS_CLASS: return createBusinessClass();
			case Paxelerate ModelPackage.FIRST_CLASS: return createFirstClass();
			case Paxelerate ModelPackage.ECONOMY_CLASS: return createEconomyClass();
			case Paxelerate ModelPackage.PREMIUM_ECONOMY_CLASS: return createPremiumEconomyClass();
			case Paxelerate ModelPackage.SEAT: return createSeat();
			case Paxelerate ModelPackage.PASSENGER: return createPassenger();
			case Paxelerate ModelPackage.CREW_MEMBER: return createCrewMember();
			case Paxelerate ModelPackage.PHYSICAL_OBJECT: return createPhysicalObject();
			case Paxelerate ModelPackage.LAVATORY: return createLavatory();
			case Paxelerate ModelPackage.GALLEY: return createGalley();
			case Paxelerate ModelPackage.STAIRWAY: return createStairway();
			case Paxelerate ModelPackage.CURTAIN: return createCurtain();
			case Paxelerate ModelPackage.STOWAGE: return createStowage();
			case Paxelerate ModelPackage.DOOR: return createDoor();
			case Paxelerate ModelPackage.MAIN_DOOR: return createMainDoor();
			case Paxelerate ModelPackage.EMERGENCY_EXIT: return createEmergencyExit();
			case Paxelerate ModelPackage.STANDARD_DOOR: return createStandardDoor();
			case Paxelerate ModelPackage.SIMULATION_PROPERTIES: return createSimulationProperties();
			case Paxelerate ModelPackage.SIMULATION_RESULT: return createSimulationResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Paxelerate ModelPackage.SEX:
				return createSexFromString(eDataType, initialValue);
			case Paxelerate ModelPackage.STAIRWAY_DIRECTION:
				return createStairwayDirectionFromString(eDataType, initialValue);
			case Paxelerate ModelPackage.AIRCRAFT_TYPE:
				return createAircraftTypeFromString(eDataType, initialValue);
			case Paxelerate ModelPackage.PASSENGER_MOOD:
				return createPassengerMoodFromString(eDataType, initialValue);
			case Paxelerate ModelPackage.LUGGAGE_SIZE:
				return createLuggageSizeFromString(eDataType, initialValue);
			case Paxelerate ModelPackage.SORTING_STYLE:
				return createSortingStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Paxelerate ModelPackage.SEX:
				return convertSexToString(eDataType, instanceValue);
			case Paxelerate ModelPackage.STAIRWAY_DIRECTION:
				return convertStairwayDirectionToString(eDataType, instanceValue);
			case Paxelerate ModelPackage.AIRCRAFT_TYPE:
				return convertAircraftTypeToString(eDataType, instanceValue);
			case Paxelerate ModelPackage.PASSENGER_MOOD:
				return convertPassengerMoodToString(eDataType, instanceValue);
			case Paxelerate ModelPackage.LUGGAGE_SIZE:
				return convertLuggageSizeToString(eDataType, instanceValue);
			case Paxelerate ModelPackage.SORTING_STYLE:
				return convertSortingStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cabin createCabin() {
		CabinImpl cabin = new CabinImpl();
		return cabin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TravelClass createTravelClass() {
		TravelClassImpl travelClass = new TravelClassImpl();
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessClass createBusinessClass() {
		BusinessClassImpl businessClass = new BusinessClassImpl();
		return businessClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstClass createFirstClass() {
		FirstClassImpl firstClass = new FirstClassImpl();
		return firstClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomyClass createEconomyClass() {
		EconomyClassImpl economyClass = new EconomyClassImpl();
		return economyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremiumEconomyClass createPremiumEconomyClass() {
		PremiumEconomyClassImpl premiumEconomyClass = new PremiumEconomyClassImpl();
		return premiumEconomyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat createSeat() {
		SeatImpl seat = new SeatImpl();
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passenger createPassenger() {
		PassengerImpl passenger = new PassengerImpl();
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrewMember createCrewMember() {
		CrewMemberImpl crewMember = new CrewMemberImpl();
		return crewMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalObject createPhysicalObject() {
		PhysicalObjectImpl physicalObject = new PhysicalObjectImpl();
		return physicalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lavatory createLavatory() {
		LavatoryImpl lavatory = new LavatoryImpl();
		return lavatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Galley createGalley() {
		GalleyImpl galley = new GalleyImpl();
		return galley;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stairway createStairway() {
		StairwayImpl stairway = new StairwayImpl();
		return stairway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curtain createCurtain() {
		CurtainImpl curtain = new CurtainImpl();
		return curtain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stowage createStowage() {
		StowageImpl stowage = new StowageImpl();
		return stowage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainDoor createMainDoor() {
		MainDoorImpl mainDoor = new MainDoorImpl();
		return mainDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmergencyExit createEmergencyExit() {
		EmergencyExitImpl emergencyExit = new EmergencyExitImpl();
		return emergencyExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDoor createStandardDoor() {
		StandardDoorImpl standardDoor = new StandardDoorImpl();
		return standardDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationProperties createSimulationProperties() {
		SimulationPropertiesImpl simulationProperties = new SimulationPropertiesImpl();
		return simulationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationResult createSimulationResult() {
		SimulationResultImpl simulationResult = new SimulationResultImpl();
		return simulationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex createSexFromString(EDataType eDataType, String initialValue) {
		Sex result = Sex.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSexToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StairwayDirection createStairwayDirectionFromString(EDataType eDataType, String initialValue) {
		StairwayDirection result = StairwayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStairwayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AircraftType createAircraftTypeFromString(EDataType eDataType, String initialValue) {
		AircraftType result = AircraftType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAircraftTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerMood createPassengerMoodFromString(EDataType eDataType, String initialValue) {
		PassengerMood result = PassengerMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassengerMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageSize createLuggageSizeFromString(EDataType eDataType, String initialValue) {
		LuggageSize result = LuggageSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLuggageSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingStyle createSortingStyleFromString(EDataType eDataType, String initialValue) {
		SortingStyle result = SortingStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortingStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paxelerate ModelPackage getPaxelerate ModelPackage() {
		return (Paxelerate ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Paxelerate ModelPackage getPackage() {
		return Paxelerate ModelPackage.eINSTANCE;
	}

} //Paxelerate ModelFactoryImpl
