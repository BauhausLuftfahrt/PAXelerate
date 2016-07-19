/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import net.bhl.cdt.model.ModelPackage;

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
 * @see net.bhl.cdt.paxelerate.model.CabinFactory
 * @model kind="package"
 * @generated
 */
public interface CabinPackage extends EPackage {
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
	String eNS_URI = "http://net.bhl.cdt.paxelerate.model/";

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
	CabinPackage eINSTANCE = net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl <em>Cabin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getCabin()
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
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__XDIMENSION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__YDIMENSION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Number Of Decks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NUMBER_OF_DECKS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aircraft Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__AIRCRAFT_TYPE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Simulation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SIMULATION_SETTINGS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Simulation Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SIMULATION_RESULTS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CLASSES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__DOORS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lavatories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__LAVATORIES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Galleys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__GALLEYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stairways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STAIRWAYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Curtains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CURTAINS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Stowages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STOWAGES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.RowImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getRow()
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
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl <em>Travel Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.TravelClassImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getTravelClass()
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
	 * The feature id for the '<em><b>XDimension Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__XDIMENSION_OF_SEATS = 5;

	/**
	 * The feature id for the '<em><b>YDimension Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__YDIMENSION_OF_SEATS = 6;

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
	 * The feature id for the '<em><b>Load Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__LOAD_FACTOR = 9;

	/**
	 * The feature id for the '<em><b>Travel Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS__TRAVEL_OPTION = 10;

	/**
	 * The number of structural features of the '<em>Travel Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS_FEATURE_COUNT = 11;

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
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.DoorImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 12;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.SeatImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 3;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.PassengerImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 4;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.CrewMemberImpl <em>Crew Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.CrewMemberImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getCrewMember()
	 * @generated
	 */
	int CREW_MEMBER = 5;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl <em>Physical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPhysicalObject()
	 * @generated
	 */
	int PHYSICAL_OBJECT = 6;

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
	 * The feature id for the '<em><b>Layout Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__LAYOUT_CONCEPT = PHYSICAL_OBJECT_FEATURE_COUNT + 7;

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
	 * The feature id for the '<em><b>Seat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT_ID = 6;

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
	 * The feature id for the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT = 9;

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
	 * The feature id for the '<em><b>Luggage Stow Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE_STOW_TIME = 18;

	/**
	 * The feature id for the '<em><b>Luggage Stow Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE_STOW_DISTANCE = 19;

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
	 * The feature id for the '<em><b>Number Of Waits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_WAITS = 22;

	/**
	 * The feature id for the '<em><b>Number Of Make Way Operations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS = 23;

	/**
	 * The feature id for the '<em><b>Distance Walked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DISTANCE_WALKED = 24;

	/**
	 * The feature id for the '<em><b>Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE = 25;

	/**
	 * The feature id for the '<em><b>Cost Of Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__COST_OF_PATH = 26;

	/**
	 * The feature id for the '<em><b>Total Time Waited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__TOTAL_TIME_WAITED = 27;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.LavatoryImpl <em>Lavatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.LavatoryImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLavatory()
	 * @generated
	 */
	int LAVATORY = 7;

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
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.GalleyImpl <em>Galley</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.GalleyImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getGalley()
	 * @generated
	 */
	int GALLEY = 8;

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
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.StairwayImpl <em>Stairway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.StairwayImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getStairway()
	 * @generated
	 */
	int STAIRWAY = 9;

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
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.CurtainImpl <em>Curtain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.CurtainImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getCurtain()
	 * @generated
	 */
	int CURTAIN = 10;

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
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.StowageImpl <em>Stowage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.StowageImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getStowage()
	 * @generated
	 */
	int STOWAGE = 11;

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
	 * The feature id for the '<em><b>Door Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__DOOR_OPTION = 7;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl <em>Simulation Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSimulationProperties()
	 * @generated
	 */
	int SIMULATION_PROPERTIES = 13;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Luggage Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Passenger Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGER_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Passengers Boarding Per Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE = 3;

	/**
	 * The feature id for the '<em><b>Layout Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__LAYOUT_CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Luggage Model Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__LUGGAGE_MODEL_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Agent Movement Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__AGENT_MOVEMENT_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SCALE = 7;

	/**
	 * The feature id for the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR = 8;

	/**
	 * The feature id for the '<em><b>Use Preset Settings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__USE_PRESET_SETTINGS = 9;

	/**
	 * The feature id for the '<em><b>Simulate Without UI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI = 10;

	/**
	 * The feature id for the '<em><b>Number Of Simulation Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS = 11;

	/**
	 * The feature id for the '<em><b>Developer Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__DEVELOPER_MODE = 12;

	/**
	 * The feature id for the '<em><b>Data Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__DATA_EXPORT = 13;

	/**
	 * The feature id for the '<em><b>Display Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__DISPLAY_MAP = 14;

	/**
	 * The feature id for the '<em><b>Sort Passenger Between Loops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS = 15;

	/**
	 * The feature id for the '<em><b>Sorting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SORTING = 16;

	/**
	 * The feature id for the '<em><b>Thread Sleep Time Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT = 17;

	/**
	 * The feature id for the '<em><b>Sideways Foldabe Seat Popup Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN = 18;

	/**
	 * The feature id for the '<em><b>Sideways Foldabe Seat Popup Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION = 19;

	/**
	 * The feature id for the '<em><b>Lifting Seat Pan Popup Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN = 20;

	/**
	 * The feature id for the '<em><b>Lifting Seat Pan Popup Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION = 21;

	/**
	 * The number of structural features of the '<em>Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Simulation Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl <em>Luggage Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLuggageProperties()
	 * @generated
	 */
	int LUGGAGE_PROPERTIES = 14;

