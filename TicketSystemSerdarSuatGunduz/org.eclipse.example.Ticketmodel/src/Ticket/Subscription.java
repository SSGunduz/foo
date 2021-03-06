/**
 */
package Ticket;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Ticket.Subscription#getDaysNumber <em>Days Number</em>}</li>
 *   <li>{@link Ticket.Subscription#getPrice <em>Price</em>}</li>
 *   <li>{@link Ticket.Subscription#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see Ticket.TicketPackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends EObject {
	/**
	 * Returns the value of the '<em><b>Days Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days Number</em>' attribute.
	 * @see #setDaysNumber(int)
	 * @see Ticket.TicketPackage#getSubscription_DaysNumber()
	 * @model
	 * @generated
	 */
	int getDaysNumber();

	/**
	 * Sets the value of the '{@link Ticket.Subscription#getDaysNumber <em>Days Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days Number</em>' attribute.
	 * @see #getDaysNumber()
	 * @generated
	 */
	void setDaysNumber(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see Ticket.TicketPackage#getSubscription_Price()
	 * @model
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link Ticket.Subscription#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Ticket.TicketPackage#getSubscription_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Ticket.Subscription#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // Subscription
