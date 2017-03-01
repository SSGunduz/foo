/**
 */
package Ticket.util;

import Ticket.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Ticket.TicketPackage
 * @generated
 */
public class TicketSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TicketPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketSwitch() {
		if (modelPackage == null) {
			modelPackage = TicketPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TicketPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.URBAN: {
				Urban urban = (Urban)theEObject;
				T result = caseUrban(urban);
				if (result == null) result = caseCityTicket(urban);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.STANDARD: {
				Standard standard = (Standard)theEObject;
				T result = caseStandard(standard);
				if (result == null) result = caseExtraUrban(standard);
				if (result == null) result = caseCityTicket(standard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.EXTRA_URBAN: {
				ExtraUrban extraUrban = (ExtraUrban)theEObject;
				T result = caseExtraUrban(extraUrban);
				if (result == null) result = caseCityTicket(extraUrban);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.CITY_TICKET: {
				CityTicket cityTicket = (CityTicket)theEObject;
				T result = caseCityTicket(cityTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.TWO_WAY: {
				TwoWay twoWay = (TwoWay)theEObject;
				T result = caseTwoWay(twoWay);
				if (result == null) result = caseUrban(twoWay);
				if (result == null) result = caseCityTicket(twoWay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.ONE_WAY: {
				OneWay oneWay = (OneWay)theEObject;
				T result = caseOneWay(oneWay);
				if (result == null) result = caseUrban(oneWay);
				if (result == null) result = caseCityTicket(oneWay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.WEEKLY_PASS: {
				WeeklyPass weeklyPass = (WeeklyPass)theEObject;
				T result = caseWeeklyPass(weeklyPass);
				if (result == null) result = caseExtraUrban(weeklyPass);
				if (result == null) result = caseCityTicket(weeklyPass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.LUGGAGE: {
				Luggage luggage = (Luggage)theEObject;
				T result = caseLuggage(luggage);
				if (result == null) result = caseExtraUrban(luggage);
				if (result == null) result = caseCityTicket(luggage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.CUMULATIVE_TICKETS: {
				CumulativeTickets cumulativeTickets = (CumulativeTickets)theEObject;
				T result = caseCumulativeTickets(cumulativeTickets);
				if (result == null) result = caseCityTicket(cumulativeTickets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.STANDARD_CUMULATIVE: {
				StandardCumulative standardCumulative = (StandardCumulative)theEObject;
				T result = caseStandardCumulative(standardCumulative);
				if (result == null) result = caseCumulativeTickets(standardCumulative);
				if (result == null) result = caseCityTicket(standardCumulative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.CUMULATIVE_ONE_DAY: {
				CumulativeOneDay cumulativeOneDay = (CumulativeOneDay)theEObject;
				T result = caseCumulativeOneDay(cumulativeOneDay);
				if (result == null) result = caseCumulativeTickets(cumulativeOneDay);
				if (result == null) result = caseCityTicket(cumulativeOneDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.WEEKLY: {
				Weekly weekly = (Weekly)theEObject;
				T result = caseWeekly(weekly);
				if (result == null) result = caseCumulativeTickets(weekly);
				if (result == null) result = caseCityTicket(weekly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.FAIR_TICKET: {
				FairTicket fairTicket = (FairTicket)theEObject;
				T result = caseFairTicket(fairTicket);
				if (result == null) result = caseCityTicket(fairTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.INTERCITY_TICKET: {
				IntercityTicket intercityTicket = (IntercityTicket)theEObject;
				T result = caseIntercityTicket(intercityTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.SINGLE_TICKET: {
				SingleTicket singleTicket = (SingleTicket)theEObject;
				T result = caseSingleTicket(singleTicket);
				if (result == null) result = caseIntercityTicket(singleTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.MULTI_JOURNEY: {
				MultiJourney multiJourney = (MultiJourney)theEObject;
				T result = caseMultiJourney(multiJourney);
				if (result == null) result = caseIntercityTicket(multiJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.MULTI_DAY_TICKET: {
				MultiDayTicket multiDayTicket = (MultiDayTicket)theEObject;
				T result = caseMultiDayTicket(multiDayTicket);
				if (result == null) result = caseIntercityTicket(multiDayTicket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.SUBSCRIPTION: {
				Subscription subscription = (Subscription)theEObject;
				T result = caseSubscription(subscription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.YOUTH: {
				Youth youth = (Youth)theEObject;
				T result = caseYouth(youth);
				if (result == null) result = casePerson(youth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.CHILD: {
				Child child = (Child)theEObject;
				T result = caseChild(child);
				if (result == null) result = casePerson(child);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.ADULT: {
				Adult adult = (Adult)theEObject;
				T result = caseAdult(adult);
				if (result == null) result = casePerson(adult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TicketPackage.TICKET_SYSTEM: {
				TicketSystem ticketSystem = (TicketSystem)theEObject;
				T result = caseTicketSystem(ticketSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Urban</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Urban</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrban(Urban object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard(Standard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extra Urban</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extra Urban</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraUrban(ExtraUrban object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>City Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>City Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCityTicket(CityTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Way</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Way</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoWay(TwoWay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Way</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Way</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneWay(OneWay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weekly Pass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weekly Pass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeeklyPass(WeeklyPass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luggage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luggage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuggage(Luggage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cumulative Tickets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cumulative Tickets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCumulativeTickets(CumulativeTickets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Cumulative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Cumulative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardCumulative(StandardCumulative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cumulative One Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cumulative One Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCumulativeOneDay(CumulativeOneDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weekly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weekly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeekly(Weekly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fair Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fair Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFairTicket(FairTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercity Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercity Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercityTicket(IntercityTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTicket(SingleTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiJourney(MultiJourney object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Day Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Day Ticket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiDayTicket(MultiDayTicket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscription(Subscription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Youth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Youth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYouth(Youth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChild(Child object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdult(Adult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTicketSystem(TicketSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TicketSwitch
