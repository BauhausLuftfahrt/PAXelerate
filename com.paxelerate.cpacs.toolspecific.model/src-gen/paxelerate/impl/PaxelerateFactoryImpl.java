/**
 */
package paxelerate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import paxelerate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaxelerateFactoryImpl extends EFactoryImpl implements PaxelerateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaxelerateFactory init() {
		try {
			PaxelerateFactory thePaxelerateFactory = (PaxelerateFactory) EPackage.Registry.INSTANCE
					.getEFactory(PaxeleratePackage.eNS_URI);
			if (thePaxelerateFactory != null) {
				return thePaxelerateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaxelerateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateFactoryImpl() {
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
		case PaxeleratePackage.COMPLEX_BASE_TYPE:
			return createComplexBaseType();
		case PaxeleratePackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case PaxeleratePackage.PAXELERATE_INPUT_TYPE:
			return createPaxelerateInputType();
		case PaxeleratePackage.PAXELERATE_TYPE:
			return createPaxelerateType();
		case PaxeleratePackage.STUDIES_TYPE:
			return createStudiesType();
		case PaxeleratePackage.STUDY_TYPE:
			return createStudyType();
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
		case PaxeleratePackage.DOOR_SELECTION_TYPE:
			return createDoorSelectionTypeFromString(eDataType, initialValue);
		case PaxeleratePackage.PASSENGER_SORTING_SCHEME_TYPE:
			return createPassengerSortingSchemeTypeFromString(eDataType, initialValue);
		case PaxeleratePackage.SEAT_TYPE_TYPE:
			return createSeatTypeTypeFromString(eDataType, initialValue);
		case PaxeleratePackage.SIMULATION_TYPE_TYPE:
			return createSimulationTypeTypeFromString(eDataType, initialValue);
		case PaxeleratePackage.DOOR_SELECTION_TYPE_OBJECT:
			return createDoorSelectionTypeObjectFromString(eDataType, initialValue);
		case PaxeleratePackage.PASSENGER_SORTING_SCHEME_TYPE_OBJECT:
			return createPassengerSortingSchemeTypeObjectFromString(eDataType, initialValue);
		case PaxeleratePackage.SEAT_TYPE_TYPE_OBJECT:
			return createSeatTypeTypeObjectFromString(eDataType, initialValue);
		case PaxeleratePackage.SIMULATION_TYPE_TYPE_OBJECT:
			return createSimulationTypeTypeObjectFromString(eDataType, initialValue);
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
		case PaxeleratePackage.DOOR_SELECTION_TYPE:
			return convertDoorSelectionTypeToString(eDataType, instanceValue);
		case PaxeleratePackage.PASSENGER_SORTING_SCHEME_TYPE:
			return convertPassengerSortingSchemeTypeToString(eDataType, instanceValue);
		case PaxeleratePackage.SEAT_TYPE_TYPE:
			return convertSeatTypeTypeToString(eDataType, instanceValue);
		case PaxeleratePackage.SIMULATION_TYPE_TYPE:
			return convertSimulationTypeTypeToString(eDataType, instanceValue);
		case PaxeleratePackage.DOOR_SELECTION_TYPE_OBJECT:
			return convertDoorSelectionTypeObjectToString(eDataType, instanceValue);
		case PaxeleratePackage.PASSENGER_SORTING_SCHEME_TYPE_OBJECT:
			return convertPassengerSortingSchemeTypeObjectToString(eDataType, instanceValue);
		case PaxeleratePackage.SEAT_TYPE_TYPE_OBJECT:
			return convertSeatTypeTypeObjectToString(eDataType, instanceValue);
		case PaxeleratePackage.SIMULATION_TYPE_TYPE_OBJECT:
			return convertSimulationTypeTypeObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBaseType createComplexBaseType() {
		ComplexBaseTypeImpl complexBaseType = new ComplexBaseTypeImpl();
		return complexBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateInputType createPaxelerateInputType() {
		PaxelerateInputTypeImpl paxelerateInputType = new PaxelerateInputTypeImpl();
		return paxelerateInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateType createPaxelerateType() {
		PaxelerateTypeImpl paxelerateType = new PaxelerateTypeImpl();
		return paxelerateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiesType createStudiesType() {
		StudiesTypeImpl studiesType = new StudiesTypeImpl();
		return studiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyType createStudyType() {
		StudyTypeImpl studyType = new StudyTypeImpl();
		return studyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorSelectionType createDoorSelectionTypeFromString(EDataType eDataType, String initialValue) {
		DoorSelectionType result = DoorSelectionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerSortingSchemeType createPassengerSortingSchemeTypeFromString(EDataType eDataType,
			String initialValue) {
		PassengerSortingSchemeType result = PassengerSortingSchemeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassengerSortingSchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatTypeType createSeatTypeTypeFromString(EDataType eDataType, String initialValue) {
		SeatTypeType result = SeatTypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeatTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTypeType createSimulationTypeTypeFromString(EDataType eDataType, String initialValue) {
		SimulationTypeType result = SimulationTypeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimulationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorSelectionType createDoorSelectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDoorSelectionTypeFromString(PaxeleratePackage.Literals.DOOR_SELECTION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorSelectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDoorSelectionTypeToString(PaxeleratePackage.Literals.DOOR_SELECTION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerSortingSchemeType createPassengerSortingSchemeTypeObjectFromString(EDataType eDataType,
			String initialValue) {
		return createPassengerSortingSchemeTypeFromString(PaxeleratePackage.Literals.PASSENGER_SORTING_SCHEME_TYPE,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassengerSortingSchemeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPassengerSortingSchemeTypeToString(PaxeleratePackage.Literals.PASSENGER_SORTING_SCHEME_TYPE,
				instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatTypeType createSeatTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSeatTypeTypeFromString(PaxeleratePackage.Literals.SEAT_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeatTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSeatTypeTypeToString(PaxeleratePackage.Literals.SEAT_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTypeType createSimulationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSimulationTypeTypeFromString(PaxeleratePackage.Literals.SIMULATION_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSimulationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSimulationTypeTypeToString(PaxeleratePackage.Literals.SIMULATION_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxeleratePackage getPaxeleratePackage() {
		return (PaxeleratePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaxeleratePackage getPackage() {
		return PaxeleratePackage.eINSTANCE;
	}

} //PaxelerateFactoryImpl
