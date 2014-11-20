/**
 */
package net.bhl.cdt.model.cabin.impl;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.CabinViewSettings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowSeatlabels <em>Show Seatlabels</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowRowLabels <em>Show Row Labels</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowGalleyAndLavatoryLabels <em>Show Galley And Lavatory Labels</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowCurtains <em>Show Curtains</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowSeats <em>Show Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowGalleys <em>Show Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowLavatories <em>Show Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowDoors <em>Show Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#isShowOccupiedSeats <em>Show Occupied Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#getSizeOfPassengerCircle <em>Size Of Passenger Circle</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#getDoorOffSetInPixels <em>Door Off Set In Pixels</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#getXZeroInPixels <em>XZero In Pixels</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#getYZeroInPixels <em>YZero In Pixels</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinViewSettingsImpl#getCabinWidthInPixels <em>Cabin Width In Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CabinViewSettingsImpl extends MinimalEObjectImpl.Container implements CabinViewSettings {
	/**
	 * The default value of the '{@link #isShowSeatlabels() <em>Show Seatlabels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSeatlabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_SEATLABELS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowSeatlabels() <em>Show Seatlabels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSeatlabels()
	 * @generated
	 * @ordered
	 */
	protected boolean showSeatlabels = SHOW_SEATLABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowRowLabels() <em>Show Row Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowRowLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_ROW_LABELS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowRowLabels() <em>Show Row Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowRowLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean showRowLabels = SHOW_ROW_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowGalleyAndLavatoryLabels() <em>Show Galley And Lavatory Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGalleyAndLavatoryLabels()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_GALLEY_AND_LAVATORY_LABELS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowGalleyAndLavatoryLabels() <em>Show Galley And Lavatory Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGalleyAndLavatoryLabels()
	 * @generated
	 * @ordered
	 */
	protected boolean showGalleyAndLavatoryLabels = SHOW_GALLEY_AND_LAVATORY_LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCurtains() <em>Show Curtains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCurtains()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CURTAINS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowCurtains() <em>Show Curtains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCurtains()
	 * @generated
	 * @ordered
	 */
	protected boolean showCurtains = SHOW_CURTAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowSeats() <em>Show Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSeats()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_SEATS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowSeats() <em>Show Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSeats()
	 * @generated
	 * @ordered
	 */
	protected boolean showSeats = SHOW_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowGalleys() <em>Show Galleys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGalleys()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_GALLEYS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowGalleys() <em>Show Galleys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowGalleys()
	 * @generated
	 * @ordered
	 */
	protected boolean showGalleys = SHOW_GALLEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLavatories() <em>Show Lavatories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLavatories()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LAVATORIES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowLavatories() <em>Show Lavatories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLavatories()
	 * @generated
	 * @ordered
	 */
	protected boolean showLavatories = SHOW_LAVATORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowDoors() <em>Show Doors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDoors()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_DOORS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowDoors() <em>Show Doors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDoors()
	 * @generated
	 * @ordered
	 */
	protected boolean showDoors = SHOW_DOORS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowOccupiedSeats() <em>Show Occupied Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOccupiedSeats()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_OCCUPIED_SEATS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowOccupiedSeats() <em>Show Occupied Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOccupiedSeats()
	 * @generated
	 * @ordered
	 */
	protected boolean showOccupiedSeats = SHOW_OCCUPIED_SEATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeOfPassengerCircle() <em>Size Of Passenger Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfPassengerCircle()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_OF_PASSENGER_CIRCLE_EDEFAULT = 0.75;

	/**
	 * The cached value of the '{@link #getSizeOfPassengerCircle() <em>Size Of Passenger Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeOfPassengerCircle()
	 * @generated
	 * @ordered
	 */
	protected double sizeOfPassengerCircle = SIZE_OF_PASSENGER_CIRCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoorOffSetInPixels() <em>Door Off Set In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorOffSetInPixels()
	 * @generated
	 * @ordered
	 */
	protected static final int DOOR_OFF_SET_IN_PIXELS_EDEFAULT = 2;

	/**
	 * The cached value of the '{@link #getDoorOffSetInPixels() <em>Door Off Set In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorOffSetInPixels()
	 * @generated
	 * @ordered
	 */
	protected int doorOffSetInPixels = DOOR_OFF_SET_IN_PIXELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXZeroInPixels() <em>XZero In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXZeroInPixels()
	 * @generated
	 * @ordered
	 */
	protected static final int XZERO_IN_PIXELS_EDEFAULT = 138;

	/**
	 * The cached value of the '{@link #getXZeroInPixels() <em>XZero In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXZeroInPixels()
	 * @generated
	 * @ordered
	 */
	protected int xZeroInPixels = XZERO_IN_PIXELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYZeroInPixels() <em>YZero In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZeroInPixels()
	 * @generated
	 * @ordered
	 */
	protected static final int YZERO_IN_PIXELS_EDEFAULT = 90;

	/**
	 * The cached value of the '{@link #getYZeroInPixels() <em>YZero In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZeroInPixels()
	 * @generated
	 * @ordered
	 */
	protected int yZeroInPixels = YZERO_IN_PIXELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCabinWidthInPixels() <em>Cabin Width In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinWidthInPixels()
	 * @generated
	 * @ordered
	 */
	protected static final int CABIN_WIDTH_IN_PIXELS_EDEFAULT = 96;

	/**
	 * The cached value of the '{@link #getCabinWidthInPixels() <em>Cabin Width In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinWidthInPixels()
	 * @generated
	 * @ordered
	 */
	protected int cabinWidthInPixels = CABIN_WIDTH_IN_PIXELS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinViewSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.CABIN_VIEW_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowSeatlabels() {
		return showSeatlabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowSeatlabels(boolean newShowSeatlabels) {
		boolean oldShowSeatlabels = showSeatlabels;
		showSeatlabels = newShowSeatlabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS, oldShowSeatlabels, showSeatlabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowRowLabels() {
		return showRowLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowRowLabels(boolean newShowRowLabels) {
		boolean oldShowRowLabels = showRowLabels;
		showRowLabels = newShowRowLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS, oldShowRowLabels, showRowLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowGalleyAndLavatoryLabels() {
		return showGalleyAndLavatoryLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowGalleyAndLavatoryLabels(boolean newShowGalleyAndLavatoryLabels) {
		boolean oldShowGalleyAndLavatoryLabels = showGalleyAndLavatoryLabels;
		showGalleyAndLavatoryLabels = newShowGalleyAndLavatoryLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS, oldShowGalleyAndLavatoryLabels, showGalleyAndLavatoryLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowCurtains() {
		return showCurtains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowCurtains(boolean newShowCurtains) {
		boolean oldShowCurtains = showCurtains;
		showCurtains = newShowCurtains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_CURTAINS, oldShowCurtains, showCurtains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowSeats() {
		return showSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowSeats(boolean newShowSeats) {
		boolean oldShowSeats = showSeats;
		showSeats = newShowSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATS, oldShowSeats, showSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowGalleys() {
		return showGalleys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowGalleys(boolean newShowGalleys) {
		boolean oldShowGalleys = showGalleys;
		showGalleys = newShowGalleys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEYS, oldShowGalleys, showGalleys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLavatories() {
		return showLavatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLavatories(boolean newShowLavatories) {
		boolean oldShowLavatories = showLavatories;
		showLavatories = newShowLavatories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES, oldShowLavatories, showLavatories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowDoors() {
		return showDoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowDoors(boolean newShowDoors) {
		boolean oldShowDoors = showDoors;
		showDoors = newShowDoors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_DOORS, oldShowDoors, showDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowOccupiedSeats() {
		return showOccupiedSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowOccupiedSeats(boolean newShowOccupiedSeats) {
		boolean oldShowOccupiedSeats = showOccupiedSeats;
		showOccupiedSeats = newShowOccupiedSeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS, oldShowOccupiedSeats, showOccupiedSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSizeOfPassengerCircle() {
		return sizeOfPassengerCircle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeOfPassengerCircle(double newSizeOfPassengerCircle) {
		double oldSizeOfPassengerCircle = sizeOfPassengerCircle;
		sizeOfPassengerCircle = newSizeOfPassengerCircle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE, oldSizeOfPassengerCircle, sizeOfPassengerCircle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDoorOffSetInPixels() {
		return doorOffSetInPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorOffSetInPixels(int newDoorOffSetInPixels) {
		int oldDoorOffSetInPixels = doorOffSetInPixels;
		doorOffSetInPixels = newDoorOffSetInPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS, oldDoorOffSetInPixels, doorOffSetInPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXZeroInPixels() {
		return xZeroInPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXZeroInPixels(int newXZeroInPixels) {
		int oldXZeroInPixels = xZeroInPixels;
		xZeroInPixels = newXZeroInPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS, oldXZeroInPixels, xZeroInPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYZeroInPixels() {
		return yZeroInPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYZeroInPixels(int newYZeroInPixels) {
		int oldYZeroInPixels = yZeroInPixels;
		yZeroInPixels = newYZeroInPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS, oldYZeroInPixels, yZeroInPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCabinWidthInPixels() {
		return cabinWidthInPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCabinWidthInPixels(int newCabinWidthInPixels) {
		int oldCabinWidthInPixels = cabinWidthInPixels;
		cabinWidthInPixels = newCabinWidthInPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS, oldCabinWidthInPixels, cabinWidthInPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS:
				return isShowSeatlabels();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS:
				return isShowRowLabels();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS:
				return isShowGalleyAndLavatoryLabels();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_CURTAINS:
				return isShowCurtains();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATS:
				return isShowSeats();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEYS:
				return isShowGalleys();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES:
				return isShowLavatories();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_DOORS:
				return isShowDoors();
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS:
				return isShowOccupiedSeats();
			case CabinPackage.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE:
				return getSizeOfPassengerCircle();
			case CabinPackage.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS:
				return getDoorOffSetInPixels();
			case CabinPackage.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS:
				return getXZeroInPixels();
			case CabinPackage.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS:
				return getYZeroInPixels();
			case CabinPackage.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS:
				return getCabinWidthInPixels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS:
				setShowSeatlabels((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS:
				setShowRowLabels((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS:
				setShowGalleyAndLavatoryLabels((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_CURTAINS:
				setShowCurtains((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATS:
				setShowSeats((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEYS:
				setShowGalleys((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES:
				setShowLavatories((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_DOORS:
				setShowDoors((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS:
				setShowOccupiedSeats((Boolean)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE:
				setSizeOfPassengerCircle((Double)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS:
				setDoorOffSetInPixels((Integer)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS:
				setXZeroInPixels((Integer)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS:
				setYZeroInPixels((Integer)newValue);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS:
				setCabinWidthInPixels((Integer)newValue);
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
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS:
				setShowSeatlabels(SHOW_SEATLABELS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS:
				setShowRowLabels(SHOW_ROW_LABELS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS:
				setShowGalleyAndLavatoryLabels(SHOW_GALLEY_AND_LAVATORY_LABELS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_CURTAINS:
				setShowCurtains(SHOW_CURTAINS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATS:
				setShowSeats(SHOW_SEATS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEYS:
				setShowGalleys(SHOW_GALLEYS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES:
				setShowLavatories(SHOW_LAVATORIES_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_DOORS:
				setShowDoors(SHOW_DOORS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS:
				setShowOccupiedSeats(SHOW_OCCUPIED_SEATS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE:
				setSizeOfPassengerCircle(SIZE_OF_PASSENGER_CIRCLE_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS:
				setDoorOffSetInPixels(DOOR_OFF_SET_IN_PIXELS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS:
				setXZeroInPixels(XZERO_IN_PIXELS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS:
				setYZeroInPixels(YZERO_IN_PIXELS_EDEFAULT);
				return;
			case CabinPackage.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS:
				setCabinWidthInPixels(CABIN_WIDTH_IN_PIXELS_EDEFAULT);
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
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS:
				return showSeatlabels != SHOW_SEATLABELS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS:
				return showRowLabels != SHOW_ROW_LABELS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS:
				return showGalleyAndLavatoryLabels != SHOW_GALLEY_AND_LAVATORY_LABELS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_CURTAINS:
				return showCurtains != SHOW_CURTAINS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATS:
				return showSeats != SHOW_SEATS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEYS:
				return showGalleys != SHOW_GALLEYS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES:
				return showLavatories != SHOW_LAVATORIES_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_DOORS:
				return showDoors != SHOW_DOORS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS:
				return showOccupiedSeats != SHOW_OCCUPIED_SEATS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE:
				return sizeOfPassengerCircle != SIZE_OF_PASSENGER_CIRCLE_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS:
				return doorOffSetInPixels != DOOR_OFF_SET_IN_PIXELS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS:
				return xZeroInPixels != XZERO_IN_PIXELS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS:
				return yZeroInPixels != YZERO_IN_PIXELS_EDEFAULT;
			case CabinPackage.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS:
				return cabinWidthInPixels != CABIN_WIDTH_IN_PIXELS_EDEFAULT;
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
		result.append(" (showSeatlabels: ");
		result.append(showSeatlabels);
		result.append(", showRowLabels: ");
		result.append(showRowLabels);
		result.append(", showGalleyAndLavatoryLabels: ");
		result.append(showGalleyAndLavatoryLabels);
		result.append(", showCurtains: ");
		result.append(showCurtains);
		result.append(", showSeats: ");
		result.append(showSeats);
		result.append(", showGalleys: ");
		result.append(showGalleys);
		result.append(", showLavatories: ");
		result.append(showLavatories);
		result.append(", showDoors: ");
		result.append(showDoors);
		result.append(", showOccupiedSeats: ");
		result.append(showOccupiedSeats);
		result.append(", sizeOfPassengerCircle: ");
		result.append(sizeOfPassengerCircle);
		result.append(", doorOffSetInPixels: ");
		result.append(doorOffSetInPixels);
		result.append(", xZeroInPixels: ");
		result.append(xZeroInPixels);
		result.append(", yZeroInPixels: ");
		result.append(yZeroInPixels);
		result.append(", cabinWidthInPixels: ");
		result.append(cabinWidthInPixels);
		result.append(')');
		return result.toString();
	}

} //CabinViewSettingsImpl
