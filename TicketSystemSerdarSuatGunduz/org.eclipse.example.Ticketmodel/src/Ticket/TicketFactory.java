/**
 */
package Ticket;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Ticket.TicketPackage
 * @generated
 */
public interface TicketFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TicketFactory eINSTANCE = Ticket.impl.TicketFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Urban</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Urban</em>'.
	 * @generated
	 */
	Urban createUrban();

	/**
	 * Returns a new object of class '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard</em>'.
	 * @generated
	 */
	Standard createStandard();

	/**
	 * Returns a new object of class '<em>Extra Urban</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra Urban</em>'.
	 * @generated
	 */
	ExtraUrban createExtraUrban();

	/**
	 * Returns a new object of class '<em>City Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Ticket</em>'.
	 * @generated
	 */
	CityTicket createCityTicket();

	/**
	 * Returns a new object of class '<em>Two Way</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two Way</em>'.
	 * @generated
	 */
	TwoWay createTwoWay();

	/**
	 * Returns a new object of class '<em>One Way</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Way</em>'.
	 * @generated
	 */
	OneWay createOneWay();

	/**
	 * Returns a new object of class '<em>Weekly Pass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weekly Pass</em>'.
	 * @generated
	 */
	WeeklyPass createWeeklyPass();

	/**
	 * Returns a new object of class '<em>Luggage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Luggage</em>'.
	 * @generated
	 */
	Luggage createLuggage();

	/**
	 * Returns a new object of class '<em>Cumulative Tickets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cumulative Tickets</em>'.
	 * @generated
	 */
	CumulativeTickets createCumulativeTickets();

	/**
	 * Returns a new object of class '<em>Standard Cumulative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Cumulative</em>'.
	 * @generated
	 */
	StandardCumulative createStandardCumulative();

	/**
	 * Returns a new object of class '<em>Cumulative One Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cumulative One Day</em>'.
	 * @generated
	 */
	CumulativeOneDay createCumulativeOneDay();

	/**
	 * Returns a new object of class '<em>Weekly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weekly</em>'.
	 * @generated
	 */
	Weekly createWeekly();

	/**
	 * Returns a new object of class '<em>Fair Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fair Ticket</em>'.
	 * @generated
	 */
	FairTicket createFairTicket();

	/**
	 * Returns a new object of class '<em>Intercity Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intercity Ticket</em>'.
	 * @generated
	 */
	IntercityTicket createIntercityTicket();

	/**
	 * Returns a new object of class '<em>Single Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Ticket</em>'.
	 * @generated
	 */
	SingleTicket createSingleTicket();

	/**
	 * Returns a new object of class '<em>Multi Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Journey</em>'.
	 * @generated
	 */
	MultiJourney createMultiJourney();

	/**
	 * Returns a new object of class '<em>Multi Day Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Day Ticket</em>'.
	 * @generated
	 */
	MultiDayTicket createMultiDayTicket();

	/**
	 * Returns a new object of class '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subscription</em>'.
	 * @generated
	 */
	Subscription createSubscription();

	/**
	 * Returns a new object of class '<em>Youth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Youth</em>'.
	 * @generated
	 */
	Youth createYouth();

	/**
	 * Returns a new object of class '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Child</em>'.
	 * @generated
	 */
	Child createChild();

	/**
	 * Returns a new object of class '<em>Adult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adult</em>'.
	 * @generated
	 */
	Adult createAdult();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	TicketSystem createTicketSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TicketPackage getTicketPackage();

} //TicketFactory
