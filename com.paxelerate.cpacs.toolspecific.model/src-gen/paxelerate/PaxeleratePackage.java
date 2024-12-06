/**
 */
package paxelerate;

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
 * @see paxelerate.PaxelerateFactory
 * @model kind="package"
 * @generated
 */
public interface PaxeleratePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "paxelerate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "paxelerate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "paxelerate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaxeleratePackage eINSTANCE = paxelerate.impl.PaxeleratePackageImpl.init();

	/**
	 * The meta object id for the '{@link paxelerate.impl.BoardingTimePerDoorTypeImpl <em>Boarding Time Per Door Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.BoardingTimePerDoorTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getBoardingTimePerDoorType()
	 * @generated
	 */
	int BOARDING_TIME_PER_DOOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIME_PER_DOOR_TYPE__TIME = 0;

	/**
	 * The feature id for the '<em><b>Door UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID = 1;

	/**
	 * The number of structural features of the '<em>Boarding Time Per Door Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIME_PER_DOOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Boarding Time Per Door Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIME_PER_DOOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.BoardingTimesPerDoorTypeImpl <em>Boarding Times Per Door Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.BoardingTimesPerDoorTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getBoardingTimesPerDoorType()
	 * @generated
	 */
	int BOARDING_TIMES_PER_DOOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Boarding Time Per Door</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR = 0;

	/**
	 * The number of structural features of the '<em>Boarding Times Per Door Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIMES_PER_DOOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Boarding Times Per Door Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARDING_TIMES_PER_DOOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.DocumentRootImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENT = 3;

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
	 * The meta object id for the '{@link paxelerate.impl.PaxelerateInputTypeImpl <em>Input Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.PaxelerateInputTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateInputType()
	 * @generated
	 */
	int PAXELERATE_INPUT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE__STUDIES = 0;

	/**
	 * The number of structural features of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_INPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.PaxelerateOutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.PaxelerateOutputTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateOutputType()
	 * @generated
	 */
	int PAXELERATE_OUTPUT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Studies Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_OUTPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.PaxelerateSettingsTypeImpl <em>Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.PaxelerateSettingsTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateSettingsType()
	 * @generated
	 */
	int PAXELERATE_SETTINGS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Display Simulation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION = 0;

	/**
	 * The number of structural features of the '<em>Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_SETTINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_SETTINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.PaxelerateTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.PaxelerateTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateType()
	 * @generated
	 */
	int PAXELERATE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE__OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAXELERATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.StudiesOutputTypeImpl <em>Studies Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.StudiesOutputTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getStudiesOutputType()
	 * @generated
	 */
	int STUDIES_OUTPUT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Study Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_OUTPUT_TYPE__STUDY_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Studies Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_OUTPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Studies Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.StudiesTypeImpl <em>Studies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.StudiesTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getStudiesType()
	 * @generated
	 */
	int STUDIES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Study</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_TYPE__STUDY = 0;

	/**
	 * The number of structural features of the '<em>Studies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Studies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.StudyIterationOutputTypeImpl <em>Study Iteration Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.StudyIterationOutputTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyIterationOutputType()
	 * @generated
	 */
	int STUDY_ITERATION_OUTPUT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_ITERATION_OUTPUT_TYPE__BOARDING_TIME = 0;

	/**
	 * The number of structural features of the '<em>Study Iteration Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_ITERATION_OUTPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Study Iteration Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_ITERATION_OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.StudyIterationsOutputTypeImpl <em>Study Iterations Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.StudyIterationsOutputTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyIterationsOutputType()
	 * @generated
	 */
	int STUDY_ITERATIONS_OUTPUT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Study Iteration Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Study Iterations Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_ITERATIONS_OUTPUT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Study Iterations Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_ITERATIONS_OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.StudyOutputTypeImpl <em>Study Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.StudyOutputTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyOutputType()
	 * @generated
	 */
	int STUDY_OUTPUT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Average Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME = 0;

	/**
	 * The feature id for the '<em><b>Average Boarding Times Per Door</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIMES_PER_DOOR = 1;

	/**
	 * The feature id for the '<em><b>Study Iterations Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Linked Study UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OUTPUT_TYPE__LINKED_STUDY_UID = 3;

	/**
	 * The number of structural features of the '<em>Study Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OUTPUT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Study Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_OUTPUT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.impl.StudyTypeImpl <em>Study Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.impl.StudyTypeImpl
	 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyType()
	 * @generated
	 */
	int STUDY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Target Deck UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__TARGET_DECK_UID = 0;

	/**
	 * The feature id for the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__LOAD_FACTOR = 1;

	/**
	 * The feature id for the '<em><b>Active Door UI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__ACTIVE_DOOR_UI_DS = 2;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__ITERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Simulation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__SIMULATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Seat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__SEAT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Simulation Grid Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__SIMULATION_GRID_RESOLUTION = 6;

	/**
	 * The feature id for the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__SIMULATION_SPEED_FACTOR = 7;

	/**
	 * The feature id for the '<em><b>Passenger Sorting Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__PASSENGER_SORTING_SCHEME = 8;

	/**
	 * The feature id for the '<em><b>Door Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__DOOR_SELECTION = 9;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Jackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS = 10;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Small Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS = 11;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Medium Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS = 12;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Large Bags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS = 13;

	/**
	 * The feature id for the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE__UID = 14;

	/**
	 * The number of structural features of the '<em>Study Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Study Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link paxelerate.DoorSelectionType <em>Door Selection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.DoorSelectionType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getDoorSelectionType()
	 * @generated
	 */
	int DOOR_SELECTION_TYPE = 13;

	/**
	 * The meta object id for the '{@link paxelerate.PassengerSortingSchemeType <em>Passenger Sorting Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.PassengerSortingSchemeType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getPassengerSortingSchemeType()
	 * @generated
	 */
	int PASSENGER_SORTING_SCHEME_TYPE = 14;

	/**
	 * The meta object id for the '{@link paxelerate.SeatTypeType <em>Seat Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.SeatTypeType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getSeatTypeType()
	 * @generated
	 */
	int SEAT_TYPE_TYPE = 15;

	/**
	 * The meta object id for the '{@link paxelerate.SimulationTypeType <em>Simulation Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.SimulationTypeType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getSimulationTypeType()
	 * @generated
	 */
	int SIMULATION_TYPE_TYPE = 16;

	/**
	 * The meta object id for the '<em>Door Selection Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.DoorSelectionType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getDoorSelectionTypeObject()
	 * @generated
	 */
	int DOOR_SELECTION_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Passenger Sorting Scheme Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.PassengerSortingSchemeType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getPassengerSortingSchemeTypeObject()
	 * @generated
	 */
	int PASSENGER_SORTING_SCHEME_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Seat Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.SeatTypeType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getSeatTypeTypeObject()
	 * @generated
	 */
	int SEAT_TYPE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Simulation Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see paxelerate.SimulationTypeType
	 * @see paxelerate.impl.PaxeleratePackageImpl#getSimulationTypeTypeObject()
	 * @generated
	 */
	int SIMULATION_TYPE_TYPE_OBJECT = 20;

	/**
	 * Returns the meta object for class '{@link paxelerate.BoardingTimePerDoorType <em>Boarding Time Per Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boarding Time Per Door Type</em>'.
	 * @see paxelerate.BoardingTimePerDoorType
	 * @generated
	 */
	EClass getBoardingTimePerDoorType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.BoardingTimePerDoorType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see paxelerate.BoardingTimePerDoorType#getTime()
	 * @see #getBoardingTimePerDoorType()
	 * @generated
	 */
	EAttribute getBoardingTimePerDoorType_Time();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.BoardingTimePerDoorType#getDoorUID <em>Door UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door UID</em>'.
	 * @see paxelerate.BoardingTimePerDoorType#getDoorUID()
	 * @see #getBoardingTimePerDoorType()
	 * @generated
	 */
	EAttribute getBoardingTimePerDoorType_DoorUID();

	/**
	 * Returns the meta object for class '{@link paxelerate.BoardingTimesPerDoorType <em>Boarding Times Per Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boarding Times Per Door Type</em>'.
	 * @see paxelerate.BoardingTimesPerDoorType
	 * @generated
	 */
	EClass getBoardingTimesPerDoorType();

	/**
	 * Returns the meta object for the containment reference list '{@link paxelerate.BoardingTimesPerDoorType#getBoardingTimePerDoor <em>Boarding Time Per Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boarding Time Per Door</em>'.
	 * @see paxelerate.BoardingTimesPerDoorType#getBoardingTimePerDoor()
	 * @see #getBoardingTimesPerDoorType()
	 * @generated
	 */
	EReference getBoardingTimesPerDoorType_BoardingTimePerDoor();

	/**
	 * Returns the meta object for class '{@link paxelerate.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see paxelerate.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link paxelerate.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see paxelerate.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link paxelerate.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see paxelerate.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link paxelerate.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see paxelerate.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.DocumentRoot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see paxelerate.DocumentRoot#getContent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Content();

	/**
	 * Returns the meta object for class '{@link paxelerate.PaxelerateInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Type</em>'.
	 * @see paxelerate.PaxelerateInputType
	 * @generated
	 */
	EClass getPaxelerateInputType();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.PaxelerateInputType#getStudies <em>Studies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Studies</em>'.
	 * @see paxelerate.PaxelerateInputType#getStudies()
	 * @see #getPaxelerateInputType()
	 * @generated
	 */
	EReference getPaxelerateInputType_Studies();

	/**
	 * Returns the meta object for class '{@link paxelerate.PaxelerateOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see paxelerate.PaxelerateOutputType
	 * @generated
	 */
	EClass getPaxelerateOutputType();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.PaxelerateOutputType#getStudiesOutput <em>Studies Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Studies Output</em>'.
	 * @see paxelerate.PaxelerateOutputType#getStudiesOutput()
	 * @see #getPaxelerateOutputType()
	 * @generated
	 */
	EReference getPaxelerateOutputType_StudiesOutput();

	/**
	 * Returns the meta object for class '{@link paxelerate.PaxelerateSettingsType <em>Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Type</em>'.
	 * @see paxelerate.PaxelerateSettingsType
	 * @generated
	 */
	EClass getPaxelerateSettingsType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.PaxelerateSettingsType#isDisplaySimulation <em>Display Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Simulation</em>'.
	 * @see paxelerate.PaxelerateSettingsType#isDisplaySimulation()
	 * @see #getPaxelerateSettingsType()
	 * @generated
	 */
	EAttribute getPaxelerateSettingsType_DisplaySimulation();

	/**
	 * Returns the meta object for class '{@link paxelerate.PaxelerateType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see paxelerate.PaxelerateType
	 * @generated
	 */
	EClass getPaxelerateType();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.PaxelerateType#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see paxelerate.PaxelerateType#getInput()
	 * @see #getPaxelerateType()
	 * @generated
	 */
	EReference getPaxelerateType_Input();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.PaxelerateType#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see paxelerate.PaxelerateType#getOutput()
	 * @see #getPaxelerateType()
	 * @generated
	 */
	EReference getPaxelerateType_Output();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.PaxelerateType#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see paxelerate.PaxelerateType#getSettings()
	 * @see #getPaxelerateType()
	 * @generated
	 */
	EReference getPaxelerateType_Settings();

	/**
	 * Returns the meta object for class '{@link paxelerate.StudiesOutputType <em>Studies Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studies Output Type</em>'.
	 * @see paxelerate.StudiesOutputType
	 * @generated
	 */
	EClass getStudiesOutputType();

	/**
	 * Returns the meta object for the containment reference list '{@link paxelerate.StudiesOutputType#getStudyOutput <em>Study Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Output</em>'.
	 * @see paxelerate.StudiesOutputType#getStudyOutput()
	 * @see #getStudiesOutputType()
	 * @generated
	 */
	EReference getStudiesOutputType_StudyOutput();

	/**
	 * Returns the meta object for class '{@link paxelerate.StudiesType <em>Studies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studies Type</em>'.
	 * @see paxelerate.StudiesType
	 * @generated
	 */
	EClass getStudiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link paxelerate.StudiesType#getStudy <em>Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study</em>'.
	 * @see paxelerate.StudiesType#getStudy()
	 * @see #getStudiesType()
	 * @generated
	 */
	EReference getStudiesType_Study();

	/**
	 * Returns the meta object for class '{@link paxelerate.StudyIterationOutputType <em>Study Iteration Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Iteration Output Type</em>'.
	 * @see paxelerate.StudyIterationOutputType
	 * @generated
	 */
	EClass getStudyIterationOutputType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyIterationOutputType#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see paxelerate.StudyIterationOutputType#getBoardingTime()
	 * @see #getStudyIterationOutputType()
	 * @generated
	 */
	EAttribute getStudyIterationOutputType_BoardingTime();

	/**
	 * Returns the meta object for class '{@link paxelerate.StudyIterationsOutputType <em>Study Iterations Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Iterations Output Type</em>'.
	 * @see paxelerate.StudyIterationsOutputType
	 * @generated
	 */
	EClass getStudyIterationsOutputType();

	/**
	 * Returns the meta object for the containment reference list '{@link paxelerate.StudyIterationsOutputType#getStudyIterationOutput <em>Study Iteration Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Iteration Output</em>'.
	 * @see paxelerate.StudyIterationsOutputType#getStudyIterationOutput()
	 * @see #getStudyIterationsOutputType()
	 * @generated
	 */
	EReference getStudyIterationsOutputType_StudyIterationOutput();

	/**
	 * Returns the meta object for class '{@link paxelerate.StudyOutputType <em>Study Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Output Type</em>'.
	 * @see paxelerate.StudyOutputType
	 * @generated
	 */
	EClass getStudyOutputType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyOutputType#getAverageBoardingTime <em>Average Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Boarding Time</em>'.
	 * @see paxelerate.StudyOutputType#getAverageBoardingTime()
	 * @see #getStudyOutputType()
	 * @generated
	 */
	EAttribute getStudyOutputType_AverageBoardingTime();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.StudyOutputType#getAverageBoardingTimesPerDoor <em>Average Boarding Times Per Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Average Boarding Times Per Door</em>'.
	 * @see paxelerate.StudyOutputType#getAverageBoardingTimesPerDoor()
	 * @see #getStudyOutputType()
	 * @generated
	 */
	EReference getStudyOutputType_AverageBoardingTimesPerDoor();

	/**
	 * Returns the meta object for the containment reference '{@link paxelerate.StudyOutputType#getStudyIterationsOutput <em>Study Iterations Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Study Iterations Output</em>'.
	 * @see paxelerate.StudyOutputType#getStudyIterationsOutput()
	 * @see #getStudyOutputType()
	 * @generated
	 */
	EReference getStudyOutputType_StudyIterationsOutput();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyOutputType#getLinkedStudyUID <em>Linked Study UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked Study UID</em>'.
	 * @see paxelerate.StudyOutputType#getLinkedStudyUID()
	 * @see #getStudyOutputType()
	 * @generated
	 */
	EAttribute getStudyOutputType_LinkedStudyUID();

	/**
	 * Returns the meta object for class '{@link paxelerate.StudyType <em>Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Type</em>'.
	 * @see paxelerate.StudyType
	 * @generated
	 */
	EClass getStudyType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getTargetDeckUID <em>Target Deck UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Deck UID</em>'.
	 * @see paxelerate.StudyType#getTargetDeckUID()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_TargetDeckUID();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getLoadFactor <em>Load Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Factor</em>'.
	 * @see paxelerate.StudyType#getLoadFactor()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_LoadFactor();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getActiveDoorUIDs <em>Active Door UI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Door UI Ds</em>'.
	 * @see paxelerate.StudyType#getActiveDoorUIDs()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_ActiveDoorUIDs();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see paxelerate.StudyType#getIterations()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getSimulationType <em>Simulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Type</em>'.
	 * @see paxelerate.StudyType#getSimulationType()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_SimulationType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getSeatType <em>Seat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Type</em>'.
	 * @see paxelerate.StudyType#getSeatType()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_SeatType();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getSimulationGridResolution <em>Simulation Grid Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Grid Resolution</em>'.
	 * @see paxelerate.StudyType#getSimulationGridResolution()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_SimulationGridResolution();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Speed Factor</em>'.
	 * @see paxelerate.StudyType#getSimulationSpeedFactor()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_SimulationSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getPassengerSortingScheme <em>Passenger Sorting Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Sorting Scheme</em>'.
	 * @see paxelerate.StudyType#getPassengerSortingScheme()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_PassengerSortingScheme();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getDoorSelection <em>Door Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door Selection</em>'.
	 * @see paxelerate.StudyType#getDoorSelection()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_DoorSelection();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getPercentageOfPassengersWithJackets <em>Percentage Of Passengers With Jackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Jackets</em>'.
	 * @see paxelerate.StudyType#getPercentageOfPassengersWithJackets()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_PercentageOfPassengersWithJackets();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getPercentageOfPassengersWithSmallBags <em>Percentage Of Passengers With Small Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Small Bags</em>'.
	 * @see paxelerate.StudyType#getPercentageOfPassengersWithSmallBags()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_PercentageOfPassengersWithSmallBags();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getPercentageOfPassengersWithMediumBags <em>Percentage Of Passengers With Medium Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Medium Bags</em>'.
	 * @see paxelerate.StudyType#getPercentageOfPassengersWithMediumBags()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_PercentageOfPassengersWithMediumBags();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getPercentageOfPassengersWithLargeBags <em>Percentage Of Passengers With Large Bags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Large Bags</em>'.
	 * @see paxelerate.StudyType#getPercentageOfPassengersWithLargeBags()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_PercentageOfPassengersWithLargeBags();

	/**
	 * Returns the meta object for the attribute '{@link paxelerate.StudyType#getUID <em>UID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UID</em>'.
	 * @see paxelerate.StudyType#getUID()
	 * @see #getStudyType()
	 * @generated
	 */
	EAttribute getStudyType_UID();

	/**
	 * Returns the meta object for enum '{@link paxelerate.DoorSelectionType <em>Door Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Selection Type</em>'.
	 * @see paxelerate.DoorSelectionType
	 * @generated
	 */
	EEnum getDoorSelectionType();

	/**
	 * Returns the meta object for enum '{@link paxelerate.PassengerSortingSchemeType <em>Passenger Sorting Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passenger Sorting Scheme Type</em>'.
	 * @see paxelerate.PassengerSortingSchemeType
	 * @generated
	 */
	EEnum getPassengerSortingSchemeType();

	/**
	 * Returns the meta object for enum '{@link paxelerate.SeatTypeType <em>Seat Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seat Type Type</em>'.
	 * @see paxelerate.SeatTypeType
	 * @generated
	 */
	EEnum getSeatTypeType();

	/**
	 * Returns the meta object for enum '{@link paxelerate.SimulationTypeType <em>Simulation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Simulation Type Type</em>'.
	 * @see paxelerate.SimulationTypeType
	 * @generated
	 */
	EEnum getSimulationTypeType();

	/**
	 * Returns the meta object for data type '{@link paxelerate.DoorSelectionType <em>Door Selection Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Door Selection Type Object</em>'.
	 * @see paxelerate.DoorSelectionType
	 * @model instanceClass="paxelerate.DoorSelectionType"
	 *        extendedMetaData="name='doorSelectionType:Object' baseType='doorSelectionType'"
	 * @generated
	 */
	EDataType getDoorSelectionTypeObject();

	/**
	 * Returns the meta object for data type '{@link paxelerate.PassengerSortingSchemeType <em>Passenger Sorting Scheme Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Passenger Sorting Scheme Type Object</em>'.
	 * @see paxelerate.PassengerSortingSchemeType
	 * @model instanceClass="paxelerate.PassengerSortingSchemeType"
	 *        extendedMetaData="name='passengerSortingSchemeType:Object' baseType='passengerSortingSchemeType'"
	 * @generated
	 */
	EDataType getPassengerSortingSchemeTypeObject();

	/**
	 * Returns the meta object for data type '{@link paxelerate.SeatTypeType <em>Seat Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Seat Type Type Object</em>'.
	 * @see paxelerate.SeatTypeType
	 * @model instanceClass="paxelerate.SeatTypeType"
	 *        extendedMetaData="name='seatTypeType:Object' baseType='seatTypeType'"
	 * @generated
	 */
	EDataType getSeatTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link paxelerate.SimulationTypeType <em>Simulation Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simulation Type Type Object</em>'.
	 * @see paxelerate.SimulationTypeType
	 * @model instanceClass="paxelerate.SimulationTypeType"
	 *        extendedMetaData="name='simulationTypeType:Object' baseType='simulationTypeType'"
	 * @generated
	 */
	EDataType getSimulationTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaxelerateFactory getPaxelerateFactory();

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
		 * The meta object literal for the '{@link paxelerate.impl.BoardingTimePerDoorTypeImpl <em>Boarding Time Per Door Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.BoardingTimePerDoorTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getBoardingTimePerDoorType()
		 * @generated
		 */
		EClass BOARDING_TIME_PER_DOOR_TYPE = eINSTANCE.getBoardingTimePerDoorType();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARDING_TIME_PER_DOOR_TYPE__TIME = eINSTANCE.getBoardingTimePerDoorType_Time();

		/**
		 * The meta object literal for the '<em><b>Door UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARDING_TIME_PER_DOOR_TYPE__DOOR_UID = eINSTANCE.getBoardingTimePerDoorType_DoorUID();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.BoardingTimesPerDoorTypeImpl <em>Boarding Times Per Door Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.BoardingTimesPerDoorTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getBoardingTimesPerDoorType()
		 * @generated
		 */
		EClass BOARDING_TIMES_PER_DOOR_TYPE = eINSTANCE.getBoardingTimesPerDoorType();

		/**
		 * The meta object literal for the '<em><b>Boarding Time Per Door</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARDING_TIMES_PER_DOOR_TYPE__BOARDING_TIME_PER_DOOR = eINSTANCE
				.getBoardingTimesPerDoorType_BoardingTimePerDoor();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.DocumentRootImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTENT = eINSTANCE.getDocumentRoot_Content();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.PaxelerateInputTypeImpl <em>Input Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.PaxelerateInputTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateInputType()
		 * @generated
		 */
		EClass PAXELERATE_INPUT_TYPE = eINSTANCE.getPaxelerateInputType();

		/**
		 * The meta object literal for the '<em><b>Studies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_INPUT_TYPE__STUDIES = eINSTANCE.getPaxelerateInputType_Studies();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.PaxelerateOutputTypeImpl <em>Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.PaxelerateOutputTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateOutputType()
		 * @generated
		 */
		EClass PAXELERATE_OUTPUT_TYPE = eINSTANCE.getPaxelerateOutputType();

		/**
		 * The meta object literal for the '<em><b>Studies Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT = eINSTANCE.getPaxelerateOutputType_StudiesOutput();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.PaxelerateSettingsTypeImpl <em>Settings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.PaxelerateSettingsTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateSettingsType()
		 * @generated
		 */
		EClass PAXELERATE_SETTINGS_TYPE = eINSTANCE.getPaxelerateSettingsType();

		/**
		 * The meta object literal for the '<em><b>Display Simulation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION = eINSTANCE
				.getPaxelerateSettingsType_DisplaySimulation();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.PaxelerateTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.PaxelerateTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getPaxelerateType()
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
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_TYPE__OUTPUT = eINSTANCE.getPaxelerateType_Output();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAXELERATE_TYPE__SETTINGS = eINSTANCE.getPaxelerateType_Settings();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.StudiesOutputTypeImpl <em>Studies Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.StudiesOutputTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getStudiesOutputType()
		 * @generated
		 */
		EClass STUDIES_OUTPUT_TYPE = eINSTANCE.getStudiesOutputType();

		/**
		 * The meta object literal for the '<em><b>Study Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDIES_OUTPUT_TYPE__STUDY_OUTPUT = eINSTANCE.getStudiesOutputType_StudyOutput();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.StudiesTypeImpl <em>Studies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.StudiesTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getStudiesType()
		 * @generated
		 */
		EClass STUDIES_TYPE = eINSTANCE.getStudiesType();

		/**
		 * The meta object literal for the '<em><b>Study</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDIES_TYPE__STUDY = eINSTANCE.getStudiesType_Study();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.StudyIterationOutputTypeImpl <em>Study Iteration Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.StudyIterationOutputTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyIterationOutputType()
		 * @generated
		 */
		EClass STUDY_ITERATION_OUTPUT_TYPE = eINSTANCE.getStudyIterationOutputType();

		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_ITERATION_OUTPUT_TYPE__BOARDING_TIME = eINSTANCE.getStudyIterationOutputType_BoardingTime();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.StudyIterationsOutputTypeImpl <em>Study Iterations Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.StudyIterationsOutputTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyIterationsOutputType()
		 * @generated
		 */
		EClass STUDY_ITERATIONS_OUTPUT_TYPE = eINSTANCE.getStudyIterationsOutputType();

		/**
		 * The meta object literal for the '<em><b>Study Iteration Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_ITERATIONS_OUTPUT_TYPE__STUDY_ITERATION_OUTPUT = eINSTANCE
				.getStudyIterationsOutputType_StudyIterationOutput();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.StudyOutputTypeImpl <em>Study Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.StudyOutputTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyOutputType()
		 * @generated
		 */
		EClass STUDY_OUTPUT_TYPE = eINSTANCE.getStudyOutputType();

		/**
		 * The meta object literal for the '<em><b>Average Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME = eINSTANCE.getStudyOutputType_AverageBoardingTime();

		/**
		 * The meta object literal for the '<em><b>Average Boarding Times Per Door</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIMES_PER_DOOR = eINSTANCE
				.getStudyOutputType_AverageBoardingTimesPerDoor();

		/**
		 * The meta object literal for the '<em><b>Study Iterations Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT = eINSTANCE.getStudyOutputType_StudyIterationsOutput();

		/**
		 * The meta object literal for the '<em><b>Linked Study UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_OUTPUT_TYPE__LINKED_STUDY_UID = eINSTANCE.getStudyOutputType_LinkedStudyUID();

		/**
		 * The meta object literal for the '{@link paxelerate.impl.StudyTypeImpl <em>Study Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.impl.StudyTypeImpl
		 * @see paxelerate.impl.PaxeleratePackageImpl#getStudyType()
		 * @generated
		 */
		EClass STUDY_TYPE = eINSTANCE.getStudyType();

		/**
		 * The meta object literal for the '<em><b>Target Deck UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__TARGET_DECK_UID = eINSTANCE.getStudyType_TargetDeckUID();

		/**
		 * The meta object literal for the '<em><b>Load Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__LOAD_FACTOR = eINSTANCE.getStudyType_LoadFactor();

		/**
		 * The meta object literal for the '<em><b>Active Door UI Ds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__ACTIVE_DOOR_UI_DS = eINSTANCE.getStudyType_ActiveDoorUIDs();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__ITERATIONS = eINSTANCE.getStudyType_Iterations();

		/**
		 * The meta object literal for the '<em><b>Simulation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__SIMULATION_TYPE = eINSTANCE.getStudyType_SimulationType();

		/**
		 * The meta object literal for the '<em><b>Seat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__SEAT_TYPE = eINSTANCE.getStudyType_SeatType();

		/**
		 * The meta object literal for the '<em><b>Simulation Grid Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__SIMULATION_GRID_RESOLUTION = eINSTANCE.getStudyType_SimulationGridResolution();

		/**
		 * The meta object literal for the '<em><b>Simulation Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__SIMULATION_SPEED_FACTOR = eINSTANCE.getStudyType_SimulationSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Passenger Sorting Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__PASSENGER_SORTING_SCHEME = eINSTANCE.getStudyType_PassengerSortingScheme();

		/**
		 * The meta object literal for the '<em><b>Door Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__DOOR_SELECTION = eINSTANCE.getStudyType_DoorSelection();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Jackets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS = eINSTANCE
				.getStudyType_PercentageOfPassengersWithJackets();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Small Bags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS = eINSTANCE
				.getStudyType_PercentageOfPassengersWithSmallBags();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Medium Bags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS = eINSTANCE
				.getStudyType_PercentageOfPassengersWithMediumBags();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Large Bags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS = eINSTANCE
				.getStudyType_PercentageOfPassengersWithLargeBags();

		/**
		 * The meta object literal for the '<em><b>UID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_TYPE__UID = eINSTANCE.getStudyType_UID();

		/**
		 * The meta object literal for the '{@link paxelerate.DoorSelectionType <em>Door Selection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.DoorSelectionType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getDoorSelectionType()
		 * @generated
		 */
		EEnum DOOR_SELECTION_TYPE = eINSTANCE.getDoorSelectionType();

		/**
		 * The meta object literal for the '{@link paxelerate.PassengerSortingSchemeType <em>Passenger Sorting Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.PassengerSortingSchemeType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getPassengerSortingSchemeType()
		 * @generated
		 */
		EEnum PASSENGER_SORTING_SCHEME_TYPE = eINSTANCE.getPassengerSortingSchemeType();

		/**
		 * The meta object literal for the '{@link paxelerate.SeatTypeType <em>Seat Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.SeatTypeType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getSeatTypeType()
		 * @generated
		 */
		EEnum SEAT_TYPE_TYPE = eINSTANCE.getSeatTypeType();

		/**
		 * The meta object literal for the '{@link paxelerate.SimulationTypeType <em>Simulation Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.SimulationTypeType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getSimulationTypeType()
		 * @generated
		 */
		EEnum SIMULATION_TYPE_TYPE = eINSTANCE.getSimulationTypeType();

		/**
		 * The meta object literal for the '<em>Door Selection Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.DoorSelectionType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getDoorSelectionTypeObject()
		 * @generated
		 */
		EDataType DOOR_SELECTION_TYPE_OBJECT = eINSTANCE.getDoorSelectionTypeObject();

		/**
		 * The meta object literal for the '<em>Passenger Sorting Scheme Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.PassengerSortingSchemeType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getPassengerSortingSchemeTypeObject()
		 * @generated
		 */
		EDataType PASSENGER_SORTING_SCHEME_TYPE_OBJECT = eINSTANCE.getPassengerSortingSchemeTypeObject();

		/**
		 * The meta object literal for the '<em>Seat Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.SeatTypeType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getSeatTypeTypeObject()
		 * @generated
		 */
		EDataType SEAT_TYPE_TYPE_OBJECT = eINSTANCE.getSeatTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Simulation Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see paxelerate.SimulationTypeType
		 * @see paxelerate.impl.PaxeleratePackageImpl#getSimulationTypeTypeObject()
		 * @generated
		 */
		EDataType SIMULATION_TYPE_TYPE_OBJECT = eINSTANCE.getSimulationTypeTypeObject();

	}

} //PaxeleratePackage
