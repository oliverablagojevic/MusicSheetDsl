/**
 */
package musicSheetDsl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Rest#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getRest()
 * @model
 * @generated
 */
public interface Rest extends StaffElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.RestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.RestType
	 * @see #setType(RestType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getRest_Type()
	 * @model
	 * @generated
	 */
	RestType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Rest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.RestType
	 * @see #getType()
	 * @generated
	 */
	void setType(RestType value);

} // Rest
