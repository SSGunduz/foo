/**
 */
package Ticket.impl;

import Ticket.FairTicket;
import Ticket.FieraTicket;
import Ticket.TicketPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fair Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Ticket.impl.FairTicketImpl#getFieraTicket <em>Fiera Ticket</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FairTicketImpl extends CityTicketImpl implements FairTicket {
	/**
	 * The default value of the '{@link #getFieraTicket() <em>Fiera Ticket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieraTicket()
	 * @generated
	 * @ordered
	 */
	protected static final FieraTicket FIERA_TICKET_EDEFAULT = FieraTicket.SINGLE;

	/**
	 * The cached value of the '{@link #getFieraTicket() <em>Fiera Ticket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieraTicket()
	 * @generated
	 * @ordered
	 */
	protected FieraTicket fieraTicket = FIERA_TICKET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FairTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TicketPackage.Literals.FAIR_TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieraTicket getFieraTicket() {
		return fieraTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieraTicket(FieraTicket newFieraTicket) {
		FieraTicket oldFieraTicket = fieraTicket;
		fieraTicket = newFieraTicket == null ? FIERA_TICKET_EDEFAULT : newFieraTicket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.FAIR_TICKET__FIERA_TICKET, oldFieraTicket, fieraTicket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TicketPackage.FAIR_TICKET__FIERA_TICKET:
				return getFieraTicket();
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
			case TicketPackage.FAIR_TICKET__FIERA_TICKET:
				setFieraTicket((FieraTicket)newValue);
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
			case TicketPackage.FAIR_TICKET__FIERA_TICKET:
				setFieraTicket(FIERA_TICKET_EDEFAULT);
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
			case TicketPackage.FAIR_TICKET__FIERA_TICKET:
				return fieraTicket != FIERA_TICKET_EDEFAULT;
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
		result.append(" (FieraTicket: ");
		result.append(fieraTicket);
		result.append(')');
		return result.toString();
	}

} //FairTicketImpl
