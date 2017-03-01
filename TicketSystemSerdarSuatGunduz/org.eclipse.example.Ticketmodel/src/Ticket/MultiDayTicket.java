/**
 */
package Ticket;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Day Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Ticket.MultiDayTicket#getNumberOfDays <em>Number Of Days</em>}</li>
 * </ul>
 * </p>
 *
 * @see Ticket.TicketPackage#getMultiDayTicket()
 * @model
 * @generated
 */
public interface MultiDayTicket extends IntercityTicket {
	/**
	 * Returns the value of the '<em><b>Number Of Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Days</em>' attribute.
	 * @see #setNumberOfDays(String)
	 * @see Ticket.TicketPackage#getMultiDayTicket_NumberOfDays()
	 * @model
	 * @generated
	 */
	String getNumberOfDays();

	/**
	 * Sets the value of the '{@link Ticket.MultiDayTicket#getNumberOfDays <em>Number Of Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Days</em>' attribute.
	 * @see #getNumberOfDays()
	 * @generated
	 */
	void setNumberOfDays(String value);

} // MultiDayTicket
