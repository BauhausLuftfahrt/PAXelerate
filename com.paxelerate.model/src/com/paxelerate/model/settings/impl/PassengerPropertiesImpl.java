/**
 */
package com.paxelerate.model.settings.impl;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.enums.DoorSelection;
import com.paxelerate.model.settings.PassengerProperties;
import com.paxelerate.model.settings.SettingsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getSeatInterferenceMultiPassengerFactor <em>Seat Interference Multi Passenger Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getDoorSelection <em>Door Selection</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getGroupPercentage <em>Group Percentage</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getAgeSpeedDependency <em>Age Speed Dependency</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getAgeDistribution <em>Age Distribution</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeWidthMeanMale <em>Passenger Knee Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeWidthDeviationMale <em>Passenger Knee Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeWidthMeanFemale <em>Passenger Knee Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeWidthDeviationFemale <em>Passenger Knee Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeDepthMeanMale <em>Passenger Knee Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeDepthDeviationMale <em>Passenger Knee Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeDepthMeanFemale <em>Passenger Knee Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeDepthDeviationFemale <em>Passenger Knee Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeHeightMeanMale <em>Passenger Knee Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeHeightDeviationMale <em>Passenger Knee Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeHeightMeanFemale <em>Passenger Knee Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerKneeHeightDeviationFemale <em>Passenger Knee Height Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipWidthMeanMale <em>Passenger Hip Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipWidthDeviationMale <em>Passenger Hip Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipWidthMeanFemale <em>Passenger Hip Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipWidthDeviationFemale <em>Passenger Hip Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipDepthMeanMale <em>Passenger Hip Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipDepthDeviationMale <em>Passenger Hip Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipDepthMeanFemale <em>Passenger Hip Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipDepthDeviationFemale <em>Passenger Hip Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipHeightMeanMale <em>Passenger Hip Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipHeightDeviationMale <em>Passenger Hip Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipHeightMeanFemale <em>Passenger Hip Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerHipHeightDeviationFemale <em>Passenger Hip Height Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderWidthMeanMale <em>Passenger Shoulder Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderWidthDeviationMale <em>Passenger Shoulder Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderWidthMeanFemale <em>Passenger Shoulder Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderWidthDeviationFemale <em>Passenger Shoulder Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderDepthMeanMale <em>Passenger Shoulder Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderDepthDeviationMale <em>Passenger Shoulder Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderDepthMeanFemale <em>Passenger Shoulder Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderDepthDeviationFemale <em>Passenger Shoulder Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderHeightMeanMale <em>Passenger Shoulder Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderHeightDeviationMale <em>Passenger Shoulder Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderHeightMeanFemale <em>Passenger Shoulder Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl#getPassengerShoulderHeightDeviationFemale <em>Passenger Shoulder Height Deviation Female</em>}</li>
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
	protected static final double PASSENGER_WIDTH_MEAN_MALE_EDEFAULT = 0.47;

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
	protected static final double PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT = 0.028;

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
	protected static final double PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT = 0.9;

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
	protected static final double PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT = 0.2;

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
	protected static final double PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT = 1.775;

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
	protected static final double PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT = 0.111;

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
	protected static final double PASSENGER_DEPTH_MEAN_MALE_EDEFAULT = 0.3;

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
	protected static final double PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT = 0.05;

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
	 * The default value of the '{@link #getPassengerWidthMeanFemale() <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT = 0.414;

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
	protected static final double PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT = 0.01;

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
	protected static final double PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT = 0.6;

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
	protected static final double PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT = 0.15;

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
	protected static final double PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT = 1.645;

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
	protected static final double PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT = 0.115;

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
	protected static final double PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT = 0.27;

	/**
	 * The cached value of the '{@link #getPassengerDepthMeanFemale() <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerDepthMeanFemale = PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerDepthDeviationFemale() <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT = 0.03;

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
	 * The default value of the '{@link #getSeatInterferenceProcessTimeMean() <em>Seat Interference Process Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_INTERFERENCE_PROCESS_TIME_MEAN_EDEFAULT = 8.0;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTimeMean() <em>Seat Interference Process Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double seatInterferenceProcessTimeMean = SEAT_INTERFERENCE_PROCESS_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatInterferenceProcessTimeDeviation() <em>Seat Interference Process Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION_EDEFAULT = 3.0;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTimeDeviation() <em>Seat Interference Process Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double seatInterferenceProcessTimeDeviation = SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatInterferenceProcessTimeFoldingSeatMean() <em>Seat Interference Process Time Folding Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeFoldingSeatMean()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTimeFoldingSeatMean() <em>Seat Interference Process Time Folding Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeFoldingSeatMean()
	 * @generated
	 * @ordered
	 */
	protected double seatInterferenceProcessTimeFoldingSeatMean = SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatInterferenceProcessTimeFoldingSeatDeviation() <em>Seat Interference Process Time Folding Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getSeatInterferenceProcessTimeFoldingSeatDeviation() <em>Seat Interference Process Time Folding Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @generated
	 * @ordered
	 */
	protected double seatInterferenceProcessTimeFoldingSeatDeviation = SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassivePassengerWaitingTimeAfterCollision() <em>Passive Passenger Waiting Time After Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassivePassengerWaitingTimeAfterCollision()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION_EDEFAULT = 0.3;

	/**
	 * The cached value of the '{@link #getPassivePassengerWaitingTimeAfterCollision() <em>Passive Passenger Waiting Time After Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassivePassengerWaitingTimeAfterCollision()
	 * @generated
	 * @ordered
	 */
	protected double passivePassengerWaitingTimeAfterCollision = PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeatInterferenceMultiPassengerFactor() <em>Seat Interference Multi Passenger Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceMultiPassengerFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR_EDEFAULT = 0.7;

	/**
	 * The cached value of the '{@link #getSeatInterferenceMultiPassengerFactor() <em>Seat Interference Multi Passenger Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatInterferenceMultiPassengerFactor()
	 * @generated
	 * @ordered
	 */
	protected double seatInterferenceMultiPassengerFactor = SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoorSelection() <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSelection()
	 * @generated
	 * @ordered
	 */
	protected static final DoorSelection DOOR_SELECTION_EDEFAULT = DoorSelection.CLOSEST;

	/**
	 * The cached value of the '{@link #getDoorSelection() <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSelection()
	 * @generated
	 * @ordered
	 */
	protected DoorSelection doorSelection = DOOR_SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupPercentage() <em>Group Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double GROUP_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGroupPercentage() <em>Group Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupPercentage()
	 * @generated
	 * @ordered
	 */
	protected double groupPercentage = GROUP_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgeSpeedDependency() <em>Age Speed Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeSpeedDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<EPoint> ageSpeedDependency;

	/**
	 * The cached value of the '{@link #getAgeDistribution() <em>Age Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgeDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<EPoint> ageDistribution;

	/**
	 * The default value of the '{@link #getPassengerKneeWidthMeanMale() <em>Passenger Knee Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_WIDTH_MEAN_MALE_EDEFAULT = 0.3418;

	/**
	 * The cached value of the '{@link #getPassengerKneeWidthMeanMale() <em>Passenger Knee Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeWidthMeanMale = PASSENGER_KNEE_WIDTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeWidthDeviationMale() <em>Passenger Knee Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_WIDTH_DEVIATION_MALE_EDEFAULT = 0.0203;

	/**
	 * The cached value of the '{@link #getPassengerKneeWidthDeviationMale() <em>Passenger Knee Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeWidthDeviationMale = PASSENGER_KNEE_WIDTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeWidthMeanFemale() <em>Passenger Knee Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_WIDTH_MEAN_FEMALE_EDEFAULT = 0.3427;

	/**
	 * The cached value of the '{@link #getPassengerKneeWidthMeanFemale() <em>Passenger Knee Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeWidthMeanFemale = PASSENGER_KNEE_WIDTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeWidthDeviationFemale() <em>Passenger Knee Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE_EDEFAULT = 0.0224;

	/**
	 * The cached value of the '{@link #getPassengerKneeWidthDeviationFemale() <em>Passenger Knee Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeWidthDeviationFemale = PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeDepthMeanMale() <em>Passenger Knee Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_DEPTH_MEAN_MALE_EDEFAULT = 0.2486;

	/**
	 * The cached value of the '{@link #getPassengerKneeDepthMeanMale() <em>Passenger Knee Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeDepthMeanMale = PASSENGER_KNEE_DEPTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeDepthDeviationMale() <em>Passenger Knee Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_DEPTH_DEVIATION_MALE_EDEFAULT = 0.0207;

	/**
	 * The cached value of the '{@link #getPassengerKneeDepthDeviationMale() <em>Passenger Knee Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeDepthDeviationMale = PASSENGER_KNEE_DEPTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeDepthMeanFemale() <em>Passenger Knee Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_DEPTH_MEAN_FEMALE_EDEFAULT = 0.2271;

	/**
	 * The cached value of the '{@link #getPassengerKneeDepthMeanFemale() <em>Passenger Knee Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeDepthMeanFemale = PASSENGER_KNEE_DEPTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeDepthDeviationFemale() <em>Passenger Knee Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE_EDEFAULT = 0.021;

	/**
	 * The cached value of the '{@link #getPassengerKneeDepthDeviationFemale() <em>Passenger Knee Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeDepthDeviationFemale = PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeHeightMeanMale() <em>Passenger Knee Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_HEIGHT_MEAN_MALE_EDEFAULT = 0.5048;

	/**
	 * The cached value of the '{@link #getPassengerKneeHeightMeanMale() <em>Passenger Knee Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeHeightMeanMale = PASSENGER_KNEE_HEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeHeightDeviationMale() <em>Passenger Knee Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_HEIGHT_DEVIATION_MALE_EDEFAULT = 0.0276;

	/**
	 * The cached value of the '{@link #getPassengerKneeHeightDeviationMale() <em>Passenger Knee Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeHeightDeviationMale = PASSENGER_KNEE_HEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeHeightMeanFemale() <em>Passenger Knee Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_HEIGHT_MEAN_FEMALE_EDEFAULT = 0.4587;

	/**
	 * The cached value of the '{@link #getPassengerKneeHeightMeanFemale() <em>Passenger Knee Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeHeightMeanFemale = PASSENGER_KNEE_HEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerKneeHeightDeviationFemale() <em>Passenger Knee Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE_EDEFAULT = 0.0261;

	/**
	 * The cached value of the '{@link #getPassengerKneeHeightDeviationFemale() <em>Passenger Knee Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerKneeHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerKneeHeightDeviationFemale = PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipWidthMeanMale() <em>Passenger Hip Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_WIDTH_MEAN_MALE_EDEFAULT = 0.3418;

	/**
	 * The cached value of the '{@link #getPassengerHipWidthMeanMale() <em>Passenger Hip Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipWidthMeanMale = PASSENGER_HIP_WIDTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipWidthDeviationMale() <em>Passenger Hip Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_WIDTH_DEVIATION_MALE_EDEFAULT = 0.0203;

	/**
	 * The cached value of the '{@link #getPassengerHipWidthDeviationMale() <em>Passenger Hip Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipWidthDeviationMale = PASSENGER_HIP_WIDTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipWidthMeanFemale() <em>Passenger Hip Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_WIDTH_MEAN_FEMALE_EDEFAULT = 0.3427;

	/**
	 * The cached value of the '{@link #getPassengerHipWidthMeanFemale() <em>Passenger Hip Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipWidthMeanFemale = PASSENGER_HIP_WIDTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipWidthDeviationFemale() <em>Passenger Hip Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_WIDTH_DEVIATION_FEMALE_EDEFAULT = 0.0224;

	/**
	 * The cached value of the '{@link #getPassengerHipWidthDeviationFemale() <em>Passenger Hip Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipWidthDeviationFemale = PASSENGER_HIP_WIDTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipDepthMeanMale() <em>Passenger Hip Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_DEPTH_MEAN_MALE_EDEFAULT = 0.2486;

	/**
	 * The cached value of the '{@link #getPassengerHipDepthMeanMale() <em>Passenger Hip Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipDepthMeanMale = PASSENGER_HIP_DEPTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipDepthDeviationMale() <em>Passenger Hip Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_DEPTH_DEVIATION_MALE_EDEFAULT = 0.0207;

	/**
	 * The cached value of the '{@link #getPassengerHipDepthDeviationMale() <em>Passenger Hip Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipDepthDeviationMale = PASSENGER_HIP_DEPTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipDepthMeanFemale() <em>Passenger Hip Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_DEPTH_MEAN_FEMALE_EDEFAULT = 0.2271;

	/**
	 * The cached value of the '{@link #getPassengerHipDepthMeanFemale() <em>Passenger Hip Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipDepthMeanFemale = PASSENGER_HIP_DEPTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipDepthDeviationFemale() <em>Passenger Hip Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_DEPTH_DEVIATION_FEMALE_EDEFAULT = 0.021;

	/**
	 * The cached value of the '{@link #getPassengerHipDepthDeviationFemale() <em>Passenger Hip Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipDepthDeviationFemale = PASSENGER_HIP_DEPTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipHeightMeanMale() <em>Passenger Hip Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_HEIGHT_MEAN_MALE_EDEFAULT = 0.8874;

	/**
	 * The cached value of the '{@link #getPassengerHipHeightMeanMale() <em>Passenger Hip Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipHeightMeanMale = PASSENGER_HIP_HEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipHeightDeviationMale() <em>Passenger Hip Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_HEIGHT_DEVIATION_MALE_EDEFAULT = 0.0471;

	/**
	 * The cached value of the '{@link #getPassengerHipHeightDeviationMale() <em>Passenger Hip Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipHeightDeviationMale = PASSENGER_HIP_HEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipHeightMeanFemale() <em>Passenger Hip Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_HEIGHT_MEAN_FEMALE_EDEFAULT = 0.8383;

	/**
	 * The cached value of the '{@link #getPassengerHipHeightMeanFemale() <em>Passenger Hip Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipHeightMeanFemale = PASSENGER_HIP_HEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerHipHeightDeviationFemale() <em>Passenger Hip Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE_EDEFAULT = 0.0452;

	/**
	 * The cached value of the '{@link #getPassengerHipHeightDeviationFemale() <em>Passenger Hip Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerHipHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerHipHeightDeviationFemale = PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderWidthMeanMale() <em>Passenger Shoulder Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_WIDTH_MEAN_MALE_EDEFAULT = 0.49;

	/**
	 * The cached value of the '{@link #getPassengerShoulderWidthMeanMale() <em>Passenger Shoulder Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderWidthMeanMale = PASSENGER_SHOULDER_WIDTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderWidthDeviationMale() <em>Passenger Shoulder Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE_EDEFAULT = 0.026;

	/**
	 * The cached value of the '{@link #getPassengerShoulderWidthDeviationMale() <em>Passenger Shoulder Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderWidthDeviationMale = PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderWidthMeanFemale() <em>Passenger Shoulder Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE_EDEFAULT = 0.43;

	/**
	 * The cached value of the '{@link #getPassengerShoulderWidthMeanFemale() <em>Passenger Shoulder Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderWidthMeanFemale = PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderWidthDeviationFemale() <em>Passenger Shoulder Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE_EDEFAULT = 0.023;

	/**
	 * The cached value of the '{@link #getPassengerShoulderWidthDeviationFemale() <em>Passenger Shoulder Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderWidthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderWidthDeviationFemale = PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderDepthMeanMale() <em>Passenger Shoulder Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_DEPTH_MEAN_MALE_EDEFAULT = 0.2432;

	/**
	 * The cached value of the '{@link #getPassengerShoulderDepthMeanMale() <em>Passenger Shoulder Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderDepthMeanMale = PASSENGER_SHOULDER_DEPTH_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderDepthDeviationMale() <em>Passenger Shoulder Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE_EDEFAULT = 0.0215;

	/**
	 * The cached value of the '{@link #getPassengerShoulderDepthDeviationMale() <em>Passenger Shoulder Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderDepthDeviationMale = PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderDepthMeanFemale() <em>Passenger Shoulder Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE_EDEFAULT = 0.2394;

	/**
	 * The cached value of the '{@link #getPassengerShoulderDepthMeanFemale() <em>Passenger Shoulder Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderDepthMeanFemale = PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderDepthDeviationFemale() <em>Passenger Shoulder Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE_EDEFAULT = 0.0211;

	/**
	 * The cached value of the '{@link #getPassengerShoulderDepthDeviationFemale() <em>Passenger Shoulder Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderDepthDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderDepthDeviationFemale = PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderHeightMeanMale() <em>Passenger Shoulder Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_HEIGHT_MEAN_MALE_EDEFAULT = 1.4425;

	/**
	 * The cached value of the '{@link #getPassengerShoulderHeightMeanMale() <em>Passenger Shoulder Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightMeanMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderHeightMeanMale = PASSENGER_SHOULDER_HEIGHT_MEAN_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderHeightDeviationMale() <em>Passenger Shoulder Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE_EDEFAULT = 0.062;

	/**
	 * The cached value of the '{@link #getPassengerShoulderHeightDeviationMale() <em>Passenger Shoulder Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightDeviationMale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderHeightDeviationMale = PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderHeightMeanFemale() <em>Passenger Shoulder Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE_EDEFAULT = 1.3336;

	/**
	 * The cached value of the '{@link #getPassengerShoulderHeightMeanFemale() <em>Passenger Shoulder Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightMeanFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderHeightMeanFemale = PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerShoulderHeightDeviationFemale() <em>Passenger Shoulder Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE_EDEFAULT = 0.0579;

	/**
	 * The cached value of the '{@link #getPassengerShoulderHeightDeviationFemale() <em>Passenger Shoulder Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerShoulderHeightDeviationFemale()
	 * @generated
	 * @ordered
	 */
	protected double passengerShoulderHeightDeviationFemale = PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.PASSENGER_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthMeanMale() {
		return passengerWidthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthMeanMale(double newPassengerWidthMeanMale) {
		double oldPassengerWidthMeanMale = passengerWidthMeanMale;
		passengerWidthMeanMale = newPassengerWidthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE, oldPassengerWidthMeanMale,
					passengerWidthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthDeviationMale() {
		return passengerWidthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthDeviationMale(double newPassengerWidthDeviationMale) {
		double oldPassengerWidthDeviationMale = passengerWidthDeviationMale;
		passengerWidthDeviationMale = newPassengerWidthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE,
					oldPassengerWidthDeviationMale, passengerWidthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightMeanMale() {
		return passengerWeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightMeanMale(double newPassengerWeightMeanMale) {
		double oldPassengerWeightMeanMale = passengerWeightMeanMale;
		passengerWeightMeanMale = newPassengerWeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE, oldPassengerWeightMeanMale,
					passengerWeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightDeviationMale() {
		return passengerWeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightDeviationMale(double newPassengerWeightDeviationMale) {
		double oldPassengerWeightDeviationMale = passengerWeightDeviationMale;
		passengerWeightDeviationMale = newPassengerWeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE,
					oldPassengerWeightDeviationMale, passengerWeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightMeanMale() {
		return passengerHeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightMeanMale(double newPassengerHeightMeanMale) {
		double oldPassengerHeightMeanMale = passengerHeightMeanMale;
		passengerHeightMeanMale = newPassengerHeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE, oldPassengerHeightMeanMale,
					passengerHeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightDeviationMale() {
		return passengerHeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightDeviationMale(double newPassengerHeightDeviationMale) {
		double oldPassengerHeightDeviationMale = passengerHeightDeviationMale;
		passengerHeightDeviationMale = newPassengerHeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE,
					oldPassengerHeightDeviationMale, passengerHeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthMeanMale() {
		return passengerDepthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthMeanMale(double newPassengerDepthMeanMale) {
		double oldPassengerDepthMeanMale = passengerDepthMeanMale;
		passengerDepthMeanMale = newPassengerDepthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE, oldPassengerDepthMeanMale,
					passengerDepthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthDeviationMale() {
		return passengerDepthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthDeviationMale(double newPassengerDepthDeviationMale) {
		double oldPassengerDepthDeviationMale = passengerDepthDeviationMale;
		passengerDepthDeviationMale = newPassengerDepthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE,
					oldPassengerDepthDeviationMale, passengerDepthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthMeanFemale() {
		return passengerWidthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthMeanFemale(double newPassengerWidthMeanFemale) {
		double oldPassengerWidthMeanFemale = passengerWidthMeanFemale;
		passengerWidthMeanFemale = newPassengerWidthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE, oldPassengerWidthMeanFemale,
					passengerWidthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWidthDeviationFemale() {
		return passengerWidthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWidthDeviationFemale(double newPassengerWidthDeviationFemale) {
		double oldPassengerWidthDeviationFemale = passengerWidthDeviationFemale;
		passengerWidthDeviationFemale = newPassengerWidthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE,
					oldPassengerWidthDeviationFemale, passengerWidthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightMeanFemale() {
		return passengerWeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightMeanFemale(double newPassengerWeightMeanFemale) {
		double oldPassengerWeightMeanFemale = passengerWeightMeanFemale;
		passengerWeightMeanFemale = newPassengerWeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE, oldPassengerWeightMeanFemale,
					passengerWeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerWeightDeviationFemale() {
		return passengerWeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerWeightDeviationFemale(double newPassengerWeightDeviationFemale) {
		double oldPassengerWeightDeviationFemale = passengerWeightDeviationFemale;
		passengerWeightDeviationFemale = newPassengerWeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE,
					oldPassengerWeightDeviationFemale, passengerWeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightMeanFemale() {
		return passengerHeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightMeanFemale(double newPassengerHeightMeanFemale) {
		double oldPassengerHeightMeanFemale = passengerHeightMeanFemale;
		passengerHeightMeanFemale = newPassengerHeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE, oldPassengerHeightMeanFemale,
					passengerHeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHeightDeviationFemale() {
		return passengerHeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHeightDeviationFemale(double newPassengerHeightDeviationFemale) {
		double oldPassengerHeightDeviationFemale = passengerHeightDeviationFemale;
		passengerHeightDeviationFemale = newPassengerHeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE,
					oldPassengerHeightDeviationFemale, passengerHeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthMeanFemale() {
		return passengerDepthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthMeanFemale(double newPassengerDepthMeanFemale) {
		double oldPassengerDepthMeanFemale = passengerDepthMeanFemale;
		passengerDepthMeanFemale = newPassengerDepthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE, oldPassengerDepthMeanFemale,
					passengerDepthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerDepthDeviationFemale() {
		return passengerDepthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerDepthDeviationFemale(double newPassengerDepthDeviationFemale) {
		double oldPassengerDepthDeviationFemale = passengerDepthDeviationFemale;
		passengerDepthDeviationFemale = newPassengerDepthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE,
					oldPassengerDepthDeviationFemale, passengerDepthDeviationFemale));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE,
					oldPassengerAggressiveMoodShare, passengerAggressiveMoodShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatInterferenceProcessTimeMean() {
		return seatInterferenceProcessTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceProcessTimeMean(double newSeatInterferenceProcessTimeMean) {
		double oldSeatInterferenceProcessTimeMean = seatInterferenceProcessTimeMean;
		seatInterferenceProcessTimeMean = newSeatInterferenceProcessTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN,
					oldSeatInterferenceProcessTimeMean, seatInterferenceProcessTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatInterferenceProcessTimeDeviation() {
		return seatInterferenceProcessTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceProcessTimeDeviation(double newSeatInterferenceProcessTimeDeviation) {
		double oldSeatInterferenceProcessTimeDeviation = seatInterferenceProcessTimeDeviation;
		seatInterferenceProcessTimeDeviation = newSeatInterferenceProcessTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION,
					oldSeatInterferenceProcessTimeDeviation, seatInterferenceProcessTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatInterferenceProcessTimeFoldingSeatMean() {
		return seatInterferenceProcessTimeFoldingSeatMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceProcessTimeFoldingSeatMean(double newSeatInterferenceProcessTimeFoldingSeatMean) {
		double oldSeatInterferenceProcessTimeFoldingSeatMean = seatInterferenceProcessTimeFoldingSeatMean;
		seatInterferenceProcessTimeFoldingSeatMean = newSeatInterferenceProcessTimeFoldingSeatMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN,
					oldSeatInterferenceProcessTimeFoldingSeatMean, seatInterferenceProcessTimeFoldingSeatMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatInterferenceProcessTimeFoldingSeatDeviation() {
		return seatInterferenceProcessTimeFoldingSeatDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceProcessTimeFoldingSeatDeviation(
			double newSeatInterferenceProcessTimeFoldingSeatDeviation) {
		double oldSeatInterferenceProcessTimeFoldingSeatDeviation = seatInterferenceProcessTimeFoldingSeatDeviation;
		seatInterferenceProcessTimeFoldingSeatDeviation = newSeatInterferenceProcessTimeFoldingSeatDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION,
					oldSeatInterferenceProcessTimeFoldingSeatDeviation,
					seatInterferenceProcessTimeFoldingSeatDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassivePassengerWaitingTimeAfterCollision() {
		return passivePassengerWaitingTimeAfterCollision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassivePassengerWaitingTimeAfterCollision(double newPassivePassengerWaitingTimeAfterCollision) {
		double oldPassivePassengerWaitingTimeAfterCollision = passivePassengerWaitingTimeAfterCollision;
		passivePassengerWaitingTimeAfterCollision = newPassivePassengerWaitingTimeAfterCollision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION,
					oldPassivePassengerWaitingTimeAfterCollision, passivePassengerWaitingTimeAfterCollision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSeatInterferenceMultiPassengerFactor() {
		return seatInterferenceMultiPassengerFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeatInterferenceMultiPassengerFactor(double newSeatInterferenceMultiPassengerFactor) {
		double oldSeatInterferenceMultiPassengerFactor = seatInterferenceMultiPassengerFactor;
		seatInterferenceMultiPassengerFactor = newSeatInterferenceMultiPassengerFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR,
					oldSeatInterferenceMultiPassengerFactor, seatInterferenceMultiPassengerFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorSelection getDoorSelection() {
		return doorSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorSelection(DoorSelection newDoorSelection) {
		DoorSelection oldDoorSelection = doorSelection;
		doorSelection = newDoorSelection == null ? DOOR_SELECTION_EDEFAULT : newDoorSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.PASSENGER_PROPERTIES__DOOR_SELECTION,
					oldDoorSelection, doorSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGroupPercentage() {
		return groupPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupPercentage(double newGroupPercentage) {
		double oldGroupPercentage = groupPercentage;
		groupPercentage = newGroupPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__GROUP_PERCENTAGE, oldGroupPercentage, groupPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPoint> getAgeSpeedDependency() {
		if (ageSpeedDependency == null) {
			ageSpeedDependency = new EObjectContainmentEList<EPoint>(EPoint.class, this,
					SettingsPackage.PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY);
		}
		return ageSpeedDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPoint> getAgeDistribution() {
		if (ageDistribution == null) {
			ageDistribution = new EObjectContainmentEList<EPoint>(EPoint.class, this,
					SettingsPackage.PASSENGER_PROPERTIES__AGE_DISTRIBUTION);
		}
		return ageDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeWidthMeanMale() {
		return passengerKneeWidthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeWidthMeanMale(double newPassengerKneeWidthMeanMale) {
		double oldPassengerKneeWidthMeanMale = passengerKneeWidthMeanMale;
		passengerKneeWidthMeanMale = newPassengerKneeWidthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE, oldPassengerKneeWidthMeanMale,
					passengerKneeWidthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeWidthDeviationMale() {
		return passengerKneeWidthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeWidthDeviationMale(double newPassengerKneeWidthDeviationMale) {
		double oldPassengerKneeWidthDeviationMale = passengerKneeWidthDeviationMale;
		passengerKneeWidthDeviationMale = newPassengerKneeWidthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE,
					oldPassengerKneeWidthDeviationMale, passengerKneeWidthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeWidthMeanFemale() {
		return passengerKneeWidthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeWidthMeanFemale(double newPassengerKneeWidthMeanFemale) {
		double oldPassengerKneeWidthMeanFemale = passengerKneeWidthMeanFemale;
		passengerKneeWidthMeanFemale = newPassengerKneeWidthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE,
					oldPassengerKneeWidthMeanFemale, passengerKneeWidthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeWidthDeviationFemale() {
		return passengerKneeWidthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeWidthDeviationFemale(double newPassengerKneeWidthDeviationFemale) {
		double oldPassengerKneeWidthDeviationFemale = passengerKneeWidthDeviationFemale;
		passengerKneeWidthDeviationFemale = newPassengerKneeWidthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE,
					oldPassengerKneeWidthDeviationFemale, passengerKneeWidthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeDepthMeanMale() {
		return passengerKneeDepthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeDepthMeanMale(double newPassengerKneeDepthMeanMale) {
		double oldPassengerKneeDepthMeanMale = passengerKneeDepthMeanMale;
		passengerKneeDepthMeanMale = newPassengerKneeDepthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE, oldPassengerKneeDepthMeanMale,
					passengerKneeDepthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeDepthDeviationMale() {
		return passengerKneeDepthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeDepthDeviationMale(double newPassengerKneeDepthDeviationMale) {
		double oldPassengerKneeDepthDeviationMale = passengerKneeDepthDeviationMale;
		passengerKneeDepthDeviationMale = newPassengerKneeDepthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE,
					oldPassengerKneeDepthDeviationMale, passengerKneeDepthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeDepthMeanFemale() {
		return passengerKneeDepthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeDepthMeanFemale(double newPassengerKneeDepthMeanFemale) {
		double oldPassengerKneeDepthMeanFemale = passengerKneeDepthMeanFemale;
		passengerKneeDepthMeanFemale = newPassengerKneeDepthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE,
					oldPassengerKneeDepthMeanFemale, passengerKneeDepthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeDepthDeviationFemale() {
		return passengerKneeDepthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeDepthDeviationFemale(double newPassengerKneeDepthDeviationFemale) {
		double oldPassengerKneeDepthDeviationFemale = passengerKneeDepthDeviationFemale;
		passengerKneeDepthDeviationFemale = newPassengerKneeDepthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE,
					oldPassengerKneeDepthDeviationFemale, passengerKneeDepthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeHeightMeanMale() {
		return passengerKneeHeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeHeightMeanMale(double newPassengerKneeHeightMeanMale) {
		double oldPassengerKneeHeightMeanMale = passengerKneeHeightMeanMale;
		passengerKneeHeightMeanMale = newPassengerKneeHeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE,
					oldPassengerKneeHeightMeanMale, passengerKneeHeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeHeightDeviationMale() {
		return passengerKneeHeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeHeightDeviationMale(double newPassengerKneeHeightDeviationMale) {
		double oldPassengerKneeHeightDeviationMale = passengerKneeHeightDeviationMale;
		passengerKneeHeightDeviationMale = newPassengerKneeHeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE,
					oldPassengerKneeHeightDeviationMale, passengerKneeHeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeHeightMeanFemale() {
		return passengerKneeHeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeHeightMeanFemale(double newPassengerKneeHeightMeanFemale) {
		double oldPassengerKneeHeightMeanFemale = passengerKneeHeightMeanFemale;
		passengerKneeHeightMeanFemale = newPassengerKneeHeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE,
					oldPassengerKneeHeightMeanFemale, passengerKneeHeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerKneeHeightDeviationFemale() {
		return passengerKneeHeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerKneeHeightDeviationFemale(double newPassengerKneeHeightDeviationFemale) {
		double oldPassengerKneeHeightDeviationFemale = passengerKneeHeightDeviationFemale;
		passengerKneeHeightDeviationFemale = newPassengerKneeHeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE,
					oldPassengerKneeHeightDeviationFemale, passengerKneeHeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipWidthMeanMale() {
		return passengerHipWidthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipWidthMeanMale(double newPassengerHipWidthMeanMale) {
		double oldPassengerHipWidthMeanMale = passengerHipWidthMeanMale;
		passengerHipWidthMeanMale = newPassengerHipWidthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE, oldPassengerHipWidthMeanMale,
					passengerHipWidthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipWidthDeviationMale() {
		return passengerHipWidthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipWidthDeviationMale(double newPassengerHipWidthDeviationMale) {
		double oldPassengerHipWidthDeviationMale = passengerHipWidthDeviationMale;
		passengerHipWidthDeviationMale = newPassengerHipWidthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE,
					oldPassengerHipWidthDeviationMale, passengerHipWidthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipWidthMeanFemale() {
		return passengerHipWidthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipWidthMeanFemale(double newPassengerHipWidthMeanFemale) {
		double oldPassengerHipWidthMeanFemale = passengerHipWidthMeanFemale;
		passengerHipWidthMeanFemale = newPassengerHipWidthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE,
					oldPassengerHipWidthMeanFemale, passengerHipWidthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipWidthDeviationFemale() {
		return passengerHipWidthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipWidthDeviationFemale(double newPassengerHipWidthDeviationFemale) {
		double oldPassengerHipWidthDeviationFemale = passengerHipWidthDeviationFemale;
		passengerHipWidthDeviationFemale = newPassengerHipWidthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE,
					oldPassengerHipWidthDeviationFemale, passengerHipWidthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipDepthMeanMale() {
		return passengerHipDepthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipDepthMeanMale(double newPassengerHipDepthMeanMale) {
		double oldPassengerHipDepthMeanMale = passengerHipDepthMeanMale;
		passengerHipDepthMeanMale = newPassengerHipDepthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE, oldPassengerHipDepthMeanMale,
					passengerHipDepthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipDepthDeviationMale() {
		return passengerHipDepthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipDepthDeviationMale(double newPassengerHipDepthDeviationMale) {
		double oldPassengerHipDepthDeviationMale = passengerHipDepthDeviationMale;
		passengerHipDepthDeviationMale = newPassengerHipDepthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE,
					oldPassengerHipDepthDeviationMale, passengerHipDepthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipDepthMeanFemale() {
		return passengerHipDepthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipDepthMeanFemale(double newPassengerHipDepthMeanFemale) {
		double oldPassengerHipDepthMeanFemale = passengerHipDepthMeanFemale;
		passengerHipDepthMeanFemale = newPassengerHipDepthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE,
					oldPassengerHipDepthMeanFemale, passengerHipDepthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipDepthDeviationFemale() {
		return passengerHipDepthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipDepthDeviationFemale(double newPassengerHipDepthDeviationFemale) {
		double oldPassengerHipDepthDeviationFemale = passengerHipDepthDeviationFemale;
		passengerHipDepthDeviationFemale = newPassengerHipDepthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE,
					oldPassengerHipDepthDeviationFemale, passengerHipDepthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipHeightMeanMale() {
		return passengerHipHeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipHeightMeanMale(double newPassengerHipHeightMeanMale) {
		double oldPassengerHipHeightMeanMale = passengerHipHeightMeanMale;
		passengerHipHeightMeanMale = newPassengerHipHeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE, oldPassengerHipHeightMeanMale,
					passengerHipHeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipHeightDeviationMale() {
		return passengerHipHeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipHeightDeviationMale(double newPassengerHipHeightDeviationMale) {
		double oldPassengerHipHeightDeviationMale = passengerHipHeightDeviationMale;
		passengerHipHeightDeviationMale = newPassengerHipHeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE,
					oldPassengerHipHeightDeviationMale, passengerHipHeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipHeightMeanFemale() {
		return passengerHipHeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipHeightMeanFemale(double newPassengerHipHeightMeanFemale) {
		double oldPassengerHipHeightMeanFemale = passengerHipHeightMeanFemale;
		passengerHipHeightMeanFemale = newPassengerHipHeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE,
					oldPassengerHipHeightMeanFemale, passengerHipHeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerHipHeightDeviationFemale() {
		return passengerHipHeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerHipHeightDeviationFemale(double newPassengerHipHeightDeviationFemale) {
		double oldPassengerHipHeightDeviationFemale = passengerHipHeightDeviationFemale;
		passengerHipHeightDeviationFemale = newPassengerHipHeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE,
					oldPassengerHipHeightDeviationFemale, passengerHipHeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderWidthMeanMale() {
		return passengerShoulderWidthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderWidthMeanMale(double newPassengerShoulderWidthMeanMale) {
		double oldPassengerShoulderWidthMeanMale = passengerShoulderWidthMeanMale;
		passengerShoulderWidthMeanMale = newPassengerShoulderWidthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE,
					oldPassengerShoulderWidthMeanMale, passengerShoulderWidthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderWidthDeviationMale() {
		return passengerShoulderWidthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderWidthDeviationMale(double newPassengerShoulderWidthDeviationMale) {
		double oldPassengerShoulderWidthDeviationMale = passengerShoulderWidthDeviationMale;
		passengerShoulderWidthDeviationMale = newPassengerShoulderWidthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE,
					oldPassengerShoulderWidthDeviationMale, passengerShoulderWidthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderWidthMeanFemale() {
		return passengerShoulderWidthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderWidthMeanFemale(double newPassengerShoulderWidthMeanFemale) {
		double oldPassengerShoulderWidthMeanFemale = passengerShoulderWidthMeanFemale;
		passengerShoulderWidthMeanFemale = newPassengerShoulderWidthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE,
					oldPassengerShoulderWidthMeanFemale, passengerShoulderWidthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderWidthDeviationFemale() {
		return passengerShoulderWidthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderWidthDeviationFemale(double newPassengerShoulderWidthDeviationFemale) {
		double oldPassengerShoulderWidthDeviationFemale = passengerShoulderWidthDeviationFemale;
		passengerShoulderWidthDeviationFemale = newPassengerShoulderWidthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE,
					oldPassengerShoulderWidthDeviationFemale, passengerShoulderWidthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderDepthMeanMale() {
		return passengerShoulderDepthMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderDepthMeanMale(double newPassengerShoulderDepthMeanMale) {
		double oldPassengerShoulderDepthMeanMale = passengerShoulderDepthMeanMale;
		passengerShoulderDepthMeanMale = newPassengerShoulderDepthMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE,
					oldPassengerShoulderDepthMeanMale, passengerShoulderDepthMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderDepthDeviationMale() {
		return passengerShoulderDepthDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderDepthDeviationMale(double newPassengerShoulderDepthDeviationMale) {
		double oldPassengerShoulderDepthDeviationMale = passengerShoulderDepthDeviationMale;
		passengerShoulderDepthDeviationMale = newPassengerShoulderDepthDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE,
					oldPassengerShoulderDepthDeviationMale, passengerShoulderDepthDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderDepthMeanFemale() {
		return passengerShoulderDepthMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderDepthMeanFemale(double newPassengerShoulderDepthMeanFemale) {
		double oldPassengerShoulderDepthMeanFemale = passengerShoulderDepthMeanFemale;
		passengerShoulderDepthMeanFemale = newPassengerShoulderDepthMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE,
					oldPassengerShoulderDepthMeanFemale, passengerShoulderDepthMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderDepthDeviationFemale() {
		return passengerShoulderDepthDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderDepthDeviationFemale(double newPassengerShoulderDepthDeviationFemale) {
		double oldPassengerShoulderDepthDeviationFemale = passengerShoulderDepthDeviationFemale;
		passengerShoulderDepthDeviationFemale = newPassengerShoulderDepthDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE,
					oldPassengerShoulderDepthDeviationFemale, passengerShoulderDepthDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderHeightMeanMale() {
		return passengerShoulderHeightMeanMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderHeightMeanMale(double newPassengerShoulderHeightMeanMale) {
		double oldPassengerShoulderHeightMeanMale = passengerShoulderHeightMeanMale;
		passengerShoulderHeightMeanMale = newPassengerShoulderHeightMeanMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE,
					oldPassengerShoulderHeightMeanMale, passengerShoulderHeightMeanMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderHeightDeviationMale() {
		return passengerShoulderHeightDeviationMale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderHeightDeviationMale(double newPassengerShoulderHeightDeviationMale) {
		double oldPassengerShoulderHeightDeviationMale = passengerShoulderHeightDeviationMale;
		passengerShoulderHeightDeviationMale = newPassengerShoulderHeightDeviationMale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE,
					oldPassengerShoulderHeightDeviationMale, passengerShoulderHeightDeviationMale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderHeightMeanFemale() {
		return passengerShoulderHeightMeanFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderHeightMeanFemale(double newPassengerShoulderHeightMeanFemale) {
		double oldPassengerShoulderHeightMeanFemale = passengerShoulderHeightMeanFemale;
		passengerShoulderHeightMeanFemale = newPassengerShoulderHeightMeanFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE,
					oldPassengerShoulderHeightMeanFemale, passengerShoulderHeightMeanFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPassengerShoulderHeightDeviationFemale() {
		return passengerShoulderHeightDeviationFemale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassengerShoulderHeightDeviationFemale(double newPassengerShoulderHeightDeviationFemale) {
		double oldPassengerShoulderHeightDeviationFemale = passengerShoulderHeightDeviationFemale;
		passengerShoulderHeightDeviationFemale = newPassengerShoulderHeightDeviationFemale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE,
					oldPassengerShoulderHeightDeviationFemale, passengerShoulderHeightDeviationFemale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY:
			return ((InternalEList<?>) getAgeSpeedDependency()).basicRemove(otherEnd, msgs);
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_DISTRIBUTION:
			return ((InternalEList<?>) getAgeDistribution()).basicRemove(otherEnd, msgs);
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
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
			return getPassengerWidthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
			return getPassengerWidthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
			return getPassengerWeightMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
			return getPassengerWeightDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
			return getPassengerHeightMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
			return getPassengerHeightDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
			return getPassengerDepthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
			return getPassengerDepthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
			return getPassengerWidthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
			return getPassengerWidthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
			return getPassengerWeightMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
			return getPassengerWeightDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
			return getPassengerHeightMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
			return getPassengerHeightDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
			return getPassengerDepthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
			return getPassengerDepthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
			return getPassengerAggressiveMoodShare();
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			return getSeatInterferenceProcessTimeMean();
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			return getSeatInterferenceProcessTimeDeviation();
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN:
			return getSeatInterferenceProcessTimeFoldingSeatMean();
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION:
			return getSeatInterferenceProcessTimeFoldingSeatDeviation();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION:
			return getPassivePassengerWaitingTimeAfterCollision();
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR:
			return getSeatInterferenceMultiPassengerFactor();
		case SettingsPackage.PASSENGER_PROPERTIES__DOOR_SELECTION:
			return getDoorSelection();
		case SettingsPackage.PASSENGER_PROPERTIES__GROUP_PERCENTAGE:
			return getGroupPercentage();
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY:
			return getAgeSpeedDependency();
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_DISTRIBUTION:
			return getAgeDistribution();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE:
			return getPassengerKneeWidthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE:
			return getPassengerKneeWidthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE:
			return getPassengerKneeWidthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE:
			return getPassengerKneeWidthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE:
			return getPassengerKneeDepthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE:
			return getPassengerKneeDepthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE:
			return getPassengerKneeDepthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE:
			return getPassengerKneeDepthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE:
			return getPassengerKneeHeightMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE:
			return getPassengerKneeHeightDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE:
			return getPassengerKneeHeightMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE:
			return getPassengerKneeHeightDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE:
			return getPassengerHipWidthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE:
			return getPassengerHipWidthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE:
			return getPassengerHipWidthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE:
			return getPassengerHipWidthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE:
			return getPassengerHipDepthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE:
			return getPassengerHipDepthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE:
			return getPassengerHipDepthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE:
			return getPassengerHipDepthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE:
			return getPassengerHipHeightMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE:
			return getPassengerHipHeightDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE:
			return getPassengerHipHeightMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE:
			return getPassengerHipHeightDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE:
			return getPassengerShoulderWidthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE:
			return getPassengerShoulderWidthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE:
			return getPassengerShoulderWidthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE:
			return getPassengerShoulderWidthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE:
			return getPassengerShoulderDepthMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE:
			return getPassengerShoulderDepthDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE:
			return getPassengerShoulderDepthMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE:
			return getPassengerShoulderDepthDeviationFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE:
			return getPassengerShoulderHeightMeanMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE:
			return getPassengerShoulderHeightDeviationMale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE:
			return getPassengerShoulderHeightMeanFemale();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE:
			return getPassengerShoulderHeightDeviationFemale();
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
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
			setPassengerWidthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
			setPassengerWidthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
			setPassengerWeightMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
			setPassengerWeightDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
			setPassengerHeightMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
			setPassengerHeightDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
			setPassengerDepthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
			setPassengerDepthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
			setPassengerWidthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
			setPassengerWidthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
			setPassengerWeightMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
			setPassengerWeightDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
			setPassengerHeightMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
			setPassengerHeightDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
			setPassengerDepthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
			setPassengerDepthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
			setPassengerAggressiveMoodShare((Integer) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			setSeatInterferenceProcessTimeMean((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			setSeatInterferenceProcessTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN:
			setSeatInterferenceProcessTimeFoldingSeatMean((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION:
			setSeatInterferenceProcessTimeFoldingSeatDeviation((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION:
			setPassivePassengerWaitingTimeAfterCollision((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR:
			setSeatInterferenceMultiPassengerFactor((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__DOOR_SELECTION:
			setDoorSelection((DoorSelection) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__GROUP_PERCENTAGE:
			setGroupPercentage((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY:
			getAgeSpeedDependency().clear();
			getAgeSpeedDependency().addAll((Collection<? extends EPoint>) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_DISTRIBUTION:
			getAgeDistribution().clear();
			getAgeDistribution().addAll((Collection<? extends EPoint>) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE:
			setPassengerKneeWidthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE:
			setPassengerKneeWidthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE:
			setPassengerKneeWidthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE:
			setPassengerKneeWidthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE:
			setPassengerKneeDepthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE:
			setPassengerKneeDepthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE:
			setPassengerKneeDepthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE:
			setPassengerKneeDepthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE:
			setPassengerKneeHeightMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE:
			setPassengerKneeHeightDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE:
			setPassengerKneeHeightMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE:
			setPassengerKneeHeightDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE:
			setPassengerHipWidthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE:
			setPassengerHipWidthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE:
			setPassengerHipWidthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE:
			setPassengerHipWidthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE:
			setPassengerHipDepthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE:
			setPassengerHipDepthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE:
			setPassengerHipDepthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE:
			setPassengerHipDepthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE:
			setPassengerHipHeightMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE:
			setPassengerHipHeightDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE:
			setPassengerHipHeightMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE:
			setPassengerHipHeightDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE:
			setPassengerShoulderWidthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE:
			setPassengerShoulderWidthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE:
			setPassengerShoulderWidthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE:
			setPassengerShoulderWidthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE:
			setPassengerShoulderDepthMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE:
			setPassengerShoulderDepthDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE:
			setPassengerShoulderDepthMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE:
			setPassengerShoulderDepthDeviationFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE:
			setPassengerShoulderHeightMeanMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE:
			setPassengerShoulderHeightDeviationMale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE:
			setPassengerShoulderHeightMeanFemale((Double) newValue);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE:
			setPassengerShoulderHeightDeviationFemale((Double) newValue);
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
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
			setPassengerWidthMeanMale(PASSENGER_WIDTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
			setPassengerWidthDeviationMale(PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
			setPassengerWeightMeanMale(PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
			setPassengerWeightDeviationMale(PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
			setPassengerHeightMeanMale(PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
			setPassengerHeightDeviationMale(PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
			setPassengerDepthMeanMale(PASSENGER_DEPTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
			setPassengerDepthDeviationMale(PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
			setPassengerWidthMeanFemale(PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
			setPassengerWidthDeviationFemale(PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
			setPassengerWeightMeanFemale(PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
			setPassengerWeightDeviationFemale(PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
			setPassengerHeightMeanFemale(PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
			setPassengerHeightDeviationFemale(PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
			setPassengerDepthMeanFemale(PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
			setPassengerDepthDeviationFemale(PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
			setPassengerAggressiveMoodShare(PASSENGER_AGGRESSIVE_MOOD_SHARE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			setSeatInterferenceProcessTimeMean(SEAT_INTERFERENCE_PROCESS_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			setSeatInterferenceProcessTimeDeviation(SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN:
			setSeatInterferenceProcessTimeFoldingSeatMean(SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION:
			setSeatInterferenceProcessTimeFoldingSeatDeviation(
					SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION:
			setPassivePassengerWaitingTimeAfterCollision(PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR:
			setSeatInterferenceMultiPassengerFactor(SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__DOOR_SELECTION:
			setDoorSelection(DOOR_SELECTION_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__GROUP_PERCENTAGE:
			setGroupPercentage(GROUP_PERCENTAGE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY:
			getAgeSpeedDependency().clear();
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_DISTRIBUTION:
			getAgeDistribution().clear();
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE:
			setPassengerKneeWidthMeanMale(PASSENGER_KNEE_WIDTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE:
			setPassengerKneeWidthDeviationMale(PASSENGER_KNEE_WIDTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE:
			setPassengerKneeWidthMeanFemale(PASSENGER_KNEE_WIDTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE:
			setPassengerKneeWidthDeviationFemale(PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE:
			setPassengerKneeDepthMeanMale(PASSENGER_KNEE_DEPTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE:
			setPassengerKneeDepthDeviationMale(PASSENGER_KNEE_DEPTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE:
			setPassengerKneeDepthMeanFemale(PASSENGER_KNEE_DEPTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE:
			setPassengerKneeDepthDeviationFemale(PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE:
			setPassengerKneeHeightMeanMale(PASSENGER_KNEE_HEIGHT_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE:
			setPassengerKneeHeightDeviationMale(PASSENGER_KNEE_HEIGHT_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE:
			setPassengerKneeHeightMeanFemale(PASSENGER_KNEE_HEIGHT_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE:
			setPassengerKneeHeightDeviationFemale(PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE:
			setPassengerHipWidthMeanMale(PASSENGER_HIP_WIDTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE:
			setPassengerHipWidthDeviationMale(PASSENGER_HIP_WIDTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE:
			setPassengerHipWidthMeanFemale(PASSENGER_HIP_WIDTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE:
			setPassengerHipWidthDeviationFemale(PASSENGER_HIP_WIDTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE:
			setPassengerHipDepthMeanMale(PASSENGER_HIP_DEPTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE:
			setPassengerHipDepthDeviationMale(PASSENGER_HIP_DEPTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE:
			setPassengerHipDepthMeanFemale(PASSENGER_HIP_DEPTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE:
			setPassengerHipDepthDeviationFemale(PASSENGER_HIP_DEPTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE:
			setPassengerHipHeightMeanMale(PASSENGER_HIP_HEIGHT_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE:
			setPassengerHipHeightDeviationMale(PASSENGER_HIP_HEIGHT_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE:
			setPassengerHipHeightMeanFemale(PASSENGER_HIP_HEIGHT_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE:
			setPassengerHipHeightDeviationFemale(PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE:
			setPassengerShoulderWidthMeanMale(PASSENGER_SHOULDER_WIDTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE:
			setPassengerShoulderWidthDeviationMale(PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE:
			setPassengerShoulderWidthMeanFemale(PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE:
			setPassengerShoulderWidthDeviationFemale(PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE:
			setPassengerShoulderDepthMeanMale(PASSENGER_SHOULDER_DEPTH_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE:
			setPassengerShoulderDepthDeviationMale(PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE:
			setPassengerShoulderDepthMeanFemale(PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE:
			setPassengerShoulderDepthDeviationFemale(PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE:
			setPassengerShoulderHeightMeanMale(PASSENGER_SHOULDER_HEIGHT_MEAN_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE:
			setPassengerShoulderHeightDeviationMale(PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE:
			setPassengerShoulderHeightMeanFemale(PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE_EDEFAULT);
			return;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE:
			setPassengerShoulderHeightDeviationFemale(PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE_EDEFAULT);
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
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
			return passengerWidthMeanMale != PASSENGER_WIDTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
			return passengerWidthDeviationMale != PASSENGER_WIDTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
			return passengerWeightMeanMale != PASSENGER_WEIGHT_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
			return passengerWeightDeviationMale != PASSENGER_WEIGHT_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
			return passengerHeightMeanMale != PASSENGER_HEIGHT_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
			return passengerHeightDeviationMale != PASSENGER_HEIGHT_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
			return passengerDepthMeanMale != PASSENGER_DEPTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
			return passengerDepthDeviationMale != PASSENGER_DEPTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
			return passengerWidthMeanFemale != PASSENGER_WIDTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
			return passengerWidthDeviationFemale != PASSENGER_WIDTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
			return passengerWeightMeanFemale != PASSENGER_WEIGHT_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
			return passengerWeightDeviationFemale != PASSENGER_WEIGHT_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
			return passengerHeightMeanFemale != PASSENGER_HEIGHT_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
			return passengerHeightDeviationFemale != PASSENGER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
			return passengerDepthMeanFemale != PASSENGER_DEPTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
			return passengerDepthDeviationFemale != PASSENGER_DEPTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
			return passengerAggressiveMoodShare != PASSENGER_AGGRESSIVE_MOOD_SHARE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			return seatInterferenceProcessTimeMean != SEAT_INTERFERENCE_PROCESS_TIME_MEAN_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			return seatInterferenceProcessTimeDeviation != SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN:
			return seatInterferenceProcessTimeFoldingSeatMean != SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION:
			return seatInterferenceProcessTimeFoldingSeatDeviation != SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION:
			return passivePassengerWaitingTimeAfterCollision != PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR:
			return seatInterferenceMultiPassengerFactor != SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__DOOR_SELECTION:
			return doorSelection != DOOR_SELECTION_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__GROUP_PERCENTAGE:
			return groupPercentage != GROUP_PERCENTAGE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY:
			return ageSpeedDependency != null && !ageSpeedDependency.isEmpty();
		case SettingsPackage.PASSENGER_PROPERTIES__AGE_DISTRIBUTION:
			return ageDistribution != null && !ageDistribution.isEmpty();
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE:
			return passengerKneeWidthMeanMale != PASSENGER_KNEE_WIDTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE:
			return passengerKneeWidthDeviationMale != PASSENGER_KNEE_WIDTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE:
			return passengerKneeWidthMeanFemale != PASSENGER_KNEE_WIDTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE:
			return passengerKneeWidthDeviationFemale != PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE:
			return passengerKneeDepthMeanMale != PASSENGER_KNEE_DEPTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE:
			return passengerKneeDepthDeviationMale != PASSENGER_KNEE_DEPTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE:
			return passengerKneeDepthMeanFemale != PASSENGER_KNEE_DEPTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE:
			return passengerKneeDepthDeviationFemale != PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE:
			return passengerKneeHeightMeanMale != PASSENGER_KNEE_HEIGHT_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE:
			return passengerKneeHeightDeviationMale != PASSENGER_KNEE_HEIGHT_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE:
			return passengerKneeHeightMeanFemale != PASSENGER_KNEE_HEIGHT_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE:
			return passengerKneeHeightDeviationFemale != PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE:
			return passengerHipWidthMeanMale != PASSENGER_HIP_WIDTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE:
			return passengerHipWidthDeviationMale != PASSENGER_HIP_WIDTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE:
			return passengerHipWidthMeanFemale != PASSENGER_HIP_WIDTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE:
			return passengerHipWidthDeviationFemale != PASSENGER_HIP_WIDTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE:
			return passengerHipDepthMeanMale != PASSENGER_HIP_DEPTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE:
			return passengerHipDepthDeviationMale != PASSENGER_HIP_DEPTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE:
			return passengerHipDepthMeanFemale != PASSENGER_HIP_DEPTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE:
			return passengerHipDepthDeviationFemale != PASSENGER_HIP_DEPTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE:
			return passengerHipHeightMeanMale != PASSENGER_HIP_HEIGHT_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE:
			return passengerHipHeightDeviationMale != PASSENGER_HIP_HEIGHT_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE:
			return passengerHipHeightMeanFemale != PASSENGER_HIP_HEIGHT_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE:
			return passengerHipHeightDeviationFemale != PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE:
			return passengerShoulderWidthMeanMale != PASSENGER_SHOULDER_WIDTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE:
			return passengerShoulderWidthDeviationMale != PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE:
			return passengerShoulderWidthMeanFemale != PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE:
			return passengerShoulderWidthDeviationFemale != PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE:
			return passengerShoulderDepthMeanMale != PASSENGER_SHOULDER_DEPTH_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE:
			return passengerShoulderDepthDeviationMale != PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE:
			return passengerShoulderDepthMeanFemale != PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE:
			return passengerShoulderDepthDeviationFemale != PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE:
			return passengerShoulderHeightMeanMale != PASSENGER_SHOULDER_HEIGHT_MEAN_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE:
			return passengerShoulderHeightDeviationMale != PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE:
			return passengerShoulderHeightMeanFemale != PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE_EDEFAULT;
		case SettingsPackage.PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE:
			return passengerShoulderHeightDeviationFemale != PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
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
		result.append(", seatInterferenceProcessTimeMean: ");
		result.append(seatInterferenceProcessTimeMean);
		result.append(", seatInterferenceProcessTimeDeviation: ");
		result.append(seatInterferenceProcessTimeDeviation);
		result.append(", seatInterferenceProcessTimeFoldingSeatMean: ");
		result.append(seatInterferenceProcessTimeFoldingSeatMean);
		result.append(", seatInterferenceProcessTimeFoldingSeatDeviation: ");
		result.append(seatInterferenceProcessTimeFoldingSeatDeviation);
		result.append(", passivePassengerWaitingTimeAfterCollision: ");
		result.append(passivePassengerWaitingTimeAfterCollision);
		result.append(", seatInterferenceMultiPassengerFactor: ");
		result.append(seatInterferenceMultiPassengerFactor);
		result.append(", doorSelection: ");
		result.append(doorSelection);
		result.append(", groupPercentage: ");
		result.append(groupPercentage);
		result.append(", passengerKneeWidthMeanMale: ");
		result.append(passengerKneeWidthMeanMale);
		result.append(", passengerKneeWidthDeviationMale: ");
		result.append(passengerKneeWidthDeviationMale);
		result.append(", passengerKneeWidthMeanFemale: ");
		result.append(passengerKneeWidthMeanFemale);
		result.append(", passengerKneeWidthDeviationFemale: ");
		result.append(passengerKneeWidthDeviationFemale);
		result.append(", passengerKneeDepthMeanMale: ");
		result.append(passengerKneeDepthMeanMale);
		result.append(", passengerKneeDepthDeviationMale: ");
		result.append(passengerKneeDepthDeviationMale);
		result.append(", passengerKneeDepthMeanFemale: ");
		result.append(passengerKneeDepthMeanFemale);
		result.append(", passengerKneeDepthDeviationFemale: ");
		result.append(passengerKneeDepthDeviationFemale);
		result.append(", passengerKneeHeightMeanMale: ");
		result.append(passengerKneeHeightMeanMale);
		result.append(", passengerKneeHeightDeviationMale: ");
		result.append(passengerKneeHeightDeviationMale);
		result.append(", passengerKneeHeightMeanFemale: ");
		result.append(passengerKneeHeightMeanFemale);
		result.append(", passengerKneeHeightDeviationFemale: ");
		result.append(passengerKneeHeightDeviationFemale);
		result.append(", passengerHipWidthMeanMale: ");
		result.append(passengerHipWidthMeanMale);
		result.append(", passengerHipWidthDeviationMale: ");
		result.append(passengerHipWidthDeviationMale);
		result.append(", passengerHipWidthMeanFemale: ");
		result.append(passengerHipWidthMeanFemale);
		result.append(", passengerHipWidthDeviationFemale: ");
		result.append(passengerHipWidthDeviationFemale);
		result.append(", passengerHipDepthMeanMale: ");
		result.append(passengerHipDepthMeanMale);
		result.append(", passengerHipDepthDeviationMale: ");
		result.append(passengerHipDepthDeviationMale);
		result.append(", passengerHipDepthMeanFemale: ");
		result.append(passengerHipDepthMeanFemale);
		result.append(", passengerHipDepthDeviationFemale: ");
		result.append(passengerHipDepthDeviationFemale);
		result.append(", passengerHipHeightMeanMale: ");
		result.append(passengerHipHeightMeanMale);
		result.append(", passengerHipHeightDeviationMale: ");
		result.append(passengerHipHeightDeviationMale);
		result.append(", passengerHipHeightMeanFemale: ");
		result.append(passengerHipHeightMeanFemale);
		result.append(", passengerHipHeightDeviationFemale: ");
		result.append(passengerHipHeightDeviationFemale);
		result.append(", passengerShoulderWidthMeanMale: ");
		result.append(passengerShoulderWidthMeanMale);
		result.append(", passengerShoulderWidthDeviationMale: ");
		result.append(passengerShoulderWidthDeviationMale);
		result.append(", passengerShoulderWidthMeanFemale: ");
		result.append(passengerShoulderWidthMeanFemale);
		result.append(", passengerShoulderWidthDeviationFemale: ");
		result.append(passengerShoulderWidthDeviationFemale);
		result.append(", passengerShoulderDepthMeanMale: ");
		result.append(passengerShoulderDepthMeanMale);
		result.append(", passengerShoulderDepthDeviationMale: ");
		result.append(passengerShoulderDepthDeviationMale);
		result.append(", passengerShoulderDepthMeanFemale: ");
		result.append(passengerShoulderDepthMeanFemale);
		result.append(", passengerShoulderDepthDeviationFemale: ");
		result.append(passengerShoulderDepthDeviationFemale);
		result.append(", passengerShoulderHeightMeanMale: ");
		result.append(passengerShoulderHeightMeanMale);
		result.append(", passengerShoulderHeightDeviationMale: ");
		result.append(passengerShoulderHeightDeviationMale);
		result.append(", passengerShoulderHeightMeanFemale: ");
		result.append(passengerShoulderHeightMeanFemale);
		result.append(", passengerShoulderHeightDeviationFemale: ");
		result.append(passengerShoulderHeightDeviationFemale);
		result.append(')');
		return result.toString();
	}

} //PassengerPropertiesImpl
