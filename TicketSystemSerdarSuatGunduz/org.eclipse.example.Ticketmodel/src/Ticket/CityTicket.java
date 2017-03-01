/**
 */
package Ticket;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Ticket.CityTicket#getPrice <em>Price</em>}</li>
 *   <li>{@link Ticket.CityTicket#getValidity <em>Validity</em>}</li>
 *   <li>{@link Ticket.CityTicket#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see Ticket.TicketPackage#getCityTicket()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PricePositive'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PricePositive='Price>0'"
 * @generated
 */
public interface CityTicket extends EObject {
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
	 * @see Ticket.TicketPackage#getCityTicket_Price()
	 * @model
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link Ticket.CityTicket#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(String)
	 * @see Ticket.TicketPackage#getCityTicket_Validity()
	 * @model
	 * @generated
	 */
	String getValidity();

	/**
	 * Sets the value of the '{@link Ticket.CityTicket#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see Ticket.TicketPackage#getCityTicket_Date()
	 * @model default="null"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link Ticket.CityTicket#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

} // CityTicket
