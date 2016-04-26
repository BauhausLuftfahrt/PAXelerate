/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import net.bhl.cdt.paxelerate.model.*;
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
	 * <!-- end-user-doc -->.
	 *
	 * @param eClass the e class
	 * @return the e object
	 * @generated 
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CabinPackage.CABIN: return createCabin();
			case CabinPackage.ROW: return createRow();
			case CabinPackage.TRAVEL_CLASS: return createTravelClass();
			case CabinPackage.SEAT: return createSeat();
			case CabinPackage.PASSENGER: return createPassenger();
			case CabinPackage.CREW_MEMBER: return createCrewMember();
			case CabinPackage.LAVATORY: return createLavatory();
			case CabinPackage.GALLEY: return createGalley();
			case CabinPackage.STAIRWAY: return createStairway();
			case CabinPackage.CURTAIN: return createCurtain();
			case CabinPackage.STOWAGE: return createStowage();
			case CabinPackage.DOOR: return createDoor();
			case CabinPackage.SIMULATION_PROPERTIES: return createSimulationProperties();
			case CabinPackage.LUGGAGE_PROPERTIES: return createLuggageProperties();
			case CabinPackage.SIMULATION_RESULT: return createSimulationResult();
			case CabinPackage.PASSENGER_PROPERTIES: return createPassengerProperties();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the object
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
			case CabinPackage.TRAVEL_OPTION:
				return createTravelOptionFromString(eDataType, initialValue);
			case CabinPackage.OBJECT_OPTION:
				return createObjectOptionFromString(eDataType, initialValue);
			case CabinPackage.DOOR_OPTION:
				return createDoorOptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
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
			case CabinPackage.TRAVEL_OPTION:
				return convertTravelOptionToString(eDataType, instanceValue);
			case CabinPackage.OBJECT_OPTION:
				return convertObjectOptionToString(eDataType, instanceValue);
			case CabinPackage.DOOR_OPTION:
				return convertDoorOptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin
	 * @generated 
	 */
	public Cabin createCabin() {
		CabinImpl cabin = new CabinImpl();
		return cabin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the row
	 * @generated 
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class
	 * @generated 
	 */
	public TravelClass createTravelClass() {
		TravelClassImpl travelClass = new TravelClassImpl();
		return travelClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat
	 * @generated 
	 */
	public Seat createSeat() {
		SeatImpl seat = new SeatImpl();
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger
	 * @generated 
	 */
	public Passenger createPassenger() {
		PassengerImpl passenger = new PassengerImpl();
		return passenger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the crew member
	 * @generated 
	 */
	public CrewMember createCrewMember() {
		CrewMemberImpl crewMember = new CrewMemberImpl();
		return crewMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the lavatory
	 * @generated 
	 */
	public Lavatory createLavatory() {
		LavatoryImpl lavatory = new LavatoryImpl();
		return lavatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the galley
	 * @generated 
	 */
	public Galley createGalley() {
		GalleyImpl galley = new GalleyImpl();
		return galley;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the stairway
	 * @generated 
	 */
	public Stairway createStairway() {
		StairwayImpl stairway = new StairwayImpl();
		return stairway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the curtain
	 * @generated 
	 */
	public Curtain createCurtain() {
		CurtainImpl curtain = new CurtainImpl();
		return curtain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the stowage
	 * @generated 
	 */
	public Stowage createStowage() {
		StowageImpl stowage = new StowageImpl();
		return stowage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door
	 * @generated 
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties
	 * @generated 
	 */
	public SimulationProperties createSimulationProperties() {
		SimulationPropertiesImpl simulationProperties = new SimulationPropertiesImpl();
		return simulationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties
	 * @generated 
	 */
	public LuggageProperties createLuggageProperties() {
		LuggagePropertiesImpl luggageProperties = new LuggagePropertiesImpl();
		return luggageProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result
	 * @generated 
	 */
	public SimulationResult createSimulationResult() {
		SimulationResultImpl simulationResult = new SimulationResultImpl();
		return simulationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties
	 * @generated 
	 */
	public PassengerProperties createPassengerProperties() {
		PassengerPropertiesImpl passengerProperties = new PassengerPropertiesImpl();
		return passengerProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the stairway direction
	 * @generated 
	 */
	public StairwayDirection createStairwayDirectionFromString(EDataType eDataType, String initialValue) {
		StairwayDirection result = StairwayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertStairwayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the aircraft type
	 * @generated 
	 */
	public AircraftType createAircraftTypeFromString(EDataType eDataType, String initialValue) {
		AircraftType result = AircraftType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertAircraftTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the passenger mood
	 * @generated 
	 */
	public PassengerMood createPassengerMoodFromString(EDataType eDataType, String initialValue) {
		PassengerMood result = PassengerMood.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertPassengerMoodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the luggage size
	 * @generated 
	 */
	public LuggageSize createLuggageSizeFromString(EDataType eDataType, String initialValue) {
		LuggageSize result = LuggageSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertLuggageSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the sorting style
	 * @generated 
	 */
	public SortingStyle createSortingStyleFromString(EDataType eDataType, String initialValue) {
		SortingStyle result = SortingStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertSortingStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the travel option
	 * @generated 
	 */
	public TravelOption createTravelOptionFromString(EDataType eDataType, String initialValue) {
		TravelOption result = TravelOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertTravelOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the object option
	 * @generated 
	 */
	public ObjectOption createObjectOptionFromString(EDataType eDataType, String initialValue) {
		ObjectOption result = ObjectOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertObjectOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the door option
	 * @generated 
	 */
	public DoorOption createDoorOptionFromString(EDataType eDataType, String initialValue) {
		DoorOption result = DoorOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertDoorOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param initialValue the initial value
	 * @return the sex
	 * @generated 
	 */
	public Sex createSexFromString(EDataType eDataType, String initialValue) {
		Sex result = Sex.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param eDataType the e data type
	 * @param instanceValue the instance value
	 * @return the string
	 * @generated 
	 */
	public String convertSexToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin package
	 * @generated 
	 */
	public CabinPackage getCabinPackage() {
		return (CabinPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the package
	 * @deprecated 
	 * @generated 
	 */
	@Deprecated
	public static CabinPackage getPackage() {
		return CabinPackage.eINSTANCE;
	}

} //CabinFactoryImpl
