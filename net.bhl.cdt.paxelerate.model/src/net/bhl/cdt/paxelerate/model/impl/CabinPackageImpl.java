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
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected String packageFilename = "model.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass cabinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass rowEClass = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass travelClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass doorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass seatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass passengerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass crewMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass lavatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass galleyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass stairwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass curtainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass stowageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass simulationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass luggagePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass simulationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass passengerPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EClass physicalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum stairwayDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum aircraftTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum passengerMoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum luggageSizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum sortingStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum travelOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum objectOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private EEnum doorOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
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
	 * <!-- end-user-doc -->.
	 *
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ x dimension
	 * @generated 
	 */
	public EAttribute getCabin_XDimension() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ y dimension
	 * @generated 
	 */
	public EAttribute getCabin_YDimension() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ doors
	 * @generated 
	 */
	public EReference getCabin_Doors() {
        return (EReference)getCabin().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ lavatories
	 * @generated 
	 */
	public EReference getCabin_Lavatories() {
        return (EReference)getCabin().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ galleys
	 * @generated 
	 */
	public EReference getCabin_Galleys() {
        return (EReference)getCabin().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ stairways
	 * @generated 
	 */
	public EReference getCabin_Stairways() {
        return (EReference)getCabin().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ curtains
	 * @generated 
	 */
	public EReference getCabin_Curtains() {
        return (EReference)getCabin().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ stowages
	 * @generated 
	 */
	public EReference getCabin_Stowages() {
        return (EReference)getCabin().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ passengers
	 * @generated 
	 */
	public EReference getCabin_Passengers() {
        return (EReference)getCabin().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCabin_SimulationResults() {
        return (EReference)getCabin().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ number of decks
	 * @generated 
	 */
	public EAttribute getCabin_NumberOfDecks() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ aircraft type
	 * @generated 
	 */
	public EAttribute getCabin_AircraftType() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ simulation settings
	 * @generated 
	 */
	public EReference getCabin_SimulationSettings() {
        return (EReference)getCabin().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ classes
	 * @generated 
	 */
	public EReference getCabin_Classes() {
        return (EReference)getCabin().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ row nonexistent
	 * @generated 
	 */
	public EAttribute getCabin_RowNonexistent() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin_ aisle width
	 * @generated 
	 */
	public EAttribute getCabin_AisleWidth() {
        return (EAttribute)getCabin().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the row
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the row_ seats
	 * @generated 
	 */
	public EReference getRow_Seats() {
        return (EReference)getRow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the row_ row number
	 * @generated 
	 */
	public EAttribute getRow_RowNumber() {
        return (EAttribute)getRow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ rows
	 * @generated 
	 */
	public EReference getTravelClass_Rows() {
        return (EReference)getTravelClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ sequence
	 * @generated 
	 */
	public EAttribute getTravelClass_Sequence() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ passengers
	 * @generated 
	 */
	public EAttribute getTravelClass_Passengers() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ available seats
	 * @generated 
	 */
	public EAttribute getTravelClass_AvailableSeats() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ seat pitch
	 * @generated 
	 */
	public EAttribute getTravelClass_SeatPitch() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ x dimension of seats
	 * @generated 
	 */
	public EAttribute getTravelClass_XDimensionOfSeats() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ y dimension of seats
	 * @generated 
	 */
	public EAttribute getTravelClass_YDimensionOfSeats() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ name
	 * @generated 
	 */
	public EAttribute getTravelClass_Name() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ row structure
	 * @generated 
	 */
	public EAttribute getTravelClass_RowStructure() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ load factor
	 * @generated 
	 */
	public EAttribute getTravelClass_LoadFactor() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class_ travel option
	 * @generated 
	 */
	public EAttribute getTravelClass_TravelOption() {
        return (EAttribute)getTravelClass().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class__ too many passengers__ diagnostic chain_ map
	 * @generated 
	 */
	public EOperation getTravelClass__TooManyPassengers__DiagnosticChain_Map() {
        return getTravelClass().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel class__ wrong row structure__ diagnostic chain_ map
	 * @generated 
	 */
	public EOperation getTravelClass__WrongRowStructure__DiagnosticChain_Map() {
        return getTravelClass().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door
	 * @generated 
	 */
	public EClass getDoor() {
		if (doorEClass == null) {
			doorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(12);
		}
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ x position
	 * @generated 
	 */
	public EAttribute getDoor_XPosition() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ on both sides
	 * @generated 
	 */
	public EAttribute getDoor_OnBothSides() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ width
	 * @generated 
	 */
	public EAttribute getDoor_Width() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ id
	 * @generated 
	 */
	public EAttribute getDoor_Id() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ number of simultaneous passengers
	 * @generated 
	 */
	public EAttribute getDoor_NumberOfSimultaneousPassengers() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ is active
	 * @generated 
	 */
	public EAttribute getDoor_IsActive() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ waiting passengers
	 * @generated 
	 */
	public EReference getDoor_WaitingPassengers() {
        return (EReference)getDoor().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door_ door option
	 * @generated 
	 */
	public EAttribute getDoor_DoorOption() {
        return (EAttribute)getDoor().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat
	 * @generated 
	 */
	public EClass getSeat() {
		if (seatEClass == null) {
			seatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(3);
		}
		return seatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ seat blocked
	 * @generated 
	 */
	public EAttribute getSeat_SeatBlocked() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ crew seat
	 * @generated 
	 */
	public EAttribute getSeat_CrewSeat() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ letter
	 * @generated 
	 */
	public EAttribute getSeat_Letter() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ travel class
	 * @generated 
	 */
	public EReference getSeat_TravelClass() {
        return (EReference)getSeat().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ row
	 * @generated 
	 */
	public EReference getSeat_Row() {
        return (EReference)getSeat().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ occupied
	 * @generated 
	 */
	public EAttribute getSeat_Occupied() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the seat_ passenger
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
	public EAttribute getSeat_FoldedAway() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_FoldedUpwards() {
        return (EAttribute)getSeat().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger
	 * @generated 
	 */
	public EClass getPassenger() {
		if (passengerEClass == null) {
			passengerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(4);
		}
		return passengerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ id
	 * @generated 
	 */
	public EAttribute getPassenger_Id() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ sex
	 * @generated 
	 */
	public EAttribute getPassenger_Sex() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ seat
	 * @generated 
	 */
	public EReference getPassenger_Seat() {
        return (EReference)getPassenger().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ name
	 * @generated 
	 */
	public EAttribute getPassenger_Name() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ boarding time
	 * @generated 
	 */
	public EAttribute getPassenger_BoardingTime() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ width
	 * @generated 
	 */
	public EAttribute getPassenger_Width() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ depth
	 * @generated 
	 */
	public EAttribute getPassenger_Depth() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ orientation in degree
	 * @generated 
	 */
	public EAttribute getPassenger_OrientationInDegree() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ position x
	 * @generated 
	 */
	public EAttribute getPassenger_PositionX() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ position y
	 * @generated 
	 */
	public EAttribute getPassenger_PositionY() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ is seated
	 * @generated 
	 */
	public EAttribute getPassenger_IsSeated() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ walking speed
	 * @generated 
	 */
	public EAttribute getPassenger_WalkingSpeed() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ start boarding after delay
	 * @generated 
	 */
	public EAttribute getPassenger_StartBoardingAfterDelay() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ number of waits
	 * @generated 
	 */
	public EAttribute getPassenger_NumberOfWaits() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ luggage stow time
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
	public EAttribute getPassenger_LuggageStowDistance() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ travel class
	 * @generated 
	 */
	public EReference getPassenger_TravelClass() {
        return (EReference)getPassenger().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ passenger mood
	 * @generated 
	 */
	public EAttribute getPassenger_PassengerMood() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ number of make way operations
	 * @generated 
	 */
	public EAttribute getPassenger_NumberOfMakeWayOperations() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ luggage
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
	public EAttribute getPassenger_DistanceWalked() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ height
	 * @generated 
	 */
	public EAttribute getPassenger_Height() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ age
	 * @generated 
	 */
	public EAttribute getPassenger_Age() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ weight
	 * @generated 
	 */
	public EAttribute getPassenger_Weight() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ door
	 * @generated 
	 */
	public EReference getPassenger_Door() {
        return (EReference)getPassenger().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger_ seat id
	 * @generated 
	 */
	public EAttribute getPassenger_SeatID() {
        return (EAttribute)getPassenger().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the crew member
	 * @generated 
	 */
	public EClass getCrewMember() {
		if (crewMemberEClass == null) {
			crewMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(5);
		}
		return crewMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the crew member_ id
	 * @generated 
	 */
	public EAttribute getCrewMember_Id() {
        return (EAttribute)getCrewMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the crew member_ seat
	 * @generated 
	 */
	public EReference getCrewMember_Seat() {
        return (EReference)getCrewMember().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the lavatory
	 * @generated 
	 */
	public EClass getLavatory() {
		if (lavatoryEClass == null) {
			lavatoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(7);
		}
		return lavatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the galley
	 * @generated 
	 */
	public EClass getGalley() {
		if (galleyEClass == null) {
			galleyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(8);
		}
		return galleyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the stairway
	 * @generated 
	 */
	public EClass getStairway() {
		if (stairwayEClass == null) {
			stairwayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(9);
		}
		return stairwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the stairway_ direction
	 * @generated 
	 */
	public EAttribute getStairway_Direction() {
        return (EAttribute)getStairway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the curtain
	 * @generated 
	 */
	public EClass getCurtain() {
		if (curtainEClass == null) {
			curtainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(10);
		}
		return curtainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the curtain_ postition after row
	 * @generated 
	 */
	public EAttribute getCurtain_PostitionAfterRow() {
        return (EAttribute)getCurtain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the curtain_ curtain open
	 * @generated 
	 */
	public EAttribute getCurtain_CurtainOpen() {
        return (EAttribute)getCurtain().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the stowage
	 * @generated 
	 */
	public EClass getStowage() {
		if (stowageEClass == null) {
			stowageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(11);
		}
		return stowageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties
	 * @generated 
	 */
	public EClass getSimulationProperties() {
		if (simulationPropertiesEClass == null) {
			simulationPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(17);
		}
		return simulationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ scale
	 * @generated 
	 */
	public EAttribute getSimulationProperties_Scale() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ frames per second
	 * @generated 
	 */
	public EAttribute getSimulationProperties_FramesPerSecond() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ use preset settings
	 * @generated 
	 */
	public EAttribute getSimulationProperties_UsePresetSettings() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ simulate without ui
	 * @generated 
	 */
	public EAttribute getSimulationProperties_SimulateWithoutUI() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ number of simulation loops
	 * @generated 
	 */
	public EAttribute getSimulationProperties_NumberOfSimulationLoops() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ random sort between loops
	 * @generated 
	 */
	public EAttribute getSimulationProperties_RandomSortBetweenLoops() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_UseSidewaysFoldableSeats() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_UseLiftingSeatPanSeats() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ bring your own seat
	 * @generated 
	 */
	public EAttribute getSimulationProperties_BringYourOwnSeat() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ results
	 * @generated 
	 */
	public EReference getSimulationProperties_Results() {
        return (EReference)getSimulationProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ sorting
	 * @generated 
	 */
	public EAttribute getSimulationProperties_Sorting() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ simulation speed factor
	 * @generated 
	 */
	public EAttribute getSimulationProperties_SimulationSpeedFactor() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ seat interference standing up passenger waiting time
	 * @generated 
	 */
	public EAttribute getSimulationProperties_SeatInterferenceStandingUpPassengerWaitingTime() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ seat interference process time
	 * @generated 
	 */
	public EAttribute getSimulationProperties_SeatInterferenceProcessTime() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ thread sleep time default
	 * @generated 
	 */
	public EAttribute getSimulationProperties_ThreadSleepTimeDefault() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ developer mode
	 * @generated 
	 */
	public EAttribute getSimulationProperties_DeveloperMode() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ luggage properties
	 * @generated 
	 */
	public EReference getSimulationProperties_LuggageProperties() {
        return (EReference)getSimulationProperties().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ passenger properties
	 * @generated 
	 */
	public EReference getSimulationProperties_PassengerProperties() {
        return (EReference)getSimulationProperties().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation properties_ passengers boarding per minute
	 * @generated 
	 */
	public EAttribute getSimulationProperties_PassengersBoardingPerMinute() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_DataExport() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_DisplayMap() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_SidewaysFoldabeSeatPopupTime() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationProperties_LiftingSeatPanPopupTime() {
        return (EAttribute)getSimulationProperties().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties
	 * @generated 
	 */
	public EClass getLuggageProperties() {
		if (luggagePropertiesEClass == null) {
			luggagePropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(18);
		}
		return luggagePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStowDistanceFromSeatMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggageProperties_LuggageStowDistanceFromSeatDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ percentage of passengers with no luggage
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithNoLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ percentage of passengers with small luggage
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithSmallLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ percentage of passengers with medium luggage
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithMediumLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ percentage of passengers with big luggage
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PercentageOfPassengersWithBigLuggage() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ passenger small luggage stow time mean
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PassengerSmallLuggageStowTimeMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ passenger small luggage stow time deviation
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PassengerSmallLuggageStowTimeDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ passenger medium luggage stow time mean
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PassengerMediumLuggageStowTimeMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ passenger medium luggage stow time deviation
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PassengerMediumLuggageStowTimeDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ passenger big luggage stow time mean
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PassengerBigLuggageStowTimeMean() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage properties_ passenger big luggage stow time deviation
	 * @generated 
	 */
	public EAttribute getLuggageProperties_PassengerBigLuggageStowTimeDeviation() {
        return (EAttribute)getLuggageProperties().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result
	 * @generated 
	 */
	public EClass getSimulationResult() {
		if (simulationResultEClass == null) {
			simulationResultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(19);
		}
		return simulationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result_ boarding time
	 * @generated 
	 */
	public EAttribute getSimulationResult_BoardingTime() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result_ passengers
	 * @generated 
	 */
	public EAttribute getSimulationResult_Passengers() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result_ name
	 * @generated 
	 */
	public EAttribute getSimulationResult_Name() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result_ id
	 * @generated 
	 */
	public EAttribute getSimulationResult_Id() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result_ date
	 * @generated 
	 */
	public EAttribute getSimulationResult_Date() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the simulation result_ boarding time string
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
	public EAttribute getSimulationResult_WaymakingSkipped() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_WaymakingCompleted() {
        return (EAttribute)getSimulationResult().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties
	 * @generated 
	 */
	public EClass getPassengerProperties() {
		if (passengerPropertiesEClass == null) {
			passengerPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(22);
		}
		return passengerPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger width mean male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWidthMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger width deviation male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWidthDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger weight mean male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWeightMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger weight deviation male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWeightDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger height mean male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerHeightMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger height deviation male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerHeightDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger depth mean male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerDepthMeanMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger depth deviation male
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerDepthDeviationMale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ percentage of women
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PercentageOfWomen() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger width mean female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWidthMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger width deviation female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWidthDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger weight mean female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWeightMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger weight deviation female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerWeightDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger height mean female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerHeightMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger height deviation female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerHeightDeviationFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger depth mean female
	 * @generated 
	 */
	public EAttribute getPassengerProperties_PassengerDepthMeanFemale() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger properties_ passenger depth deviation female
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
	public EAttribute getPassengerProperties_PassengerAggressiveMoodShare() {
        return (EAttribute)getPassengerProperties().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object
	 * @generated 
	 */
	public EClass getPhysicalObject() {
		if (physicalObjectEClass == null) {
			physicalObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(6);
		}
		return physicalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object_ y position
	 * @generated 
	 */
	public EAttribute getPhysicalObject_YPosition() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object_ x position
	 * @generated 
	 */
	public EAttribute getPhysicalObject_XPosition() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object_ y dimension
	 * @generated 
	 */
	public EAttribute getPhysicalObject_YDimension() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object_ x dimension
	 * @generated 
	 */
	public EAttribute getPhysicalObject_XDimension() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object_ name
	 * @generated 
	 */
	public EAttribute getPhysicalObject_Name() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object_ id
	 * @generated 
	 */
	public EAttribute getPhysicalObject_Id() {
        return (EAttribute)getPhysicalObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the physical object__ out of bounds__ diagnostic chain_ map
	 * @generated 
	 */
	public EOperation getPhysicalObject__OutOfBounds__DiagnosticChain_Map() {
        return getPhysicalObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the stairway direction
	 * @generated 
	 */
	public EEnum getStairwayDirection() {
		if (stairwayDirectionEEnum == null) {
			stairwayDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(14);
		}
		return stairwayDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the aircraft type
	 * @generated 
	 */
	public EEnum getAircraftType() {
		if (aircraftTypeEEnum == null) {
			aircraftTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(15);
		}
		return aircraftTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger mood
	 * @generated 
	 */
	public EEnum getPassengerMood() {
		if (passengerMoodEEnum == null) {
			passengerMoodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(16);
		}
		return passengerMoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage size
	 * @generated 
	 */
	public EEnum getLuggageSize() {
		if (luggageSizeEEnum == null) {
			luggageSizeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(20);
		}
		return luggageSizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the sorting style
	 * @generated 
	 */
	public EEnum getSortingStyle() {
		if (sortingStyleEEnum == null) {
			sortingStyleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(21);
		}
		return sortingStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the travel option
	 * @generated 
	 */
	public EEnum getTravelOption() {
		if (travelOptionEEnum == null) {
			travelOptionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(23);
		}
		return travelOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the object option
	 * @generated 
	 */
	public EEnum getObjectOption() {
		if (objectOptionEEnum == null) {
			objectOptionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(24);
		}
		return objectOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the door option
	 * @generated 
	 */
	public EEnum getDoorOption() {
		if (doorOptionEEnum == null) {
			doorOptionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(25);
		}
		return doorOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the sex
	 * @generated 
	 */
	public EEnum getSex() {
		if (sexEEnum == null) {
			sexEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CabinPackage.eNS_URI).getEClassifiers().get(13);
		}
		return sexEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the cabin factory
	 * @generated 
	 */
	public CabinFactory getCabinFactory() {
		return (CabinFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
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
	 * <!-- end-user-doc -->.
	 *
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
