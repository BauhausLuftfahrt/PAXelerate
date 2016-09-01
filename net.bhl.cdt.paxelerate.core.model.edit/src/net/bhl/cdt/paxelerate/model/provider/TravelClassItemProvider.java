/**
 */
package net.bhl.cdt.paxelerate.model.provider;

import java.util.Collection;
import java.util.List;

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

import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.util.string.StringHelper;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.paxelerate.model.TravelClass} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class TravelClassItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param adapterFactory the adapter factory
	 * @generated 
	 */
	public TravelClassItemProvider(AdapterFactory adapterFactory) {
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

			addSequencePropertyDescriptor(object);
			addPassengersPropertyDescriptor(object);
			addAvailableSeatsPropertyDescriptor(object);
			addSeatPitchPropertyDescriptor(object);
			addXDimensionOfSeatsPropertyDescriptor(object);
			addYDimensionOfSeatsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRowStructurePropertyDescriptor(object);
			addLoadFactorPropertyDescriptor(object);
			addTravelOptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sequence feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addSequencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_sequence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_sequence_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__SEQUENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passengers feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_passengers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_passengers_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__PASSENGERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Available Seats feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addAvailableSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_availableSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_availableSeats_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__AVAILABLE_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seat Pitch feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addSeatPitchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_seatPitch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_seatPitch_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__SEAT_PITCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XDimension Of Seats feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addXDimensionOfSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_xDimensionOfSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_xDimensionOfSeats_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__XDIMENSION_OF_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YDimension Of Seats feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addYDimensionOfSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_yDimensionOfSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_yDimensionOfSeats_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__YDIMENSION_OF_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_name_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Structure feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addRowStructurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_rowStructure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_rowStructure_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__ROW_STRUCTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Load Factor feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param object the object
	 * @generated 
	 */
	protected void addLoadFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_loadFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_loadFactor_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__LOAD_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Travel Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTravelOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TravelClass_travelOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TravelClass_travelOption_feature", "_UI_TravelClass_type"),
				 CabinPackage.Literals.TRAVEL_CLASS__TRAVEL_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CabinPackage.Literals.TRAVEL_CLASS__ROWS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
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
	 * This returns TravelClass.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param object the object
	 * @return the image
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		switch (((TravelClass) object).getTravelOption()) {
		case FIRST_CLASS:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/FirstClass"));
		case BUSINESS_CLASS:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessClass"));
		case PREMIUM_ECONOMY_CLASS:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/PremiumEconomyClass"));
		case ECONOMY_CLASS:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/EconomyClass"));
		default:
			return overlayImage(object, getResourceLocator().getImage("full/obj16/TravelClass"));
		}
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
		String label = ((TravelClass) object).getTravelOption().getName();
		return StringHelper.splitCamelCase(label);

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

		switch (notification.getFeatureID(TravelClass.class)) {
			case CabinPackage.TRAVEL_CLASS__SEQUENCE:
			case CabinPackage.TRAVEL_CLASS__PASSENGERS:
			case CabinPackage.TRAVEL_CLASS__AVAILABLE_SEATS:
			case CabinPackage.TRAVEL_CLASS__SEAT_PITCH:
			case CabinPackage.TRAVEL_CLASS__XDIMENSION_OF_SEATS:
			case CabinPackage.TRAVEL_CLASS__YDIMENSION_OF_SEATS:
			case CabinPackage.TRAVEL_CLASS__NAME:
			case CabinPackage.TRAVEL_CLASS__ROW_STRUCTURE:
			case CabinPackage.TRAVEL_CLASS__LOAD_FACTOR:
			case CabinPackage.TRAVEL_CLASS__TRAVEL_OPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CabinPackage.TRAVEL_CLASS__ROWS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.TRAVEL_CLASS__ROWS,
				 CabinFactory.eINSTANCE.createRow()));
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