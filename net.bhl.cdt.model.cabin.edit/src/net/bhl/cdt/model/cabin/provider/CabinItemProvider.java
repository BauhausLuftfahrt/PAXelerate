/**
 */
package net.bhl.cdt.model.cabin.provider;


import java.util.Collection;
import java.util.List;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.CabinPackage;
import net.bhl.cdt.model.provider.NamedElementItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.bhl.cdt.model.cabin.Cabin} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CabinItemProvider
	extends NamedElementItemProvider {
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
			addRowNonexistentPropertyDescriptor(object);
			addAisleWidthPropertyDescriptor(object);
			addFramesPerSecondPropertyDescriptor(object);
			addNumberOfDecksPropertyDescriptor(object);
			addScalePropertyDescriptor(object);
			addBoardingTimePropertyDescriptor(object);
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
				 getString("_UI_Cabin_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_scale_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_Cabin_framesPerSecond_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cabin_framesPerSecond_feature", "_UI_Cabin_type"),
				 CabinPackage.Literals.CABIN__FRAMES_PER_SECOND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(CabinPackage.Literals.CABIN__FIRST_CLASSES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__BUSINESS_CLASSES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__ECONOMY_CLASSES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__PREMIUM_ECONOMY_CLASSES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__CLASSES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__DOORS);
			childrenFeatures.add(CabinPackage.Literals.CABIN__LAVATORIES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__GALLEYS);
			childrenFeatures.add(CabinPackage.Literals.CABIN__STAIRWAYS);
			childrenFeatures.add(CabinPackage.Literals.CABIN__CURTAINS);
			childrenFeatures.add(CabinPackage.Literals.CABIN__STOWAGES);
			childrenFeatures.add(CabinPackage.Literals.CABIN__PASSENGERS);
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
		String label = ((Cabin)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Cabin_type") :
			getString("_UI_Cabin_type") + " " + label;
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
			case CabinPackage.CABIN__ROW_NONEXISTENT:
			case CabinPackage.CABIN__AISLE_WIDTH:
			case CabinPackage.CABIN__FRAMES_PER_SECOND:
			case CabinPackage.CABIN__NUMBER_OF_DECKS:
			case CabinPackage.CABIN__SCALE:
			case CabinPackage.CABIN__BOARDING_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CabinPackage.CABIN__FIRST_CLASSES:
			case CabinPackage.CABIN__BUSINESS_CLASSES:
			case CabinPackage.CABIN__ECONOMY_CLASSES:
			case CabinPackage.CABIN__PREMIUM_ECONOMY_CLASSES:
			case CabinPackage.CABIN__CLASSES:
			case CabinPackage.CABIN__DOORS:
			case CabinPackage.CABIN__LAVATORIES:
			case CabinPackage.CABIN__GALLEYS:
			case CabinPackage.CABIN__STAIRWAYS:
			case CabinPackage.CABIN__CURTAINS:
			case CabinPackage.CABIN__STOWAGES:
			case CabinPackage.CABIN__PASSENGERS:
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
				(CabinPackage.Literals.CABIN__FIRST_CLASSES,
				 CabinFactory.eINSTANCE.createFirstClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__BUSINESS_CLASSES,
				 CabinFactory.eINSTANCE.createBusinessClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__ECONOMY_CLASSES,
				 CabinFactory.eINSTANCE.createEconomyClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__PREMIUM_ECONOMY_CLASSES,
				 CabinFactory.eINSTANCE.createPremiumEconomyClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CLASSES,
				 CabinFactory.eINSTANCE.createTravelClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CLASSES,
				 CabinFactory.eINSTANCE.createBusinessClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CLASSES,
				 CabinFactory.eINSTANCE.createFirstClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CLASSES,
				 CabinFactory.eINSTANCE.createEconomyClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CLASSES,
				 CabinFactory.eINSTANCE.createPremiumEconomyClass()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__DOORS,
				 CabinFactory.eINSTANCE.createDoor()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__DOORS,
				 CabinFactory.eINSTANCE.createMainDoor()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__LAVATORIES,
				 CabinFactory.eINSTANCE.createLavatory()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__GALLEYS,
				 CabinFactory.eINSTANCE.createGalley()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__STAIRWAYS,
				 CabinFactory.eINSTANCE.createStairway()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__CURTAINS,
				 CabinFactory.eINSTANCE.createCurtain()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__STOWAGES,
				 CabinFactory.eINSTANCE.createStowage()));

		newChildDescriptors.add
			(createChildParameter
				(CabinPackage.Literals.CABIN__PASSENGERS,
				 CabinFactory.eINSTANCE.createPassenger()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CabinPackage.Literals.CABIN__FIRST_CLASSES ||
			childFeature == CabinPackage.Literals.CABIN__CLASSES ||
			childFeature == CabinPackage.Literals.CABIN__BUSINESS_CLASSES ||
			childFeature == CabinPackage.Literals.CABIN__ECONOMY_CLASSES ||
			childFeature == CabinPackage.Literals.CABIN__PREMIUM_ECONOMY_CLASSES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
