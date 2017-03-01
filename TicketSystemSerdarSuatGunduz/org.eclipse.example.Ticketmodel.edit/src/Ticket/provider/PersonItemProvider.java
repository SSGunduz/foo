/**
 */
package Ticket.provider;


import Ticket.Person;
import Ticket.TicketFactory;
import Ticket.TicketPackage;

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

/**
 * This is the item provider adapter for a {@link Ticket.Person} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PersonItemProvider 
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
	public PersonItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addAgePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Person_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_Name_feature", "_UI_Person_type"),
				 TicketPackage.Literals.PERSON__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_Person_Age_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Person_Age_feature", "_UI_Person_type"),
				 TicketPackage.Literals.PERSON__AGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(TicketPackage.Literals.PERSON__INTERCITY_TICKETS);
			childrenFeatures.add(TicketPackage.Literals.PERSON__CITY_TICKETS);
			childrenFeatures.add(TicketPackage.Literals.PERSON__SUBSCRIPTION);
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
	 * This returns Person.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Person"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Person)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Person_type") :
			getString("_UI_Person_type") + " " + label;
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

		switch (notification.getFeatureID(Person.class)) {
			case TicketPackage.PERSON__NAME:
			case TicketPackage.PERSON__AGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TicketPackage.PERSON__INTERCITY_TICKETS:
			case TicketPackage.PERSON__CITY_TICKETS:
			case TicketPackage.PERSON__SUBSCRIPTION:
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
				(TicketPackage.Literals.PERSON__INTERCITY_TICKETS,
				 TicketFactory.eINSTANCE.createIntercityTicket()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__INTERCITY_TICKETS,
				 TicketFactory.eINSTANCE.createSingleTicket()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__INTERCITY_TICKETS,
				 TicketFactory.eINSTANCE.createMultiJourney()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__INTERCITY_TICKETS,
				 TicketFactory.eINSTANCE.createMultiDayTicket()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createCityTicket()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createUrban()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createExtraUrban()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createStandard()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createTwoWay()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createOneWay()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createWeeklyPass()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createLuggage()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createCumulativeTickets()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createStandardCumulative()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createCumulativeOneDay()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createWeekly()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__CITY_TICKETS,
				 TicketFactory.eINSTANCE.createFairTicket()));

		newChildDescriptors.add
			(createChildParameter
				(TicketPackage.Literals.PERSON__SUBSCRIPTION,
				 TicketFactory.eINSTANCE.createSubscription()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TicketEditPlugin.INSTANCE;
	}

}
