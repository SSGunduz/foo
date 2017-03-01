/**
 */
package Ticket.tests;

import Ticket.IntercityTicket;
import Ticket.TicketFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intercity Ticket</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntercityTicketTest extends TestCase {

	/**
	 * The fixture for this Intercity Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercityTicket fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntercityTicketTest.class);
	}

	/**
	 * Constructs a new Intercity Ticket test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntercityTicketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Intercity Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IntercityTicket fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Intercity Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercityTicket getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TicketFactory.eINSTANCE.createIntercityTicket());
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

} //IntercityTicketTest