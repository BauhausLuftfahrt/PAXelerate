/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.*;

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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CabinPackage.CABIN: return createCabin();
			case CabinPackage.ROW: return createRow();
			case CabinPackage.PASSENGER_CLASS: return createPassengerClass();
			case CabinPackage.CABIN_DOORS: return createCabinDoors();
			case CabinPackage.SEAT: return createSeat();
			case CabinPackage.PASSENGER: return createPassenger();
			case CabinPackage.EMERGENCY_EXITS: return createEmergencyExits();
			case CabinPackage.TOILET: return createToilet();
			case CabinPackage.GALLEY: return createGalley();
			case CabinPackage.CREW_SEAT: return createCrewSeat();
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
			case CabinPackage.CLASS_TYPE:
				return createClassTypeFromString(eDataType, initialValue);
			case CabinPackage.SEX:
				return createSexFromString(eDataType, initialValue);
			case CabinPackage.BCWITH_BLOCKED_SEAT:
				return createBCwithBlockedSeatFromString(eDataType, initialValue);
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
			case CabinPackage.CLASS_TYPE:
				return convertClassTypeToString(eDataType, instanceValue);
			case CabinPackage.SEX:
				return convertSexToString(eDataType, instanceValue);
			case CabinPackage.BCWITH_BLOCKED_SEAT:
				return convertBCwithBlockedSeatToString(eDataType, instanceValue);
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
	public PassengerClass createPassengerClass() {
		PassengerClassImpl passengerClass = new PassengerClassImpl();
		return passengerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabinDoors createCabinDoors() {
		CabinDoorsImpl cabinDoors = new CabinDoorsImpl();
		return cabinDoors;
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
	public EmergencyExits createEmergencyExits() {
		EmergencyExitsImpl emergencyExits = new EmergencyExitsImpl();
		return emergencyExits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toilet createToilet() {
		ToiletImpl toilet = new ToiletImpl();
		return toilet;
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
	public CrewSeat createCrewSeat() {
		CrewSeatImpl crewSeat = new CrewSeatImpl();
		return crewSeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassTypeFromString(EDataType eDataType, String initialValue) {
		ClassType result = ClassType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassTypeToString(EDataType eDataType, Object instanceValue) {
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
	public BCwithBlockedSeat createBCwithBlockedSeatFromString(EDataType eDataType, String initialValue) {
		BCwithBlockedSeat result = BCwithBlockedSeat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBCwithBlockedSeatToString(EDataType eDataType, Object instanceValue) {
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
