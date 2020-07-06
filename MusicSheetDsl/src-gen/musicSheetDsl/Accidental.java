/**
 */
package musicSheetDsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accidental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Accidental#getType <em>Type</em>}</li>
 *   <li>{@link musicSheetDsl.Accidental#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getAccidental()
 * @model
 * @generated
 */
public interface Accidental extends StaffElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.AccidentalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.AccidentalType
	 * @see #setType(AccidentalType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getAccidental_Type()
	 * @model
	 * @generated
	 */
	AccidentalType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Accidental#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.AccidentalType
	 * @see #getType()
	 * @generated
	 */
	void setType(AccidentalType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see musicSheetDsl.MusicSheetDslPackage#getAccidental_Position()
	 * @model required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Accidental#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // Accidental
