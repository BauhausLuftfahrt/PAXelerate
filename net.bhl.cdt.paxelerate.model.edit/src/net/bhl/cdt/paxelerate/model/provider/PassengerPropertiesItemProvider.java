/**
 */
package net.bhl.cdt.paxelerate.model.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.PassengerProperties;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.paxelerate.model.PassengerProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PassengerPropertiesItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerPropertiesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPassengerWidthMeanMalePropertyDescriptor(object);
			addPassengerWidthDeviationMalePropertyDescriptor(object);
			addPassengerWeightMeanMalePropertyDescriptor(object);
			addPassengerWeightDeviationMalePropertyDescriptor(object);
			addPassengerHeightMeanMalePropertyDescriptor(object);
			addPassengerHeightDeviationMalePropertyDescriptor(object);
			addPassengerDepthMeanMalePropertyDescriptor(object);
			addPassengerDepthDeviationMalePropertyDescriptor(object);
			addPercentageOfWomenPropertyDescriptor(object);
			addPassengerWidthMeanFemalePropertyDescriptor(object);
			addPassengerWidthDeviationFemalePropertyDescriptor(object);
			addPassengerWeightMeanFemalePropertyDescriptor(object);
			addPassengerWeightDeviationFemalePropertyDescriptor(object);
			addPassengerHeightMeanFemalePropertyDescriptor(object);
			addPassengerHeightDeviationFemalePropertyDescriptor(object);
			addPassengerDepthMeanFemalePropertyDescriptor(object);
			addPassengerDepthDeviationFemalePropertyDescriptor(object);
			addPassengerAggressiveMoodSharePropertyDescriptor(object);
			addSeatInterferenceStandingUpPassengerWaitingTimePropertyDescriptor(object);
			addSeatInterferenceProcessTimeMeanPropertyDescriptor(object);
			addSeatInterferenceProcessTimeDeviationPropertyDescriptor(object);
			addSeatInterferenceProcessTimeFoldingSeatMeanPropertyDescriptor(object);
			addSeatInterferenceProcessTimeFoldingSeatDeviationPropertyDescriptor(object);
			addPassivePassengerWaitingTimeAfterCollisionPropertyDescriptor(object);
			addPassengerWalkingSpeedFactorPropertyDescriptor(object);
			addSeatInterferenceMultiPassengerFactorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Passenger Width Mean Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWidthMeanMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWidthMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWidthMeanMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Width Deviation Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWidthDeviationMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWidthDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWidthDeviationMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Weight Mean Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWeightMeanMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWeightMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWeightMeanMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Weight Deviation Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWeightDeviationMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWeightDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWeightDeviationMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Height Mean Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerHeightMeanMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerHeightMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerHeightMeanMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Height Deviation Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerHeightDeviationMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerHeightDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerHeightDeviationMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Depth Mean Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerDepthMeanMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerDepthMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerDepthMeanMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Depth Deviation Male feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerDepthDeviationMalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerDepthDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerDepthDeviationMale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percentage Of Women feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentageOfWomenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_percentageOfWomen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_percentageOfWomen_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Width Mean Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWidthMeanFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWidthMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWidthMeanFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Width Deviation Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWidthDeviationFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWidthDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWidthDeviationFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Weight Mean Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWeightMeanFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWeightMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWeightMeanFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Weight Deviation Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWeightDeviationFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWeightDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWeightDeviationFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Height Mean Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerHeightMeanFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerHeightMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerHeightMeanFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Height Deviation Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerHeightDeviationFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerHeightDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerHeightDeviationFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Depth Mean Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerDepthMeanFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerDepthMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerDepthMeanFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Depth Deviation Female feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerDepthDeviationFemalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerDepthDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerDepthDeviationFemale_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Aggressive Mood Share feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerAggressiveMoodSharePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerAggressiveMoodShare_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerAggressiveMoodShare_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Standing Up Passenger Waiting Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceStandingUpPassengerWaitingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_seatInterferenceStandingUpPassengerWaitingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_seatInterferenceStandingUpPassengerWaitingTime_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Process Time Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceProcessTimeMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_seatInterferenceProcessTimeMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_seatInterferenceProcessTimeMean_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Process Time Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceProcessTimeDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_seatInterferenceProcessTimeDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_seatInterferenceProcessTimeDeviation_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Process Time Folding Seat Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceProcessTimeFoldingSeatMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_seatInterferenceProcessTimeFoldingSeatMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_seatInterferenceProcessTimeFoldingSeatMean_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Process Time Folding Seat Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceProcessTimeFoldingSeatDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_seatInterferenceProcessTimeFoldingSeatDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_seatInterferenceProcessTimeFoldingSeatDeviation_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passive Passenger Waiting Time After Collision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassivePassengerWaitingTimeAfterCollisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passivePassengerWaitingTimeAfterCollision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passivePassengerWaitingTimeAfterCollision_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Walking Speed Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerWalkingSpeedFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_passengerWalkingSpeedFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_passengerWalkingSpeedFactor_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__PASSENGER_WALKING_SPEED_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Multi Passenger Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceMultiPassengerFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PassengerProperties_seatInterferenceMultiPassengerFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PassengerProperties_seatInterferenceMultiPassengerFactor_feature", "_UI_PassengerProperties_type"),
				 CabinPackage.Literals.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PassengerProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PassengerProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @return the text
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PassengerProperties passengerProperties = (PassengerProperties)object;
		return getString("_UI_PassengerProperties_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PassengerProperties.class)) {
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
			case CabinPackage.PASSENGER_PROPERTIES__PERCENTAGE_OF_WOMEN:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE:
			case CabinPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME:
			case CabinPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN:
			case CabinPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION:
			case CabinPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN:
			case CabinPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION:
			case CabinPackage.PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION:
			case CabinPackage.PASSENGER_PROPERTIES__PASSENGER_WALKING_SPEED_FACTOR:
			case CabinPackage.PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CabinEditPlugin.INSTANCE;
	}

}
