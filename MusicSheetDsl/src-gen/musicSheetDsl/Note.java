/**
 */
package musicSheetDsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Note#getName <em>Name</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getLyrics <em>Lyrics</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getDuration <em>Duration</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getPosition <em>Position</em>}</li>
 *   <li>{@link musicSheetDsl.Note#isFermata <em>Fermata</em>}</li>
 *   <li>{@link musicSheetDsl.Note#isDot <em>Dot</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getOrnament <em>Ornament</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getArticulation <em>Articulation</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link musicSheetDsl.Note#getAccidental <em>Accidental</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends StaffElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.NoteName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see musicSheetDsl.NoteName
	 * @see #setName(NoteName)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Name()
	 * @model
	 * @generated
	 */
	NoteName getName();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see musicSheetDsl.NoteName
	 * @see #getName()
	 * @generated
	 */
	void setName(NoteName value);

	/**
	 * Returns the value of the '<em><b>Lyrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lyrics</em>' attribute.
	 * @see #setLyrics(String)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Lyrics()
	 * @model
	 * @generated
	 */
	String getLyrics();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getLyrics <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lyrics</em>' attribute.
	 * @see #getLyrics()
	 * @generated
	 */
	void setLyrics(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.NoteDuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see musicSheetDsl.NoteDuration
	 * @see #setDuration(NoteDuration)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Duration()
	 * @model
	 * @generated
	 */
	NoteDuration getDuration();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see musicSheetDsl.NoteDuration
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(NoteDuration value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Position()
	 * @model required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Fermata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fermata</em>' attribute.
	 * @see #setFermata(boolean)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Fermata()
	 * @model required="true"
	 * @generated
	 */
	boolean isFermata();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#isFermata <em>Fermata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fermata</em>' attribute.
	 * @see #isFermata()
	 * @generated
	 */
	void setFermata(boolean value);

	/**
	 * Returns the value of the '<em><b>Dot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dot</em>' attribute.
	 * @see #setDot(boolean)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Dot()
	 * @model required="true"
	 * @generated
	 */
	boolean isDot();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#isDot <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dot</em>' attribute.
	 * @see #isDot()
	 * @generated
	 */
	void setDot(boolean value);

	/**
	 * Returns the value of the '<em><b>Ornament</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ornament</em>' containment reference.
	 * @see #setOrnament(Ornament)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Ornament()
	 * @model containment="true"
	 * @generated
	 */
	Ornament getOrnament();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getOrnament <em>Ornament</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ornament</em>' containment reference.
	 * @see #getOrnament()
	 * @generated
	 */
	void setOrnament(Ornament value);

	/**
	 * Returns the value of the '<em><b>Articulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articulation</em>' containment reference.
	 * @see #setArticulation(Articulation)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Articulation()
	 * @model containment="true"
	 * @generated
	 */
	Articulation getArticulation();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getArticulation <em>Articulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Articulation</em>' containment reference.
	 * @see #getArticulation()
	 * @generated
	 */
	void setArticulation(Articulation value);

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(String)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Dynamic()
	 * @model
	 * @generated
	 */
	String getDynamic();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #getDynamic()
	 * @generated
	 */
	void setDynamic(String value);

	/**
	 * Returns the value of the '<em><b>Accidental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accidental</em>' containment reference.
	 * @see #setAccidental(Accidental)
	 * @see musicSheetDsl.MusicSheetDslPackage#getNote_Accidental()
	 * @model containment="true"
	 * @generated
	 */
	Accidental getAccidental();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Note#getAccidental <em>Accidental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accidental</em>' containment reference.
	 * @see #getAccidental()
	 * @generated
	 */
	void setAccidental(Accidental value);

} // Note