	/**
	 * The feature id for the '<em><b>Luggage Stow Distance From Seat Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN = 0;

	/**
	 * The feature id for the '<em><b>Luggage Stow Distance From Seat Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION = 1;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With No Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE = 2;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Small Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE = 3;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Medium Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE = 4;

	/**
	 * The feature id for the '<em><b>Percentage Of Passengers With Big Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE = 5;

	/**
	 * The feature id for the '<em><b>Passenger Small Luggage Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN = 6;

	/**
	 * The feature id for the '<em><b>Passenger Small Luggage Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION = 7;

	/**
	 * The feature id for the '<em><b>Passenger Medium Luggage Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN = 8;

	/**
	 * The feature id for the '<em><b>Passenger Medium Luggage Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION = 9;

	/**
	 * The feature id for the '<em><b>Passenger Big Luggage Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN = 10;

	/**
	 * The feature id for the '<em><b>Passenger Big Luggage Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION = 11;

	/**
	 * The number of structural features of the '<em>Luggage Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Luggage Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSimulationResult()
	 * @generated
	 */
	int SIMULATION_RESULT = 15;

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
	 * The feature id for the '<em><b>Waymaking Skipped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__WAYMAKING_SKIPPED = 6;

	/**
	 * The feature id for the '<em><b>Waymaking Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__WAYMAKING_COMPLETED = 7;

	/**
	 * The feature id for the '<em><b>Layout Concept Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Simulation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl <em>Passenger Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPassengerProperties()
	 * @generated
	 */
	int PASSENGER_PROPERTIES = 16;

