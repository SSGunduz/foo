/**
 */
package Ticket.impl;

import Ticket.CopyType;
import Ticket.IntercityTicket;
import Ticket.TicketPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercity Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Ticket.impl.IntercityTicketImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link Ticket.impl.IntercityTicketImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Ticket.impl.IntercityTicketImpl#isStamped <em>Stamped</em>}</li>
 *   <li>{@link Ticket.impl.IntercityTicketImpl#getCopyType <em>Copy Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntercityTicketImpl extends MinimalEObjectImpl.Container implements IntercityTicket {
	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected String usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStamped() <em>Stamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStamped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STAMPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStamped() <em>Stamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStamped()
	 * @generated
	 * @ordered
	 */
	protected boolean stamped = STAMPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyType() <em>Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyType()
	 * @generated
	 * @ordered
	 */
	protected static final CopyType COPY_TYPE_EDEFAULT = CopyType.DIGITAL;

	/**
	 * The cached value of the '{@link #getCopyType() <em>Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyType()
	 * @generated
	 * @ordered
	 */
	protected CopyType copyType = COPY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercityTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TicketPackage.Literals.INTERCITY_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		String oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.INTERCITY_TICKET__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.INTERCITY_TICKET__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStamped() {
		return stamped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStamped(boolean newStamped) {
		boolean oldStamped = stamped;
		stamped = newStamped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.INTERCITY_TICKET__STAMPED, oldStamped, stamped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyType getCopyType() {
		return copyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyType(CopyType newCopyType) {
		CopyType oldCopyType = copyType;
		copyType = newCopyType == null ? COPY_TYPE_EDEFAULT : newCopyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.INTERCITY_TICKET__COPY_TYPE, oldCopyType, copyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TicketPackage.INTERCITY_TICKET__USAGE:
				return getUsage();
			case TicketPackage.INTERCITY_TICKET__PRICE:
				return getPrice();
			case TicketPackage.INTERCITY_TICKET__STAMPED:
				return isStamped();
			case TicketPackage.INTERCITY_TICKET__COPY_TYPE:
				return getCopyType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TicketPackage.INTERCITY_TICKET__USAGE:
				setUsage((String)newValue);
				return;
			case TicketPackage.INTERCITY_TICKET__PRICE:
				setPrice((Integer)newValue);
				return;
			case TicketPackage.INTERCITY_TICKET__STAMPED:
				setStamped((Boolean)newValue);
				return;
			case TicketPackage.INTERCITY_TICKET__COPY_TYPE:
				setCopyType((CopyType)newValue);
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
			case TicketPackage.INTERCITY_TICKET__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case TicketPackage.INTERCITY_TICKET__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case TicketPackage.INTERCITY_TICKET__STAMPED:
				setStamped(STAMPED_EDEFAULT);
				return;
			case TicketPackage.INTERCITY_TICKET__COPY_TYPE:
				setCopyType(COPY_TYPE_EDEFAULT);
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
			case TicketPackage.INTERCITY_TICKET__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
			case TicketPackage.INTERCITY_TICKET__PRICE:
				return price != PRICE_EDEFAULT;
			case TicketPackage.INTERCITY_TICKET__STAMPED:
				return stamped != STAMPED_EDEFAULT;
			case TicketPackage.INTERCITY_TICKET__COPY_TYPE:
				return copyType != COPY_TYPE_EDEFAULT;
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
		result.append(" (Usage: ");
		result.append(usage);
		result.append(", Price: ");
		result.append(price);
		result.append(", Stamped: ");
		result.append(stamped);
		result.append(", CopyType: ");
		result.append(copyType);
		result.append(')');
		return result.toString();
	}

} //IntercityTicketImpl
