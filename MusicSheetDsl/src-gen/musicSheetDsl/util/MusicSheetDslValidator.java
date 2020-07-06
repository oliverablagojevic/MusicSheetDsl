/**
 */
package musicSheetDsl.util;

import java.util.Map;

import musicSheetDsl.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see musicSheetDsl.MusicSheetDslPackage
 * @generated
 */
public class MusicSheetDslValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MusicSheetDslValidator INSTANCE = new MusicSheetDslValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "musicSheetDsl";

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
	public MusicSheetDslValidator() {
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
		return MusicSheetDslPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case MusicSheetDslPackage.COMPOSITION:
			return validateComposition((Composition) value, diagnostics, context);
		case MusicSheetDslPackage.BRACKET:
			return validateBracket((Bracket) value, diagnostics, context);
		case MusicSheetDslPackage.STAFF:
			return validateStaff((Staff) value, diagnostics, context);
		case MusicSheetDslPackage.STAFF_ELEMENT:
			return validateStaffElement((StaffElement) value, diagnostics, context);
		case MusicSheetDslPackage.TIME_SIGNATURE:
			return validateTimeSignature((TimeSignature) value, diagnostics, context);
		case MusicSheetDslPackage.CLEF:
			return validateClef((Clef) value, diagnostics, context);
		case MusicSheetDslPackage.ACCIDENTAL:
			return validateAccidental((Accidental) value, diagnostics, context);
		case MusicSheetDslPackage.ARTICULATION:
			return validateArticulation((Articulation) value, diagnostics, context);
		case MusicSheetDslPackage.REPETITION:
			return validateRepetition((Repetition) value, diagnostics, context);
		case MusicSheetDslPackage.REST:
			return validateRest((Rest) value, diagnostics, context);
		case MusicSheetDslPackage.ORNAMENT:
			return validateOrnament((Ornament) value, diagnostics, context);
		case MusicSheetDslPackage.NOTE:
			return validateNote((Note) value, diagnostics, context);
		case MusicSheetDslPackage.BRACKET_TYPE:
			return validateBracketType((BracketType) value, diagnostics, context);
		case MusicSheetDslPackage.REST_TYPE:
			return validateRestType((RestType) value, diagnostics, context);
		case MusicSheetDslPackage.REPETITION_TYPE:
			return validateRepetitionType((RepetitionType) value, diagnostics, context);
		case MusicSheetDslPackage.ACCIDENTAL_TYPE:
			return validateAccidentalType((AccidentalType) value, diagnostics, context);
		case MusicSheetDslPackage.ORNAMENT_TYPE:
			return validateOrnamentType((OrnamentType) value, diagnostics, context);
		case MusicSheetDslPackage.NOTE_DURATION:
			return validateNoteDuration((NoteDuration) value, diagnostics, context);
		case MusicSheetDslPackage.NOTE_NAME:
			return validateNoteName((NoteName) value, diagnostics, context);
		case MusicSheetDslPackage.ARTICULATION_TYPE:
			return validateArticulationType((ArticulationType) value, diagnostics, context);
		case MusicSheetDslPackage.CLEF_TYPE:
			return validateClefType((ClefType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposition(Composition composition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(composition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBracket(Bracket bracket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bracket, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaff(Staff staff, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staff, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaffElement(StaffElement staffElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staffElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSignature(TimeSignature timeSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSignature, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSignature_LessThanTwelve(timeSignature, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTimeSignature_LessThanEight(timeSignature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the LessThanTwelve constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SIGNATURE__LESS_THAN_TWELVE__EEXPRESSION = "self.beat < 12";

	/**
	 * Validates the LessThanTwelve constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSignature_LessThanTwelve(TimeSignature timeSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicSheetDslPackage.Literals.TIME_SIGNATURE, timeSignature, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LessThanTwelve",
				TIME_SIGNATURE__LESS_THAN_TWELVE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the LessThanEight constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_SIGNATURE__LESS_THAN_EIGHT__EEXPRESSION = "self.beatType < 8";

	/**
	 * Validates the LessThanEight constraint of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSignature_LessThanEight(TimeSignature timeSignature, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(MusicSheetDslPackage.Literals.TIME_SIGNATURE, timeSignature, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "LessThanEight",
				TIME_SIGNATURE__LESS_THAN_EIGHT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClef(Clef clef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccidental(Accidental accidental, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accidental, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArticulation(Articulation articulation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(articulation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetition(Repetition repetition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repetition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRest(Rest rest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrnament(Ornament ornament, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ornament, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(note, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBracketType(BracketType bracketType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestType(RestType restType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetitionType(RepetitionType repetitionType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccidentalType(AccidentalType accidentalType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrnamentType(OrnamentType ornamentType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteDuration(NoteDuration noteDuration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteName(NoteName noteName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArticulationType(ArticulationType articulationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClefType(ClefType clefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //MusicSheetDslValidator
