/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinDoor;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.EmergencyExit;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Stairway;
import net.bhl.cdt.model.cabin.Stowage;
import net.bhl.cdt.model.cabin.Toilet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumbSeats <em>Numb Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getExits <em>Exits</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getToilets <em>Toilets</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getStairs <em>Stairs</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getCurtain <em>Curtain</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getStowage <em>Stowage</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumbAisles <em>Numb Aisles</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFirstClassPassengers <em>First Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBusinessClassPassengers <em>Business Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getTotalPassengers <em>Total Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getRowNonexistent <em>Row Nonexistent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CabinImpl extends MinimalEObjectImpl.Container implements Cabin {
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
	 * The default value of the '{@link #getNumbSeats() <em>Numb Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbSeats()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMB_SEATS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getNumbSeats() <em>Numb Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumbSeats()
	 * @generated
	 * @ordered
	 */
	protected int numbSeats = NUMB_SEATS_EDEFAULT;
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
	protected EList<CabinDoor> doors;

	/**
	 * The cached value of the '{@link #getExits() <em>Exits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExits()
	 * @generated
	 * @ordered
	 */
	protected EList<EmergencyExit> exits;
	/**
	 * The cached value of the '{@link #getToilets() <em>Toilets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToilets()
	 * @generated
	 * @ordered
	 */
	protected EList<Toilet> toilets;
	/**
	 * The cached value of the '{@link #getGalleys() <em>Galleys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalleys()
	 * @generated
	 * @ordered
	 */
	protected EList<Galley> galleys;
	/**
	 * The cached value of the '{@link #getStairs() <em>Stairs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStairs()
	 * @generated
	 * @ordered
	 */
	protected EList<Stairway> stairs;
	/**
	 * The cached value of the '{@link #getCurtain() <em>Curtain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurtain()
	 * @generated
	 * @ordered
	 */
	protected EList<Curtain> curtain;
	/**
	 * The cached value of the '{@link #getStowage() <em>Stowage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowage()
	 * @generated
	 * @ordered
	 */
	protected EList<Stowage> stowage;
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
	 * The default value of the '{@link #getTotalPassengers() <em>Total Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPassengers()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PASSENGERS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getTotalPassengers() <em>Total Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPassengers()
	 * @generated
	 * @ordered
	 */
	protected int totalPassengers = TOTAL_PASSENGERS_EDEFAULT;
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
	public int getNumbSeats() {
		return numbSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbSeats(int newNumbSeats) {
		int oldNumbSeats = numbSeats;
		numbSeats = newNumbSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__NUMB_SEATS, oldNumbSeats, numbSeats));
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
	public EList<CabinDoor> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentEList<CabinDoor>(CabinDoor.class, this, CabinPackage.CABIN__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmergencyExit> getExits() {
		if (exits == null) {
			exits = new EObjectResolvingEList<EmergencyExit>(EmergencyExit.class, this, CabinPackage.CABIN__EXITS);
		}
		return exits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Toilet> getToilets() {
		if (toilets == null) {
			toilets = new EObjectResolvingEList<Toilet>(Toilet.class, this, CabinPackage.CABIN__TOILETS);
		}
		return toilets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Galley> getGalleys() {
		if (galleys == null) {
			galleys = new EObjectResolvingEList<Galley>(Galley.class, this, CabinPackage.CABIN__GALLEYS);
		}
		return galleys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stairway> getStairs() {
		if (stairs == null) {
			stairs = new EObjectResolvingEList<Stairway>(Stairway.class, this, CabinPackage.CABIN__STAIRS);
		}
		return stairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Curtain> getCurtain() {
		if (curtain == null) {
			curtain = new EObjectResolvingEList<Curtain>(Curtain.class, this, CabinPackage.CABIN__CURTAIN);
		}
		return curtain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stowage> getStowage() {
		if (stowage == null) {
			stowage = new EObjectResolvingEList<Stowage>(Stowage.class, this, CabinPackage.CABIN__STOWAGE);
		}
		return stowage;
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
	public int getTotalPassengers() {
		return totalPassengers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalPassengers(int newTotalPassengers) {
		int oldTotalPassengers = totalPassengers;
		totalPassengers = newTotalPassengers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__TOTAL_PASSENGERS, oldTotalPassengers, totalPassengers));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.CABIN__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case CabinPackage.CABIN__DOORS:
				return ((InternalEList<?>)getDoors()).basicRemove(otherEnd, msgs);
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
			case CabinPackage.CABIN__NUMB_SEATS:
				return getNumbSeats();
			case CabinPackage.CABIN__CLASSES:
				return getClasses();
			case CabinPackage.CABIN__DOORS:
				return getDoors();
			case CabinPackage.CABIN__EXITS:
				return getExits();
			case CabinPackage.CABIN__TOILETS:
				return getToilets();
			case CabinPackage.CABIN__GALLEYS:
				return getGalleys();
			case CabinPackage.CABIN__STAIRS:
				return getStairs();
			case CabinPackage.CABIN__CURTAIN:
				return getCurtain();
			case CabinPackage.CABIN__STOWAGE:
				return getStowage();
			case CabinPackage.CABIN__NUMB_AISLES:
				return getNumbAisles();
			case CabinPackage.CABIN__BOARDING_TIME:
				return getBoardingTime();
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				return getFirstClassPassengers();
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				return getBusinessClassPassengers();
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				return getPremiumEconomyClassPassengers();
			case CabinPackage.CABIN__TOTAL_PASSENGERS:
				return getTotalPassengers();
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return getRowNonexistent();
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
			case CabinPackage.CABIN__NUMB_SEATS:
				setNumbSeats((Integer)newValue);
				return;
			case CabinPackage.CABIN__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends PassengerClass>)newValue);
				return;
			case CabinPackage.CABIN__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends CabinDoor>)newValue);
				return;
			case CabinPackage.CABIN__EXITS:
				getExits().clear();
				getExits().addAll((Collection<? extends EmergencyExit>)newValue);
				return;
			case CabinPackage.CABIN__TOILETS:
				getToilets().clear();
				getToilets().addAll((Collection<? extends Toilet>)newValue);
				return;
			case CabinPackage.CABIN__GALLEYS:
				getGalleys().clear();
				getGalleys().addAll((Collection<? extends Galley>)newValue);
				return;
			case CabinPackage.CABIN__STAIRS:
				getStairs().clear();
				getStairs().addAll((Collection<? extends Stairway>)newValue);
				return;
			case CabinPackage.CABIN__CURTAIN:
				getCurtain().clear();
				getCurtain().addAll((Collection<? extends Curtain>)newValue);
				return;
			case CabinPackage.CABIN__STOWAGE:
				getStowage().clear();
				getStowage().addAll((Collection<? extends Stowage>)newValue);
				return;
			case CabinPackage.CABIN__NUMB_AISLES:
				setNumbAisles((Integer)newValue);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime((Double)newValue);
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
			case CabinPackage.CABIN__TOTAL_PASSENGERS:
				setTotalPassengers((Integer)newValue);
				return;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent((Integer)newValue);
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
			case CabinPackage.CABIN__NUMB_SEATS:
				setNumbSeats(NUMB_SEATS_EDEFAULT);
				return;
			case CabinPackage.CABIN__CLASSES:
				getClasses().clear();
				return;
			case CabinPackage.CABIN__DOORS:
				getDoors().clear();
				return;
			case CabinPackage.CABIN__EXITS:
				getExits().clear();
				return;
			case CabinPackage.CABIN__TOILETS:
				getToilets().clear();
				return;
			case CabinPackage.CABIN__GALLEYS:
				getGalleys().clear();
				return;
			case CabinPackage.CABIN__STAIRS:
				getStairs().clear();
				return;
			case CabinPackage.CABIN__CURTAIN:
				getCurtain().clear();
				return;
			case CabinPackage.CABIN__STOWAGE:
				getStowage().clear();
				return;
			case CabinPackage.CABIN__NUMB_AISLES:
				setNumbAisles(NUMB_AISLES_EDEFAULT);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime(BOARDING_TIME_EDEFAULT);
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
			case CabinPackage.CABIN__TOTAL_PASSENGERS:
				setTotalPassengers(TOTAL_PASSENGERS_EDEFAULT);
				return;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent(ROW_NONEXISTENT_EDEFAULT);
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
			case CabinPackage.CABIN__NUMB_SEATS:
				return numbSeats != NUMB_SEATS_EDEFAULT;
			case CabinPackage.CABIN__CLASSES:
				return classes != null && !classes.isEmpty();
			case CabinPackage.CABIN__DOORS:
				return doors != null && !doors.isEmpty();
			case CabinPackage.CABIN__EXITS:
				return exits != null && !exits.isEmpty();
			case CabinPackage.CABIN__TOILETS:
				return toilets != null && !toilets.isEmpty();
			case CabinPackage.CABIN__GALLEYS:
				return galleys != null && !galleys.isEmpty();
			case CabinPackage.CABIN__STAIRS:
				return stairs != null && !stairs.isEmpty();
			case CabinPackage.CABIN__CURTAIN:
				return curtain != null && !curtain.isEmpty();
			case CabinPackage.CABIN__STOWAGE:
				return stowage != null && !stowage.isEmpty();
			case CabinPackage.CABIN__NUMB_AISLES:
				return numbAisles != NUMB_AISLES_EDEFAULT;
			case CabinPackage.CABIN__BOARDING_TIME:
				return boardingTime != BOARDING_TIME_EDEFAULT;
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
				return firstClassPassengers != FIRST_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
				return businessClassPassengers != BUSINESS_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
				return premiumEconomyClassPassengers != PREMIUM_ECONOMY_CLASS_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__TOTAL_PASSENGERS:
				return totalPassengers != TOTAL_PASSENGERS_EDEFAULT;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return rowNonexistent != ROW_NONEXISTENT_EDEFAULT;
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
		result.append(", numbSeats: ");
		result.append(numbSeats);
		result.append(", numbAisles: ");
		result.append(numbAisles);
		result.append(", boardingTime: ");
		result.append(boardingTime);
		result.append(", FirstClassPassengers: ");
		result.append(firstClassPassengers);
		result.append(", BusinessClassPassengers: ");
		result.append(businessClassPassengers);
		result.append(", PremiumEconomyClassPassengers: ");
		result.append(premiumEconomyClassPassengers);
		result.append(", totalPassengers: ");
		result.append(totalPassengers);
		result.append(", rowNonexistent: ");
		result.append(rowNonexistent);
		result.append(')');
		return result.toString();
	}

} //CabinImpl
