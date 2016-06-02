/**
 */
package net.bhl.cdt.paxelerate.model.provider;

import java.util.Collection;
import java.util.List;

import net.bhl.cdt.paxelerate.model.CabinFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.SimulationProperties;

/**
 * This is the item provider adapter for a
 * {@link net.bhl.cdt.paxelerate.model.SimulationProperties} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SimulationPropertiesItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param adapterFactory the adapter factory
	 * @generated 
	 */
	public SimulationPropertiesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @return the property descriptors
	 * @generated 
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addScalePropertyDescriptor(object);
			addFramesPerSecondPropertyDescriptor(object);
			addUsePresetSettingsPropertyDescriptor(object);
			addSimulateWithoutUIPropertyDescriptor(object);
			addNumberOfSimulationLoopsPropertyDescriptor(object);
			addRandomSortBetweenLoopsPropertyDescriptor(object);
			addUseFoldableSeatsPropertyDescriptor(object);
			addBringYourOwnSeatPropertyDescriptor(object);
			addResultsPropertyDescriptor(object);
			addSortingPropertyDescriptor(object);
			addSimulationSpeedFactorPropertyDescriptor(object);
			addSeatInterferenceStandingUpPassengerWaitingTimePropertyDescriptor(object);
			addSeatInterferenceProcessTimePropertyDescriptor(object);
			addThreadSleepTimeDefaultPropertyDescriptor(object);
			addDeveloperModePropertyDescriptor(object);
			addPassengersBoardingPerMinutePropertyDescriptor(object);
			addDataExportPropertyDescriptor(object);
			addDisplayMapPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_scale_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Frames Per Second feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFramesPerSecondPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_framesPerSecond_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_framesPerSecond_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__FRAMES_PER_SECOND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Preset Settings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsePresetSettingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_usePresetSettings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_usePresetSettings_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simulate Without UI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimulateWithoutUIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_simulateWithoutUI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_simulateWithoutUI_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Simulation Loops feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfSimulationLoopsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_numberOfSimulationLoops_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_numberOfSimulationLoops_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Random Sort Between Loops feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRandomSortBetweenLoopsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_randomSortBetweenLoops_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_randomSortBetweenLoops_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Foldable Seats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFoldableSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_useFoldableSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_useFoldableSeats_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bring Your Own Seat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBringYourOwnSeatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_bringYourOwnSeat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_bringYourOwnSeat_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_results_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_results_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__RESULTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sorting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_sorting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_sorting_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__SORTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simulation Speed Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimulationSpeedFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_simulationSpeedFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_simulationSpeedFactor_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR,
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
				 getString("_UI_SimulationProperties_seatInterferenceStandingUpPassengerWaitingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_seatInterferenceStandingUpPassengerWaitingTime_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Interference Process Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatInterferenceProcessTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_seatInterferenceProcessTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_seatInterferenceProcessTime_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thread Sleep Time Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadSleepTimeDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_threadSleepTimeDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_threadSleepTimeDefault_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Developer Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeveloperModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_developerMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_developerMode_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__DEVELOPER_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
	 * This adds a property descriptor for the Data Export feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataExportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_dataExport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_dataExport_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__DATA_EXPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulationProperties_displayMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulationProperties_displayMap_feature", "_UI_SimulationProperties_type"),
				 CabinPackage.Literals.SIMULATION_PROPERTIES__DISPLAY_MAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CabinPackage.Literals.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES);
			childrenFeatures.add(CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param object the object
	 * @param child the child
	 * @return the child feature
	 * @generated 
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SimulationProperties.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulationProperties"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @return the text
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		SimulationProperties simulationProperties = (SimulationProperties) object;
		return getString("_UI_SimulationProperties_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimulationProperties.class)) {
			case CabinPackage.SIMULATION_PROPERTIES__SCALE:
			case CabinPackage.SIMULATION_PROPERTIES__FRAMES_PER_SECOND:
			case CabinPackage.SIMULATION_PROPERTIES__USE_PRESET_SETTINGS:
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATE_WITHOUT_UI:
			case CabinPackage.SIMULATION_PROPERTIES__NUMBER_OF_SIMULATION_LOOPS:
			case CabinPackage.SIMULATION_PROPERTIES__RANDOM_SORT_BETWEEN_LOOPS:
			case CabinPackage.SIMULATION_PROPERTIES__USE_FOLDABLE_SEATS:
			case CabinPackage.SIMULATION_PROPERTIES__BRING_YOUR_OWN_SEAT:
			case CabinPackage.SIMULATION_PROPERTIES__SORTING:
			case CabinPackage.SIMULATION_PROPERTIES__SIMULATION_SPEED_FACTOR:
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_STANDING_UP_PASSENGER_WAITING_TIME:
			case CabinPackage.SIMULATION_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME:
			case CabinPackage.SIMULATION_PROPERTIES__THREAD_SLEEP_TIME_DEFAULT:
			case CabinPackage.SIMULATION_PROPERTIES__DEVELOPER_MODE:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGERS_BOARDING_PER_MINUTE:
			case CabinPackage.SIMULATION_PROPERTIES__DATA_EXPORT:
			case CabinPackage.SIMULATION_PROPERTIES__DISPLAY_MAP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CabinPackage.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES:
			case CabinPackage.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param newChildDescriptors the new child descriptors
	 * @param object the object
	 * @generated 
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.SIMULATION_PROPERTIES__LUGGAGE_PROPERTIES,
				 CabinFactory.eINSTANCE.createLuggageProperties()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.SIMULATION_PROPERTIES__PASSENGER_PROPERTIES,
				 CabinFactory.eINSTANCE.createPassengerProperties()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the resource locator
	 * @generated 
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CabinEditPlugin.INSTANCE;
	}

}
