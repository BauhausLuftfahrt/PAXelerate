/**
 */
package net.bhl.cdt.paxelerate.model.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.LuggageProperties;

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
 * This is the item provider adapter for a {@link net.bhl.cdt.paxelerate.model.LuggageProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LuggagePropertiesItemProvider 
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
	public LuggagePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addLuggageStowingDistanceFromSeatMeanPropertyDescriptor(object);
			addLuggageStowingDistanceFromSeatDeviationPropertyDescriptor(object);
			addPercentageOfPassengersWithNoLuggagePropertyDescriptor(object);
			addPercentageOfPassengersWithSmallLuggagePropertyDescriptor(object);
			addPercentageOfPassengersWithMediumLuggagePropertyDescriptor(object);
			addPercentageOfPassengersWithBigLuggagePropertyDescriptor(object);
			addPassengerSmallLuggageStowTimeMeanPropertyDescriptor(object);
			addPassengerSmallLuggageStowTimeDeviationPropertyDescriptor(object);
			addPassengerMediumLuggageStowTimeMeanPropertyDescriptor(object);
			addPassengerMediumLuggageStowTimeDeviationPropertyDescriptor(object);
			addPassengerBigLuggageStowTimeMeanPropertyDescriptor(object);
			addPassengerBigLuggageStowTimeDeviationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Luggage Stowing Distance From Seat Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuggageStowingDistanceFromSeatMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_luggageStowingDistanceFromSeatMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_luggageStowingDistanceFromSeatMean_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Luggage Stowing Distance From Seat Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuggageStowingDistanceFromSeatDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_luggageStowingDistanceFromSeatDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_luggageStowingDistanceFromSeatDeviation_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percentage Of Passengers With No Luggage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentageOfPassengersWithNoLuggagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_percentageOfPassengersWithNoLuggage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_percentageOfPassengersWithNoLuggage_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percentage Of Passengers With Small Luggage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentageOfPassengersWithSmallLuggagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_percentageOfPassengersWithSmallLuggage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_percentageOfPassengersWithSmallLuggage_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percentage Of Passengers With Medium Luggage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentageOfPassengersWithMediumLuggagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_percentageOfPassengersWithMediumLuggage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_percentageOfPassengersWithMediumLuggage_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Percentage Of Passengers With Big Luggage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPercentageOfPassengersWithBigLuggagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_percentageOfPassengersWithBigLuggage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_percentageOfPassengersWithBigLuggage_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Small Luggage Stow Time Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerSmallLuggageStowTimeMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_passengerSmallLuggageStowTimeMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_passengerSmallLuggageStowTimeMean_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Small Luggage Stow Time Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerSmallLuggageStowTimeDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_passengerSmallLuggageStowTimeDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_passengerSmallLuggageStowTimeDeviation_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Medium Luggage Stow Time Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerMediumLuggageStowTimeMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_passengerMediumLuggageStowTimeMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_passengerMediumLuggageStowTimeMean_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Medium Luggage Stow Time Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerMediumLuggageStowTimeDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_passengerMediumLuggageStowTimeDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_passengerMediumLuggageStowTimeDeviation_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Big Luggage Stow Time Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerBigLuggageStowTimeMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_passengerBigLuggageStowTimeMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_passengerBigLuggageStowTimeMean_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Big Luggage Stow Time Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerBigLuggageStowTimeDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuggageProperties_passengerBigLuggageStowTimeDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuggageProperties_passengerBigLuggageStowTimeDeviation_feature", "_UI_LuggageProperties_type"),
				 CabinPackage.Literals.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LuggageProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LuggageProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LuggageProperties luggageProperties = (LuggageProperties)object;
		return getString("_UI_LuggageProperties_type") + " " + luggageProperties.getLuggageStowingDistanceFromSeatMean();
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

		switch (notification.getFeatureID(LuggageProperties.class)) {
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN:
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION:
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN:
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION:
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN:
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION:
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN:
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION:
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
