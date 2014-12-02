/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.CabinViewSettings;
import net.bhl.cdt.model.cabin.ClassType;
import net.bhl.cdt.model.cabin.CrewMember;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.DoorType;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.StairwayDirection;
import net.bhl.cdt.model.cabin.Stowage;
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
	private EClass passengerClassEClass = null;
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
	private EEnum classTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorTypeEEnum = null;

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
	public EReference getCabin_Classes() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Doors() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Lavatories() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Galleys() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stairways() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Curtains() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stowages() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsInEconomyClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsInPremiumEconomyClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsInBusinessClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsInFirstClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsPerRowInEconomyClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatWidthInEconomy() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatLengthInEconomy() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatPitchInEconomy() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsPerRowInBusinessClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatWidthInBusiness() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatLengthInBusiness() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatPitchInBusiness() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsPerRowInFirstClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatPitchInFirst() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatWidthInFirst() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatLengthInFirst() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatsPerRowInPremiumEconomyClass() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatWidthInPremiumEconomy() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatLengthInPremiumEconomy() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SeatPitchInPremiumEco() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_Scale() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_FramesPerSecond() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Passengers() {
		return (EReference)cabinEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_NumberOfDecks() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_BoardingTime() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_FirstClassPassengers() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_BusinessClassPassengers() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_PremiumEconomyClassPassengers() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_EconomyClassPassengers() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_RowNonexistent() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_AisleWidth() {
		return (EAttribute)cabinEClass.getEStructuralFeatures().get(27);
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
	public EClass getPassengerClass() {
		return passengerClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerClass_Type() {
		return (EAttribute)passengerClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerClass_AvailableSeats() {
		return (EAttribute)passengerClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassengerClass_Rows() {
		return (EReference)passengerClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerClass_Sequence() {
		return (EAttribute)passengerClassEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDoor_DoorType() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_WidthOfMainDoor() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_WidthOfEmergencyExit() {
		return (EAttribute)doorEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getSeat_SeatNumber() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_SeatBlocked() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_CrewSeat() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Width() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Length() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_XPosition() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_YPosition() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Letter() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_SeatId() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPassenger_Class() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_BoardingTime() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_SeatRef() {
		return (EReference)passengerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Width() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Depth() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_OrientationInDegree() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PositionX() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PositionY() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_IsSeated() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WalkingSpeed() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_StartBoardingAfterDelay() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfWaits() {
		return (EAttribute)passengerEClass.getEStructuralFeatures().get(19);
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
	public EAttribute getLavatory_XPosition() {
		return (EAttribute)lavatoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLavatory_YPosition() {
		return (EAttribute)lavatoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLavatory_XDimension() {
		return (EAttribute)lavatoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLavatory_YDimension() {
		return (EAttribute)lavatoryEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getGalley_XPosition() {
		return (EAttribute)galleyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalley_YPosition() {
		return (EAttribute)galleyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalley_XDimension() {
		return (EAttribute)galleyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGalley_YDimension() {
		return (EAttribute)galleyEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getStairway_XDimension() {
		return (EAttribute)stairwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStairway_YDimension() {
		return (EAttribute)stairwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStairway_XPosition() {
		return (EAttribute)stairwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStairway_YPosition() {
		return (EAttribute)stairwayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStairway_Direction() {
		return (EAttribute)stairwayEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getCurtain_XPosition() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_YPosition() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_XDimension() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_YDimension() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_Name() {
		return (EAttribute)curtainEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getStowage_XPosition() {
		return (EAttribute)stowageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStowage_YPosition() {
		return (EAttribute)stowageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStowage_XDimension() {
		return (EAttribute)stowageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStowage_YDimension() {
		return (EAttribute)stowageEClass.getEStructuralFeatures().get(3);
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
	public EEnum getClassType() {
		return classTypeEEnum;
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
	public EEnum getStairwayDirection() {
		return stairwayDirectionEEnum;
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
		createEAttribute(cabinEClass, CABIN__SEATS_IN_FIRST_CLASS);
		createEAttribute(cabinEClass, CABIN__FIRST_CLASS_PASSENGERS);
		createEAttribute(cabinEClass, CABIN__SEATS_PER_ROW_IN_FIRST_CLASS);
		createEAttribute(cabinEClass, CABIN__SEAT_PITCH_IN_FIRST);
		createEAttribute(cabinEClass, CABIN__SEAT_WIDTH_IN_FIRST);
		createEAttribute(cabinEClass, CABIN__SEAT_LENGTH_IN_FIRST);
		createEAttribute(cabinEClass, CABIN__SEATS_IN_BUSINESS_CLASS);
		createEAttribute(cabinEClass, CABIN__BUSINESS_CLASS_PASSENGERS);
		createEAttribute(cabinEClass, CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS);
		createEAttribute(cabinEClass, CABIN__SEAT_WIDTH_IN_BUSINESS);
		createEAttribute(cabinEClass, CABIN__SEAT_LENGTH_IN_BUSINESS);
		createEAttribute(cabinEClass, CABIN__SEAT_PITCH_IN_BUSINESS);
		createEAttribute(cabinEClass, CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS);
		createEAttribute(cabinEClass, CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS);
		createEAttribute(cabinEClass, CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS);
		createEAttribute(cabinEClass, CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY);
		createEAttribute(cabinEClass, CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY);
		createEAttribute(cabinEClass, CABIN__SEAT_PITCH_IN_PREMIUM_ECO);
		createEAttribute(cabinEClass, CABIN__SEATS_IN_ECONOMY_CLASS);
		createEAttribute(cabinEClass, CABIN__ECONOMY_CLASS_PASSENGERS);
		createEAttribute(cabinEClass, CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS);
		createEAttribute(cabinEClass, CABIN__SEAT_WIDTH_IN_ECONOMY);
		createEAttribute(cabinEClass, CABIN__SEAT_LENGTH_IN_ECONOMY);
		createEAttribute(cabinEClass, CABIN__SEAT_PITCH_IN_ECONOMY);
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

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__SEATS);
		createEAttribute(rowEClass, ROW__ROW_NUMBER);
		createEAttribute(rowEClass, ROW__OFFSET_IN_ROW);

		passengerClassEClass = createEClass(PASSENGER_CLASS);
		createEAttribute(passengerClassEClass, PASSENGER_CLASS__TYPE);
		createEAttribute(passengerClassEClass, PASSENGER_CLASS__AVAILABLE_SEATS);
		createEReference(passengerClassEClass, PASSENGER_CLASS__ROWS);
		createEAttribute(passengerClassEClass, PASSENGER_CLASS__SEQUENCE);

		doorEClass = createEClass(DOOR);
		createEAttribute(doorEClass, DOOR__YPOSITION);
		createEAttribute(doorEClass, DOOR__ON_BOTH_SIDES);
		createEAttribute(doorEClass, DOOR__WIDTH);
		createEAttribute(doorEClass, DOOR__ID);
		createEAttribute(doorEClass, DOOR__DOOR_TYPE);
		createEAttribute(doorEClass, DOOR__WIDTH_OF_MAIN_DOOR);
		createEAttribute(doorEClass, DOOR__WIDTH_OF_EMERGENCY_EXIT);

		seatEClass = createEClass(SEAT);
		createEAttribute(seatEClass, SEAT__SEAT_ID);
		createEAttribute(seatEClass, SEAT__SEAT_NUMBER);
		createEAttribute(seatEClass, SEAT__SEAT_BLOCKED);
		createEAttribute(seatEClass, SEAT__CREW_SEAT);
		createEAttribute(seatEClass, SEAT__WIDTH);
		createEAttribute(seatEClass, SEAT__LENGTH);
		createEAttribute(seatEClass, SEAT__XPOSITION);
		createEAttribute(seatEClass, SEAT__YPOSITION);
		createEAttribute(seatEClass, SEAT__LETTER);

		passengerEClass = createEClass(PASSENGER);
		createEAttribute(passengerEClass, PASSENGER__ID);
		createEAttribute(passengerEClass, PASSENGER__SEX);
		createEAttribute(passengerEClass, PASSENGER__HEIGHT);
		createEAttribute(passengerEClass, PASSENGER__AGE);
		createEAttribute(passengerEClass, PASSENGER__WEIGHT);
		createEReference(passengerEClass, PASSENGER__DOOR);
		createEAttribute(passengerEClass, PASSENGER__SEAT);
		createEAttribute(passengerEClass, PASSENGER__NAME);
		createEAttribute(passengerEClass, PASSENGER__CLASS);
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

		crewMemberEClass = createEClass(CREW_MEMBER);
		createEAttribute(crewMemberEClass, CREW_MEMBER__ID);
		createEReference(crewMemberEClass, CREW_MEMBER__SEAT);

		lavatoryEClass = createEClass(LAVATORY);
		createEAttribute(lavatoryEClass, LAVATORY__XPOSITION);
		createEAttribute(lavatoryEClass, LAVATORY__YPOSITION);
		createEAttribute(lavatoryEClass, LAVATORY__XDIMENSION);
		createEAttribute(lavatoryEClass, LAVATORY__YDIMENSION);

		galleyEClass = createEClass(GALLEY);
		createEAttribute(galleyEClass, GALLEY__XPOSITION);
		createEAttribute(galleyEClass, GALLEY__YPOSITION);
		createEAttribute(galleyEClass, GALLEY__XDIMENSION);
		createEAttribute(galleyEClass, GALLEY__YDIMENSION);

		stairwayEClass = createEClass(STAIRWAY);
		createEAttribute(stairwayEClass, STAIRWAY__XDIMENSION);
		createEAttribute(stairwayEClass, STAIRWAY__YDIMENSION);
		createEAttribute(stairwayEClass, STAIRWAY__XPOSITION);
		createEAttribute(stairwayEClass, STAIRWAY__YPOSITION);
		createEAttribute(stairwayEClass, STAIRWAY__DIRECTION);

		curtainEClass = createEClass(CURTAIN);
		createEAttribute(curtainEClass, CURTAIN__POSTITION_AFTER_ROW);
		createEAttribute(curtainEClass, CURTAIN__CURTAIN_OPEN);
		createEAttribute(curtainEClass, CURTAIN__XPOSITION);
		createEAttribute(curtainEClass, CURTAIN__YPOSITION);
		createEAttribute(curtainEClass, CURTAIN__XDIMENSION);
		createEAttribute(curtainEClass, CURTAIN__YDIMENSION);
		createEAttribute(curtainEClass, CURTAIN__NAME);

		stowageEClass = createEClass(STOWAGE);
		createEAttribute(stowageEClass, STOWAGE__XPOSITION);
		createEAttribute(stowageEClass, STOWAGE__YPOSITION);
		createEAttribute(stowageEClass, STOWAGE__XDIMENSION);
		createEAttribute(stowageEClass, STOWAGE__YDIMENSION);

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
		classTypeEEnum = createEEnum(CLASS_TYPE);
		doorTypeEEnum = createEEnum(DOOR_TYPE);
		stairwayDirectionEEnum = createEEnum(STAIRWAY_DIRECTION);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(cabinEClass, Cabin.class, "Cabin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCabin_CabinLength(), ecorePackage.getEDouble(), "cabinLength", "2411.5", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_CabinWidth(), ecorePackage.getEDouble(), "cabinWidth", "364", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsInFirstClass(), ecorePackage.getEInt(), "seatsInFirstClass", "2", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_FirstClassPassengers(), ecorePackage.getEInt(), "firstClassPassengers", "0", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsPerRowInFirstClass(), ecorePackage.getEInt(), "seatsPerRowInFirstClass", "2", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatPitchInFirst(), ecorePackage.getEDouble(), "seatPitchInFirst", "40", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatWidthInFirst(), ecorePackage.getEDouble(), "seatWidthInFirst", "100", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatLengthInFirst(), ecorePackage.getEDouble(), "seatLengthInFirst", "120", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsInBusinessClass(), ecorePackage.getEInt(), "seatsInBusinessClass", "12", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_BusinessClassPassengers(), ecorePackage.getEInt(), "businessClassPassengers", "0", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsPerRowInBusinessClass(), ecorePackage.getEInt(), "seatsPerRowInBusinessClass", "4", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatWidthInBusiness(), ecorePackage.getEDouble(), "seatWidthInBusiness", "72", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatLengthInBusiness(), ecorePackage.getEDouble(), "seatLengthInBusiness", "80", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatPitchInBusiness(), ecorePackage.getEDouble(), "seatPitchInBusiness", "30", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsInPremiumEconomyClass(), ecorePackage.getEInt(), "seatsInPremiumEconomyClass", "12", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_PremiumEconomyClassPassengers(), ecorePackage.getEInt(), "premiumEconomyClassPassengers", "0", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsPerRowInPremiumEconomyClass(), ecorePackage.getEInt(), "seatsPerRowInPremiumEconomyClass", "6", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatWidthInPremiumEconomy(), ecorePackage.getEDouble(), "seatWidthInPremiumEconomy", "50", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatLengthInPremiumEconomy(), ecorePackage.getEDouble(), "seatLengthInPremiumEconomy", "70", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatPitchInPremiumEco(), ecorePackage.getEDouble(), "seatPitchInPremiumEco", "30", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsInEconomyClass(), ecorePackage.getEInt(), "seatsInEconomyClass", "72", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_EconomyClassPassengers(), ecorePackage.getEInt(), "economyClassPassengers", "10", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatsPerRowInEconomyClass(), ecorePackage.getEInt(), "seatsPerRowInEconomyClass", "6", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatWidthInEconomy(), ecorePackage.getEDouble(), "seatWidthInEconomy", "50", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatLengthInEconomy(), ecorePackage.getEDouble(), "seatLengthInEconomy", "60", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_SeatPitchInEconomy(), ecorePackage.getEDouble(), "seatPitchInEconomy", "20", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_RowNonexistent(), ecorePackage.getEInt(), "rowNonexistent", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_AisleWidth(), ecorePackage.getEDouble(), "aisleWidth", "64", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_FramesPerSecond(), ecorePackage.getEInt(), "framesPerSecond", "5", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_NumberOfDecks(), ecorePackage.getEInt(), "numberOfDecks", "1", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Classes(), this.getPassengerClass(), null, "classes", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Doors(), this.getDoor(), null, "doors", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Lavatories(), this.getLavatory(), null, "lavatories", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Galleys(), this.getGalley(), null, "galleys", null, 1, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Stairways(), this.getStairway(), null, "stairways", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Curtains(), this.getCurtain(), null, "curtains", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Stowages(), this.getStowage(), null, "stowages", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCabin_Passengers(), this.getPassenger(), null, "passengers", null, 0, -1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_Scale(), ecorePackage.getEDouble(), "scale", "4", 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCabin_BoardingTime(), ecorePackage.getEDouble(), "boardingTime", null, 0, 1, Cabin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Seats(), this.getSeat(), null, "seats", null, 1, -1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_RowNumber(), ecorePackage.getEInt(), "rowNumber", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_OffsetInRow(), ecorePackage.getEBoolean(), "offsetInRow", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerClassEClass, PassengerClass.class, "PassengerClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerClass_Type(), this.getClassType(), "type", null, 0, 1, PassengerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerClass_AvailableSeats(), ecorePackage.getEInt(), "availableSeats", null, 0, 1, PassengerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassengerClass_Rows(), this.getRow(), null, "rows", null, 2, -1, PassengerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassengerClass_Sequence(), ecorePackage.getEInt(), "sequence", null, 0, 1, PassengerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoor_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_OnBothSides(), ecorePackage.getEBoolean(), "onBothSides", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_DoorType(), this.getDoorType(), "doorType", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_WidthOfMainDoor(), ecorePackage.getEDouble(), "widthOfMainDoor", "80", 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_WidthOfEmergencyExit(), ecorePackage.getEDouble(), "widthOfEmergencyExit", "50", 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seatEClass, Seat.class, "Seat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeat_SeatId(), ecorePackage.getEString(), "seatId", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_SeatNumber(), ecorePackage.getEInt(), "seatNumber", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_SeatBlocked(), ecorePackage.getEBoolean(), "seatBlocked", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_CrewSeat(), ecorePackage.getEBoolean(), "crewSeat", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Letter(), ecorePackage.getEString(), "letter", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerEClass, Passenger.class, "Passenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassenger_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Sex(), this.getSex(), "sex", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_Door(), this.getDoor(), null, "door", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Seat(), ecorePackage.getEInt(), "seat", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Name(), ecorePackage.getEString(), "Name", "Mr. Placeholder", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Class(), this.getClassType(), "class", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_BoardingTime(), ecorePackage.getEDouble(), "boardingTime", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_SeatRef(), this.getSeat(), null, "seatRef", null, 1, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Depth(), ecorePackage.getEDouble(), "depth", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_OrientationInDegree(), ecorePackage.getEDouble(), "orientationInDegree", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PositionX(), ecorePackage.getEDouble(), "positionX", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PositionY(), ecorePackage.getEDouble(), "positionY", null, 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_IsSeated(), ecorePackage.getEBoolean(), "isSeated", "false", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_WalkingSpeed(), ecorePackage.getEDouble(), "walkingSpeed", "2.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_StartBoardingAfterDelay(), ecorePackage.getEDouble(), "startBoardingAfterDelay", "1.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_NumberOfWaits(), ecorePackage.getEInt(), "numberOfWaits", "0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crewMemberEClass, CrewMember.class, "CrewMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrewMember_Id(), ecorePackage.getEInt(), "id", null, 0, 1, CrewMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrewMember_Seat(), this.getSeat(), null, "seat", null, 0, 1, CrewMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lavatoryEClass, Lavatory.class, "Lavatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLavatory_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Lavatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLavatory_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Lavatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLavatory_XDimension(), ecorePackage.getEDouble(), "xDimension", null, 0, 1, Lavatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLavatory_YDimension(), ecorePackage.getEDouble(), "yDimension", null, 0, 1, Lavatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(galleyEClass, Galley.class, "Galley", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGalley_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Galley.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalley_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Galley.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalley_XDimension(), ecorePackage.getEDouble(), "xDimension", null, 0, 1, Galley.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGalley_YDimension(), ecorePackage.getEDouble(), "yDimension", null, 0, 1, Galley.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stairwayEClass, Stairway.class, "Stairway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStairway_XDimension(), ecorePackage.getEDouble(), "xDimension", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStairway_YDimension(), ecorePackage.getEDouble(), "yDimension", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStairway_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStairway_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStairway_Direction(), this.getStairwayDirection(), "direction", null, 0, 1, Stairway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(curtainEClass, Curtain.class, "Curtain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurtain_PostitionAfterRow(), ecorePackage.getEInt(), "postitionAfterRow", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_CurtainOpen(), ecorePackage.getEBoolean(), "curtainOpen", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_XDimension(), ecorePackage.getEDouble(), "xDimension", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_YDimension(), ecorePackage.getEDouble(), "yDimension", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurtain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Curtain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stowageEClass, Stowage.class, "Stowage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStowage_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Stowage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStowage_YPosition(), ecorePackage.getEDouble(), "yPosition", null, 0, 1, Stowage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStowage_XDimension(), ecorePackage.getEDouble(), "xDimension", null, 0, 1, Stowage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStowage_YDimension(), ecorePackage.getEDouble(), "yDimension", null, 0, 1, Stowage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(classTypeEEnum, ClassType.class, "ClassType");
		addEEnumLiteral(classTypeEEnum, ClassType.FIRST);
		addEEnumLiteral(classTypeEEnum, ClassType.BUSINESS);
		addEEnumLiteral(classTypeEEnum, ClassType.PREMIUM_ECO);
		addEEnumLiteral(classTypeEEnum, ClassType.ECONOMY);

		initEEnum(doorTypeEEnum, DoorType.class, "DoorType");
		addEEnumLiteral(doorTypeEEnum, DoorType.MAIN_DOOR);
		addEEnumLiteral(doorTypeEEnum, DoorType.EMERGENCY_EXIT);
		addEEnumLiteral(doorTypeEEnum, DoorType.STANDARD_DOOR);

		initEEnum(stairwayDirectionEEnum, StairwayDirection.class, "StairwayDirection");
		addEEnumLiteral(stairwayDirectionEEnum, StairwayDirection.UP);
		addEEnumLiteral(stairwayDirectionEEnum, StairwayDirection.DOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //CabinPackageImpl
