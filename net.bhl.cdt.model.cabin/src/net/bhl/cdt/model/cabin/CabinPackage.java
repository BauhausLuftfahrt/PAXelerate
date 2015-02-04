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
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CLASSES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__DOORS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Lavatories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__LAVATORIES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Galleys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__GALLEYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Stairways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STAIRWAYS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Curtains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CURTAINS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stowages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STOWAGES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Passengers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PASSENGERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__SCALE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BOARDING_TIME = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl <em>Travel Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.TravelClassImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getTravelClass()
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
	 * The number of operations of the '<em>Travel Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.BusinessClassImpl <em>Business Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.BusinessClassImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getBusinessClass()
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
	 * The number of operations of the '<em>Business Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.FirstClassImpl <em>First Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.FirstClassImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getFirstClass()
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
	 * The number of operations of the '<em>First Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.EconomyClassImpl <em>Economy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.EconomyClassImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getEconomyClass()
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
	 * The number of operations of the '<em>Economy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMY_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.PremiumEconomyClassImpl <em>Premium Economy Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.PremiumEconomyClassImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPremiumEconomyClass()
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
	 * The number of operations of the '<em>Premium Economy Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREMIUM_ECONOMY_CLASS_OPERATION_COUNT = TRAVEL_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.DoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.DoorImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 16;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.SeatImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 7;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.PassengerImpl <em>Passenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.PassengerImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassenger()
	 * @generated
	 */
	int PASSENGER = 8;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CrewMemberImpl <em>Crew Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CrewMemberImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCrewMember()
	 * @generated
	 */
	int CREW_MEMBER = 9;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.PhysicalObjectImpl <em>Physical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.PhysicalObjectImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPhysicalObject()
	 * @generated
	 */
	int PHYSICAL_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__XDIMENSION = 2;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT__YDIMENSION = 3;

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
	 * The number of operations of the '<em>Physical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

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
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = PHYSICAL_OBJECT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Has Luggage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HAS_LUGGAGE = 19;

	/**
	 * The feature id for the '<em><b>Luggage Stow Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__LUGGAGE_STOW_TIME = 20;

	/**
	 * The feature id for the '<em><b>Travel Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__TRAVEL_CLASS = 21;

	/**
	 * The feature id for the '<em><b>Passenger Mood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__PASSENGER_MOOD = 22;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 23;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.LavatoryImpl <em>Lavatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.LavatoryImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getLavatory()
	 * @generated
	 */
	int LAVATORY = 11;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

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
	 * The number of operations of the '<em>Lavatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAVATORY_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.GalleyImpl <em>Galley</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.GalleyImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getGalley()
	 * @generated
	 */
	int GALLEY = 12;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

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
	 * The number of operations of the '<em>Galley</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLEY_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.StairwayImpl <em>Stairway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.StairwayImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairway()
	 * @generated
	 */
	int STAIRWAY = 13;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

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
	 * The number of operations of the '<em>Stairway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRWAY_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CurtainImpl <em>Curtain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CurtainImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCurtain()
	 * @generated
	 */
	int CURTAIN = 14;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

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
	 * The number of operations of the '<em>Curtain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURTAIN_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.StowageImpl <em>Stowage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.StowageImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStowage()
	 * @generated
	 */
	int STOWAGE = 15;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__XPOSITION = PHYSICAL_OBJECT__XPOSITION;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__YPOSITION = PHYSICAL_OBJECT__YPOSITION;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__XDIMENSION = PHYSICAL_OBJECT__XDIMENSION;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE__YDIMENSION = PHYSICAL_OBJECT__YDIMENSION;

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
	 * The number of operations of the '<em>Stowage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOWAGE_OPERATION_COUNT = PHYSICAL_OBJECT_OPERATION_COUNT + 0;

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
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl <em>View Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinViewSettings()
	 * @generated
	 */
	int CABIN_VIEW_SETTINGS = 20;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.MainDoorImpl <em>Main Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.MainDoorImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getMainDoor()
	 * @generated
	 */
	int MAIN_DOOR = 17;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_DOOR__YPOSITION = DOOR__YPOSITION;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.EmergencyExitImpl <em>Emergency Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.EmergencyExitImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getEmergencyExit()
	 * @generated
	 */
	int EMERGENCY_EXIT = 18;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__YPOSITION = DOOR__YPOSITION;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.StandardDoorImpl <em>Standard Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.StandardDoorImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStandardDoor()
	 * @generated
	 */
	int STANDARD_DOOR = 19;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DOOR__YPOSITION = DOOR__YPOSITION;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.StairwayDirection <em>Stairway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.StairwayDirection
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairwayDirection()
	 * @generated
	 */
	int STAIRWAY_DIRECTION = 22;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.AircraftType <em>Aircraft Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.AircraftType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getAircraftType()
	 * @generated
	 */
	int AIRCRAFT_TYPE = 23;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.PassengerMood <em>Passenger Mood</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.PassengerMood
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassengerMood()
	 * @generated
	 */
	int PASSENGER_MOOD = 24;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 21;


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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getAircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aircraft Type</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getAircraftType()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_AircraftType();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#isUsePresetSettings <em>Use Preset Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Preset Settings</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#isUsePresetSettings()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_UsePresetSettings();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getSpeedFactor()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_SpeedFactor();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.TravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Class</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass
	 * @generated
	 */
	EClass getTravelClass();

	/**
	 * Returns the meta object for the containment reference list '{@link net.bhl.cdt.model.cabin.TravelClass#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getRows()
	 * @see #getTravelClass()
	 * @generated
	 */
	EReference getTravelClass_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getSequence()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Sequence();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getPassengers <em>Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getPassengers()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Passengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getAvailableSeats <em>Available Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Seats</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getAvailableSeats()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_AvailableSeats();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getSeatPitch <em>Seat Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Pitch</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getSeatPitch()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatPitch();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getSeatLength <em>Seat Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Length</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getSeatLength()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatLength();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getSeatWidth <em>Seat Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Width</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getSeatWidth()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_SeatWidth();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getName()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.TravelClass#getRowStructure <em>Row Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Structure</em>'.
	 * @see net.bhl.cdt.model.cabin.TravelClass#getRowStructure()
	 * @see #getTravelClass()
	 * @generated
	 */
	EAttribute getTravelClass_RowStructure();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.BusinessClass <em>Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Class</em>'.
	 * @see net.bhl.cdt.model.cabin.BusinessClass
	 * @generated
	 */
	EClass getBusinessClass();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.FirstClass <em>First Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Class</em>'.
	 * @see net.bhl.cdt.model.cabin.FirstClass
	 * @generated
	 */
	EClass getFirstClass();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.EconomyClass <em>Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economy Class</em>'.
	 * @see net.bhl.cdt.model.cabin.EconomyClass
	 * @generated
	 */
	EClass getEconomyClass();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.PremiumEconomyClass <em>Premium Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Premium Economy Class</em>'.
	 * @see net.bhl.cdt.model.cabin.PremiumEconomyClass
	 * @generated
	 */
	EClass getPremiumEconomyClass();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat
	 * @generated
	 */
	EClass getSeat();

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
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.cabin.Seat#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getTravelClass()
	 * @see #getSeat()
	 * @generated
	 */
	EReference getSeat_TravelClass();

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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#isHasLuggage <em>Has Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Luggage</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#isHasLuggage()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_HasLuggage();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getLuggageStowTime <em>Luggage Stow Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Time</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getLuggageStowTime()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_LuggageStowTime();

	/**
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.cabin.Passenger#getTravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Travel Class</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getTravelClass()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_TravelClass();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Passenger#getPassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Mood</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getPassengerMood()
	 * @see #getPassenger()
	 * @generated
	 */
	EAttribute getPassenger_PassengerMood();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Galley</em>'.
	 * @see net.bhl.cdt.model.cabin.Galley
	 * @generated
	 */
	EClass getGalley();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Stowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stowage</em>'.
	 * @see net.bhl.cdt.model.cabin.Stowage
	 * @generated
	 */
	EClass getStowage();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.MainDoor <em>Main Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Door</em>'.
	 * @see net.bhl.cdt.model.cabin.MainDoor
	 * @generated
	 */
	EClass getMainDoor();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.EmergencyExit <em>Emergency Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emergency Exit</em>'.
	 * @see net.bhl.cdt.model.cabin.EmergencyExit
	 * @generated
	 */
	EClass getEmergencyExit();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.StandardDoor <em>Standard Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Door</em>'.
	 * @see net.bhl.cdt.model.cabin.StandardDoor
	 * @generated
	 */
	EClass getStandardDoor();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.PhysicalObject <em>Physical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Object</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject
	 * @generated
	 */
	EClass getPhysicalObject();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PhysicalObject#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject#getXPosition()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PhysicalObject#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject#getYPosition()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PhysicalObject#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject#getXDimension()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PhysicalObject#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject#getYDimension()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_YDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PhysicalObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject#getName()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.PhysicalObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.bhl.cdt.model.cabin.PhysicalObject#getId()
	 * @see #getPhysicalObject()
	 * @generated
	 */
	EAttribute getPhysicalObject_Id();

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
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.AircraftType <em>Aircraft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aircraft Type</em>'.
	 * @see net.bhl.cdt.model.cabin.AircraftType
	 * @generated
	 */
	EEnum getAircraftType();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.PassengerMood <em>Passenger Mood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passenger Mood</em>'.
	 * @see net.bhl.cdt.model.cabin.PassengerMood
	 * @generated
	 */
	EEnum getPassengerMood();

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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.TravelClassImpl <em>Travel Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.TravelClassImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getTravelClass()
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.BusinessClassImpl <em>Business Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.BusinessClassImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getBusinessClass()
		 * @generated
		 */
		EClass BUSINESS_CLASS = eINSTANCE.getBusinessClass();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.FirstClassImpl <em>First Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.FirstClassImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getFirstClass()
		 * @generated
		 */
		EClass FIRST_CLASS = eINSTANCE.getFirstClass();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.EconomyClassImpl <em>Economy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.EconomyClassImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getEconomyClass()
		 * @generated
		 */
		EClass ECONOMY_CLASS = eINSTANCE.getEconomyClass();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.PremiumEconomyClassImpl <em>Premium Economy Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.PremiumEconomyClassImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPremiumEconomyClass()
		 * @generated
		 */
		EClass PREMIUM_ECONOMY_CLASS = eINSTANCE.getPremiumEconomyClass();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.SeatImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSeat()
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
		 * The meta object literal for the '<em><b>Has Luggage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER__HAS_LUGGAGE = eINSTANCE.getPassenger_HasLuggage();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.GalleyImpl <em>Galley</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.GalleyImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getGalley()
		 * @generated
		 */
		EClass GALLEY = eINSTANCE.getGalley();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.StowageImpl <em>Stowage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.StowageImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStowage()
		 * @generated
		 */
		EClass STOWAGE = eINSTANCE.getStowage();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.MainDoorImpl <em>Main Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.MainDoorImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getMainDoor()
		 * @generated
		 */
		EClass MAIN_DOOR = eINSTANCE.getMainDoor();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.EmergencyExitImpl <em>Emergency Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.EmergencyExitImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getEmergencyExit()
		 * @generated
		 */
		EClass EMERGENCY_EXIT = eINSTANCE.getEmergencyExit();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.StandardDoorImpl <em>Standard Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.StandardDoorImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStandardDoor()
		 * @generated
		 */
		EClass STANDARD_DOOR = eINSTANCE.getStandardDoor();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.PhysicalObjectImpl <em>Physical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.PhysicalObjectImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPhysicalObject()
		 * @generated
		 */
		EClass PHYSICAL_OBJECT = eINSTANCE.getPhysicalObject();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__XPOSITION = eINSTANCE.getPhysicalObject_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__YPOSITION = eINSTANCE.getPhysicalObject_YPosition();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__XDIMENSION = eINSTANCE.getPhysicalObject_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_OBJECT__YDIMENSION = eINSTANCE.getPhysicalObject_YDimension();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.StairwayDirection <em>Stairway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.StairwayDirection
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStairwayDirection()
		 * @generated
		 */
		EEnum STAIRWAY_DIRECTION = eINSTANCE.getStairwayDirection();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.AircraftType <em>Aircraft Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.AircraftType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getAircraftType()
		 * @generated
		 */
		EEnum AIRCRAFT_TYPE = eINSTANCE.getAircraftType();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.PassengerMood <em>Passenger Mood</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.PassengerMood
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPassengerMood()
		 * @generated
		 */
		EEnum PASSENGER_MOOD = eINSTANCE.getPassengerMood();
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
