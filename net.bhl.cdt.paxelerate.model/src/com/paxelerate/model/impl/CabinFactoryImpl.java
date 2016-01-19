/**
 */
package com.paxelerate.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.paxelerate.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CabinFactoryImpl extends EFactoryImpl implements CabinFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CabinFactory init() {
		try {
			CabinFactory theCabinFactory = (CabinFactory)EPackage.Registry.INSTANCE.getEFactory(CabinPackage.eNS_URI);
			if (theCabinFactory != null) {
				return theCabinFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CabinFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabinFactoryImpl() {
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
			case CabinPackage.CABIN: return createCabin();
			case CabinPackage.ROW: return createRow();
			case CabinPackage.TRAVEL_CLASS: return createTravelClass();
			case CabinPackage.BUSINESS_CLASS: return createBusinessClass();
			case CabinPackage.FIRST_CLASS: return createFirstClass();
			case CabinPackage.ECONOMY_CLASS: return createEconomyClass();
			case CabinPackage.PREMIUM_ECONOMY_CLASS: return createPremiumEconomyClass();
			case CabinPackage.SEAT: return createSeat();
			case CabinPackage.PASSENGER: return createPassenger();
			case CabinPackage.CREW_MEMBER: return createCrewMember();
			case CabinPackage.PHYSICAL_OBJECT: return createPhysicalObject();
			case CabinPackage.LAVATORY: return createLavatory();
			case CabinPackage.GALLEY: return createGalley();
			case CabinPackage.STAIRWAY: return createStairway();
			case CabinPackage.CURTAIN: return createCurtain();
			case CabinPackage.STOWAGE: return createStowage();
			case CabinPackage.DOOR: return createDoor();
			case CabinPackage.MAIN_DOOR: return createMainDoor();
			case CabinPackage.EMERGENCY_EXIT: return createEmergencyExit();
			case CabinPackage.STANDARD_DOOR: return createStandardDoor();
			case CabinPackage.SIMULATION_PROPERTIES: return createSimulationProperties();
			case CabinPackage.SIMULATION_RESULT: return createSimulationResult();
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
			case CabinPackage.SEX:
				return createSexFromString(eDataType, initialValue);
			case CabinPackage.STAIRWAY_DIRECTION:
				return createStairwayDirectionFromString(eDataType, initialValue);
			case CabinPackage.AIRCRAFT_TYPE:
				return createAircraftTypeFromString(eDataType, initialValue);
			case CabinPackage.PASSENGER_MOOD:
				return createPassengerMoodFromString(eDataType, initialValue);
			case CabinPackage.LUGGAGE_SIZE:
				return createLuggageSizeFromString(eDataType, initialValue);
			case CabinPackage.SORTING_STYLE:
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
			case CabinPackage.SEX:
				return convertSexToString(eDataType, instanceValue);
			case CabinPackage.STAIRWAY_DIRECTION:
				return convertStairwayDirectionToString(eDataType, instanceValue);
			case CabinPackage.AIRCRAFT_TYPE:
				return convertAircraftTypeToString(eDataType, instanceValue);
			case CabinPackage.PASSENGER_MOOD:
				return convertPassengerMoodToString(eDataType, instanceValue);
			case CabinPackage.LUGGAGE_SIZE:
				return convertLuggageSizeToString(eDataType, instanceValue);
			case CabinPackage.SORTING_STYLE:
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
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
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
	public PhysicalObject createPhysicalObject() {
		PhysicalObjectImpl physicalObject = new PhysicalObjectImpl();
		return physicalObject;
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
	public CabinPackage getCabinPackage() {
		return (CabinPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CabinPackage getPackage() {
		return CabinPackage.eINSTANCE;
	}

} //CabinFactoryImpl
