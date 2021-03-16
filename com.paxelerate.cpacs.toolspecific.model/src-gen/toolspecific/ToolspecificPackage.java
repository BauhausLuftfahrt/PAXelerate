/**
 */
package toolspecific;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see toolspecific.ToolspecificFactory
 * @model kind="package"
 * @generated
 */
public interface ToolspecificPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toolspecific";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paxelerate.com/cpacs/toolspecific";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "toolspecific";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolspecificPackage eINSTANCE = toolspecific.impl.ToolspecificPackageImpl.init();

	/**
	 * The meta object id for the '{@link toolspecific.impl.BooleanBaseTypeImpl <em>Boolean Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.BooleanBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getBooleanBaseType()
	 * @generated
	 */
	int BOOLEAN_BASE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 2;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Boolean Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Boolean Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.ComplexBaseTypeImpl <em>Complex Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.ComplexBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getComplexBaseType()
	 * @generated
	 */
	int COMPLEX_BASE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 1;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BASE_TYPE__EXTERNAL_FILE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Complex Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BASE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Complex Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.DateBaseTypeImpl <em>Date Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.DateBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getDateBaseType()
	 * @generated
	 */
	int DATE_BASE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 2;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_TYPE__EXTERNAL_FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Date Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Date Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.DateTimeBaseTypeImpl <em>Date Time Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.DateTimeBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getDateTimeBaseType()
	 * @generated
	 */
	int DATE_TIME_BASE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 2;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Date Time Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_BASE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Date Time Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.DocumentRootImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Paxelerate Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAXELERATE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.DoubleBaseTypeImpl <em>Double Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.DoubleBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getDoubleBaseType()
	 * @generated
	 */
	int DOUBLE_BASE_TYPE = 6;

	/**
	 * The meta object id for the '{@link toolspecific.impl.DoubleConstraintBaseTypeImpl <em>Double Constraint Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.DoubleConstraintBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getDoubleConstraintBaseType()
	 * @generated
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE = 7;

	/**
	 * The meta object id for the '{@link toolspecific.impl.IntegerBaseTypeImpl <em>Integer Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.IntegerBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getIntegerBaseType()
	 * @generated
	 */
	int INTEGER_BASE_TYPE = 8;

	/**
	 * The meta object id for the '{@link toolspecific.impl.PassengerSortingSchemeTypeImpl <em>Passenger Sorting Scheme Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.PassengerSortingSchemeTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getPassengerSortingSchemeType()
	 * @generated
	 */
	int PASSENGER_SORTING_SCHEME_TYPE = 9;

	/**
	 * The meta object id for the '{@link toolspecific.impl.PaxelerateInputTypeImpl <em>Paxelerate Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.PaxelerateInputTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getPaxelerateInputType()
	 * @generated
	 */
	int PAXELERATE_INPUT_TYPE = 10;

	/**
	 * The meta object id for the '{@link toolspecific.impl.PaxelerateTypeImpl <em>Paxelerate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.PaxelerateTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getPaxelerateType()
	 * @generated
	 */
	int PAXELERATE_TYPE = 11;

	/**
	 * The meta object id for the '{@link toolspecific.impl.SeatTypeTypeImpl <em>Seat Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.SeatTypeTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getSeatTypeType()
	 * @generated
	 */
	int SEAT_TYPE_TYPE = 12;

	/**
	 * The meta object id for the '{@link toolspecific.impl.SimulationTypeTypeImpl <em>Simulation Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.SimulationTypeTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getSimulationTypeType()
	 * @generated
	 */
	int SIMULATION_TYPE_TYPE = 13;

	/**
	 * The meta object id for the '{@link toolspecific.impl.StringBaseTypeImpl <em>String Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.StringBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getStringBaseType()
	 * @generated
	 */
	int STRING_BASE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 2;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASE_TYPE__EXTERNAL_FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>String Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>String Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.DoorSelectionTypeImpl <em>Door Selection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.DoorSelectionTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getDoorSelectionType()
	 * @generated
	 */
	int DOOR_SELECTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SELECTION_TYPE__VALUE = STRING_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SELECTION_TYPE__EXTERNAL_DATA_DIRECTORY = STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SELECTION_TYPE__EXTERNAL_DATA_NODE_PATH = STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SELECTION_TYPE__EXTERNAL_FILE_NAME = STRING_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The number of structural features of the '<em>Door Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SELECTION_TYPE_FEATURE_COUNT = STRING_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Door Selection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_SELECTION_TYPE_OPERATION_COUNT = STRING_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__A = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__B = 2;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__C = 3;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__DELTA = 4;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 5;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 6;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__MU = 8;

	/**
	 * The feature id for the '<em><b>Uncertainty Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME = 9;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__V = 10;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE__W = 11;

	/**
	 * The number of structural features of the '<em>Double Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Double Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__VALUE = DOUBLE_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__A = DOUBLE_BASE_TYPE__A;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__B = DOUBLE_BASE_TYPE__B;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__C = DOUBLE_BASE_TYPE__C;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__DELTA = DOUBLE_BASE_TYPE__DELTA;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__EXTERNAL_FILE_NAME = DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__MU = DOUBLE_BASE_TYPE__MU;

	/**
	 * The feature id for the '<em><b>Uncertainty Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME = DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__V = DOUBLE_BASE_TYPE__V;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__W = DOUBLE_BASE_TYPE__W;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR = DOUBLE_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Constraint Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE_FEATURE_COUNT = DOUBLE_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Constraint Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_CONSTRAINT_BASE_TYPE_OPERATION_COUNT = DOUBLE_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 2;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASE_TYPE__EXTERNAL_FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Integer Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Integer Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_SORTING_SCHEME_TYPE__VALUE = STRING_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_SORTING_SCHEME_TYPE__EXTERNAL_DATA_DIRECTORY = STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_SORTING_SCHEME_TYPE__EXTERNAL_DATA_NODE_PATH = STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_SORTING_SCHEME_TYPE__EXTERNAL_FILE_NAME = STRING_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The number of structural features of the '<em>Passenger Sorting Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_SORTING_SCHEME_TYPE_FEATURE_COUNT = STRING_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passenger Sorting Scheme Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_SORTING_SCHEME_TYPE_OPERATION_COUNT = STRING_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__EXTERNAL_DATA_DIRECTORY = COMPLEX_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__EXTERNAL_DATA_NODE_PATH = COMPLEX_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__EXTERNAL_FILE_NAME = COMPLEX_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__LOAD_FACTOR = COMPLEX_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active Door UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS = COMPLEX_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__ITERATIONS = COMPLEX_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Simulation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__SIMULATION_TYPE = COMPLEX_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Simulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION = COMPLEX_BASE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Seat Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__SEAT_TYPE = COMPLEX_BASE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Simulation Grid Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION = COMPLEX_BASE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Simulation Speed Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR = COMPLEX_BASE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Passenger Sorting Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME = COMPLEX_BASE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Passenger Agressive Mood Share</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE = COMPLEX_BASE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Mean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN = COMPLEX_BASE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Deviation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION = COMPLEX_BASE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Door Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__DOOR_SELECTION = COMPLEX_BASE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Jackets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS = COMPLEX_BASE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Small Bags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS = COMPLEX_BASE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Medium Bags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS = COMPLEX_BASE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Large Bags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS = COMPLEX_BASE_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__UID = COMPLEX_BASE_TYPE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Paxelerate Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE_FEATURE_COUNT = COMPLEX_BASE_TYPE_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Paxelerate Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE_OPERATION_COUNT = COMPLEX_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__EXTERNAL_DATA_DIRECTORY = COMPLEX_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__EXTERNAL_DATA_NODE_PATH = COMPLEX_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__EXTERNAL_FILE_NAME = COMPLEX_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__INPUT = COMPLEX_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paxelerate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE_FEATURE_COUNT = COMPLEX_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paxelerate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE_OPERATION_COUNT = COMPLEX_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_TYPE_TYPE__VALUE = STRING_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_TYPE_TYPE__EXTERNAL_DATA_DIRECTORY = STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_TYPE_TYPE__EXTERNAL_DATA_NODE_PATH = STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_TYPE_TYPE__EXTERNAL_FILE_NAME = STRING_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The number of structural features of the '<em>Seat Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_TYPE_TYPE_FEATURE_COUNT = STRING_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Seat Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_TYPE_TYPE_OPERATION_COUNT = STRING_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TYPE_TYPE__VALUE = STRING_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TYPE_TYPE__EXTERNAL_DATA_DIRECTORY = STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TYPE_TYPE__EXTERNAL_DATA_NODE_PATH = STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TYPE_TYPE__EXTERNAL_FILE_NAME = STRING_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The number of structural features of the '<em>Simulation Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TYPE_TYPE_FEATURE_COUNT = STRING_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simulation Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_TYPE_TYPE_OPERATION_COUNT = STRING_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.StringArrayBaseTypeImpl <em>String Array Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.StringArrayBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getStringArrayBaseType()
	 * @generated
	 */
	int STRING_ARRAY_BASE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE__VALUE = STRING_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE__EXTERNAL_FILE_NAME = STRING_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE__MAP_TYPE = STRING_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Array Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE_FEATURE_COUNT = STRING_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Array Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ARRAY_BASE_TYPE_OPERATION_COUNT = STRING_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.StringUIDBaseTypeImpl <em>String UID Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.StringUIDBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getStringUIDBaseType()
	 * @generated
	 */
	int STRING_UID_BASE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Is Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_BASE_TYPE__IS_LINK = 1;

	/**
	 * The feature id for the '<em><b>Symmetry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_BASE_TYPE__SYMMETRY = 2;

	/**
	 * The number of structural features of the '<em>String UID Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_BASE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>String UID Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_UID_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.StringVectorBaseTypeImpl <em>String Vector Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.StringVectorBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getStringVectorBaseType()
	 * @generated
	 */
	int STRING_VECTOR_BASE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__VALUE = STRING_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__EXTERNAL_FILE_NAME = STRING_BASE_TYPE__EXTERNAL_FILE_NAME;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__A = STRING_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__B = STRING_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__C = STRING_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__DELTA = STRING_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__MAP_TYPE = STRING_BASE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__MU = STRING_BASE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uncertainty Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME = STRING_BASE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__V = STRING_BASE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE__W = STRING_BASE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>String Vector Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE_FEATURE_COUNT = STRING_BASE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>String Vector Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VECTOR_BASE_TYPE_OPERATION_COUNT = STRING_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link toolspecific.impl.TimeBaseTypeImpl <em>Time Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.impl.TimeBaseTypeImpl
	 * @see toolspecific.impl.ToolspecificPackageImpl#getTimeBaseType()
	 * @generated
	 */
	int TIME_BASE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = 2;

	/**
	 * The feature id for the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_TYPE__EXTERNAL_FILE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Time Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Time Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link toolspecific.RelationalOperatorType <em>Relational Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.RelationalOperatorType
	 * @see toolspecific.impl.ToolspecificPackageImpl#getRelationalOperatorType()
	 * @generated
	 */
	int RELATIONAL_OPERATOR_TYPE = 19;

	/**
	 * The meta object id for the '{@link toolspecific.SymmetryType <em>Symmetry Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.SymmetryType
	 * @see toolspecific.impl.ToolspecificPackageImpl#getSymmetryType()
	 * @generated
	 */
	int SYMMETRY_TYPE = 20;

	/**
	 * The meta object id for the '{@link toolspecific.UncertaintyFunctionType <em>Uncertainty Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.UncertaintyFunctionType
	 * @see toolspecific.impl.ToolspecificPackageImpl#getUncertaintyFunctionType()
	 * @generated
	 */
	int UNCERTAINTY_FUNCTION_TYPE = 21;

	/**
	 * The meta object id for the '<em>Relational Operator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.RelationalOperatorType
	 * @see toolspecific.impl.ToolspecificPackageImpl#getRelationalOperatorTypeObject()
	 * @generated
	 */
	int RELATIONAL_OPERATOR_TYPE_OBJECT = 22;

	/**
	 * The meta object id for the '<em>Symmetry Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.SymmetryType
	 * @see toolspecific.impl.ToolspecificPackageImpl#getSymmetryTypeObject()
	 * @generated
	 */
	int SYMMETRY_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Uncertainty Function Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see toolspecific.UncertaintyFunctionType
	 * @see toolspecific.impl.ToolspecificPackageImpl#getUncertaintyFunctionTypeObject()
	 * @generated
	 */
	int UNCERTAINTY_FUNCTION_TYPE_OBJECT = 24;

	/**
	 * Returns the meta object for class '{@link toolspecific.BooleanBaseType <em>Boolean Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Base Type</em>'.
	 * @see toolspecific.BooleanBaseType
	 * @generated
	 */
	EClass getBooleanBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.BooleanBaseType#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.BooleanBaseType#isValue()
	 * @see #getBooleanBaseType()
	 * @generated
	 */
	EAttribute getBooleanBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.BooleanBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.BooleanBaseType#getExternalDataDirectory()
	 * @see #getBooleanBaseType()
	 * @generated
	 */
	EAttribute getBooleanBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.BooleanBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.BooleanBaseType#getExternalDataNodePath()
	 * @see #getBooleanBaseType()
	 * @generated
	 */
	EAttribute getBooleanBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.BooleanBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.BooleanBaseType#getExternalFileName()
	 * @see #getBooleanBaseType()
	 * @generated
	 */
	EAttribute getBooleanBaseType_ExternalFileName();

	/**
	 * Returns the meta object for class '{@link toolspecific.ComplexBaseType <em>Complex Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Base Type</em>'.
	 * @see toolspecific.ComplexBaseType
	 * @generated
	 */
	EClass getComplexBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.ComplexBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.ComplexBaseType#getExternalDataDirectory()
	 * @see #getComplexBaseType()
	 * @generated
	 */
	EAttribute getComplexBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.ComplexBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.ComplexBaseType#getExternalDataNodePath()
	 * @see #getComplexBaseType()
	 * @generated
	 */
	EAttribute getComplexBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.ComplexBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.ComplexBaseType#getExternalFileName()
	 * @see #getComplexBaseType()
	 * @generated
	 */
	EAttribute getComplexBaseType_ExternalFileName();

	/**
	 * Returns the meta object for class '{@link toolspecific.DateBaseType <em>Date Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Base Type</em>'.
	 * @see toolspecific.DateBaseType
	 * @generated
	 */
	EClass getDateBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.DateBaseType#getValue()
	 * @see #getDateBaseType()
	 * @generated
	 */
	EAttribute getDateBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.DateBaseType#getExternalDataDirectory()
	 * @see #getDateBaseType()
	 * @generated
	 */
	EAttribute getDateBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.DateBaseType#getExternalDataNodePath()
	 * @see #getDateBaseType()
	 * @generated
	 */
	EAttribute getDateBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.DateBaseType#getExternalFileName()
	 * @see #getDateBaseType()
	 * @generated
	 */
	EAttribute getDateBaseType_ExternalFileName();

	/**
	 * Returns the meta object for class '{@link toolspecific.DateTimeBaseType <em>Date Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Base Type</em>'.
	 * @see toolspecific.DateTimeBaseType
	 * @generated
	 */
	EClass getDateTimeBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateTimeBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.DateTimeBaseType#getValue()
	 * @see #getDateTimeBaseType()
	 * @generated
	 */
	EAttribute getDateTimeBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateTimeBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.DateTimeBaseType#getExternalDataDirectory()
	 * @see #getDateTimeBaseType()
	 * @generated
	 */
	EAttribute getDateTimeBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateTimeBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.DateTimeBaseType#getExternalDataNodePath()
	 * @see #getDateTimeBaseType()
	 * @generated
	 */
	EAttribute getDateTimeBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DateTimeBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.DateTimeBaseType#getExternalFileName()
	 * @see #getDateTimeBaseType()
	 * @generated
	 */
	EAttribute getDateTimeBaseType_ExternalFileName();

	/**
	 * Returns the meta object for class '{@link toolspecific.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see toolspecific.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link toolspecific.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see toolspecific.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link toolspecific.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see toolspecific.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link toolspecific.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see toolspecific.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.DocumentRoot#getPaxelerateType <em>Paxelerate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paxelerate Type</em>'.
	 * @see toolspecific.DocumentRoot#getPaxelerateType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PaxelerateType();

	/**
	 * Returns the meta object for class '{@link toolspecific.DoorSelectionType <em>Door Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door Selection Type</em>'.
	 * @see toolspecific.DoorSelectionType
	 * @generated
	 */
	EClass getDoorSelectionType();

	/**
	 * Returns the meta object for class '{@link toolspecific.DoubleBaseType <em>Double Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Base Type</em>'.
	 * @see toolspecific.DoubleBaseType
	 * @generated
	 */
	EClass getDoubleBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.DoubleBaseType#getValue()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see toolspecific.DoubleBaseType#getA()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_A();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see toolspecific.DoubleBaseType#getB()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_B();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see toolspecific.DoubleBaseType#getC()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_C();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see toolspecific.DoubleBaseType#getDelta()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_Delta();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.DoubleBaseType#getExternalDataDirectory()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.DoubleBaseType#getExternalDataNodePath()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.DoubleBaseType#getExternalFileName()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_ExternalFileName();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mu</em>'.
	 * @see toolspecific.DoubleBaseType#getMu()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_Mu();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty Function Name</em>'.
	 * @see toolspecific.DoubleBaseType#getUncertaintyFunctionName()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_UncertaintyFunctionName();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see toolspecific.DoubleBaseType#getV()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_V();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleBaseType#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see toolspecific.DoubleBaseType#getW()
	 * @see #getDoubleBaseType()
	 * @generated
	 */
	EAttribute getDoubleBaseType_W();

	/**
	 * Returns the meta object for class '{@link toolspecific.DoubleConstraintBaseType <em>Double Constraint Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Constraint Base Type</em>'.
	 * @see toolspecific.DoubleConstraintBaseType
	 * @generated
	 */
	EClass getDoubleConstraintBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.DoubleConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relational Operator</em>'.
	 * @see toolspecific.DoubleConstraintBaseType#getRelationalOperator()
	 * @see #getDoubleConstraintBaseType()
	 * @generated
	 */
	EAttribute getDoubleConstraintBaseType_RelationalOperator();

	/**
	 * Returns the meta object for class '{@link toolspecific.IntegerBaseType <em>Integer Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Base Type</em>'.
	 * @see toolspecific.IntegerBaseType
	 * @generated
	 */
	EClass getIntegerBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.IntegerBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.IntegerBaseType#getValue()
	 * @see #getIntegerBaseType()
	 * @generated
	 */
	EAttribute getIntegerBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.IntegerBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.IntegerBaseType#getExternalDataDirectory()
	 * @see #getIntegerBaseType()
	 * @generated
	 */
	EAttribute getIntegerBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.IntegerBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.IntegerBaseType#getExternalDataNodePath()
	 * @see #getIntegerBaseType()
	 * @generated
	 */
	EAttribute getIntegerBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.IntegerBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.IntegerBaseType#getExternalFileName()
	 * @see #getIntegerBaseType()
	 * @generated
	 */
	EAttribute getIntegerBaseType_ExternalFileName();

	/**
	 * Returns the meta object for class '{@link toolspecific.PassengerSortingSchemeType <em>Passenger Sorting Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Sorting Scheme Type</em>'.
	 * @see toolspecific.PassengerSortingSchemeType
	 * @generated
	 */
	EClass getPassengerSortingSchemeType();

	/**
	 * Returns the meta object for class '{@link toolspecific.PaxelerateInputType <em>Paxelerate Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paxelerate Input Type</em>'.
	 * @see toolspecific.PaxelerateInputType
	 * @generated
	 */
	EClass getPaxelerateInputType();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getLoadFactor <em>Load Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Load Factor</em>'.
	 * @see toolspecific.PaxelerateInputType#getLoadFactor()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_LoadFactor();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getActiveDoorUIDs <em>Active Door UI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active Door UI Ds</em>'.
	 * @see toolspecific.PaxelerateInputType#getActiveDoorUIDs()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_ActiveDoorUIDs();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterations</em>'.
	 * @see toolspecific.PaxelerateInputType#getIterations()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_Iterations();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getSimulationType <em>Simulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulation Type</em>'.
	 * @see toolspecific.PaxelerateInputType#getSimulationType()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_SimulationType();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getDisplaySimulation <em>Display Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Simulation</em>'.
	 * @see toolspecific.PaxelerateInputType#getDisplaySimulation()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_DisplaySimulation();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getSeatType <em>Seat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seat Type</em>'.
	 * @see toolspecific.PaxelerateInputType#getSeatType()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_SeatType();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulation Grid Resolution</em>'.
	 * @see toolspecific.PaxelerateInputType#getSimulationGridResolution()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_SimulationGridResolution();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulation Speed Factor</em>'.
	 * @see toolspecific.PaxelerateInputType#getSimulationSpeedFactor()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_SimulationSpeedFactor();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Sorting Scheme</em>'.
	 * @see toolspecific.PaxelerateInputType#getPassengerSortingScheme()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_PassengerSortingScheme();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getPassengerAgressiveMoodShare <em>Passenger Agressive Mood Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Agressive Mood Share</em>'.
	 * @see toolspecific.PaxelerateInputType#getPassengerAgressiveMoodShare()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_PassengerAgressiveMoodShare();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seat Interference Process Time Mean</em>'.
	 * @see toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeMean()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_SeatInterferenceProcessTimeMean();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seat Interference Process Time Deviation</em>'.
	 * @see toolspecific.PaxelerateInputType#getSeatInterferenceProcessTimeDeviation()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_SeatInterferenceProcessTimeDeviation();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getDoorSelection <em>Door Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Door Selection</em>'.
	 * @see toolspecific.PaxelerateInputType#getDoorSelection()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_DoorSelection();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percentage Of Passengers With Jackets</em>'.
	 * @see toolspecific.PaxelerateInputType#getPercentageOfPassengersWithJackets()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_PercentageOfPassengersWithJackets();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percentage Of Passengers With Small Bags</em>'.
	 * @see toolspecific.PaxelerateInputType#getPercentageOfPassengersWithSmallBags()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_PercentageOfPassengersWithSmallBags();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percentage Of Passengers With Medium Bags</em>'.
	 * @see toolspecific.PaxelerateInputType#getPercentageOfPassengersWithMediumBags()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_PercentageOfPassengersWithMediumBags();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateInputType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Percentage Of Passengers With Large Bags</em>'.
	 * @see toolspecific.PaxelerateInputType#getPercentageOfPassengersWithLargeBags()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_PercentageOfPassengersWithLargeBags();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.PaxelerateInputType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see toolspecific.PaxelerateInputType#getUID()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EAttribute getPaxelerateInputType_UID();

	/**
	 * Returns the meta object for class '{@link toolspecific.PaxelerateType <em>Paxelerate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paxelerate Type</em>'.
	 * @see toolspecific.PaxelerateType
	 * @generated
	 */
	EClass getPaxelerateType();

	/**
	 * Returns the meta object for the containment reference '{@link toolspecific.PaxelerateType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see toolspecific.PaxelerateType#getInput()
	 * @see #getPaxelerateType()
	 * @generated
	 */
	EReference getPaxelerateType_Input();

	/**
	 * Returns the meta object for class '{@link toolspecific.SeatTypeType <em>Seat Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat Type Type</em>'.
	 * @see toolspecific.SeatTypeType
	 * @generated
	 */
	EClass getSeatTypeType();

	/**
	 * Returns the meta object for class '{@link toolspecific.SimulationTypeType <em>Simulation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Type Type</em>'.
	 * @see toolspecific.SimulationTypeType
	 * @generated
	 */
	EClass getSimulationTypeType();

	/**
	 * Returns the meta object for class '{@link toolspecific.StringArrayBaseType <em>String Array Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Array Base Type</em>'.
	 * @see toolspecific.StringArrayBaseType
	 * @generated
	 */
	EClass getStringArrayBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringArrayBaseType#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Type</em>'.
	 * @see toolspecific.StringArrayBaseType#getMapType()
	 * @see #getStringArrayBaseType()
	 * @generated
	 */
	EAttribute getStringArrayBaseType_MapType();

	/**
	 * Returns the meta object for class '{@link toolspecific.StringBaseType <em>String Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Base Type</em>'.
	 * @see toolspecific.StringBaseType
	 * @generated
	 */
	EClass getStringBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.StringBaseType#getValue()
	 * @see #getStringBaseType()
	 * @generated
	 */
	EAttribute getStringBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.StringBaseType#getExternalDataDirectory()
	 * @see #getStringBaseType()
	 * @generated
	 */
	EAttribute getStringBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.StringBaseType#getExternalDataNodePath()
	 * @see #getStringBaseType()
	 * @generated
	 */
	EAttribute getStringBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.StringBaseType#getExternalFileName()
	 * @see #getStringBaseType()
	 * @generated
	 */
	EAttribute getStringBaseType_ExternalFileName();

	/**
	 * Returns the meta object for class '{@link toolspecific.StringUIDBaseType <em>String UID Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String UID Base Type</em>'.
	 * @see toolspecific.StringUIDBaseType
	 * @generated
	 */
	EClass getStringUIDBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringUIDBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.StringUIDBaseType#getValue()
	 * @see #getStringUIDBaseType()
	 * @generated
	 */
	EAttribute getStringUIDBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringUIDBaseType#getIsLink <em>Is Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Link</em>'.
	 * @see toolspecific.StringUIDBaseType#getIsLink()
	 * @see #getStringUIDBaseType()
	 * @generated
	 */
	EAttribute getStringUIDBaseType_IsLink();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringUIDBaseType#getSymmetry <em>Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetry</em>'.
	 * @see toolspecific.StringUIDBaseType#getSymmetry()
	 * @see #getStringUIDBaseType()
	 * @generated
	 */
	EAttribute getStringUIDBaseType_Symmetry();

	/**
	 * Returns the meta object for class '{@link toolspecific.StringVectorBaseType <em>String Vector Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Vector Base Type</em>'.
	 * @see toolspecific.StringVectorBaseType
	 * @generated
	 */
	EClass getStringVectorBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see toolspecific.StringVectorBaseType#getA()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_A();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see toolspecific.StringVectorBaseType#getB()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_B();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see toolspecific.StringVectorBaseType#getC()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_C();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see toolspecific.StringVectorBaseType#getDelta()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_Delta();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Type</em>'.
	 * @see toolspecific.StringVectorBaseType#getMapType()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_MapType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getMu <em>Mu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mu</em>'.
	 * @see toolspecific.StringVectorBaseType#getMu()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_Mu();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncertainty Function Name</em>'.
	 * @see toolspecific.StringVectorBaseType#getUncertaintyFunctionName()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_UncertaintyFunctionName();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see toolspecific.StringVectorBaseType#getV()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_V();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.StringVectorBaseType#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see toolspecific.StringVectorBaseType#getW()
	 * @see #getStringVectorBaseType()
	 * @generated
	 */
	EAttribute getStringVectorBaseType_W();

	/**
	 * Returns the meta object for class '{@link toolspecific.TimeBaseType <em>Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Base Type</em>'.
	 * @see toolspecific.TimeBaseType
	 * @generated
	 */
	EClass getTimeBaseType();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.TimeBaseType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see toolspecific.TimeBaseType#getValue()
	 * @see #getTimeBaseType()
	 * @generated
	 */
	EAttribute getTimeBaseType_Value();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.TimeBaseType#getExternalDataDirectory <em>External Data Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Directory</em>'.
	 * @see toolspecific.TimeBaseType#getExternalDataDirectory()
	 * @see #getTimeBaseType()
	 * @generated
	 */
	EAttribute getTimeBaseType_ExternalDataDirectory();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.TimeBaseType#getExternalDataNodePath <em>External Data Node Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Data Node Path</em>'.
	 * @see toolspecific.TimeBaseType#getExternalDataNodePath()
	 * @see #getTimeBaseType()
	 * @generated
	 */
	EAttribute getTimeBaseType_ExternalDataNodePath();

	/**
	 * Returns the meta object for the attribute '{@link toolspecific.TimeBaseType#getExternalFileName <em>External File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External File Name</em>'.
	 * @see toolspecific.TimeBaseType#getExternalFileName()
	 * @see #getTimeBaseType()
	 * @generated
	 */
	EAttribute getTimeBaseType_ExternalFileName();

	/**
	 * Returns the meta object for enum '{@link toolspecific.RelationalOperatorType <em>Relational Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator Type</em>'.
	 * @see toolspecific.RelationalOperatorType
	 * @generated
	 */
	EEnum getRelationalOperatorType();

	/**
	 * Returns the meta object for enum '{@link toolspecific.SymmetryType <em>Symmetry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symmetry Type</em>'.
	 * @see toolspecific.SymmetryType
	 * @generated
	 */
	EEnum getSymmetryType();

	/**
	 * Returns the meta object for enum '{@link toolspecific.UncertaintyFunctionType <em>Uncertainty Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Uncertainty Function Type</em>'.
	 * @see toolspecific.UncertaintyFunctionType
	 * @generated
	 */
	EEnum getUncertaintyFunctionType();

	/**
	 * Returns the meta object for data type '{@link toolspecific.RelationalOperatorType <em>Relational Operator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Relational Operator Type Object</em>'.
	 * @see toolspecific.RelationalOperatorType
	 * @model instanceClass="toolspecific.RelationalOperatorType"
	 *        extendedMetaData="name='relationalOperator_._type:Object' baseType='relationalOperator_._type'"
	 * @generated
	 */
	EDataType getRelationalOperatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link toolspecific.SymmetryType <em>Symmetry Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Symmetry Type Object</em>'.
	 * @see toolspecific.SymmetryType
	 * @model instanceClass="toolspecific.SymmetryType"
	 *        extendedMetaData="name='symmetry_._type:Object' baseType='symmetry_._type'"
	 * @generated
	 */
	EDataType getSymmetryTypeObject();

	/**
	 * Returns the meta object for data type '{@link toolspecific.UncertaintyFunctionType <em>Uncertainty Function Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uncertainty Function Type Object</em>'.
	 * @see toolspecific.UncertaintyFunctionType
	 * @model instanceClass="toolspecific.UncertaintyFunctionType"
	 *        extendedMetaData="name='uncertaintyFunctionType:Object' baseType='uncertaintyFunctionType'"
	 * @generated
	 */
	EDataType getUncertaintyFunctionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolspecificFactory getToolspecificFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link toolspecific.impl.BooleanBaseTypeImpl <em>Boolean Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.BooleanBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getBooleanBaseType()
		 * @generated
		 */
		EClass BOOLEAN_BASE_TYPE = eINSTANCE.getBooleanBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BASE_TYPE__VALUE = eINSTANCE.getBooleanBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getBooleanBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getBooleanBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getBooleanBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.ComplexBaseTypeImpl <em>Complex Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.ComplexBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getComplexBaseType()
		 * @generated
		 */
		EClass COMPLEX_BASE_TYPE = eINSTANCE.getComplexBaseType();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getComplexBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getComplexBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getComplexBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.DateBaseTypeImpl <em>Date Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.DateBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getDateBaseType()
		 * @generated
		 */
		EClass DATE_BASE_TYPE = eINSTANCE.getDateBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_BASE_TYPE__VALUE = eINSTANCE.getDateBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getDateBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getDateBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getDateBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.DateTimeBaseTypeImpl <em>Date Time Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.DateTimeBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getDateTimeBaseType()
		 * @generated
		 */
		EClass DATE_TIME_BASE_TYPE = eINSTANCE.getDateTimeBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_BASE_TYPE__VALUE = eINSTANCE.getDateTimeBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getDateTimeBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getDateTimeBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getDateTimeBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.DocumentRootImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Paxelerate Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PAXELERATE_TYPE = eINSTANCE.getDocumentRoot_PaxelerateType();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.DoorSelectionTypeImpl <em>Door Selection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.DoorSelectionTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getDoorSelectionType()
		 * @generated
		 */
		EClass DOOR_SELECTION_TYPE = eINSTANCE.getDoorSelectionType();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.DoubleBaseTypeImpl <em>Double Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.DoubleBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getDoubleBaseType()
		 * @generated
		 */
		EClass DOUBLE_BASE_TYPE = eINSTANCE.getDoubleBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__VALUE = eINSTANCE.getDoubleBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__A = eINSTANCE.getDoubleBaseType_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__B = eINSTANCE.getDoubleBaseType_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__C = eINSTANCE.getDoubleBaseType_C();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__DELTA = eINSTANCE.getDoubleBaseType_Delta();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getDoubleBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getDoubleBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getDoubleBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '<em><b>Mu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__MU = eINSTANCE.getDoubleBaseType_Mu();

		/**
		 * The meta object literal for the '<em><b>Uncertainty Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME = eINSTANCE.getDoubleBaseType_UncertaintyFunctionName();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__V = eINSTANCE.getDoubleBaseType_V();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_BASE_TYPE__W = eINSTANCE.getDoubleBaseType_W();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.DoubleConstraintBaseTypeImpl <em>Double Constraint Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.DoubleConstraintBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getDoubleConstraintBaseType()
		 * @generated
		 */
		EClass DOUBLE_CONSTRAINT_BASE_TYPE = eINSTANCE.getDoubleConstraintBaseType();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR = eINSTANCE
				.getDoubleConstraintBaseType_RelationalOperator();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.IntegerBaseTypeImpl <em>Integer Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.IntegerBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getIntegerBaseType()
		 * @generated
		 */
		EClass INTEGER_BASE_TYPE = eINSTANCE.getIntegerBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_BASE_TYPE__VALUE = eINSTANCE.getIntegerBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getIntegerBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getIntegerBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getIntegerBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.PassengerSortingSchemeTypeImpl <em>Passenger Sorting Scheme Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.PassengerSortingSchemeTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getPassengerSortingSchemeType()
		 * @generated
		 */
		EClass PASSENGER_SORTING_SCHEME_TYPE = eINSTANCE.getPassengerSortingSchemeType();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.PaxelerateInputTypeImpl <em>Paxelerate Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.PaxelerateInputTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getPaxelerateInputType()
		 * @generated
		 */
		EClass PAXELERATE_INPUT_TYPE = eINSTANCE.getPaxelerateInputType();

		/**
		 * The meta object literal for the '<em><b>Load Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__LOAD_FACTOR = eINSTANCE.getPaxelerateInputType_LoadFactor();

		/**
		 * The meta object literal for the '<em><b>Active Door UI Ds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__ACTIVE_DOOR_UI_DS = eINSTANCE.getPaxelerateInputType_ActiveDoorUIDs();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__ITERATIONS = eINSTANCE.getPaxelerateInputType_Iterations();

		/**
		 * The meta object literal for the '<em><b>Simulation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__SIMULATION_TYPE = eINSTANCE.getPaxelerateInputType_SimulationType();

		/**
		 * The meta object literal for the '<em><b>Display Simulation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__DISPLAY_SIMULATION = eINSTANCE.getPaxelerateInputType_DisplaySimulation();

		/**
		 * The meta object literal for the '<em><b>Seat Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__SEAT_TYPE = eINSTANCE.getPaxelerateInputType_SeatType();

		/**
		 * The meta object literal for the '<em><b>Simulation Grid Resolution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__SIMULATION_GRID_RESOLUTION = eINSTANCE
				.getPaxelerateInputType_SimulationGridResolution();

		/**
		 * The meta object literal for the '<em><b>Simulation Speed Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__SIMULATION_SPEED_FACTOR = eINSTANCE
				.getPaxelerateInputType_SimulationSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Passenger Sorting Scheme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__PASSENGER_SORTING_SCHEME = eINSTANCE
				.getPaxelerateInputType_PassengerSortingScheme();

		/**
		 * The meta object literal for the '<em><b>Passenger Agressive Mood Share</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__PASSENGER_AGRESSIVE_MOOD_SHARE = eINSTANCE
				.getPaxelerateInputType_PassengerAgressiveMoodShare();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Mean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_MEAN = eINSTANCE
				.getPaxelerateInputType_SeatInterferenceProcessTimeMean();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Deviation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION = eINSTANCE
				.getPaxelerateInputType_SeatInterferenceProcessTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Door Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__DOOR_SELECTION = eINSTANCE.getPaxelerateInputType_DoorSelection();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Jackets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS = eINSTANCE
				.getPaxelerateInputType_PercentageOfPassengersWithJackets();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Small Bags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS = eINSTANCE
				.getPaxelerateInputType_PercentageOfPassengersWithSmallBags();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Medium Bags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS = eINSTANCE
				.getPaxelerateInputType_PercentageOfPassengersWithMediumBags();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Large Bags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS = eINSTANCE
				.getPaxelerateInputType_PercentageOfPassengersWithLargeBags();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAXELERATE_INPUT_TYPE__UID = eINSTANCE.getPaxelerateInputType_UID();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.PaxelerateTypeImpl <em>Paxelerate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.PaxelerateTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getPaxelerateType()
		 * @generated
		 */
		EClass PAXELERATE_TYPE = eINSTANCE.getPaxelerateType();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_TYPE__INPUT = eINSTANCE.getPaxelerateType_Input();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.SeatTypeTypeImpl <em>Seat Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.SeatTypeTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getSeatTypeType()
		 * @generated
		 */
		EClass SEAT_TYPE_TYPE = eINSTANCE.getSeatTypeType();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.SimulationTypeTypeImpl <em>Simulation Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.SimulationTypeTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getSimulationTypeType()
		 * @generated
		 */
		EClass SIMULATION_TYPE_TYPE = eINSTANCE.getSimulationTypeType();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.StringArrayBaseTypeImpl <em>String Array Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.StringArrayBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getStringArrayBaseType()
		 * @generated
		 */
		EClass STRING_ARRAY_BASE_TYPE = eINSTANCE.getStringArrayBaseType();

		/**
		 * The meta object literal for the '<em><b>Map Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ARRAY_BASE_TYPE__MAP_TYPE = eINSTANCE.getStringArrayBaseType_MapType();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.StringBaseTypeImpl <em>String Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.StringBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getStringBaseType()
		 * @generated
		 */
		EClass STRING_BASE_TYPE = eINSTANCE.getStringBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_BASE_TYPE__VALUE = eINSTANCE.getStringBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getStringBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getStringBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getStringBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.StringUIDBaseTypeImpl <em>String UID Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.StringUIDBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getStringUIDBaseType()
		 * @generated
		 */
		EClass STRING_UID_BASE_TYPE = eINSTANCE.getStringUIDBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_UID_BASE_TYPE__VALUE = eINSTANCE.getStringUIDBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>Is Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_UID_BASE_TYPE__IS_LINK = eINSTANCE.getStringUIDBaseType_IsLink();

		/**
		 * The meta object literal for the '<em><b>Symmetry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_UID_BASE_TYPE__SYMMETRY = eINSTANCE.getStringUIDBaseType_Symmetry();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.StringVectorBaseTypeImpl <em>String Vector Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.StringVectorBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getStringVectorBaseType()
		 * @generated
		 */
		EClass STRING_VECTOR_BASE_TYPE = eINSTANCE.getStringVectorBaseType();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__A = eINSTANCE.getStringVectorBaseType_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__B = eINSTANCE.getStringVectorBaseType_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__C = eINSTANCE.getStringVectorBaseType_C();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__DELTA = eINSTANCE.getStringVectorBaseType_Delta();

		/**
		 * The meta object literal for the '<em><b>Map Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__MAP_TYPE = eINSTANCE.getStringVectorBaseType_MapType();

		/**
		 * The meta object literal for the '<em><b>Mu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__MU = eINSTANCE.getStringVectorBaseType_Mu();

		/**
		 * The meta object literal for the '<em><b>Uncertainty Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME = eINSTANCE
				.getStringVectorBaseType_UncertaintyFunctionName();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__V = eINSTANCE.getStringVectorBaseType_V();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VECTOR_BASE_TYPE__W = eINSTANCE.getStringVectorBaseType_W();

		/**
		 * The meta object literal for the '{@link toolspecific.impl.TimeBaseTypeImpl <em>Time Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.impl.TimeBaseTypeImpl
		 * @see toolspecific.impl.ToolspecificPackageImpl#getTimeBaseType()
		 * @generated
		 */
		EClass TIME_BASE_TYPE = eINSTANCE.getTimeBaseType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASE_TYPE__VALUE = eINSTANCE.getTimeBaseType_Value();

		/**
		 * The meta object literal for the '<em><b>External Data Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASE_TYPE__EXTERNAL_DATA_DIRECTORY = eINSTANCE.getTimeBaseType_ExternalDataDirectory();

		/**
		 * The meta object literal for the '<em><b>External Data Node Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASE_TYPE__EXTERNAL_DATA_NODE_PATH = eINSTANCE.getTimeBaseType_ExternalDataNodePath();

		/**
		 * The meta object literal for the '<em><b>External File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASE_TYPE__EXTERNAL_FILE_NAME = eINSTANCE.getTimeBaseType_ExternalFileName();

		/**
		 * The meta object literal for the '{@link toolspecific.RelationalOperatorType <em>Relational Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.RelationalOperatorType
		 * @see toolspecific.impl.ToolspecificPackageImpl#getRelationalOperatorType()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR_TYPE = eINSTANCE.getRelationalOperatorType();

		/**
		 * The meta object literal for the '{@link toolspecific.SymmetryType <em>Symmetry Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.SymmetryType
		 * @see toolspecific.impl.ToolspecificPackageImpl#getSymmetryType()
		 * @generated
		 */
		EEnum SYMMETRY_TYPE = eINSTANCE.getSymmetryType();

		/**
		 * The meta object literal for the '{@link toolspecific.UncertaintyFunctionType <em>Uncertainty Function Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.UncertaintyFunctionType
		 * @see toolspecific.impl.ToolspecificPackageImpl#getUncertaintyFunctionType()
		 * @generated
		 */
		EEnum UNCERTAINTY_FUNCTION_TYPE = eINSTANCE.getUncertaintyFunctionType();

		/**
		 * The meta object literal for the '<em>Relational Operator Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.RelationalOperatorType
		 * @see toolspecific.impl.ToolspecificPackageImpl#getRelationalOperatorTypeObject()
		 * @generated
		 */
		EDataType RELATIONAL_OPERATOR_TYPE_OBJECT = eINSTANCE.getRelationalOperatorTypeObject();

		/**
		 * The meta object literal for the '<em>Symmetry Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.SymmetryType
		 * @see toolspecific.impl.ToolspecificPackageImpl#getSymmetryTypeObject()
		 * @generated
		 */
		EDataType SYMMETRY_TYPE_OBJECT = eINSTANCE.getSymmetryTypeObject();

		/**
		 * The meta object literal for the '<em>Uncertainty Function Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see toolspecific.UncertaintyFunctionType
		 * @see toolspecific.impl.ToolspecificPackageImpl#getUncertaintyFunctionTypeObject()
		 * @generated
		 */
		EDataType UNCERTAINTY_FUNCTION_TYPE_OBJECT = eINSTANCE.getUncertaintyFunctionTypeObject();

	}

} //ToolspecificPackage
