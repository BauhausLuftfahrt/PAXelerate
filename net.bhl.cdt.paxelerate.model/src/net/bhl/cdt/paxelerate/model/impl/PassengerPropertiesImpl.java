/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.PassengerProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPercentageOfWomen <em>Percentage Of Women</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PassengerPropertiesImpl#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerPropertiesImpl extends MinimalEObjectImpl.Container implements PassengerProperties {
	/**
	 * The default value of the '{@link #getPassengerWidthMeanMale() <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_MEAN_MALE_EDEFAULT = 47.0;

	/**
	 * The cached value of the '{@link #getPassengerWidthMeanMale() <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthMeanMale = PASSENGER_WIDTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthDeviationMale() <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT = 2.8;

	/**
	 * The cached value of the '{@link #getPassengerWidthDeviationMale() <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthDeviationMale = PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightMeanMale() <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT = 90.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightMeanMale() <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightMeanMale = PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightDeviationMale() <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightDeviationMale() <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightDeviationMale = PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightMeanMale() <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT = 177.5;

	/**
	 * The cached value of the '{@link #getPassengerHeightMeanMale() <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightMeanMale = PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightDeviationMale() <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT = 11.1;

	/**
	 * The cached value of the '{@link #getPassengerHeightDeviationMale() <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightDeviationMale = PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthMeanMale() <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_MEAN_MALE_EDEFAULT = 30.0;

	/**
	 * The cached value of the '{@link #getPassengerDepthMeanMale() <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthMeanMale = PASSENGER_DEPTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthDeviationMale() <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getPassengerDepthDeviationMale() <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthDeviationMale = PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfWomen() <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfWomen()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_WOMEN_EDEFAULT = 50.0;

	/**
	 * The cached value of the '{@link #getPercentageOfWomen() <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfWomen()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfWomen = PERCENTAGE_OF_WOMEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthMeanFemale() <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT = 41.4;

	/**
	 * The cached value of the '{@link #getPassengerWidthMeanFemale() <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthMeanFemale = PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWidthDeviationFemale() <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT = 2.8;

	/**
	 * The cached value of the '{@link #getPassengerWidthDeviationFemale() <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWidthDeviationFemale = PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightMeanFemale() <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT = 60.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightMeanFemale() <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightMeanFemale = PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerWeightDeviationFemale() <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getPassengerWeightDeviationFemale() <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerWeightDeviationFemale = PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightMeanFemale() <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT = 164.5;

	/**
	 * The cached value of the '{@link #getPassengerHeightMeanFemale() <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightMeanFemale = PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHeightDeviationFemale() <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT = 11.5;

	/**
	 * The cached value of the '{@link #getPassengerHeightDeviationFemale() <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHeightDeviationFemale = PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthMeanFemale() <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT = 27;

	/**
	 * The cached value of the '{@link #getPassengerDepthMeanFemale() <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected int passengerDepthMeanFemale = PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthDeviationFemale() <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT = 3.0;

	/**
	 * The cached value of the '{@link #getPassengerDepthDeviationFemale() <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthDeviationFemale = PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerAggressiveMoodShare() <em>Passenger Aggressive Mood Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerAggressiveMoodShare()
	 * @generated
	 * @ordered
	 */
	protected static final int PASSENGER_AGGRESSIVE_MOOD_SHARE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPassengerAggressiveMoodShare() <em>Passenger Aggressive Mood Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerAggressiveMoodShare()
	 * @generated
	 * @ordered
	 */
	protected int passengerAggressiveMoodShare = PASSENGER_AGGRESSIVE_MOOD_SHARE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected PassengerPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the e class
	 * @generated 
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.PASSENGER_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger width mean male
	 * @generated 
	 */
	public double getPassengerWidthMeanMale() {
		return passengerWidthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWidthMeanMale the new passenger width mean male
	 * @generated 
	 */
	public void setPassengerWidthMeanMale(double newPassengerWidthMeanMale) {
		double oldPassengerWidthMeanMale = passengerWidthMeanMale;
		passengerWidthMeanMale = newPassengerWidthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE, oldPassengerWidthMeanMale, passengerWidthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger width deviation male
	 * @generated 
	 */
	public double getPassengerWidthDeviationMale() {
		return passengerWidthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWidthDeviationMale the new passenger width deviation male
	 * @generated 
	 */
	public void setPassengerWidthDeviationMale(double newPassengerWidthDeviationMale) {
		double oldPassengerWidthDeviationMale = passengerWidthDeviationMale;
		passengerWidthDeviationMale = newPassengerWidthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE, oldPassengerWidthDeviationMale, passengerWidthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger weight mean male
	 * @generated 
	 */
	public double getPassengerWeightMeanMale() {
		return passengerWeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWeightMeanMale the new passenger weight mean male
	 * @generated 
	 */
	public void setPassengerWeightMeanMale(double newPassengerWeightMeanMale) {
		double oldPassengerWeightMeanMale = passengerWeightMeanMale;
		passengerWeightMeanMale = newPassengerWeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE, oldPassengerWeightMeanMale, passengerWeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger weight deviation male
	 * @generated 
	 */
	public double getPassengerWeightDeviationMale() {
		return passengerWeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWeightDeviationMale the new passenger weight deviation male
	 * @generated 
	 */
	public void setPassengerWeightDeviationMale(double newPassengerWeightDeviationMale) {
		double oldPassengerWeightDeviationMale = passengerWeightDeviationMale;
		passengerWeightDeviationMale = newPassengerWeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE, oldPassengerWeightDeviationMale, passengerWeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger height mean male
	 * @generated 
	 */
	public double getPassengerHeightMeanMale() {
		return passengerHeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerHeightMeanMale the new passenger height mean male
	 * @generated 
	 */
	public void setPassengerHeightMeanMale(double newPassengerHeightMeanMale) {
		double oldPassengerHeightMeanMale = passengerHeightMeanMale;
		passengerHeightMeanMale = newPassengerHeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE, oldPassengerHeightMeanMale, passengerHeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger height deviation male
	 * @generated 
	 */
	public double getPassengerHeightDeviationMale() {
		return passengerHeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerHeightDeviationMale the new passenger height deviation male
	 * @generated 
	 */
	public void setPassengerHeightDeviationMale(double newPassengerHeightDeviationMale) {
		double oldPassengerHeightDeviationMale = passengerHeightDeviationMale;
		passengerHeightDeviationMale = newPassengerHeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE, oldPassengerHeightDeviationMale, passengerHeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger depth mean male
	 * @generated 
	 */
	public double getPassengerDepthMeanMale() {
		return passengerDepthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerDepthMeanMale the new passenger depth mean male
	 * @generated 
	 */
	public void setPassengerDepthMeanMale(double newPassengerDepthMeanMale) {
		double oldPassengerDepthMeanMale = passengerDepthMeanMale;
		passengerDepthMeanMale = newPassengerDepthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE, oldPassengerDepthMeanMale, passengerDepthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger depth deviation male
	 * @generated 
	 */
	public double getPassengerDepthDeviationMale() {
		return passengerDepthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerDepthDeviationMale the new passenger depth deviation male
	 * @generated 
	 */
	public void setPassengerDepthDeviationMale(double newPassengerDepthDeviationMale) {
		double oldPassengerDepthDeviationMale = passengerDepthDeviationMale;
		passengerDepthDeviationMale = newPassengerDepthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE, oldPassengerDepthDeviationMale, passengerDepthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the percentage of women
	 * @generated 
	 */
	public double getPercentageOfWomen() {
		return percentageOfWomen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPercentageOfWomen the new percentage of women
	 * @generated 
	 */
	public void setPercentageOfWomen(double newPercentageOfWomen) {
		double oldPercentageOfWomen = percentageOfWomen;
		percentageOfWomen = newPercentageOfWomen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN, oldPercentageOfWomen, percentageOfWomen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger width mean female
	 * @generated 
	 */
	public double getPassengerWidthMeanFemale() {
		return passengerWidthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWidthMeanFemale the new passenger width mean female
	 * @generated 
	 */
	public void setPassengerWidthMeanFemale(double newPassengerWidthMeanFemale) {
		double oldPassengerWidthMeanFemale = passengerWidthMeanFemale;
		passengerWidthMeanFemale = newPassengerWidthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE, oldPassengerWidthMeanFemale, passengerWidthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger width deviation female
	 * @generated 
	 */
	public double getPassengerWidthDeviationFemale() {
		return passengerWidthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWidthDeviationFemale the new passenger width deviation female
	 * @generated 
	 */
	public void setPassengerWidthDeviationFemale(double newPassengerWidthDeviationFemale) {
		double oldPassengerWidthDeviationFemale = passengerWidthDeviationFemale;
		passengerWidthDeviationFemale = newPassengerWidthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE, oldPassengerWidthDeviationFemale, passengerWidthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger weight mean female
	 * @generated 
	 */
	public double getPassengerWeightMeanFemale() {
		return passengerWeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWeightMeanFemale the new passenger weight mean female
	 * @generated 
	 */
	public void setPassengerWeightMeanFemale(double newPassengerWeightMeanFemale) {
		double oldPassengerWeightMeanFemale = passengerWeightMeanFemale;
		passengerWeightMeanFemale = newPassengerWeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE, oldPassengerWeightMeanFemale, passengerWeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger weight deviation female
	 * @generated 
	 */
	public double getPassengerWeightDeviationFemale() {
		return passengerWeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerWeightDeviationFemale the new passenger weight deviation female
	 * @generated 
	 */
	public void setPassengerWeightDeviationFemale(double newPassengerWeightDeviationFemale) {
		double oldPassengerWeightDeviationFemale = passengerWeightDeviationFemale;
		passengerWeightDeviationFemale = newPassengerWeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE, oldPassengerWeightDeviationFemale, passengerWeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger height mean female
	 * @generated 
	 */
	public double getPassengerHeightMeanFemale() {
		return passengerHeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerHeightMeanFemale the new passenger height mean female
	 * @generated 
	 */
	public void setPassengerHeightMeanFemale(double newPassengerHeightMeanFemale) {
		double oldPassengerHeightMeanFemale = passengerHeightMeanFemale;
		passengerHeightMeanFemale = newPassengerHeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE, oldPassengerHeightMeanFemale, passengerHeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger height deviation female
	 * @generated 
	 */
	public double getPassengerHeightDeviationFemale() {
		return passengerHeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerHeightDeviationFemale the new passenger height deviation female
	 * @generated 
	 */
	public void setPassengerHeightDeviationFemale(double newPassengerHeightDeviationFemale) {
		double oldPassengerHeightDeviationFemale = passengerHeightDeviationFemale;
		passengerHeightDeviationFemale = newPassengerHeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE, oldPassengerHeightDeviationFemale, passengerHeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger depth mean female
	 * @generated 
	 */
	public int getPassengerDepthMeanFemale() {
		return passengerDepthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerDepthMeanFemale the new passenger depth mean female
	 * @generated 
	 */
	public void setPassengerDepthMeanFemale(int newPassengerDepthMeanFemale) {
		int oldPassengerDepthMeanFemale = passengerDepthMeanFemale;
		passengerDepthMeanFemale = newPassengerDepthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE, oldPassengerDepthMeanFemale, passengerDepthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger depth deviation female
	 * @generated 
	 */
	public double getPassengerDepthDeviationFemale() {
		return passengerDepthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerDepthDeviationFemale the new passenger depth deviation female
	 * @generated 
	 */
	public void setPassengerDepthDeviationFemale(double newPassengerDepthDeviationFemale) {
		double oldPassengerDepthDeviationFemale = passengerDepthDeviationFemale;
		passengerDepthDeviationFemale = newPassengerDepthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE, oldPassengerDepthDeviationFemale, passengerDepthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPassengerAggressiveMoodShare() {
		return passengerAggressiveMoodShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerAggressiveMoodShare(int newPassengerAggressiveMoodShare) {
		int oldPassengerAggressiveMoodShare = passengerAggressiveMoodShare;
		passengerAggressiveMoodShare = newPassengerAggressiveMoodShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE, oldPassengerAggressiveMoodShare, passengerAggressiveMoodShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
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
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				return getPassengerWidthMeanMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				return getPassengerWidthDeviationMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				return getPassengerWeightMeanMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				return getPassengerWeightDeviationMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				return getPassengerHeightMeanMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				return getPassengerHeightDeviationMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				return getPassengerDepthMeanMale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				return getPassengerDepthDeviationMale();
			case CabinPackage.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN:
				return getPercentageOfWomen();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				return getPassengerWidthMeanFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				return getPassengerWidthDeviationFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				return getPassengerWeightMeanFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				return getPassengerWeightDeviationFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				return getPassengerHeightMeanFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				return getPassengerHeightDeviationFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				return getPassengerDepthMeanFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				return getPassengerDepthDeviationFemale();
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
				return getPassengerAggressiveMoodShare();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param newValue the new value
	 * @generated 
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				setPassengerWidthMeanMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				setPassengerWidthDeviationMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				setPassengerWeightMeanMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				setPassengerWeightDeviationMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				setPassengerHeightMeanMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				setPassengerHeightDeviationMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				setPassengerDepthMeanMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				setPassengerDepthDeviationMale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN:
				setPercentageOfWomen((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				setPassengerWidthMeanFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				setPassengerWidthDeviationFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				setPassengerWeightMeanFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				setPassengerWeightDeviationFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				setPassengerHeightMeanFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				setPassengerHeightDeviationFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				setPassengerDepthMeanFemale((Integer)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				setPassengerDepthDeviationFemale((Double)newValue);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
				setPassengerAggressiveMoodShare((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @generated 
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				setPassengerWidthMeanMale(PASSENGER_WIDTH_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				setPassengerWidthDeviationMale(PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				setPassengerWeightMeanMale(PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				setPassengerWeightDeviationMale(PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				setPassengerHeightMeanMale(PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				setPassengerHeightDeviationMale(PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				setPassengerDepthMeanMale(PASSENGER_DEPTH_MEAN_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				setPassengerDepthDeviationMale(PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN:
				setPercentageOfWomen(PERCENTAGE_OF_WOMEN_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				setPassengerWidthMeanFemale(PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				setPassengerWidthDeviationFemale(PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				setPassengerWeightMeanFemale(PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				setPassengerWeightDeviationFemale(PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				setPassengerHeightMeanFemale(PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				setPassengerHeightDeviationFemale(PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				setPassengerDepthMeanFemale(PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				setPassengerDepthDeviationFemale(PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT);
				return;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
				setPassengerAggressiveMoodShare(PASSENGER_AGGRESSIVE_MOOD_SHARE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @return true, if successful
	 * @generated 
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
				return passengerWidthMeanMale != PASSENGER_WIDTH_MEAN_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
				return passengerWidthDeviationMale != PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
				return passengerWeightMeanMale != PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
				return passengerWeightDeviationMale != PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
				return passengerHeightMeanMale != PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
				return passengerHeightDeviationMale != PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
				return passengerDepthMeanMale != PASSENGER_DEPTH_MEAN_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
				return passengerDepthDeviationMale != PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN:
				return percentageOfWomen != PERCENTAGE_OF_WOMEN_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
				return passengerWidthMeanFemale != PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
				return passengerWidthDeviationFemale != PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
				return passengerWeightMeanFemale != PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
				return passengerWeightDeviationFemale != PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
				return passengerHeightMeanFemale != PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
				return passengerHeightDeviationFemale != PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
				return passengerDepthMeanFemale != PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
				return passengerDepthDeviationFemale != PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT;
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
				return passengerAggressiveMoodShare != PASSENGER_AGGRESSIVE_MOOD_SHARE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the string
	 * @generated 
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (passengerWidthMeanMale: ");
		result.append(passengerWidthMeanMale);
		result.append(", passengerWidthDeviationMale: ");
		result.append(passengerWidthDeviationMale);
		result.append(", passengerWeightMeanMale: ");
		result.append(passengerWeightMeanMale);
		result.append(", passengerWeightDeviationMale: ");
		result.append(passengerWeightDeviationMale);
		result.append(", passengerHeightMeanMale: ");
		result.append(passengerHeightMeanMale);
		result.append(", passengerHeightDeviationMale: ");
		result.append(passengerHeightDeviationMale);
		result.append(", passengerDepthMeanMale: ");
		result.append(passengerDepthMeanMale);
		result.append(", passengerDepthDeviationMale: ");
		result.append(passengerDepthDeviationMale);
		result.append(", percentageOfWomen: ");
		result.append(percentageOfWomen);
		result.append(", passengerWidthMeanFemale: ");
		result.append(passengerWidthMeanFemale);
		result.append(", passengerWidthDeviationFemale: ");
		result.append(passengerWidthDeviationFemale);
		result.append(", passengerWeightMeanFemale: ");
		result.append(passengerWeightMeanFemale);
		result.append(", passengerWeightDeviationFemale: ");
		result.append(passengerWeightDeviationFemale);
		result.append(", passengerHeightMeanFemale: ");
		result.append(passengerHeightMeanFemale);
		result.append(", passengerHeightDeviationFemale: ");
		result.append(passengerHeightDeviationFemale);
		result.append(", passengerDepthMeanFemale: ");
		result.append(passengerDepthMeanFemale);
		result.append(", passengerDepthDeviationFemale: ");
		result.append(passengerDepthDeviationFemale);
		result.append(", passengerAggressiveMoodShare: ");
		result.append(passengerAggressiveMoodShare);
		result.append(')');
		return result.toString();
	}

} //PassengerPropertiesImpl
