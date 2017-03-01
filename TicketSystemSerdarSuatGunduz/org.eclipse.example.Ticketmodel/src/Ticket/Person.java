/**
 */
package Ticket;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Ticket.Person#getName <em>Name</em>}</li>
 *   <li>{@link Ticket.Person#getIntercityTickets <em>Intercity Tickets</em>}</li>
 *   <li>{@link Ticket.Person#getCityTickets <em>City Tickets</em>}</li>
 *   <li>{@link Ticket.Person#getAge <em>Age</em>}</li>
 *   <li>{@link Ticket.Person#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see Ticket.TicketPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveName AgeIsPositive IDsAreUnique AgeCategory'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustHaveName='Name<>null' AgeIsPositive='self.Age>0' IDsAreUnique='self.subscription-> forAll(c1,c2| c1<>c2 implies c1.ID <> c2.ID)' AgeCategory='\n\t\tif (Age>=7 and Age<25) then \n\t\t\t\'Youth\' \n\t\telse if (Age > 25) then \n\t\t\t\'Adult\' \n\t\telse \n\t \t\t\'Child\'\n\t \tendif endif'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Ticket.TicketPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Ticket.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Intercity Tickets</b></em>' containment reference list.
	 * The list contents are of type {@link Ticket.IntercityTicket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercity Tickets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercity Tickets</em>' containment reference list.
	 * @see Ticket.TicketPackage#getPerson_IntercityTickets()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntercityTicket> getIntercityTickets();

	/**
	 * Returns the value of the '<em><b>City Tickets</b></em>' containment reference list.
	 * The list contents are of type {@link Ticket.CityTicket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Tickets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Tickets</em>' containment reference list.
	 * @see Ticket.TicketPackage#getPerson_CityTickets()
	 * @model containment="true"
	 * @generated
	 */
	EList<CityTicket> getCityTickets();

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see Ticket.TicketPackage#getPerson_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link Ticket.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Subscription)
	 * @see Ticket.TicketPackage#getPerson_Subscription()
	 * @model containment="true"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link Ticket.Person#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Subscription value);

} // Person