	/**
	 * The feature id for the '<em><b>Passenger Width Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE = 0;

	/**
	 * The feature id for the '<em><b>Passenger Width Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE = 1;

	/**
	 * The feature id for the '<em><b>Passenger Weight Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE = 2;

	/**
	 * The feature id for the '<em><b>Passenger Weight Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE = 3;

	/**
	 * The feature id for the '<em><b>Passenger Height Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE = 4;

	/**
	 * The feature id for the '<em><b>Passenger Height Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE = 5;

	/**
	 * The feature id for the '<em><b>Passenger Depth Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE = 6;

	/**
	 * The feature id for the '<em><b>Passenger Depth Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE = 7;

	/**
	 * The feature id for the '<em><b>Percentage Of Women</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN = 8;

	/**
	 * The feature id for the '<em><b>Passenger Width Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE = 9;

	/**
	 * The feature id for the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE = 10;

	/**
	 * The feature id for the '<em><b>Passenger Weight Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE = 11;

	/**
	 * The feature id for the '<em><b>Passenger Weight Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE = 12;

	/**
	 * The feature id for the '<em><b>Passenger Height Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE = 13;

	/**
	 * The feature id for the '<em><b>Passenger Height Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE = 14;

	/**
	 * The feature id for the '<em><b>Passenger Depth Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE = 15;

	/**
	 * The feature id for the '<em><b>Passenger Depth Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE = 16;

	/**
	 * The feature id for the '<em><b>Passenger Aggressive Mood Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE = 17;

	/**
	 * The feature id for the '<em><b>Seat Interference Standing Up Passenger Waiting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME = 18;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN = 19;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION = 20;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Folding Seat Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN = 21;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Folding Seat Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION = 22;

	/**
	 * The feature id for the '<em><b>Passive Passenger Waiting Time After Collision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION = 23;

	/**
	 * The feature id for the '<em><b>Passenger Walking Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WALKING_SPEED_FACTOR = 24;

	/**
	 * The number of structural features of the '<em>Passenger Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Passenger Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.StairwayDirection <em>Stairway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.StairwayDirection
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getStairwayDirection()
	 * @generated
	 */
	int STAIRWAY_DIRECTION = 18;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.AircraftType <em>Aircraft Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.AircraftType
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getAircraftType()
	 * @generated
	 */
	int AIRCRAFT_TYPE = 19;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.PassengerMood <em>Passenger Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.PassengerMood
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPassengerMood()
	 * @generated
	 */
	int PASSENGER_MOOD = 20;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.LuggageSize <em>Luggage Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.LuggageSize
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLuggageSize()
	 * @generated
	 */
	int LUGGAGE_SIZE = 21;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.SortingStyle <em>Sorting Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.SortingStyle
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSortingStyle()
	 * @generated
	 */
	int SORTING_STYLE = 22;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.TravelOption <em>Travel Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.TravelOption
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getTravelOption()
	 * @generated
	 */
	int TRAVEL_OPTION = 23;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.ObjectOption <em>Object Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.ObjectOption
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getObjectOption()
	 * @generated
	 */
	int OBJECT_OPTION = 24;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.DoorOption <em>Door Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.DoorOption
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getDoorOption()
	 * @generated
	 */
	int DOOR_OPTION = 25;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.LayoutConcept <em>Layout Concept</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLayoutConcept()
	 * @generated
	 */
	int LAYOUT_CONCEPT = 26;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.LuggageModelOption <em>Luggage Model Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.LuggageModelOption
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLuggageModelOption()
	 * @generated
	 */
	int LUGGAGE_MODEL_OPTION = 27;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.AgentMovementModel <em>Agent Movement Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.AgentMovementModel
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getAgentMovementModel()
	 * @generated
	 */
	int AGENT_MOVEMENT_MODEL = 28;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.paxelerate.model.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.paxelerate.model.Sex
	 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 17;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Cabin <em>Cabin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cabin</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin
	 * @generated
	 */
	EClass getCabin();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Cabin#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getXDimension()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Cabin#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getYDimension()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_YDimension();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doors</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getDoors()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Doors();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getLavatories <em>Lavatories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lavatories</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getLavatories()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Lavatories();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getGalleys <em>Galleys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galleys</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getGalleys()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Galleys();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getStairways <em>Stairways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stairways</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getStairways()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stairways();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getCurtains <em>Curtains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curtains</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getCurtains()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Curtains();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getStowages <em>Stowages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stowages</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getStowages()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stowages();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passengers</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Passengers();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.paxelerate.model.Cabin#getSimulationResults <em>Simulation Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulation Results</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getSimulationResults()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_SimulationResults();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Cabin#getNumberOfDecks <em>Number Of Decks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Decks</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getNumberOfDecks()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_NumberOfDecks();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Cabin#getAircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aircraft Type</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getAircraftType()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_AircraftType();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.paxelerate.model.Cabin#getSimulationSettings <em>Simulation Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulation Settings</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getSimulationSettings()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_SimulationSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Cabin#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getClasses()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Classes();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Cabin#getRowNonexistent <em>Row Nonexistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Nonexistent</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getRowNonexistent()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_RowNonexistent();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Cabin#getAisleWidth <em>Aisle Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aisle Width</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Cabin#getAisleWidth()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_AisleWidth();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.Row#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seats</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Row#getSeats()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Seats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Row#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Row#getRowNumber()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_RowNumber();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.TravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Class</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass
	 * @generated
	 */
	EClass getTravelClass();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.paxelerate.model.TravelClass#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getRows()
	 * @see #getTravelClass()
	 * @generated
	 */
	EReference getTravelClass_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getSequence()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getPassengers()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getAvailableSeats <em>Available Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Seats</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getAvailableSeats()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_AvailableSeats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getSeatPitch <em>Seat Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getSeatPitch()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatPitch();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getXDimensionOfSeats <em>XDimension Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension Of Seats</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getXDimensionOfSeats()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_XDimensionOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getYDimensionOfSeats <em>YDimension Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension Of Seats</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getYDimensionOfSeats()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_YDimensionOfSeats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getName()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getRowStructure <em>Row Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Structure</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getRowStructure()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_RowStructure();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getLoadFactor <em>Load Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Factor</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getLoadFactor()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_LoadFactor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.TravelClass#getTravelOption <em>Travel Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#getTravelOption()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_TravelOption();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.paxelerate.model.TravelClass#tooManyPassengers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Too Many Passengers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Too Many Passengers</em>' operation.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#tooManyPassengers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTravelClass__TooManyPassengers__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.paxelerate.model.TravelClass#wrongRowStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Wrong Row Structure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Wrong Row Structure</em>' operation.
	 * @see net.bhl.cdt.paxelerate.model.TravelClass#wrongRowStructure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTravelClass__WrongRowStructure__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#getXPosition()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#isOnBothSides <em>On Both Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Both Sides</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#isOnBothSides()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_OnBothSides();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#getWidth()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#getId()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#getNumberOfSimultaneousPassengers <em>Number Of Simultaneous Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Simultaneous Passengers</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#getNumberOfSimultaneousPassengers()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_NumberOfSimultaneousPassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#isIsActive()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_IsActive();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.paxelerate.model.Door#getWaitingPassengers <em>Waiting Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Waiting Passengers</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#getWaitingPassengers()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_WaitingPassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Door#getDoorOption <em>Door Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Door#getDoorOption()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_DoorOption();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Seat#isSeatBlocked <em>Seat Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Blocked</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#isSeatBlocked()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatBlocked();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Seat#isCrewSeat <em>Crew Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crew Seat</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#isCrewSeat()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_CrewSeat();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Seat#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#getLetter()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Letter();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.Seat#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Class</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#getTravelClass()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_TravelClass();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.Seat#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Row</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#getRow()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Row();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Seat#isOccupied <em>Occupied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupied</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#isOccupied()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Occupied();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.Seat#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Passenger</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#getPassenger()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_Passenger();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Seat#getLayoutConcept <em>Layout Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Concept</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Seat#getLayoutConcept()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_LayoutConcept();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getId()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getSex()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Sex();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.Passenger#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getSeat()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Seat();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getBoardingTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_BoardingTime();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getWidth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getDepth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Depth();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getOrientationInDegree <em>Orientation In Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation In Degree</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getOrientationInDegree()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_OrientationInDegree();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getPositionX()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getPositionY()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#isIsSeated <em>Is Seated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Seated</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#isIsSeated()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_IsSeated();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getWalkingSpeed <em>Walking Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Walking Speed</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getWalkingSpeed()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WalkingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Boarding After Delay</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getStartBoardingAfterDelay()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_StartBoardingAfterDelay();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getNumberOfWaits <em>Number Of Waits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Waits</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getNumberOfWaits()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfWaits();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getLuggageStowTime <em>Luggage Stow Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Time</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getLuggageStowTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_LuggageStowTime();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getLuggageStowDistance <em>Luggage Stow Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Distance</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getLuggageStowDistance()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_LuggageStowDistance();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.Passenger#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Class</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getTravelClass()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_TravelClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getPassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Mood</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getPassengerMood()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PassengerMood();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getNumberOfMakeWayOperations <em>Number Of Make Way Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Make Way Operations</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getNumberOfMakeWayOperations()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfMakeWayOperations();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getLuggage <em>Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getLuggage()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Luggage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getDistanceWalked <em>Distance Walked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Walked</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getDistanceWalked()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_DistanceWalked();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getCostOfPath <em>Cost Of Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Of Path</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getCostOfPath()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_CostOfPath();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getTotalTimeWaited <em>Total Time Waited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time Waited</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getTotalTimeWaited()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_TotalTimeWaited();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getHeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getAge()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Age();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getWeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Weight();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.Passenger#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getDoor()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Door();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Passenger#getSeatID <em>Seat ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat ID</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Passenger#getSeatID()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_SeatID();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.CrewMember <em>Crew Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew Member</em>'.
	 * @see net.bhl.cdt.paxelerate.model.CrewMember
	 * @generated
	 */
	EClass getCrewMember();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.CrewMember#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.paxelerate.model.CrewMember#getId()
	 * @see #getCrewMember()
	 * @generated
	 */
	EAttribute getCrewMember_Id();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.paxelerate.model.CrewMember#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see net.bhl.cdt.paxelerate.model.CrewMember#getSeat()
	 * @see #getCrewMember()
	 * @generated
	 */
	EReference getCrewMember_Seat();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Lavatory <em>Lavatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lavatory</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Lavatory
	 * @generated
	 */
	EClass getLavatory();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galley</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Galley
	 * @generated
	 */
	EClass getGalley();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Stairway <em>Stairway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stairway</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Stairway
	 * @generated
	 */
	EClass getStairway();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Stairway#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Stairway#getDirection()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_Direction();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Curtain <em>Curtain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curtain</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Curtain
	 * @generated
	 */
	EClass getCurtain();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Curtain#getPostitionAfterRow <em>Postition After Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postition After Row</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Curtain#getPostitionAfterRow()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_PostitionAfterRow();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.Curtain#isCurtainOpen <em>Curtain Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtain Open</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Curtain#isCurtainOpen()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_CurtainOpen();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.Stowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stowage</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Stowage
	 * @generated
	 */
	EClass getStowage();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.SimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Properties</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties
	 * @generated
	 */
	EClass getSimulationProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getScale()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isUsePresetSettings <em>Use Preset Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Preset Settings</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#isUsePresetSettings()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_UsePresetSettings();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSimulateWithoutUI <em>Simulate Without UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulate Without UI</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#isSimulateWithoutUI()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SimulateWithoutUI();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getNumberOfSimulationLoops <em>Number Of Simulation Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Simulation Loops</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getNumberOfSimulationLoops()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_NumberOfSimulationLoops();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getResults()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EReference getSimulationProperties_Results();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSorting <em>Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sorting</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getSorting()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_Sorting();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Speed Factor</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getSimulationSpeedFactor()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SimulationSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Sleep Time Default</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getThreadSleepTimeDefault()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_ThreadSleepTimeDefault();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDeveloperMode <em>Developer Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developer Mode</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#isDeveloperMode()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_DeveloperMode();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isSortPassengerBetweenLoops <em>Sort Passenger Between Loops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Passenger Between Loops</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#isSortPassengerBetweenLoops()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SortPassengerBetweenLoops();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageProperties <em>Luggage Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Luggage Properties</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageProperties()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EReference getSimulationProperties_LuggageProperties();

