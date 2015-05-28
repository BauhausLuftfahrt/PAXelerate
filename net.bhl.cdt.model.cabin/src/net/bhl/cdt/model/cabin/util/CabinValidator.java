/**
 */
package net.bhl.cdt.model.cabin.util;

import java.util.Map;

import net.bhl.cdt.model.cabin.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.cabin.CabinPackage
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
	public static final String DIAGNOSTIC_SOURCE = "net.bhl.cdt.model.cabin";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cabin Too Short' of 'Cabin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CABIN__CABIN_TOO_SHORT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cabin Too Narrow' of 'Cabin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CABIN__CABIN_TOO_NARROW = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Too Many Passengers' of 'Travel Class'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRAVEL_CLASS__TOO_MANY_PASSENGERS = 3;

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
			case CabinPackage.CABIN_VIEW_SETTINGS:
				return validateCabinViewSettings((CabinViewSettings)value, diagnostics, context);
			case CabinPackage.SEX:
				return validateSex((Sex)value, diagnostics, context);
			case CabinPackage.STAIRWAY_DIRECTION:
				return validateStairwayDirection((StairwayDirection)value, diagnostics, context);
			case CabinPackage.AIRCRAFT_TYPE:
				return validateAircraftType((AircraftType)value, diagnostics, context);
			case CabinPackage.PASSENGER_MOOD:
				return validatePassengerMood((PassengerMood)value, diagnostics, context);
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
		if (!validate_NoCircularContainment(cabin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCabin_cabinTooShort(cabin, diagnostics, context);
		if (result || diagnostics != null) result &= validateCabin_cabinTooNarrow(cabin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cabinTooShort constraint of '<em>Cabin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabin_cabinTooShort(Cabin cabin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cabin.cabinTooShort(diagnostics, context);
	}

	/**
	 * Validates the cabinTooNarrow constraint of '<em>Cabin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCabin_cabinTooNarrow(Cabin cabin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cabin.cabinTooNarrow(diagnostics, context);
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
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(seat, diagnostics, context);
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
		return validate_EveryDefaultConstraint(physicalObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLavatory(Lavatory lavatory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lavatory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGalley(Galley galley, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(galley, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStairway(Stairway stairway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stairway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurtain(Curtain curtain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curtain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStowage(Stowage stowage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stowage, diagnostics, context);
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
	public boolean validateCabinViewSettings(CabinViewSettings cabinViewSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cabinViewSettings, diagnostics, context);
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
