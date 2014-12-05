/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PremiumEconomyClass;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.Stowage;
import net.bhl.cdt.model.cabin.TravelClass;
import net.bhl.cdt.model.impl.NamedElementImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFramesPerSecond <em>Frames Per Second</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFirstClasses <em>First Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBusinessClasses <em>Business Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getEconomyClasses <em>Economy Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getPremiumEconomyClasses <em>Premium Economy Classes</em>}</li>
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
	 * The cached value of the '{@link #getFirstClasses() <em>First Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<FirstClass> firstClasses;
	/**
	 * The cached value of the '{@link #getBusinessClasses() <em>Business Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessClass> businessClasses;
	/**
	 * The cached value of the '{@link #getEconomyClasses() <em>Economy Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomyClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<EconomyClass> economyClasses;
	/**
	 * The cached value of the '{@link #getPremiumEconomyClasses() <em>Premium Economy Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiumEconomyClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<PremiumEconomyClass> premiumEconomyClasses;
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TravelClass> classes;
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
	public EList<FirstClass> getFirstClasses() {
		if (firstClasses == null) {
			firstClasses = new EObjectContainmentEList<FirstClass>(FirstClass.class, this, CabinPackage.CABIN__FIRST_CLASSES);
		}
		return firstClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessClass> getBusinessClasses() {
		if (businessClasses == null) {
			businessClasses = new EObjectContainmentEList<BusinessClass>(BusinessClass.class, this, CabinPackage.CABIN__BUSINESS_CLASSES);
		}
		return businessClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EconomyClass> getEconomyClasses() {
		if (economyClasses == null) {
			economyClasses = new EObjectContainmentEList<EconomyClass>(EconomyClass.class, this, CabinPackage.CABIN__ECONOMY_CLASSES);
		}
		return economyClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PremiumEconomyClass> getPremiumEconomyClasses() {
		if (premiumEconomyClasses == null) {
			premiumEconomyClasses = new EObjectContainmentEList<PremiumEconomyClass>(PremiumEconomyClass.class, this, CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES);
		}
		return premiumEconomyClasses;
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
	public EList<TravelClass> getClasses() {
		if (classes == null) {
			classes = new EObjectResolvingEList<TravelClass>(TravelClass.class, this, CabinPackage.CABIN__CLASSES);
		}
		return classes;
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
			case CabinPackage.CABIN__FIRST_CLASSES:
				return ((InternalEList<?>)getFirstClasses()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__BUSINESS_CLASSES:
				return ((InternalEList<?>)getBusinessClasses()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__ECONOMY_CLASSES:
				return ((InternalEList<?>)getEconomyClasses()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES:
				return ((InternalEList<?>)getPremiumEconomyClasses()).basicRemove(otherEnd, msgs);
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return getRowNonexistent();
			case CabinPackage.CABIN__AISLE_WIDTH:
				return getAisleWidth();
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
				return getFramesPerSecond();
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				return getNumberOfDecks();
			case CabinPackage.CABIN__FIRST_CLASSES:
				return getFirstClasses();
			case CabinPackage.CABIN__BUSINESS_CLASSES:
				return getBusinessClasses();
			case CabinPackage.CABIN__ECONOMY_CLASSES:
				return getEconomyClasses();
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES:
				return getPremiumEconomyClasses();
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
			case CabinPackage.CABIN__FIRST_CLASSES:
				getFirstClasses().clear();
				getFirstClasses().addAll((Collection<? extends FirstClass>)newValue);
				return;
			case CabinPackage.CABIN__BUSINESS_CLASSES:
				getBusinessClasses().clear();
				getBusinessClasses().addAll((Collection<? extends BusinessClass>)newValue);
				return;
			case CabinPackage.CABIN__ECONOMY_CLASSES:
				getEconomyClasses().clear();
				getEconomyClasses().addAll((Collection<? extends EconomyClass>)newValue);
				return;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES:
				getPremiumEconomyClasses().clear();
				getPremiumEconomyClasses().addAll((Collection<? extends PremiumEconomyClass>)newValue);
				return;
			case CabinPackage.CABIN__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends TravelClass>)newValue);
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
			case CabinPackage.CABIN__FIRST_CLASSES:
				getFirstClasses().clear();
				return;
			case CabinPackage.CABIN__BUSINESS_CLASSES:
				getBusinessClasses().clear();
				return;
			case CabinPackage.CABIN__ECONOMY_CLASSES:
				getEconomyClasses().clear();
				return;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES:
				getPremiumEconomyClasses().clear();
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return rowNonexistent != ROW_NONEXISTENT_EDEFAULT;
			case CabinPackage.CABIN__AISLE_WIDTH:
				return aisleWidth != AISLE_WIDTH_EDEFAULT;
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
				return framesPerSecond != FRAMES_PER_SECOND_EDEFAULT;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				return numberOfDecks != NUMBER_OF_DECKS_EDEFAULT;
			case CabinPackage.CABIN__FIRST_CLASSES:
				return firstClasses != null && !firstClasses.isEmpty();
			case CabinPackage.CABIN__BUSINESS_CLASSES:
				return businessClasses != null && !businessClasses.isEmpty();
			case CabinPackage.CABIN__ECONOMY_CLASSES:
				return economyClasses != null && !economyClasses.isEmpty();
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES:
				return premiumEconomyClasses != null && !premiumEconomyClasses.isEmpty();
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
