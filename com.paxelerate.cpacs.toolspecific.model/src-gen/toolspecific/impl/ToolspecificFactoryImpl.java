/**
 */
package toolspecific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import toolspecific.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolspecificFactoryImpl extends EFactoryImpl implements ToolspecificFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToolspecificFactory init() {
		try {
			ToolspecificFactory theToolspecificFactory = (ToolspecificFactory) EPackage.Registry.INSTANCE
					.getEFactory(ToolspecificPackage.eNS_URI);
			if (theToolspecificFactory != null) {
				return theToolspecificFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToolspecificFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolspecificFactoryImpl() {
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
		case ToolspecificPackage.BOOLEAN_BASE_TYPE:
			return createBooleanBaseType();
		case ToolspecificPackage.COMPLEX_BASE_TYPE:
			return createComplexBaseType();
		case ToolspecificPackage.DATE_BASE_TYPE:
			return createDateBaseType();
		case ToolspecificPackage.DATE_TIME_BASE_TYPE:
			return createDateTimeBaseType();
		case ToolspecificPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case ToolspecificPackage.DOOR_SELECTION_TYPE:
			return createDoorSelectionType();
		case ToolspecificPackage.DOUBLE_BASE_TYPE:
			return createDoubleBaseType();
		case ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE:
			return createDoubleConstraintBaseType();
		case ToolspecificPackage.INTEGER_BASE_TYPE:
			return createIntegerBaseType();
		case ToolspecificPackage.PASSENGER_SORTING_SCHEME_TYPE:
			return createPassengerSortingSchemeType();
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE:
			return createPaxelerateInputType();
		case ToolspecificPackage.PAXELERATE_TYPE:
			return createPaxelerateType();
		case ToolspecificPackage.SEAT_TYPE_TYPE:
			return createSeatTypeType();
		case ToolspecificPackage.SIMULATION_TYPE_TYPE:
			return createSimulationTypeType();
		case ToolspecificPackage.STRING_ARRAY_BASE_TYPE:
			return createStringArrayBaseType();
		case ToolspecificPackage.STRING_BASE_TYPE:
			return createStringBaseType();
		case ToolspecificPackage.STRING_UID_BASE_TYPE:
			return createStringUIDBaseType();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE:
			return createStringVectorBaseType();
		case ToolspecificPackage.TIME_BASE_TYPE:
			return createTimeBaseType();
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
		case ToolspecificPackage.RELATIONAL_OPERATOR_TYPE:
			return createRelationalOperatorTypeFromString(eDataType, initialValue);
		case ToolspecificPackage.SYMMETRY_TYPE:
			return createSymmetryTypeFromString(eDataType, initialValue);
		case ToolspecificPackage.UNCERTAINTY_FUNCTION_TYPE:
			return createUncertaintyFunctionTypeFromString(eDataType, initialValue);
		case ToolspecificPackage.RELATIONAL_OPERATOR_TYPE_OBJECT:
			return createRelationalOperatorTypeObjectFromString(eDataType, initialValue);
		case ToolspecificPackage.SYMMETRY_TYPE_OBJECT:
			return createSymmetryTypeObjectFromString(eDataType, initialValue);
		case ToolspecificPackage.UNCERTAINTY_FUNCTION_TYPE_OBJECT:
			return createUncertaintyFunctionTypeObjectFromString(eDataType, initialValue);
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
		case ToolspecificPackage.RELATIONAL_OPERATOR_TYPE:
			return convertRelationalOperatorTypeToString(eDataType, instanceValue);
		case ToolspecificPackage.SYMMETRY_TYPE:
			return convertSymmetryTypeToString(eDataType, instanceValue);
		case ToolspecificPackage.UNCERTAINTY_FUNCTION_TYPE:
			return convertUncertaintyFunctionTypeToString(eDataType, instanceValue);
		case ToolspecificPackage.RELATIONAL_OPERATOR_TYPE_OBJECT:
			return convertRelationalOperatorTypeObjectToString(eDataType, instanceValue);
		case ToolspecificPackage.SYMMETRY_TYPE_OBJECT:
			return convertSymmetryTypeObjectToString(eDataType, instanceValue);
		case ToolspecificPackage.UNCERTAINTY_FUNCTION_TYPE_OBJECT:
			return convertUncertaintyFunctionTypeObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBaseType createBooleanBaseType() {
		BooleanBaseTypeImpl booleanBaseType = new BooleanBaseTypeImpl();
		return booleanBaseType;
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
	public DateBaseType createDateBaseType() {
		DateBaseTypeImpl dateBaseType = new DateBaseTypeImpl();
		return dateBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeBaseType createDateTimeBaseType() {
		DateTimeBaseTypeImpl dateTimeBaseType = new DateTimeBaseTypeImpl();
		return dateTimeBaseType;
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
	public DoorSelectionType createDoorSelectionType() {
		DoorSelectionTypeImpl doorSelectionType = new DoorSelectionTypeImpl();
		return doorSelectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleBaseType createDoubleBaseType() {
		DoubleBaseTypeImpl doubleBaseType = new DoubleBaseTypeImpl();
		return doubleBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleConstraintBaseType createDoubleConstraintBaseType() {
		DoubleConstraintBaseTypeImpl doubleConstraintBaseType = new DoubleConstraintBaseTypeImpl();
		return doubleConstraintBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBaseType createIntegerBaseType() {
		IntegerBaseTypeImpl integerBaseType = new IntegerBaseTypeImpl();
		return integerBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerSortingSchemeType createPassengerSortingSchemeType() {
		PassengerSortingSchemeTypeImpl passengerSortingSchemeType = new PassengerSortingSchemeTypeImpl();
		return passengerSortingSchemeType;
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
	public SeatTypeType createSeatTypeType() {
		SeatTypeTypeImpl seatTypeType = new SeatTypeTypeImpl();
		return seatTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTypeType createSimulationTypeType() {
		SimulationTypeTypeImpl simulationTypeType = new SimulationTypeTypeImpl();
		return simulationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringArrayBaseType createStringArrayBaseType() {
		StringArrayBaseTypeImpl stringArrayBaseType = new StringArrayBaseTypeImpl();
		return stringArrayBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringBaseType createStringBaseType() {
		StringBaseTypeImpl stringBaseType = new StringBaseTypeImpl();
		return stringBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringUIDBaseType createStringUIDBaseType() {
		StringUIDBaseTypeImpl stringUIDBaseType = new StringUIDBaseTypeImpl();
		return stringUIDBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVectorBaseType createStringVectorBaseType() {
		StringVectorBaseTypeImpl stringVectorBaseType = new StringVectorBaseTypeImpl();
		return stringVectorBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBaseType createTimeBaseType() {
		TimeBaseTypeImpl timeBaseType = new TimeBaseTypeImpl();
		return timeBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorType createRelationalOperatorTypeFromString(EDataType eDataType, String initialValue) {
		RelationalOperatorType result = RelationalOperatorType.get(initialValue);
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
	public String convertRelationalOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeFromString(EDataType eDataType, String initialValue) {
		SymmetryType result = SymmetryType.get(initialValue);
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
	public String convertSymmetryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFunctionType createUncertaintyFunctionTypeFromString(EDataType eDataType, String initialValue) {
		UncertaintyFunctionType result = UncertaintyFunctionType.get(initialValue);
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
	public String convertUncertaintyFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperatorType createRelationalOperatorTypeObjectFromString(EDataType eDataType,
			String initialValue) {
		return createRelationalOperatorTypeFromString(ToolspecificPackage.Literals.RELATIONAL_OPERATOR_TYPE,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationalOperatorTypeToString(ToolspecificPackage.Literals.RELATIONAL_OPERATOR_TYPE,
				instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetryType createSymmetryTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSymmetryTypeFromString(ToolspecificPackage.Literals.SYMMETRY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymmetryTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymmetryTypeToString(ToolspecificPackage.Literals.SYMMETRY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFunctionType createUncertaintyFunctionTypeObjectFromString(EDataType eDataType,
			String initialValue) {
		return createUncertaintyFunctionTypeFromString(ToolspecificPackage.Literals.UNCERTAINTY_FUNCTION_TYPE,
				initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUncertaintyFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUncertaintyFunctionTypeToString(ToolspecificPackage.Literals.UNCERTAINTY_FUNCTION_TYPE,
				instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolspecificPackage getToolspecificPackage() {
		return (ToolspecificPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToolspecificPackage getPackage() {
		return ToolspecificPackage.eINSTANCE;
	}

} //ToolspecificFactoryImpl
