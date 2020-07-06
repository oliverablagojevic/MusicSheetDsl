/**
 */
package musicSheetDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Composition#getName <em>Name</em>}</li>
 *   <li>{@link musicSheetDsl.Composition#getAuthor <em>Author</em>}</li>
 *   <li>{@link musicSheetDsl.Composition#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link musicSheetDsl.Composition#getTonality <em>Tonality</em>}</li>
 *   <li>{@link musicSheetDsl.Composition#getSoundTempo <em>Sound Tempo</em>}</li>
 *   <li>{@link musicSheetDsl.Composition#getBracket <em>Bracket</em>}</li>
 *   <li>{@link musicSheetDsl.Composition#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Composition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Composition#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' attribute.
	 * @see #setInstrument(String)
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_Instrument()
	 * @model
	 * @generated
	 */
	String getInstrument();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Composition#getInstrument <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' attribute.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(String value);

	/**
	 * Returns the value of the '<em><b>Tonality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tonality</em>' attribute.
	 * @see #setTonality(String)
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_Tonality()
	 * @model
	 * @generated
	 */
	String getTonality();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Composition#getTonality <em>Tonality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tonality</em>' attribute.
	 * @see #getTonality()
	 * @generated
	 */
	void setTonality(String value);

	/**
	 * Returns the value of the '<em><b>Sound Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound Tempo</em>' attribute.
	 * @see #setSoundTempo(int)
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_SoundTempo()
	 * @model required="true"
	 * @generated
	 */
	int getSoundTempo();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Composition#getSoundTempo <em>Sound Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound Tempo</em>' attribute.
	 * @see #getSoundTempo()
	 * @generated
	 */
	void setSoundTempo(int value);

	/**
	 * Returns the value of the '<em><b>Bracket</b></em>' containment reference list.
	 * The list contents are of type {@link musicSheetDsl.Bracket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bracket</em>' containment reference list.
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_Bracket()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bracket> getBracket();

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link musicSheetDsl.Staff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see musicSheetDsl.MusicSheetDslPackage#getComposition_Staff()
	 * @model containment="true"
	 * @generated
	 */
	EList<Staff> getStaff();

} // Composition
