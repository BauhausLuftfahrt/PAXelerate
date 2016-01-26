/**
 */
package model;

import net.bhl.cdt.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see model.Paxelerate ModelFactory
 * @model kind="package"
 * @generated
 */
public interface Paxelerate ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://paxelerate.com/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.paxelerate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Paxelerate ModelPackage eINSTANCE = model.impl.Paxelerate ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.CabinImpl <em>Cabin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CabinImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getCabin()
	 * @generated
	 */
	int CABIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cabin Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CABIN_LENGTH = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cabin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CABIN_WIDTH = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row Nonexistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__ROW_NONEXISTENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aisle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__AISLE_WIDTH = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Frames Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__FRAMES_PER_SECOND = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Of Decks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NUMBER_OF_DECKS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Simulation Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SIMULATION_SETTINGS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CLASSES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__DOORS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lavatories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__LAVATORIES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Galleys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__GALLEYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stairways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STAIRWAYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Curtains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CURTAINS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stowages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STOWAGES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SCALE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Aircraft Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__AIRCRAFT_TYPE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Use Preset Settings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__USE_PRESET_SETTINGS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SPEED_FACTOR = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RowImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 1;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__SEATS = 0;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ROW_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Offset In Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__OFFSET_IN_ROW = 2;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.TravelClassImpl <em>Travel Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TravelClassImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getTravelClass()
	 * @generated
	 */
	int TRAVEL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__ROWS = 0;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__PASSENGERS = 2;

	/**
	 * The feature id for the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__AVAILABLE_SEATS = 3;

	/**
	 * The feature id for the '<em><b>Seat Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__SEAT_PITCH = 4;

	/**
	 * The feature id for the '<em><b>Seat Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__SEAT_LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Seat Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__SEAT_WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__NAME = 7;

	/**
	 * The feature id for the '<em><b>Row Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__ROW_STRUCTURE = 8;

	/**
	 * The number of structural features of the '<em>Travel Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Too Many Passengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Wrong Row Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Travel Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.BusinessClassImpl <em>Business Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BusinessClassImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getBusinessClass()
	 * @generated
	 */
	int BUSINESS_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__ROWS = TRAVEL_CLASS__ROWS;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__SEQUENCE = TRAVEL_CLASS__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__PASSENGERS = TRAVEL_CLASS__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__AVAILABLE_SEATS = TRAVEL_CLASS__AVAILABLE_SEATS;

	/**
	 * The feature id for the '<em><b>Seat Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__SEAT_PITCH = TRAVEL_CLASS__SEAT_PITCH;

	/**
	 * The feature id for the '<em><b>Seat Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__SEAT_LENGTH = TRAVEL_CLASS__SEAT_LENGTH;

	/**
	 * The feature id for the '<em><b>Seat Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__SEAT_WIDTH = TRAVEL_CLASS__SEAT_WIDTH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__NAME = TRAVEL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Row Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS__ROW_STRUCTURE = TRAVEL_CLASS__ROW_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Business Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS_FEATURE_COUNT = TRAVEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Too Many Passengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Wrong Row Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Business Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.FirstClassImpl <em>First Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FirstClassImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getFirstClass()
	 * @generated
	 */
	int FIRST_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__ROWS = TRAVEL_CLASS__ROWS;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__SEQUENCE = TRAVEL_CLASS__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__PASSENGERS = TRAVEL_CLASS__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__AVAILABLE_SEATS = TRAVEL_CLASS__AVAILABLE_SEATS;

	/**
	 * The feature id for the '<em><b>Seat Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__SEAT_PITCH = TRAVEL_CLASS__SEAT_PITCH;

	/**
	 * The feature id for the '<em><b>Seat Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__SEAT_LENGTH = TRAVEL_CLASS__SEAT_LENGTH;

	/**
	 * The feature id for the '<em><b>Seat Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__SEAT_WIDTH = TRAVEL_CLASS__SEAT_WIDTH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__NAME = TRAVEL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Row Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS__ROW_STRUCTURE = TRAVEL_CLASS__ROW_STRUCTURE;

	/**
	 * The number of structural features of the '<em>First Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_FEATURE_COUNT = TRAVEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Too Many Passengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Wrong Row Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>First Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.EconomyClassImpl <em>Economy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EconomyClassImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getEconomyClass()
	 * @generated
	 */
	int ECONOMY_CLASS = 5;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__ROWS = TRAVEL_CLASS__ROWS;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__SEQUENCE = TRAVEL_CLASS__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__PASSENGERS = TRAVEL_CLASS__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__AVAILABLE_SEATS = TRAVEL_CLASS__AVAILABLE_SEATS;

	/**
	 * The feature id for the '<em><b>Seat Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__SEAT_PITCH = TRAVEL_CLASS__SEAT_PITCH;

	/**
	 * The feature id for the '<em><b>Seat Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__SEAT_LENGTH = TRAVEL_CLASS__SEAT_LENGTH;

	/**
	 * The feature id for the '<em><b>Seat Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__SEAT_WIDTH = TRAVEL_CLASS__SEAT_WIDTH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__NAME = TRAVEL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Row Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS__ROW_STRUCTURE = TRAVEL_CLASS__ROW_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Economy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS_FEATURE_COUNT = TRAVEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Too Many Passengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Wrong Row Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Economy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PremiumEconomyClassImpl <em>Premium Economy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PremiumEconomyClassImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getPremiumEconomyClass()
	 * @generated
	 */
	int PREMIUM_ECONOMY_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__ROWS = TRAVEL_CLASS__ROWS;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__SEQUENCE = TRAVEL_CLASS__SEQUENCE;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__PASSENGERS = TRAVEL_CLASS__PASSENGERS;

	/**
	 * The feature id for the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__AVAILABLE_SEATS = TRAVEL_CLASS__AVAILABLE_SEATS;

	/**
	 * The feature id for the '<em><b>Seat Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__SEAT_PITCH = TRAVEL_CLASS__SEAT_PITCH;

	/**
	 * The feature id for the '<em><b>Seat Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__SEAT_LENGTH = TRAVEL_CLASS__SEAT_LENGTH;

	/**
	 * The feature id for the '<em><b>Seat Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__SEAT_WIDTH = TRAVEL_CLASS__SEAT_WIDTH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__NAME = TRAVEL_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Row Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS__ROW_STRUCTURE = TRAVEL_CLASS__ROW_STRUCTURE;

	/**
	 * The number of structural features of the '<em>Premium Economy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS_FEATURE_COUNT = TRAVEL_CLASS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Too Many Passengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Wrong Row Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP = TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Premium Economy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PhysicalObjectImpl <em>Physical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PhysicalObjectImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getPhysicalObject()
	 * @generated
	 */
	int PHYSICAL_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__YPOSITION = 0;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__XPOSITION = 1;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__YDIMENSION = 2;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__XDIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__ID = 5;

	/**
	 * The number of structural features of the '<em>Physical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Physical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SeatImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 7;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__NAME = PHYSICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__ID = PHYSICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Seat Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_BLOCKED = PHYSICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crew Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__CREW_SEAT = PHYSICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__LETTER = PHYSICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__TRAVEL_CLASS = PHYSICAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__ROW = PHYSICAL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Occupied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__OCCUPIED = PHYSICAL_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__PASSENGER = PHYSICAL_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Currently Folded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__CURRENTLY_FOLDED = PHYSICAL_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PassengerImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEX = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__AGE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DOOR = 5;

	/**
	 * The feature id for the '<em><b>Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NAME = 7;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__BOARDING_TIME = 8;

	/**
	 * The feature id for the '<em><b>Seat Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT_REF = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WIDTH = 10;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DEPTH = 11;

	/**
	 * The feature id for the '<em><b>Orientation In Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__ORIENTATION_IN_DEGREE = 12;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__POSITION_X = 13;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__POSITION_Y = 14;

	/**
	 * The feature id for the '<em><b>Is Seated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__IS_SEATED = 15;

	/**
	 * The feature id for the '<em><b>Walking Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WALKING_SPEED = 16;

	/**
	 * The feature id for the '<em><b>Start Boarding After Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__START_BOARDING_AFTER_DELAY = 17;

	/**
	 * The feature id for the '<em><b>Number Of Waits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_WAITS = 18;

	/**
	 * The feature id for the '<em><b>Luggage Stow Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE_STOW_TIME = 19;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__TRAVEL_CLASS = 20;

	/**
	 * The feature id for the '<em><b>Passenger Mood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PASSENGER_MOOD = 21;

	/**
	 * The feature id for the '<em><b>Number Of Make Way Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS = 22;

	/**
	 * The feature id for the '<em><b>Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE = 23;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CrewMemberImpl <em>Crew Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CrewMemberImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getCrewMember()
	 * @generated
	 */
	int CREW_MEMBER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_MEMBER__ID = 0;

	/**
	 * The feature id for the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_MEMBER__SEAT = 1;

	/**
	 * The number of structural features of the '<em>Crew Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_MEMBER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Crew Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREW_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LavatoryImpl <em>Lavatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LavatoryImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getLavatory()
	 * @generated
	 */
	int LAVATORY = 11;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__NAME = PHYSICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__ID = PHYSICAL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Lavatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Lavatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.GalleyImpl <em>Galley</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.GalleyImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getGalley()
	 * @generated
	 */
	int GALLEY = 12;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__NAME = PHYSICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__ID = PHYSICAL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Galley</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Galley</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.StairwayImpl <em>Stairway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StairwayImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getStairway()
	 * @generated
	 */
	int STAIRWAY = 13;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__NAME = PHYSICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__ID = PHYSICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__DIRECTION = PHYSICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stairway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stairway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.CurtainImpl <em>Curtain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CurtainImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getCurtain()
	 * @generated
	 */
	int CURTAIN = 14;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__NAME = PHYSICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__ID = PHYSICAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Postition After Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__POSTITION_AFTER_ROW = PHYSICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Curtain Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__CURTAIN_OPEN = PHYSICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Curtain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Curtain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.StowageImpl <em>Stowage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StowageImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getStowage()
	 * @generated
	 */
	int STOWAGE = 15;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__NAME = PHYSICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__ID = PHYSICAL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Stowage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Out Of Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Stowage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DoorImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 16;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ON_BOTH_SIDES = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__ID = 3;

	/**
	 * The feature id for the '<em><b>Number Of Simultaneous Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS = 4;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__IS_ACTIVE = 5;

	/**
	 * The feature id for the '<em><b>Waiting Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__WAITING_PASSENGERS = 6;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.MainDoorImpl <em>Main Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MainDoorImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getMainDoor()
	 * @generated
	 */
	int MAIN_DOOR = 17;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__XPOSITION = DOOR__XPOSITION;

	/**
	 * The feature id for the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__ON_BOTH_SIDES = DOOR__ON_BOTH_SIDES;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__WIDTH = DOOR__WIDTH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__ID = DOOR__ID;

	/**
	 * The feature id for the '<em><b>Number Of Simultaneous Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS = DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__IS_ACTIVE = DOOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Waiting Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__WAITING_PASSENGERS = DOOR__WAITING_PASSENGERS;

	/**
	 * The number of structural features of the '<em>Main Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR_FEATURE_COUNT = DOOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR_OPERATION_COUNT = DOOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.EmergencyExitImpl <em>Emergency Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.EmergencyExitImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getEmergencyExit()
	 * @generated
	 */
	int EMERGENCY_EXIT = 18;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__XPOSITION = DOOR__XPOSITION;

	/**
	 * The feature id for the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__ON_BOTH_SIDES = DOOR__ON_BOTH_SIDES;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__WIDTH = DOOR__WIDTH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__ID = DOOR__ID;

	/**
	 * The feature id for the '<em><b>Number Of Simultaneous Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__NUMBER_OF_SIMULTANEOUS_PASSENGERS = DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__IS_ACTIVE = DOOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Waiting Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__WAITING_PASSENGERS = DOOR__WAITING_PASSENGERS;

	/**
	 * The number of structural features of the '<em>Emergency Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT_FEATURE_COUNT = DOOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emergency Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT_OPERATION_COUNT = DOOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.StandardDoorImpl <em>Standard Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StandardDoorImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getStandardDoor()
	 * @generated
	 */
	int STANDARD_DOOR = 19;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__XPOSITION = DOOR__XPOSITION;

	/**
	 * The feature id for the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__ON_BOTH_SIDES = DOOR__ON_BOTH_SIDES;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__WIDTH = DOOR__WIDTH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__ID = DOOR__ID;

	/**
	 * The feature id for the '<em><b>Number Of Simultaneous Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS = DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__IS_ACTIVE = DOOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Waiting Passengers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__WAITING_PASSENGERS = DOOR__WAITING_PASSENGERS;

	/**
	 * The number of structural features of the '<em>Standard Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR_FEATURE_COUNT = DOOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR_OPERATION_COUNT = DOOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.SimulationPropertiesImpl <em>Simulation Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SimulationPropertiesImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getSimulationProperties()
	 * @generated
	 */
	int SIMULATION_PROPERTIES = 20;

	/**
	 * The feature id for the '<em><b>Simulate Without UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI = 0;

	/**
	 * The feature id for the '<em><b>Number Of Simulation Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS = 1;

	/**
	 * The feature id for the '<em><b>Random Sort Between Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS = 2;

	/**
	 * The feature id for the '<em><b>Use Foldable Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS = 3;

	/**
	 * The feature id for the '<em><b>Bring Your Own Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT = 4;

	/**
	 * The feature id for the '<em><b>Passengers Boarding Per Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE = 5;

	/**
	 * The feature id for the '<em><b>Passenger Width Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE = 6;

	/**
	 * The feature id for the '<em><b>Passenger Width Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE = 7;

	/**
	 * The feature id for the '<em><b>Passenger Weight Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE = 8;

	/**
	 * The feature id for the '<em><b>Passenger Weight Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE = 9;

	/**
	 * The feature id for the '<em><b>Passenger Height Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE = 10;

	/**
	 * The feature id for the '<em><b>Passenger Height Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE = 11;

	/**
	 * The feature id for the '<em><b>Passenger Depth Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE = 12;

	/**
	 * The feature id for the '<em><b>Passenger Depth Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE = 13;

	/**
	 * The feature id for the '<em><b>Percentage Of Women</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN = 14;

	/**
	 * The feature id for the '<em><b>Passenger Luggage Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN = 15;

	/**
	 * The feature id for the '<em><b>Passenger Luggage Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION = 16;

	/**
	 * The feature id for the '<em><b>Passenger Width Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE = 17;

	/**
	 * The feature id for the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE = 18;

	/**
	 * The feature id for the '<em><b>Passenger Weight Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE = 19;

	/**
	 * The feature id for the '<em><b>Passenger Weight Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE = 20;

	/**
	 * The feature id for the '<em><b>Passenger Height Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE = 21;

	/**
	 * The feature id for the '<em><b>Passenger Height Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE = 22;

	/**
	 * The feature id for the '<em><b>Passenger Depth Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE = 23;

	/**
	 * The feature id for the '<em><b>Passenger Depth Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE = 24;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__RESULTS = 25;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With No Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE = 26;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Small Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE = 27;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Medium Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE = 28;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Big Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE = 29;

	/**
	 * The feature id for the '<em><b>Sorting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SORTING = 30;

	/**
	 * The feature id for the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR = 31;

	/**
	 * The number of structural features of the '<em>Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES_FEATURE_COUNT = 32;

	/**
	 * The number of operations of the '<em>Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SimulationResultImpl
	 * @see model.impl.Paxelerate ModelPackageImpl#getSimulationResult()
	 * @generated
	 */
	int SIMULATION_RESULT = 21;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__BOARDING_TIME = 0;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__PASSENGERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__ID = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__DATE = 4;

	/**
	 * The feature id for the '<em><b>Boarding Time String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__BOARDING_TIME_STRING = 5;

	/**
	 * The number of structural features of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Sex
	 * @see model.impl.Paxelerate ModelPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 22;

	/**
	 * The meta object id for the '{@link model.StairwayDirection <em>Stairway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.StairwayDirection
	 * @see model.impl.Paxelerate ModelPackageImpl#getStairwayDirection()
	 * @generated
	 */
	int STAIRWAY_DIRECTION = 23;

	/**
	 * The meta object id for the '{@link model.AircraftType <em>Aircraft Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.AircraftType
	 * @see model.impl.Paxelerate ModelPackageImpl#getAircraftType()
	 * @generated
	 */
	int AIRCRAFT_TYPE = 24;

	/**
	 * The meta object id for the '{@link model.PassengerMood <em>Passenger Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.PassengerMood
	 * @see model.impl.Paxelerate ModelPackageImpl#getPassengerMood()
	 * @generated
	 */
	int PASSENGER_MOOD = 25;

	/**
	 * The meta object id for the '{@link model.LuggageSize <em>Luggage Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.LuggageSize
	 * @see model.impl.Paxelerate ModelPackageImpl#getLuggageSize()
	 * @generated
	 */
	int LUGGAGE_SIZE = 26;

	/**
	 * The meta object id for the '{@link model.SortingStyle <em>Sorting Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.SortingStyle
	 * @see model.impl.Paxelerate ModelPackageImpl#getSortingStyle()
	 * @generated
	 */
	int SORTING_STYLE = 27;


	/**
	 * Returns the meta object for class '{@link model.Cabin <em>Cabin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cabin</em>'.
	 * @see model.Cabin
	 * @generated
	 */
	EClass getCabin();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getCabinLength <em>Cabin Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cabin Length</em>'.
	 * @see model.Cabin#getCabinLength()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_CabinLength();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getCabinWidth <em>Cabin Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cabin Width</em>'.
	 * @see model.Cabin#getCabinWidth()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_CabinWidth();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getRowNonexistent <em>Row Nonexistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Nonexistent</em>'.
	 * @see model.Cabin#getRowNonexistent()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_RowNonexistent();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getAisleWidth <em>Aisle Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aisle Width</em>'.
	 * @see model.Cabin#getAisleWidth()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_AisleWidth();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getFramesPerSecond <em>Frames Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frames Per Second</em>'.
	 * @see model.Cabin#getFramesPerSecond()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_FramesPerSecond();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getNumberOfDecks <em>Number Of Decks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Decks</em>'.
	 * @see model.Cabin#getNumberOfDecks()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_NumberOfDecks();

	/**
	 * Returns the meta object for the reference '{@link model.Cabin#getSimulationSettings <em>Simulation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simulation Settings</em>'.
	 * @see model.Cabin#getSimulationSettings()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_SimulationSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see model.Cabin#getClasses()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doors</em>'.
	 * @see model.Cabin#getDoors()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Doors();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getLavatories <em>Lavatories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lavatories</em>'.
	 * @see model.Cabin#getLavatories()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Lavatories();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getGalleys <em>Galleys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galleys</em>'.
	 * @see model.Cabin#getGalleys()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Galleys();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getStairways <em>Stairways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stairways</em>'.
	 * @see model.Cabin#getStairways()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stairways();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getCurtains <em>Curtains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curtains</em>'.
	 * @see model.Cabin#getCurtains()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Curtains();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getStowages <em>Stowages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stowages</em>'.
	 * @see model.Cabin#getStowages()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stowages();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Cabin#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passengers</em>'.
	 * @see model.Cabin#getPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see model.Cabin#getScale()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_Scale();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getAircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aircraft Type</em>'.
	 * @see model.Cabin#getAircraftType()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_AircraftType();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#isUsePresetSettings <em>Use Preset Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Preset Settings</em>'.
	 * @see model.Cabin#isUsePresetSettings()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_UsePresetSettings();

	/**
	 * Returns the meta object for the attribute '{@link model.Cabin#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see model.Cabin#getSpeedFactor()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SpeedFactor();

	/**
	 * Returns the meta object for class '{@link model.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see model.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Row#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seats</em>'.
	 * @see model.Row#getSeats()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Seats();

	/**
	 * Returns the meta object for the attribute '{@link model.Row#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see model.Row#getRowNumber()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_RowNumber();

	/**
	 * Returns the meta object for the attribute '{@link model.Row#isOffsetInRow <em>Offset In Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset In Row</em>'.
	 * @see model.Row#isOffsetInRow()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_OffsetInRow();

	/**
	 * Returns the meta object for class '{@link model.TravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Class</em>'.
	 * @see model.TravelClass
	 * @generated
	 */
	EClass getTravelClass();

	/**
	 * Returns the meta object for the containment reference list '{@link model.TravelClass#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see model.TravelClass#getRows()
	 * @see #getTravelClass()
	 * @generated
	 */
	EReference getTravelClass_Rows();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see model.TravelClass#getSequence()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers</em>'.
	 * @see model.TravelClass#getPassengers()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getAvailableSeats <em>Available Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Seats</em>'.
	 * @see model.TravelClass#getAvailableSeats()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_AvailableSeats();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getSeatPitch <em>Seat Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch</em>'.
	 * @see model.TravelClass#getSeatPitch()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatPitch();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getSeatLength <em>Seat Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Length</em>'.
	 * @see model.TravelClass#getSeatLength()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatLength();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getSeatWidth <em>Seat Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Width</em>'.
	 * @see model.TravelClass#getSeatWidth()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatWidth();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.TravelClass#getName()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.TravelClass#getRowStructure <em>Row Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Structure</em>'.
	 * @see model.TravelClass#getRowStructure()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_RowStructure();

	/**
	 * Returns the meta object for the '{@link model.TravelClass#tooManyPassengers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Too Many Passengers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Too Many Passengers</em>' operation.
	 * @see model.TravelClass#tooManyPassengers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTravelClass__TooManyPassengers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link model.TravelClass#wrongRowStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Wrong Row Structure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Wrong Row Structure</em>' operation.
	 * @see model.TravelClass#wrongRowStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTravelClass__WrongRowStructure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link model.BusinessClass <em>Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Class</em>'.
	 * @see model.BusinessClass
	 * @generated
	 */
	EClass getBusinessClass();

	/**
	 * Returns the meta object for class '{@link model.FirstClass <em>First Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Class</em>'.
	 * @see model.FirstClass
	 * @generated
	 */
	EClass getFirstClass();

	/**
	 * Returns the meta object for class '{@link model.EconomyClass <em>Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economy Class</em>'.
	 * @see model.EconomyClass
	 * @generated
	 */
	EClass getEconomyClass();

	/**
	 * Returns the meta object for class '{@link model.PremiumEconomyClass <em>Premium Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premium Economy Class</em>'.
	 * @see model.PremiumEconomyClass
	 * @generated
	 */
	EClass getPremiumEconomyClass();

	/**
	 * Returns the meta object for class '{@link model.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see model.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link model.Seat#isSeatBlocked <em>Seat Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Blocked</em>'.
	 * @see model.Seat#isSeatBlocked()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatBlocked();

	/**
	 * Returns the meta object for the attribute '{@link model.Seat#isCrewSeat <em>Crew Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crew Seat</em>'.
	 * @see model.Seat#isCrewSeat()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_CrewSeat();

	/**
	 * Returns the meta object for the attribute '{@link model.Seat#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter</em>'.
	 * @see model.Seat#getLetter()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Letter();

	/**
	 * Returns the meta object for the reference '{@link model.Seat#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Class</em>'.
	 * @see model.Seat#getTravelClass()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_TravelClass();

	/**
	 * Returns the meta object for the reference '{@link model.Seat#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Row</em>'.
	 * @see model.Seat#getRow()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Row();

	/**
	 * Returns the meta object for the attribute '{@link model.Seat#isOccupied <em>Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupied</em>'.
	 * @see model.Seat#isOccupied()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Occupied();

	/**
	 * Returns the meta object for the reference '{@link model.Seat#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger</em>'.
	 * @see model.Seat#getPassenger()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Passenger();

	/**
	 * Returns the meta object for the attribute '{@link model.Seat#isCurrentlyFolded <em>Currently Folded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currently Folded</em>'.
	 * @see model.Seat#isCurrentlyFolded()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_CurrentlyFolded();

	/**
	 * Returns the meta object for class '{@link model.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see model.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Passenger#getId()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see model.Passenger#getSex()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Sex();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see model.Passenger#getHeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Height();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see model.Passenger#getAge()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Age();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see model.Passenger#getWeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Weight();

	/**
	 * Returns the meta object for the reference '{@link model.Passenger#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see model.Passenger#getDoor()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Door();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat</em>'.
	 * @see model.Passenger#getSeat()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Seat();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Passenger#getName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see model.Passenger#getBoardingTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_BoardingTime();

	/**
	 * Returns the meta object for the reference '{@link model.Passenger#getSeatRef <em>Seat Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat Ref</em>'.
	 * @see model.Passenger#getSeatRef()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_SeatRef();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.Passenger#getWidth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Width();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see model.Passenger#getDepth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Depth();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getOrientationInDegree <em>Orientation In Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation In Degree</em>'.
	 * @see model.Passenger#getOrientationInDegree()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_OrientationInDegree();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see model.Passenger#getPositionX()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see model.Passenger#getPositionY()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#isIsSeated <em>Is Seated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Seated</em>'.
	 * @see model.Passenger#isIsSeated()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_IsSeated();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getWalkingSpeed <em>Walking Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Walking Speed</em>'.
	 * @see model.Passenger#getWalkingSpeed()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WalkingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Boarding After Delay</em>'.
	 * @see model.Passenger#getStartBoardingAfterDelay()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_StartBoardingAfterDelay();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getNumberOfWaits <em>Number Of Waits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Waits</em>'.
	 * @see model.Passenger#getNumberOfWaits()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfWaits();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getLuggageStowTime <em>Luggage Stow Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Time</em>'.
	 * @see model.Passenger#getLuggageStowTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_LuggageStowTime();

	/**
	 * Returns the meta object for the reference '{@link model.Passenger#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Class</em>'.
	 * @see model.Passenger#getTravelClass()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_TravelClass();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getPassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Mood</em>'.
	 * @see model.Passenger#getPassengerMood()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PassengerMood();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getNumberOfMakeWayOperations <em>Number Of Make Way Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Make Way Operations</em>'.
	 * @see model.Passenger#getNumberOfMakeWayOperations()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfMakeWayOperations();

	/**
	 * Returns the meta object for the attribute '{@link model.Passenger#getLuggage <em>Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage</em>'.
	 * @see model.Passenger#getLuggage()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Luggage();

	/**
	 * Returns the meta object for class '{@link model.CrewMember <em>Crew Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew Member</em>'.
	 * @see model.CrewMember
	 * @generated
	 */
	EClass getCrewMember();

	/**
	 * Returns the meta object for the attribute '{@link model.CrewMember#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.CrewMember#getId()
	 * @see #getCrewMember()
	 * @generated
	 */
	EAttribute getCrewMember_Id();

	/**
	 * Returns the meta object for the reference '{@link model.CrewMember#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see model.CrewMember#getSeat()
	 * @see #getCrewMember()
	 * @generated
	 */
	EReference getCrewMember_Seat();

	/**
	 * Returns the meta object for class '{@link model.PhysicalObject <em>Physical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Object</em>'.
	 * @see model.PhysicalObject
	 * @generated
	 */
	EClass getPhysicalObject();

	/**
	 * Returns the meta object for the attribute '{@link model.PhysicalObject#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see model.PhysicalObject#getYPosition()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link model.PhysicalObject#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see model.PhysicalObject#getXPosition()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link model.PhysicalObject#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see model.PhysicalObject#getYDimension()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link model.PhysicalObject#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see model.PhysicalObject#getXDimension()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link model.PhysicalObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.PhysicalObject#getName()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.PhysicalObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.PhysicalObject#getId()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_Id();

	/**
	 * Returns the meta object for the '{@link model.PhysicalObject#outOfBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Out Of Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Out Of Bounds</em>' operation.
	 * @see model.PhysicalObject#outOfBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPhysicalObject__OutOfBounds__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link model.Lavatory <em>Lavatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lavatory</em>'.
	 * @see model.Lavatory
	 * @generated
	 */
	EClass getLavatory();

	/**
	 * Returns the meta object for class '{@link model.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galley</em>'.
	 * @see model.Galley
	 * @generated
	 */
	EClass getGalley();

	/**
	 * Returns the meta object for class '{@link model.Stairway <em>Stairway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stairway</em>'.
	 * @see model.Stairway
	 * @generated
	 */
	EClass getStairway();

	/**
	 * Returns the meta object for the attribute '{@link model.Stairway#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see model.Stairway#getDirection()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_Direction();

	/**
	 * Returns the meta object for class '{@link model.Curtain <em>Curtain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curtain</em>'.
	 * @see model.Curtain
	 * @generated
	 */
	EClass getCurtain();

	/**
	 * Returns the meta object for the attribute '{@link model.Curtain#getPostitionAfterRow <em>Postition After Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postition After Row</em>'.
	 * @see model.Curtain#getPostitionAfterRow()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_PostitionAfterRow();

	/**
	 * Returns the meta object for the attribute '{@link model.Curtain#isCurtainOpen <em>Curtain Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtain Open</em>'.
	 * @see model.Curtain#isCurtainOpen()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_CurtainOpen();

	/**
	 * Returns the meta object for class '{@link model.Stowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stowage</em>'.
	 * @see model.Stowage
	 * @generated
	 */
	EClass getStowage();

	/**
	 * Returns the meta object for class '{@link model.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see model.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link model.Door#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see model.Door#getXPosition()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link model.Door#isOnBothSides <em>On Both Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Both Sides</em>'.
	 * @see model.Door#isOnBothSides()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_OnBothSides();

	/**
	 * Returns the meta object for the attribute '{@link model.Door#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see model.Door#getWidth()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Width();

	/**
	 * Returns the meta object for the attribute '{@link model.Door#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Door#getId()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.Door#getNumberOfSimultaneousPassengers <em>Number Of Simultaneous Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Simultaneous Passengers</em>'.
	 * @see model.Door#getNumberOfSimultaneousPassengers()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_NumberOfSimultaneousPassengers();

	/**
	 * Returns the meta object for the attribute '{@link model.Door#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see model.Door#isIsActive()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_IsActive();

	/**
	 * Returns the meta object for the reference list '{@link model.Door#getWaitingPassengers <em>Waiting Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waiting Passengers</em>'.
	 * @see model.Door#getWaitingPassengers()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_WaitingPassengers();

	/**
	 * Returns the meta object for class '{@link model.MainDoor <em>Main Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Door</em>'.
	 * @see model.MainDoor
	 * @generated
	 */
	EClass getMainDoor();

	/**
	 * Returns the meta object for class '{@link model.EmergencyExit <em>Emergency Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emergency Exit</em>'.
	 * @see model.EmergencyExit
	 * @generated
	 */
	EClass getEmergencyExit();

	/**
	 * Returns the meta object for class '{@link model.StandardDoor <em>Standard Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Door</em>'.
	 * @see model.StandardDoor
	 * @generated
	 */
	EClass getStandardDoor();

	/**
	 * Returns the meta object for class '{@link model.SimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Properties</em>'.
	 * @see model.SimulationProperties
	 * @generated
	 */
	EClass getSimulationProperties();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#isSimulateWithoutUI <em>Simulate Without UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulate Without UI</em>'.
	 * @see model.SimulationProperties#isSimulateWithoutUI()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SimulateWithoutUI();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Simulation Loops</em>'.
	 * @see model.SimulationProperties#getNumberOfSimulationLoops()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_NumberOfSimulationLoops();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#isRandomSortBetweenLoops <em>Random Sort Between Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Sort Between Loops</em>'.
	 * @see model.SimulationProperties#isRandomSortBetweenLoops()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_RandomSortBetweenLoops();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#isUseFoldableSeats <em>Use Foldable Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Foldable Seats</em>'.
	 * @see model.SimulationProperties#isUseFoldableSeats()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_UseFoldableSeats();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#isBringYourOwnSeat <em>Bring Your Own Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bring Your Own Seat</em>'.
	 * @see model.SimulationProperties#isBringYourOwnSeat()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_BringYourOwnSeat();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers Boarding Per Minute</em>'.
	 * @see model.SimulationProperties#getPassengersBoardingPerMinute()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengersBoardingPerMinute();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Mean Male</em>'.
	 * @see model.SimulationProperties#getPassengerWidthMeanMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWidthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Deviation Male</em>'.
	 * @see model.SimulationProperties#getPassengerWidthDeviationMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWidthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Mean Male</em>'.
	 * @see model.SimulationProperties#getPassengerWeightMeanMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Deviation Male</em>'.
	 * @see model.SimulationProperties#getPassengerWeightDeviationMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Mean Male</em>'.
	 * @see model.SimulationProperties#getPassengerHeightMeanMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerHeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Deviation Male</em>'.
	 * @see model.SimulationProperties#getPassengerHeightDeviationMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerHeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Mean Male</em>'.
	 * @see model.SimulationProperties#getPassengerDepthMeanMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerDepthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Deviation Male</em>'.
	 * @see model.SimulationProperties#getPassengerDepthDeviationMale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerDepthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPercentageOfWomen <em>Percentage Of Women</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Women</em>'.
	 * @see model.SimulationProperties#getPercentageOfWomen()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PercentageOfWomen();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerLuggageStowTimeMean <em>Passenger Luggage Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Luggage Stow Time Mean</em>'.
	 * @see model.SimulationProperties#getPassengerLuggageStowTimeMean()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerLuggageStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerLuggageStowTimeDeviation <em>Passenger Luggage Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Luggage Stow Time Deviation</em>'.
	 * @see model.SimulationProperties#getPassengerLuggageStowTimeDeviation()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerLuggageStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Mean Female</em>'.
	 * @see model.SimulationProperties#getPassengerWidthMeanFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWidthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Deviation Female</em>'.
	 * @see model.SimulationProperties#getPassengerWidthDeviationFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWidthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Mean Female</em>'.
	 * @see model.SimulationProperties#getPassengerWeightMeanFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Deviation Female</em>'.
	 * @see model.SimulationProperties#getPassengerWeightDeviationFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerWeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Mean Female</em>'.
	 * @see model.SimulationProperties#getPassengerHeightMeanFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerHeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Deviation Female</em>'.
	 * @see model.SimulationProperties#getPassengerHeightDeviationFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerHeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Mean Female</em>'.
	 * @see model.SimulationProperties#getPassengerDepthMeanFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerDepthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Deviation Female</em>'.
	 * @see model.SimulationProperties#getPassengerDepthDeviationFemale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengerDepthDeviationFemale();

	/**
	 * Returns the meta object for the reference list '{@link model.SimulationProperties#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see model.SimulationProperties#getResults()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EReference getSimulationProperties_Results();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With No Luggage</em>'.
	 * @see model.SimulationProperties#getPercentageOfPassengersWithNoLuggage()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PercentageOfPassengersWithNoLuggage();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Small Luggage</em>'.
	 * @see model.SimulationProperties#getPercentageOfPassengersWithSmallLuggage()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PercentageOfPassengersWithSmallLuggage();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Medium Luggage</em>'.
	 * @see model.SimulationProperties#getPercentageOfPassengersWithMediumLuggage()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PercentageOfPassengersWithMediumLuggage();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Big Luggage</em>'.
	 * @see model.SimulationProperties#getPercentageOfPassengersWithBigLuggage()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PercentageOfPassengersWithBigLuggage();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getSorting <em>Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting</em>'.
	 * @see model.SimulationProperties#getSorting()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_Sorting();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationProperties#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Speed Factor</em>'.
	 * @see model.SimulationProperties#getSimulationSpeedFactor()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SimulationSpeedFactor();

	/**
	 * Returns the meta object for class '{@link model.SimulationResult <em>Simulation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Result</em>'.
	 * @see model.SimulationResult
	 * @generated
	 */
	EClass getSimulationResult();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationResult#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see model.SimulationResult#getBoardingTime()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_BoardingTime();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationResult#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers</em>'.
	 * @see model.SimulationResult#getPassengers()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.SimulationResult#getName()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationResult#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.SimulationResult#getId()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationResult#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see model.SimulationResult#getDate()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Date();

	/**
	 * Returns the meta object for the attribute '{@link model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time String</em>'.
	 * @see model.SimulationResult#getBoardingTimeString()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_BoardingTimeString();

	/**
	 * Returns the meta object for enum '{@link model.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see model.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the meta object for enum '{@link model.StairwayDirection <em>Stairway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stairway Direction</em>'.
	 * @see model.StairwayDirection
	 * @generated
	 */
	EEnum getStairwayDirection();

	/**
	 * Returns the meta object for enum '{@link model.AircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aircraft Type</em>'.
	 * @see model.AircraftType
	 * @generated
	 */
	EEnum getAircraftType();

	/**
	 * Returns the meta object for enum '{@link model.PassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passenger Mood</em>'.
	 * @see model.PassengerMood
	 * @generated
	 */
	EEnum getPassengerMood();

	/**
	 * Returns the meta object for enum '{@link model.LuggageSize <em>Luggage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Luggage Size</em>'.
	 * @see model.LuggageSize
	 * @generated
	 */
	EEnum getLuggageSize();

	/**
	 * Returns the meta object for enum '{@link model.SortingStyle <em>Sorting Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting Style</em>'.
	 * @see model.SortingStyle
	 * @generated
	 */
	EEnum getSortingStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Paxelerate ModelFactory getPaxelerate ModelFactory();

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
		 * The meta object literal for the '{@link model.impl.CabinImpl <em>Cabin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CabinImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getCabin()
		 * @generated
		 */
		EClass CABIN = eINSTANCE.getCabin();

		/**
		 * The meta object literal for the '<em><b>Cabin Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__CABIN_LENGTH = eINSTANCE.getCabin_CabinLength();

		/**
		 * The meta object literal for the '<em><b>Cabin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__CABIN_WIDTH = eINSTANCE.getCabin_CabinWidth();

		/**
		 * The meta object literal for the '<em><b>Row Nonexistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__ROW_NONEXISTENT = eINSTANCE.getCabin_RowNonexistent();

		/**
		 * The meta object literal for the '<em><b>Aisle Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__AISLE_WIDTH = eINSTANCE.getCabin_AisleWidth();

		/**
		 * The meta object literal for the '<em><b>Frames Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__FRAMES_PER_SECOND = eINSTANCE.getCabin_FramesPerSecond();

		/**
		 * The meta object literal for the '<em><b>Number Of Decks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__NUMBER_OF_DECKS = eINSTANCE.getCabin_NumberOfDecks();

		/**
		 * The meta object literal for the '<em><b>Simulation Settings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__SIMULATION_SETTINGS = eINSTANCE.getCabin_SimulationSettings();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__CLASSES = eINSTANCE.getCabin_Classes();

		/**
		 * The meta object literal for the '<em><b>Doors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__DOORS = eINSTANCE.getCabin_Doors();

		/**
		 * The meta object literal for the '<em><b>Lavatories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__LAVATORIES = eINSTANCE.getCabin_Lavatories();

		/**
		 * The meta object literal for the '<em><b>Galleys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__GALLEYS = eINSTANCE.getCabin_Galleys();

		/**
		 * The meta object literal for the '<em><b>Stairways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__STAIRWAYS = eINSTANCE.getCabin_Stairways();

		/**
		 * The meta object literal for the '<em><b>Curtains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__CURTAINS = eINSTANCE.getCabin_Curtains();

		/**
		 * The meta object literal for the '<em><b>Stowages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__STOWAGES = eINSTANCE.getCabin_Stowages();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__PASSENGERS = eINSTANCE.getCabin_Passengers();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SCALE = eINSTANCE.getCabin_Scale();

		/**
		 * The meta object literal for the '<em><b>Aircraft Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__AIRCRAFT_TYPE = eINSTANCE.getCabin_AircraftType();

		/**
		 * The meta object literal for the '<em><b>Use Preset Settings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__USE_PRESET_SETTINGS = eINSTANCE.getCabin_UsePresetSettings();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SPEED_FACTOR = eINSTANCE.getCabin_SpeedFactor();

		/**
		 * The meta object literal for the '{@link model.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RowImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__SEATS = eINSTANCE.getRow_Seats();

		/**
		 * The meta object literal for the '<em><b>Row Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__ROW_NUMBER = eINSTANCE.getRow_RowNumber();

		/**
		 * The meta object literal for the '<em><b>Offset In Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__OFFSET_IN_ROW = eINSTANCE.getRow_OffsetInRow();

		/**
		 * The meta object literal for the '{@link model.impl.TravelClassImpl <em>Travel Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TravelClassImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getTravelClass()
		 * @generated
		 */
		EClass TRAVEL_CLASS = eINSTANCE.getTravelClass();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAVEL_CLASS__ROWS = eINSTANCE.getTravelClass_Rows();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__SEQUENCE = eINSTANCE.getTravelClass_Sequence();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__PASSENGERS = eINSTANCE.getTravelClass_Passengers();

		/**
		 * The meta object literal for the '<em><b>Available Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__AVAILABLE_SEATS = eINSTANCE.getTravelClass_AvailableSeats();

		/**
		 * The meta object literal for the '<em><b>Seat Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__SEAT_PITCH = eINSTANCE.getTravelClass_SeatPitch();

		/**
		 * The meta object literal for the '<em><b>Seat Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__SEAT_LENGTH = eINSTANCE.getTravelClass_SeatLength();

		/**
		 * The meta object literal for the '<em><b>Seat Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__SEAT_WIDTH = eINSTANCE.getTravelClass_SeatWidth();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__NAME = eINSTANCE.getTravelClass_Name();

		/**
		 * The meta object literal for the '<em><b>Row Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__ROW_STRUCTURE = eINSTANCE.getTravelClass_RowStructure();

		/**
		 * The meta object literal for the '<em><b>Too Many Passengers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVEL_CLASS___TOO_MANY_PASSENGERS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTravelClass__TooManyPassengers__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Wrong Row Structure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAVEL_CLASS___WRONG_ROW_STRUCTURE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTravelClass__WrongRowStructure__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link model.impl.BusinessClassImpl <em>Business Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BusinessClassImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getBusinessClass()
		 * @generated
		 */
		EClass BUSINESS_CLASS = eINSTANCE.getBusinessClass();

		/**
		 * The meta object literal for the '{@link model.impl.FirstClassImpl <em>First Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FirstClassImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getFirstClass()
		 * @generated
		 */
		EClass FIRST_CLASS = eINSTANCE.getFirstClass();

		/**
		 * The meta object literal for the '{@link model.impl.EconomyClassImpl <em>Economy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.EconomyClassImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getEconomyClass()
		 * @generated
		 */
		EClass ECONOMY_CLASS = eINSTANCE.getEconomyClass();

		/**
		 * The meta object literal for the '{@link model.impl.PremiumEconomyClassImpl <em>Premium Economy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PremiumEconomyClassImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getPremiumEconomyClass()
		 * @generated
		 */
		EClass PREMIUM_ECONOMY_CLASS = eINSTANCE.getPremiumEconomyClass();

		/**
		 * The meta object literal for the '{@link model.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SeatImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getSeat()
		 * @generated
		 */
		EClass SEAT = eINSTANCE.getSeat();

		/**
		 * The meta object literal for the '<em><b>Seat Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_BLOCKED = eINSTANCE.getSeat_SeatBlocked();

		/**
		 * The meta object literal for the '<em><b>Crew Seat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__CREW_SEAT = eINSTANCE.getSeat_CrewSeat();

		/**
		 * The meta object literal for the '<em><b>Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__LETTER = eINSTANCE.getSeat_Letter();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT__TRAVEL_CLASS = eINSTANCE.getSeat_TravelClass();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT__ROW = eINSTANCE.getSeat_Row();

		/**
		 * The meta object literal for the '<em><b>Occupied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__OCCUPIED = eINSTANCE.getSeat_Occupied();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEAT__PASSENGER = eINSTANCE.getSeat_Passenger();

		/**
		 * The meta object literal for the '<em><b>Currently Folded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__CURRENTLY_FOLDED = eINSTANCE.getSeat_CurrentlyFolded();

		/**
		 * The meta object literal for the '{@link model.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PassengerImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getPassenger()
		 * @generated
		 */
		EClass PASSENGER = eINSTANCE.getPassenger();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__ID = eINSTANCE.getPassenger_Id();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__SEX = eINSTANCE.getPassenger_Sex();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__HEIGHT = eINSTANCE.getPassenger_Height();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__AGE = eINSTANCE.getPassenger_Age();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WEIGHT = eINSTANCE.getPassenger_Weight();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__DOOR = eINSTANCE.getPassenger_Door();

		/**
		 * The meta object literal for the '<em><b>Seat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__SEAT = eINSTANCE.getPassenger_Seat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__NAME = eINSTANCE.getPassenger_Name();

		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__BOARDING_TIME = eINSTANCE.getPassenger_BoardingTime();

		/**
		 * The meta object literal for the '<em><b>Seat Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__SEAT_REF = eINSTANCE.getPassenger_SeatRef();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WIDTH = eINSTANCE.getPassenger_Width();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DEPTH = eINSTANCE.getPassenger_Depth();

		/**
		 * The meta object literal for the '<em><b>Orientation In Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__ORIENTATION_IN_DEGREE = eINSTANCE.getPassenger_OrientationInDegree();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__POSITION_X = eINSTANCE.getPassenger_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__POSITION_Y = eINSTANCE.getPassenger_PositionY();

		/**
		 * The meta object literal for the '<em><b>Is Seated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__IS_SEATED = eINSTANCE.getPassenger_IsSeated();

		/**
		 * The meta object literal for the '<em><b>Walking Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__WALKING_SPEED = eINSTANCE.getPassenger_WalkingSpeed();

		/**
		 * The meta object literal for the '<em><b>Start Boarding After Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__START_BOARDING_AFTER_DELAY = eINSTANCE.getPassenger_StartBoardingAfterDelay();

		/**
		 * The meta object literal for the '<em><b>Number Of Waits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__NUMBER_OF_WAITS = eINSTANCE.getPassenger_NumberOfWaits();

		/**
		 * The meta object literal for the '<em><b>Luggage Stow Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__LUGGAGE_STOW_TIME = eINSTANCE.getPassenger_LuggageStowTime();

		/**
		 * The meta object literal for the '<em><b>Travel Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__TRAVEL_CLASS = eINSTANCE.getPassenger_TravelClass();

		/**
		 * The meta object literal for the '<em><b>Passenger Mood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__PASSENGER_MOOD = eINSTANCE.getPassenger_PassengerMood();

		/**
		 * The meta object literal for the '<em><b>Number Of Make Way Operations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS = eINSTANCE.getPassenger_NumberOfMakeWayOperations();

		/**
		 * The meta object literal for the '<em><b>Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__LUGGAGE = eINSTANCE.getPassenger_Luggage();

		/**
		 * The meta object literal for the '{@link model.impl.CrewMemberImpl <em>Crew Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CrewMemberImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getCrewMember()
		 * @generated
		 */
		EClass CREW_MEMBER = eINSTANCE.getCrewMember();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREW_MEMBER__ID = eINSTANCE.getCrewMember_Id();

		/**
		 * The meta object literal for the '<em><b>Seat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREW_MEMBER__SEAT = eINSTANCE.getCrewMember_Seat();

		/**
		 * The meta object literal for the '{@link model.impl.PhysicalObjectImpl <em>Physical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PhysicalObjectImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getPhysicalObject()
		 * @generated
		 */
		EClass PHYSICAL_OBJECT = eINSTANCE.getPhysicalObject();

		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__YPOSITION = eINSTANCE.getPhysicalObject_YPosition();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__XPOSITION = eINSTANCE.getPhysicalObject_XPosition();

		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__YDIMENSION = eINSTANCE.getPhysicalObject_YDimension();

		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__XDIMENSION = eINSTANCE.getPhysicalObject_XDimension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__NAME = eINSTANCE.getPhysicalObject_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__ID = eINSTANCE.getPhysicalObject_Id();

		/**
		 * The meta object literal for the '<em><b>Out Of Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPhysicalObject__OutOfBounds__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link model.impl.LavatoryImpl <em>Lavatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LavatoryImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getLavatory()
		 * @generated
		 */
		EClass LAVATORY = eINSTANCE.getLavatory();

		/**
		 * The meta object literal for the '{@link model.impl.GalleyImpl <em>Galley</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.GalleyImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getGalley()
		 * @generated
		 */
		EClass GALLEY = eINSTANCE.getGalley();

		/**
		 * The meta object literal for the '{@link model.impl.StairwayImpl <em>Stairway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StairwayImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getStairway()
		 * @generated
		 */
		EClass STAIRWAY = eINSTANCE.getStairway();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAIRWAY__DIRECTION = eINSTANCE.getStairway_Direction();

		/**
		 * The meta object literal for the '{@link model.impl.CurtainImpl <em>Curtain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CurtainImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getCurtain()
		 * @generated
		 */
		EClass CURTAIN = eINSTANCE.getCurtain();

		/**
		 * The meta object literal for the '<em><b>Postition After Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__POSTITION_AFTER_ROW = eINSTANCE.getCurtain_PostitionAfterRow();

		/**
		 * The meta object literal for the '<em><b>Curtain Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__CURTAIN_OPEN = eINSTANCE.getCurtain_CurtainOpen();

		/**
		 * The meta object literal for the '{@link model.impl.StowageImpl <em>Stowage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StowageImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getStowage()
		 * @generated
		 */
		EClass STOWAGE = eINSTANCE.getStowage();

		/**
		 * The meta object literal for the '{@link model.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DoorImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__XPOSITION = eINSTANCE.getDoor_XPosition();

		/**
		 * The meta object literal for the '<em><b>On Both Sides</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__ON_BOTH_SIDES = eINSTANCE.getDoor_OnBothSides();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__WIDTH = eINSTANCE.getDoor_Width();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__ID = eINSTANCE.getDoor_Id();

		/**
		 * The meta object literal for the '<em><b>Number Of Simultaneous Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS = eINSTANCE.getDoor_NumberOfSimultaneousPassengers();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__IS_ACTIVE = eINSTANCE.getDoor_IsActive();

		/**
		 * The meta object literal for the '<em><b>Waiting Passengers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__WAITING_PASSENGERS = eINSTANCE.getDoor_WaitingPassengers();

		/**
		 * The meta object literal for the '{@link model.impl.MainDoorImpl <em>Main Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MainDoorImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getMainDoor()
		 * @generated
		 */
		EClass MAIN_DOOR = eINSTANCE.getMainDoor();

		/**
		 * The meta object literal for the '{@link model.impl.EmergencyExitImpl <em>Emergency Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.EmergencyExitImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getEmergencyExit()
		 * @generated
		 */
		EClass EMERGENCY_EXIT = eINSTANCE.getEmergencyExit();

		/**
		 * The meta object literal for the '{@link model.impl.StandardDoorImpl <em>Standard Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StandardDoorImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getStandardDoor()
		 * @generated
		 */
		EClass STANDARD_DOOR = eINSTANCE.getStandardDoor();

		/**
		 * The meta object literal for the '{@link model.impl.SimulationPropertiesImpl <em>Simulation Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SimulationPropertiesImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getSimulationProperties()
		 * @generated
		 */
		EClass SIMULATION_PROPERTIES = eINSTANCE.getSimulationProperties();

		/**
		 * The meta object literal for the '<em><b>Simulate Without UI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI = eINSTANCE.getSimulationProperties_SimulateWithoutUI();

		/**
		 * The meta object literal for the '<em><b>Number Of Simulation Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS = eINSTANCE.getSimulationProperties_NumberOfSimulationLoops();

		/**
		 * The meta object literal for the '<em><b>Random Sort Between Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS = eINSTANCE.getSimulationProperties_RandomSortBetweenLoops();

		/**
		 * The meta object literal for the '<em><b>Use Foldable Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS = eINSTANCE.getSimulationProperties_UseFoldableSeats();

		/**
		 * The meta object literal for the '<em><b>Bring Your Own Seat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT = eINSTANCE.getSimulationProperties_BringYourOwnSeat();

		/**
		 * The meta object literal for the '<em><b>Passengers Boarding Per Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE = eINSTANCE.getSimulationProperties_PassengersBoardingPerMinute();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE = eINSTANCE.getSimulationProperties_PassengerWidthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE = eINSTANCE.getSimulationProperties_PassengerWidthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE = eINSTANCE.getSimulationProperties_PassengerWeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE = eINSTANCE.getSimulationProperties_PassengerWeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE = eINSTANCE.getSimulationProperties_PassengerHeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE = eINSTANCE.getSimulationProperties_PassengerHeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE = eINSTANCE.getSimulationProperties_PassengerDepthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE = eINSTANCE.getSimulationProperties_PassengerDepthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Women</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN = eINSTANCE.getSimulationProperties_PercentageOfWomen();

		/**
		 * The meta object literal for the '<em><b>Passenger Luggage Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN = eINSTANCE.getSimulationProperties_PassengerLuggageStowTimeMean();

		/**
		 * The meta object literal for the '<em><b>Passenger Luggage Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION = eINSTANCE.getSimulationProperties_PassengerLuggageStowTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE = eINSTANCE.getSimulationProperties_PassengerWidthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE = eINSTANCE.getSimulationProperties_PassengerWidthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE = eINSTANCE.getSimulationProperties_PassengerWeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE = eINSTANCE.getSimulationProperties_PassengerWeightDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE = eINSTANCE.getSimulationProperties_PassengerHeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE = eINSTANCE.getSimulationProperties_PassengerHeightDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE = eINSTANCE.getSimulationProperties_PassengerDepthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE = eINSTANCE.getSimulationProperties_PassengerDepthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_PROPERTIES__RESULTS = eINSTANCE.getSimulationProperties_Results();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With No Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE = eINSTANCE.getSimulationProperties_PercentageOfPassengersWithNoLuggage();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Small Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE = eINSTANCE.getSimulationProperties_PercentageOfPassengersWithSmallLuggage();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Medium Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE = eINSTANCE.getSimulationProperties_PercentageOfPassengersWithMediumLuggage();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Big Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE = eINSTANCE.getSimulationProperties_PercentageOfPassengersWithBigLuggage();

		/**
		 * The meta object literal for the '<em><b>Sorting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SORTING = eINSTANCE.getSimulationProperties_Sorting();

		/**
		 * The meta object literal for the '<em><b>Simulation Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR = eINSTANCE.getSimulationProperties_SimulationSpeedFactor();

		/**
		 * The meta object literal for the '{@link model.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SimulationResultImpl
		 * @see model.impl.Paxelerate ModelPackageImpl#getSimulationResult()
		 * @generated
		 */
		EClass SIMULATION_RESULT = eINSTANCE.getSimulationResult();

		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__BOARDING_TIME = eINSTANCE.getSimulationResult_BoardingTime();

		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__PASSENGERS = eINSTANCE.getSimulationResult_Passengers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__NAME = eINSTANCE.getSimulationResult_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__ID = eINSTANCE.getSimulationResult_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__DATE = eINSTANCE.getSimulationResult_Date();

		/**
		 * The meta object literal for the '<em><b>Boarding Time String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__BOARDING_TIME_STRING = eINSTANCE.getSimulationResult_BoardingTimeString();

		/**
		 * The meta object literal for the '{@link model.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Sex
		 * @see model.impl.Paxelerate ModelPackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

		/**
		 * The meta object literal for the '{@link model.StairwayDirection <em>Stairway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.StairwayDirection
		 * @see model.impl.Paxelerate ModelPackageImpl#getStairwayDirection()
		 * @generated
		 */
		EEnum STAIRWAY_DIRECTION = eINSTANCE.getStairwayDirection();

		/**
		 * The meta object literal for the '{@link model.AircraftType <em>Aircraft Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.AircraftType
		 * @see model.impl.Paxelerate ModelPackageImpl#getAircraftType()
		 * @generated
		 */
		EEnum AIRCRAFT_TYPE = eINSTANCE.getAircraftType();

		/**
		 * The meta object literal for the '{@link model.PassengerMood <em>Passenger Mood</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.PassengerMood
		 * @see model.impl.Paxelerate ModelPackageImpl#getPassengerMood()
		 * @generated
		 */
		EEnum PASSENGER_MOOD = eINSTANCE.getPassengerMood();

		/**
		 * The meta object literal for the '{@link model.LuggageSize <em>Luggage Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.LuggageSize
		 * @see model.impl.Paxelerate ModelPackageImpl#getLuggageSize()
		 * @generated
		 */
		EEnum LUGGAGE_SIZE = eINSTANCE.getLuggageSize();

		/**
		 * The meta object literal for the '{@link model.SortingStyle <em>Sorting Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.SortingStyle
		 * @see model.impl.Paxelerate ModelPackageImpl#getSortingStyle()
		 * @generated
		 */
		EEnum SORTING_STYLE = eINSTANCE.getSortingStyle();

	}

} //Paxelerate ModelPackage
