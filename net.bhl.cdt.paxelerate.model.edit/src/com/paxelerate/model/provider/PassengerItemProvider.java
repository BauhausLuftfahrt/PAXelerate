/**
 */
package com.paxelerate.model.provider;


import java.util.Collection;
import java.util.List;

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

import com.paxelerate.model.CabinPackage;
import com.paxelerate.model.Passenger;

/**
 * This is the item provider adapter for a {@link com.paxelerate.model.Passenger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PassengerItemProvider
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
	public PassengerItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addSexPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addAgePropertyDescriptor(object);
			addWeightPropertyDescriptor(object);
			addDoorPropertyDescriptor(object);
			addSeatPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addBoardingTimePropertyDescriptor(object);
			addSeatRefPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addDepthPropertyDescriptor(object);
			addOrientationInDegreePropertyDescriptor(object);
			addPositionXPropertyDescriptor(object);
			addPositionYPropertyDescriptor(object);
			addIsSeatedPropertyDescriptor(object);
			addWalkingSpeedPropertyDescriptor(object);
			addStartBoardingAfterDelayPropertyDescriptor(object);
			addNumberOfWaitsPropertyDescriptor(object);
			addLuggageStowTimePropertyDescriptor(object);
			addTravelClassPropertyDescriptor(object);
			addPassengerMoodPropertyDescriptor(object);
			addNumberOfMakeWayOperationsPropertyDescriptor(object);
			addLuggagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_id_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_sex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_sex_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__SEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_seat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_seat_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__SEAT,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_Name_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boarding Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoardingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_boardingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_boardingTime_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__BOARDING_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_seatRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_seatRef_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__SEAT_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_width_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_depth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_depth_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orientation In Degree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrientationInDegreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_orientationInDegree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_orientationInDegree_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__ORIENTATION_IN_DEGREE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_positionX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_positionX_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__POSITION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_positionY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_positionY_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__POSITION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Seated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSeatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_isSeated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_isSeated_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__IS_SEATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Walking Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWalkingSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_walkingSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_walkingSpeed_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__WALKING_SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Boarding After Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartBoardingAfterDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_startBoardingAfterDelay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_startBoardingAfterDelay_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__START_BOARDING_AFTER_DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Waits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfWaitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_numberOfWaits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_numberOfWaits_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__NUMBER_OF_WAITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luggage Stow Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuggageStowTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_luggageStowTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_luggageStowTime_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__LUGGAGE_STOW_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_travelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_travelClass_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__TRAVEL_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Mood feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerMoodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_passengerMood_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_passengerMood_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__PASSENGER_MOOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Make Way Operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfMakeWayOperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_numberOfMakeWayOperations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_numberOfMakeWayOperations_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luggage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuggagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_luggage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_luggage_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__LUGGAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_height_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Age feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_age_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_age_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__AGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_weight_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__WEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Door feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Passenger_door_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Passenger_door_feature", "_UI_Passenger_type"),
				 CabinPackage.Literals.PASSENGER__DOOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Passenger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Passenger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Passenger)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Passenger_type") :
			getString("_UI_Passenger_type") + " " + label;
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

		switch (notification.getFeatureID(Passenger.class)) {
			case CabinPackage.PASSENGER__ID:
			case CabinPackage.PASSENGER__SEX:
			case CabinPackage.PASSENGER__HEIGHT:
			case CabinPackage.PASSENGER__AGE:
			case CabinPackage.PASSENGER__WEIGHT:
			case CabinPackage.PASSENGER__NAME:
			case CabinPackage.PASSENGER__BOARDING_TIME:
			case CabinPackage.PASSENGER__WIDTH:
			case CabinPackage.PASSENGER__DEPTH:
			case CabinPackage.PASSENGER__ORIENTATION_IN_DEGREE:
			case CabinPackage.PASSENGER__POSITION_X:
			case CabinPackage.PASSENGER__POSITION_Y:
			case CabinPackage.PASSENGER__IS_SEATED:
			case CabinPackage.PASSENGER__WALKING_SPEED:
			case CabinPackage.PASSENGER__START_BOARDING_AFTER_DELAY:
			case CabinPackage.PASSENGER__NUMBER_OF_WAITS:
			case CabinPackage.PASSENGER__LUGGAGE_STOW_TIME:
			case CabinPackage.PASSENGER__PASSENGER_MOOD:
			case CabinPackage.PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS:
			case CabinPackage.PASSENGER__LUGGAGE:
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