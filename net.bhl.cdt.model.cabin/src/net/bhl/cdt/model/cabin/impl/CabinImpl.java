/**
 */
package net.bhl.cdt.model.cabin.impl;

import java.util.Collection;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinDoors;
import net.bhl.cdt.model.cabin.CabinPackage;

import net.bhl.cdt.model.cabin.EmergencyExits;
import net.bhl.cdt.model.cabin.PassengerClass;
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
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getFCperc <em>FCperc</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getBCperc <em>BCperc</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.impl.CabinImpl#getNumbAisles <em>Numb Aisles</em>}</li>
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
	protected EList<CabinDoors> doors;

	/**
	 * The cached value of the '{@link #getExits() <em>Exits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExits()
	 * @generated
	 * @ordered
	 */
	protected EList<EmergencyExits> exits;
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
	 * The default value of the '{@link #getFCperc() <em>FCperc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCperc()
	 * @generated
	 * @ordered
	 */
	protected static final int FCPERC_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getFCperc() <em>FCperc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCperc()
	 * @generated
	 * @ordered
	 */
	protected int fCperc = FCPERC_EDEFAULT;
	/**
	 * The default value of the '{@link #getBCperc() <em>BCperc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCperc()
	 * @generated
	 * @ordered
	 */
	protected static final int BCPERC_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getBCperc() <em>BCperc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCperc()
	 * @generated
	 * @ordered
	 */
	protected int bCperc = BCPERC_EDEFAULT;
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
	public EList<CabinDoors> getDoors() {
		if (doors == null) {
			doors = new EObjectContainmentEList<CabinDoors>(CabinDoors.class, this, CabinPackage.CABIN__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmergencyExits> getExits() {
		if (exits == null) {
			exits = new EObjectResolvingEList<EmergencyExits>(EmergencyExits.class, this, CabinPackage.CABIN__EXITS);
		}
		return exits;
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
	public int getFCperc() {
		return fCperc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFCperc(int newFCperc) {
		int oldFCperc = fCperc;
		fCperc = newFCperc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__FCPERC, oldFCperc, fCperc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBCperc() {
		return bCperc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCperc(int newBCperc) {
		int oldBCperc = bCperc;
		bCperc = newBCperc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.CABIN__BCPERC, oldBCperc, bCperc));
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
			case CabinPackage.CABIN__BOARDING_TIME:
				return getBoardingTime();
			case CabinPackage.CABIN__FCPERC:
				return getFCperc();
			case CabinPackage.CABIN__BCPERC:
				return getBCperc();
			case CabinPackage.CABIN__NUMB_AISLES:
				return getNumbAisles();
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
				getDoors().addAll((Collection<? extends CabinDoors>)newValue);
				return;
			case CabinPackage.CABIN__EXITS:
				getExits().clear();
				getExits().addAll((Collection<? extends EmergencyExits>)newValue);
				return;
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime((Double)newValue);
				return;
			case CabinPackage.CABIN__FCPERC:
				setFCperc((Integer)newValue);
				return;
			case CabinPackage.CABIN__BCPERC:
				setBCperc((Integer)newValue);
				return;
			case CabinPackage.CABIN__NUMB_AISLES:
				setNumbAisles((Integer)newValue);
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
			case CabinPackage.CABIN__BOARDING_TIME:
				setBoardingTime(BOARDING_TIME_EDEFAULT);
				return;
			case CabinPackage.CABIN__FCPERC:
				setFCperc(FCPERC_EDEFAULT);
				return;
			case CabinPackage.CABIN__BCPERC:
				setBCperc(BCPERC_EDEFAULT);
				return;
			case CabinPackage.CABIN__NUMB_AISLES:
				setNumbAisles(NUMB_AISLES_EDEFAULT);
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
			case CabinPackage.CABIN__BOARDING_TIME:
				return boardingTime != BOARDING_TIME_EDEFAULT;
			case CabinPackage.CABIN__FCPERC:
				return fCperc != FCPERC_EDEFAULT;
			case CabinPackage.CABIN__BCPERC:
				return bCperc != BCPERC_EDEFAULT;
			case CabinPackage.CABIN__NUMB_AISLES:
				return numbAisles != NUMB_AISLES_EDEFAULT;
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
		result.append(", boardingTime: ");
		result.append(boardingTime);
		result.append(", FCperc: ");
		result.append(fCperc);
		result.append(", BCperc: ");
		result.append(bCperc);
		result.append(", numbAisles: ");
		result.append(numbAisles);
		result.append(')');
		return result.toString();
	}

} //CabinImpl