	/**
	 * Returns the meta object for the containment reference '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerProperties <em>Passenger Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Properties</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengerProperties()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EReference getSimulationProperties_PassengerProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers Boarding Per Minute</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getPassengersBoardingPerMinute()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_PassengersBoardingPerMinute();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDataExport <em>Data Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Export</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#isDataExport()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_DataExport();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#isDisplayMap <em>Display Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Map</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#isDisplayMap()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_DisplayMap();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sideways Foldabe Seat Popup Time Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeMean()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SidewaysFoldabeSeatPopupTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sideways Foldabe Seat Popup Time Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getSidewaysFoldabeSeatPopupTimeDeviation()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_SidewaysFoldabeSeatPopupTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifting Seat Pan Popup Time Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeMean()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_LiftingSeatPanPopupTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifting Seat Pan Popup Time Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getLiftingSeatPanPopupTimeDeviation()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_LiftingSeatPanPopupTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLayoutConcept <em>Layout Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Concept</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getLayoutConcept()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_LayoutConcept();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageModelOption <em>Luggage Model Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Model Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getLuggageModelOption()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_LuggageModelOption();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationProperties#getAgentMovementModel <em>Agent Movement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Movement Model</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationProperties#getAgentMovementModel()
	 * @see #getSimulationProperties()
	 * @generated
	 */
	EAttribute getSimulationProperties_AgentMovementModel();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.LuggageProperties <em>Luggage Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Properties</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties
	 * @generated
	 */
	EClass getLuggageProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Distance From Seat Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LuggageStowDistanceFromSeatMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Distance From Seat Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LuggageStowDistanceFromSeatDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With No Luggage</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithNoLuggage()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PercentageOfPassengersWithNoLuggage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Small Luggage</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithSmallLuggage()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PercentageOfPassengersWithSmallLuggage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Medium Luggage</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithMediumLuggage()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PercentageOfPassengersWithMediumLuggage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Passengers With Big Luggage</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithBigLuggage()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PercentageOfPassengersWithBigLuggage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeMean <em>Passenger Small Luggage Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Small Luggage Stow Time Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PassengerSmallLuggageStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeDeviation <em>Passenger Small Luggage Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Small Luggage Stow Time Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PassengerSmallLuggageStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeMean <em>Passenger Medium Luggage Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Medium Luggage Stow Time Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PassengerMediumLuggageStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeDeviation <em>Passenger Medium Luggage Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Medium Luggage Stow Time Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PassengerMediumLuggageStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeMean <em>Passenger Big Luggage Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Big Luggage Stow Time Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PassengerBigLuggageStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeDeviation <em>Passenger Big Luggage Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Big Luggage Stow Time Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_PassengerBigLuggageStowTimeDeviation();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.SimulationResult <em>Simulation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation Result</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult
	 * @generated
	 */
	EClass getSimulationResult();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTime()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_BoardingTime();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getPassengers()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getName()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getId()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getDate()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTimeString <em>Boarding Time String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time String</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getBoardingTimeString()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_BoardingTimeString();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingSkipped <em>Waymaking Skipped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waymaking Skipped</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingSkipped()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_WaymakingSkipped();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingCompleted <em>Waymaking Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waymaking Completed</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getWaymakingCompleted()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_WaymakingCompleted();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.SimulationResult#getLayoutConceptType <em>Layout Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Concept Type</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SimulationResult#getLayoutConceptType()
	 * @see #getSimulationResult()
	 * @generated
	 */
	EAttribute getSimulationResult_LayoutConceptType();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.PassengerProperties <em>Passenger Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Properties</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties
	 * @generated
	 */
	EClass getPassengerProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Mean Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Deviation Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Mean Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Deviation Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Mean Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Deviation Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Mean Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Deviation Male</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPercentageOfWomen <em>Percentage Of Women</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Women</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPercentageOfWomen()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PercentageOfWomen();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Mean Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Deviation Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Mean Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Deviation Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Mean Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Deviation Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Mean Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Deviation Female</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Aggressive Mood Share</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerAggressiveMoodShare()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerAggressiveMoodShare();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceStandingUpPassengerWaitingTime <em>Seat Interference Standing Up Passenger Waiting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Standing Up Passenger Waiting Time</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceStandingUpPassengerWaitingTime()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceStandingUpPassengerWaitingTime();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeMean()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeDeviation()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Folding Seat Mean</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Folding Seat Deviation</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passive Passenger Waiting Time After Collision</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassivePassengerWaitingTimeAfterCollision();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWalkingSpeedFactor <em>Passenger Walking Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Walking Speed Factor</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWalkingSpeedFactor()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWalkingSpeedFactor();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.paxelerate.model.PhysicalObject <em>Physical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Object</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject
	 * @generated
	 */
	EClass getPhysicalObject();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#getYPosition()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#getXPosition()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#getYDimension()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#getXDimension()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#getName()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#getId()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_Id();

