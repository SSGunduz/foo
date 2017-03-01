/**
 */
package Ticket;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra Urban</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Ticket.ExtraUrban#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see Ticket.TicketPackage#getExtraUrban()
 * @model
 * @generated
 */
public interface ExtraUrban extends CityTicket {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(int)
	 * @see Ticket.TicketPackage#getExtraUrban_Zone()
	 * @model
	 * @generated
	 */
	int getZone();

	/**
	 * Sets the value of the '{@link Ticket.ExtraUrban#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(int value);

} // ExtraUrban
