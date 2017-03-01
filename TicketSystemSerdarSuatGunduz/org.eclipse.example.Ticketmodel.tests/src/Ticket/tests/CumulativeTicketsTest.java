/**
 */
package Ticket.tests;

import Ticket.CumulativeTickets;
import Ticket.TicketFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cumulative Tickets</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CumulativeTicketsTest extends CityTicketTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CumulativeTicketsTest.class);
	}

	/**
	 * Constructs a new Cumulative Tickets test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CumulativeTicketsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cumulative Tickets test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CumulativeTickets getFixture() {
		return (CumulativeTickets)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TicketFactory.eINSTANCE.createCumulativeTickets());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CumulativeTicketsTest
