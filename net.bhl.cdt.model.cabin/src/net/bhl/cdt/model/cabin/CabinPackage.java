/**
 */
package net.bhl.cdt.model.cabin;

import net.bhl.cdt.model.ModelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.bhl.cdt.model.cabin.CabinFactory
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
	String eNAME = "cabin";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bhl.net/cdt/model/cabin/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.bhl.cdt.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CabinPackage eINSTANCE = net.bhl.cdt.model.cabin.impl.CabinPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CabinImpl <em>Cabin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CabinImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabin()
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
	 * The feature id for the '<em><b>Seats In First Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_IN_FIRST_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>First Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__FIRST_CLASS_PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Seats Per Row In First Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_PER_ROW_IN_FIRST_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Seat Pitch In First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_PITCH_IN_FIRST = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Seat Width In First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_WIDTH_IN_FIRST = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Seat Length In First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_LENGTH_IN_FIRST = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Seats In Business Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_IN_BUSINESS_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Business Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BUSINESS_CLASS_PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Seats Per Row In Business Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Seat Width In Business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_WIDTH_IN_BUSINESS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Seat Length In Business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_LENGTH_IN_BUSINESS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Seat Pitch In Business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_PITCH_IN_BUSINESS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Seats In Premium Economy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Premium Economy Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Seats Per Row In Premium Economy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Seat Width In Premium Economy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Seat Length In Premium Economy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Seat Pitch In Premium Eco</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_PITCH_IN_PREMIUM_ECO = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Seats In Economy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_IN_ECONOMY_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Economy Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__ECONOMY_CLASS_PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Seats Per Row In Economy Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Seat Width In Economy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_WIDTH_IN_ECONOMY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Seat Length In Economy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_LENGTH_IN_ECONOMY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Seat Pitch In Economy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SEAT_PITCH_IN_ECONOMY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Row Nonexistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__ROW_NONEXISTENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Aisle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__AISLE_WIDTH = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Frames Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__FRAMES_PER_SECOND = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Number Of Decks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NUMBER_OF_DECKS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CLASSES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__DOORS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Lavatories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__LAVATORIES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Galleys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__GALLEYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Stairways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STAIRWAYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Curtains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CURTAINS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Stowages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STOWAGES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SCALE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BOARDING_TIME = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 39;

	/**
	 * The number of structural features of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 40;

	/**
	 * The number of operations of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_OPERATION_COUNT = ModelPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.RowImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getRow()
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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl <em>Passenger Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.PassengerClassImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassengerClass()
	 * @generated
	 */
	int PASSENGER_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Available Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS__AVAILABLE_SEATS = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS__ROWS = 2;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS__SEQUENCE = 3;

	/**
	 * The number of structural features of the '<em>Passenger Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Passenger Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.DoorImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 3;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__YPOSITION = 0;

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
	 * The feature id for the '<em><b>Door Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__DOOR_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Width Of Main Door</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__WIDTH_OF_MAIN_DOOR = 5;

	/**
	 * The feature id for the '<em><b>Width Of Emergency Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__WIDTH_OF_EMERGENCY_EXIT = 6;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.SeatImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 4;

	/**
	 * The feature id for the '<em><b>Seat Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_ID = 0;

	/**
	 * The feature id for the '<em><b>Seat Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Seat Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_BLOCKED = 2;

	/**
	 * The feature id for the '<em><b>Crew Seat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__CREW_SEAT = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__LENGTH = 5;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__XPOSITION = 6;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__YPOSITION = 7;

	/**
	 * The feature id for the '<em><b>Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__LETTER = 8;

	/**
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.PassengerImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 5;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__CLASS = 8;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__BOARDING_TIME = 9;

	/**
	 * The feature id for the '<em><b>Seat Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT_REF = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WIDTH = 11;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__DEPTH = 12;

	/**
	 * The feature id for the '<em><b>Orientation In Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__ORIENTATION_IN_DEGREE = 13;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__POSITION_X = 14;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__POSITION_Y = 15;

	/**
	 * The feature id for the '<em><b>Is Seated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__IS_SEATED = 16;

	/**
	 * The feature id for the '<em><b>Walking Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WALKING_SPEED = 17;

	/**
	 * The feature id for the '<em><b>Start Boarding After Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__START_BOARDING_AFTER_DELAY = 18;

	/**
	 * The feature id for the '<em><b>Number Of Waits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__NUMBER_OF_WAITS = 19;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CrewMemberImpl <em>Crew Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CrewMemberImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCrewMember()
	 * @generated
	 */
	int CREW_MEMBER = 6;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.LavatoryImpl <em>Lavatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.LavatoryImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getLavatory()
	 * @generated
	 */
	int LAVATORY = 7;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__XDIMENSION = 2;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__YDIMENSION = 3;

	/**
	 * The number of structural features of the '<em>Lavatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Lavatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.GalleyImpl <em>Galley</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.GalleyImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getGalley()
	 * @generated
	 */
	int GALLEY = 8;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__XDIMENSION = 2;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__YDIMENSION = 3;

	/**
	 * The number of structural features of the '<em>Galley</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Galley</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.StairwayImpl <em>Stairway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.StairwayImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairway()
	 * @generated
	 */
	int STAIRWAY = 9;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__XDIMENSION = 0;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__YDIMENSION = 1;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__XPOSITION = 2;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__YPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__DIRECTION = 4;

	/**
	 * The number of structural features of the '<em>Stairway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Stairway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CurtainImpl <em>Curtain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CurtainImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCurtain()
	 * @generated
	 */
	int CURTAIN = 10;

	/**
	 * The feature id for the '<em><b>Postition After Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__POSTITION_AFTER_ROW = 0;

	/**
	 * The feature id for the '<em><b>Curtain Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__CURTAIN_OPEN = 1;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__XPOSITION = 2;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__YPOSITION = 3;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__XDIMENSION = 4;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__YDIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__NAME = 6;

	/**
	 * The number of structural features of the '<em>Curtain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Curtain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.StowageImpl <em>Stowage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.StowageImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStowage()
	 * @generated
	 */
	int STOWAGE = 11;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__XDIMENSION = 2;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__YDIMENSION = 3;

	/**
	 * The number of structural features of the '<em>Stowage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Stowage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl <em>View Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinViewSettings()
	 * @generated
	 */
	int CABIN_VIEW_SETTINGS = 12;

	/**
	 * The feature id for the '<em><b>Show Seatlabels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_SEATLABELS = 0;

	/**
	 * The feature id for the '<em><b>Show Row Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS = 1;

	/**
	 * The feature id for the '<em><b>Show Galley And Lavatory Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS = 2;

	/**
	 * The feature id for the '<em><b>Show Curtains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_CURTAINS = 3;

	/**
	 * The feature id for the '<em><b>Show Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_SEATS = 4;

	/**
	 * The feature id for the '<em><b>Show Galleys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_GALLEYS = 5;

	/**
	 * The feature id for the '<em><b>Show Lavatories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_LAVATORIES = 6;

	/**
	 * The feature id for the '<em><b>Show Doors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_DOORS = 7;

	/**
	 * The feature id for the '<em><b>Show Occupied Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS = 8;

	/**
	 * The feature id for the '<em><b>Size Of Passenger Circle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE = 9;

	/**
	 * The feature id for the '<em><b>Door Off Set In Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS = 10;

	/**
	 * The feature id for the '<em><b>XZero In Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS = 11;

	/**
	 * The feature id for the '<em><b>YZero In Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS = 12;

	/**
	 * The feature id for the '<em><b>Cabin Width In Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS = 13;

	/**
	 * The number of structural features of the '<em>View Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>View Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_VIEW_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 14;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.DoorType <em>Door Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.DoorType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getDoorType()
	 * @generated
	 */
	int DOOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.StairwayDirection <em>Stairway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.StairwayDirection
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairwayDirection()
	 * @generated
	 */
	int STAIRWAY_DIRECTION = 16;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 13;


	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Cabin <em>Cabin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cabin</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin
	 * @generated
	 */
	EClass getCabin();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getCabinLength <em>Cabin Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cabin Length</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getCabinLength()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_CabinLength();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getCabinWidth <em>Cabin Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cabin Width</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getCabinWidth()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_CabinWidth();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getClasses()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doors</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getDoors()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Doors();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getLavatories <em>Lavatories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lavatories</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getLavatories()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Lavatories();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getGalleys <em>Galleys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galleys</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getGalleys()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Galleys();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getStairways <em>Stairways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stairways</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getStairways()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stairways();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getCurtains <em>Curtains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Curtains</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getCurtains()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Curtains();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getStowages <em>Stowages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stowages</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getStowages()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stowages();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInEconomyClass <em>Seats In Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats In Economy Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsInEconomyClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsInEconomyClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInPremiumEconomyClass <em>Seats In Premium Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats In Premium Economy Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsInPremiumEconomyClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsInPremiumEconomyClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInBusinessClass <em>Seats In Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats In Business Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsInBusinessClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsInBusinessClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInFirstClass <em>Seats In First Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats In First Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsInFirstClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsInFirstClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInEconomyClass <em>Seats Per Row In Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats Per Row In Economy Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInEconomyClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsPerRowInEconomyClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatWidthInEconomy <em>Seat Width In Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Width In Economy</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatWidthInEconomy()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatWidthInEconomy();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatLengthInEconomy <em>Seat Length In Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Length In Economy</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatLengthInEconomy()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatLengthInEconomy();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatPitchInEconomy <em>Seat Pitch In Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch In Economy</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatPitchInEconomy()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatPitchInEconomy();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInBusinessClass <em>Seats Per Row In Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats Per Row In Business Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInBusinessClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsPerRowInBusinessClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatWidthInBusiness <em>Seat Width In Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Width In Business</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatWidthInBusiness()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatWidthInBusiness();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatLengthInBusiness <em>Seat Length In Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Length In Business</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatLengthInBusiness()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatLengthInBusiness();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatPitchInBusiness <em>Seat Pitch In Business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch In Business</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatPitchInBusiness()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatPitchInBusiness();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInFirstClass <em>Seats Per Row In First Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats Per Row In First Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInFirstClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsPerRowInFirstClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatPitchInFirst <em>Seat Pitch In First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch In First</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatPitchInFirst()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatPitchInFirst();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatWidthInFirst <em>Seat Width In First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Width In First</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatWidthInFirst()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatWidthInFirst();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatLengthInFirst <em>Seat Length In First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Length In First</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatLengthInFirst()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatLengthInFirst();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInPremiumEconomyClass <em>Seats Per Row In Premium Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seats Per Row In Premium Economy Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInPremiumEconomyClass()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatsPerRowInPremiumEconomyClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatWidthInPremiumEconomy <em>Seat Width In Premium Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Width In Premium Economy</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatWidthInPremiumEconomy()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatWidthInPremiumEconomy();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatLengthInPremiumEconomy <em>Seat Length In Premium Economy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Length In Premium Economy</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatLengthInPremiumEconomy()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatLengthInPremiumEconomy();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSeatPitchInPremiumEco <em>Seat Pitch In Premium Eco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch In Premium Eco</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSeatPitchInPremiumEco()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SeatPitchInPremiumEco();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getScale()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getFramesPerSecond <em>Frames Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frames Per Second</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getFramesPerSecond()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_FramesPerSecond();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Cabin#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getNumberOfDecks <em>Number Of Decks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Decks</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getNumberOfDecks()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_NumberOfDecks();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getBoardingTime()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_BoardingTime();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getFirstClassPassengers <em>First Class Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Class Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getFirstClassPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_FirstClassPassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getBusinessClassPassengers <em>Business Class Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Class Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getBusinessClassPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_BusinessClassPassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Premium Economy Class Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getPremiumEconomyClassPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_PremiumEconomyClassPassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getEconomyClassPassengers <em>Economy Class Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Economy Class Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getEconomyClassPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_EconomyClassPassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getRowNonexistent <em>Row Nonexistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Nonexistent</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getRowNonexistent()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_RowNonexistent();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getAisleWidth <em>Aisle Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aisle Width</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getAisleWidth()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_AisleWidth();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see net.bhl.cdt.model.cabin.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.Row#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seats</em>'.
	 * @see net.bhl.cdt.model.cabin.Row#getSeats()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Seats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Row#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see net.bhl.cdt.model.cabin.Row#getRowNumber()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_RowNumber();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Row#isOffsetInRow <em>Offset In Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset In Row</em>'.
	 * @see net.bhl.cdt.model.cabin.Row#isOffsetInRow()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_OffsetInRow();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.PassengerClass <em>Passenger Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Class</em>'.
	 * @see net.bhl.cdt.model.cabin.PassengerClass
	 * @generated
	 */
	EClass getPassengerClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PassengerClass#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.bhl.cdt.model.cabin.PassengerClass#getType()
	 * @see #getPassengerClass()
	 * @generated
	 */
	EAttribute getPassengerClass_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PassengerClass#getAvailableSeats <em>Available Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Seats</em>'.
	 * @see net.bhl.cdt.model.cabin.PassengerClass#getAvailableSeats()
	 * @see #getPassengerClass()
	 * @generated
	 */
	EAttribute getPassengerClass_AvailableSeats();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.PassengerClass#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see net.bhl.cdt.model.cabin.PassengerClass#getRows()
	 * @see #getPassengerClass()
	 * @generated
	 */
	EReference getPassengerClass_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PassengerClass#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see net.bhl.cdt.model.cabin.PassengerClass#getSequence()
	 * @see #getPassengerClass()
	 * @generated
	 */
	EAttribute getPassengerClass_Sequence();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see net.bhl.cdt.model.cabin.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#getYPosition()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#isOnBothSides <em>On Both Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Both Sides</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#isOnBothSides()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_OnBothSides();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#getWidth()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#getId()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#getDoorType <em>Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door Type</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#getDoorType()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_DoorType();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#getWidthOfMainDoor <em>Width Of Main Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Of Main Door</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#getWidthOfMainDoor()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_WidthOfMainDoor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Door#getWidthOfEmergencyExit <em>Width Of Emergency Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Of Emergency Exit</em>'.
	 * @see net.bhl.cdt.model.cabin.Door#getWidthOfEmergencyExit()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_WidthOfEmergencyExit();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getSeatNumber <em>Seat Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Number</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getSeatNumber()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatNumber();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#isSeatBlocked <em>Seat Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Blocked</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#isSeatBlocked()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatBlocked();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#isCrewSeat <em>Crew Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crew Seat</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#isCrewSeat()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_CrewSeat();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getWidth()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getLength()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getXPosition()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getYPosition()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getLetter <em>Letter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Letter</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getLetter()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Letter();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getSeatId <em>Seat Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Id</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getSeatId()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatId();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger
	 * @generated
	 */
	EClass getPassenger();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getId()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getSex()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Sex();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getSeat()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Seat();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getName()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getClass_()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Class();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getBoardingTime <em>Boarding Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Time</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getBoardingTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_BoardingTime();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.cabin.Passenger#getSeatRef <em>Seat Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat Ref</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getSeatRef()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_SeatRef();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getWidth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getDepth()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Depth();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getOrientationInDegree <em>Orientation In Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation In Degree</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getOrientationInDegree()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_OrientationInDegree();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getPositionX()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getPositionY()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#isIsSeated <em>Is Seated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Seated</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#isIsSeated()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_IsSeated();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getWalkingSpeed <em>Walking Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Walking Speed</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getWalkingSpeed()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_WalkingSpeed();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getStartBoardingAfterDelay <em>Start Boarding After Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Boarding After Delay</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getStartBoardingAfterDelay()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_StartBoardingAfterDelay();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getNumberOfWaits <em>Number Of Waits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Waits</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getNumberOfWaits()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_NumberOfWaits();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getHeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getAge()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Age();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getWeight()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_Weight();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.cabin.Passenger#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Door</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getDoor()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Door();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.CrewMember <em>Crew Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crew Member</em>'.
	 * @see net.bhl.cdt.model.cabin.CrewMember
	 * @generated
	 */
	EClass getCrewMember();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CrewMember#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.model.cabin.CrewMember#getId()
	 * @see #getCrewMember()
	 * @generated
	 */
	EAttribute getCrewMember_Id();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.cabin.CrewMember#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see net.bhl.cdt.model.cabin.CrewMember#getSeat()
	 * @see #getCrewMember()
	 * @generated
	 */
	EReference getCrewMember_Seat();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Lavatory <em>Lavatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lavatory</em>'.
	 * @see net.bhl.cdt.model.cabin.Lavatory
	 * @generated
	 */
	EClass getLavatory();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Lavatory#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Lavatory#getXPosition()
	 * @see #getLavatory()
	 * @generated
	 */
	EAttribute getLavatory_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Lavatory#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Lavatory#getYPosition()
	 * @see #getLavatory()
	 * @generated
	 */
	EAttribute getLavatory_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Lavatory#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Lavatory#getXDimension()
	 * @see #getLavatory()
	 * @generated
	 */
	EAttribute getLavatory_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Lavatory#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Lavatory#getYDimension()
	 * @see #getLavatory()
	 * @generated
	 */
	EAttribute getLavatory_YDimension();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galley</em>'.
	 * @see net.bhl.cdt.model.cabin.Galley
	 * @generated
	 */
	EClass getGalley();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Galley#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Galley#getXPosition()
	 * @see #getGalley()
	 * @generated
	 */
	EAttribute getGalley_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Galley#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Galley#getYPosition()
	 * @see #getGalley()
	 * @generated
	 */
	EAttribute getGalley_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Galley#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Galley#getXDimension()
	 * @see #getGalley()
	 * @generated
	 */
	EAttribute getGalley_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Galley#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Galley#getYDimension()
	 * @see #getGalley()
	 * @generated
	 */
	EAttribute getGalley_YDimension();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Stairway <em>Stairway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stairway</em>'.
	 * @see net.bhl.cdt.model.cabin.Stairway
	 * @generated
	 */
	EClass getStairway();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stairway#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Stairway#getXDimension()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stairway#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Stairway#getYDimension()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stairway#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Stairway#getXPosition()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stairway#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Stairway#getYPosition()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stairway#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see net.bhl.cdt.model.cabin.Stairway#getDirection()
	 * @see #getStairway()
	 * @generated
	 */
	EAttribute getStairway_Direction();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Curtain <em>Curtain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curtain</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain
	 * @generated
	 */
	EClass getCurtain();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#getPostitionAfterRow <em>Postition After Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postition After Row</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#getPostitionAfterRow()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_PostitionAfterRow();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#isCurtainOpen <em>Curtain Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curtain Open</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#isCurtainOpen()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_CurtainOpen();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#getXPosition()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#getYPosition()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#getXDimension()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#getYDimension()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Curtain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.model.cabin.Curtain#getName()
	 * @see #getCurtain()
	 * @generated
	 */
	EAttribute getCurtain_Name();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Stowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stowage</em>'.
	 * @see net.bhl.cdt.model.cabin.Stowage
	 * @generated
	 */
	EClass getStowage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stowage#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Stowage#getXPosition()
	 * @see #getStowage()
	 * @generated
	 */
	EAttribute getStowage_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stowage#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Stowage#getYPosition()
	 * @see #getStowage()
	 * @generated
	 */
	EAttribute getStowage_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stowage#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Stowage#getXDimension()
	 * @see #getStowage()
	 * @generated
	 */
	EAttribute getStowage_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Stowage#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Stowage#getYDimension()
	 * @see #getStowage()
	 * @generated
	 */
	EAttribute getStowage_YDimension();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.CabinViewSettings <em>View Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Settings</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings
	 * @generated
	 */
	EClass getCabinViewSettings();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowSeatlabels <em>Show Seatlabels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Seatlabels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowSeatlabels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowSeatlabels();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowRowLabels <em>Show Row Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Row Labels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowRowLabels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowRowLabels();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowGalleyAndLavatoryLabels <em>Show Galley And Lavatory Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Galley And Lavatory Labels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowGalleyAndLavatoryLabels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowGalleyAndLavatoryLabels();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowCurtains <em>Show Curtains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Curtains</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowCurtains()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowCurtains();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowSeats <em>Show Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Seats</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowSeats()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowSeats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowGalleys <em>Show Galleys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Galleys</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowGalleys()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowGalleys();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowLavatories <em>Show Lavatories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Lavatories</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowLavatories()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowLavatories();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowDoors <em>Show Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Doors</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowDoors()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowDoors();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#isShowOccupiedSeats <em>Show Occupied Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Occupied Seats</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#isShowOccupiedSeats()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_ShowOccupiedSeats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#getSizeOfPassengerCircle <em>Size Of Passenger Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Of Passenger Circle</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#getSizeOfPassengerCircle()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_SizeOfPassengerCircle();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#getDoorOffSetInPixels <em>Door Off Set In Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door Off Set In Pixels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#getDoorOffSetInPixels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_DoorOffSetInPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#getXZeroInPixels <em>XZero In Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XZero In Pixels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#getXZeroInPixels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_XZeroInPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#getYZeroInPixels <em>YZero In Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YZero In Pixels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#getYZeroInPixels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_YZeroInPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinViewSettings#getCabinWidthInPixels <em>Cabin Width In Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cabin Width In Pixels</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinViewSettings#getCabinWidthInPixels()
	 * @see #getCabinViewSettings()
	 * @generated
	 */
	EAttribute getCabinViewSettings_CabinWidthInPixels();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Type</em>'.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @generated
	 */
	EEnum getClassType();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.DoorType <em>Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Type</em>'.
	 * @see net.bhl.cdt.model.cabin.DoorType
	 * @generated
	 */
	EEnum getDoorType();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.StairwayDirection <em>Stairway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Stairway Direction</em>'.
	 * @see net.bhl.cdt.model.cabin.StairwayDirection
	 * @generated
	 */
	EEnum getStairwayDirection();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see net.bhl.cdt.model.cabin.Sex
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.CabinImpl <em>Cabin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.CabinImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabin()
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
		 * The meta object literal for the '<em><b>Seats In Economy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_IN_ECONOMY_CLASS = eINSTANCE.getCabin_SeatsInEconomyClass();
		/**
		 * The meta object literal for the '<em><b>Seats In Premium Economy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS = eINSTANCE.getCabin_SeatsInPremiumEconomyClass();
		/**
		 * The meta object literal for the '<em><b>Seats In Business Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_IN_BUSINESS_CLASS = eINSTANCE.getCabin_SeatsInBusinessClass();
		/**
		 * The meta object literal for the '<em><b>Seats In First Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_IN_FIRST_CLASS = eINSTANCE.getCabin_SeatsInFirstClass();
		/**
		 * The meta object literal for the '<em><b>Seats Per Row In Economy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS = eINSTANCE.getCabin_SeatsPerRowInEconomyClass();
		/**
		 * The meta object literal for the '<em><b>Seat Width In Economy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_WIDTH_IN_ECONOMY = eINSTANCE.getCabin_SeatWidthInEconomy();
		/**
		 * The meta object literal for the '<em><b>Seat Length In Economy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_LENGTH_IN_ECONOMY = eINSTANCE.getCabin_SeatLengthInEconomy();
		/**
		 * The meta object literal for the '<em><b>Seat Pitch In Economy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_PITCH_IN_ECONOMY = eINSTANCE.getCabin_SeatPitchInEconomy();
		/**
		 * The meta object literal for the '<em><b>Seats Per Row In Business Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS = eINSTANCE.getCabin_SeatsPerRowInBusinessClass();
		/**
		 * The meta object literal for the '<em><b>Seat Width In Business</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_WIDTH_IN_BUSINESS = eINSTANCE.getCabin_SeatWidthInBusiness();
		/**
		 * The meta object literal for the '<em><b>Seat Length In Business</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_LENGTH_IN_BUSINESS = eINSTANCE.getCabin_SeatLengthInBusiness();
		/**
		 * The meta object literal for the '<em><b>Seat Pitch In Business</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_PITCH_IN_BUSINESS = eINSTANCE.getCabin_SeatPitchInBusiness();
		/**
		 * The meta object literal for the '<em><b>Seats Per Row In First Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_PER_ROW_IN_FIRST_CLASS = eINSTANCE.getCabin_SeatsPerRowInFirstClass();
		/**
		 * The meta object literal for the '<em><b>Seat Pitch In First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_PITCH_IN_FIRST = eINSTANCE.getCabin_SeatPitchInFirst();
		/**
		 * The meta object literal for the '<em><b>Seat Width In First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_WIDTH_IN_FIRST = eINSTANCE.getCabin_SeatWidthInFirst();
		/**
		 * The meta object literal for the '<em><b>Seat Length In First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_LENGTH_IN_FIRST = eINSTANCE.getCabin_SeatLengthInFirst();
		/**
		 * The meta object literal for the '<em><b>Seats Per Row In Premium Economy Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS = eINSTANCE.getCabin_SeatsPerRowInPremiumEconomyClass();
		/**
		 * The meta object literal for the '<em><b>Seat Width In Premium Economy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY = eINSTANCE.getCabin_SeatWidthInPremiumEconomy();
		/**
		 * The meta object literal for the '<em><b>Seat Length In Premium Economy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY = eINSTANCE.getCabin_SeatLengthInPremiumEconomy();
		/**
		 * The meta object literal for the '<em><b>Seat Pitch In Premium Eco</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SEAT_PITCH_IN_PREMIUM_ECO = eINSTANCE.getCabin_SeatPitchInPremiumEco();
		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__SCALE = eINSTANCE.getCabin_Scale();
		/**
		 * The meta object literal for the '<em><b>Frames Per Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__FRAMES_PER_SECOND = eINSTANCE.getCabin_FramesPerSecond();
		/**
		 * The meta object literal for the '<em><b>Passengers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__PASSENGERS = eINSTANCE.getCabin_Passengers();
		/**
		 * The meta object literal for the '<em><b>Number Of Decks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__NUMBER_OF_DECKS = eINSTANCE.getCabin_NumberOfDecks();
		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__BOARDING_TIME = eINSTANCE.getCabin_BoardingTime();
		/**
		 * The meta object literal for the '<em><b>First Class Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__FIRST_CLASS_PASSENGERS = eINSTANCE.getCabin_FirstClassPassengers();
		/**
		 * The meta object literal for the '<em><b>Business Class Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__BUSINESS_CLASS_PASSENGERS = eINSTANCE.getCabin_BusinessClassPassengers();
		/**
		 * The meta object literal for the '<em><b>Premium Economy Class Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS = eINSTANCE.getCabin_PremiumEconomyClassPassengers();
		/**
		 * The meta object literal for the '<em><b>Economy Class Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__ECONOMY_CLASS_PASSENGERS = eINSTANCE.getCabin_EconomyClassPassengers();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.RowImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getRow()
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.PassengerClassImpl <em>Passenger Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.PassengerClassImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassengerClass()
		 * @generated
		 */
		EClass PASSENGER_CLASS = eINSTANCE.getPassengerClass();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CLASS__TYPE = eINSTANCE.getPassengerClass_Type();
		/**
		 * The meta object literal for the '<em><b>Available Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CLASS__AVAILABLE_SEATS = eINSTANCE.getPassengerClass_AvailableSeats();
		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CLASS__ROWS = eINSTANCE.getPassengerClass_Rows();
		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_CLASS__SEQUENCE = eINSTANCE.getPassengerClass_Sequence();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.DoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.DoorImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__YPOSITION = eINSTANCE.getDoor_YPosition();
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
		 * The meta object literal for the '<em><b>Door Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__DOOR_TYPE = eINSTANCE.getDoor_DoorType();
		/**
		 * The meta object literal for the '<em><b>Width Of Main Door</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__WIDTH_OF_MAIN_DOOR = eINSTANCE.getDoor_WidthOfMainDoor();
		/**
		 * The meta object literal for the '<em><b>Width Of Emergency Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__WIDTH_OF_EMERGENCY_EXIT = eINSTANCE.getDoor_WidthOfEmergencyExit();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.SeatImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSeat()
		 * @generated
		 */
		EClass SEAT = eINSTANCE.getSeat();
		/**
		 * The meta object literal for the '<em><b>Seat Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_NUMBER = eINSTANCE.getSeat_SeatNumber();
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
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__WIDTH = eINSTANCE.getSeat_Width();
		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__LENGTH = eINSTANCE.getSeat_Length();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__XPOSITION = eINSTANCE.getSeat_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__YPOSITION = eINSTANCE.getSeat_YPosition();
		/**
		 * The meta object literal for the '<em><b>Letter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__LETTER = eINSTANCE.getSeat_Letter();
		/**
		 * The meta object literal for the '<em><b>Seat Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_ID = eINSTANCE.getSeat_SeatId();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.PassengerImpl <em>Passenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.PassengerImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassenger()
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
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__CLASS = eINSTANCE.getPassenger_Class();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.CrewMemberImpl <em>Crew Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.CrewMemberImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCrewMember()
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.LavatoryImpl <em>Lavatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.LavatoryImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getLavatory()
		 * @generated
		 */
		EClass LAVATORY = eINSTANCE.getLavatory();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAVATORY__XPOSITION = eINSTANCE.getLavatory_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAVATORY__YPOSITION = eINSTANCE.getLavatory_YPosition();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAVATORY__XDIMENSION = eINSTANCE.getLavatory_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAVATORY__YDIMENSION = eINSTANCE.getLavatory_YDimension();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.GalleyImpl <em>Galley</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.GalleyImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getGalley()
		 * @generated
		 */
		EClass GALLEY = eINSTANCE.getGalley();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLEY__XPOSITION = eINSTANCE.getGalley_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLEY__YPOSITION = eINSTANCE.getGalley_YPosition();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLEY__XDIMENSION = eINSTANCE.getGalley_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLEY__YDIMENSION = eINSTANCE.getGalley_YDimension();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.StairwayImpl <em>Stairway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.StairwayImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairway()
		 * @generated
		 */
		EClass STAIRWAY = eINSTANCE.getStairway();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAIRWAY__XDIMENSION = eINSTANCE.getStairway_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAIRWAY__YDIMENSION = eINSTANCE.getStairway_YDimension();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAIRWAY__XPOSITION = eINSTANCE.getStairway_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAIRWAY__YPOSITION = eINSTANCE.getStairway_YPosition();
		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAIRWAY__DIRECTION = eINSTANCE.getStairway_Direction();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.CurtainImpl <em>Curtain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.CurtainImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCurtain()
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
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__XPOSITION = eINSTANCE.getCurtain_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__YPOSITION = eINSTANCE.getCurtain_YPosition();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__XDIMENSION = eINSTANCE.getCurtain_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__YDIMENSION = eINSTANCE.getCurtain_YDimension();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURTAIN__NAME = eINSTANCE.getCurtain_Name();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.StowageImpl <em>Stowage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.StowageImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStowage()
		 * @generated
		 */
		EClass STOWAGE = eINSTANCE.getStowage();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOWAGE__XPOSITION = eINSTANCE.getStowage_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOWAGE__YPOSITION = eINSTANCE.getStowage_YPosition();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOWAGE__XDIMENSION = eINSTANCE.getStowage_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOWAGE__YDIMENSION = eINSTANCE.getStowage_YDimension();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl <em>View Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinViewSettings()
		 * @generated
		 */
		EClass CABIN_VIEW_SETTINGS = eINSTANCE.getCabinViewSettings();
		/**
		 * The meta object literal for the '<em><b>Show Seatlabels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_SEATLABELS = eINSTANCE.getCabinViewSettings_ShowSeatlabels();
		/**
		 * The meta object literal for the '<em><b>Show Row Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS = eINSTANCE.getCabinViewSettings_ShowRowLabels();
		/**
		 * The meta object literal for the '<em><b>Show Galley And Lavatory Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS = eINSTANCE.getCabinViewSettings_ShowGalleyAndLavatoryLabels();
		/**
		 * The meta object literal for the '<em><b>Show Curtains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_CURTAINS = eINSTANCE.getCabinViewSettings_ShowCurtains();
		/**
		 * The meta object literal for the '<em><b>Show Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_SEATS = eINSTANCE.getCabinViewSettings_ShowSeats();
		/**
		 * The meta object literal for the '<em><b>Show Galleys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_GALLEYS = eINSTANCE.getCabinViewSettings_ShowGalleys();
		/**
		 * The meta object literal for the '<em><b>Show Lavatories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_LAVATORIES = eINSTANCE.getCabinViewSettings_ShowLavatories();
		/**
		 * The meta object literal for the '<em><b>Show Doors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_DOORS = eINSTANCE.getCabinViewSettings_ShowDoors();
		/**
		 * The meta object literal for the '<em><b>Show Occupied Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS = eINSTANCE.getCabinViewSettings_ShowOccupiedSeats();
		/**
		 * The meta object literal for the '<em><b>Size Of Passenger Circle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE = eINSTANCE.getCabinViewSettings_SizeOfPassengerCircle();
		/**
		 * The meta object literal for the '<em><b>Door Off Set In Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS = eINSTANCE.getCabinViewSettings_DoorOffSetInPixels();
		/**
		 * The meta object literal for the '<em><b>XZero In Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS = eINSTANCE.getCabinViewSettings_XZeroInPixels();
		/**
		 * The meta object literal for the '<em><b>YZero In Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS = eINSTANCE.getCabinViewSettings_YZeroInPixels();
		/**
		 * The meta object literal for the '<em><b>Cabin Width In Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS = eINSTANCE.getCabinViewSettings_CabinWidthInPixels();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.ClassType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getClassType()
		 * @generated
		 */
		EEnum CLASS_TYPE = eINSTANCE.getClassType();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.DoorType <em>Door Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.DoorType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getDoorType()
		 * @generated
		 */
		EEnum DOOR_TYPE = eINSTANCE.getDoorType();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.StairwayDirection <em>Stairway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.StairwayDirection
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairwayDirection()
		 * @generated
		 */
		EEnum STAIRWAY_DIRECTION = eINSTANCE.getStairwayDirection();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.Sex
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

	}

} //CabinPackage
