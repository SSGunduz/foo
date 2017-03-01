/**
 */
package Ticket.tests;

import Ticket.TicketFactory;
import Ticket.WeeklyPass;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Weekly Pass</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeeklyPassTest extends ExtraUrbanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WeeklyPassTest.class);
	}

	/**
	 * Constructs a new Weekly Pass test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeeklyPassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Weekly Pass test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WeeklyPass getFixture() {
		return (WeeklyPass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TicketFactory.eINSTANCE.createWeeklyPass());
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

} //WeeklyPassTest
