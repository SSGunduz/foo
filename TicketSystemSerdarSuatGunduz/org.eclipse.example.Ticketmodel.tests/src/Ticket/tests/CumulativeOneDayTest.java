/**
 */
package Ticket.tests;

import Ticket.CumulativeOneDay;
import Ticket.TicketFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cumulative One Day</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CumulativeOneDayTest extends CumulativeTicketsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CumulativeOneDayTest.class);
	}

	/**
	 * Constructs a new Cumulative One Day test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CumulativeOneDayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cumulative One Day test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CumulativeOneDay getFixture() {
		return (CumulativeOneDay)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TicketFactory.eINSTANCE.createCumulativeOneDay());
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

} //CumulativeOneDayTest
