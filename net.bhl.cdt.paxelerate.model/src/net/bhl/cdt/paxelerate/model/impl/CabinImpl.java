/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import net.bhl.cdt.model.impl.NamedElementImpl;
import net.bhl.cdt.paxelerate.model.AircraftType;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.Curtain;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.SimulationResult;
import net.bhl.cdt.paxelerate.model.Stairway;
import net.bhl.cdt.paxelerate.model.Stowage;
import net.bhl.cdt.paxelerate.model.TravelClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cabin</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getRowNonexistent <em>Row Nonexistent</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getAircraftType <em>Aircraft Type</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getSimulationSettings <em>Simulation Settings</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getSimulationResults <em>Simulation Results</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getStairways <em>Stairways</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getCurtains <em>Curtains</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getStowages <em>Stowages</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.CabinImpl#getPassengers <em>Passengers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinImpl extends NamedElementImpl implements Cabin {
	/**
	 * The default value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int XDIMENSION_EDEFAULT = 2412;
	/**
	 * The cached value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected int xDimension = XDIMENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int YDIMENSION_EDEFAULT = 364;
	/**
	 * The cached value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected int yDimension = YDIMENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getRowNonexistent() <em>Row Nonexistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRowNonexistent()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NONEXISTENT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getRowNonexistent() <em>Row Nonexistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRowNonexistent()
	 * @generated
	 * @ordered
	 */
	protected int rowNonexistent = ROW_NONEXISTENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getAisleWidth() <em>Aisle Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAisleWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int AISLE_WIDTH_EDEFAULT = 64;
	/**
	 * The cached value of the '{@link #getAisleWidth() <em>Aisle Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAisleWidth()
	 * @generated
	 * @ordered
	 */
	protected int aisleWidth = AISLE_WIDTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumberOfDecks() <em>Number Of Decks</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNumberOfDecks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_DECKS_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getNumberOfDecks() <em>Number Of Decks</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNumberOfDecks()
	 * @generated
	 * @ordered
	 */
	protected int numberOfDecks = NUMBER_OF_DECKS_EDEFAULT;
	/**
	 * The default value of the '{@link #getAircraftType() <em>Aircraft Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAircraftType()
	 * @generated
	 * @ordered
	 */
	protected static final AircraftType AIRCRAFT_TYPE_EDEFAULT = AircraftType.NARROWBODY;
	/**
	 * The cached value of the '{@link #getAircraftType() <em>Aircraft Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAircraftType()
	 * @generated
	 * @ordered
	 */
	protected AircraftType aircraftType = AIRCRAFT_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSimulationSettings() <em>Simulation Settings</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSimulationSettings()
	 * @generated
	 * @ordered
	 */
	protected SimulationProperties simulationSettings;
	/**
	 * The cached value of the '{@link #getSimulationResults() <em>Simulation Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationResults()
	 * @generated
	 * @ordered
	 */
	protected SimulationResult simulationResults;
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<TravelClass> classes;
	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;
	/**
	 * The cached value of the '{@link #getLavatories() <em>Lavatories</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLavatories()
	 * @generated
	 * @ordered
	 */
	protected EList<Lavatory> lavatories;
	/**
	 * The cached value of the '{@link #getGalleys() <em>Galleys</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGalleys()
	 * @generated
	 * @ordered
	 */
	protected EList<Galley> galleys;
	/**
	 * The cached value of the '{@link #getStairways() <em>Stairways</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStairways()
	 * @generated
	 * @ordered
	 */
	protected EList<Stairway> stairways;
	/**
	 * The cached value of the '{@link #getCurtains() <em>Curtains</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCurtains()
	 * @generated
	 * @ordered
	 */
	protected EList<Curtain> curtains;
	/**
	 * The cached value of the '{@link #getStowages() <em>Stowages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStowages()
	 * @generated
	 * @ordered
	 */
	protected EList<Stowage> stowages;
	/**
	 * The cached value of the '{@link #getPassengers() <em>Passengers</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPassengers()
	 * @generated
	 * @ordered
	 */
	protected EList<Passenger> passengers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected CabinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the e class
	 * @generated 
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.CABIN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the x dimension
	 * @generated 
	 */
	@Override
	public int getXDimension() {
		return xDimension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newXDimension the new x dimension
	 * @generated 
	 */
	@Override
	public void setXDimension(int newXDimension) {
		int oldXDimension = xDimension;
		xDimension = newXDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__XDIMENSION, oldXDimension, xDimension));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the y dimension
	 * @generated 
	 */
	@Override
	public int getYDimension() {
		return yDimension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newYDimension the new y dimension
	 * @generated 
	 */
	@Override
	public void setYDimension(int newYDimension) {
		int oldYDimension = yDimension;
		yDimension = newYDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__YDIMENSION, oldYDimension, yDimension));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the doors
	 * @generated 
	 */
	@Override
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentEList<Door>(Door.class, this, CabinPackage.CABIN__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the lavatories
	 * @generated 
	 */
	@Override
	public EList<Lavatory> getLavatories() {
		if (lavatories == null) {
			lavatories = new EObjectContainmentEList<Lavatory>(Lavatory.class, this, CabinPackage.CABIN__LAVATORIES);
		}
		return lavatories;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the galleys
	 * @generated 
	 */
	@Override
	public EList<Galley> getGalleys() {
		if (galleys == null) {
			galleys = new EObjectContainmentEList<Galley>(Galley.class, this, CabinPackage.CABIN__GALLEYS);
		}
		return galleys;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the stairways
	 * @generated 
	 */
	@Override
	public EList<Stairway> getStairways() {
		if (stairways == null) {
			stairways = new EObjectContainmentEList<Stairway>(Stairway.class, this, CabinPackage.CABIN__STAIRWAYS);
		}
		return stairways;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the curtains
	 * @generated 
	 */
	@Override
	public EList<Curtain> getCurtains() {
		if (curtains == null) {
			curtains = new EObjectContainmentEList<Curtain>(Curtain.class, this, CabinPackage.CABIN__CURTAINS);
		}
		return curtains;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the stowages
	 * @generated 
	 */
	@Override
	public EList<Stowage> getStowages() {
		if (stowages == null) {
			stowages = new EObjectContainmentEList<Stowage>(Stowage.class, this, CabinPackage.CABIN__STOWAGES);
		}
		return stowages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the passengers
	 * @generated 
	 */
	@Override
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
	public SimulationResult getSimulationResults() {
		return simulationResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationResults(SimulationResult newSimulationResults, NotificationChain msgs) {
		SimulationResult oldSimulationResults = simulationResults;
		simulationResults = newSimulationResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SIMULATION_RESULTS, oldSimulationResults, newSimulationResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationResults(SimulationResult newSimulationResults) {
		if (newSimulationResults != simulationResults) {
			NotificationChain msgs = null;
			if (simulationResults != null)
				msgs = ((InternalEObject)simulationResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CabinPackage.CABIN__SIMULATION_RESULTS, null, msgs);
			if (newSimulationResults != null)
				msgs = ((InternalEObject)newSimulationResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CabinPackage.CABIN__SIMULATION_RESULTS, null, msgs);
			msgs = basicSetSimulationResults(newSimulationResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SIMULATION_RESULTS, newSimulationResults, newSimulationResults));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the number of decks
	 * @generated 
	 */
	@Override
	public int getNumberOfDecks() {
		return numberOfDecks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newNumberOfDecks the new number of decks
	 * @generated 
	 */
	@Override
	public void setNumberOfDecks(int newNumberOfDecks) {
		int oldNumberOfDecks = numberOfDecks;
		numberOfDecks = newNumberOfDecks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__NUMBER_OF_DECKS, oldNumberOfDecks, numberOfDecks));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the aircraft type
	 * @generated 
	 */
	@Override
	public AircraftType getAircraftType() {
		return aircraftType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newAircraftType the new aircraft type
	 * @generated 
	 */
	@Override
	public void setAircraftType(AircraftType newAircraftType) {
		AircraftType oldAircraftType = aircraftType;
		aircraftType = newAircraftType == null ? AIRCRAFT_TYPE_EDEFAULT : newAircraftType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__AIRCRAFT_TYPE, oldAircraftType, aircraftType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the simulation settings
	 * @generated 
	 */
	@Override
	public SimulationProperties getSimulationSettings() {
		return simulationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationSettings(SimulationProperties newSimulationSettings, NotificationChain msgs) {
		SimulationProperties oldSimulationSettings = simulationSettings;
		simulationSettings = newSimulationSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SIMULATION_SETTINGS, oldSimulationSettings, newSimulationSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newSimulationSettings the new simulation settings
	 * @generated 
	 */
	@Override
	public void setSimulationSettings(
			SimulationProperties newSimulationSettings) {
		if (newSimulationSettings != simulationSettings) {
			NotificationChain msgs = null;
			if (simulationSettings != null)
				msgs = ((InternalEObject)simulationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CabinPackage.CABIN__SIMULATION_SETTINGS, null, msgs);
			if (newSimulationSettings != null)
				msgs = ((InternalEObject)newSimulationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CabinPackage.CABIN__SIMULATION_SETTINGS, null, msgs);
			msgs = basicSetSimulationSettings(newSimulationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__SIMULATION_SETTINGS, newSimulationSettings, newSimulationSettings));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the classes
	 * @generated 
	 */
	@Override
	public EList<TravelClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<TravelClass>(TravelClass.class, this, CabinPackage.CABIN__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the row nonexistent
	 * @generated 
	 */
	@Override
	public int getRowNonexistent() {
		return rowNonexistent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newRowNonexistent the new row nonexistent
	 * @generated 
	 */
	@Override
	public void setRowNonexistent(int newRowNonexistent) {
		int oldRowNonexistent = rowNonexistent;
		rowNonexistent = newRowNonexistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__ROW_NONEXISTENT, oldRowNonexistent, rowNonexistent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the aisle width
	 * @generated 
	 */
	@Override
	public int getAisleWidth() {
		return aisleWidth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newAisleWidth the new aisle width
	 * @generated 
	 */
	@Override
	public void setAisleWidth(int newAisleWidth) {
		int oldAisleWidth = aisleWidth;
		aisleWidth = newAisleWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__AISLE_WIDTH, oldAisleWidth, aisleWidth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param otherEnd the other end
	 * @param featureID the feature id
	 * @param msgs the msgs
	 * @return the notification chain
	 * @generated 
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CabinPackage.CABIN__SIMULATION_SETTINGS:
				return basicSetSimulationSettings(null, msgs);
			case CabinPackage.CABIN__SIMULATION_RESULTS:
				return basicSetSimulationResults(null, msgs);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param resolve the resolve
	 * @param coreType the core type
	 * @return the object
	 * @generated 
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.CABIN__XDIMENSION:
				return getXDimension();
			case CabinPackage.CABIN__YDIMENSION:
				return getYDimension();
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return getRowNonexistent();
			case CabinPackage.CABIN__AISLE_WIDTH:
				return getAisleWidth();
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				return getNumberOfDecks();
			case CabinPackage.CABIN__AIRCRAFT_TYPE:
				return getAircraftType();
			case CabinPackage.CABIN__SIMULATION_SETTINGS:
				return getSimulationSettings();
			case CabinPackage.CABIN__SIMULATION_RESULTS:
				return getSimulationResults();
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
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param newValue the new value
	 * @generated 
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.CABIN__XDIMENSION:
				setXDimension((Integer)newValue);
				return;
			case CabinPackage.CABIN__YDIMENSION:
				setYDimension((Integer)newValue);
				return;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent((Integer)newValue);
				return;
			case CabinPackage.CABIN__AISLE_WIDTH:
				setAisleWidth((Integer)newValue);
				return;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				setNumberOfDecks((Integer)newValue);
				return;
			case CabinPackage.CABIN__AIRCRAFT_TYPE:
				setAircraftType((AircraftType)newValue);
				return;
			case CabinPackage.CABIN__SIMULATION_SETTINGS:
				setSimulationSettings((SimulationProperties)newValue);
				return;
			case CabinPackage.CABIN__SIMULATION_RESULTS:
				setSimulationResults((SimulationResult)newValue);
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
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @generated 
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.CABIN__XDIMENSION:
				setXDimension(XDIMENSION_EDEFAULT);
				return;
			case CabinPackage.CABIN__YDIMENSION:
				setYDimension(YDIMENSION_EDEFAULT);
				return;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				setRowNonexistent(ROW_NONEXISTENT_EDEFAULT);
				return;
			case CabinPackage.CABIN__AISLE_WIDTH:
				setAisleWidth(AISLE_WIDTH_EDEFAULT);
				return;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				setNumberOfDecks(NUMBER_OF_DECKS_EDEFAULT);
				return;
			case CabinPackage.CABIN__AIRCRAFT_TYPE:
				setAircraftType(AIRCRAFT_TYPE_EDEFAULT);
				return;
			case CabinPackage.CABIN__SIMULATION_SETTINGS:
				setSimulationSettings((SimulationProperties)null);
				return;
			case CabinPackage.CABIN__SIMULATION_RESULTS:
				setSimulationResults((SimulationResult)null);
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
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @return true, if successful
	 * @generated 
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.CABIN__XDIMENSION:
				return xDimension != XDIMENSION_EDEFAULT;
			case CabinPackage.CABIN__YDIMENSION:
				return yDimension != YDIMENSION_EDEFAULT;
			case CabinPackage.CABIN__ROW_NONEXISTENT:
				return rowNonexistent != ROW_NONEXISTENT_EDEFAULT;
			case CabinPackage.CABIN__AISLE_WIDTH:
				return aisleWidth != AISLE_WIDTH_EDEFAULT;
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
				return numberOfDecks != NUMBER_OF_DECKS_EDEFAULT;
			case CabinPackage.CABIN__AIRCRAFT_TYPE:
				return aircraftType != AIRCRAFT_TYPE_EDEFAULT;
			case CabinPackage.CABIN__SIMULATION_SETTINGS:
				return simulationSettings != null;
			case CabinPackage.CABIN__SIMULATION_RESULTS:
				return simulationResults != null;
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
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the string
	 * @generated 
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xDimension: ");
		result.append(xDimension);
		result.append(", yDimension: ");
		result.append(yDimension);
		result.append(", rowNonexistent: ");
		result.append(rowNonexistent);
		result.append(", aisleWidth: ");
		result.append(aisleWidth);
		result.append(", numberOfDecks: ");
		result.append(numberOfDecks);
		result.append(", aircraftType: ");
		result.append(aircraftType);
		result.append(')');
		return result.toString();
	}

} // CabinImpl
