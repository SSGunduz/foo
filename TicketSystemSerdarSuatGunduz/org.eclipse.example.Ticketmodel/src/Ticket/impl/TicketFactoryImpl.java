/**
 */
package Ticket.impl;

import Ticket.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TicketFactoryImpl extends EFactoryImpl implements TicketFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TicketFactory init() {
		try {
			TicketFactory theTicketFactory = (TicketFactory)EPackage.Registry.INSTANCE.getEFactory(TicketPackage.eNS_URI);
			if (theTicketFactory != null) {
				return theTicketFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TicketFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TicketPackage.PERSON: return createPerson();
			case TicketPackage.URBAN: return createUrban();
			case TicketPackage.STANDARD: return createStandard();
			case TicketPackage.EXTRA_URBAN: return createExtraUrban();
			case TicketPackage.CITY_TICKET: return createCityTicket();
			case TicketPackage.TWO_WAY: return createTwoWay();
			case TicketPackage.ONE_WAY: return createOneWay();
			case TicketPackage.WEEKLY_PASS: return createWeeklyPass();
			case TicketPackage.LUGGAGE: return createLuggage();
			case TicketPackage.CUMULATIVE_TICKETS: return createCumulativeTickets();
			case TicketPackage.STANDARD_CUMULATIVE: return createStandardCumulative();
			case TicketPackage.CUMULATIVE_ONE_DAY: return createCumulativeOneDay();
			case TicketPackage.WEEKLY: return createWeekly();
			case TicketPackage.FAIR_TICKET: return createFairTicket();
			case TicketPackage.INTERCITY_TICKET: return createIntercityTicket();
			case TicketPackage.SINGLE_TICKET: return createSingleTicket();
			case TicketPackage.MULTI_JOURNEY: return createMultiJourney();
			case TicketPackage.MULTI_DAY_TICKET: return createMultiDayTicket();
			case TicketPackage.SUBSCRIPTION: return createSubscription();
			case TicketPackage.YOUTH: return createYouth();
			case TicketPackage.CHILD: return createChild();
			case TicketPackage.ADULT: return createAdult();
			case TicketPackage.TICKET_SYSTEM: return createTicketSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TicketPackage.AREA:
				return createAreaFromString(eDataType, initialValue);
			case TicketPackage.COPY_TYPE:
				return createCopyTypeFromString(eDataType, initialValue);
			case TicketPackage.FIERA_TICKET:
				return createFieraTicketFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TicketPackage.AREA:
				return convertAreaToString(eDataType, instanceValue);
			case TicketPackage.COPY_TYPE:
				return convertCopyTypeToString(eDataType, instanceValue);
			case TicketPackage.FIERA_TICKET:
				return convertFieraTicketToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Urban createUrban() {
		UrbanImpl urban = new UrbanImpl();
		return urban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraUrban createExtraUrban() {
		ExtraUrbanImpl extraUrban = new ExtraUrbanImpl();
		return extraUrban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityTicket createCityTicket() {
		CityTicketImpl cityTicket = new CityTicketImpl();
		return cityTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TwoWay createTwoWay() {
		TwoWayImpl twoWay = new TwoWayImpl();
		return twoWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneWay createOneWay() {
		OneWayImpl oneWay = new OneWayImpl();
		return oneWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeeklyPass createWeeklyPass() {
		WeeklyPassImpl weeklyPass = new WeeklyPassImpl();
		return weeklyPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Luggage createLuggage() {
		LuggageImpl luggage = new LuggageImpl();
		return luggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CumulativeTickets createCumulativeTickets() {
		CumulativeTicketsImpl cumulativeTickets = new CumulativeTicketsImpl();
		return cumulativeTickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardCumulative createStandardCumulative() {
		StandardCumulativeImpl standardCumulative = new StandardCumulativeImpl();
		return standardCumulative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CumulativeOneDay createCumulativeOneDay() {
		CumulativeOneDayImpl cumulativeOneDay = new CumulativeOneDayImpl();
		return cumulativeOneDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weekly createWeekly() {
		WeeklyImpl weekly = new WeeklyImpl();
		return weekly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FairTicket createFairTicket() {
		FairTicketImpl fairTicket = new FairTicketImpl();
		return fairTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntercityTicket createIntercityTicket() {
		IntercityTicketImpl intercityTicket = new IntercityTicketImpl();
		return intercityTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTicket createSingleTicket() {
		SingleTicketImpl singleTicket = new SingleTicketImpl();
		return singleTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiJourney createMultiJourney() {
		MultiJourneyImpl multiJourney = new MultiJourneyImpl();
		return multiJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiDayTicket createMultiDayTicket() {
		MultiDayTicketImpl multiDayTicket = new MultiDayTicketImpl();
		return multiDayTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Youth createYouth() {
		YouthImpl youth = new YouthImpl();
		return youth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child createChild() {
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adult createAdult() {
		AdultImpl adult = new AdultImpl();
		return adult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketSystem createTicketSystem() {
		TicketSystemImpl ticketSystem = new TicketSystemImpl();
		return ticketSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createAreaFromString(EDataType eDataType, String initialValue) {
		Area result = Area.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAreaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyType createCopyTypeFromString(EDataType eDataType, String initialValue) {
		CopyType result = CopyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCopyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieraTicket createFieraTicketFromString(EDataType eDataType, String initialValue) {
		FieraTicket result = FieraTicket.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieraTicketToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketPackage getTicketPackage() {
		return (TicketPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TicketPackage getPackage() {
		return TicketPackage.eINSTANCE;
	}

} //TicketFactoryImpl
