/**
 */
package net.bhl.cdt.model.cabin.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.SimulationProperties;

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
 * This is the item provider adapter for a {@link net.bhl.cdt.model.cabin.SimulationProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationPropertiesItemProvider 
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
	public SimulationPropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addPassengersBoardingPerMinutePropertyDescriptor(object);
			addPassengerWidthMeanMalePropertyDescriptor(object);
			addPassengerWidthDeviationMalePropertyDescriptor(object);
			addPassengerWeightMeanMalePropertyDescriptor(object);
			addPassengerWeightDeviationMalePropertyDescriptor(object);
			addPassengerHeightMeanMalePropertyDescriptor(object);
			addPassengerHeightDeviationMalePropertyDescriptor(object);
			addPassengerDepthMeanMalePropertyDescriptor(object);
			addPassengerDepthDeviationMalePropertyDescriptor(object);
			addPercentageOfWomenPropertyDescriptor(object);
			addPassengerLuggageStowTimeMeanPropertyDescriptor(object);
			addPassengerLuggageStowTimeDeviationPropertyDescriptor(object);
			addPassengerWidthMeanFemalePropertyDescriptor(object);
			addPassengerWidthDeviationFemalePropertyDescriptor(object);
			addPassengerWeightMeanFemalePropertyDescriptor(object);
			addPassengerWeightDeviationFemalePropertyDescriptor(object);
			addPassengerHeightMeanFemalePropertyDescriptor(object);
			addPassengerHeightDeviationFemalePropertyDescriptor(object);
			addPassengerDepthMeanFemalePropertyDescriptor(object);
			addPassengerDepthDeviationFemalePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Passengers Boarding Per Minute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengersBoardingPerMinutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_passengersBoardingPerMinute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengersBoardingPerMinute_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_SimulationProperties_passengerWidthMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWidthMeanMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE,
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
				 getString("_UI_SimulationProperties_passengerWidthDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWidthDeviationMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE,
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
				 getString("_UI_SimulationProperties_passengerWeightMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWeightMeanMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE,
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
				 getString("_UI_SimulationProperties_passengerWeightDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWeightDeviationMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE,
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
				 getString("_UI_SimulationProperties_passengerHeightMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerHeightMeanMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE,
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
				 getString("_UI_SimulationProperties_passengerHeightDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerHeightDeviationMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE,
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
				 getString("_UI_SimulationProperties_passengerDepthMeanMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerDepthMeanMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE,
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
				 getString("_UI_SimulationProperties_passengerDepthDeviationMale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerDepthDeviationMale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE,
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
				 getString("_UI_SimulationProperties_percentageOfWomen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_percentageOfWomen_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Luggage Stow Time Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerLuggageStowTimeMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_passengerLuggageStowTimeMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerLuggageStowTimeMean_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passenger Luggage Stow Time Deviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassengerLuggageStowTimeDeviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_passengerLuggageStowTimeDeviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerLuggageStowTimeDeviation_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION,
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
				 getString("_UI_SimulationProperties_passengerWidthMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWidthMeanFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE,
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
				 getString("_UI_SimulationProperties_passengerWidthDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWidthDeviationFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE,
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
				 getString("_UI_SimulationProperties_passengerWeightMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWeightMeanFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE,
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
				 getString("_UI_SimulationProperties_passengerWeightDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerWeightDeviationFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE,
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
				 getString("_UI_SimulationProperties_passengerHeightMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerHeightMeanFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE,
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
				 getString("_UI_SimulationProperties_passengerHeightDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerHeightDeviationFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE,
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
				 getString("_UI_SimulationProperties_passengerDepthMeanFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerDepthMeanFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_SimulationProperties_passengerDepthDeviationFemale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_passengerDepthDeviationFemale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimulationProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulationProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SimulationProperties simulationProperties = (SimulationProperties)object;
		return getString("_UI_SimulationProperties_type") + " " + simulationProperties.getPassengersBoardingPerMinute();
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

		switch (notification.getFeatureID(SimulationProperties.class)) {
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE:
			case CabinPackage.SIMULATION_PROPERTIES__PERCENTAGE_OF_WOMEN:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_MEAN:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_LUGGAGE_STOW_TIME_DEVIATION:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE:
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
