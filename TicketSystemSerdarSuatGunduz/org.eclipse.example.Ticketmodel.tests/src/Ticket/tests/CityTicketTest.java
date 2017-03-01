/**
 */
package Ticket.tests;

import Ticket.CityTicket;
import Ticket.TicketFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>City Ticket</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CityTicketTest extends TestCase {

	/**
	 * The fixture for this City Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityTicket fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CityTicketTest.class);
	}

	/**
	 * Constructs a new City Ticket test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityTicketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this City Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CityTicket fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this City Ticket test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityTicket getFixture() {
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
		setFixture(TicketFactory.eINSTANCE.createCityTicket());
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

} //CityTicketTest
