/**
 */
package com.paxelerate.model.settings.impl;

import com.paxelerate.model.settings.LuggageProperties;
import com.paxelerate.model.settings.SettingsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getMaxNumberOfLuggageItemsPerPax <em>Max Number Of Luggage Items Per Pax</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getJacketStowTimeDeviation <em>Jacket Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getJacketStowTimeMean <em>Jacket Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getSmallBagStowTimeMean <em>Small Bag Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getSmallBagStowTimeDeviation <em>Small Bag Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getMediumBagStowTimeMean <em>Medium Bag Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getMediumBagStowTimeDeviation <em>Medium Bag Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLargeBagStowTimeMean <em>Large Bag Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLargeBagStowTimeDeviation <em>Large Bag Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getJacketVolume <em>Jacket Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getSmallBagVolume <em>Small Bag Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getMediumBagVolume <em>Medium Bag Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLargeBagVolume <em>Large Bag Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getJacketBulkiness <em>Jacket Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getSmallBagBulkiness <em>Small Bag Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getMediumBagBulkiness <em>Medium Bag Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLargeBagBulkiness <em>Large Bag Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getJacketWalkingSpeedFactor <em>Jacket Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getSmallBagWalkingSpeedFactor <em>Small Bag Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getMediumBagWalkingSpeedFactor <em>Medium Bag Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLargeBagWalkingSpeedFactor <em>Large Bag Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl#getLuggageStorageScaling <em>Luggage Storage Scaling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggagePropertiesImpl extends MinimalEObjectImpl.Container implements LuggageProperties {
	/**
	 * The default value of the '{@link #getMaxNumberOfLuggageItemsPerPax() <em>Max Number Of Luggage Items Per Pax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfLuggageItemsPerPax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaxNumberOfLuggageItemsPerPax() <em>Max Number Of Luggage Items Per Pax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfLuggageItemsPerPax()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberOfLuggageItemsPerPax = MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuggageStowDistanceFromSeatMean() <em>Luggage Stow Distance From Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowDistanceFromSeatMean()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN_EDEFAULT = 0.8;

	/**
	 * The cached value of the '{@link #getLuggageStowDistanceFromSeatMean() <em>Luggage Stow Distance From Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowDistanceFromSeatMean()
	 * @generated
	 * @ordered
	 */
	protected double luggageStowDistanceFromSeatMean = LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuggageStowDistanceFromSeatDeviation() <em>Luggage Stow Distance From Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowDistanceFromSeatDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getLuggageStowDistanceFromSeatDeviation() <em>Luggage Stow Distance From Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowDistanceFromSeatDeviation()
	 * @generated
	 * @ordered
	 */
	protected double luggageStowDistanceFromSeatDeviation = LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJacketStowTimeDeviation() <em>Jacket Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double JACKET_STOW_TIME_DEVIATION_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getJacketStowTimeDeviation() <em>Jacket Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double jacketStowTimeDeviation = JACKET_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJacketStowTimeMean() <em>Jacket Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double JACKET_STOW_TIME_MEAN_EDEFAULT = 7.0;

	/**
	 * The cached value of the '{@link #getJacketStowTimeMean() <em>Jacket Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double jacketStowTimeMean = JACKET_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBagStowTimeMean() <em>Small Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double SMALL_BAG_STOW_TIME_MEAN_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getSmallBagStowTimeMean() <em>Small Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double smallBagStowTimeMean = SMALL_BAG_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBagStowTimeDeviation() <em>Small Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double SMALL_BAG_STOW_TIME_DEVIATION_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getSmallBagStowTimeDeviation() <em>Small Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double smallBagStowTimeDeviation = SMALL_BAG_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBagStowTimeMean() <em>Medium Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double MEDIUM_BAG_STOW_TIME_MEAN_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getMediumBagStowTimeMean() <em>Medium Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double mediumBagStowTimeMean = MEDIUM_BAG_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBagStowTimeDeviation() <em>Medium Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double MEDIUM_BAG_STOW_TIME_DEVIATION_EDEFAULT = 7.0;

	/**
	 * The cached value of the '{@link #getMediumBagStowTimeDeviation() <em>Medium Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double mediumBagStowTimeDeviation = MEDIUM_BAG_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeBagStowTimeMean() <em>Large Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGE_BAG_STOW_TIME_MEAN_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getLargeBagStowTimeMean() <em>Large Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double largeBagStowTimeMean = LARGE_BAG_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeBagStowTimeDeviation() <em>Large Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGE_BAG_STOW_TIME_DEVIATION_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getLargeBagStowTimeDeviation() <em>Large Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double largeBagStowTimeDeviation = LARGE_BAG_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJacketVolume() <em>Jacket Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double JACKET_VOLUME_EDEFAULT = 0.05;

	/**
	 * The cached value of the '{@link #getJacketVolume() <em>Jacket Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketVolume()
	 * @generated
	 * @ordered
	 */
	protected double jacketVolume = JACKET_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBagVolume() <em>Small Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double SMALL_BAG_VOLUME_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getSmallBagVolume() <em>Small Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagVolume()
	 * @generated
	 * @ordered
	 */
	protected double smallBagVolume = SMALL_BAG_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBagVolume() <em>Medium Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double MEDIUM_BAG_VOLUME_EDEFAULT = 0.02;

	/**
	 * The cached value of the '{@link #getMediumBagVolume() <em>Medium Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagVolume()
	 * @generated
	 * @ordered
	 */
	protected double mediumBagVolume = MEDIUM_BAG_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeBagVolume() <em>Large Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGE_BAG_VOLUME_EDEFAULT = 0.04;

	/**
	 * The cached value of the '{@link #getLargeBagVolume() <em>Large Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagVolume()
	 * @generated
	 * @ordered
	 */
	protected double largeBagVolume = LARGE_BAG_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJacketBulkiness() <em>Jacket Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketBulkiness()
	 * @generated
	 * @ordered
	 */
	protected static final double JACKET_BULKINESS_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getJacketBulkiness() <em>Jacket Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketBulkiness()
	 * @generated
	 * @ordered
	 */
	protected double jacketBulkiness = JACKET_BULKINESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBagBulkiness() <em>Small Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagBulkiness()
	 * @generated
	 * @ordered
	 */
	protected static final double SMALL_BAG_BULKINESS_EDEFAULT = 1.15;

	/**
	 * The cached value of the '{@link #getSmallBagBulkiness() <em>Small Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagBulkiness()
	 * @generated
	 * @ordered
	 */
	protected double smallBagBulkiness = SMALL_BAG_BULKINESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBagBulkiness() <em>Medium Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagBulkiness()
	 * @generated
	 * @ordered
	 */
	protected static final double MEDIUM_BAG_BULKINESS_EDEFAULT = 1.3;

	/**
	 * The cached value of the '{@link #getMediumBagBulkiness() <em>Medium Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagBulkiness()
	 * @generated
	 * @ordered
	 */
	protected double mediumBagBulkiness = MEDIUM_BAG_BULKINESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeBagBulkiness() <em>Large Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagBulkiness()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGE_BAG_BULKINESS_EDEFAULT = 1.6;

	/**
	 * The cached value of the '{@link #getLargeBagBulkiness() <em>Large Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagBulkiness()
	 * @generated
	 * @ordered
	 */
	protected double largeBagBulkiness = LARGE_BAG_BULKINESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJacketWalkingSpeedFactor() <em>Jacket Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double JACKET_WALKING_SPEED_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getJacketWalkingSpeedFactor() <em>Jacket Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJacketWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double jacketWalkingSpeedFactor = JACKET_WALKING_SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallBagWalkingSpeedFactor() <em>Small Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double SMALL_BAG_WALKING_SPEED_FACTOR_EDEFAULT = 0.95;

	/**
	 * The cached value of the '{@link #getSmallBagWalkingSpeedFactor() <em>Small Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallBagWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double smallBagWalkingSpeedFactor = SMALL_BAG_WALKING_SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumBagWalkingSpeedFactor() <em>Medium Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double MEDIUM_BAG_WALKING_SPEED_FACTOR_EDEFAULT = 0.9;

	/**
	 * The cached value of the '{@link #getMediumBagWalkingSpeedFactor() <em>Medium Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumBagWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double mediumBagWalkingSpeedFactor = MEDIUM_BAG_WALKING_SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeBagWalkingSpeedFactor() <em>Large Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGE_BAG_WALKING_SPEED_FACTOR_EDEFAULT = 0.75;

	/**
	 * The cached value of the '{@link #getLargeBagWalkingSpeedFactor() <em>Large Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeBagWalkingSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected double largeBagWalkingSpeedFactor = LARGE_BAG_WALKING_SPEED_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuggageStorageScaling() <em>Luggage Storage Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStorageScaling()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STORAGE_SCALING_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getLuggageStorageScaling() <em>Luggage Storage Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStorageScaling()
	 * @generated
	 * @ordered
	 */
	protected double luggageStorageScaling = LUGGAGE_STORAGE_SCALING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuggagePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.LUGGAGE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberOfLuggageItemsPerPax() {
		return maxNumberOfLuggageItemsPerPax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfLuggageItemsPerPax(int newMaxNumberOfLuggageItemsPerPax) {
		int oldMaxNumberOfLuggageItemsPerPax = maxNumberOfLuggageItemsPerPax;
		maxNumberOfLuggageItemsPerPax = newMaxNumberOfLuggageItemsPerPax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX,
					oldMaxNumberOfLuggageItemsPerPax, maxNumberOfLuggageItemsPerPax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLuggageStowDistanceFromSeatMean() {
		return luggageStowDistanceFromSeatMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuggageStowDistanceFromSeatMean(double newLuggageStowDistanceFromSeatMean) {
		double oldLuggageStowDistanceFromSeatMean = luggageStowDistanceFromSeatMean;
		luggageStowDistanceFromSeatMean = newLuggageStowDistanceFromSeatMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN,
					oldLuggageStowDistanceFromSeatMean, luggageStowDistanceFromSeatMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLuggageStowDistanceFromSeatDeviation() {
		return luggageStowDistanceFromSeatDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuggageStowDistanceFromSeatDeviation(double newLuggageStowDistanceFromSeatDeviation) {
		double oldLuggageStowDistanceFromSeatDeviation = luggageStowDistanceFromSeatDeviation;
		luggageStowDistanceFromSeatDeviation = newLuggageStowDistanceFromSeatDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION,
					oldLuggageStowDistanceFromSeatDeviation, luggageStowDistanceFromSeatDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getJacketStowTimeDeviation() {
		return jacketStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJacketStowTimeDeviation(double newJacketStowTimeDeviation) {
		double oldJacketStowTimeDeviation = jacketStowTimeDeviation;
		jacketStowTimeDeviation = newJacketStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION, oldJacketStowTimeDeviation,
					jacketStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getJacketStowTimeMean() {
		return jacketStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJacketStowTimeMean(double newJacketStowTimeMean) {
		double oldJacketStowTimeMean = jacketStowTimeMean;
		jacketStowTimeMean = newJacketStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN, oldJacketStowTimeMean,
					jacketStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSmallBagStowTimeMean() {
		return smallBagStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBagStowTimeMean(double newSmallBagStowTimeMean) {
		double oldSmallBagStowTimeMean = smallBagStowTimeMean;
		smallBagStowTimeMean = newSmallBagStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN, oldSmallBagStowTimeMean,
					smallBagStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSmallBagStowTimeDeviation() {
		return smallBagStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBagStowTimeDeviation(double newSmallBagStowTimeDeviation) {
		double oldSmallBagStowTimeDeviation = smallBagStowTimeDeviation;
		smallBagStowTimeDeviation = newSmallBagStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION, oldSmallBagStowTimeDeviation,
					smallBagStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMediumBagStowTimeMean() {
		return mediumBagStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBagStowTimeMean(double newMediumBagStowTimeMean) {
		double oldMediumBagStowTimeMean = mediumBagStowTimeMean;
		mediumBagStowTimeMean = newMediumBagStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN, oldMediumBagStowTimeMean,
					mediumBagStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMediumBagStowTimeDeviation() {
		return mediumBagStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBagStowTimeDeviation(double newMediumBagStowTimeDeviation) {
		double oldMediumBagStowTimeDeviation = mediumBagStowTimeDeviation;
		mediumBagStowTimeDeviation = newMediumBagStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION, oldMediumBagStowTimeDeviation,
					mediumBagStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLargeBagStowTimeMean() {
		return largeBagStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeBagStowTimeMean(double newLargeBagStowTimeMean) {
		double oldLargeBagStowTimeMean = largeBagStowTimeMean;
		largeBagStowTimeMean = newLargeBagStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN, oldLargeBagStowTimeMean,
					largeBagStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLargeBagStowTimeDeviation() {
		return largeBagStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeBagStowTimeDeviation(double newLargeBagStowTimeDeviation) {
		double oldLargeBagStowTimeDeviation = largeBagStowTimeDeviation;
		largeBagStowTimeDeviation = newLargeBagStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION, oldLargeBagStowTimeDeviation,
					largeBagStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getJacketVolume() {
		return jacketVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJacketVolume(double newJacketVolume) {
		double oldJacketVolume = jacketVolume;
		jacketVolume = newJacketVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.LUGGAGE_PROPERTIES__JACKET_VOLUME,
					oldJacketVolume, jacketVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSmallBagVolume() {
		return smallBagVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBagVolume(double newSmallBagVolume) {
		double oldSmallBagVolume = smallBagVolume;
		smallBagVolume = newSmallBagVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME,
					oldSmallBagVolume, smallBagVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMediumBagVolume() {
		return mediumBagVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBagVolume(double newMediumBagVolume) {
		double oldMediumBagVolume = mediumBagVolume;
		mediumBagVolume = newMediumBagVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME,
					oldMediumBagVolume, mediumBagVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLargeBagVolume() {
		return largeBagVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeBagVolume(double newLargeBagVolume) {
		double oldLargeBagVolume = largeBagVolume;
		largeBagVolume = newLargeBagVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME,
					oldLargeBagVolume, largeBagVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getJacketBulkiness() {
		return jacketBulkiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJacketBulkiness(double newJacketBulkiness) {
		double oldJacketBulkiness = jacketBulkiness;
		jacketBulkiness = newJacketBulkiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.LUGGAGE_PROPERTIES__JACKET_BULKINESS,
					oldJacketBulkiness, jacketBulkiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSmallBagBulkiness() {
		return smallBagBulkiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBagBulkiness(double newSmallBagBulkiness) {
		double oldSmallBagBulkiness = smallBagBulkiness;
		smallBagBulkiness = newSmallBagBulkiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS, oldSmallBagBulkiness, smallBagBulkiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMediumBagBulkiness() {
		return mediumBagBulkiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBagBulkiness(double newMediumBagBulkiness) {
		double oldMediumBagBulkiness = mediumBagBulkiness;
		mediumBagBulkiness = newMediumBagBulkiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS, oldMediumBagBulkiness,
					mediumBagBulkiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLargeBagBulkiness() {
		return largeBagBulkiness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeBagBulkiness(double newLargeBagBulkiness) {
		double oldLargeBagBulkiness = largeBagBulkiness;
		largeBagBulkiness = newLargeBagBulkiness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS, oldLargeBagBulkiness, largeBagBulkiness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getJacketWalkingSpeedFactor() {
		return jacketWalkingSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJacketWalkingSpeedFactor(double newJacketWalkingSpeedFactor) {
		double oldJacketWalkingSpeedFactor = jacketWalkingSpeedFactor;
		jacketWalkingSpeedFactor = newJacketWalkingSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR, oldJacketWalkingSpeedFactor,
					jacketWalkingSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSmallBagWalkingSpeedFactor() {
		return smallBagWalkingSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmallBagWalkingSpeedFactor(double newSmallBagWalkingSpeedFactor) {
		double oldSmallBagWalkingSpeedFactor = smallBagWalkingSpeedFactor;
		smallBagWalkingSpeedFactor = newSmallBagWalkingSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR, oldSmallBagWalkingSpeedFactor,
					smallBagWalkingSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMediumBagWalkingSpeedFactor() {
		return mediumBagWalkingSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediumBagWalkingSpeedFactor(double newMediumBagWalkingSpeedFactor) {
		double oldMediumBagWalkingSpeedFactor = mediumBagWalkingSpeedFactor;
		mediumBagWalkingSpeedFactor = newMediumBagWalkingSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR, oldMediumBagWalkingSpeedFactor,
					mediumBagWalkingSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLargeBagWalkingSpeedFactor() {
		return largeBagWalkingSpeedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeBagWalkingSpeedFactor(double newLargeBagWalkingSpeedFactor) {
		double oldLargeBagWalkingSpeedFactor = largeBagWalkingSpeedFactor;
		largeBagWalkingSpeedFactor = newLargeBagWalkingSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR, oldLargeBagWalkingSpeedFactor,
					largeBagWalkingSpeedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLuggageStorageScaling() {
		return luggageStorageScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuggageStorageScaling(double newLuggageStorageScaling) {
		double oldLuggageStorageScaling = luggageStorageScaling;
		luggageStorageScaling = newLuggageStorageScaling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING, oldLuggageStorageScaling,
					luggageStorageScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SettingsPackage.LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX:
			return getMaxNumberOfLuggageItemsPerPax();
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN:
			return getLuggageStowDistanceFromSeatMean();
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION:
			return getLuggageStowDistanceFromSeatDeviation();
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION:
			return getJacketStowTimeDeviation();
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN:
			return getJacketStowTimeMean();
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN:
			return getSmallBagStowTimeMean();
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION:
			return getSmallBagStowTimeDeviation();
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN:
			return getMediumBagStowTimeMean();
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION:
			return getMediumBagStowTimeDeviation();
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN:
			return getLargeBagStowTimeMean();
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION:
			return getLargeBagStowTimeDeviation();
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_VOLUME:
			return getJacketVolume();
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME:
			return getSmallBagVolume();
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME:
			return getMediumBagVolume();
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME:
			return getLargeBagVolume();
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_BULKINESS:
			return getJacketBulkiness();
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS:
			return getSmallBagBulkiness();
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS:
			return getMediumBagBulkiness();
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS:
			return getLargeBagBulkiness();
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR:
			return getJacketWalkingSpeedFactor();
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR:
			return getSmallBagWalkingSpeedFactor();
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR:
			return getMediumBagWalkingSpeedFactor();
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR:
			return getLargeBagWalkingSpeedFactor();
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING:
			return getLuggageStorageScaling();
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
		case SettingsPackage.LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX:
			setMaxNumberOfLuggageItemsPerPax((Integer) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN:
			setLuggageStowDistanceFromSeatMean((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION:
			setLuggageStowDistanceFromSeatDeviation((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION:
			setJacketStowTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN:
			setJacketStowTimeMean((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN:
			setSmallBagStowTimeMean((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION:
			setSmallBagStowTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN:
			setMediumBagStowTimeMean((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION:
			setMediumBagStowTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN:
			setLargeBagStowTimeMean((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION:
			setLargeBagStowTimeDeviation((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_VOLUME:
			setJacketVolume((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME:
			setSmallBagVolume((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME:
			setMediumBagVolume((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME:
			setLargeBagVolume((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_BULKINESS:
			setJacketBulkiness((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS:
			setSmallBagBulkiness((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS:
			setMediumBagBulkiness((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS:
			setLargeBagBulkiness((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR:
			setJacketWalkingSpeedFactor((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR:
			setSmallBagWalkingSpeedFactor((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR:
			setMediumBagWalkingSpeedFactor((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR:
			setLargeBagWalkingSpeedFactor((Double) newValue);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING:
			setLuggageStorageScaling((Double) newValue);
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
		case SettingsPackage.LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX:
			setMaxNumberOfLuggageItemsPerPax(MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN:
			setLuggageStowDistanceFromSeatMean(LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION:
			setLuggageStowDistanceFromSeatDeviation(LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION:
			setJacketStowTimeDeviation(JACKET_STOW_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN:
			setJacketStowTimeMean(JACKET_STOW_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN:
			setSmallBagStowTimeMean(SMALL_BAG_STOW_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION:
			setSmallBagStowTimeDeviation(SMALL_BAG_STOW_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN:
			setMediumBagStowTimeMean(MEDIUM_BAG_STOW_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION:
			setMediumBagStowTimeDeviation(MEDIUM_BAG_STOW_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN:
			setLargeBagStowTimeMean(LARGE_BAG_STOW_TIME_MEAN_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION:
			setLargeBagStowTimeDeviation(LARGE_BAG_STOW_TIME_DEVIATION_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_VOLUME:
			setJacketVolume(JACKET_VOLUME_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME:
			setSmallBagVolume(SMALL_BAG_VOLUME_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME:
			setMediumBagVolume(MEDIUM_BAG_VOLUME_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME:
			setLargeBagVolume(LARGE_BAG_VOLUME_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_BULKINESS:
			setJacketBulkiness(JACKET_BULKINESS_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS:
			setSmallBagBulkiness(SMALL_BAG_BULKINESS_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS:
			setMediumBagBulkiness(MEDIUM_BAG_BULKINESS_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS:
			setLargeBagBulkiness(LARGE_BAG_BULKINESS_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR:
			setJacketWalkingSpeedFactor(JACKET_WALKING_SPEED_FACTOR_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR:
			setSmallBagWalkingSpeedFactor(SMALL_BAG_WALKING_SPEED_FACTOR_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR:
			setMediumBagWalkingSpeedFactor(MEDIUM_BAG_WALKING_SPEED_FACTOR_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR:
			setLargeBagWalkingSpeedFactor(LARGE_BAG_WALKING_SPEED_FACTOR_EDEFAULT);
			return;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING:
			setLuggageStorageScaling(LUGGAGE_STORAGE_SCALING_EDEFAULT);
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
		case SettingsPackage.LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX:
			return maxNumberOfLuggageItemsPerPax != MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN:
			return luggageStowDistanceFromSeatMean != LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION:
			return luggageStowDistanceFromSeatDeviation != LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION:
			return jacketStowTimeDeviation != JACKET_STOW_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN:
			return jacketStowTimeMean != JACKET_STOW_TIME_MEAN_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN:
			return smallBagStowTimeMean != SMALL_BAG_STOW_TIME_MEAN_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION:
			return smallBagStowTimeDeviation != SMALL_BAG_STOW_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN:
			return mediumBagStowTimeMean != MEDIUM_BAG_STOW_TIME_MEAN_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION:
			return mediumBagStowTimeDeviation != MEDIUM_BAG_STOW_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN:
			return largeBagStowTimeMean != LARGE_BAG_STOW_TIME_MEAN_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION:
			return largeBagStowTimeDeviation != LARGE_BAG_STOW_TIME_DEVIATION_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_VOLUME:
			return jacketVolume != JACKET_VOLUME_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME:
			return smallBagVolume != SMALL_BAG_VOLUME_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME:
			return mediumBagVolume != MEDIUM_BAG_VOLUME_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME:
			return largeBagVolume != LARGE_BAG_VOLUME_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_BULKINESS:
			return jacketBulkiness != JACKET_BULKINESS_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS:
			return smallBagBulkiness != SMALL_BAG_BULKINESS_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS:
			return mediumBagBulkiness != MEDIUM_BAG_BULKINESS_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS:
			return largeBagBulkiness != LARGE_BAG_BULKINESS_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR:
			return jacketWalkingSpeedFactor != JACKET_WALKING_SPEED_FACTOR_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR:
			return smallBagWalkingSpeedFactor != SMALL_BAG_WALKING_SPEED_FACTOR_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR:
			return mediumBagWalkingSpeedFactor != MEDIUM_BAG_WALKING_SPEED_FACTOR_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR:
			return largeBagWalkingSpeedFactor != LARGE_BAG_WALKING_SPEED_FACTOR_EDEFAULT;
		case SettingsPackage.LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING:
			return luggageStorageScaling != LUGGAGE_STORAGE_SCALING_EDEFAULT;
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
		result.append(" (maxNumberOfLuggageItemsPerPax: ");
		result.append(maxNumberOfLuggageItemsPerPax);
		result.append(", luggageStowDistanceFromSeatMean: ");
		result.append(luggageStowDistanceFromSeatMean);
		result.append(", luggageStowDistanceFromSeatDeviation: ");
		result.append(luggageStowDistanceFromSeatDeviation);
		result.append(", jacketStowTimeDeviation: ");
		result.append(jacketStowTimeDeviation);
		result.append(", jacketStowTimeMean: ");
		result.append(jacketStowTimeMean);
		result.append(", smallBagStowTimeMean: ");
		result.append(smallBagStowTimeMean);
		result.append(", smallBagStowTimeDeviation: ");
		result.append(smallBagStowTimeDeviation);
		result.append(", mediumBagStowTimeMean: ");
		result.append(mediumBagStowTimeMean);
		result.append(", mediumBagStowTimeDeviation: ");
		result.append(mediumBagStowTimeDeviation);
		result.append(", largeBagStowTimeMean: ");
		result.append(largeBagStowTimeMean);
		result.append(", largeBagStowTimeDeviation: ");
		result.append(largeBagStowTimeDeviation);
		result.append(", jacketVolume: ");
		result.append(jacketVolume);
		result.append(", smallBagVolume: ");
		result.append(smallBagVolume);
		result.append(", mediumBagVolume: ");
		result.append(mediumBagVolume);
		result.append(", largeBagVolume: ");
		result.append(largeBagVolume);
		result.append(", jacketBulkiness: ");
		result.append(jacketBulkiness);
		result.append(", smallBagBulkiness: ");
		result.append(smallBagBulkiness);
		result.append(", mediumBagBulkiness: ");
		result.append(mediumBagBulkiness);
		result.append(", largeBagBulkiness: ");
		result.append(largeBagBulkiness);
		result.append(", jacketWalkingSpeedFactor: ");
		result.append(jacketWalkingSpeedFactor);
		result.append(", smallBagWalkingSpeedFactor: ");
		result.append(smallBagWalkingSpeedFactor);
		result.append(", mediumBagWalkingSpeedFactor: ");
		result.append(mediumBagWalkingSpeedFactor);
		result.append(", largeBagWalkingSpeedFactor: ");
		result.append(largeBagWalkingSpeedFactor);
		result.append(", luggageStorageScaling: ");
		result.append(luggageStorageScaling);
		result.append(')');
		return result.toString();
	}

} //LuggagePropertiesImpl
