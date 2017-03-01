/**
 */
package Ticket.impl;

import Ticket.MultiDayTicket;
import Ticket.TicketPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Day Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Ticket.impl.MultiDayTicketImpl#getNumberOfDays <em>Number Of Days</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiDayTicketImpl extends IntercityTicketImpl implements MultiDayTicket {
	/**
	 * The default value of the '{@link #getNumberOfDays() <em>Number Of Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDays()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_OF_DAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfDays() <em>Number Of Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfDays()
	 * @generated
	 * @ordered
	 */
	protected String numberOfDays = NUMBER_OF_DAYS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiDayTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TicketPackage.Literals.MULTI_DAY_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumberOfDays() {
		return numberOfDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfDays(String newNumberOfDays) {
		String oldNumberOfDays = numberOfDays;
		numberOfDays = newNumberOfDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.MULTI_DAY_TICKET__NUMBER_OF_DAYS, oldNumberOfDays, numberOfDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TicketPackage.MULTI_DAY_TICKET__NUMBER_OF_DAYS:
				return getNumberOfDays();
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
			case TicketPackage.MULTI_DAY_TICKET__NUMBER_OF_DAYS:
				setNumberOfDays((String)newValue);
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
			case TicketPackage.MULTI_DAY_TICKET__NUMBER_OF_DAYS:
				setNumberOfDays(NUMBER_OF_DAYS_EDEFAULT);
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
			case TicketPackage.MULTI_DAY_TICKET__NUMBER_OF_DAYS:
				return NUMBER_OF_DAYS_EDEFAULT == null ? numberOfDays != null : !NUMBER_OF_DAYS_EDEFAULT.equals(numberOfDays);
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
		result.append(" (NumberOfDays: ");
		result.append(numberOfDays);
		result.append(')');
		return result.toString();
	}

} //MultiDayTicketImpl
