/**
 */
package net.bhl.cdt.paxelerate.model.provider;

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

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.util.string.StringHelper;

/**
 * This is the item provider adapter for a
 * {@link net.bhl.cdt.paxelerate.model.Door} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DoorItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addXPositionPropertyDescriptor(object);
			addOnBothSidesPropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNumberOfSimultaneousPassengersPropertyDescriptor(object);
			addIsActivePropertyDescriptor(object);
			addWaitingPassengersPropertyDescriptor(object);
			addDoorOptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the XPosition feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addXPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_xPosition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_xPosition_feature", "_UI_Door_type"),
						CabinPackage.Literals.DOOR__XPOSITION, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Both Sides feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOnBothSidesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_onBothSides_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_onBothSides_feature",
								"_UI_Door_type"),
						CabinPackage.Literals.DOOR__ON_BOTH_SIDES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Width feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_width_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_width_feature", "_UI_Door_type"),
						CabinPackage.Literals.DOOR__WIDTH, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_id_feature", "_UI_Door_type"),
						CabinPackage.Literals.DOOR__ID, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Simultaneous Passengers
	 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNumberOfSimultaneousPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Door_numberOfSimultaneousPassengers_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Door_numberOfSimultaneousPassengers_feature",
						"_UI_Door_type"),
				CabinPackage.Literals.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Active feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIsActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_isActive_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_isActive_feature", "_UI_Door_type"),
						CabinPackage.Literals.DOOR__IS_ACTIVE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Waiting Passengers feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addWaitingPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_waitingPassengers_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_waitingPassengers_feature",
								"_UI_Door_type"),
						CabinPackage.Literals.DOOR__WAITING_PASSENGERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Door Option feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDoorOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Door_doorOption_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Door_doorOption_feature", "_UI_Door_type"),
						CabinPackage.Literals.DOOR__DOOR_OPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Door.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		switch (((Door) object).getDoorOption()) {
		case EMERGENCY_EXIT:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/EmergencyExit"));
		default:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Door"));
		}

	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Door door = (Door) object;
		String correct = "✗";
		if (door.isIsActive()) {
			correct = "✓";
		}
		return StringHelper.splitCamelCase(door.getDoorOption().getName() + " (" + correct + ")");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Door.class)) {
		case CabinPackage.DOOR__XPOSITION:
		case CabinPackage.DOOR__ON_BOTH_SIDES:
		case CabinPackage.DOOR__WIDTH:
		case CabinPackage.DOOR__ID:
		case CabinPackage.DOOR__NUMBER_OF_SIMULTANEOUS_PASSENGERS:
		case CabinPackage.DOOR__IS_ACTIVE:
		case CabinPackage.DOOR__DOOR_OPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CabinEditPlugin.INSTANCE;
	}

}
