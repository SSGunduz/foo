/**
 */
package Ticket.tests;

import Ticket.FairTicket;
import Ticket.TicketFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fair Ticket</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FairTicketTest extends CityTicketTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FairTicketTest.class);
	}

	/**
	 * Constructs a new Fair Ticket test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairTicketTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fair Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FairTicket getFixture() {
		return (FairTicket)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TicketFactory.eINSTANCE.createFairTicket());
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

} //FairTicketTest
