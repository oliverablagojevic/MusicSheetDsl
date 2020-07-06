/**
 */
package musicSheetDsl.impl;

import musicSheetDsl.Accidental;
import musicSheetDsl.AccidentalType;
import musicSheetDsl.Articulation;
import musicSheetDsl.ArticulationType;
import musicSheetDsl.Bracket;
import musicSheetDsl.BracketType;
import musicSheetDsl.Clef;
import musicSheetDsl.ClefType;
import musicSheetDsl.Composition;
import musicSheetDsl.MusicSheetDslFactory;
import musicSheetDsl.MusicSheetDslPackage;
import musicSheetDsl.Note;
import musicSheetDsl.NoteDuration;
import musicSheetDsl.NoteName;
import musicSheetDsl.Ornament;
import musicSheetDsl.OrnamentType;
import musicSheetDsl.Repetition;
import musicSheetDsl.RepetitionType;
import musicSheetDsl.Rest;
import musicSheetDsl.RestType;
import musicSheetDsl.Staff;
import musicSheetDsl.StaffElement;
import musicSheetDsl.TimeSignature;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MusicSheetDslPackageImpl extends EPackageImpl implements MusicSheetDslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bracketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accidentalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass articulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ornamentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bracketTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repetitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accidentalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ornamentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteDurationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum articulationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clefTypeEEnum = null;

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
	 * @see musicSheetDsl.MusicSheetDslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MusicSheetDslPackageImpl() {
		super(eNS_URI, MusicSheetDslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MusicSheetDslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MusicSheetDslPackage init() {
		if (isInited)
			return (MusicSheetDslPackage) EPackage.Registry.INSTANCE.getEPackage(MusicSheetDslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMusicSheetDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MusicSheetDslPackageImpl theMusicSheetDslPackage = registeredMusicSheetDslPackage instanceof MusicSheetDslPackageImpl
				? (MusicSheetDslPackageImpl) registeredMusicSheetDslPackage
				: new MusicSheetDslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMusicSheetDslPackage.createPackageContents();

		// Initialize created meta-data
		theMusicSheetDslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMusicSheetDslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MusicSheetDslPackage.eNS_URI, theMusicSheetDslPackage);
		return theMusicSheetDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Name() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Author() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Instrument() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_Tonality() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposition_SoundTempo() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Bracket() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposition_Staff() {
		return (EReference) compositionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBracket() {
		return bracketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBracket_Type() {
		return (EAttribute) bracketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBracket_Staves() {
		return (EReference) bracketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaff_Number() {
		return (EAttribute) staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Elements() {
		return (EReference) staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Time() {
		return (EReference) staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Clef() {
		return (EReference) staffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaffElement() {
		return staffElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSignature() {
		return timeSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSignature_Beat() {
		return (EAttribute) timeSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeSignature_BeatType() {
		return (EAttribute) timeSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClef() {
		return clefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClef_Type() {
		return (EAttribute) clefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccidental() {
		return accidentalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccidental_Type() {
		return (EAttribute) accidentalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccidental_Position() {
		return (EAttribute) accidentalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArticulation() {
		return articulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArticulation_Type() {
		return (EAttribute) articulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepetition() {
		return repetitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepetition_Type() {
		return (EAttribute) repetitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRest() {
		return restEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRest_Type() {
		return (EAttribute) restEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrnament() {
		return ornamentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrnament_Type() {
		return (EAttribute) ornamentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Name() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Lyrics() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Duration() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Position() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Fermata() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Dot() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Ornament() {
		return (EReference) noteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Articulation() {
		return (EReference) noteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Dynamic() {
		return (EAttribute) noteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Accidental() {
		return (EReference) noteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBracketType() {
		return bracketTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRestType() {
		return restTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRepetitionType() {
		return repetitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccidentalType() {
		return accidentalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrnamentType() {
		return ornamentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNoteDuration() {
		return noteDurationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNoteName() {
		return noteNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArticulationType() {
		return articulationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClefType() {
		return clefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicSheetDslFactory getMusicSheetDslFactory() {
		return (MusicSheetDslFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__NAME);
		createEAttribute(compositionEClass, COMPOSITION__AUTHOR);
		createEAttribute(compositionEClass, COMPOSITION__INSTRUMENT);
		createEAttribute(compositionEClass, COMPOSITION__TONALITY);
		createEAttribute(compositionEClass, COMPOSITION__SOUND_TEMPO);
		createEReference(compositionEClass, COMPOSITION__BRACKET);
		createEReference(compositionEClass, COMPOSITION__STAFF);

		bracketEClass = createEClass(BRACKET);
		createEAttribute(bracketEClass, BRACKET__TYPE);
		createEReference(bracketEClass, BRACKET__STAVES);

		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__NUMBER);
		createEReference(staffEClass, STAFF__ELEMENTS);
		createEReference(staffEClass, STAFF__TIME);
		createEReference(staffEClass, STAFF__CLEF);

		staffElementEClass = createEClass(STAFF_ELEMENT);

		timeSignatureEClass = createEClass(TIME_SIGNATURE);
		createEAttribute(timeSignatureEClass, TIME_SIGNATURE__BEAT);
		createEAttribute(timeSignatureEClass, TIME_SIGNATURE__BEAT_TYPE);

		clefEClass = createEClass(CLEF);
		createEAttribute(clefEClass, CLEF__TYPE);

		accidentalEClass = createEClass(ACCIDENTAL);
		createEAttribute(accidentalEClass, ACCIDENTAL__TYPE);
		createEAttribute(accidentalEClass, ACCIDENTAL__POSITION);

		articulationEClass = createEClass(ARTICULATION);
		createEAttribute(articulationEClass, ARTICULATION__TYPE);

		repetitionEClass = createEClass(REPETITION);
		createEAttribute(repetitionEClass, REPETITION__TYPE);

		restEClass = createEClass(REST);
		createEAttribute(restEClass, REST__TYPE);

		ornamentEClass = createEClass(ORNAMENT);
		createEAttribute(ornamentEClass, ORNAMENT__TYPE);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__NAME);
		createEAttribute(noteEClass, NOTE__LYRICS);
		createEAttribute(noteEClass, NOTE__DURATION);
		createEAttribute(noteEClass, NOTE__POSITION);
		createEAttribute(noteEClass, NOTE__FERMATA);
		createEAttribute(noteEClass, NOTE__DOT);
		createEReference(noteEClass, NOTE__ORNAMENT);
		createEReference(noteEClass, NOTE__ARTICULATION);
		createEAttribute(noteEClass, NOTE__DYNAMIC);
		createEReference(noteEClass, NOTE__ACCIDENTAL);

		// Create enums
		bracketTypeEEnum = createEEnum(BRACKET_TYPE);
		restTypeEEnum = createEEnum(REST_TYPE);
		repetitionTypeEEnum = createEEnum(REPETITION_TYPE);
		accidentalTypeEEnum = createEEnum(ACCIDENTAL_TYPE);
		ornamentTypeEEnum = createEEnum(ORNAMENT_TYPE);
		noteDurationEEnum = createEEnum(NOTE_DURATION);
		noteNameEEnum = createEEnum(NOTE_NAME);
		articulationTypeEEnum = createEEnum(ARTICULATION_TYPE);
		clefTypeEEnum = createEEnum(CLEF_TYPE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accidentalEClass.getESuperTypes().add(this.getStaffElement());
		repetitionEClass.getESuperTypes().add(this.getStaffElement());
		restEClass.getESuperTypes().add(this.getStaffElement());
		noteEClass.getESuperTypes().add(this.getStaffElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Author(), ecorePackage.getEString(), "author", null, 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Instrument(), ecorePackage.getEString(), "instrument", null, 0, 1,
				Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_Tonality(), ecorePackage.getEString(), "tonality", null, 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposition_SoundTempo(), ecorePackage.getEInt(), "soundTempo", null, 1, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Bracket(), this.getBracket(), null, "bracket", null, 0, -1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposition_Staff(), this.getStaff(), null, "staff", null, 0, -1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bracketEClass, Bracket.class, "Bracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBracket_Type(), this.getBracketType(), "type", null, 0, 1, Bracket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBracket_Staves(), this.getStaff(), null, "staves", null, 2, -1, Bracket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Staff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Elements(), this.getStaffElement(), null, "elements", null, 1, -1, Staff.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Time(), this.getTimeSignature(), null, "time", null, 1, 1, Staff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStaff_Clef(), this.getClef(), null, "clef", null, 1, 1, Staff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(staffElementEClass, StaffElement.class, "StaffElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSignatureEClass, TimeSignature.class, "TimeSignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSignature_Beat(), ecorePackage.getEInt(), "beat", null, 1, 1, TimeSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSignature_BeatType(), ecorePackage.getEInt(), "beatType", null, 1, 1, TimeSignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clefEClass, Clef.class, "Clef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClef_Type(), this.getClefType(), "type", null, 0, 1, Clef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accidentalEClass, Accidental.class, "Accidental", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccidental_Type(), this.getAccidentalType(), "type", null, 0, 1, Accidental.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccidental_Position(), ecorePackage.getEInt(), "position", null, 1, 1, Accidental.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(articulationEClass, Articulation.class, "Articulation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArticulation_Type(), this.getArticulationType(), "type", null, 0, 1, Articulation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repetitionEClass, Repetition.class, "Repetition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepetition_Type(), this.getRepetitionType(), "type", null, 0, 1, Repetition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restEClass, Rest.class, "Rest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRest_Type(), this.getRestType(), "type", null, 0, 1, Rest.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ornamentEClass, Ornament.class, "Ornament", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrnament_Type(), this.getOrnamentType(), "type", null, 0, 1, Ornament.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Name(), this.getNoteName(), "name", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Lyrics(), ecorePackage.getEString(), "lyrics", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Duration(), this.getNoteDuration(), "duration", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Position(), ecorePackage.getEInt(), "position", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Fermata(), ecorePackage.getEBoolean(), "fermata", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Dot(), ecorePackage.getEBoolean(), "dot", null, 1, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Ornament(), this.getOrnament(), null, "ornament", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getNote_Articulation(), this.getArticulation(), null, "articulation", null, 0, 1, Note.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Dynamic(), ecorePackage.getEString(), "dynamic", null, 0, 1, Note.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Accidental(), this.getAccidental(), null, "accidental", null, 0, 1, Note.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bracketTypeEEnum, BracketType.class, "BracketType");
		addEEnumLiteral(bracketTypeEEnum, BracketType.SQUARE);
		addEEnumLiteral(bracketTypeEEnum, BracketType.CURLY);

		initEEnum(restTypeEEnum, RestType.class, "RestType");
		addEEnumLiteral(restTypeEEnum, RestType.WHOLE);
		addEEnumLiteral(restTypeEEnum, RestType.HALF);
		addEEnumLiteral(restTypeEEnum, RestType.QUARTER);
		addEEnumLiteral(restTypeEEnum, RestType.EIGHTH);
		addEEnumLiteral(restTypeEEnum, RestType.SIXTEENTH);
		addEEnumLiteral(restTypeEEnum, RestType.THIRTYSECOND);
		addEEnumLiteral(restTypeEEnum, RestType.SIXTYFOURTH);

		initEEnum(repetitionTypeEEnum, RepetitionType.class, "RepetitionType");
		addEEnumLiteral(repetitionTypeEEnum, RepetitionType.LEFT);
		addEEnumLiteral(repetitionTypeEEnum, RepetitionType.RIGHT);

		initEEnum(accidentalTypeEEnum, AccidentalType.class, "AccidentalType");
		addEEnumLiteral(accidentalTypeEEnum, AccidentalType.SHARP);
		addEEnumLiteral(accidentalTypeEEnum, AccidentalType.FLAT);
		addEEnumLiteral(accidentalTypeEEnum, AccidentalType.NATURAL);

		initEEnum(ornamentTypeEEnum, OrnamentType.class, "OrnamentType");
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.SLIDE);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.GLISSANDO);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.ACIACCATURA);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.APPOGGIATURA);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.TURN);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.MORDENT);
		addEEnumLiteral(ornamentTypeEEnum, OrnamentType.TRILL);

		initEEnum(noteDurationEEnum, NoteDuration.class, "NoteDuration");
		addEEnumLiteral(noteDurationEEnum, NoteDuration.WHOLE);
		addEEnumLiteral(noteDurationEEnum, NoteDuration.HALF);
		addEEnumLiteral(noteDurationEEnum, NoteDuration.QUARTER);
		addEEnumLiteral(noteDurationEEnum, NoteDuration.EIGHTH);
		addEEnumLiteral(noteDurationEEnum, NoteDuration.SIXTEENTH);
		addEEnumLiteral(noteDurationEEnum, NoteDuration.THIRTYSECOND);
		addEEnumLiteral(noteDurationEEnum, NoteDuration.SIXTYFOURTH);

		initEEnum(noteNameEEnum, NoteName.class, "NoteName");
		addEEnumLiteral(noteNameEEnum, NoteName.C);
		addEEnumLiteral(noteNameEEnum, NoteName.D);
		addEEnumLiteral(noteNameEEnum, NoteName.E);
		addEEnumLiteral(noteNameEEnum, NoteName.F);
		addEEnumLiteral(noteNameEEnum, NoteName.G);
		addEEnumLiteral(noteNameEEnum, NoteName.A);
		addEEnumLiteral(noteNameEEnum, NoteName.B);

		initEEnum(articulationTypeEEnum, ArticulationType.class, "ArticulationType");
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.DETACHED);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.LEGATO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.STACCATO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.PORTATO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.TENUTO);
		addEEnumLiteral(articulationTypeEEnum, ArticulationType.MARCATO);

		initEEnum(clefTypeEEnum, ClefType.class, "ClefType");
		addEEnumLiteral(clefTypeEEnum, ClefType.VIOLIN);
		addEEnumLiteral(clefTypeEEnum, ClefType.BASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

} //MusicSheetDslPackageImpl
