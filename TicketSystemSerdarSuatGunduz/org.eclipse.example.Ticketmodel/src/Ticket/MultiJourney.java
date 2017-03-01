/**
 */
package Ticket;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Ticket.MultiJourney#getNumberOfJourney <em>Number Of Journey</em>}</li>
 * </ul>
 * </p>
 *
 * @see Ticket.TicketPackage#getMultiJourney()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NumberOfJourneys'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NumberOfJourneys='NumberOfJourney=10 or NumberOfJourney=5 or NumberOfJourney=15'"
 * @generated
 */
public interface MultiJourney extends IntercityTicket {
	/**
	 * Returns the value of the '<em><b>Number Of Journey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Journey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Journey</em>' attribute.
	 * @see #setNumberOfJourney(int)
	 * @see Ticket.TicketPackage#getMultiJourney_NumberOfJourney()
	 * @model
	 * @generated
	 */
	int getNumberOfJourney();

	/**
	 * Sets the value of the '{@link Ticket.MultiJourney#getNumberOfJourney <em>Number Of Journey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Journey</em>' attribute.
	 * @see #getNumberOfJourney()
	 * @generated
	 */
	void setNumberOfJourney(int value);

} // MultiJourney
