/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.cabin.AircraftType;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.CabinViewSettings;
import net.bhl.cdt.model.cabin.CrewMember;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.EmergencyExit;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.MainDoor;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.PhysicalObject;
import net.bhl.cdt.model.cabin.PremiumEconomyClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;
import net.bhl.cdt.model.cabin.StandardDoor;
import net.bhl.cdt.model.cabin.Stowage;
import net.bhl.cdt.model.cabin.TravelClass;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CabinPackageImpl extends EPackageImpl implements CabinPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travelClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass economyClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass premiumEconomyClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crewMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lavatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galleyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stairwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curtainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stowageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cabinViewSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainDoorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emergencyExitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDoorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stairwayDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aircraftTypeEEnum = null;

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
	private EEnum sexEEnum = null;

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CabinPackageImpl() {
		super(eNS_URI, CabinFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CabinPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CabinPackage init() {
		if (isInited) return (CabinPackage)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI);

		// Obtain or create and register package
		CabinPackageImpl theCabinPackage = (CabinPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CabinPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CabinPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCabinPackage.createPackageContents();

		// Initialize created meta-data
		theCabinPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCabinPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CabinPackage.eNS_URI, theCabinPackage);
		return theCabinPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCabin() {
		return cabinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_CabinLength() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_CabinWidth() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Doors() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Lavatories() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Galleys() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stairways() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Curtains() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stowages() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_Scale() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_FramesPerSecond() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Passengers() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_NumberOfDecks() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_BoardingTime() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_AircraftType() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_UsePresetSettings() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SpeedFactor() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Classes() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_RowNonexistent() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_AisleWidth() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Seats() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_RowNumber() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_OffsetInRow() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelClass() {
		return travelClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelClass_Rows() {
		return (EReference)travelClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_Sequence() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_Passengers() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_AvailableSeats() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_SeatPitch() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_SeatLength() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_SeatWidth() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_Name() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_RowStructure() {
		return (EAttribute)travelClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessClass() {
		return businessClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstClass() {
		return firstClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEconomyClass() {
		return economyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiumEconomyClass() {
		return premiumEconomyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoor() {
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_YPosition() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_OnBothSides() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Width() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Id() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeat() {
		return seatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_SeatBlocked() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_CrewSeat() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Letter() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeat_TravelClass() {
		return (EReference)seatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassenger() {
		return passengerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Id() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Sex() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Seat() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Name() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_BoardingTime() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_SeatRef() {
		return (EReference)passengerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Width() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Depth() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_OrientationInDegree() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PositionX() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PositionY() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_IsSeated() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WalkingSpeed() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_StartBoardingAfterDelay() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfWaits() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_HasLuggage() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_LuggageStowTime() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_TravelClass() {
		return (EReference)passengerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PassengerMood() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Height() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Age() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Weight() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_Door() {
		return (EReference)passengerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrewMember() {
		return crewMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrewMember_Id() {
		return (EAttribute)crewMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrewMember_Seat() {
		return (EReference)crewMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLavatory() {
		return lavatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGalley() {
		return galleyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStairway() {
		return stairwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStairway_Direction() {
		return (EAttribute)stairwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurtain() {
		return curtainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_PostitionAfterRow() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_CurtainOpen() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStowage() {
		return stowageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCabinViewSettings() {
		return cabinViewSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowSeatlabels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowRowLabels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowGalleyAndLavatoryLabels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowCurtains() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowSeats() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowGalleys() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowLavatories() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowDoors() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_ShowOccupiedSeats() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_SizeOfPassengerCircle() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_DoorOffSetInPixels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_XZeroInPixels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_YZeroInPixels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabinViewSettings_CabinWidthInPixels() {
		return (EAttribute)cabinViewSettingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainDoor() {
		return mainDoorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergencyExit() {
		return emergencyExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDoor() {
		return standardDoorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalObject() {
		return physicalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_XPosition() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_YPosition() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_XDimension() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_YDimension() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_Name() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_Id() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStairwayDirection() {
		return stairwayDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAircraftType() {
		return aircraftTypeEEnum;
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
	public EEnum getSex() {
		return sexEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabinFactory getCabinFactory() {
		return (CabinFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cabinEClass = createEClass(CABIN);
		createEAttribute(cabinEClass, CABIN__CABIN_LENGTH);
		createEAttribute(cabinEClass, CABIN__CABIN_WIDTH);
		createEAttribute(cabinEClass, CABIN__ROW_NONEXISTENT);
		createEAttribute(cabinEClass, CABIN__AISLE_WIDTH);
		createEAttribute(cabinEClass, CABIN__FRAMES_PER_SECOND);
		createEAttribute(cabinEClass, CABIN__NUMBER_OF_DECKS);
		createEReference(cabinEClass, CABIN__CLASSES);
		createEReference(cabinEClass, CABIN__DOORS);
		createEReference(cabinEClass, CABIN__LAVATORIES);
		createEReference(cabinEClass, CABIN__GALLEYS);
		createEReference(cabinEClass, CABIN__STAIRWAYS);
		createEReference(cabinEClass, CABIN__CURTAINS);
		createEReference(cabinEClass, CABIN__STOWAGES);
		createEReference(cabinEClass, CABIN__PASSENGERS);
		createEAttribute(cabinEClass, CABIN__SCALE);
		createEAttribute(cabinEClass, CABIN__BOARDING_TIME);
		createEAttribute(cabinEClass, CABIN__AIRCRAFT_TYPE);
		createEAttribute(cabinEClass, CABIN__USE_PRESET_SETTINGS);
		createEAttribute(cabinEClass, CABIN__SPEED_FACTOR);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__SEATS);
		createEAttribute(rowEClass, ROW__ROW_NUMBER);
		createEAttribute(rowEClass, ROW__OFFSET_IN_ROW);

		travelClassEClass = createEClass(TRAVEL_CLASS);
		createEReference(travelClassEClass, TRAVEL_CLASS__ROWS);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__SEQUENCE);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__PASSENGERS);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__AVAILABLE_SEATS);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__SEAT_PITCH);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__SEAT_LENGTH);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__SEAT_WIDTH);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__NAME);
		createEAttribute(travelClassEClass, TRAVEL_CLASS__ROW_STRUCTURE);

		businessClassEClass = createEClass(BUSINESS_CLASS);

		firstClassEClass = createEClass(FIRST_CLASS);

		economyClassEClass = createEClass(ECONOMY_CLASS);

		premiumEconomyClassEClass = createEClass(PREMIUM_ECONOMY_CLASS);

		seatEClass = createEClass(SEAT);
		createEAttribute(seatEClass, SEAT__SEAT_BLOCKED);
		createEAttribute(seatEClass, SEAT__CREW_SEAT);
		createEAttribute(seatEClass, SEAT__LETTER);
		createEReference(seatEClass, SEAT__TRAVEL_CLASS);

		passengerEClass = createEClass(PASSENGER);
		createEAttribute(passengerEClass, PASSENGER__ID);
		createEAttribute(passengerEClass, PASSENGER__SEX);
		createEAttribute(passengerEClass, PASSENGER__HEIGHT);
		createEAttribute(passengerEClass, PASSENGER__AGE);
		createEAttribute(passengerEClass, PASSENGER__WEIGHT);
		createEReference(passengerEClass, PASSENGER__DOOR);
		createEAttribute(passengerEClass, PASSENGER__SEAT);
		createEAttribute(passengerEClass, PASSENGER__NAME);
		createEAttribute(passengerEClass, PASSENGER__BOARDING_TIME);
		createEReference(passengerEClass, PASSENGER__SEAT_REF);
		createEAttribute(passengerEClass, PASSENGER__WIDTH);
		createEAttribute(passengerEClass, PASSENGER__DEPTH);
		createEAttribute(passengerEClass, PASSENGER__ORIENTATION_IN_DEGREE);
		createEAttribute(passengerEClass, PASSENGER__POSITION_X);
		createEAttribute(passengerEClass, PASSENGER__POSITION_Y);
		createEAttribute(passengerEClass, PASSENGER__IS_SEATED);
		createEAttribute(passengerEClass, PASSENGER__WALKING_SPEED);
		createEAttribute(passengerEClass, PASSENGER__START_BOARDING_AFTER_DELAY);
		createEAttribute(passengerEClass, PASSENGER__NUMBER_OF_WAITS);
		createEAttribute(passengerEClass, PASSENGER__HAS_LUGGAGE);
		createEAttribute(passengerEClass, PASSENGER__LUGGAGE_STOW_TIME);
		createEReference(passengerEClass, PASSENGER__TRAVEL_CLASS);
		createEAttribute(passengerEClass, PASSENGER__PASSENGER_MOOD);

		crewMemberEClass = createEClass(CREW_MEMBER);
		createEAttribute(crewMemberEClass, CREW_MEMBER__ID);
		createEReference(crewMemberEClass, CREW_MEMBER__SEAT);

		physicalObjectEClass = createEClass(PHYSICAL_OBJECT);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__XPOSITION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__YPOSITION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__XDIMENSION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__YDIMENSION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__NAME);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__ID);

		lavatoryEClass = createEClass(LAVATORY);

		galleyEClass = createEClass(GALLEY);

		stairwayEClass = createEClass(STAIRWAY);
		createEAttribute(stairwayEClass, STAIRWAY__DIRECTION);

		curtainEClass = createEClass(CURTAIN);
		createEAttribute(curtainEClass, CURTAIN__POSTITION_AFTER_ROW);
		createEAttribute(curtainEClass, CURTAIN__CURTAIN_OPEN);

		stowageEClass = createEClass(STOWAGE);

		doorEClass = createEClass(DOOR);
		createEAttribute(doorEClass, DOOR__YPOSITION);
		createEAttribute(doorEClass, DOOR__ON_BOTH_SIDES);
		createEAttribute(doorEClass, DOOR__WIDTH);
		createEAttribute(doorEClass, DOOR__ID);

		mainDoorEClass = createEClass(MAIN_DOOR);

		emergencyExitEClass = createEClass(EMERGENCY_EXIT);

		standardDoorEClass = createEClass(STANDARD_DOOR);

		cabinViewSettingsEClass = createEClass(CABIN_VIEW_SETTINGS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_SEATLABELS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_CURTAINS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_SEATS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_GALLEYS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_LAVATORIES);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_DOORS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS);
		createEAttribute(cabinViewSettingsEClass, CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS);

		// Create enums
		sexEEnum = createEEnum(SEX);
		stairwayDirectionEEnum = createEEnum(STAIRWAY_DIRECTION);
		aircraftTypeEEnum = createEEnum(AIRCRAFT_TYPE);
		passengerMoodEEnum = createEEnum(PASSENGER_MOOD);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cabinEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		businessClassEClass.getESuperTypes().add(this.getTravelClass());
		firstClassEClass.getESuperTypes().add(this.getTravelClass());
		economyClassEClass.getESuperTypes().add(this.getTravelClass());
		premiumEconomyClassEClass.getESuperTypes().add(this.getTravelClass());
		seatEClass.getESuperTypes().add(this.getPhysicalObject());
		lavatoryEClass.getESuperTypes().add(this.getPhysicalObject());
		galleyEClass.getESuperTypes().add(this.getPhysicalObject());
		stairwayEClass.getESuperTypes().add(this.getPhysicalObject());
		curtainEClass.getESuperTypes().add(this.getPhysicalObject());
		stowageEClass.getESuperTypes().add(this.getPhysicalObject());
		mainDoorEClass.getESuperTypes().add(this.getDoor());
		emergencyExitEClass.getESuperTypes().add(this.getDoor());
		standardDoorEClass.getESuperTypes().add(this.getDoor());

		// Initialize classes, features, and operations; add parameters
		initEClass(cabinEClass, Cabin.class, "Cabin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabin_CabinLength(), ecorePackage.getEInt(), "cabinLength", "2412", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_CabinWidth(), ecorePackage.getEInt(), "cabinWidth", "364", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_RowNonexistent(), ecorePackage.getEInt(), "rowNonexistent", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_AisleWidth(), ecorePackage.getEInt(), "aisleWidth", "64", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_FramesPerSecond(), ecorePackage.getEInt(), "framesPerSecond", "5", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_NumberOfDecks(), ecorePackage.getEInt(), "numberOfDecks", "1", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Classes(), this.getTravelClass(), null, "classes", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Doors(), this.getDoor(), null, "doors", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Lavatories(), this.getLavatory(), null, "lavatories", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Galleys(), this.getGalley(), null, "galleys", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Stairways(), this.getStairway(), null, "stairways", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Curtains(), this.getCurtain(), null, "curtains", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Stowages(), this.getStowage(), null, "stowages", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Passengers(), this.getPassenger(), null, "passengers", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_Scale(), ecorePackage.getEInt(), "scale", "10", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_BoardingTime(), ecorePackage.getEInt(), "boardingTime", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_AircraftType(), this.getAircraftType(), "aircraftType", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_UsePresetSettings(), ecorePackage.getEBoolean(), "usePresetSettings", "false", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SpeedFactor(), ecorePackage.getEInt(), "speedFactor", "1", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Seats(), this.getSeat(), null, "seats", null, 1, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_RowNumber(), ecorePackage.getEInt(), "rowNumber", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_OffsetInRow(), ecorePackage.getEBoolean(), "offsetInRow", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travelClassEClass, TravelClass.class, "TravelClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTravelClass_Rows(), this.getRow(), null, "rows", null, 2, -1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_Sequence(), ecorePackage.getEInt(), "sequence", null, 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_Passengers(), ecorePackage.getEInt(), "passengers", "0", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_AvailableSeats(), ecorePackage.getEInt(), "availableSeats", "0", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_SeatPitch(), ecorePackage.getEInt(), "seatPitch", "0", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_SeatLength(), ecorePackage.getEInt(), "seatLength", "0", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_SeatWidth(), ecorePackage.getEInt(), "seatWidth", "0", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_Name(), ecorePackage.getEString(), "name", "Placeholder String", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTravelClass_RowStructure(), ecorePackage.getEString(), "rowStructure", "3-3", 0, 1, TravelClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessClassEClass, BusinessClass.class, "BusinessClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firstClassEClass, FirstClass.class, "FirstClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(economyClassEClass, EconomyClass.class, "EconomyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(premiumEconomyClassEClass, PremiumEconomyClass.class, "PremiumEconomyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seatEClass, Seat.class, "Seat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeat_SeatBlocked(), ecorePackage.getEBoolean(), "seatBlocked", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_CrewSeat(), ecorePackage.getEBoolean(), "crewSeat", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Letter(), ecorePackage.getEString(), "letter", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeat_TravelClass(), this.getTravelClass(), null, "travelClass", null, 1, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerEClass, Passenger.class, "Passenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassenger_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Sex(), this.getSex(), "sex", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_Door(), this.getDoor(), null, "door", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Seat(), ecorePackage.getEInt(), "seat", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Name(), ecorePackage.getEString(), "Name", "Mr. Placeholder", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_BoardingTime(), ecorePackage.getEInt(), "boardingTime", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_SeatRef(), this.getSeat(), null, "seatRef", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_OrientationInDegree(), ecorePackage.getEDouble(), "orientationInDegree", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PositionX(), ecorePackage.getEDouble(), "positionX", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PositionY(), ecorePackage.getEDouble(), "positionY", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_IsSeated(), ecorePackage.getEBoolean(), "isSeated", "false", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_WalkingSpeed(), ecorePackage.getEDouble(), "walkingSpeed", "2.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_StartBoardingAfterDelay(), ecorePackage.getEDouble(), "startBoardingAfterDelay", "1.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_NumberOfWaits(), ecorePackage.getEInt(), "numberOfWaits", "0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_HasLuggage(), ecorePackage.getEBoolean(), "hasLuggage", "false", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_LuggageStowTime(), ecorePackage.getEDouble(), "luggageStowTime", "1.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_TravelClass(), this.getTravelClass(), null, "travelClass", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PassengerMood(), this.getPassengerMood(), "passengerMood", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crewMemberEClass, CrewMember.class, "CrewMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrewMember_Id(), ecorePackage.getEInt(), "id", null, 0, 1, CrewMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrewMember_Seat(), this.getSeat(), null, "seat", null, 0, 1, CrewMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalObjectEClass, PhysicalObject.class, "PhysicalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalObject_XPosition(), ecorePackage.getEInt(), "xPosition", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_YPosition(), ecorePackage.getEInt(), "yPosition", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_XDimension(), ecorePackage.getEInt(), "xDimension", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_YDimension(), ecorePackage.getEInt(), "yDimension", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_Id(), ecorePackage.getEInt(), "id", "0", 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lavatoryEClass, Lavatory.class, "Lavatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(galleyEClass, Galley.class, "Galley", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stairwayEClass, Stairway.class, "Stairway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStairway_Direction(), this.getStairwayDirection(), "direction", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curtainEClass, Curtain.class, "Curtain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurtain_PostitionAfterRow(), ecorePackage.getEInt(), "postitionAfterRow", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_CurtainOpen(), ecorePackage.getEBoolean(), "curtainOpen", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stowageEClass, Stowage.class, "Stowage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoor_YPosition(), ecorePackage.getEInt(), "yPosition", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_OnBothSides(), ecorePackage.getEBoolean(), "onBothSides", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainDoorEClass, MainDoor.class, "MainDoor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emergencyExitEClass, EmergencyExit.class, "EmergencyExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardDoorEClass, StandardDoor.class, "StandardDoor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cabinViewSettingsEClass, CabinViewSettings.class, "CabinViewSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabinViewSettings_ShowSeatlabels(), ecorePackage.getEBoolean(), "showSeatlabels", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowRowLabels(), ecorePackage.getEBoolean(), "showRowLabels", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowGalleyAndLavatoryLabels(), ecorePackage.getEBoolean(), "showGalleyAndLavatoryLabels", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowCurtains(), ecorePackage.getEBoolean(), "showCurtains", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowSeats(), ecorePackage.getEBoolean(), "showSeats", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowGalleys(), ecorePackage.getEBoolean(), "showGalleys", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowLavatories(), ecorePackage.getEBoolean(), "showLavatories", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowDoors(), ecorePackage.getEBoolean(), "showDoors", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_ShowOccupiedSeats(), ecorePackage.getEBoolean(), "showOccupiedSeats", "true", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_SizeOfPassengerCircle(), ecorePackage.getEDouble(), "sizeOfPassengerCircle", "0.75", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_DoorOffSetInPixels(), ecorePackage.getEInt(), "doorOffSetInPixels", "2", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_XZeroInPixels(), ecorePackage.getEInt(), "xZeroInPixels", "138", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_YZeroInPixels(), ecorePackage.getEInt(), "yZeroInPixels", "90", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabinViewSettings_CabinWidthInPixels(), ecorePackage.getEInt(), "cabinWidthInPixels", "96", 0, 1, CabinViewSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sexEEnum, Sex.class, "Sex");
		addEEnumLiteral(sexEEnum, Sex.MALE);
		addEEnumLiteral(sexEEnum, Sex.FEMALE);

		initEEnum(stairwayDirectionEEnum, StairwayDirection.class, "StairwayDirection");
		addEEnumLiteral(stairwayDirectionEEnum, StairwayDirection.UP);
		addEEnumLiteral(stairwayDirectionEEnum, StairwayDirection.DOWN);

		initEEnum(aircraftTypeEEnum, AircraftType.class, "AircraftType");
		addEEnumLiteral(aircraftTypeEEnum, AircraftType.REGIONAL);
		addEEnumLiteral(aircraftTypeEEnum, AircraftType.CONTINENTAL);
		addEEnumLiteral(aircraftTypeEEnum, AircraftType.INTERCONTINENTAL);

		initEEnum(passengerMoodEEnum, PassengerMood.class, "PassengerMood");
		addEEnumLiteral(passengerMoodEEnum, PassengerMood.AGRESSIVE);
		addEEnumLiteral(passengerMoodEEnum, PassengerMood.PASSIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //CabinPackageImpl
