/**
 */
package musicSheetDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see musicSheetDsl.MusicSheetDslPackage
 * @generated
 */
public interface MusicSheetDslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicSheetDslFactory eINSTANCE = musicSheetDsl.impl.MusicSheetDslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns a new object of class '<em>Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bracket</em>'.
	 * @generated
	 */
	Bracket createBracket();

	/**
	 * Returns a new object of class '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff</em>'.
	 * @generated
	 */
	Staff createStaff();

	/**
	 * Returns a new object of class '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Signature</em>'.
	 * @generated
	 */
	TimeSignature createTimeSignature();

	/**
	 * Returns a new object of class '<em>Clef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clef</em>'.
	 * @generated
	 */
	Clef createClef();

	/**
	 * Returns a new object of class '<em>Accidental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accidental</em>'.
	 * @generated
	 */
	Accidental createAccidental();

	/**
	 * Returns a new object of class '<em>Articulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Articulation</em>'.
	 * @generated
	 */
	Articulation createArticulation();

	/**
	 * Returns a new object of class '<em>Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repetition</em>'.
	 * @generated
	 */
	Repetition createRepetition();

	/**
	 * Returns a new object of class '<em>Rest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rest</em>'.
	 * @generated
	 */
	Rest createRest();

	/**
	 * Returns a new object of class '<em>Ornament</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ornament</em>'.
	 * @generated
	 */
	Ornament createOrnament();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MusicSheetDslPackage getMusicSheetDslPackage();

} //MusicSheetDslFactory
