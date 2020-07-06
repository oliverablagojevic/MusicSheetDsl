/**
 */
package musicSheetDsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repetition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Repetition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getRepetition()
 * @model
 * @generated
 */
public interface Repetition extends StaffElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.RepetitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.RepetitionType
	 * @see #setType(RepetitionType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getRepetition_Type()
	 * @model
	 * @generated
	 */
	RepetitionType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Repetition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.RepetitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(RepetitionType value);

} // Repetition
