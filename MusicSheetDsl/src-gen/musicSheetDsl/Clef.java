/**
 */
package musicSheetDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Clef#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getClef()
 * @model
 * @generated
 */
public interface Clef extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.ClefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.ClefType
	 * @see #setType(ClefType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getClef_Type()
	 * @model
	 * @generated
	 */
	ClefType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Clef#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.ClefType
	 * @see #getType()
	 * @generated
	 */
	void setType(ClefType value);

} // Clef
