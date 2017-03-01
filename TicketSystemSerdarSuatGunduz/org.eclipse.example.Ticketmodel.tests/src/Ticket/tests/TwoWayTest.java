/**
 */
package Ticket.tests;

import Ticket.TicketFactory;
import Ticket.TwoWay;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Two Way</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwoWayTest extends UrbanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TwoWayTest.class);
	}

	/**
	 * Constructs a new Two Way test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoWayTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Two Way test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TwoWay getFixture() {
		return (TwoWay)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TicketFactory.eINSTANCE.createTwoWay());
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

} //TwoWayTest
