/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.Stowage;
import net.bhl.cdt.model.impl.NamedElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getCabinLength <em>Cabin Length</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getCabinWidth <em>Cabin Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInFirstClass <em>Seats In First Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFirstClassPassengers <em>First Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInFirstClass <em>Seats Per Row In First Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatPitchInFirst <em>Seat Pitch In First</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatWidthInFirst <em>Seat Width In First</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatLengthInFirst <em>Seat Length In First</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInBusinessClass <em>Seats In Business Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBusinessClassPassengers <em>Business Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInBusinessClass <em>Seats Per Row In Business Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatWidthInBusiness <em>Seat Width In Business</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatLengthInBusiness <em>Seat Length In Business</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatPitchInBusiness <em>Seat Pitch In Business</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInPremiumEconomyClass <em>Seats In Premium Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInPremiumEconomyClass <em>Seats Per Row In Premium Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatWidthInPremiumEconomy <em>Seat Width In Premium Economy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatLengthInPremiumEconomy <em>Seat Length In Premium Economy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatPitchInPremiumEco <em>Seat Pitch In Premium Eco</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInEconomyClass <em>Seats In Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getEconomyClassPassengers <em>Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInEconomyClass <em>Seats Per Row In Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatWidthInEconomy <em>Seat Width In Economy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatLengthInEconomy <em>Seat Length In Economy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatPitchInEconomy <em>Seat Pitch In Economy</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getRowNonexistent <em>Row Nonexistent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFramesPerSecond <em>Frames Per Second</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getStairways <em>Stairways</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getCurtains <em>Curtains</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getStowages <em>Stowages</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBoardingTime <em>Boarding Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CabinImpl extends NamedElementImpl implements Cabin {
	/**
	 * The default value of the '{@link #getCabinLength() <em>Cabin Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinLength()
	 * @generated
	 * @ordered
	 */
	protected static final double CABIN_LENGTH_EDEFAULT = 2411.5;
	/**
	 * The cached value of the '{@link #getCabinLength() <em>Cabin Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinLength()
	 * @generated
	 * @ordered
	 */
	protected double cabinLength = CABIN_LENGTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getCabinWidth() <em>Cabin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double CABIN_WIDTH_EDEFAULT = 364.0;
	/**
	 * The cached value of the '{@link #getCabinWidth() <em>Cabin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinWidth()
	 * @generated
	 * @ordered
	 */
	protected double cabinWidth = CABIN_WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsInFirstClass() <em>Seats In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInFirstClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_FIRST_CLASS_EDEFAULT = 2;
	/**
	 * The cached value of the '{@link #getSeatsInFirstClass() <em>Seats In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInFirstClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsInFirstClass = SEATS_IN_FIRST_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getFirstClassPassengers() <em>First Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_CLASS_PASSENGERS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFirstClassPassengers() <em>First Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected int firstClassPassengers = FIRST_CLASS_PASSENGERS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsPerRowInFirstClass() <em>Seats Per Row In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInFirstClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT = 2;
	/**
	 * The cached value of the '{@link #getSeatsPerRowInFirstClass() <em>Seats Per Row In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInFirstClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsPerRowInFirstClass = SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatPitchInFirst() <em>Seat Pitch In First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInFirst()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_PITCH_IN_FIRST_EDEFAULT = 40.0;
	/**
	 * The cached value of the '{@link #getSeatPitchInFirst() <em>Seat Pitch In First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInFirst()
	 * @generated
	 * @ordered
	 */
	protected double seatPitchInFirst = SEAT_PITCH_IN_FIRST_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatWidthInFirst() <em>Seat Width In First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInFirst()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_WIDTH_IN_FIRST_EDEFAULT = 100.0;
	/**
	 * The cached value of the '{@link #getSeatWidthInFirst() <em>Seat Width In First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInFirst()
	 * @generated
	 * @ordered
	 */
	protected double seatWidthInFirst = SEAT_WIDTH_IN_FIRST_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatLengthInFirst() <em>Seat Length In First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInFirst()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_LENGTH_IN_FIRST_EDEFAULT = 120.0;
	/**
	 * The cached value of the '{@link #getSeatLengthInFirst() <em>Seat Length In First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInFirst()
	 * @generated
	 * @ordered
	 */
	protected double seatLengthInFirst = SEAT_LENGTH_IN_FIRST_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsInBusinessClass() <em>Seats In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInBusinessClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_BUSINESS_CLASS_EDEFAULT = 12;
	/**
	 * The cached value of the '{@link #getSeatsInBusinessClass() <em>Seats In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInBusinessClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsInBusinessClass = SEATS_IN_BUSINESS_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getBusinessClassPassengers() <em>Business Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int BUSINESS_CLASS_PASSENGERS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBusinessClassPassengers() <em>Business Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected int businessClassPassengers = BUSINESS_CLASS_PASSENGERS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsPerRowInBusinessClass() <em>Seats Per Row In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInBusinessClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT = 4;
	/**
	 * The cached value of the '{@link #getSeatsPerRowInBusinessClass() <em>Seats Per Row In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInBusinessClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsPerRowInBusinessClass = SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatWidthInBusiness() <em>Seat Width In Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInBusiness()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_WIDTH_IN_BUSINESS_EDEFAULT = 72.0;
	/**
	 * The cached value of the '{@link #getSeatWidthInBusiness() <em>Seat Width In Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInBusiness()
	 * @generated
	 * @ordered
	 */
	protected double seatWidthInBusiness = SEAT_WIDTH_IN_BUSINESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatLengthInBusiness() <em>Seat Length In Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInBusiness()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_LENGTH_IN_BUSINESS_EDEFAULT = 80.0;
	/**
	 * The cached value of the '{@link #getSeatLengthInBusiness() <em>Seat Length In Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInBusiness()
	 * @generated
	 * @ordered
	 */
	protected double seatLengthInBusiness = SEAT_LENGTH_IN_BUSINESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatPitchInBusiness() <em>Seat Pitch In Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInBusiness()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_PITCH_IN_BUSINESS_EDEFAULT = 30.0;
	/**
	 * The cached value of the '{@link #getSeatPitchInBusiness() <em>Seat Pitch In Business</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInBusiness()
	 * @generated
	 * @ordered
	 */
	protected double seatPitchInBusiness = SEAT_PITCH_IN_BUSINESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsInPremiumEconomyClass() <em>Seats In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInPremiumEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT = 12;
	/**
	 * The cached value of the '{@link #getSeatsInPremiumEconomyClass() <em>Seats In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInPremiumEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsInPremiumEconomyClass = SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPremiumEconomyClassPassengers() <em>Premium Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiumEconomyClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPremiumEconomyClassPassengers() <em>Premium Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiumEconomyClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected int premiumEconomyClassPassengers = PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsPerRowInPremiumEconomyClass() <em>Seats Per Row In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInPremiumEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT = 6;
	/**
	 * The cached value of the '{@link #getSeatsPerRowInPremiumEconomyClass() <em>Seats Per Row In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInPremiumEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsPerRowInPremiumEconomyClass = SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatWidthInPremiumEconomy() <em>Seat Width In Premium Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInPremiumEconomy()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_WIDTH_IN_PREMIUM_ECONOMY_EDEFAULT = 50.0;
	/**
	 * The cached value of the '{@link #getSeatWidthInPremiumEconomy() <em>Seat Width In Premium Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInPremiumEconomy()
	 * @generated
	 * @ordered
	 */
	protected double seatWidthInPremiumEconomy = SEAT_WIDTH_IN_PREMIUM_ECONOMY_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatLengthInPremiumEconomy() <em>Seat Length In Premium Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInPremiumEconomy()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_LENGTH_IN_PREMIUM_ECONOMY_EDEFAULT = 70.0;
	/**
	 * The cached value of the '{@link #getSeatLengthInPremiumEconomy() <em>Seat Length In Premium Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInPremiumEconomy()
	 * @generated
	 * @ordered
	 */
	protected double seatLengthInPremiumEconomy = SEAT_LENGTH_IN_PREMIUM_ECONOMY_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatPitchInPremiumEco() <em>Seat Pitch In Premium Eco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInPremiumEco()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_PITCH_IN_PREMIUM_ECO_EDEFAULT = 30.0;
	/**
	 * The cached value of the '{@link #getSeatPitchInPremiumEco() <em>Seat Pitch In Premium Eco</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInPremiumEco()
	 * @generated
	 * @ordered
	 */
	protected double seatPitchInPremiumEco = SEAT_PITCH_IN_PREMIUM_ECO_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsInEconomyClass() <em>Seats In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_ECONOMY_CLASS_EDEFAULT = 72;
	/**
	 * The cached value of the '{@link #getSeatsInEconomyClass() <em>Seats In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsInEconomyClass = SEATS_IN_ECONOMY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getEconomyClassPassengers() <em>Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomyClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int ECONOMY_CLASS_PASSENGERS_EDEFAULT = 10;
	/**
	 * The cached value of the '{@link #getEconomyClassPassengers() <em>Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomyClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected int economyClassPassengers = ECONOMY_CLASS_PASSENGERS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatsPerRowInEconomyClass() <em>Seats Per Row In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT = 6;
	/**
	 * The cached value of the '{@link #getSeatsPerRowInEconomyClass() <em>Seats Per Row In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected int seatsPerRowInEconomyClass = SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatWidthInEconomy() <em>Seat Width In Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInEconomy()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_WIDTH_IN_ECONOMY_EDEFAULT = 50.0;
	/**
	 * The cached value of the '{@link #getSeatWidthInEconomy() <em>Seat Width In Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatWidthInEconomy()
	 * @generated
	 * @ordered
	 */
	protected double seatWidthInEconomy = SEAT_WIDTH_IN_ECONOMY_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatLengthInEconomy() <em>Seat Length In Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInEconomy()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_LENGTH_IN_ECONOMY_EDEFAULT = 60.0;
	/**
	 * The cached value of the '{@link #getSeatLengthInEconomy() <em>Seat Length In Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatLengthInEconomy()
	 * @generated
	 * @ordered
	 */
	protected double seatLengthInEconomy = SEAT_LENGTH_IN_ECONOMY_EDEFAULT;
	/**
	 * The default value of the '{@link #getSeatPitchInEconomy() <em>Seat Pitch In Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInEconomy()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_PITCH_IN_ECONOMY_EDEFAULT = 20.0;
	/**
	 * The cached value of the '{@link #getSeatPitchInEconomy() <em>Seat Pitch In Economy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatPitchInEconomy()
	 * @generated
	 * @ordered
	 */
	protected double seatPitchInEconomy = SEAT_PITCH_IN_ECONOMY_EDEFAULT;
	/**
	 * The default value of the '{@link #getRowNonexistent() <em>Row Nonexistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNonexistent()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NONEXISTENT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRowNonexistent() <em>Row Nonexistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNonexistent()
	 * @generated
	 * @ordered
	 */
	protected int rowNonexistent = ROW_NONEXISTENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getAisleWidth() <em>Aisle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisleWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double AISLE_WIDTH_EDEFAULT = 64.0;
	/**
	 * The cached value of the '{@link #getAisleWidth() <em>Aisle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisleWidth()
	 * @generated
	 * @ordered
	 */
	protected double aisleWidth = AISLE_WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getFramesPerSecond() <em>Frames Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int FRAMES_PER_SECOND_EDEFAULT = 5;
	/**
	 * The cached value of the '{@link #getFramesPerSecond() <em>Frames Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected int framesPerSecond = FRAMES_PER_SECOND_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfDecks() <em>Number Of Decks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDecks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DECKS_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getNumberOfDecks() <em>Number Of Decks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDecks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDecks = NUMBER_OF_DECKS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<PassengerClass> classes;
	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;
	/**
	 * The cached value of the '{@link #getLavatories() <em>Lavatories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavatories()
	 * @generated
	 * @ordered
	 */
	protected EList<Lavatory> lavatories;
	/**
	 * The cached value of the '{@link #getGalleys() <em>Galleys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalleys()
	 * @generated
	 * @ordered
	 */
	protected EList<Galley> galleys;
	/**
	 * The cached value of the '{@link #getStairways() <em>Stairways</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStairways()
	 * @generated
	 * @ordered
	 */
	protected EList<Stairway> stairways;
	/**
	 * The cached value of the '{@link #getCurtains() <em>Curtains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtains()
	 * @generated
	 * @ordered
	 */
	protected EList<Curtain> curtains;
	/**
	 * The cached value of the '{@link #getStowages() <em>Stowages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stowage> stowages;
	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passengers;
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 4.0;
	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double BOARDING_TIME_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getBoardingTime() <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected double boardingTime = BOARDING_TIME_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.CABIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCabinLength() {
		return cabinLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCabinLength(double newCabinLength) {
		double oldCabinLength = cabinLength;
		cabinLength = newCabinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__CABIN_LENGTH, oldCabinLength, cabinLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCabinWidth() {
		return cabinWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCabinWidth(double newCabinWidth) {
		double oldCabinWidth = cabinWidth;
		cabinWidth = newCabinWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__CABIN_WIDTH, oldCabinWidth, cabinWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassengerClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<PassengerClass>(PassengerClass.class, this, CabinPackage.CABIN__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentEList<Door>(Door.class, this, CabinPackage.CABIN__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lavatory> getLavatories() {
		if (lavatories == null) {
			lavatories = new EObjectContainmentEList<Lavatory>(Lavatory.class, this, CabinPackage.CABIN__LAVATORIES);
		}
		return lavatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Galley> getGalleys() {
		if (galleys == null) {
			galleys = new EObjectContainmentEList<Galley>(Galley.class, this, CabinPackage.CABIN__GALLEYS);
		}
		return galleys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stairway> getStairways() {
		if (stairways == null) {
			stairways = new EObjectContainmentEList<Stairway>(Stairway.class, this, CabinPackage.CABIN__STAIRWAYS);
		}
		return stairways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Curtain> getCurtains() {
		if (curtains == null) {
			curtains = new EObjectContainmentEList<Curtain>(Curtain.class, this, CabinPackage.CABIN__CURTAINS);
		}
		return curtains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stowage> getStowages() {
		if (stowages == null) {
			stowages = new EObjectContainmentEList<Stowage>(Stowage.class, this, CabinPackage.CABIN__STOWAGES);
		}
		return stowages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsInEconomyClass() {
		return seatsInEconomyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsInEconomyClass(int newSeatsInEconomyClass) {
		int oldSeatsInEconomyClass = seatsInEconomyClass;
		seatsInEconomyClass = newSeatsInEconomyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS, oldSeatsInEconomyClass, seatsInEconomyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsInPremiumEconomyClass() {
		return seatsInPremiumEconomyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsInPremiumEconomyClass(int newSeatsInPremiumEconomyClass) {
		int oldSeatsInPremiumEconomyClass = seatsInPremiumEconomyClass;
		seatsInPremiumEconomyClass = newSeatsInPremiumEconomyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS, oldSeatsInPremiumEconomyClass, seatsInPremiumEconomyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsInBusinessClass() {
		return seatsInBusinessClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsInBusinessClass(int newSeatsInBusinessClass) {
		int oldSeatsInBusinessClass = seatsInBusinessClass;
		seatsInBusinessClass = newSeatsInBusinessClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS, oldSeatsInBusinessClass, seatsInBusinessClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsInFirstClass() {
		return seatsInFirstClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsInFirstClass(int newSeatsInFirstClass) {
		int oldSeatsInFirstClass = seatsInFirstClass;
		seatsInFirstClass = newSeatsInFirstClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_IN_FIRST_CLASS, oldSeatsInFirstClass, seatsInFirstClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsPerRowInEconomyClass() {
		return seatsPerRowInEconomyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsPerRowInEconomyClass(int newSeatsPerRowInEconomyClass) {
		int oldSeatsPerRowInEconomyClass = seatsPerRowInEconomyClass;
		seatsPerRowInEconomyClass = newSeatsPerRowInEconomyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS, oldSeatsPerRowInEconomyClass, seatsPerRowInEconomyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatWidthInEconomy() {
		return seatWidthInEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatWidthInEconomy(double newSeatWidthInEconomy) {
		double oldSeatWidthInEconomy = seatWidthInEconomy;
		seatWidthInEconomy = newSeatWidthInEconomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_WIDTH_IN_ECONOMY, oldSeatWidthInEconomy, seatWidthInEconomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatLengthInEconomy() {
		return seatLengthInEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLengthInEconomy(double newSeatLengthInEconomy) {
		double oldSeatLengthInEconomy = seatLengthInEconomy;
		seatLengthInEconomy = newSeatLengthInEconomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_LENGTH_IN_ECONOMY, oldSeatLengthInEconomy, seatLengthInEconomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatPitchInEconomy() {
		return seatPitchInEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatPitchInEconomy(double newSeatPitchInEconomy) {
		double oldSeatPitchInEconomy = seatPitchInEconomy;
		seatPitchInEconomy = newSeatPitchInEconomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_PITCH_IN_ECONOMY, oldSeatPitchInEconomy, seatPitchInEconomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsPerRowInBusinessClass() {
		return seatsPerRowInBusinessClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsPerRowInBusinessClass(int newSeatsPerRowInBusinessClass) {
		int oldSeatsPerRowInBusinessClass = seatsPerRowInBusinessClass;
		seatsPerRowInBusinessClass = newSeatsPerRowInBusinessClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS, oldSeatsPerRowInBusinessClass, seatsPerRowInBusinessClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatWidthInBusiness() {
		return seatWidthInBusiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatWidthInBusiness(double newSeatWidthInBusiness) {
		double oldSeatWidthInBusiness = seatWidthInBusiness;
		seatWidthInBusiness = newSeatWidthInBusiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_WIDTH_IN_BUSINESS, oldSeatWidthInBusiness, seatWidthInBusiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatLengthInBusiness() {
		return seatLengthInBusiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLengthInBusiness(double newSeatLengthInBusiness) {
		double oldSeatLengthInBusiness = seatLengthInBusiness;
		seatLengthInBusiness = newSeatLengthInBusiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_LENGTH_IN_BUSINESS, oldSeatLengthInBusiness, seatLengthInBusiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatPitchInBusiness() {
		return seatPitchInBusiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatPitchInBusiness(double newSeatPitchInBusiness) {
		double oldSeatPitchInBusiness = seatPitchInBusiness;
		seatPitchInBusiness = newSeatPitchInBusiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_PITCH_IN_BUSINESS, oldSeatPitchInBusiness, seatPitchInBusiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsPerRowInFirstClass() {
		return seatsPerRowInFirstClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsPerRowInFirstClass(int newSeatsPerRowInFirstClass) {
		int oldSeatsPerRowInFirstClass = seatsPerRowInFirstClass;
		seatsPerRowInFirstClass = newSeatsPerRowInFirstClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS, oldSeatsPerRowInFirstClass, seatsPerRowInFirstClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatPitchInFirst() {
		return seatPitchInFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatPitchInFirst(double newSeatPitchInFirst) {
		double oldSeatPitchInFirst = seatPitchInFirst;
		seatPitchInFirst = newSeatPitchInFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_PITCH_IN_FIRST, oldSeatPitchInFirst, seatPitchInFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatWidthInFirst() {
		return seatWidthInFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatWidthInFirst(double newSeatWidthInFirst) {
		double oldSeatWidthInFirst = seatWidthInFirst;
		seatWidthInFirst = newSeatWidthInFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_WIDTH_IN_FIRST, oldSeatWidthInFirst, seatWidthInFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatLengthInFirst() {
		return seatLengthInFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLengthInFirst(double newSeatLengthInFirst) {
		double oldSeatLengthInFirst = seatLengthInFirst;
		seatLengthInFirst = newSeatLengthInFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_LENGTH_IN_FIRST, oldSeatLengthInFirst, seatLengthInFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeatsPerRowInPremiumEconomyClass() {
		return seatsPerRowInPremiumEconomyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatsPerRowInPremiumEconomyClass(int newSeatsPerRowInPremiumEconomyClass) {
		int oldSeatsPerRowInPremiumEconomyClass = seatsPerRowInPremiumEconomyClass;
		seatsPerRowInPremiumEconomyClass = newSeatsPerRowInPremiumEconomyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS, oldSeatsPerRowInPremiumEconomyClass, seatsPerRowInPremiumEconomyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatWidthInPremiumEconomy() {
		return seatWidthInPremiumEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatWidthInPremiumEconomy(double newSeatWidthInPremiumEconomy) {
		double oldSeatWidthInPremiumEconomy = seatWidthInPremiumEconomy;
		seatWidthInPremiumEconomy = newSeatWidthInPremiumEconomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY, oldSeatWidthInPremiumEconomy, seatWidthInPremiumEconomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatLengthInPremiumEconomy() {
		return seatLengthInPremiumEconomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatLengthInPremiumEconomy(double newSeatLengthInPremiumEconomy) {
		double oldSeatLengthInPremiumEconomy = seatLengthInPremiumEconomy;
		seatLengthInPremiumEconomy = newSeatLengthInPremiumEconomy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY, oldSeatLengthInPremiumEconomy, seatLengthInPremiumEconomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatPitchInPremiumEco() {
		return seatPitchInPremiumEco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatPitchInPremiumEco(double newSeatPitchInPremiumEco) {
		double oldSeatPitchInPremiumEco = seatPitchInPremiumEco;
		seatPitchInPremiumEco = newSeatPitchInPremiumEco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SEAT_PITCH_IN_PREMIUM_ECO, oldSeatPitchInPremiumEco, seatPitchInPremiumEco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFramesPerSecond() {
		return framesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFramesPerSecond(int newFramesPerSecond) {
		int oldFramesPerSecond = framesPerSecond;
		framesPerSecond = newFramesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__FRAMES_PER_SECOND, oldFramesPerSecond, framesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passenger> getPassengers() {
		if (passengers == null) {
			passengers = new EObjectContainmentEList<Passenger>(Passenger.class, this, CabinPackage.CABIN__PASSENGERS);
		}
		return passengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfDecks() {
		return numberOfDecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDecks(int newNumberOfDecks) {
		int oldNumberOfDecks = numberOfDecks;
		numberOfDecks = newNumberOfDecks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__NUMBER_OF_DECKS, oldNumberOfDecks, numberOfDecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBoardingTime() {
		return boardingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardingTime(double newBoardingTime) {
		double oldBoardingTime = boardingTime;
		boardingTime = newBoardingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__BOARDING_TIME, oldBoardingTime, boardingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstClassPassengers() {
		return firstClassPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstClassPassengers(int newFirstClassPassengers) {
		int oldFirstClassPassengers = firstClassPassengers;
		firstClassPassengers = newFirstClassPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__FIRST_CLASS_PASSENGERS, oldFirstClassPassengers, firstClassPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBusinessClassPassengers() {
		return businessClassPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessClassPassengers(int newBusinessClassPassengers) {
		int oldBusinessClassPassengers = businessClassPassengers;
		businessClassPassengers = newBusinessClassPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS, oldBusinessClassPassengers, businessClassPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPremiumEconomyClassPassengers() {
		return premiumEconomyClassPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPremiumEconomyClassPassengers(int newPremiumEconomyClassPassengers) {
		int oldPremiumEconomyClassPassengers = premiumEconomyClassPassengers;
		premiumEconomyClassPassengers = newPremiumEconomyClassPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS, oldPremiumEconomyClassPassengers, premiumEconomyClassPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEconomyClassPassengers() {
		return economyClassPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEconomyClassPassengers(int newEconomyClassPassengers) {
		int oldEconomyClassPassengers = economyClassPassengers;
		economyClassPassengers = newEconomyClassPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS, oldEconomyClassPassengers, economyClassPassengers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowNonexistent() {
		return rowNonexistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowNonexistent(int newRowNonexistent) {
		int oldRowNonexistent = rowNonexistent;
		rowNonexistent = newRowNonexistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__ROW_NONEXISTENT, oldRowNonexistent, rowNonexistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAisleWidth() {
		return aisleWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAisleWidth(double newAisleWidth) {
		double oldAisleWidth = aisleWidth;
		aisleWidth = newAisleWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__AISLE_WIDTH, oldAisleWidth, aisleWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.CABIN__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__DOORS:
				return ((InternalEList<?>)getDoors()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__LAVATORIES:
				return ((InternalEList<?>)getLavatories()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__GALLEYS:
				return ((InternalEList<?>)getGalleys()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__STAIRWAYS:
				return ((InternalEList<?>)getStairways()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__CURTAINS:
				return ((InternalEList<?>)getCurtains()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__STOWAGES:
				return ((InternalEList<?>)getStowages()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__PASSENGERS:
				return ((InternalEList<?>)getPassengers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.CABIN__CABIN_LENGTH:
				return getCabinLength();
			case CabinPackage.CABIN__CABIN_WIDTH:
				return getCabinWidth();
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				return getSeatsInFirstClass();
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				return getFirstClassPassengers();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				return getSeatsPerRowInFirstClass();
			case CabinPackage.CABIN__SEAT_PITCH_IN_FIRST:
				return getSeatPitchInFirst();
			case CabinPackage.CABIN__SEAT_WIDTH_IN_FIRST:
				return getSeatWidthInFirst();
			case CabinPackage.CABIN__SEAT_LENGTH_IN_FIRST:
				return getSeatLengthInFirst();
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				return getSeatsInBusinessClass();
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				return getBusinessClassPassengers();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				return getSeatsPerRowInBusinessClass();
			case CabinPackage.CABIN__SEAT_WIDTH_IN_BUSINESS:
				return getSeatWidthInBusiness();
			case CabinPackage.CABIN__SEAT_LENGTH_IN_BUSINESS:
				return getSeatLengthInBusiness();
			case CabinPackage.CABIN__SEAT_PITCH_IN_BUSINESS:
				return getSeatPitchInBusiness();
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				return getSeatsInPremiumEconomyClass();
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				return getPremiumEconomyClassPassengers();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				return getSeatsPerRowInPremiumEconomyClass();
			case CabinPackage.CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY:
				return getSeatWidthInPremiumEconomy();
			case CabinPackage.CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY:
				return getSeatLengthInPremiumEconomy();
			case CabinPackage.CABIN__SEAT_PITCH_IN_PREMIUM_ECO:
				return getSeatPitchInPremiumEco();
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				return getSeatsInEconomyClass();
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				return getEconomyClassPassengers();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				return getSeatsPerRowInEconomyClass();
			case CabinPackage.CABIN__SEAT_WIDTH_IN_ECONOMY:
				return getSeatWidthInEconomy();
			case CabinPackage.CABIN__SEAT_LENGTH_IN_ECONOMY:
				return getSeatLengthInEconomy();
			case CabinPackage.CABIN__SEAT_PITCH_IN_ECONOMY:
				return getSeatPitchInEconomy();
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return getRowNonexistent();
			case CabinPackage.CABIN__AISLE_WIDTH:
				return getAisleWidth();
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
				return getFramesPerSecond();
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				return getNumberOfDecks();
			case CabinPackage.CABIN__CLASSES:
				return getClasses();
			case CabinPackage.CABIN__DOORS:
				return getDoors();
			case CabinPackage.CABIN__LAVATORIES:
				return getLavatories();
			case CabinPackage.CABIN__GALLEYS:
				return getGalleys();
			case CabinPackage.CABIN__STAIRWAYS:
				return getStairways();
			case CabinPackage.CABIN__CURTAINS:
				return getCurtains();
			case CabinPackage.CABIN__STOWAGES:
				return getStowages();
			case CabinPackage.CABIN__PASSENGERS:
				return getPassengers();
			case CabinPackage.CABIN__SCALE:
				return getScale();
			case CabinPackage.CABIN__BOARDING_TIME:
				return getBoardingTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.CABIN__CABIN_LENGTH:
				setCabinLength((Double)newValue);
				return;
			case CabinPackage.CABIN__CABIN_WIDTH:
				setCabinWidth((Double)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				setSeatsInFirstClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				setFirstClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				setSeatsPerRowInFirstClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_FIRST:
				setSeatPitchInFirst((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_FIRST:
				setSeatWidthInFirst((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_FIRST:
				setSeatLengthInFirst((Double)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				setSeatsInBusinessClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				setBusinessClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				setSeatsPerRowInBusinessClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_BUSINESS:
				setSeatWidthInBusiness((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_BUSINESS:
				setSeatLengthInBusiness((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_BUSINESS:
				setSeatPitchInBusiness((Double)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsInPremiumEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				setPremiumEconomyClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsPerRowInPremiumEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY:
				setSeatWidthInPremiumEconomy((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY:
				setSeatLengthInPremiumEconomy((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_PREMIUM_ECO:
				setSeatPitchInPremiumEco((Double)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				setSeatsInEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				setEconomyClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				setSeatsPerRowInEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_ECONOMY:
				setSeatWidthInEconomy((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_ECONOMY:
				setSeatLengthInEconomy((Double)newValue);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_ECONOMY:
				setSeatPitchInEconomy((Double)newValue);
				return;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent((Integer)newValue);
				return;
			case CabinPackage.CABIN__AISLE_WIDTH:
				setAisleWidth((Double)newValue);
				return;
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
				setFramesPerSecond((Integer)newValue);
				return;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				setNumberOfDecks((Integer)newValue);
				return;
			case CabinPackage.CABIN__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends PassengerClass>)newValue);
				return;
			case CabinPackage.CABIN__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends Door>)newValue);
				return;
			case CabinPackage.CABIN__LAVATORIES:
				getLavatories().clear();
				getLavatories().addAll((Collection<? extends Lavatory>)newValue);
				return;
			case CabinPackage.CABIN__GALLEYS:
				getGalleys().clear();
				getGalleys().addAll((Collection<? extends Galley>)newValue);
				return;
			case CabinPackage.CABIN__STAIRWAYS:
				getStairways().clear();
				getStairways().addAll((Collection<? extends Stairway>)newValue);
				return;
			case CabinPackage.CABIN__CURTAINS:
				getCurtains().clear();
				getCurtains().addAll((Collection<? extends Curtain>)newValue);
				return;
			case CabinPackage.CABIN__STOWAGES:
				getStowages().clear();
				getStowages().addAll((Collection<? extends Stowage>)newValue);
				return;
			case CabinPackage.CABIN__PASSENGERS:
				getPassengers().clear();
				getPassengers().addAll((Collection<? extends Passenger>)newValue);
				return;
			case CabinPackage.CABIN__SCALE:
				setScale((Double)newValue);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.CABIN__CABIN_LENGTH:
				setCabinLength(CABIN_LENGTH_EDEFAULT);
				return;
			case CabinPackage.CABIN__CABIN_WIDTH:
				setCabinWidth(CABIN_WIDTH_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				setSeatsInFirstClass(SEATS_IN_FIRST_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				setFirstClassPassengers(FIRST_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				setSeatsPerRowInFirstClass(SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_FIRST:
				setSeatPitchInFirst(SEAT_PITCH_IN_FIRST_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_FIRST:
				setSeatWidthInFirst(SEAT_WIDTH_IN_FIRST_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_FIRST:
				setSeatLengthInFirst(SEAT_LENGTH_IN_FIRST_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				setSeatsInBusinessClass(SEATS_IN_BUSINESS_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				setBusinessClassPassengers(BUSINESS_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				setSeatsPerRowInBusinessClass(SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_BUSINESS:
				setSeatWidthInBusiness(SEAT_WIDTH_IN_BUSINESS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_BUSINESS:
				setSeatLengthInBusiness(SEAT_LENGTH_IN_BUSINESS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_BUSINESS:
				setSeatPitchInBusiness(SEAT_PITCH_IN_BUSINESS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsInPremiumEconomyClass(SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				setPremiumEconomyClassPassengers(PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsPerRowInPremiumEconomyClass(SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY:
				setSeatWidthInPremiumEconomy(SEAT_WIDTH_IN_PREMIUM_ECONOMY_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY:
				setSeatLengthInPremiumEconomy(SEAT_LENGTH_IN_PREMIUM_ECONOMY_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_PREMIUM_ECO:
				setSeatPitchInPremiumEco(SEAT_PITCH_IN_PREMIUM_ECO_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				setSeatsInEconomyClass(SEATS_IN_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				setEconomyClassPassengers(ECONOMY_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				setSeatsPerRowInEconomyClass(SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_ECONOMY:
				setSeatWidthInEconomy(SEAT_WIDTH_IN_ECONOMY_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_ECONOMY:
				setSeatLengthInEconomy(SEAT_LENGTH_IN_ECONOMY_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEAT_PITCH_IN_ECONOMY:
				setSeatPitchInEconomy(SEAT_PITCH_IN_ECONOMY_EDEFAULT);
				return;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent(ROW_NONEXISTENT_EDEFAULT);
				return;
			case CabinPackage.CABIN__AISLE_WIDTH:
				setAisleWidth(AISLE_WIDTH_EDEFAULT);
				return;
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
				setFramesPerSecond(FRAMES_PER_SECOND_EDEFAULT);
				return;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				setNumberOfDecks(NUMBER_OF_DECKS_EDEFAULT);
				return;
			case CabinPackage.CABIN__CLASSES:
				getClasses().clear();
				return;
			case CabinPackage.CABIN__DOORS:
				getDoors().clear();
				return;
			case CabinPackage.CABIN__LAVATORIES:
				getLavatories().clear();
				return;
			case CabinPackage.CABIN__GALLEYS:
				getGalleys().clear();
				return;
			case CabinPackage.CABIN__STAIRWAYS:
				getStairways().clear();
				return;
			case CabinPackage.CABIN__CURTAINS:
				getCurtains().clear();
				return;
			case CabinPackage.CABIN__STOWAGES:
				getStowages().clear();
				return;
			case CabinPackage.CABIN__PASSENGERS:
				getPassengers().clear();
				return;
			case CabinPackage.CABIN__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime(BOARDING_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.CABIN__CABIN_LENGTH:
				return cabinLength != CABIN_LENGTH_EDEFAULT;
			case CabinPackage.CABIN__CABIN_WIDTH:
				return cabinWidth != CABIN_WIDTH_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				return seatsInFirstClass != SEATS_IN_FIRST_CLASS_EDEFAULT;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				return firstClassPassengers != FIRST_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				return seatsPerRowInFirstClass != SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEAT_PITCH_IN_FIRST:
				return seatPitchInFirst != SEAT_PITCH_IN_FIRST_EDEFAULT;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_FIRST:
				return seatWidthInFirst != SEAT_WIDTH_IN_FIRST_EDEFAULT;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_FIRST:
				return seatLengthInFirst != SEAT_LENGTH_IN_FIRST_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				return seatsInBusinessClass != SEATS_IN_BUSINESS_CLASS_EDEFAULT;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				return businessClassPassengers != BUSINESS_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				return seatsPerRowInBusinessClass != SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_BUSINESS:
				return seatWidthInBusiness != SEAT_WIDTH_IN_BUSINESS_EDEFAULT;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_BUSINESS:
				return seatLengthInBusiness != SEAT_LENGTH_IN_BUSINESS_EDEFAULT;
			case CabinPackage.CABIN__SEAT_PITCH_IN_BUSINESS:
				return seatPitchInBusiness != SEAT_PITCH_IN_BUSINESS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				return seatsInPremiumEconomyClass != SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				return premiumEconomyClassPassengers != PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				return seatsPerRowInPremiumEconomyClass != SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_PREMIUM_ECONOMY:
				return seatWidthInPremiumEconomy != SEAT_WIDTH_IN_PREMIUM_ECONOMY_EDEFAULT;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_PREMIUM_ECONOMY:
				return seatLengthInPremiumEconomy != SEAT_LENGTH_IN_PREMIUM_ECONOMY_EDEFAULT;
			case CabinPackage.CABIN__SEAT_PITCH_IN_PREMIUM_ECO:
				return seatPitchInPremiumEco != SEAT_PITCH_IN_PREMIUM_ECO_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				return seatsInEconomyClass != SEATS_IN_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				return economyClassPassengers != ECONOMY_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				return seatsPerRowInEconomyClass != SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEAT_WIDTH_IN_ECONOMY:
				return seatWidthInEconomy != SEAT_WIDTH_IN_ECONOMY_EDEFAULT;
			case CabinPackage.CABIN__SEAT_LENGTH_IN_ECONOMY:
				return seatLengthInEconomy != SEAT_LENGTH_IN_ECONOMY_EDEFAULT;
			case CabinPackage.CABIN__SEAT_PITCH_IN_ECONOMY:
				return seatPitchInEconomy != SEAT_PITCH_IN_ECONOMY_EDEFAULT;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return rowNonexistent != ROW_NONEXISTENT_EDEFAULT;
			case CabinPackage.CABIN__AISLE_WIDTH:
				return aisleWidth != AISLE_WIDTH_EDEFAULT;
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
				return framesPerSecond != FRAMES_PER_SECOND_EDEFAULT;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				return numberOfDecks != NUMBER_OF_DECKS_EDEFAULT;
			case CabinPackage.CABIN__CLASSES:
				return classes != null && !classes.isEmpty();
			case CabinPackage.CABIN__DOORS:
				return doors != null && !doors.isEmpty();
			case CabinPackage.CABIN__LAVATORIES:
				return lavatories != null && !lavatories.isEmpty();
			case CabinPackage.CABIN__GALLEYS:
				return galleys != null && !galleys.isEmpty();
			case CabinPackage.CABIN__STAIRWAYS:
				return stairways != null && !stairways.isEmpty();
			case CabinPackage.CABIN__CURTAINS:
				return curtains != null && !curtains.isEmpty();
			case CabinPackage.CABIN__STOWAGES:
				return stowages != null && !stowages.isEmpty();
			case CabinPackage.CABIN__PASSENGERS:
				return passengers != null && !passengers.isEmpty();
			case CabinPackage.CABIN__SCALE:
				return scale != SCALE_EDEFAULT;
			case CabinPackage.CABIN__BOARDING_TIME:
				return boardingTime != BOARDING_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cabinLength: ");
		result.append(cabinLength);
		result.append(", cabinWidth: ");
		result.append(cabinWidth);
		result.append(", seatsInFirstClass: ");
		result.append(seatsInFirstClass);
		result.append(", firstClassPassengers: ");
		result.append(firstClassPassengers);
		result.append(", seatsPerRowInFirstClass: ");
		result.append(seatsPerRowInFirstClass);
		result.append(", seatPitchInFirst: ");
		result.append(seatPitchInFirst);
		result.append(", seatWidthInFirst: ");
		result.append(seatWidthInFirst);
		result.append(", seatLengthInFirst: ");
		result.append(seatLengthInFirst);
		result.append(", seatsInBusinessClass: ");
		result.append(seatsInBusinessClass);
		result.append(", businessClassPassengers: ");
		result.append(businessClassPassengers);
		result.append(", seatsPerRowInBusinessClass: ");
		result.append(seatsPerRowInBusinessClass);
		result.append(", seatWidthInBusiness: ");
		result.append(seatWidthInBusiness);
		result.append(", seatLengthInBusiness: ");
		result.append(seatLengthInBusiness);
		result.append(", seatPitchInBusiness: ");
		result.append(seatPitchInBusiness);
		result.append(", seatsInPremiumEconomyClass: ");
		result.append(seatsInPremiumEconomyClass);
		result.append(", premiumEconomyClassPassengers: ");
		result.append(premiumEconomyClassPassengers);
		result.append(", seatsPerRowInPremiumEconomyClass: ");
		result.append(seatsPerRowInPremiumEconomyClass);
		result.append(", seatWidthInPremiumEconomy: ");
		result.append(seatWidthInPremiumEconomy);
		result.append(", seatLengthInPremiumEconomy: ");
		result.append(seatLengthInPremiumEconomy);
		result.append(", seatPitchInPremiumEco: ");
		result.append(seatPitchInPremiumEco);
		result.append(", seatsInEconomyClass: ");
		result.append(seatsInEconomyClass);
		result.append(", economyClassPassengers: ");
		result.append(economyClassPassengers);
		result.append(", seatsPerRowInEconomyClass: ");
		result.append(seatsPerRowInEconomyClass);
		result.append(", seatWidthInEconomy: ");
		result.append(seatWidthInEconomy);
		result.append(", seatLengthInEconomy: ");
		result.append(seatLengthInEconomy);
		result.append(", seatPitchInEconomy: ");
		result.append(seatPitchInEconomy);
		result.append(", rowNonexistent: ");
		result.append(rowNonexistent);
		result.append(", aisleWidth: ");
		result.append(aisleWidth);
		result.append(", framesPerSecond: ");
		result.append(framesPerSecond);
		result.append(", numberOfDecks: ");
		result.append(numberOfDecks);
		result.append(", scale: ");
		result.append(scale);
		result.append(", boardingTime: ");
		result.append(boardingTime);
		result.append(')');
		return result.toString();
	}

} //CabinImpl
