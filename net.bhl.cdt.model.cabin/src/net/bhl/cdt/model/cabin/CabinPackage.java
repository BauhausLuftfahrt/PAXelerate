/**
 */
package net.bhl.cdt.model.cabin;

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
	 * The feature id for the '<em><b>Cabin Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CABIN_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Cabin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CABIN_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Numb Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NUMB_SEATS = 2;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__CLASSES = 3;

	/**
	 * The feature id for the '<em><b>Doors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__DOORS = 4;

	/**
	 * The feature id for the '<em><b>Exits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__EXITS = 5;

	/**
	 * The feature id for the '<em><b>Toilets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__TOILETS = 6;

	/**
	 * The feature id for the '<em><b>Galleys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__GALLEYS = 7;

	/**
	 * The feature id for the '<em><b>Stairs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STAIRS = 8;

	/**
	 * The feature id for the '<em><b>Partition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PARTITION = 9;

	/**
	 * The feature id for the '<em><b>Stowage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__STOWAGE = 10;

	/**
	 * The feature id for the '<em><b>Numb Aisles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NUMB_AISLES = 11;

	/**
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BOARDING_TIME = 12;

	/**
	 * The feature id for the '<em><b>FCpassengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__FCPASSENGERS = 13;

	/**
	 * The feature id for the '<em><b>BCpassengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BCPASSENGERS = 14;

	/**
	 * The feature id for the '<em><b>PE Cpassengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__PE_CPASSENGERS = 15;

	/**
	 * The feature id for the '<em><b>Total Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__TOTAL_PASSENGERS = 16;

	/**
	 * The feature id for the '<em><b>Row Nonexistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__ROW_NONEXISTENT = 17;

	/**
	 * The number of structural features of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_OPERATION_COUNT = 0;


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
	 * The feature id for the '<em><b>Additional Legroom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__ADDITIONAL_LEGROOM = 3;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Passenger Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Passenger Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CabinDoorImpl <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CabinDoorImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinDoor()
	 * @generated
	 */
	int CABIN_DOOR = 3;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOOR__YPOSITION = 0;

	/**
	 * The feature id for the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOOR__ON_BOTH_SIDES = 1;

	/**
	 * The feature id for the '<em><b>Main Door</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOOR__MAIN_DOOR = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOOR__WIDTH = 3;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOOR_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Seat Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Seat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__SEAT_TYPE = 1;

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
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__SEAT = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__HEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__AGE = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER__WEIGHT = 5;

	/**
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 6;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.EmergencyExitImpl <em>Emergency Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.EmergencyExitImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getEmergencyExit()
	 * @generated
	 */
	int EMERGENCY_EXIT = 7;

	/**
	 * The feature id for the '<em><b>Exit In Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__EXIT_IN_ROW = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Emergency Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Emergency Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENCY_EXIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.ToiletImpl <em>Toilet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.ToiletImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getToilet()
	 * @generated
	 */
	int TOILET = 8;

	/**
	 * The feature id for the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__XPOSITION = 0;

	/**
	 * The feature id for the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__YPOSITION = 1;

	/**
	 * The feature id for the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__XDIMENSION = 2;

	/**
	 * The feature id for the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__YDIMENSION = 3;

	/**
	 * The number of structural features of the '<em>Toilet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Toilet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.GalleyImpl <em>Galley</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.GalleyImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getGalley()
	 * @generated
	 */
	int GALLEY = 9;

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
	int STAIRWAY = 10;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.PartitionImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Postition After Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__POSTITION_AFTER_ROW = 1;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.StowageImpl <em>Stowage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.StowageImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getStowage()
	 * @generated
	 */
	int STOWAGE = 12;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 14;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.ExitType <em>Exit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.ExitType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getExitType()
	 * @generated
	 */
	int EXIT_TYPE = 15;

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
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.PartitionType <em>Partition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.PartitionType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPartitionType()
	 * @generated
	 */
	int PARTITION_TYPE = 17;

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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getNumbSeats <em>Numb Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numb Seats</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getNumbSeats()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_NumbSeats();

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
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.cabin.Cabin#getExits <em>Exits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exits</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getExits()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Exits();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.cabin.Cabin#getToilets <em>Toilets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Toilets</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getToilets()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Toilets();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.cabin.Cabin#getGalleys <em>Galleys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Galleys</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getGalleys()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Galleys();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.cabin.Cabin#getStairs <em>Stairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stairs</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getStairs()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stairs();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.cabin.Cabin#getPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partition</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getPartition()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Partition();

	/**
	 * Returns the meta object for the reference list '{@link net.bhl.cdt.model.cabin.Cabin#getStowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stowage</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getStowage()
	 * @see #getCabin()
	 * @generated
	 */
	EReference getCabin_Stowage();

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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getTotalPassengers <em>Total Passengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Passengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getTotalPassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_TotalPassengers();

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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getFCpassengers <em>FCpassengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FCpassengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getFCpassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_FCpassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getBCpassengers <em>BCpassengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCpassengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getBCpassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_BCpassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getPECpassengers <em>PE Cpassengers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PE Cpassengers</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getPECpassengers()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_PECpassengers();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getNumbAisles <em>Numb Aisles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numb Aisles</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getNumbAisles()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_NumbAisles();

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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Row#isAdditionalLegroom <em>Additional Legroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Legroom</em>'.
	 * @see net.bhl.cdt.model.cabin.Row#isAdditionalLegroom()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_AdditionalLegroom();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.CabinDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoor
	 * @generated
	 */
	EClass getCabinDoor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinDoor#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoor#getYPosition()
	 * @see #getCabinDoor()
	 * @generated
	 */
	EAttribute getCabinDoor_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinDoor#isOnBothSides <em>On Both Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Both Sides</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoor#isOnBothSides()
	 * @see #getCabinDoor()
	 * @generated
	 */
	EAttribute getCabinDoor_OnBothSides();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinDoor#isMainDoor <em>Main Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Door</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoor#isMainDoor()
	 * @see #getCabinDoor()
	 * @generated
	 */
	EAttribute getCabinDoor_MainDoor();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinDoor#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoor#getWidth()
	 * @see #getCabinDoor()
	 * @generated
	 */
	EAttribute getCabinDoor_Width();

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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Seat#getSeatType <em>Seat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Type</em>'.
	 * @see net.bhl.cdt.model.cabin.Seat#getSeatType()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_SeatType();

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
	 * Returns the meta object for the reference '{@link net.bhl.cdt.model.cabin.Passenger#getSeat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seat</em>'.
	 * @see net.bhl.cdt.model.cabin.Passenger#getSeat()
	 * @see #getPassenger()
	 * @generated
	 */
	EReference getPassenger_Seat();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.EmergencyExit <em>Emergency Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emergency Exit</em>'.
	 * @see net.bhl.cdt.model.cabin.EmergencyExit
	 * @generated
	 */
	EClass getEmergencyExit();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.EmergencyExit#getExitInRow <em>Exit In Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit In Row</em>'.
	 * @see net.bhl.cdt.model.cabin.EmergencyExit#getExitInRow()
	 * @see #getEmergencyExit()
	 * @generated
	 */
	EAttribute getEmergencyExit_ExitInRow();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.EmergencyExit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.bhl.cdt.model.cabin.EmergencyExit#getType()
	 * @see #getEmergencyExit()
	 * @generated
	 */
	EAttribute getEmergencyExit_Type();

	/**
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Toilet <em>Toilet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toilet</em>'.
	 * @see net.bhl.cdt.model.cabin.Toilet
	 * @generated
	 */
	EClass getToilet();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Toilet#getXPosition <em>XPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Toilet#getXPosition()
	 * @see #getToilet()
	 * @generated
	 */
	EAttribute getToilet_XPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Toilet#getYPosition <em>YPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPosition</em>'.
	 * @see net.bhl.cdt.model.cabin.Toilet#getYPosition()
	 * @see #getToilet()
	 * @generated
	 */
	EAttribute getToilet_YPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Toilet#getXDimension <em>XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Toilet#getXDimension()
	 * @see #getToilet()
	 * @generated
	 */
	EAttribute getToilet_XDimension();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Toilet#getYDimension <em>YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YDimension</em>'.
	 * @see net.bhl.cdt.model.cabin.Toilet#getYDimension()
	 * @see #getToilet()
	 * @generated
	 */
	EAttribute getToilet_YDimension();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see net.bhl.cdt.model.cabin.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Partition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.bhl.cdt.model.cabin.Partition#getType()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Partition#getPostitionAfterRow <em>Postition After Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postition After Row</em>'.
	 * @see net.bhl.cdt.model.cabin.Partition#getPostitionAfterRow()
	 * @see #getPartition()
	 * @generated
	 */
	EAttribute getPartition_PostitionAfterRow();

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
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Type</em>'.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @generated
	 */
	EEnum getClassType();

	/**
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.ExitType <em>Exit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exit Type</em>'.
	 * @see net.bhl.cdt.model.cabin.ExitType
	 * @generated
	 */
	EEnum getExitType();

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
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.PartitionType <em>Partition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Partition Type</em>'.
	 * @see net.bhl.cdt.model.cabin.PartitionType
	 * @generated
	 */
	EEnum getPartitionType();

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
		 * The meta object literal for the '<em><b>Numb Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__NUMB_SEATS = eINSTANCE.getCabin_NumbSeats();
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
		 * The meta object literal for the '<em><b>Exits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__EXITS = eINSTANCE.getCabin_Exits();
		/**
		 * The meta object literal for the '<em><b>Toilets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__TOILETS = eINSTANCE.getCabin_Toilets();
		/**
		 * The meta object literal for the '<em><b>Galleys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__GALLEYS = eINSTANCE.getCabin_Galleys();
		/**
		 * The meta object literal for the '<em><b>Stairs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__STAIRS = eINSTANCE.getCabin_Stairs();
		/**
		 * The meta object literal for the '<em><b>Partition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__PARTITION = eINSTANCE.getCabin_Partition();
		/**
		 * The meta object literal for the '<em><b>Stowage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABIN__STOWAGE = eINSTANCE.getCabin_Stowage();
		/**
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__BOARDING_TIME = eINSTANCE.getCabin_BoardingTime();
		/**
		 * The meta object literal for the '<em><b>Total Passengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__TOTAL_PASSENGERS = eINSTANCE.getCabin_TotalPassengers();
		/**
		 * The meta object literal for the '<em><b>Row Nonexistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__ROW_NONEXISTENT = eINSTANCE.getCabin_RowNonexistent();
		/**
		 * The meta object literal for the '<em><b>FCpassengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__FCPASSENGERS = eINSTANCE.getCabin_FCpassengers();
		/**
		 * The meta object literal for the '<em><b>BCpassengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__BCPASSENGERS = eINSTANCE.getCabin_BCpassengers();
		/**
		 * The meta object literal for the '<em><b>PE Cpassengers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__PE_CPASSENGERS = eINSTANCE.getCabin_PECpassengers();
		/**
		 * The meta object literal for the '<em><b>Numb Aisles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__NUMB_AISLES = eINSTANCE.getCabin_NumbAisles();
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
		 * The meta object literal for the '<em><b>Additional Legroom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__ADDITIONAL_LEGROOM = eINSTANCE.getRow_AdditionalLegroom();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.CabinDoorImpl <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.CabinDoorImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinDoor()
		 * @generated
		 */
		EClass CABIN_DOOR = eINSTANCE.getCabinDoor();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_DOOR__YPOSITION = eINSTANCE.getCabinDoor_YPosition();
		/**
		 * The meta object literal for the '<em><b>On Both Sides</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_DOOR__ON_BOTH_SIDES = eINSTANCE.getCabinDoor_OnBothSides();
		/**
		 * The meta object literal for the '<em><b>Main Door</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_DOOR__MAIN_DOOR = eINSTANCE.getCabinDoor_MainDoor();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_DOOR__WIDTH = eINSTANCE.getCabinDoor_Width();
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
		 * The meta object literal for the '<em><b>Seat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__SEAT_TYPE = eINSTANCE.getSeat_SeatType();
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
		 * The meta object literal for the '<em><b>Seat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER__SEAT = eINSTANCE.getPassenger_Seat();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.EmergencyExitImpl <em>Emergency Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.EmergencyExitImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getEmergencyExit()
		 * @generated
		 */
		EClass EMERGENCY_EXIT = eINSTANCE.getEmergencyExit();
		/**
		 * The meta object literal for the '<em><b>Exit In Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMERGENCY_EXIT__EXIT_IN_ROW = eINSTANCE.getEmergencyExit_ExitInRow();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMERGENCY_EXIT__TYPE = eINSTANCE.getEmergencyExit_Type();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.ToiletImpl <em>Toilet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.ToiletImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getToilet()
		 * @generated
		 */
		EClass TOILET = eINSTANCE.getToilet();
		/**
		 * The meta object literal for the '<em><b>XPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOILET__XPOSITION = eINSTANCE.getToilet_XPosition();
		/**
		 * The meta object literal for the '<em><b>YPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOILET__YPOSITION = eINSTANCE.getToilet_YPosition();
		/**
		 * The meta object literal for the '<em><b>XDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOILET__XDIMENSION = eINSTANCE.getToilet_XDimension();
		/**
		 * The meta object literal for the '<em><b>YDimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOILET__YDIMENSION = eINSTANCE.getToilet_YDimension();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.PartitionImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__TYPE = eINSTANCE.getPartition_Type();
		/**
		 * The meta object literal for the '<em><b>Postition After Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTITION__POSTITION_AFTER_ROW = eINSTANCE.getPartition_PostitionAfterRow();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.ClassType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getClassType()
		 * @generated
		 */
		EEnum CLASS_TYPE = eINSTANCE.getClassType();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.ExitType <em>Exit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.ExitType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getExitType()
		 * @generated
		 */
		EEnum EXIT_TYPE = eINSTANCE.getExitType();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.PartitionType <em>Partition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.PartitionType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getPartitionType()
		 * @generated
		 */
		EEnum PARTITION_TYPE = eINSTANCE.getPartitionType();
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
