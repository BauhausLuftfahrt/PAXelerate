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
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getRowNonexistent <em>Row Nonexistent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFirstClassPassengers <em>First Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBusinessClassPassengers <em>Business Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getEconomyClassPassengers <em>Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumbAisles <em>Numb Aisles</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getStairways <em>Stairways</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getCurtains <em>Curtains</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getStowages <em>Stowages</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInEconomyClass <em>Seats In Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInPremiumEconomyClass <em>Seats In Premium Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInBusinessClass <em>Seats In Business Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsInFirstClass <em>Seats In First Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInEconomyClass <em>Seats Per Row In Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInBusinessClass <em>Seats Per Row In Business Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInFirstClass <em>Seats Per Row In First Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getSeatsPerRowInPremiumEconomyClass <em>Seats Per Row In Premium Economy Class</em>}</li>
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
	protected static final double CABIN_LENGTH_EDEFAULT = 0.0;
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
	protected static final double CABIN_WIDTH_EDEFAULT = 0.0;
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
	 * The default value of the '{@link #getEconomyClassPassengers() <em>Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomyClassPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int ECONOMY_CLASS_PASSENGERS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getNumbAisles() <em>Numb Aisles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbAisles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMB_AISLES_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumbAisles() <em>Numb Aisles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbAisles()
	 * @generated
	 * @ordered
	 */
	protected int numbAisles = NUMB_AISLES_EDEFAULT;
	/**
	 * The default value of the '{@link #getAisleWidth() <em>Aisle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisleWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double AISLE_WIDTH_EDEFAULT = 0.0;
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
	 * The default value of the '{@link #getNumberOfDecks() <em>Number Of Decks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDecks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DECKS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsInEconomyClass() <em>Seats In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_ECONOMY_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsInPremiumEconomyClass() <em>Seats In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInPremiumEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsInBusinessClass() <em>Seats In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInBusinessClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_BUSINESS_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsInFirstClass() <em>Seats In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsInFirstClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_IN_FIRST_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsPerRowInEconomyClass() <em>Seats Per Row In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsPerRowInBusinessClass() <em>Seats Per Row In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInBusinessClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsPerRowInFirstClass() <em>Seats Per Row In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInFirstClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT = 0;
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
	 * The default value of the '{@link #getSeatsPerRowInPremiumEconomyClass() <em>Seats Per Row In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatsPerRowInPremiumEconomyClass()
	 * @generated
	 * @ordered
	 */
	protected static final int SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT = 0;
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
	public int getNumbAisles() {
		return numbAisles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbAisles(int newNumbAisles) {
		int oldNumbAisles = numbAisles;
		numbAisles = newNumbAisles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__NUMB_AISLES, oldNumbAisles, numbAisles));
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return getRowNonexistent();
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				return getFirstClassPassengers();
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				return getBusinessClassPassengers();
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				return getPremiumEconomyClassPassengers();
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				return getEconomyClassPassengers();
			case CabinPackage.CABIN__NUMB_AISLES:
				return getNumbAisles();
			case CabinPackage.CABIN__AISLE_WIDTH:
				return getAisleWidth();
			case CabinPackage.CABIN__BOARDING_TIME:
				return getBoardingTime();
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
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				return getSeatsInEconomyClass();
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				return getSeatsInPremiumEconomyClass();
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				return getSeatsInBusinessClass();
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				return getSeatsInFirstClass();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				return getSeatsPerRowInEconomyClass();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				return getSeatsPerRowInBusinessClass();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				return getSeatsPerRowInFirstClass();
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				return getSeatsPerRowInPremiumEconomyClass();
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent((Integer)newValue);
				return;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				setFirstClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				setBusinessClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				setPremiumEconomyClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				setEconomyClassPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__NUMB_AISLES:
				setNumbAisles((Integer)newValue);
				return;
			case CabinPackage.CABIN__AISLE_WIDTH:
				setAisleWidth((Double)newValue);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime((Double)newValue);
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
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				setSeatsInEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsInPremiumEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				setSeatsInBusinessClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				setSeatsInFirstClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				setSeatsPerRowInEconomyClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				setSeatsPerRowInBusinessClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				setSeatsPerRowInFirstClass((Integer)newValue);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsPerRowInPremiumEconomyClass((Integer)newValue);
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent(ROW_NONEXISTENT_EDEFAULT);
				return;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				setFirstClassPassengers(FIRST_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				setBusinessClassPassengers(BUSINESS_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				setPremiumEconomyClassPassengers(PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				setEconomyClassPassengers(ECONOMY_CLASS_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__NUMB_AISLES:
				setNumbAisles(NUMB_AISLES_EDEFAULT);
				return;
			case CabinPackage.CABIN__AISLE_WIDTH:
				setAisleWidth(AISLE_WIDTH_EDEFAULT);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime(BOARDING_TIME_EDEFAULT);
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
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				setSeatsInEconomyClass(SEATS_IN_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsInPremiumEconomyClass(SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				setSeatsInBusinessClass(SEATS_IN_BUSINESS_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				setSeatsInFirstClass(SEATS_IN_FIRST_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				setSeatsPerRowInEconomyClass(SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				setSeatsPerRowInBusinessClass(SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				setSeatsPerRowInFirstClass(SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT);
				return;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				setSeatsPerRowInPremiumEconomyClass(SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT);
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return rowNonexistent != ROW_NONEXISTENT_EDEFAULT;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				return firstClassPassengers != FIRST_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				return businessClassPassengers != BUSINESS_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				return premiumEconomyClassPassengers != PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
				return economyClassPassengers != ECONOMY_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__NUMB_AISLES:
				return numbAisles != NUMB_AISLES_EDEFAULT;
			case CabinPackage.CABIN__AISLE_WIDTH:
				return aisleWidth != AISLE_WIDTH_EDEFAULT;
			case CabinPackage.CABIN__BOARDING_TIME:
				return boardingTime != BOARDING_TIME_EDEFAULT;
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
			case CabinPackage.CABIN__SEATS_IN_ECONOMY_CLASS:
				return seatsInEconomyClass != SEATS_IN_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_PREMIUM_ECONOMY_CLASS:
				return seatsInPremiumEconomyClass != SEATS_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_BUSINESS_CLASS:
				return seatsInBusinessClass != SEATS_IN_BUSINESS_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_IN_FIRST_CLASS:
				return seatsInFirstClass != SEATS_IN_FIRST_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_ECONOMY_CLASS:
				return seatsPerRowInEconomyClass != SEATS_PER_ROW_IN_ECONOMY_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_BUSINESS_CLASS:
				return seatsPerRowInBusinessClass != SEATS_PER_ROW_IN_BUSINESS_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_FIRST_CLASS:
				return seatsPerRowInFirstClass != SEATS_PER_ROW_IN_FIRST_CLASS_EDEFAULT;
			case CabinPackage.CABIN__SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS:
				return seatsPerRowInPremiumEconomyClass != SEATS_PER_ROW_IN_PREMIUM_ECONOMY_CLASS_EDEFAULT;
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
		result.append(", rowNonexistent: ");
		result.append(rowNonexistent);
		result.append(", firstClassPassengers: ");
		result.append(firstClassPassengers);
		result.append(", businessClassPassengers: ");
		result.append(businessClassPassengers);
		result.append(", premiumEconomyClassPassengers: ");
		result.append(premiumEconomyClassPassengers);
		result.append(", economyClassPassengers: ");
		result.append(economyClassPassengers);
		result.append(", numbAisles: ");
		result.append(numbAisles);
		result.append(", aisleWidth: ");
		result.append(aisleWidth);
		result.append(", boardingTime: ");
		result.append(boardingTime);
		result.append(", numberOfDecks: ");
		result.append(numberOfDecks);
		result.append(", seatsInEconomyClass: ");
		result.append(seatsInEconomyClass);
		result.append(", seatsInPremiumEconomyClass: ");
		result.append(seatsInPremiumEconomyClass);
		result.append(", seatsInBusinessClass: ");
		result.append(seatsInBusinessClass);
		result.append(", seatsInFirstClass: ");
		result.append(seatsInFirstClass);
		result.append(", seatsPerRowInEconomyClass: ");
		result.append(seatsPerRowInEconomyClass);
		result.append(", seatsPerRowInBusinessClass: ");
		result.append(seatsPerRowInBusinessClass);
		result.append(", seatsPerRowInFirstClass: ");
		result.append(seatsPerRowInFirstClass);
		result.append(", seatsPerRowInPremiumEconomyClass: ");
		result.append(seatsPerRowInPremiumEconomyClass);
		result.append(')');
		return result.toString();
	}

} //CabinImpl
