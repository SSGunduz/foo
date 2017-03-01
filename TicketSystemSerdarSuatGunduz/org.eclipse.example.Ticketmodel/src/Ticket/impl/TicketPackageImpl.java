/**
 */
package Ticket.impl;

import Ticket.Adult;
import Ticket.Area;
import Ticket.Child;
import Ticket.CityTicket;
import Ticket.CopyType;
import Ticket.CumulativeOneDay;
import Ticket.CumulativeTickets;
import Ticket.ExtraUrban;
import Ticket.FairTicket;
import Ticket.FieraTicket;
import Ticket.IntercityTicket;
import Ticket.Luggage;
import Ticket.MultiDayTicket;
import Ticket.MultiJourney;
import Ticket.OneWay;
import Ticket.Person;
import Ticket.SingleTicket;
import Ticket.Standard;
import Ticket.StandardCumulative;
import Ticket.Subscription;
import Ticket.TicketFactory;
import Ticket.TicketPackage;
import Ticket.TicketSystem;
import Ticket.TwoWay;
import Ticket.Urban;
import Ticket.Weekly;
import Ticket.WeeklyPass;
import Ticket.Youth;

import Ticket.util.TicketValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TicketPackageImpl extends EPackageImpl implements TicketPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urbanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraUrbanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoWayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneWayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weeklyPassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cumulativeTicketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardCumulativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cumulativeOneDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weeklyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercityTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiJourneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiDayTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass youthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ticketSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum areaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum copyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieraTicketEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Ticket.TicketPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TicketPackageImpl() {
		super(eNS_URI, TicketFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TicketPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TicketPackage init() {
		if (isInited) return (TicketPackage)EPackage.Registry.INSTANCE.getEPackage(TicketPackage.eNS_URI);

		// Obtain or create and register package
		TicketPackageImpl theTicketPackage = (TicketPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TicketPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TicketPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTicketPackage.createPackageContents();

		// Initialize created meta-data
		theTicketPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTicketPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TicketValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTicketPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TicketPackage.eNS_URI, theTicketPackage);
		return theTicketPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_IntercityTickets() {
		return (EReference)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_CityTickets() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Age() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Subscription() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrban() {
		return urbanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtraUrban() {
		return extraUrbanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtraUrban_Zone() {
		return (EAttribute)extraUrbanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCityTicket() {
		return cityTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCityTicket_Price() {
		return (EAttribute)cityTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCityTicket_Validity() {
		return (EAttribute)cityTicketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCityTicket_Date() {
		return (EAttribute)cityTicketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwoWay() {
		return twoWayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneWay() {
		return oneWayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeeklyPass() {
		return weeklyPassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggage() {
		return luggageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCumulativeTickets() {
		return cumulativeTicketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardCumulative() {
		return standardCumulativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCumulativeOneDay() {
		return cumulativeOneDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCumulativeOneDay_Area() {
		return (EAttribute)cumulativeOneDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeekly() {
		return weeklyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFairTicket() {
		return fairTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFairTicket_FieraTicket() {
		return (EAttribute)fairTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntercityTicket() {
		return intercityTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntercityTicket_Usage() {
		return (EAttribute)intercityTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntercityTicket_Price() {
		return (EAttribute)intercityTicketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntercityTicket_Stamped() {
		return (EAttribute)intercityTicketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntercityTicket_CopyType() {
		return (EAttribute)intercityTicketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleTicket() {
		return singleTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiJourney() {
		return multiJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiJourney_NumberOfJourney() {
		return (EAttribute)multiJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiDayTicket() {
		return multiDayTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiDayTicket_NumberOfDays() {
		return (EAttribute)multiDayTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscription() {
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscription_DaysNumber() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscription_Price() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscription_ID() {
		return (EAttribute)subscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYouth() {
		return youthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdult() {
		return adultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTicketSystem() {
		return ticketSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTicketSystem_City() {
		return (EAttribute)ticketSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTicketSystem_Persons() {
		return (EReference)ticketSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArea() {
		return areaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCopyType() {
		return copyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFieraTicket() {
		return fieraTicketEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TicketFactory getTicketFactory() {
		return (TicketFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__INTERCITY_TICKETS);
		createEReference(personEClass, PERSON__CITY_TICKETS);
		createEAttribute(personEClass, PERSON__AGE);
		createEReference(personEClass, PERSON__SUBSCRIPTION);

		urbanEClass = createEClass(URBAN);

		standardEClass = createEClass(STANDARD);

		extraUrbanEClass = createEClass(EXTRA_URBAN);
		createEAttribute(extraUrbanEClass, EXTRA_URBAN__ZONE);

		cityTicketEClass = createEClass(CITY_TICKET);
		createEAttribute(cityTicketEClass, CITY_TICKET__PRICE);
		createEAttribute(cityTicketEClass, CITY_TICKET__VALIDITY);
		createEAttribute(cityTicketEClass, CITY_TICKET__DATE);

		twoWayEClass = createEClass(TWO_WAY);

		oneWayEClass = createEClass(ONE_WAY);

		weeklyPassEClass = createEClass(WEEKLY_PASS);

		luggageEClass = createEClass(LUGGAGE);

		cumulativeTicketsEClass = createEClass(CUMULATIVE_TICKETS);

		standardCumulativeEClass = createEClass(STANDARD_CUMULATIVE);

		cumulativeOneDayEClass = createEClass(CUMULATIVE_ONE_DAY);
		createEAttribute(cumulativeOneDayEClass, CUMULATIVE_ONE_DAY__AREA);

		weeklyEClass = createEClass(WEEKLY);

		fairTicketEClass = createEClass(FAIR_TICKET);
		createEAttribute(fairTicketEClass, FAIR_TICKET__FIERA_TICKET);

		intercityTicketEClass = createEClass(INTERCITY_TICKET);
		createEAttribute(intercityTicketEClass, INTERCITY_TICKET__USAGE);
		createEAttribute(intercityTicketEClass, INTERCITY_TICKET__PRICE);
		createEAttribute(intercityTicketEClass, INTERCITY_TICKET__STAMPED);
		createEAttribute(intercityTicketEClass, INTERCITY_TICKET__COPY_TYPE);

		singleTicketEClass = createEClass(SINGLE_TICKET);

		multiJourneyEClass = createEClass(MULTI_JOURNEY);
		createEAttribute(multiJourneyEClass, MULTI_JOURNEY__NUMBER_OF_JOURNEY);

		multiDayTicketEClass = createEClass(MULTI_DAY_TICKET);
		createEAttribute(multiDayTicketEClass, MULTI_DAY_TICKET__NUMBER_OF_DAYS);

		subscriptionEClass = createEClass(SUBSCRIPTION);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__DAYS_NUMBER);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__PRICE);
		createEAttribute(subscriptionEClass, SUBSCRIPTION__ID);

		youthEClass = createEClass(YOUTH);

		childEClass = createEClass(CHILD);

		adultEClass = createEClass(ADULT);

		ticketSystemEClass = createEClass(TICKET_SYSTEM);
		createEAttribute(ticketSystemEClass, TICKET_SYSTEM__CITY);
		createEReference(ticketSystemEClass, TICKET_SYSTEM__PERSONS);

		// Create enums
		areaEEnum = createEEnum(AREA);
		copyTypeEEnum = createEEnum(COPY_TYPE);
		fieraTicketEEnum = createEEnum(FIERA_TICKET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		urbanEClass.getESuperTypes().add(this.getCityTicket());
		standardEClass.getESuperTypes().add(this.getExtraUrban());
		extraUrbanEClass.getESuperTypes().add(this.getCityTicket());
		twoWayEClass.getESuperTypes().add(this.getUrban());
		oneWayEClass.getESuperTypes().add(this.getUrban());
		weeklyPassEClass.getESuperTypes().add(this.getExtraUrban());
		luggageEClass.getESuperTypes().add(this.getExtraUrban());
		cumulativeTicketsEClass.getESuperTypes().add(this.getCityTicket());
		standardCumulativeEClass.getESuperTypes().add(this.getCumulativeTickets());
		cumulativeOneDayEClass.getESuperTypes().add(this.getCumulativeTickets());
		weeklyEClass.getESuperTypes().add(this.getCumulativeTickets());
		fairTicketEClass.getESuperTypes().add(this.getCityTicket());
		singleTicketEClass.getESuperTypes().add(this.getIntercityTicket());
		multiJourneyEClass.getESuperTypes().add(this.getIntercityTicket());
		multiDayTicketEClass.getESuperTypes().add(this.getIntercityTicket());
		youthEClass.getESuperTypes().add(this.getPerson());
		childEClass.getESuperTypes().add(this.getPerson());
		adultEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_IntercityTickets(), this.getIntercityTicket(), null, "IntercityTickets", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_CityTickets(), this.getCityTicket(), null, "CityTickets", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Age(), ecorePackage.getEInt(), "Age", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Subscription(), this.getSubscription(), null, "subscription", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urbanEClass, Urban.class, "Urban", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extraUrbanEClass, ExtraUrban.class, "ExtraUrban", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraUrban_Zone(), ecorePackage.getEInt(), "Zone", null, 0, 1, ExtraUrban.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityTicketEClass, CityTicket.class, "CityTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCityTicket_Price(), ecorePackage.getEInt(), "Price", null, 0, 1, CityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityTicket_Validity(), ecorePackage.getEString(), "Validity", null, 0, 1, CityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCityTicket_Date(), ecorePackage.getEString(), "Date", "null", 0, 1, CityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoWayEClass, TwoWay.class, "TwoWay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneWayEClass, OneWay.class, "OneWay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weeklyPassEClass, WeeklyPass.class, "WeeklyPass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(luggageEClass, Luggage.class, "Luggage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cumulativeTicketsEClass, CumulativeTickets.class, "CumulativeTickets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardCumulativeEClass, StandardCumulative.class, "StandardCumulative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cumulativeOneDayEClass, CumulativeOneDay.class, "CumulativeOneDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCumulativeOneDay_Area(), this.getArea(), "Area", null, 0, 1, CumulativeOneDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weeklyEClass, Weekly.class, "Weekly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fairTicketEClass, FairTicket.class, "FairTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFairTicket_FieraTicket(), this.getFieraTicket(), "FieraTicket", null, 0, 1, FairTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intercityTicketEClass, IntercityTicket.class, "IntercityTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntercityTicket_Usage(), ecorePackage.getEString(), "Usage", null, 0, 1, IntercityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntercityTicket_Price(), ecorePackage.getEInt(), "Price", null, 0, 1, IntercityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntercityTicket_Stamped(), ecorePackage.getEBoolean(), "Stamped", null, 0, 1, IntercityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntercityTicket_CopyType(), this.getCopyType(), "CopyType", null, 0, 1, IntercityTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleTicketEClass, SingleTicket.class, "SingleTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiJourneyEClass, MultiJourney.class, "MultiJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiJourney_NumberOfJourney(), ecorePackage.getEInt(), "NumberOfJourney", null, 0, 1, MultiJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiDayTicketEClass, MultiDayTicket.class, "MultiDayTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiDayTicket_NumberOfDays(), ecorePackage.getEString(), "NumberOfDays", null, 0, 1, MultiDayTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptionEClass, Subscription.class, "Subscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubscription_DaysNumber(), ecorePackage.getEInt(), "DaysNumber", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_Price(), ecorePackage.getEInt(), "Price", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubscription_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Subscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(youthEClass, Youth.class, "Youth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adultEClass, Adult.class, "Adult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ticketSystemEClass, TicketSystem.class, "TicketSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTicketSystem_City(), ecorePackage.getEString(), "City", null, 0, 1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTicketSystem_Persons(), this.getPerson(), null, "persons", null, 0, -1, TicketSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(areaEEnum, Area.class, "Area");
		addEEnumLiteral(areaEEnum, Area.LARGE);
		addEEnumLiteral(areaEEnum, Area.MEDIUM);
		addEEnumLiteral(areaEEnum, Area.SMALL);

		initEEnum(copyTypeEEnum, CopyType.class, "CopyType");
		addEEnumLiteral(copyTypeEEnum, CopyType.DIGITAL);
		addEEnumLiteral(copyTypeEEnum, CopyType.PAPER);
		addEEnumLiteral(copyTypeEEnum, CopyType.ELECTRONIC);

		initEEnum(fieraTicketEEnum, FieraTicket.class, "FieraTicket");
		addEEnumLiteral(fieraTicketEEnum, FieraTicket.SINGLE);
		addEEnumLiteral(fieraTicketEEnum, FieraTicket.RETURN);
		addEEnumLiteral(fieraTicketEEnum, FieraTicket.DAY_PASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// null
		createNullAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "constraints", "mustHaveName AgeIsPositive IDsAreUnique AgeCategory"
		   });	
		addAnnotation
		  (cityTicketEClass, 
		   source, 
		   new String[] {
			 "constraints", "PricePositive"
		   });	
		addAnnotation
		  (multiJourneyEClass, 
		   source, 
		   new String[] {
			 "constraints", "NumberOfJourneys"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "mustHaveName", "Name<>null",
			 "AgeIsPositive", "self.Age>0",
			 "IDsAreUnique", "self.subscription-> forAll(c1,c2| c1<>c2 implies c1.ID <> c2.ID)",
			 "AgeCategory", "\n\t\tif (Age>=7 and Age<25) then \n\t\t\t\'Youth\' \n\t\telse if (Age > 25) then \n\t\t\t\'Adult\' \n\t\telse \n\t \t\t\'Child\'\n\t \tendif endif"
		   });	
		addAnnotation
		  (cityTicketEClass, 
		   source, 
		   new String[] {
			 "PricePositive", "Price>0"
		   });	
		addAnnotation
		  (multiJourneyEClass, 
		   source, 
		   new String[] {
			 "NumberOfJourneys", "NumberOfJourney=10 or NumberOfJourney=5 or NumberOfJourney=15"
		   });
	}

} //TicketPackageImpl
