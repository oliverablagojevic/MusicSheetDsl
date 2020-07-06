/**
 */
package musicSheetDsl;

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
 * @see musicSheetDsl.MusicSheetDslFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface MusicSheetDslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "musicSheetDsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/musicSheetDsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "musicSheetDsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicSheetDslPackage eINSTANCE = musicSheetDsl.impl.MusicSheetDslPackageImpl.init();

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.CompositionImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__INSTRUMENT = 2;

	/**
	 * The feature id for the '<em><b>Tonality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TONALITY = 3;

	/**
	 * The feature id for the '<em><b>Sound Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOUND_TEMPO = 4;

	/**
	 * The feature id for the '<em><b>Bracket</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__BRACKET = 5;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__STAFF = 6;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.BracketImpl <em>Bracket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.BracketImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getBracket()
	 * @generated
	 */
	int BRACKET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Staves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET__STAVES = 1;

	/**
	 * The number of structural features of the '<em>Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.StaffImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__TIME = 2;

	/**
	 * The feature id for the '<em><b>Clef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__CLEF = 3;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.StaffElementImpl <em>Staff Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.StaffElementImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getStaffElement()
	 * @generated
	 */
	int STAFF_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Staff Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Staff Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.TimeSignatureImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getTimeSignature()
	 * @generated
	 */
	int TIME_SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE__BEAT = 0;

	/**
	 * The feature id for the '<em><b>Beat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE__BEAT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Time Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.ClefImpl <em>Clef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.ClefImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getClef()
	 * @generated
	 */
	int CLEF = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEF__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Clef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.AccidentalImpl <em>Accidental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.AccidentalImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getAccidental()
	 * @generated
	 */
	int ACCIDENTAL = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENTAL__TYPE = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENTAL__POSITION = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accidental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENTAL_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Accidental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIDENTAL_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.ArticulationImpl <em>Articulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.ArticulationImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getArticulation()
	 * @generated
	 */
	int ARTICULATION = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULATION__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Articulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Articulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.RepetitionImpl <em>Repetition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.RepetitionImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRepetition()
	 * @generated
	 */
	int REPETITION = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION__TYPE = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repetition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETITION_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.RestImpl <em>Rest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.RestImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRest()
	 * @generated
	 */
	int REST = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST__TYPE = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.OrnamentImpl <em>Ornament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.OrnamentImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getOrnament()
	 * @generated
	 */
	int ORNAMENT = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORNAMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Ornament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORNAMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ornament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORNAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.impl.NoteImpl
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NAME = STAFF_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__LYRICS = STAFF_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DURATION = STAFF_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__POSITION = STAFF_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fermata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__FERMATA = STAFF_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DOT = STAFF_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ornament</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ORNAMENT = STAFF_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Articulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ARTICULATION = STAFF_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DYNAMIC = STAFF_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Accidental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ACCIDENTAL = STAFF_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = STAFF_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = STAFF_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musicSheetDsl.BracketType <em>Bracket Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.BracketType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getBracketType()
	 * @generated
	 */
	int BRACKET_TYPE = 12;

	/**
	 * The meta object id for the '{@link musicSheetDsl.RestType <em>Rest Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.RestType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRestType()
	 * @generated
	 */
	int REST_TYPE = 13;

	/**
	 * The meta object id for the '{@link musicSheetDsl.RepetitionType <em>Repetition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.RepetitionType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRepetitionType()
	 * @generated
	 */
	int REPETITION_TYPE = 14;

	/**
	 * The meta object id for the '{@link musicSheetDsl.AccidentalType <em>Accidental Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.AccidentalType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getAccidentalType()
	 * @generated
	 */
	int ACCIDENTAL_TYPE = 15;

	/**
	 * The meta object id for the '{@link musicSheetDsl.OrnamentType <em>Ornament Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.OrnamentType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getOrnamentType()
	 * @generated
	 */
	int ORNAMENT_TYPE = 16;

	/**
	 * The meta object id for the '{@link musicSheetDsl.NoteDuration <em>Note Duration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.NoteDuration
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getNoteDuration()
	 * @generated
	 */
	int NOTE_DURATION = 17;

	/**
	 * The meta object id for the '{@link musicSheetDsl.NoteName <em>Note Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.NoteName
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getNoteName()
	 * @generated
	 */
	int NOTE_NAME = 18;

	/**
	 * The meta object id for the '{@link musicSheetDsl.ArticulationType <em>Articulation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.ArticulationType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getArticulationType()
	 * @generated
	 */
	int ARTICULATION_TYPE = 19;

	/**
	 * The meta object id for the '{@link musicSheetDsl.ClefType <em>Clef Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musicSheetDsl.ClefType
	 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getClefType()
	 * @generated
	 */
	int CLEF_TYPE = 20;

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see musicSheetDsl.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Composition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musicSheetDsl.Composition#getName()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Name();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Composition#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see musicSheetDsl.Composition#getAuthor()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Author();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Composition#getInstrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instrument</em>'.
	 * @see musicSheetDsl.Composition#getInstrument()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Instrument();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Composition#getTonality <em>Tonality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tonality</em>'.
	 * @see musicSheetDsl.Composition#getTonality()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_Tonality();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Composition#getSoundTempo <em>Sound Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sound Tempo</em>'.
	 * @see musicSheetDsl.Composition#getSoundTempo()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_SoundTempo();

	/**
	 * Returns the meta object for the containment reference list '{@link musicSheetDsl.Composition#getBracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bracket</em>'.
	 * @see musicSheetDsl.Composition#getBracket()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Bracket();

	/**
	 * Returns the meta object for the containment reference list '{@link musicSheetDsl.Composition#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see musicSheetDsl.Composition#getStaff()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Staff();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Bracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bracket</em>'.
	 * @see musicSheetDsl.Bracket
	 * @generated
	 */
	EClass getBracket();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Bracket#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Bracket#getType()
	 * @see #getBracket()
	 * @generated
	 */
	EAttribute getBracket_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link musicSheetDsl.Bracket#getStaves <em>Staves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staves</em>'.
	 * @see musicSheetDsl.Bracket#getStaves()
	 * @see #getBracket()
	 * @generated
	 */
	EReference getBracket_Staves();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see musicSheetDsl.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Staff#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see musicSheetDsl.Staff#getNumber()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link musicSheetDsl.Staff#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see musicSheetDsl.Staff#getElements()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link musicSheetDsl.Staff#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see musicSheetDsl.Staff#getTime()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Time();

	/**
	 * Returns the meta object for the containment reference '{@link musicSheetDsl.Staff#getClef <em>Clef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clef</em>'.
	 * @see musicSheetDsl.Staff#getClef()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Clef();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.StaffElement <em>Staff Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Element</em>'.
	 * @see musicSheetDsl.StaffElement
	 * @generated
	 */
	EClass getStaffElement();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.TimeSignature <em>Time Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Signature</em>'.
	 * @see musicSheetDsl.TimeSignature
	 * @generated
	 */
	EClass getTimeSignature();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.TimeSignature#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beat</em>'.
	 * @see musicSheetDsl.TimeSignature#getBeat()
	 * @see #getTimeSignature()
	 * @generated
	 */
	EAttribute getTimeSignature_Beat();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.TimeSignature#getBeatType <em>Beat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beat Type</em>'.
	 * @see musicSheetDsl.TimeSignature#getBeatType()
	 * @see #getTimeSignature()
	 * @generated
	 */
	EAttribute getTimeSignature_BeatType();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Clef <em>Clef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clef</em>'.
	 * @see musicSheetDsl.Clef
	 * @generated
	 */
	EClass getClef();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Clef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Clef#getType()
	 * @see #getClef()
	 * @generated
	 */
	EAttribute getClef_Type();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Accidental <em>Accidental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accidental</em>'.
	 * @see musicSheetDsl.Accidental
	 * @generated
	 */
	EClass getAccidental();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Accidental#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Accidental#getType()
	 * @see #getAccidental()
	 * @generated
	 */
	EAttribute getAccidental_Type();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Accidental#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see musicSheetDsl.Accidental#getPosition()
	 * @see #getAccidental()
	 * @generated
	 */
	EAttribute getAccidental_Position();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Articulation <em>Articulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Articulation</em>'.
	 * @see musicSheetDsl.Articulation
	 * @generated
	 */
	EClass getArticulation();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Articulation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Articulation#getType()
	 * @see #getArticulation()
	 * @generated
	 */
	EAttribute getArticulation_Type();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Repetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetition</em>'.
	 * @see musicSheetDsl.Repetition
	 * @generated
	 */
	EClass getRepetition();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Repetition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Repetition#getType()
	 * @see #getRepetition()
	 * @generated
	 */
	EAttribute getRepetition_Type();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Rest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest</em>'.
	 * @see musicSheetDsl.Rest
	 * @generated
	 */
	EClass getRest();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Rest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Rest#getType()
	 * @see #getRest()
	 * @generated
	 */
	EAttribute getRest_Type();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Ornament <em>Ornament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ornament</em>'.
	 * @see musicSheetDsl.Ornament
	 * @generated
	 */
	EClass getOrnament();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Ornament#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see musicSheetDsl.Ornament#getType()
	 * @see #getOrnament()
	 * @generated
	 */
	EAttribute getOrnament_Type();

	/**
	 * Returns the meta object for class '{@link musicSheetDsl.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see musicSheetDsl.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musicSheetDsl.Note#getName()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Name();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#getLyrics <em>Lyrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lyrics</em>'.
	 * @see musicSheetDsl.Note#getLyrics()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Lyrics();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see musicSheetDsl.Note#getDuration()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Duration();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see musicSheetDsl.Note#getPosition()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Position();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#isFermata <em>Fermata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fermata</em>'.
	 * @see musicSheetDsl.Note#isFermata()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Fermata();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#isDot <em>Dot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot</em>'.
	 * @see musicSheetDsl.Note#isDot()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Dot();

	/**
	 * Returns the meta object for the containment reference '{@link musicSheetDsl.Note#getOrnament <em>Ornament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ornament</em>'.
	 * @see musicSheetDsl.Note#getOrnament()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Ornament();

	/**
	 * Returns the meta object for the containment reference '{@link musicSheetDsl.Note#getArticulation <em>Articulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Articulation</em>'.
	 * @see musicSheetDsl.Note#getArticulation()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Articulation();

	/**
	 * Returns the meta object for the attribute '{@link musicSheetDsl.Note#getDynamic <em>Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic</em>'.
	 * @see musicSheetDsl.Note#getDynamic()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Dynamic();

	/**
	 * Returns the meta object for the containment reference '{@link musicSheetDsl.Note#getAccidental <em>Accidental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accidental</em>'.
	 * @see musicSheetDsl.Note#getAccidental()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Accidental();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.BracketType <em>Bracket Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bracket Type</em>'.
	 * @see musicSheetDsl.BracketType
	 * @generated
	 */
	EEnum getBracketType();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.RestType <em>Rest Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rest Type</em>'.
	 * @see musicSheetDsl.RestType
	 * @generated
	 */
	EEnum getRestType();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.RepetitionType <em>Repetition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repetition Type</em>'.
	 * @see musicSheetDsl.RepetitionType
	 * @generated
	 */
	EEnum getRepetitionType();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.AccidentalType <em>Accidental Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accidental Type</em>'.
	 * @see musicSheetDsl.AccidentalType
	 * @generated
	 */
	EEnum getAccidentalType();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.OrnamentType <em>Ornament Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ornament Type</em>'.
	 * @see musicSheetDsl.OrnamentType
	 * @generated
	 */
	EEnum getOrnamentType();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.NoteDuration <em>Note Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Duration</em>'.
	 * @see musicSheetDsl.NoteDuration
	 * @generated
	 */
	EEnum getNoteDuration();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.NoteName <em>Note Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Note Name</em>'.
	 * @see musicSheetDsl.NoteName
	 * @generated
	 */
	EEnum getNoteName();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.ArticulationType <em>Articulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Articulation Type</em>'.
	 * @see musicSheetDsl.ArticulationType
	 * @generated
	 */
	EEnum getArticulationType();

	/**
	 * Returns the meta object for enum '{@link musicSheetDsl.ClefType <em>Clef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clef Type</em>'.
	 * @see musicSheetDsl.ClefType
	 * @generated
	 */
	EEnum getClefType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MusicSheetDslFactory getMusicSheetDslFactory();

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
		 * The meta object literal for the '{@link musicSheetDsl.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.CompositionImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__NAME = eINSTANCE.getComposition_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__AUTHOR = eINSTANCE.getComposition_Author();

		/**
		 * The meta object literal for the '<em><b>Instrument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__INSTRUMENT = eINSTANCE.getComposition_Instrument();

		/**
		 * The meta object literal for the '<em><b>Tonality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__TONALITY = eINSTANCE.getComposition_Tonality();

		/**
		 * The meta object literal for the '<em><b>Sound Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__SOUND_TEMPO = eINSTANCE.getComposition_SoundTempo();

		/**
		 * The meta object literal for the '<em><b>Bracket</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__BRACKET = eINSTANCE.getComposition_Bracket();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__STAFF = eINSTANCE.getComposition_Staff();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.BracketImpl <em>Bracket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.BracketImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getBracket()
		 * @generated
		 */
		EClass BRACKET = eINSTANCE.getBracket();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRACKET__TYPE = eINSTANCE.getBracket_Type();

		/**
		 * The meta object literal for the '<em><b>Staves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKET__STAVES = eINSTANCE.getBracket_Staves();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.StaffImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__NUMBER = eINSTANCE.getStaff_Number();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__ELEMENTS = eINSTANCE.getStaff_Elements();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__TIME = eINSTANCE.getStaff_Time();

		/**
		 * The meta object literal for the '<em><b>Clef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__CLEF = eINSTANCE.getStaff_Clef();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.StaffElementImpl <em>Staff Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.StaffElementImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getStaffElement()
		 * @generated
		 */
		EClass STAFF_ELEMENT = eINSTANCE.getStaffElement();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.TimeSignatureImpl <em>Time Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.TimeSignatureImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getTimeSignature()
		 * @generated
		 */
		EClass TIME_SIGNATURE = eINSTANCE.getTimeSignature();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SIGNATURE__BEAT = eINSTANCE.getTimeSignature_Beat();

		/**
		 * The meta object literal for the '<em><b>Beat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SIGNATURE__BEAT_TYPE = eINSTANCE.getTimeSignature_BeatType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.ClefImpl <em>Clef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.ClefImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getClef()
		 * @generated
		 */
		EClass CLEF = eINSTANCE.getClef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEF__TYPE = eINSTANCE.getClef_Type();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.AccidentalImpl <em>Accidental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.AccidentalImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getAccidental()
		 * @generated
		 */
		EClass ACCIDENTAL = eINSTANCE.getAccidental();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCIDENTAL__TYPE = eINSTANCE.getAccidental_Type();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCIDENTAL__POSITION = eINSTANCE.getAccidental_Position();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.ArticulationImpl <em>Articulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.ArticulationImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getArticulation()
		 * @generated
		 */
		EClass ARTICULATION = eINSTANCE.getArticulation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICULATION__TYPE = eINSTANCE.getArticulation_Type();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.RepetitionImpl <em>Repetition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.RepetitionImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRepetition()
		 * @generated
		 */
		EClass REPETITION = eINSTANCE.getRepetition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPETITION__TYPE = eINSTANCE.getRepetition_Type();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.RestImpl <em>Rest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.RestImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRest()
		 * @generated
		 */
		EClass REST = eINSTANCE.getRest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST__TYPE = eINSTANCE.getRest_Type();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.OrnamentImpl <em>Ornament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.OrnamentImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getOrnament()
		 * @generated
		 */
		EClass ORNAMENT = eINSTANCE.getOrnament();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORNAMENT__TYPE = eINSTANCE.getOrnament_Type();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.impl.NoteImpl
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NAME = eINSTANCE.getNote_Name();

		/**
		 * The meta object literal for the '<em><b>Lyrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__LYRICS = eINSTANCE.getNote_Lyrics();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DURATION = eINSTANCE.getNote_Duration();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__POSITION = eINSTANCE.getNote_Position();

		/**
		 * The meta object literal for the '<em><b>Fermata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__FERMATA = eINSTANCE.getNote_Fermata();

		/**
		 * The meta object literal for the '<em><b>Dot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DOT = eINSTANCE.getNote_Dot();

		/**
		 * The meta object literal for the '<em><b>Ornament</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__ORNAMENT = eINSTANCE.getNote_Ornament();

		/**
		 * The meta object literal for the '<em><b>Articulation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__ARTICULATION = eINSTANCE.getNote_Articulation();

		/**
		 * The meta object literal for the '<em><b>Dynamic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DYNAMIC = eINSTANCE.getNote_Dynamic();

		/**
		 * The meta object literal for the '<em><b>Accidental</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__ACCIDENTAL = eINSTANCE.getNote_Accidental();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.BracketType <em>Bracket Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.BracketType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getBracketType()
		 * @generated
		 */
		EEnum BRACKET_TYPE = eINSTANCE.getBracketType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.RestType <em>Rest Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.RestType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRestType()
		 * @generated
		 */
		EEnum REST_TYPE = eINSTANCE.getRestType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.RepetitionType <em>Repetition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.RepetitionType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getRepetitionType()
		 * @generated
		 */
		EEnum REPETITION_TYPE = eINSTANCE.getRepetitionType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.AccidentalType <em>Accidental Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.AccidentalType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getAccidentalType()
		 * @generated
		 */
		EEnum ACCIDENTAL_TYPE = eINSTANCE.getAccidentalType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.OrnamentType <em>Ornament Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.OrnamentType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getOrnamentType()
		 * @generated
		 */
		EEnum ORNAMENT_TYPE = eINSTANCE.getOrnamentType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.NoteDuration <em>Note Duration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.NoteDuration
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getNoteDuration()
		 * @generated
		 */
		EEnum NOTE_DURATION = eINSTANCE.getNoteDuration();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.NoteName <em>Note Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.NoteName
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getNoteName()
		 * @generated
		 */
		EEnum NOTE_NAME = eINSTANCE.getNoteName();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.ArticulationType <em>Articulation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.ArticulationType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getArticulationType()
		 * @generated
		 */
		EEnum ARTICULATION_TYPE = eINSTANCE.getArticulationType();

		/**
		 * The meta object literal for the '{@link musicSheetDsl.ClefType <em>Clef Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musicSheetDsl.ClefType
		 * @see musicSheetDsl.impl.MusicSheetDslPackageImpl#getClefType()
		 * @generated
		 */
		EEnum CLEF_TYPE = eINSTANCE.getClefType();

	}

} //MusicSheetDslPackage