	/**
	 * Returns the meta object for the '{@link net.bhl.cdt.paxelerate.model.PhysicalObject#outOfBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Out Of Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Out Of Bounds</em>' operation.
	 * @see net.bhl.cdt.paxelerate.model.PhysicalObject#outOfBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPhysicalObject__OutOfBounds__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.StairwayDirection <em>Stairway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stairway Direction</em>'.
	 * @see net.bhl.cdt.paxelerate.model.StairwayDirection
	 * @generated
	 */
	EEnum getStairwayDirection();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.AircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aircraft Type</em>'.
	 * @see net.bhl.cdt.paxelerate.model.AircraftType
	 * @generated
	 */
	EEnum getAircraftType();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.PassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passenger Mood</em>'.
	 * @see net.bhl.cdt.paxelerate.model.PassengerMood
	 * @generated
	 */
	EEnum getPassengerMood();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.LuggageSize <em>Luggage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Luggage Size</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageSize
	 * @generated
	 */
	EEnum getLuggageSize();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.SortingStyle <em>Sorting Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sorting Style</em>'.
	 * @see net.bhl.cdt.paxelerate.model.SortingStyle
	 * @generated
	 */
	EEnum getSortingStyle();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.TravelOption <em>Travel Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Travel Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.TravelOption
	 * @generated
	 */
	EEnum getTravelOption();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.ObjectOption <em>Object Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.ObjectOption
	 * @generated
	 */
	EEnum getObjectOption();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.DoorOption <em>Door Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.DoorOption
	 * @generated
	 */
	EEnum getDoorOption();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.LayoutConcept <em>Layout Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout Concept</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
	 * @generated
	 */
	EEnum getLayoutConcept();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.LuggageModelOption <em>Luggage Model Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Luggage Model Option</em>'.
	 * @see net.bhl.cdt.paxelerate.model.LuggageModelOption
	 * @generated
	 */
	EEnum getLuggageModelOption();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.AgentMovementModel <em>Agent Movement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agent Movement Model</em>'.
	 * @see net.bhl.cdt.paxelerate.model.AgentMovementModel
	 * @generated
	 */
	EEnum getAgentMovementModel();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.paxelerate.model.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see net.bhl.cdt.paxelerate.model.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CabinFactory getCabinFactory();

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
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl <em>Cabin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getCabin()
		 * @generated
		 */
		EClass CABIN = eINSTANCE.getCabin();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__XDIMENSION = eINSTANCE.getCabin_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__YDIMENSION = eINSTANCE.getCabin_YDimension();
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
		 * The meta object literal for the '<em><b>Simulation Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__SIMULATION_RESULTS = eINSTANCE.getCabin_SimulationResults();
		/**
		 * The meta object literal for the '<em><b>Number Of Decks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__NUMBER_OF_DECKS = eINSTANCE.getCabin_NumberOfDecks();
		/**
		 * The meta object literal for the '<em><b>Aircraft Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__AIRCRAFT_TYPE = eINSTANCE.getCabin_AircraftType();
		/**
		 * The meta object literal for the '<em><b>Simulation Settings</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.RowImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getRow()
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.TravelClassImpl <em>Travel Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.TravelClassImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getTravelClass()
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
		 * The meta object literal for the '<em><b>XDimension Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__XDIMENSION_OF_SEATS = eINSTANCE.getTravelClass_XDimensionOfSeats();
		/**
		 * The meta object literal for the '<em><b>YDimension Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__YDIMENSION_OF_SEATS = eINSTANCE.getTravelClass_YDimensionOfSeats();
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
		 * The meta object literal for the '<em><b>Load Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__LOAD_FACTOR = eINSTANCE.getTravelClass_LoadFactor();
		/**
		 * The meta object literal for the '<em><b>Travel Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAVEL_CLASS__TRAVEL_OPTION = eINSTANCE.getTravelClass_TravelOption();
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.DoorImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getDoor()
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
		 * The meta object literal for the '<em><b>Door Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__DOOR_OPTION = eINSTANCE.getDoor_DoorOption();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.SeatImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSeat()
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
		 * The meta object literal for the '<em><b>Layout Concept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__LAYOUT_CONCEPT = eINSTANCE.getSeat_LayoutConcept();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.PassengerImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPassenger()
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
		 * The meta object literal for the '<em><b>Seat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__SEAT = eINSTANCE.getPassenger_Seat();
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
		 * The meta object literal for the '<em><b>Luggage Stow Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__LUGGAGE_STOW_DISTANCE = eINSTANCE.getPassenger_LuggageStowDistance();
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
		 * The meta object literal for the '<em><b>Distance Walked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__DISTANCE_WALKED = eINSTANCE.getPassenger_DistanceWalked();
		/**
		 * The meta object literal for the '<em><b>Cost Of Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__COST_OF_PATH = eINSTANCE.getPassenger_CostOfPath();
		/**
		 * The meta object literal for the '<em><b>Total Time Waited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__TOTAL_TIME_WAITED = eINSTANCE.getPassenger_TotalTimeWaited();
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
		 * The meta object literal for the '<em><b>Seat ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__SEAT_ID = eINSTANCE.getPassenger_SeatID();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.CrewMemberImpl <em>Crew Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.CrewMemberImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getCrewMember()
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.LavatoryImpl <em>Lavatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.LavatoryImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLavatory()
		 * @generated
		 */
		EClass LAVATORY = eINSTANCE.getLavatory();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.GalleyImpl <em>Galley</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.GalleyImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getGalley()
		 * @generated
		 */
		EClass GALLEY = eINSTANCE.getGalley();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.StairwayImpl <em>Stairway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.StairwayImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getStairway()
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.CurtainImpl <em>Curtain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.CurtainImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getCurtain()
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.StowageImpl <em>Stowage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.StowageImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getStowage()
		 * @generated
		 */
		EClass STOWAGE = eINSTANCE.getStowage();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl <em>Simulation Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.SimulationPropertiesImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSimulationProperties()
		 * @generated
		 */
		EClass SIMULATION_PROPERTIES = eINSTANCE.getSimulationProperties();
		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SCALE = eINSTANCE.getSimulationProperties_Scale();
		/**
		 * The meta object literal for the '<em><b>Use Preset Settings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__USE_PRESET_SETTINGS = eINSTANCE.getSimulationProperties_UsePresetSettings();
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
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_PROPERTIES__RESULTS = eINSTANCE.getSimulationProperties_Results();
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
		 * The meta object literal for the '<em><b>Thread Sleep Time Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT = eINSTANCE.getSimulationProperties_ThreadSleepTimeDefault();
		/**
		 * The meta object literal for the '<em><b>Developer Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__DEVELOPER_MODE = eINSTANCE.getSimulationProperties_DeveloperMode();
		/**
		 * The meta object literal for the '<em><b>Sort Passenger Between Loops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SORT_PASSENGER_BETWEEN_LOOPS = eINSTANCE.getSimulationProperties_SortPassengerBetweenLoops();
		/**
		 * The meta object literal for the '<em><b>Luggage Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES = eINSTANCE.getSimulationProperties_LuggageProperties();
		/**
		 * The meta object literal for the '<em><b>Passenger Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION_PROPERTIES__PASSENGER_PROPERTIES = eINSTANCE.getSimulationProperties_PassengerProperties();
		/**
		 * The meta object literal for the '<em><b>Passengers Boarding Per Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE = eINSTANCE.getSimulationProperties_PassengersBoardingPerMinute();
		/**
		 * The meta object literal for the '<em><b>Data Export</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__DATA_EXPORT = eINSTANCE.getSimulationProperties_DataExport();
		/**
		 * The meta object literal for the '<em><b>Display Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__DISPLAY_MAP = eINSTANCE.getSimulationProperties_DisplayMap();
		/**
		 * The meta object literal for the '<em><b>Sideways Foldabe Seat Popup Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN = eINSTANCE.getSimulationProperties_SidewaysFoldabeSeatPopupTimeMean();
		/**
		 * The meta object literal for the '<em><b>Sideways Foldabe Seat Popup Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION = eINSTANCE.getSimulationProperties_SidewaysFoldabeSeatPopupTimeDeviation();
		/**
		 * The meta object literal for the '<em><b>Lifting Seat Pan Popup Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_MEAN = eINSTANCE.getSimulationProperties_LiftingSeatPanPopupTimeMean();
		/**
		 * The meta object literal for the '<em><b>Lifting Seat Pan Popup Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION = eINSTANCE.getSimulationProperties_LiftingSeatPanPopupTimeDeviation();
		/**
		 * The meta object literal for the '<em><b>Layout Concept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__LAYOUT_CONCEPT = eINSTANCE.getSimulationProperties_LayoutConcept();
		/**
		 * The meta object literal for the '<em><b>Luggage Model Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__LUGGAGE_MODEL_OPTION = eINSTANCE.getSimulationProperties_LuggageModelOption();
		/**
		 * The meta object literal for the '<em><b>Agent Movement Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_PROPERTIES__AGENT_MOVEMENT_MODEL = eINSTANCE.getSimulationProperties_AgentMovementModel();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl <em>Luggage Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLuggageProperties()
		 * @generated
		 */
		EClass LUGGAGE_PROPERTIES = eINSTANCE.getLuggageProperties();
		/**
		 * The meta object literal for the '<em><b>Luggage Stow Distance From Seat Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN = eINSTANCE.getLuggageProperties_LuggageStowDistanceFromSeatMean();
		/**
		 * The meta object literal for the '<em><b>Luggage Stow Distance From Seat Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION = eINSTANCE.getLuggageProperties_LuggageStowDistanceFromSeatDeviation();
		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With No Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE = eINSTANCE.getLuggageProperties_PercentageOfPassengersWithNoLuggage();
		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Small Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE = eINSTANCE.getLuggageProperties_PercentageOfPassengersWithSmallLuggage();
		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Medium Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE = eINSTANCE.getLuggageProperties_PercentageOfPassengersWithMediumLuggage();
		/**
		 * The meta object literal for the '<em><b>Percentage Of Passengers With Big Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE = eINSTANCE.getLuggageProperties_PercentageOfPassengersWithBigLuggage();
		/**
		 * The meta object literal for the '<em><b>Passenger Small Luggage Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN = eINSTANCE.getLuggageProperties_PassengerSmallLuggageStowTimeMean();
		/**
		 * The meta object literal for the '<em><b>Passenger Small Luggage Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION = eINSTANCE.getLuggageProperties_PassengerSmallLuggageStowTimeDeviation();
		/**
		 * The meta object literal for the '<em><b>Passenger Medium Luggage Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN = eINSTANCE.getLuggageProperties_PassengerMediumLuggageStowTimeMean();
		/**
		 * The meta object literal for the '<em><b>Passenger Medium Luggage Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION = eINSTANCE.getLuggageProperties_PassengerMediumLuggageStowTimeDeviation();
		/**
		 * The meta object literal for the '<em><b>Passenger Big Luggage Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN = eINSTANCE.getLuggageProperties_PassengerBigLuggageStowTimeMean();
		/**
		 * The meta object literal for the '<em><b>Passenger Big Luggage Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION = eINSTANCE.getLuggageProperties_PassengerBigLuggageStowTimeDeviation();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl <em>Simulation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.SimulationResultImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSimulationResult()
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
		 * The meta object literal for the '<em><b>Waymaking Skipped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__WAYMAKING_SKIPPED = eINSTANCE.getSimulationResult_WaymakingSkipped();
		/**
		 * The meta object literal for the '<em><b>Waymaking Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__WAYMAKING_COMPLETED = eINSTANCE.getSimulationResult_WaymakingCompleted();
		/**
		 * The meta object literal for the '<em><b>Layout Concept Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE = eINSTANCE.getSimulationResult_LayoutConceptType();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl <em>Passenger Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPassengerProperties()
		 * @generated
		 */
		EClass PASSENGER_PROPERTIES = eINSTANCE.getPassengerProperties();
		/**
		 * The meta object literal for the '<em><b>Passenger Width Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE = eINSTANCE.getPassengerProperties_PassengerWidthMeanMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Width Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE = eINSTANCE.getPassengerProperties_PassengerWidthDeviationMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Weight Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE = eINSTANCE.getPassengerProperties_PassengerWeightMeanMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Weight Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE = eINSTANCE.getPassengerProperties_PassengerWeightDeviationMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Height Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE = eINSTANCE.getPassengerProperties_PassengerHeightMeanMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Height Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE = eINSTANCE.getPassengerProperties_PassengerHeightDeviationMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Depth Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE = eINSTANCE.getPassengerProperties_PassengerDepthMeanMale();
		/**
		 * The meta object literal for the '<em><b>Passenger Depth Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE = eINSTANCE.getPassengerProperties_PassengerDepthDeviationMale();
		/**
		 * The meta object literal for the '<em><b>Percentage Of Women</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN = eINSTANCE.getPassengerProperties_PercentageOfWomen();
		/**
		 * The meta object literal for the '<em><b>Passenger Width Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE = eINSTANCE.getPassengerProperties_PassengerWidthMeanFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Width Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE = eINSTANCE.getPassengerProperties_PassengerWidthDeviationFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Weight Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE = eINSTANCE.getPassengerProperties_PassengerWeightMeanFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Weight Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE = eINSTANCE.getPassengerProperties_PassengerWeightDeviationFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Height Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE = eINSTANCE.getPassengerProperties_PassengerHeightMeanFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Height Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE = eINSTANCE.getPassengerProperties_PassengerHeightDeviationFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Depth Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE = eINSTANCE.getPassengerProperties_PassengerDepthMeanFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Depth Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE = eINSTANCE.getPassengerProperties_PassengerDepthDeviationFemale();
		/**
		 * The meta object literal for the '<em><b>Passenger Aggressive Mood Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE = eINSTANCE.getPassengerProperties_PassengerAggressiveMoodShare();
		/**
		 * The meta object literal for the '<em><b>Seat Interference Standing Up Passenger Waiting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME = eINSTANCE.getPassengerProperties_SeatInterferenceStandingUpPassengerWaitingTime();
		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN = eINSTANCE.getPassengerProperties_SeatInterferenceProcessTimeMean();
		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION = eINSTANCE.getPassengerProperties_SeatInterferenceProcessTimeDeviation();
		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Folding Seat Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN = eINSTANCE.getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean();
		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Folding Seat Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION = eINSTANCE.getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation();
		/**
		 * The meta object literal for the '<em><b>Passive Passenger Waiting Time After Collision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION = eINSTANCE.getPassengerProperties_PassivePassengerWaitingTimeAfterCollision();
		/**
		 * The meta object literal for the '<em><b>Passenger Walking Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WALKING_SPEED_FACTOR = eINSTANCE.getPassengerProperties_PassengerWalkingSpeedFactor();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl <em>Physical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPhysicalObject()
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
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.StairwayDirection <em>Stairway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.StairwayDirection
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getStairwayDirection()
		 * @generated
		 */
		EEnum STAIRWAY_DIRECTION = eINSTANCE.getStairwayDirection();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.AircraftType <em>Aircraft Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.AircraftType
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getAircraftType()
		 * @generated
		 */
		EEnum AIRCRAFT_TYPE = eINSTANCE.getAircraftType();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.PassengerMood <em>Passenger Mood</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.PassengerMood
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getPassengerMood()
		 * @generated
		 */
		EEnum PASSENGER_MOOD = eINSTANCE.getPassengerMood();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.LuggageSize <em>Luggage Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.LuggageSize
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLuggageSize()
		 * @generated
		 */
		EEnum LUGGAGE_SIZE = eINSTANCE.getLuggageSize();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.SortingStyle <em>Sorting Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.SortingStyle
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSortingStyle()
		 * @generated
		 */
		EEnum SORTING_STYLE = eINSTANCE.getSortingStyle();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.TravelOption <em>Travel Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.TravelOption
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getTravelOption()
		 * @generated
		 */
		EEnum TRAVEL_OPTION = eINSTANCE.getTravelOption();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.ObjectOption <em>Object Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.ObjectOption
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getObjectOption()
		 * @generated
		 */
		EEnum OBJECT_OPTION = eINSTANCE.getObjectOption();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.DoorOption <em>Door Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.DoorOption
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getDoorOption()
		 * @generated
		 */
		EEnum DOOR_OPTION = eINSTANCE.getDoorOption();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.LayoutConcept <em>Layout Concept</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.LayoutConcept
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLayoutConcept()
		 * @generated
		 */
		EEnum LAYOUT_CONCEPT = eINSTANCE.getLayoutConcept();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.LuggageModelOption <em>Luggage Model Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.LuggageModelOption
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getLuggageModelOption()
		 * @generated
		 */
		EEnum LUGGAGE_MODEL_OPTION = eINSTANCE.getLuggageModelOption();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.AgentMovementModel <em>Agent Movement Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.AgentMovementModel
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getAgentMovementModel()
		 * @generated
		 */
		EEnum AGENT_MOVEMENT_MODEL = eINSTANCE.getAgentMovementModel();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.paxelerate.model.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.paxelerate.model.Sex
		 * @see net.bhl.cdt.paxelerate.model.impl.CabinPackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

	}

} //CabinPackage
