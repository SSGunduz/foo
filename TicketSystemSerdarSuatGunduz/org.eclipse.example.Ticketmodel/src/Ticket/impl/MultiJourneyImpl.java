/**
 */
package Ticket.impl;

import Ticket.MultiJourney;
import Ticket.TicketPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Ticket.impl.MultiJourneyImpl#getNumberOfJourney <em>Number Of Journey</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiJourneyImpl extends IntercityTicketImpl implements MultiJourney {
	/**
	 * The default value of the '{@link #getNumberOfJourney() <em>Number Of Journey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfJourney()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_JOURNEY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfJourney() <em>Number Of Journey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfJourney()
	 * @generated
	 * @ordered
	 */
	protected int numberOfJourney = NUMBER_OF_JOURNEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiJourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TicketPackage.Literals.MULTI_JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfJourney() {
		return numberOfJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfJourney(int newNumberOfJourney) {
		int oldNumberOfJourney = numberOfJourney;
		numberOfJourney = newNumberOfJourney;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TicketPackage.MULTI_JOURNEY__NUMBER_OF_JOURNEY, oldNumberOfJourney, numberOfJourney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TicketPackage.MULTI_JOURNEY__NUMBER_OF_JOURNEY:
				return getNumberOfJourney();
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
			case TicketPackage.MULTI_JOURNEY__NUMBER_OF_JOURNEY:
				setNumberOfJourney((Integer)newValue);
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
			case TicketPackage.MULTI_JOURNEY__NUMBER_OF_JOURNEY:
				setNumberOfJourney(NUMBER_OF_JOURNEY_EDEFAULT);
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
			case TicketPackage.MULTI_JOURNEY__NUMBER_OF_JOURNEY:
				return numberOfJourney != NUMBER_OF_JOURNEY_EDEFAULT;
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
		result.append(" (NumberOfJourney: ");
		result.append(numberOfJourney);
		result.append(')');
		return result.toString();
	}

} //MultiJourneyImpl
