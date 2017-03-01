/**
 */
package Ticket.util;

import Ticket.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Ticket.TicketPackage
 * @generated
 */
public class TicketValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TicketValidator INSTANCE = new TicketValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Ticket";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TicketPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TicketPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case TicketPackage.URBAN:
				return validateUrban((Urban)value, diagnostics, context);
			case TicketPackage.STANDARD:
				return validateStandard((Standard)value, diagnostics, context);
			case TicketPackage.EXTRA_URBAN:
				return validateExtraUrban((ExtraUrban)value, diagnostics, context);
			case TicketPackage.CITY_TICKET:
				return validateCityTicket((CityTicket)value, diagnostics, context);
			case TicketPackage.TWO_WAY:
				return validateTwoWay((TwoWay)value, diagnostics, context);
			case TicketPackage.ONE_WAY:
				return validateOneWay((OneWay)value, diagnostics, context);
			case TicketPackage.WEEKLY_PASS:
				return validateWeeklyPass((WeeklyPass)value, diagnostics, context);
			case TicketPackage.LUGGAGE:
				return validateLuggage((Luggage)value, diagnostics, context);
			case TicketPackage.CUMULATIVE_TICKETS:
				return validateCumulativeTickets((CumulativeTickets)value, diagnostics, context);
			case TicketPackage.STANDARD_CUMULATIVE:
				return validateStandardCumulative((StandardCumulative)value, diagnostics, context);
			case TicketPackage.CUMULATIVE_ONE_DAY:
				return validateCumulativeOneDay((CumulativeOneDay)value, diagnostics, context);
			case TicketPackage.WEEKLY:
				return validateWeekly((Weekly)value, diagnostics, context);
			case TicketPackage.FAIR_TICKET:
				return validateFairTicket((FairTicket)value, diagnostics, context);
			case TicketPackage.INTERCITY_TICKET:
				return validateIntercityTicket((IntercityTicket)value, diagnostics, context);
			case TicketPackage.SINGLE_TICKET:
				return validateSingleTicket((SingleTicket)value, diagnostics, context);
			case TicketPackage.MULTI_JOURNEY:
				return validateMultiJourney((MultiJourney)value, diagnostics, context);
			case TicketPackage.MULTI_DAY_TICKET:
				return validateMultiDayTicket((MultiDayTicket)value, diagnostics, context);
			case TicketPackage.SUBSCRIPTION:
				return validateSubscription((Subscription)value, diagnostics, context);
			case TicketPackage.YOUTH:
				return validateYouth((Youth)value, diagnostics, context);
			case TicketPackage.CHILD:
				return validateChild((Child)value, diagnostics, context);
			case TicketPackage.ADULT:
				return validateAdult((Adult)value, diagnostics, context);
			case TicketPackage.TICKET_SYSTEM:
				return validateTicketSystem((TicketSystem)value, diagnostics, context);
			case TicketPackage.AREA:
				return validateArea((Area)value, diagnostics, context);
			case TicketPackage.COPY_TYPE:
				return validateCopyType((CopyType)value, diagnostics, context);
			case TicketPackage.FIERA_TICKET:
				return validateFieraTicket((FieraTicket)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_mustHaveName(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeIsPositive(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_IDsAreUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeCategory(person, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustHaveName constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__MUST_HAVE_NAME__EEXPRESSION = "Name<>null";

	/**
	 * Validates the mustHaveName constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_mustHaveName(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TicketPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustHaveName",
				 PERSON__MUST_HAVE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AgeIsPositive constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__AGE_IS_POSITIVE__EEXPRESSION = "self.Age>0";

	/**
	 * Validates the AgeIsPositive constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_AgeIsPositive(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TicketPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AgeIsPositive",
				 PERSON__AGE_IS_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IDsAreUnique constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__IDS_ARE_UNIQUE__EEXPRESSION = "self.subscription-> forAll(c1,c2| c1<>c2 implies c1.ID <> c2.ID)";

	/**
	 * Validates the IDsAreUnique constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_IDsAreUnique(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TicketPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IDsAreUnique",
				 PERSON__IDS_ARE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AgeCategory constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__AGE_CATEGORY__EEXPRESSION = "\n" +
		"\t\tif (Age>=7 and Age<25) then \n" +
		"\t\t\t'Youth' \n" +
		"\t\telse if (Age > 25) then \n" +
		"\t\t\t'Adult' \n" +
		"\t\telse \n" +
		"\t \t\t'Child'\n" +
		"\t \tendif endif";

	/**
	 * Validates the AgeCategory constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_AgeCategory(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TicketPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AgeCategory",
				 PERSON__AGE_CATEGORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrban(Urban urban, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(urban, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(urban, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(urban, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandard(Standard standard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(standard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(standard, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(standard, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtraUrban(ExtraUrban extraUrban, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extraUrban, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extraUrban, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(extraUrban, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCityTicket(CityTicket cityTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cityTicket, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cityTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(cityTicket, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PricePositive constraint of '<em>City Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITY_TICKET__PRICE_POSITIVE__EEXPRESSION = "Price>0";

	/**
	 * Validates the PricePositive constraint of '<em>City Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCityTicket_PricePositive(CityTicket cityTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TicketPackage.Literals.CITY_TICKET,
				 cityTicket,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PricePositive",
				 CITY_TICKET__PRICE_POSITIVE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTwoWay(TwoWay twoWay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(twoWay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(twoWay, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(twoWay, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneWay(OneWay oneWay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(oneWay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(oneWay, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(oneWay, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeeklyPass(WeeklyPass weeklyPass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(weeklyPass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(weeklyPass, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(weeklyPass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLuggage(Luggage luggage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(luggage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(luggage, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(luggage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCumulativeTickets(CumulativeTickets cumulativeTickets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cumulativeTickets, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cumulativeTickets, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(cumulativeTickets, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardCumulative(StandardCumulative standardCumulative, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(standardCumulative, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(standardCumulative, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(standardCumulative, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCumulativeOneDay(CumulativeOneDay cumulativeOneDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cumulativeOneDay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cumulativeOneDay, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(cumulativeOneDay, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWeekly(Weekly weekly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(weekly, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(weekly, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(weekly, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFairTicket(FairTicket fairTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fairTicket, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fairTicket, diagnostics, context);
		if (result || diagnostics != null) result &= validateCityTicket_PricePositive(fairTicket, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntercityTicket(IntercityTicket intercityTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intercityTicket, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleTicket(SingleTicket singleTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleTicket, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiJourney(MultiJourney multiJourney, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiJourney, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiJourney, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiJourney_NumberOfJourneys(multiJourney, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NumberOfJourneys constraint of '<em>Multi Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MULTI_JOURNEY__NUMBER_OF_JOURNEYS__EEXPRESSION = "NumberOfJourney=10 or NumberOfJourney=5 or NumberOfJourney=15";

	/**
	 * Validates the NumberOfJourneys constraint of '<em>Multi Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiJourney_NumberOfJourneys(MultiJourney multiJourney, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TicketPackage.Literals.MULTI_JOURNEY,
				 multiJourney,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NumberOfJourneys",
				 MULTI_JOURNEY__NUMBER_OF_JOURNEYS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiDayTicket(MultiDayTicket multiDayTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiDayTicket, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubscription(Subscription subscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYouth(Youth youth, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(youth, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_mustHaveName(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeIsPositive(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_IDsAreUnique(youth, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeCategory(youth, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChild(Child child, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(child, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(child, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(child, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_mustHaveName(child, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeIsPositive(child, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_IDsAreUnique(child, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeCategory(child, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdult(Adult adult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(adult, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_mustHaveName(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeIsPositive(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_IDsAreUnique(adult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_AgeCategory(adult, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicketSystem(TicketSystem ticketSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ticketSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyType(CopyType copyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieraTicket(FieraTicket fieraTicket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TicketValidator
