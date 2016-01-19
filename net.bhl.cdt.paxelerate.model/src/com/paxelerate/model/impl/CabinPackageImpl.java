/**
 */
package com.paxelerate.model.impl;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.paxelerate.model.AircraftType;
import com.paxelerate.model.BusinessClass;
import com.paxelerate.model.Cabin;
import com.paxelerate.model.CabinFactory;
import com.paxelerate.model.CabinPackage;
import com.paxelerate.model.CrewMember;
import com.paxelerate.model.Curtain;
import com.paxelerate.model.Door;
import com.paxelerate.model.EconomyClass;
import com.paxelerate.model.EmergencyExit;
import com.paxelerate.model.FirstClass;
import com.paxelerate.model.Galley;
import com.paxelerate.model.Lavatory;
import com.paxelerate.model.LuggageSize;
import com.paxelerate.model.MainDoor;
import com.paxelerate.model.Passenger;
import com.paxelerate.model.PassengerMood;
import com.paxelerate.model.PhysicalObject;
import com.paxelerate.model.PremiumEconomyClass;
import com.paxelerate.model.Row;
import com.paxelerate.model.Seat;
import com.paxelerate.model.Sex;
import com.paxelerate.model.SimulationProperties;
import com.paxelerate.model.SimulationResult;
import com.paxelerate.model.SortingStyle;
import com.paxelerate.model.Stairway;
import com.paxelerate.model.StairwayDirection;
import com.paxelerate.model.StandardDoor;
import com.paxelerate.model.Stowage;
import com.paxelerate.model.TravelClass;
import com.paxelerate.model.util.CabinValidator;

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
	private EClass simulationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationResultEClass = null;

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
	private EEnum luggageSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortingStyleEEnum = null;

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
	 * @see com.paxelerate.model.CabinPackage#eNS_URI
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCabinPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CabinValidator.INSTANCE;
				 }
			 });

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
		return (EReference)cabinEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Lavatories() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Galleys() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stairways() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Curtains() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stowages() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_Scale() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(15);
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
		return (EReference)cabinEClass.getEStructuralFeatures().get(14);
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
	public EReference getCabin_SimulationSettings() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Classes() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(7);
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
	public EOperation getTravelClass__TooManyPassengers__DiagnosticChain_Map() {
		return travelClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTravelClass__WrongRowStructure__DiagnosticChain_Map() {
		return travelClassEClass.getEOperations().get(1);
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
	public EAttribute getDoor_XPosition() {
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
	public EAttribute getDoor_NumberOfSimultaneousPassengers() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_IsActive() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoor_WaitingPassengers() {
		return (EReference)doorEClass.getEStructuralFeatures().get(6);
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
	public EReference getSeat_Row() {
		return (EReference)seatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Occupied() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeat_Passenger() {
		return (EReference)seatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_CurrentlyFolded() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getPassenger_LuggageStowTime() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_TravelClass() {
		return (EReference)passengerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PassengerMood() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfMakeWayOperations() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Luggage() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(23);
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
	public EClass getSimulationProperties() {
		return simulationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_SimulateWithoutUI() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_NumberOfSimulationLoops() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_RandomSortBetweenLoops() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_UseFoldableSeats() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_BringYourOwnSeat() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengersBoardingPerMinute() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWidthMeanMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWidthDeviationMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWeightMeanMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWeightDeviationMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerHeightMeanMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerHeightDeviationMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerDepthMeanMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerDepthDeviationMale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PercentageOfWomen() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerLuggageStowTimeMean() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerLuggageStowTimeDeviation() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWidthMeanFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWidthDeviationFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWeightMeanFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerWeightDeviationFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerHeightMeanFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerHeightDeviationFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerDepthMeanFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengerDepthDeviationFemale() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationProperties_Results() {
		return (EReference)simulationPropertiesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PercentageOfPassengersWithNoLuggage() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PercentageOfPassengersWithSmallLuggage() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PercentageOfPassengersWithMediumLuggage() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PercentageOfPassengersWithBigLuggage() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_Sorting() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_SimulationSpeedFactor() {
		return (EAttribute)simulationPropertiesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationResult() {
		return simulationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_BoardingTime() {
		return (EAttribute)simulationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Passengers() {
		return (EAttribute)simulationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Name() {
		return (EAttribute)simulationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Id() {
		return (EAttribute)simulationResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Date() {
		return (EAttribute)simulationResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_BoardingTimeString() {
		return (EAttribute)simulationResultEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getPhysicalObject_YPosition() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_XPosition() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_YDimension() {
		return (EAttribute)physicalObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_XDimension() {
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
	public EOperation getPhysicalObject__OutOfBounds__DiagnosticChain_Map() {
		return physicalObjectEClass.getEOperations().get(0);
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
	public EEnum getLuggageSize() {
		return luggageSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortingStyle() {
		return sortingStyleEEnum;
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
		createEReference(cabinEClass, CABIN__SIMULATION_SETTINGS);
		createEReference(cabinEClass, CABIN__CLASSES);
		createEReference(cabinEClass, CABIN__DOORS);
		createEReference(cabinEClass, CABIN__LAVATORIES);
		createEReference(cabinEClass, CABIN__GALLEYS);
		createEReference(cabinEClass, CABIN__STAIRWAYS);
		createEReference(cabinEClass, CABIN__CURTAINS);
		createEReference(cabinEClass, CABIN__STOWAGES);
		createEReference(cabinEClass, CABIN__PASSENGERS);
		createEAttribute(cabinEClass, CABIN__SCALE);
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
		createEOperation(travelClassEClass, TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(travelClassEClass, TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP);

		businessClassEClass = createEClass(BUSINESS_CLASS);

		firstClassEClass = createEClass(FIRST_CLASS);

		economyClassEClass = createEClass(ECONOMY_CLASS);

		premiumEconomyClassEClass = createEClass(PREMIUM_ECONOMY_CLASS);

		seatEClass = createEClass(SEAT);
		createEAttribute(seatEClass, SEAT__SEAT_BLOCKED);
		createEAttribute(seatEClass, SEAT__CREW_SEAT);
		createEAttribute(seatEClass, SEAT__LETTER);
		createEReference(seatEClass, SEAT__TRAVEL_CLASS);
		createEReference(seatEClass, SEAT__ROW);
		createEAttribute(seatEClass, SEAT__OCCUPIED);
		createEReference(seatEClass, SEAT__PASSENGER);
		createEAttribute(seatEClass, SEAT__CURRENTLY_FOLDED);

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
		createEAttribute(passengerEClass, PASSENGER__LUGGAGE_STOW_TIME);
		createEReference(passengerEClass, PASSENGER__TRAVEL_CLASS);
		createEAttribute(passengerEClass, PASSENGER__PASSENGER_MOOD);
		createEAttribute(passengerEClass, PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS);
		createEAttribute(passengerEClass, PASSENGER__LUGGAGE);

		crewMemberEClass = createEClass(CREW_MEMBER);
		createEAttribute(crewMemberEClass, CREW_MEMBER__ID);
		createEReference(crewMemberEClass, CREW_MEMBER__SEAT);

		physicalObjectEClass = createEClass(PHYSICAL_OBJECT);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__YPOSITION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__XPOSITION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__YDIMENSION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__XDIMENSION);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__NAME);
		createEAttribute(physicalObjectEClass, PHYSICAL_OBJECT__ID);
		createEOperation(physicalObjectEClass, PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP);

		lavatoryEClass = createEClass(LAVATORY);

		galleyEClass = createEClass(GALLEY);

		stairwayEClass = createEClass(STAIRWAY);
		createEAttribute(stairwayEClass, STAIRWAY__DIRECTION);

		curtainEClass = createEClass(CURTAIN);
		createEAttribute(curtainEClass, CURTAIN__POSTITION_AFTER_ROW);
		createEAttribute(curtainEClass, CURTAIN__CURTAIN_OPEN);

		stowageEClass = createEClass(STOWAGE);

		doorEClass = createEClass(DOOR);
		createEAttribute(doorEClass, DOOR__XPOSITION);
		createEAttribute(doorEClass, DOOR__ON_BOTH_SIDES);
		createEAttribute(doorEClass, DOOR__WIDTH);
		createEAttribute(doorEClass, DOOR__ID);
		createEAttribute(doorEClass, DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS);
		createEAttribute(doorEClass, DOOR__IS_ACTIVE);
		createEReference(doorEClass, DOOR__WAITING_PASSENGERS);

		mainDoorEClass = createEClass(MAIN_DOOR);

		emergencyExitEClass = createEClass(EMERGENCY_EXIT);

		standardDoorEClass = createEClass(STANDARD_DOOR);

		simulationPropertiesEClass = createEClass(SIMULATION_PROPERTIES);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE);
		createEReference(simulationPropertiesEClass, SIMULATION_PROPERTIES__RESULTS);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__SORTING);
		createEAttribute(simulationPropertiesEClass, SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR);

		simulationResultEClass = createEClass(SIMULATION_RESULT);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__BOARDING_TIME);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__PASSENGERS);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__NAME);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__ID);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__DATE);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__BOARDING_TIME_STRING);

		// Create enums
		sexEEnum = createEEnum(SEX);
		stairwayDirectionEEnum = createEEnum(STAIRWAY_DIRECTION);
		aircraftTypeEEnum = createEEnum(AIRCRAFT_TYPE);
		passengerMoodEEnum = createEEnum(PASSENGER_MOOD);
		luggageSizeEEnum = createEEnum(LUGGAGE_SIZE);
		sortingStyleEEnum = createEEnum(SORTING_STYLE);
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
		initEReference(getCabin_SimulationSettings(), this.getSimulationProperties(), null, "simulationSettings", null, 1, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Classes(), this.getTravelClass(), null, "classes", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Doors(), this.getDoor(), null, "doors", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Lavatories(), this.getLavatory(), null, "lavatories", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Galleys(), this.getGalley(), null, "galleys", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Stairways(), this.getStairway(), null, "stairways", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Curtains(), this.getCurtain(), null, "curtains", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Stowages(), this.getStowage(), null, "stowages", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Passengers(), this.getPassenger(), null, "passengers", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_Scale(), ecorePackage.getEInt(), "scale", "10", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_AircraftType(), this.getAircraftType(), "aircraftType", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_UsePresetSettings(), ecorePackage.getEBoolean(), "usePresetSettings", "false", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SpeedFactor(), ecorePackage.getEInt(), "speedFactor", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		EOperation op = initEOperation(getTravelClass__TooManyPassengers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "tooManyPassengers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTravelClass__WrongRowStructure__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "wrongRowStructure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(businessClassEClass, BusinessClass.class, "BusinessClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firstClassEClass, FirstClass.class, "FirstClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(economyClassEClass, EconomyClass.class, "EconomyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(premiumEconomyClassEClass, PremiumEconomyClass.class, "PremiumEconomyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seatEClass, Seat.class, "Seat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeat_SeatBlocked(), ecorePackage.getEBoolean(), "seatBlocked", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_CrewSeat(), ecorePackage.getEBoolean(), "crewSeat", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Letter(), ecorePackage.getEString(), "letter", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeat_TravelClass(), this.getTravelClass(), null, "travelClass", null, 1, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeat_Row(), this.getRow(), null, "row", null, 1, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Occupied(), ecorePackage.getEBoolean(), "occupied", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeat_Passenger(), this.getPassenger(), null, "passenger", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_CurrentlyFolded(), ecorePackage.getEBoolean(), "currentlyFolded", "false", 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getPassenger_LuggageStowTime(), ecorePackage.getEDouble(), "luggageStowTime", "1.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_TravelClass(), this.getTravelClass(), null, "travelClass", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PassengerMood(), this.getPassengerMood(), "passengerMood", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_NumberOfMakeWayOperations(), ecorePackage.getEInt(), "numberOfMakeWayOperations", "0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Luggage(), this.getLuggageSize(), "luggage", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crewMemberEClass, CrewMember.class, "CrewMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrewMember_Id(), ecorePackage.getEInt(), "id", null, 0, 1, CrewMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrewMember_Seat(), this.getSeat(), null, "seat", null, 0, 1, CrewMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalObjectEClass, PhysicalObject.class, "PhysicalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalObject_YPosition(), ecorePackage.getEInt(), "yPosition", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_XPosition(), ecorePackage.getEInt(), "xPosition", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_YDimension(), ecorePackage.getEInt(), "yDimension", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_XDimension(), ecorePackage.getEInt(), "xDimension", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalObject_Id(), ecorePackage.getEInt(), "id", "0", 0, 1, PhysicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPhysicalObject__OutOfBounds__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outOfBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lavatoryEClass, Lavatory.class, "Lavatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(galleyEClass, Galley.class, "Galley", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stairwayEClass, Stairway.class, "Stairway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStairway_Direction(), this.getStairwayDirection(), "direction", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curtainEClass, Curtain.class, "Curtain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurtain_PostitionAfterRow(), ecorePackage.getEInt(), "postitionAfterRow", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_CurtainOpen(), ecorePackage.getEBoolean(), "curtainOpen", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stowageEClass, Stowage.class, "Stowage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoor_XPosition(), ecorePackage.getEInt(), "xPosition", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_OnBothSides(), ecorePackage.getEBoolean(), "onBothSides", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_NumberOfSimultaneousPassengers(), ecorePackage.getEInt(), "numberOfSimultaneousPassengers", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_IsActive(), ecorePackage.getEBoolean(), "isActive", "true", 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoor_WaitingPassengers(), this.getPassenger(), null, "waitingPassengers", null, 0, -1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainDoorEClass, MainDoor.class, "MainDoor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emergencyExitEClass, EmergencyExit.class, "EmergencyExit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardDoorEClass, StandardDoor.class, "StandardDoor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simulationPropertiesEClass, SimulationProperties.class, "SimulationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationProperties_SimulateWithoutUI(), ecorePackage.getEBoolean(), "simulateWithoutUI", "false", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_NumberOfSimulationLoops(), ecorePackage.getEInt(), "numberOfSimulationLoops", "1", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_RandomSortBetweenLoops(), ecorePackage.getEBoolean(), "randomSortBetweenLoops", "true", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_UseFoldableSeats(), ecorePackage.getEBoolean(), "useFoldableSeats", "false", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_BringYourOwnSeat(), ecorePackage.getEBoolean(), "bringYourOwnSeat", "false", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengersBoardingPerMinute(), ecorePackage.getEDouble(), "passengersBoardingPerMinute", "18", 1, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWidthMeanMale(), ecorePackage.getEDouble(), "passengerWidthMeanMale", "47", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWidthDeviationMale(), ecorePackage.getEDouble(), "passengerWidthDeviationMale", "2.8", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWeightMeanMale(), ecorePackage.getEDouble(), "passengerWeightMeanMale", "90", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWeightDeviationMale(), ecorePackage.getEDouble(), "passengerWeightDeviationMale", "20", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerHeightMeanMale(), ecorePackage.getEDouble(), "passengerHeightMeanMale", "177.5", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerHeightDeviationMale(), ecorePackage.getEDouble(), "passengerHeightDeviationMale", "11.1", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerDepthMeanMale(), ecorePackage.getEDouble(), "passengerDepthMeanMale", "30", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerDepthDeviationMale(), ecorePackage.getEDouble(), "passengerDepthDeviationMale", "5", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PercentageOfWomen(), ecorePackage.getEDouble(), "percentageOfWomen", "50", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerLuggageStowTimeMean(), ecorePackage.getEDouble(), "passengerLuggageStowTimeMean", "15", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerLuggageStowTimeDeviation(), ecorePackage.getEDouble(), "passengerLuggageStowTimeDeviation", "7", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWidthMeanFemale(), ecorePackage.getEDouble(), "passengerWidthMeanFemale", "41.4", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWidthDeviationFemale(), ecorePackage.getEDouble(), "passengerWidthDeviationFemale", "2.8", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWeightMeanFemale(), ecorePackage.getEDouble(), "passengerWeightMeanFemale", "60", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerWeightDeviationFemale(), ecorePackage.getEDouble(), "passengerWeightDeviationFemale", "15", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerHeightMeanFemale(), ecorePackage.getEDouble(), "passengerHeightMeanFemale", "164.5", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerHeightDeviationFemale(), ecorePackage.getEDouble(), "passengerHeightDeviationFemale", "11.5", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerDepthMeanFemale(), ecorePackage.getEInt(), "passengerDepthMeanFemale", "27", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PassengerDepthDeviationFemale(), ecorePackage.getEDouble(), "passengerDepthDeviationFemale", "3", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulationProperties_Results(), this.getSimulationResult(), null, "results", null, 0, -1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PercentageOfPassengersWithNoLuggage(), ecorePackage.getEDouble(), "percentageOfPassengersWithNoLuggage", null, 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PercentageOfPassengersWithSmallLuggage(), ecorePackage.getEDouble(), "percentageOfPassengersWithSmallLuggage", null, 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PercentageOfPassengersWithMediumLuggage(), ecorePackage.getEDouble(), "percentageOfPassengersWithMediumLuggage", null, 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_PercentageOfPassengersWithBigLuggage(), ecorePackage.getEDouble(), "percentageOfPassengersWithBigLuggage", null, 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_Sorting(), this.getSortingStyle(), "sorting", null, 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationProperties_SimulationSpeedFactor(), ecorePackage.getEInt(), "simulationSpeedFactor", "10", 0, 1, SimulationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simulationResultEClass, SimulationResult.class, "SimulationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationResult_BoardingTime(), ecorePackage.getEDouble(), "boardingTime", null, 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Passengers(), ecorePackage.getEInt(), "passengers", null, 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Id(), ecorePackage.getEInt(), "id", null, 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Date(), ecorePackage.getEDate(), "date", null, 1, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_BoardingTimeString(), ecorePackage.getEString(), "boardingTimeString", null, 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(luggageSizeEEnum, LuggageSize.class, "LuggageSize");
		addEEnumLiteral(luggageSizeEEnum, LuggageSize.SMALL);
		addEEnumLiteral(luggageSizeEEnum, LuggageSize.MEDIUM);
		addEEnumLiteral(luggageSizeEEnum, LuggageSize.BIG);
		addEEnumLiteral(luggageSizeEEnum, LuggageSize.NONE);

		initEEnum(sortingStyleEEnum, SortingStyle.class, "SortingStyle");
		addEEnumLiteral(sortingStyleEEnum, SortingStyle.RANDOM);
		addEEnumLiteral(sortingStyleEEnum, SortingStyle.WINDOW_TO_AISLE);
		addEEnumLiteral(sortingStyleEEnum, SortingStyle.REAR_TO_FRONT);

		// Create resource
		createResource(eNS_URI);
	}

} //CabinPackageImpl
