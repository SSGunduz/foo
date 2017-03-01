/**
 */
package Ticket;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Ticket.TicketFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface TicketPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ticket";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/example/Ticket";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.example.Ticket";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TicketPackage eINSTANCE = Ticket.impl.TicketPackageImpl.init();

	/**
	 * The meta object id for the '{@link Ticket.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.PersonImpl
	 * @see Ticket.impl.TicketPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Intercity Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INTERCITY_TICKETS = 1;

	/**
	 * The feature id for the '<em><b>City Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CITY_TICKETS = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 3;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUBSCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.CityTicketImpl <em>City Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.CityTicketImpl
	 * @see Ticket.impl.TicketPackageImpl#getCityTicket()
	 * @generated
	 */
	int CITY_TICKET = 4;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TICKET__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TICKET__VALIDITY = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TICKET__DATE = 2;

	/**
	 * The number of structural features of the '<em>City Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TICKET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>City Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_TICKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.UrbanImpl <em>Urban</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.UrbanImpl
	 * @see Ticket.impl.TicketPackageImpl#getUrban()
	 * @generated
	 */
	int URBAN = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URBAN__PRICE = CITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URBAN__VALIDITY = CITY_TICKET__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URBAN__DATE = CITY_TICKET__DATE;

	/**
	 * The number of structural features of the '<em>Urban</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URBAN_FEATURE_COUNT = CITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Urban</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URBAN_OPERATION_COUNT = CITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.ExtraUrbanImpl <em>Extra Urban</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.ExtraUrbanImpl
	 * @see Ticket.impl.TicketPackageImpl#getExtraUrban()
	 * @generated
	 */
	int EXTRA_URBAN = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_URBAN__PRICE = CITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_URBAN__VALIDITY = CITY_TICKET__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_URBAN__DATE = CITY_TICKET__DATE;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_URBAN__ZONE = CITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extra Urban</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_URBAN_FEATURE_COUNT = CITY_TICKET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extra Urban</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_URBAN_OPERATION_COUNT = CITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.StandardImpl
	 * @see Ticket.impl.TicketPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__PRICE = EXTRA_URBAN__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__VALIDITY = EXTRA_URBAN__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__DATE = EXTRA_URBAN__DATE;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ZONE = EXTRA_URBAN__ZONE;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = EXTRA_URBAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = EXTRA_URBAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.TwoWayImpl <em>Two Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.TwoWayImpl
	 * @see Ticket.impl.TicketPackageImpl#getTwoWay()
	 * @generated
	 */
	int TWO_WAY = 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY__PRICE = URBAN__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY__VALIDITY = URBAN__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY__DATE = URBAN__DATE;

	/**
	 * The number of structural features of the '<em>Two Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_FEATURE_COUNT = URBAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Two Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_WAY_OPERATION_COUNT = URBAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.OneWayImpl <em>One Way</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.OneWayImpl
	 * @see Ticket.impl.TicketPackageImpl#getOneWay()
	 * @generated
	 */
	int ONE_WAY = 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY__PRICE = URBAN__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY__VALIDITY = URBAN__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY__DATE = URBAN__DATE;

	/**
	 * The number of structural features of the '<em>One Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_FEATURE_COUNT = URBAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Way</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_WAY_OPERATION_COUNT = URBAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.WeeklyPassImpl <em>Weekly Pass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.WeeklyPassImpl
	 * @see Ticket.impl.TicketPackageImpl#getWeeklyPass()
	 * @generated
	 */
	int WEEKLY_PASS = 7;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_PASS__PRICE = EXTRA_URBAN__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_PASS__VALIDITY = EXTRA_URBAN__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_PASS__DATE = EXTRA_URBAN__DATE;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_PASS__ZONE = EXTRA_URBAN__ZONE;

	/**
	 * The number of structural features of the '<em>Weekly Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_PASS_FEATURE_COUNT = EXTRA_URBAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weekly Pass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_PASS_OPERATION_COUNT = EXTRA_URBAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.LuggageImpl <em>Luggage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.LuggageImpl
	 * @see Ticket.impl.TicketPackageImpl#getLuggage()
	 * @generated
	 */
	int LUGGAGE = 8;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__PRICE = EXTRA_URBAN__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__VALIDITY = EXTRA_URBAN__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__DATE = EXTRA_URBAN__DATE;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE__ZONE = EXTRA_URBAN__ZONE;

	/**
	 * The number of structural features of the '<em>Luggage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_FEATURE_COUNT = EXTRA_URBAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Luggage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_OPERATION_COUNT = EXTRA_URBAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.CumulativeTicketsImpl <em>Cumulative Tickets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.CumulativeTicketsImpl
	 * @see Ticket.impl.TicketPackageImpl#getCumulativeTickets()
	 * @generated
	 */
	int CUMULATIVE_TICKETS = 9;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_TICKETS__PRICE = CITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_TICKETS__VALIDITY = CITY_TICKET__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_TICKETS__DATE = CITY_TICKET__DATE;

	/**
	 * The number of structural features of the '<em>Cumulative Tickets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_TICKETS_FEATURE_COUNT = CITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cumulative Tickets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_TICKETS_OPERATION_COUNT = CITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.StandardCumulativeImpl <em>Standard Cumulative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.StandardCumulativeImpl
	 * @see Ticket.impl.TicketPackageImpl#getStandardCumulative()
	 * @generated
	 */
	int STANDARD_CUMULATIVE = 10;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CUMULATIVE__PRICE = CUMULATIVE_TICKETS__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CUMULATIVE__VALIDITY = CUMULATIVE_TICKETS__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CUMULATIVE__DATE = CUMULATIVE_TICKETS__DATE;

	/**
	 * The number of structural features of the '<em>Standard Cumulative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CUMULATIVE_FEATURE_COUNT = CUMULATIVE_TICKETS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Cumulative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_CUMULATIVE_OPERATION_COUNT = CUMULATIVE_TICKETS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.CumulativeOneDayImpl <em>Cumulative One Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.CumulativeOneDayImpl
	 * @see Ticket.impl.TicketPackageImpl#getCumulativeOneDay()
	 * @generated
	 */
	int CUMULATIVE_ONE_DAY = 11;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_ONE_DAY__PRICE = CUMULATIVE_TICKETS__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_ONE_DAY__VALIDITY = CUMULATIVE_TICKETS__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_ONE_DAY__DATE = CUMULATIVE_TICKETS__DATE;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_ONE_DAY__AREA = CUMULATIVE_TICKETS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cumulative One Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_ONE_DAY_FEATURE_COUNT = CUMULATIVE_TICKETS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cumulative One Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUMULATIVE_ONE_DAY_OPERATION_COUNT = CUMULATIVE_TICKETS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.WeeklyImpl <em>Weekly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.WeeklyImpl
	 * @see Ticket.impl.TicketPackageImpl#getWeekly()
	 * @generated
	 */
	int WEEKLY = 12;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY__PRICE = CUMULATIVE_TICKETS__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY__VALIDITY = CUMULATIVE_TICKETS__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY__DATE = CUMULATIVE_TICKETS__DATE;

	/**
	 * The number of structural features of the '<em>Weekly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_FEATURE_COUNT = CUMULATIVE_TICKETS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weekly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEEKLY_OPERATION_COUNT = CUMULATIVE_TICKETS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.FairTicketImpl <em>Fair Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.FairTicketImpl
	 * @see Ticket.impl.TicketPackageImpl#getFairTicket()
	 * @generated
	 */
	int FAIR_TICKET = 13;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_TICKET__PRICE = CITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_TICKET__VALIDITY = CITY_TICKET__VALIDITY;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_TICKET__DATE = CITY_TICKET__DATE;

	/**
	 * The feature id for the '<em><b>Fiera Ticket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_TICKET__FIERA_TICKET = CITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fair Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_TICKET_FEATURE_COUNT = CITY_TICKET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fair Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_TICKET_OPERATION_COUNT = CITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.IntercityTicketImpl <em>Intercity Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.IntercityTicketImpl
	 * @see Ticket.impl.TicketPackageImpl#getIntercityTicket()
	 * @generated
	 */
	int INTERCITY_TICKET = 14;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TICKET__USAGE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TICKET__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Stamped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TICKET__STAMPED = 2;

	/**
	 * The feature id for the '<em><b>Copy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TICKET__COPY_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Intercity Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TICKET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Intercity Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TICKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.SingleTicketImpl <em>Single Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.SingleTicketImpl
	 * @see Ticket.impl.TicketPackageImpl#getSingleTicket()
	 * @generated
	 */
	int SINGLE_TICKET = 15;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TICKET__USAGE = INTERCITY_TICKET__USAGE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TICKET__PRICE = INTERCITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Stamped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TICKET__STAMPED = INTERCITY_TICKET__STAMPED;

	/**
	 * The feature id for the '<em><b>Copy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TICKET__COPY_TYPE = INTERCITY_TICKET__COPY_TYPE;

	/**
	 * The number of structural features of the '<em>Single Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TICKET_FEATURE_COUNT = INTERCITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TICKET_OPERATION_COUNT = INTERCITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.MultiJourneyImpl <em>Multi Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.MultiJourneyImpl
	 * @see Ticket.impl.TicketPackageImpl#getMultiJourney()
	 * @generated
	 */
	int MULTI_JOURNEY = 16;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY__USAGE = INTERCITY_TICKET__USAGE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY__PRICE = INTERCITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Stamped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY__STAMPED = INTERCITY_TICKET__STAMPED;

	/**
	 * The feature id for the '<em><b>Copy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY__COPY_TYPE = INTERCITY_TICKET__COPY_TYPE;

	/**
	 * The feature id for the '<em><b>Number Of Journey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY__NUMBER_OF_JOURNEY = INTERCITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY_FEATURE_COUNT = INTERCITY_TICKET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_JOURNEY_OPERATION_COUNT = INTERCITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.MultiDayTicketImpl <em>Multi Day Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.MultiDayTicketImpl
	 * @see Ticket.impl.TicketPackageImpl#getMultiDayTicket()
	 * @generated
	 */
	int MULTI_DAY_TICKET = 17;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET__USAGE = INTERCITY_TICKET__USAGE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET__PRICE = INTERCITY_TICKET__PRICE;

	/**
	 * The feature id for the '<em><b>Stamped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET__STAMPED = INTERCITY_TICKET__STAMPED;

	/**
	 * The feature id for the '<em><b>Copy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET__COPY_TYPE = INTERCITY_TICKET__COPY_TYPE;

	/**
	 * The feature id for the '<em><b>Number Of Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET__NUMBER_OF_DAYS = INTERCITY_TICKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Day Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET_FEATURE_COUNT = INTERCITY_TICKET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Day Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DAY_TICKET_OPERATION_COUNT = INTERCITY_TICKET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.SubscriptionImpl
	 * @see Ticket.impl.TicketPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 18;

	/**
	 * The feature id for the '<em><b>Days Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__DAYS_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PRICE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ID = 2;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.YouthImpl <em>Youth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.YouthImpl
	 * @see Ticket.impl.TicketPackageImpl#getYouth()
	 * @generated
	 */
	int YOUTH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Intercity Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH__INTERCITY_TICKETS = PERSON__INTERCITY_TICKETS;

	/**
	 * The feature id for the '<em><b>City Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH__CITY_TICKETS = PERSON__CITY_TICKETS;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH__SUBSCRIPTION = PERSON__SUBSCRIPTION;

	/**
	 * The number of structural features of the '<em>Youth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Youth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YOUTH_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.ChildImpl
	 * @see Ticket.impl.TicketPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Intercity Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__INTERCITY_TICKETS = PERSON__INTERCITY_TICKETS;

	/**
	 * The feature id for the '<em><b>City Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__CITY_TICKETS = PERSON__CITY_TICKETS;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__SUBSCRIPTION = PERSON__SUBSCRIPTION;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.AdultImpl <em>Adult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.AdultImpl
	 * @see Ticket.impl.TicketPackageImpl#getAdult()
	 * @generated
	 */
	int ADULT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Intercity Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT__INTERCITY_TICKETS = PERSON__INTERCITY_TICKETS;

	/**
	 * The feature id for the '<em><b>City Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT__CITY_TICKETS = PERSON__CITY_TICKETS;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT__SUBSCRIPTION = PERSON__SUBSCRIPTION;

	/**
	 * The number of structural features of the '<em>Adult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Adult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADULT_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ticket.impl.TicketSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.impl.TicketSystemImpl
	 * @see Ticket.impl.TicketPackageImpl#getTicketSystem()
	 * @generated
	 */
	int TICKET_SYSTEM = 22;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_SYSTEM__CITY = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_SYSTEM__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ticket.Area <em>Area</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.Area
	 * @see Ticket.impl.TicketPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 23;

	/**
	 * The meta object id for the '{@link Ticket.CopyType <em>Copy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.CopyType
	 * @see Ticket.impl.TicketPackageImpl#getCopyType()
	 * @generated
	 */
	int COPY_TYPE = 24;

	/**
	 * The meta object id for the '{@link Ticket.FieraTicket <em>Fiera Ticket</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ticket.FieraTicket
	 * @see Ticket.impl.TicketPackageImpl#getFieraTicket()
	 * @generated
	 */
	int FIERA_TICKET = 25;


	/**
	 * Returns the meta object for class '{@link Ticket.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Ticket.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ticket.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Ticket.Person#getIntercityTickets <em>Intercity Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intercity Tickets</em>'.
	 * @see Ticket.Person#getIntercityTickets()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_IntercityTickets();

	/**
	 * Returns the meta object for the containment reference list '{@link Ticket.Person#getCityTickets <em>City Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>City Tickets</em>'.
	 * @see Ticket.Person#getCityTickets()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_CityTickets();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see Ticket.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the containment reference '{@link Ticket.Person#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscription</em>'.
	 * @see Ticket.Person#getSubscription()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Subscription();

	/**
	 * Returns the meta object for class '{@link Ticket.Urban <em>Urban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Urban</em>'.
	 * @see Ticket.Urban
	 * @generated
	 */
	EClass getUrban();

	/**
	 * Returns the meta object for class '{@link Ticket.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see Ticket.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for class '{@link Ticket.ExtraUrban <em>Extra Urban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Urban</em>'.
	 * @see Ticket.ExtraUrban
	 * @generated
	 */
	EClass getExtraUrban();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.ExtraUrban#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see Ticket.ExtraUrban#getZone()
	 * @see #getExtraUrban()
	 * @generated
	 */
	EAttribute getExtraUrban_Zone();

	/**
	 * Returns the meta object for class '{@link Ticket.CityTicket <em>City Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Ticket</em>'.
	 * @see Ticket.CityTicket
	 * @generated
	 */
	EClass getCityTicket();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.CityTicket#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ticket.CityTicket#getPrice()
	 * @see #getCityTicket()
	 * @generated
	 */
	EAttribute getCityTicket_Price();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.CityTicket#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see Ticket.CityTicket#getValidity()
	 * @see #getCityTicket()
	 * @generated
	 */
	EAttribute getCityTicket_Validity();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.CityTicket#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see Ticket.CityTicket#getDate()
	 * @see #getCityTicket()
	 * @generated
	 */
	EAttribute getCityTicket_Date();

	/**
	 * Returns the meta object for class '{@link Ticket.TwoWay <em>Two Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Way</em>'.
	 * @see Ticket.TwoWay
	 * @generated
	 */
	EClass getTwoWay();

	/**
	 * Returns the meta object for class '{@link Ticket.OneWay <em>One Way</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Way</em>'.
	 * @see Ticket.OneWay
	 * @generated
	 */
	EClass getOneWay();

	/**
	 * Returns the meta object for class '{@link Ticket.WeeklyPass <em>Weekly Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekly Pass</em>'.
	 * @see Ticket.WeeklyPass
	 * @generated
	 */
	EClass getWeeklyPass();

	/**
	 * Returns the meta object for class '{@link Ticket.Luggage <em>Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage</em>'.
	 * @see Ticket.Luggage
	 * @generated
	 */
	EClass getLuggage();

	/**
	 * Returns the meta object for class '{@link Ticket.CumulativeTickets <em>Cumulative Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cumulative Tickets</em>'.
	 * @see Ticket.CumulativeTickets
	 * @generated
	 */
	EClass getCumulativeTickets();

	/**
	 * Returns the meta object for class '{@link Ticket.StandardCumulative <em>Standard Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Cumulative</em>'.
	 * @see Ticket.StandardCumulative
	 * @generated
	 */
	EClass getStandardCumulative();

	/**
	 * Returns the meta object for class '{@link Ticket.CumulativeOneDay <em>Cumulative One Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cumulative One Day</em>'.
	 * @see Ticket.CumulativeOneDay
	 * @generated
	 */
	EClass getCumulativeOneDay();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.CumulativeOneDay#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see Ticket.CumulativeOneDay#getArea()
	 * @see #getCumulativeOneDay()
	 * @generated
	 */
	EAttribute getCumulativeOneDay_Area();

	/**
	 * Returns the meta object for class '{@link Ticket.Weekly <em>Weekly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weekly</em>'.
	 * @see Ticket.Weekly
	 * @generated
	 */
	EClass getWeekly();

	/**
	 * Returns the meta object for class '{@link Ticket.FairTicket <em>Fair Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair Ticket</em>'.
	 * @see Ticket.FairTicket
	 * @generated
	 */
	EClass getFairTicket();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.FairTicket#getFieraTicket <em>Fiera Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiera Ticket</em>'.
	 * @see Ticket.FairTicket#getFieraTicket()
	 * @see #getFairTicket()
	 * @generated
	 */
	EAttribute getFairTicket_FieraTicket();

	/**
	 * Returns the meta object for class '{@link Ticket.IntercityTicket <em>Intercity Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intercity Ticket</em>'.
	 * @see Ticket.IntercityTicket
	 * @generated
	 */
	EClass getIntercityTicket();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.IntercityTicket#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see Ticket.IntercityTicket#getUsage()
	 * @see #getIntercityTicket()
	 * @generated
	 */
	EAttribute getIntercityTicket_Usage();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.IntercityTicket#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ticket.IntercityTicket#getPrice()
	 * @see #getIntercityTicket()
	 * @generated
	 */
	EAttribute getIntercityTicket_Price();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.IntercityTicket#isStamped <em>Stamped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stamped</em>'.
	 * @see Ticket.IntercityTicket#isStamped()
	 * @see #getIntercityTicket()
	 * @generated
	 */
	EAttribute getIntercityTicket_Stamped();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.IntercityTicket#getCopyType <em>Copy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Type</em>'.
	 * @see Ticket.IntercityTicket#getCopyType()
	 * @see #getIntercityTicket()
	 * @generated
	 */
	EAttribute getIntercityTicket_CopyType();

	/**
	 * Returns the meta object for class '{@link Ticket.SingleTicket <em>Single Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Ticket</em>'.
	 * @see Ticket.SingleTicket
	 * @generated
	 */
	EClass getSingleTicket();

	/**
	 * Returns the meta object for class '{@link Ticket.MultiJourney <em>Multi Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Journey</em>'.
	 * @see Ticket.MultiJourney
	 * @generated
	 */
	EClass getMultiJourney();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.MultiJourney#getNumberOfJourney <em>Number Of Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Journey</em>'.
	 * @see Ticket.MultiJourney#getNumberOfJourney()
	 * @see #getMultiJourney()
	 * @generated
	 */
	EAttribute getMultiJourney_NumberOfJourney();

	/**
	 * Returns the meta object for class '{@link Ticket.MultiDayTicket <em>Multi Day Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Day Ticket</em>'.
	 * @see Ticket.MultiDayTicket
	 * @generated
	 */
	EClass getMultiDayTicket();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.MultiDayTicket#getNumberOfDays <em>Number Of Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Days</em>'.
	 * @see Ticket.MultiDayTicket#getNumberOfDays()
	 * @see #getMultiDayTicket()
	 * @generated
	 */
	EAttribute getMultiDayTicket_NumberOfDays();

	/**
	 * Returns the meta object for class '{@link Ticket.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see Ticket.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.Subscription#getDaysNumber <em>Days Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days Number</em>'.
	 * @see Ticket.Subscription#getDaysNumber()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_DaysNumber();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.Subscription#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ticket.Subscription#getPrice()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Price();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.Subscription#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Ticket.Subscription#getID()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_ID();

	/**
	 * Returns the meta object for class '{@link Ticket.Youth <em>Youth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Youth</em>'.
	 * @see Ticket.Youth
	 * @generated
	 */
	EClass getYouth();

	/**
	 * Returns the meta object for class '{@link Ticket.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see Ticket.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for class '{@link Ticket.Adult <em>Adult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adult</em>'.
	 * @see Ticket.Adult
	 * @generated
	 */
	EClass getAdult();

	/**
	 * Returns the meta object for class '{@link Ticket.TicketSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see Ticket.TicketSystem
	 * @generated
	 */
	EClass getTicketSystem();

	/**
	 * Returns the meta object for the attribute '{@link Ticket.TicketSystem#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Ticket.TicketSystem#getCity()
	 * @see #getTicketSystem()
	 * @generated
	 */
	EAttribute getTicketSystem_City();

	/**
	 * Returns the meta object for the containment reference list '{@link Ticket.TicketSystem#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see Ticket.TicketSystem#getPersons()
	 * @see #getTicketSystem()
	 * @generated
	 */
	EReference getTicketSystem_Persons();

	/**
	 * Returns the meta object for enum '{@link Ticket.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Area</em>'.
	 * @see Ticket.Area
	 * @generated
	 */
	EEnum getArea();

	/**
	 * Returns the meta object for enum '{@link Ticket.CopyType <em>Copy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Copy Type</em>'.
	 * @see Ticket.CopyType
	 * @generated
	 */
	EEnum getCopyType();

	/**
	 * Returns the meta object for enum '{@link Ticket.FieraTicket <em>Fiera Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fiera Ticket</em>'.
	 * @see Ticket.FieraTicket
	 * @generated
	 */
	EEnum getFieraTicket();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TicketFactory getTicketFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Ticket.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.PersonImpl
		 * @see Ticket.impl.TicketPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Intercity Tickets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__INTERCITY_TICKETS = eINSTANCE.getPerson_IntercityTickets();

		/**
		 * The meta object literal for the '<em><b>City Tickets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CITY_TICKETS = eINSTANCE.getPerson_CityTickets();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__SUBSCRIPTION = eINSTANCE.getPerson_Subscription();

		/**
		 * The meta object literal for the '{@link Ticket.impl.UrbanImpl <em>Urban</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.UrbanImpl
		 * @see Ticket.impl.TicketPackageImpl#getUrban()
		 * @generated
		 */
		EClass URBAN = eINSTANCE.getUrban();

		/**
		 * The meta object literal for the '{@link Ticket.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.StandardImpl
		 * @see Ticket.impl.TicketPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '{@link Ticket.impl.ExtraUrbanImpl <em>Extra Urban</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.ExtraUrbanImpl
		 * @see Ticket.impl.TicketPackageImpl#getExtraUrban()
		 * @generated
		 */
		EClass EXTRA_URBAN = eINSTANCE.getExtraUrban();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA_URBAN__ZONE = eINSTANCE.getExtraUrban_Zone();

		/**
		 * The meta object literal for the '{@link Ticket.impl.CityTicketImpl <em>City Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.CityTicketImpl
		 * @see Ticket.impl.TicketPackageImpl#getCityTicket()
		 * @generated
		 */
		EClass CITY_TICKET = eINSTANCE.getCityTicket();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_TICKET__PRICE = eINSTANCE.getCityTicket_Price();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_TICKET__VALIDITY = eINSTANCE.getCityTicket_Validity();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_TICKET__DATE = eINSTANCE.getCityTicket_Date();

		/**
		 * The meta object literal for the '{@link Ticket.impl.TwoWayImpl <em>Two Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.TwoWayImpl
		 * @see Ticket.impl.TicketPackageImpl#getTwoWay()
		 * @generated
		 */
		EClass TWO_WAY = eINSTANCE.getTwoWay();

		/**
		 * The meta object literal for the '{@link Ticket.impl.OneWayImpl <em>One Way</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.OneWayImpl
		 * @see Ticket.impl.TicketPackageImpl#getOneWay()
		 * @generated
		 */
		EClass ONE_WAY = eINSTANCE.getOneWay();

		/**
		 * The meta object literal for the '{@link Ticket.impl.WeeklyPassImpl <em>Weekly Pass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.WeeklyPassImpl
		 * @see Ticket.impl.TicketPackageImpl#getWeeklyPass()
		 * @generated
		 */
		EClass WEEKLY_PASS = eINSTANCE.getWeeklyPass();

		/**
		 * The meta object literal for the '{@link Ticket.impl.LuggageImpl <em>Luggage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.LuggageImpl
		 * @see Ticket.impl.TicketPackageImpl#getLuggage()
		 * @generated
		 */
		EClass LUGGAGE = eINSTANCE.getLuggage();

		/**
		 * The meta object literal for the '{@link Ticket.impl.CumulativeTicketsImpl <em>Cumulative Tickets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.CumulativeTicketsImpl
		 * @see Ticket.impl.TicketPackageImpl#getCumulativeTickets()
		 * @generated
		 */
		EClass CUMULATIVE_TICKETS = eINSTANCE.getCumulativeTickets();

		/**
		 * The meta object literal for the '{@link Ticket.impl.StandardCumulativeImpl <em>Standard Cumulative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.StandardCumulativeImpl
		 * @see Ticket.impl.TicketPackageImpl#getStandardCumulative()
		 * @generated
		 */
		EClass STANDARD_CUMULATIVE = eINSTANCE.getStandardCumulative();

		/**
		 * The meta object literal for the '{@link Ticket.impl.CumulativeOneDayImpl <em>Cumulative One Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.CumulativeOneDayImpl
		 * @see Ticket.impl.TicketPackageImpl#getCumulativeOneDay()
		 * @generated
		 */
		EClass CUMULATIVE_ONE_DAY = eINSTANCE.getCumulativeOneDay();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUMULATIVE_ONE_DAY__AREA = eINSTANCE.getCumulativeOneDay_Area();

		/**
		 * The meta object literal for the '{@link Ticket.impl.WeeklyImpl <em>Weekly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.WeeklyImpl
		 * @see Ticket.impl.TicketPackageImpl#getWeekly()
		 * @generated
		 */
		EClass WEEKLY = eINSTANCE.getWeekly();

		/**
		 * The meta object literal for the '{@link Ticket.impl.FairTicketImpl <em>Fair Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.FairTicketImpl
		 * @see Ticket.impl.TicketPackageImpl#getFairTicket()
		 * @generated
		 */
		EClass FAIR_TICKET = eINSTANCE.getFairTicket();

		/**
		 * The meta object literal for the '<em><b>Fiera Ticket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAIR_TICKET__FIERA_TICKET = eINSTANCE.getFairTicket_FieraTicket();

		/**
		 * The meta object literal for the '{@link Ticket.impl.IntercityTicketImpl <em>Intercity Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.IntercityTicketImpl
		 * @see Ticket.impl.TicketPackageImpl#getIntercityTicket()
		 * @generated
		 */
		EClass INTERCITY_TICKET = eINSTANCE.getIntercityTicket();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCITY_TICKET__USAGE = eINSTANCE.getIntercityTicket_Usage();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCITY_TICKET__PRICE = eINSTANCE.getIntercityTicket_Price();

		/**
		 * The meta object literal for the '<em><b>Stamped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCITY_TICKET__STAMPED = eINSTANCE.getIntercityTicket_Stamped();

		/**
		 * The meta object literal for the '<em><b>Copy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERCITY_TICKET__COPY_TYPE = eINSTANCE.getIntercityTicket_CopyType();

		/**
		 * The meta object literal for the '{@link Ticket.impl.SingleTicketImpl <em>Single Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.SingleTicketImpl
		 * @see Ticket.impl.TicketPackageImpl#getSingleTicket()
		 * @generated
		 */
		EClass SINGLE_TICKET = eINSTANCE.getSingleTicket();

		/**
		 * The meta object literal for the '{@link Ticket.impl.MultiJourneyImpl <em>Multi Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.MultiJourneyImpl
		 * @see Ticket.impl.TicketPackageImpl#getMultiJourney()
		 * @generated
		 */
		EClass MULTI_JOURNEY = eINSTANCE.getMultiJourney();

		/**
		 * The meta object literal for the '<em><b>Number Of Journey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_JOURNEY__NUMBER_OF_JOURNEY = eINSTANCE.getMultiJourney_NumberOfJourney();

		/**
		 * The meta object literal for the '{@link Ticket.impl.MultiDayTicketImpl <em>Multi Day Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.MultiDayTicketImpl
		 * @see Ticket.impl.TicketPackageImpl#getMultiDayTicket()
		 * @generated
		 */
		EClass MULTI_DAY_TICKET = eINSTANCE.getMultiDayTicket();

		/**
		 * The meta object literal for the '<em><b>Number Of Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_DAY_TICKET__NUMBER_OF_DAYS = eINSTANCE.getMultiDayTicket_NumberOfDays();

		/**
		 * The meta object literal for the '{@link Ticket.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.SubscriptionImpl
		 * @see Ticket.impl.TicketPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Days Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__DAYS_NUMBER = eINSTANCE.getSubscription_DaysNumber();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__PRICE = eINSTANCE.getSubscription_Price();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__ID = eINSTANCE.getSubscription_ID();

		/**
		 * The meta object literal for the '{@link Ticket.impl.YouthImpl <em>Youth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.YouthImpl
		 * @see Ticket.impl.TicketPackageImpl#getYouth()
		 * @generated
		 */
		EClass YOUTH = eINSTANCE.getYouth();

		/**
		 * The meta object literal for the '{@link Ticket.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.ChildImpl
		 * @see Ticket.impl.TicketPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '{@link Ticket.impl.AdultImpl <em>Adult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.AdultImpl
		 * @see Ticket.impl.TicketPackageImpl#getAdult()
		 * @generated
		 */
		EClass ADULT = eINSTANCE.getAdult();

		/**
		 * The meta object literal for the '{@link Ticket.impl.TicketSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.impl.TicketSystemImpl
		 * @see Ticket.impl.TicketPackageImpl#getTicketSystem()
		 * @generated
		 */
		EClass TICKET_SYSTEM = eINSTANCE.getTicketSystem();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET_SYSTEM__CITY = eINSTANCE.getTicketSystem_City();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TICKET_SYSTEM__PERSONS = eINSTANCE.getTicketSystem_Persons();

		/**
		 * The meta object literal for the '{@link Ticket.Area <em>Area</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.Area
		 * @see Ticket.impl.TicketPackageImpl#getArea()
		 * @generated
		 */
		EEnum AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '{@link Ticket.CopyType <em>Copy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.CopyType
		 * @see Ticket.impl.TicketPackageImpl#getCopyType()
		 * @generated
		 */
		EEnum COPY_TYPE = eINSTANCE.getCopyType();

		/**
		 * The meta object literal for the '{@link Ticket.FieraTicket <em>Fiera Ticket</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ticket.FieraTicket
		 * @see Ticket.impl.TicketPackageImpl#getFieraTicket()
		 * @generated
		 */
		EEnum FIERA_TICKET = eINSTANCE.getFieraTicket();

	}

} //TicketPackage
