/**
 */
package Ticket.util;

import Ticket.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Ticket.TicketPackage
 * @generated
 */
public class TicketAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TicketPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TicketPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketSwitch<Adapter> modelSwitch =
		new TicketSwitch<Adapter>() {
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseUrban(Urban object) {
				return createUrbanAdapter();
			}
			@Override
			public Adapter caseStandard(Standard object) {
				return createStandardAdapter();
			}
			@Override
			public Adapter caseExtraUrban(ExtraUrban object) {
				return createExtraUrbanAdapter();
			}
			@Override
			public Adapter caseCityTicket(CityTicket object) {
				return createCityTicketAdapter();
			}
			@Override
			public Adapter caseTwoWay(TwoWay object) {
				return createTwoWayAdapter();
			}
			@Override
			public Adapter caseOneWay(OneWay object) {
				return createOneWayAdapter();
			}
			@Override
			public Adapter caseWeeklyPass(WeeklyPass object) {
				return createWeeklyPassAdapter();
			}
			@Override
			public Adapter caseLuggage(Luggage object) {
				return createLuggageAdapter();
			}
			@Override
			public Adapter caseCumulativeTickets(CumulativeTickets object) {
				return createCumulativeTicketsAdapter();
			}
			@Override
			public Adapter caseStandardCumulative(StandardCumulative object) {
				return createStandardCumulativeAdapter();
			}
			@Override
			public Adapter caseCumulativeOneDay(CumulativeOneDay object) {
				return createCumulativeOneDayAdapter();
			}
			@Override
			public Adapter caseWeekly(Weekly object) {
				return createWeeklyAdapter();
			}
			@Override
			public Adapter caseFairTicket(FairTicket object) {
				return createFairTicketAdapter();
			}
			@Override
			public Adapter caseIntercityTicket(IntercityTicket object) {
				return createIntercityTicketAdapter();
			}
			@Override
			public Adapter caseSingleTicket(SingleTicket object) {
				return createSingleTicketAdapter();
			}
			@Override
			public Adapter caseMultiJourney(MultiJourney object) {
				return createMultiJourneyAdapter();
			}
			@Override
			public Adapter caseMultiDayTicket(MultiDayTicket object) {
				return createMultiDayTicketAdapter();
			}
			@Override
			public Adapter caseSubscription(Subscription object) {
				return createSubscriptionAdapter();
			}
			@Override
			public Adapter caseYouth(Youth object) {
				return createYouthAdapter();
			}
			@Override
			public Adapter caseChild(Child object) {
				return createChildAdapter();
			}
			@Override
			public Adapter caseAdult(Adult object) {
				return createAdultAdapter();
			}
			@Override
			public Adapter caseTicketSystem(TicketSystem object) {
				return createTicketSystemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Urban <em>Urban</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Urban
	 * @generated
	 */
	public Adapter createUrbanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Standard
	 * @generated
	 */
	public Adapter createStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.ExtraUrban <em>Extra Urban</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.ExtraUrban
	 * @generated
	 */
	public Adapter createExtraUrbanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.CityTicket <em>City Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.CityTicket
	 * @generated
	 */
	public Adapter createCityTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.TwoWay <em>Two Way</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.TwoWay
	 * @generated
	 */
	public Adapter createTwoWayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.OneWay <em>One Way</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.OneWay
	 * @generated
	 */
	public Adapter createOneWayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.WeeklyPass <em>Weekly Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.WeeklyPass
	 * @generated
	 */
	public Adapter createWeeklyPassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Luggage <em>Luggage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Luggage
	 * @generated
	 */
	public Adapter createLuggageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.CumulativeTickets <em>Cumulative Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.CumulativeTickets
	 * @generated
	 */
	public Adapter createCumulativeTicketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.StandardCumulative <em>Standard Cumulative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.StandardCumulative
	 * @generated
	 */
	public Adapter createStandardCumulativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.CumulativeOneDay <em>Cumulative One Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.CumulativeOneDay
	 * @generated
	 */
	public Adapter createCumulativeOneDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Weekly <em>Weekly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Weekly
	 * @generated
	 */
	public Adapter createWeeklyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.FairTicket <em>Fair Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.FairTicket
	 * @generated
	 */
	public Adapter createFairTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.IntercityTicket <em>Intercity Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.IntercityTicket
	 * @generated
	 */
	public Adapter createIntercityTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.SingleTicket <em>Single Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.SingleTicket
	 * @generated
	 */
	public Adapter createSingleTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.MultiJourney <em>Multi Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.MultiJourney
	 * @generated
	 */
	public Adapter createMultiJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.MultiDayTicket <em>Multi Day Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.MultiDayTicket
	 * @generated
	 */
	public Adapter createMultiDayTicketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Subscription
	 * @generated
	 */
	public Adapter createSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Youth <em>Youth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Youth
	 * @generated
	 */
	public Adapter createYouthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Child
	 * @generated
	 */
	public Adapter createChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.Adult <em>Adult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.Adult
	 * @generated
	 */
	public Adapter createAdultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Ticket.TicketSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Ticket.TicketSystem
	 * @generated
	 */
	public Adapter createTicketSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TicketAdapterFactory
