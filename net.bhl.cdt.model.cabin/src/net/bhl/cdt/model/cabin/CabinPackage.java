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
	 * The feature id for the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BOARDING_TIME = 5;

	/**
	 * The feature id for the '<em><b>FCperc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__FCPERC = 6;

	/**
	 * The feature id for the '<em><b>BCperc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__BCPERC = 7;

	/**
	 * The feature id for the '<em><b>Numb Aisles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN__NUMB_AISLES = 8;

	/**
	 * The number of structural features of the '<em>Cabin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS__ROWS = 1;

	/**
	 * The number of structural features of the '<em>Passenger Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Passenger Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.impl.CabinDoorsImpl <em>Doors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.impl.CabinDoorsImpl
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinDoors()
	 * @generated
	 */
	int CABIN_DOORS = 3;

	/**
	 * The feature id for the '<em><b>XCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOORS__XCOORDINATE = 0;

	/**
	 * The feature id for the '<em><b>YCoordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOORS__YCOORDINATE = 1;

	/**
	 * The number of structural features of the '<em>Doors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Doors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABIN_DOORS_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Passenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 6;


	/**
	 * The meta object id for the '{@link net.bhl.cdt.model.cabin.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 7;


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
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getFCperc <em>FCperc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FCperc</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getFCperc()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_FCperc();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.Cabin#getBCperc <em>BCperc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BCperc</em>'.
	 * @see net.bhl.cdt.model.cabin.Cabin#getBCperc()
	 * @see #getCabin()
	 * @generated
	 */
	EAttribute getCabin_BCperc();

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
	 * Returns the meta object for class '{@link net.bhl.cdt.model.cabin.CabinDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doors</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoors
	 * @generated
	 */
	EClass getCabinDoors();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinDoors#getXCoordinate <em>XCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XCoordinate</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoors#getXCoordinate()
	 * @see #getCabinDoors()
	 * @generated
	 */
	EAttribute getCabinDoors_XCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link net.bhl.cdt.model.cabin.CabinDoors#getYCoordinate <em>YCoordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YCoordinate</em>'.
	 * @see net.bhl.cdt.model.cabin.CabinDoors#getYCoordinate()
	 * @see #getCabinDoors()
	 * @generated
	 */
	EAttribute getCabinDoors_YCoordinate();

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
	 * Returns the meta object for enum '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Type</em>'.
	 * @see net.bhl.cdt.model.cabin.ClassType
	 * @generated
	 */
	EEnum getClassType();

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
		 * The meta object literal for the '<em><b>Boarding Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__BOARDING_TIME = eINSTANCE.getCabin_BoardingTime();
		/**
		 * The meta object literal for the '<em><b>FCperc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__FCPERC = eINSTANCE.getCabin_FCperc();
		/**
		 * The meta object literal for the '<em><b>BCperc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN__BCPERC = eINSTANCE.getCabin_BCperc();
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
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_CLASS__ROWS = eINSTANCE.getPassengerClass_Rows();
		/**
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.impl.CabinDoorsImpl <em>Doors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.impl.CabinDoorsImpl
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getCabinDoors()
		 * @generated
		 */
		EClass CABIN_DOORS = eINSTANCE.getCabinDoors();
		/**
		 * The meta object literal for the '<em><b>XCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_DOORS__XCOORDINATE = eINSTANCE.getCabinDoors_XCoordinate();
		/**
		 * The meta object literal for the '<em><b>YCoordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABIN_DOORS__YCOORDINATE = eINSTANCE.getCabinDoors_YCoordinate();
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
		 * The meta object literal for the '{@link net.bhl.cdt.model.cabin.ClassType <em>Class Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.bhl.cdt.model.cabin.ClassType
		 * @see net.bhl.cdt.model.cabin.impl.CabinPackageImpl#getClassType()
		 * @generated
		 */
		EEnum CLASS_TYPE = eINSTANCE.getClassType();
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
