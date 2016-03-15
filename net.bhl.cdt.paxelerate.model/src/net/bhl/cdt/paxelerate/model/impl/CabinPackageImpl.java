/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.io.IOException;
import java.net.URL;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import net.bhl.cdt.model.ModelPackage;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.util.CabinValidator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

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
	protected String packageFilename = "model.ecore";

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
	private EClass luggagePropertiesEClass = null;

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
	private EClass passengerPropertiesEClass = null;

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
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#eNS_URI
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
	 * @generated
	 */
	public static CabinPackage init() {
		if (isInited) return (CabinPackage)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI);

		// Obtain or create and register package
		CabinPackageImpl theCabinPackage = (CabinPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CabinPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CabinPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Load packages
		theCabinPackage.loadPackage();

		// Fix loaded packages
		theCabinPackage.fixPackageContents();

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
		if (cabinEClass == null) {
			cabinEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(0);
		}
		return cabinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_XDimension() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_YDimension() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Doors() {
        return (EReference)getCabin().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Lavatories() {
        return (EReference)getCabin().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Galleys() {
        return (EReference)getCabin().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stairways() {
        return (EReference)getCabin().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Curtains() {
        return (EReference)getCabin().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Stowages() {
        return (EReference)getCabin().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_Scale() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_FramesPerSecond() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Passengers() {
        return (EReference)getCabin().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_NumberOfDecks() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_AircraftType() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_UsePresetSettings() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_SpeedFactor() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_SimulationSettings() {
        return (EReference)getCabin().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_Classes() {
        return (EReference)getCabin().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_RowNonexistent() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCabin_AisleWidth() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		if (rowEClass == null) {
			rowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(1);
		}
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Seats() {
        return (EReference)getRow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_RowNumber() {
        return (EAttribute)getRow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_OffsetInRow() {
        return (EAttribute)getRow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTravelClass() {
		if (travelClassEClass == null) {
			travelClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(2);
		}
		return travelClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTravelClass_Rows() {
        return (EReference)getTravelClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_Sequence() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_Passengers() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_AvailableSeats() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_SeatPitch() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_XDimensionOfSeats() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_YDimensionOfSeats() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_Name() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_RowStructure() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTravelClass_LoadFactor() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTravelClass__TooManyPassengers__DiagnosticChain_Map() {
        return getTravelClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTravelClass__WrongRowStructure__DiagnosticChain_Map() {
        return getTravelClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessClass() {
		if (businessClassEClass == null) {
			businessClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(3);
		}
		return businessClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstClass() {
		if (firstClassEClass == null) {
			firstClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(4);
		}
		return firstClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEconomyClass() {
		if (economyClassEClass == null) {
			economyClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(5);
		}
		return economyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPremiumEconomyClass() {
		if (premiumEconomyClassEClass == null) {
			premiumEconomyClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(6);
		}
		return premiumEconomyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoor() {
		if (doorEClass == null) {
			doorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(16);
		}
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_XPosition() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_OnBothSides() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Width() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Id() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_NumberOfSimultaneousPassengers() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_IsActive() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoor_WaitingPassengers() {
        return (EReference)getDoor().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeat() {
		if (seatEClass == null) {
			seatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(7);
		}
		return seatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_SeatBlocked() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_CrewSeat() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Letter() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeat_TravelClass() {
        return (EReference)getSeat().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeat_Row() {
        return (EReference)getSeat().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Occupied() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeat_Passenger() {
        return (EReference)getSeat().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_CurrentlyFolded() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassenger() {
		if (passengerEClass == null) {
			passengerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(8);
		}
		return passengerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Id() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Sex() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Seat() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Name() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_BoardingTime() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_SeatRef() {
        return (EReference)getPassenger().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Width() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Depth() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_OrientationInDegree() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PositionX() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PositionY() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_IsSeated() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WalkingSpeed() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_StartBoardingAfterDelay() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfWaits() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_LuggageStowTime() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_LuggageStowingDistance() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_TravelClass() {
        return (EReference)getPassenger().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PassengerMood() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfMakeWayOperations() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Luggage() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Height() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Age() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Weight() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_Door() {
        return (EReference)getPassenger().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrewMember() {
		if (crewMemberEClass == null) {
			crewMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(9);
		}
		return crewMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrewMember_Id() {
        return (EAttribute)getCrewMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrewMember_Seat() {
        return (EReference)getCrewMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLavatory() {
		if (lavatoryEClass == null) {
			lavatoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(11);
		}
		return lavatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGalley() {
		if (galleyEClass == null) {
			galleyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(12);
		}
		return galleyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStairway() {
		if (stairwayEClass == null) {
			stairwayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(13);
		}
		return stairwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStairway_Direction() {
        return (EAttribute)getStairway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurtain() {
		if (curtainEClass == null) {
			curtainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(14);
		}
		return curtainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_PostitionAfterRow() {
        return (EAttribute)getCurtain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurtain_CurtainOpen() {
        return (EAttribute)getCurtain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStowage() {
		if (stowageEClass == null) {
			stowageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(15);
		}
		return stowageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainDoor() {
		if (mainDoorEClass == null) {
			mainDoorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(17);
		}
		return mainDoorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmergencyExit() {
		if (emergencyExitEClass == null) {
			emergencyExitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(18);
		}
		return emergencyExitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDoor() {
		if (standardDoorEClass == null) {
			standardDoorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(19);
		}
		return standardDoorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationProperties() {
		if (simulationPropertiesEClass == null) {
			simulationPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(24);
		}
		return simulationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_SimulateWithoutUI() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_NumberOfSimulationLoops() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_RandomSortBetweenLoops() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_UseFoldableSeats() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_BringYourOwnSeat() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationProperties_Results() {
        return (EReference)getSimulationProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_Sorting() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_SimulationSpeedFactor() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_DeveloperMode() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationProperties_Luggage() {
        return (EReference)getSimulationProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationProperties_Passenger() {
        return (EReference)getSimulationProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_PassengersBoardingPerMinute() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggageProperties() {
		if (luggagePropertiesEClass == null) {
			luggagePropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(25);
		}
		return luggagePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStowingDistanceFromSeatMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStowingDistanceFromSeatDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithNoLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithSmallLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithMediumLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithBigLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PassengerSmallLuggageStowTimeMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PassengerSmallLuggageStowTimeDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PassengerMediumLuggageStowTimeMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PassengerMediumLuggageStowTimeDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PassengerBigLuggageStowTimeMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_PassengerBigLuggageStowTimeDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationResult() {
		if (simulationResultEClass == null) {
			simulationResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(26);
		}
		return simulationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_BoardingTime() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Passengers() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Name() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Id() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Date() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_BoardingTimeString() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassengerProperties() {
		if (passengerPropertiesEClass == null) {
			passengerPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(29);
		}
		return passengerPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PercentageOfWomen() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWidthDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerWeightDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerHeightDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassengerProperties_PassengerDepthDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalObject() {
		if (physicalObjectEClass == null) {
			physicalObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(10);
		}
		return physicalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_YPosition() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_XPosition() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_YDimension() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_XDimension() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_Name() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalObject_Id() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPhysicalObject__OutOfBounds__DiagnosticChain_Map() {
        return getPhysicalObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStairwayDirection() {
		if (stairwayDirectionEEnum == null) {
			stairwayDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(21);
		}
		return stairwayDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAircraftType() {
		if (aircraftTypeEEnum == null) {
			aircraftTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(22);
		}
		return aircraftTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPassengerMood() {
		if (passengerMoodEEnum == null) {
			passengerMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(23);
		}
		return passengerMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLuggageSize() {
		if (luggageSizeEEnum == null) {
			luggageSizeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(27);
		}
		return luggageSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSortingStyle() {
		if (sortingStyleEEnum == null) {
			sortingStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(28);
		}
		return sortingStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSex() {
		if (sexEEnum == null) {
			sexEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(20);
		}
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
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("net.bhl.cdt.paxelerate.model." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CabinPackageImpl
