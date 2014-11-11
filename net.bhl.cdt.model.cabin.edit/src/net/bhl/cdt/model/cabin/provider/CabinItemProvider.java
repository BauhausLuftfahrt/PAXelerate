/**
 */
package net.bhl.cdt.model.cabin.provider;


import java.util.Collection;
import java.util.List;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.CabinPackage;
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

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.cabin.Cabin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CabinItemProvider
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
	public CabinItemProvider(AdapterFactory adapterFactory) {
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

			addCabinLengthPropertyDescriptor(object);
			addCabinWidthPropertyDescriptor(object);
			addNumbSeatsPropertyDescriptor(object);
			addRowNonexistentPropertyDescriptor(object);
			addTotalPassengersPropertyDescriptor(object);
			addFirstClassPassengersPropertyDescriptor(object);
			addBusinessClassPassengersPropertyDescriptor(object);
			addPremiumEconomyClassPassengersPropertyDescriptor(object);
			addEconomyClassPassengersPropertyDescriptor(object);
			addNumbAislesPropertyDescriptor(object);
			addAisleWidthPropertyDescriptor(object);
			addBoardingTimePropertyDescriptor(object);
			addNumberOfDecksPropertyDescriptor(object);
			addSeatsPerRowPropertyDescriptor(object);
			addGalleysPropertyDescriptor(object);
			addStairsPropertyDescriptor(object);
			addCurtainPropertyDescriptor(object);
			addStowagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cabin Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCabinLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_cabinLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_cabinLength_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__CABIN_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cabin Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCabinWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_cabinWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_cabinWidth_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__CABIN_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numb Seats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumbSeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_numbSeats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_numbSeats_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__NUMB_SEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Galleys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_galleys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_galleys_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__GALLEYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stairs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStairsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_stairs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_stairs_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__STAIRS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Curtain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurtainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_curtain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_curtain_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__CURTAIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stowage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStowagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_stowage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_stowage_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__STOWAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Decks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfDecksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_numberOfDecks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_numberOfDecks_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__NUMBER_OF_DECKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seats Per Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeatsPerRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_seatsPerRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_seatsPerRow_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__SEATS_PER_ROW,
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
				 getString("_UI_Cabin_boardingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_boardingTime_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__BOARDING_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Class Passengers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstClassPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_FirstClassPassengers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_FirstClassPassengers_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__FIRST_CLASS_PASSENGERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Class Passengers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessClassPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_BusinessClassPassengers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_BusinessClassPassengers_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__BUSINESS_CLASS_PASSENGERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Premium Economy Class Passengers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPremiumEconomyClassPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_PremiumEconomyClassPassengers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_PremiumEconomyClassPassengers_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Economy Class Passengers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEconomyClassPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_EconomyClassPassengers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_EconomyClassPassengers_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__ECONOMY_CLASS_PASSENGERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Passengers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalPassengersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_totalPassengers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_totalPassengers_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__TOTAL_PASSENGERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Nonexistent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowNonexistentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_rowNonexistent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_rowNonexistent_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__ROW_NONEXISTENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numb Aisles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumbAislesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_numbAisles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_numbAisles_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__NUMB_AISLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aisle Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAisleWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cabin_aisleWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_aisleWidth_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__AISLE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(CabinPackage.Literals.CABIN__CLASSES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__DOORS);
			childrenFeatures.add(CabinPackage.Literals.CABIN__LAVATORIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Cabin.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cabin"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Cabin cabin = (Cabin)object;
		return getString("_UI_Cabin_type") + " " + cabin.getCabinLength();
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

		switch (notification.getFeatureID(Cabin.class)) {
			case CabinPackage.CABIN__CABIN_LENGTH:
			case CabinPackage.CABIN__CABIN_WIDTH:
			case CabinPackage.CABIN__NUMB_SEATS:
			case CabinPackage.CABIN__ROW_NONEXISTENT:
			case CabinPackage.CABIN__TOTAL_PASSENGERS:
			case CabinPackage.CABIN__FIRST_CLASS_PASSENGERS:
			case CabinPackage.CABIN__BUSINESS_CLASS_PASSENGERS:
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASS_PASSENGERS:
			case CabinPackage.CABIN__ECONOMY_CLASS_PASSENGERS:
			case CabinPackage.CABIN__NUMB_AISLES:
			case CabinPackage.CABIN__AISLE_WIDTH:
			case CabinPackage.CABIN__BOARDING_TIME:
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
			case CabinPackage.CABIN__SEATS_PER_ROW:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CabinPackage.CABIN__CLASSES:
			case CabinPackage.CABIN__DOORS:
			case CabinPackage.CABIN__LAVATORIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CLASSES,
				 CabinFactory.eINSTANCE.createPassengerClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__DOORS,
				 CabinFactory.eINSTANCE.createDoor()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__LAVATORIES,
				 CabinFactory.eINSTANCE.createLavatory()));
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
