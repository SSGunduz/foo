/**
 */
package Ticket.impl;

import Ticket.CityTicket;
import Ticket.IntercityTicket;
import Ticket.Person;
import Ticket.Subscription;
import Ticket.TicketPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Ticket.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link Ticket.impl.PersonImpl#getIntercityTickets <em>Intercity Tickets</em>}</li>
 *   <li>{@link Ticket.impl.PersonImpl#getCityTickets <em>City Tickets</em>}</li>
 *   <li>{@link Ticket.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link Ticket.impl.PersonImpl#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntercityTickets() <em>Intercity Tickets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntercityTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<IntercityTicket> intercityTickets;

	/**
	 * The cached value of the '{@link #getCityTickets() <em>City Tickets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<CityTicket> cityTickets;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected Subscription subscription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TicketPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntercityTicket> getIntercityTickets() {
		if (intercityTickets == null) {
			intercityTickets = new EObjectContainmentEList<IntercityTicket>(IntercityTicket.class, this, TicketPackage.PERSON__INTERCITY_TICKETS);
		}
		return intercityTickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CityTicket> getCityTickets() {
		if (cityTickets == null) {
			cityTickets = new EObjectContainmentEList<CityTicket>(CityTicket.class, this, TicketPackage.PERSON__CITY_TICKETS);
		}
		return cityTickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(Subscription newSubscription, NotificationChain msgs) {
		Subscription oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TicketPackage.PERSON__SUBSCRIPTION, oldSubscription, newSubscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription(Subscription newSubscription) {
		if (newSubscription != subscription) {
			NotificationChain msgs = null;
			if (subscription != null)
				msgs = ((InternalEObject)subscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TicketPackage.PERSON__SUBSCRIPTION, null, msgs);
			if (newSubscription != null)
				msgs = ((InternalEObject)newSubscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TicketPackage.PERSON__SUBSCRIPTION, null, msgs);
			msgs = basicSetSubscription(newSubscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.PERSON__SUBSCRIPTION, newSubscription, newSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TicketPackage.PERSON__INTERCITY_TICKETS:
				return ((InternalEList<?>)getIntercityTickets()).basicRemove(otherEnd, msgs);
			case TicketPackage.PERSON__CITY_TICKETS:
				return ((InternalEList<?>)getCityTickets()).basicRemove(otherEnd, msgs);
			case TicketPackage.PERSON__SUBSCRIPTION:
				return basicSetSubscription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TicketPackage.PERSON__NAME:
				return getName();
			case TicketPackage.PERSON__INTERCITY_TICKETS:
				return getIntercityTickets();
			case TicketPackage.PERSON__CITY_TICKETS:
				return getCityTickets();
			case TicketPackage.PERSON__AGE:
				return getAge();
			case TicketPackage.PERSON__SUBSCRIPTION:
				return getSubscription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TicketPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case TicketPackage.PERSON__INTERCITY_TICKETS:
				getIntercityTickets().clear();
				getIntercityTickets().addAll((Collection<? extends IntercityTicket>)newValue);
				return;
			case TicketPackage.PERSON__CITY_TICKETS:
				getCityTickets().clear();
				getCityTickets().addAll((Collection<? extends CityTicket>)newValue);
				return;
			case TicketPackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case TicketPackage.PERSON__SUBSCRIPTION:
				setSubscription((Subscription)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TicketPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TicketPackage.PERSON__INTERCITY_TICKETS:
				getIntercityTickets().clear();
				return;
			case TicketPackage.PERSON__CITY_TICKETS:
				getCityTickets().clear();
				return;
			case TicketPackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case TicketPackage.PERSON__SUBSCRIPTION:
				setSubscription((Subscription)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TicketPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TicketPackage.PERSON__INTERCITY_TICKETS:
				return intercityTickets != null && !intercityTickets.isEmpty();
			case TicketPackage.PERSON__CITY_TICKETS:
				return cityTickets != null && !cityTickets.isEmpty();
			case TicketPackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case TicketPackage.PERSON__SUBSCRIPTION:
				return subscription != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
