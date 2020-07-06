/**
 */
package musicSheetDsl.impl;

import musicSheetDsl.*;

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
public class MusicSheetDslFactoryImpl extends EFactoryImpl implements MusicSheetDslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MusicSheetDslFactory init() {
		try {
			MusicSheetDslFactory theMusicSheetDslFactory = (MusicSheetDslFactory) EPackage.Registry.INSTANCE
					.getEFactory(MusicSheetDslPackage.eNS_URI);
			if (theMusicSheetDslFactory != null) {
				return theMusicSheetDslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MusicSheetDslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicSheetDslFactoryImpl() {
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
		case MusicSheetDslPackage.COMPOSITION:
			return createComposition();
		case MusicSheetDslPackage.BRACKET:
			return createBracket();
		case MusicSheetDslPackage.STAFF:
			return createStaff();
		case MusicSheetDslPackage.TIME_SIGNATURE:
			return createTimeSignature();
		case MusicSheetDslPackage.CLEF:
			return createClef();
		case MusicSheetDslPackage.ACCIDENTAL:
			return createAccidental();
		case MusicSheetDslPackage.ARTICULATION:
			return createArticulation();
		case MusicSheetDslPackage.REPETITION:
			return createRepetition();
		case MusicSheetDslPackage.REST:
			return createRest();
		case MusicSheetDslPackage.ORNAMENT:
			return createOrnament();
		case MusicSheetDslPackage.NOTE:
			return createNote();
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
		case MusicSheetDslPackage.BRACKET_TYPE:
			return createBracketTypeFromString(eDataType, initialValue);
		case MusicSheetDslPackage.REST_TYPE:
			return createRestTypeFromString(eDataType, initialValue);
		case MusicSheetDslPackage.REPETITION_TYPE:
			return createRepetitionTypeFromString(eDataType, initialValue);
		case MusicSheetDslPackage.ACCIDENTAL_TYPE:
			return createAccidentalTypeFromString(eDataType, initialValue);
		case MusicSheetDslPackage.ORNAMENT_TYPE:
			return createOrnamentTypeFromString(eDataType, initialValue);
		case MusicSheetDslPackage.NOTE_DURATION:
			return createNoteDurationFromString(eDataType, initialValue);
		case MusicSheetDslPackage.NOTE_NAME:
			return createNoteNameFromString(eDataType, initialValue);
		case MusicSheetDslPackage.ARTICULATION_TYPE:
			return createArticulationTypeFromString(eDataType, initialValue);
		case MusicSheetDslPackage.CLEF_TYPE:
			return createClefTypeFromString(eDataType, initialValue);
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
		case MusicSheetDslPackage.BRACKET_TYPE:
			return convertBracketTypeToString(eDataType, instanceValue);
		case MusicSheetDslPackage.REST_TYPE:
			return convertRestTypeToString(eDataType, instanceValue);
		case MusicSheetDslPackage.REPETITION_TYPE:
			return convertRepetitionTypeToString(eDataType, instanceValue);
		case MusicSheetDslPackage.ACCIDENTAL_TYPE:
			return convertAccidentalTypeToString(eDataType, instanceValue);
		case MusicSheetDslPackage.ORNAMENT_TYPE:
			return convertOrnamentTypeToString(eDataType, instanceValue);
		case MusicSheetDslPackage.NOTE_DURATION:
			return convertNoteDurationToString(eDataType, instanceValue);
		case MusicSheetDslPackage.NOTE_NAME:
			return convertNoteNameToString(eDataType, instanceValue);
		case MusicSheetDslPackage.ARTICULATION_TYPE:
			return convertArticulationTypeToString(eDataType, instanceValue);
		case MusicSheetDslPackage.CLEF_TYPE:
			return convertClefTypeToString(eDataType, instanceValue);
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
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bracket createBracket() {
		BracketImpl bracket = new BracketImpl();
		return bracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSignature createTimeSignature() {
		TimeSignatureImpl timeSignature = new TimeSignatureImpl();
		return timeSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clef createClef() {
		ClefImpl clef = new ClefImpl();
		return clef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accidental createAccidental() {
		AccidentalImpl accidental = new AccidentalImpl();
		return accidental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Articulation createArticulation() {
		ArticulationImpl articulation = new ArticulationImpl();
		return articulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repetition createRepetition() {
		RepetitionImpl repetition = new RepetitionImpl();
		return repetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rest createRest() {
		RestImpl rest = new RestImpl();
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ornament createOrnament() {
		OrnamentImpl ornament = new OrnamentImpl();
		return ornament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BracketType createBracketTypeFromString(EDataType eDataType, String initialValue) {
		BracketType result = BracketType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBracketTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestType createRestTypeFromString(EDataType eDataType, String initialValue) {
		RestType result = RestType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepetitionType createRepetitionTypeFromString(EDataType eDataType, String initialValue) {
		RepetitionType result = RepetitionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepetitionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccidentalType createAccidentalTypeFromString(EDataType eDataType, String initialValue) {
		AccidentalType result = AccidentalType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccidentalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrnamentType createOrnamentTypeFromString(EDataType eDataType, String initialValue) {
		OrnamentType result = OrnamentType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrnamentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteDuration createNoteDurationFromString(EDataType eDataType, String initialValue) {
		NoteDuration result = NoteDuration.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteDurationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteName createNoteNameFromString(EDataType eDataType, String initialValue) {
		NoteName result = NoteName.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoteNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArticulationType createArticulationTypeFromString(EDataType eDataType, String initialValue) {
		ArticulationType result = ArticulationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArticulationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClefType createClefTypeFromString(EDataType eDataType, String initialValue) {
		ClefType result = ClefType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MusicSheetDslPackage getMusicSheetDslPackage() {
		return (MusicSheetDslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MusicSheetDslPackage getPackage() {
		return MusicSheetDslPackage.eINSTANCE;
	}

} //MusicSheetDslFactoryImpl
