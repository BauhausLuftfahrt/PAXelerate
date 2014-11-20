/**
 */
package net.bhl.cdt.model.cabin.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.cabin.CabinViewSettings;

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
 * This is the item provider adapter for a {@link net.bhl.cdt.model.cabin.CabinViewSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CabinViewSettingsItemProvider 
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
	public CabinViewSettingsItemProvider(AdapterFactory adapterFactory) {
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

			addShowSeatlabelsPropertyDescriptor(object);
			addShowRowLabelsPropertyDescriptor(object);
			addShowGalleyAndLavatoryLabelsPropertyDescriptor(object);
			addShowCurtainsPropertyDescriptor(object);
			addShowSeatsPropertyDescriptor(object);
			addShowGalleysPropertyDescriptor(object);
			addShowLavatoriesPropertyDescriptor(object);
			addShowDoorsPropertyDescriptor(object);
			addShowOccupiedSeatsPropertyDescriptor(object);
			addSizeOfPassengerCirclePropertyDescriptor(object);
			addDoorOffSetInPixelsPropertyDescriptor(object);
			addXZeroInPixelsPropertyDescriptor(object);
			addYZeroInPixelsPropertyDescriptor(object);
			addCabinWidthInPixelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Show Seatlabels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowSeatlabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showSeatlabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showSeatlabels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Row Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowRowLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showRowLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showRowLabels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Galley And Lavatory Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowGalleyAndLavatoryLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showGalleyAndLavatoryLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showGalleyAndLavatoryLabels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Curtains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowCurtainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showCurtains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showCurtains_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_CURTAINS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Seats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showSeats_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Galleys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowGalleysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showGalleys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showGalleys_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_GALLEYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Lavatories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowLavatoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showLavatories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showLavatories_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Doors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowDoorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showDoors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showDoors_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_DOORS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Occupied Seats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowOccupiedSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_showOccupiedSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_showOccupiedSeats_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size Of Passenger Circle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeOfPassengerCirclePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_sizeOfPassengerCircle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_sizeOfPassengerCircle_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Door Off Set In Pixels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoorOffSetInPixelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_doorOffSetInPixels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_doorOffSetInPixels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XZero In Pixels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXZeroInPixelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_xZeroInPixels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_xZeroInPixels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YZero In Pixels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYZeroInPixelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_yZeroInPixels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_yZeroInPixels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cabin Width In Pixels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCabinWidthInPixelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CabinViewSettings_cabinWidthInPixels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CabinViewSettings_cabinWidthInPixels_feature", "_UI_CabinViewSettings_type"),
				 CabinPackage.Literals.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CabinViewSettings.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CabinViewSettings"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CabinViewSettings cabinViewSettings = (CabinViewSettings)object;
		return getString("_UI_CabinViewSettings_type") + " " + cabinViewSettings.isShowSeatlabels();
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

		switch (notification.getFeatureID(CabinViewSettings.class)) {
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATLABELS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_ROW_LABELS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEY_AND_LAVATORY_LABELS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_CURTAINS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_SEATS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_GALLEYS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_LAVATORIES:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_DOORS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SHOW_OCCUPIED_SEATS:
			case CabinPackage.CABIN_VIEW_SETTINGS__SIZE_OF_PASSENGER_CIRCLE:
			case CabinPackage.CABIN_VIEW_SETTINGS__DOOR_OFF_SET_IN_PIXELS:
			case CabinPackage.CABIN_VIEW_SETTINGS__XZERO_IN_PIXELS:
			case CabinPackage.CABIN_VIEW_SETTINGS__YZERO_IN_PIXELS:
			case CabinPackage.CABIN_VIEW_SETTINGS__CABIN_WIDTH_IN_PIXELS:
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
