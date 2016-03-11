/**
 */
package net.bhl.cdt.paxelerate.model.util;

import java.util.Map;
import net.bhl.cdt.paxelerate.model.*;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import net.bhl.cdt.paxelerate.model.AircraftType;
import net.bhl.cdt.paxelerate.model.BusinessClass;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.CrewMember;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.EconomyClass;
import net.bhl.cdt.paxelerate.model.EmergencyExit;
import net.bhl.cdt.paxelerate.model.FirstClass;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.LuggageSize;
import net.bhl.cdt.paxelerate.model.MainDoor;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerMood;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.PremiumEconomyClass;
import net.bhl.cdt.paxelerate.model.Row;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.SimulationResult;
import net.bhl.cdt.paxelerate.model.SortingStyle;
import net.bhl.cdt.paxelerate.model.Stairway;
import net.bhl.cdt.paxelerate.model.StairwayDirection;
import net.bhl.cdt.paxelerate.model.StandardDoor;
import net.bhl.cdt.paxelerate.model.Stowage;
import net.bhl.cdt.paxelerate.model.TravelClass;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage
 * @generated
 */
public class CabinValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CabinValidator INSTANCE = new CabinValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.bhl.cdt.paxelerate.model";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Too Many Passengers' of 'Travel Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRAVEL_CLASS__TOO_MANY_PASSENGERS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Wrong Row Structure' of 'Travel Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRAVEL_CLASS__WRONG_ROW_STRUCTURE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Out Of Bounds' of 'Physical Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_OBJECT__OUT_OF_BOUNDS = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabinValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CabinPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CabinPackage.CABIN:
				return validateCabin((Cabin)value, diagnostics, context);
			case CabinPackage.ROW:
				return validateRow((Row)value, diagnostics, context);
			case CabinPackage.TRAVEL_CLASS:
				return validateTravelClass((TravelClass)value, diagnostics, context);
			case CabinPackage.BUSINESS_CLASS:
				return validateBusinessClass((BusinessClass)value, diagnostics, context);
			case CabinPackage.FIRST_CLASS:
				return validateFirstClass((FirstClass)value, diagnostics, context);
			case CabinPackage.ECONOMY_CLASS:
				return validateEconomyClass((EconomyClass)value, diagnostics, context);
			case CabinPackage.PREMIUM_ECONOMY_CLASS:
				return validatePremiumEconomyClass((PremiumEconomyClass)value, diagnostics, context);
			case CabinPackage.SEAT:
				return validateSeat((Seat)value, diagnostics, context);
			case CabinPackage.PASSENGER:
				return validatePassenger((Passenger)value, diagnostics, context);
			case CabinPackage.CREW_MEMBER:
				return validateCrewMember((CrewMember)value, diagnostics, context);
			case CabinPackage.PHYSICAL_OBJECT:
				return validatePhysicalObject((PhysicalObject)value, diagnostics, context);
			case CabinPackage.LAVATORY:
				return validateLavatory((Lavatory)value, diagnostics, context);
			case CabinPackage.GALLEY:
				return validateGalley((Galley)value, diagnostics, context);
			case CabinPackage.STAIRWAY:
				return validateStairway((Stairway)value, diagnostics, context);
			case CabinPackage.CURTAIN:
				return validateCurtain((Curtain)value, diagnostics, context);
			case CabinPackage.STOWAGE:
				return validateStowage((Stowage)value, diagnostics, context);
			case CabinPackage.DOOR:
				return validateDoor((Door)value, diagnostics, context);
			case CabinPackage.MAIN_DOOR:
				return validateMainDoor((MainDoor)value, diagnostics, context);
			case CabinPackage.EMERGENCY_EXIT:
				return validateEmergencyExit((EmergencyExit)value, diagnostics, context);
			case CabinPackage.STANDARD_DOOR:
				return validateStandardDoor((StandardDoor)value, diagnostics, context);
			case CabinPackage.SIMULATION_PROPERTIES:
				return validateSimulationProperties((SimulationProperties)value, diagnostics, context);
			case CabinPackage.LUGGAGE_PROPERTIES:
				return validateLuggageProperties((LuggageProperties)value, diagnostics, context);
			case CabinPackage.SIMULATION_RESULT:
				return validateSimulationResult((SimulationResult)value, diagnostics, context);
			case CabinPackage.PASSENGER_PROPERTIES:
				return validatePassengerProperties((PassengerProperties)value, diagnostics, context);
			case CabinPackage.SEX:
				return validateSex((Sex)value, diagnostics, context);
			case CabinPackage.STAIRWAY_DIRECTION:
				return validateStairwayDirection((StairwayDirection)value, diagnostics, context);
			case CabinPackage.AIRCRAFT_TYPE:
				return validateAircraftType((AircraftType)value, diagnostics, context);
			case CabinPackage.PASSENGER_MOOD:
				return validatePassengerMood((PassengerMood)value, diagnostics, context);
			case CabinPackage.LUGGAGE_SIZE:
				return validateLuggageSize((LuggageSize)value, diagnostics, context);
			case CabinPackage.SORTING_STYLE:
				return validateSortingStyle((SortingStyle)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabin(Cabin cabin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRow(Row row, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(row, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelClass(TravelClass travelClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(travelClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_tooManyPassengers(travelClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_wrongRowStructure(travelClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tooManyPassengers constraint of '<em>Travel Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelClass_tooManyPassengers(TravelClass travelClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return travelClass.tooManyPassengers(diagnostics, context);
	}

	/**
	 * Validates the wrongRowStructure constraint of '<em>Travel Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTravelClass_wrongRowStructure(TravelClass travelClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return travelClass.wrongRowStructure(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessClass(BusinessClass businessClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(businessClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_tooManyPassengers(businessClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_wrongRowStructure(businessClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirstClass(FirstClass firstClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(firstClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_tooManyPassengers(firstClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_wrongRowStructure(firstClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEconomyClass(EconomyClass economyClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(economyClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_tooManyPassengers(economyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_wrongRowStructure(economyClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePremiumEconomyClass(PremiumEconomyClass premiumEconomyClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(premiumEconomyClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_tooManyPassengers(premiumEconomyClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateTravelClass_wrongRowStructure(premiumEconomyClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(seat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(seat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassenger(Passenger passenger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passenger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrewMember(CrewMember crewMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crewMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalObject(PhysicalObject physicalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(physicalObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the outOfBounds constraint of '<em>Physical Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalObject_outOfBounds(PhysicalObject physicalObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalObject.outOfBounds(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLavatory(Lavatory lavatory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lavatory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lavatory, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(lavatory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalley(Galley galley, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(galley, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(galley, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(galley, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStairway(Stairway stairway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stairway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stairway, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(stairway, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurtain(Curtain curtain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(curtain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(curtain, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(curtain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStowage(Stowage stowage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stowage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stowage, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalObject_outOfBounds(stowage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoor(Door door, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(door, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMainDoor(MainDoor mainDoor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mainDoor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmergencyExit(EmergencyExit emergencyExit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emergencyExit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardDoor(StandardDoor standardDoor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardDoor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulationProperties(SimulationProperties simulationProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simulationProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageProperties(LuggageProperties luggageProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(luggageProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimulationResult(SimulationResult simulationResult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simulationResult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerProperties(PassengerProperties passengerProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passengerProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSex(Sex sex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStairwayDirection(StairwayDirection stairwayDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAircraftType(AircraftType aircraftType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassengerMood(PassengerMood passengerMood, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggageSize(LuggageSize luggageSize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortingStyle(SortingStyle sortingStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CabinValidator
