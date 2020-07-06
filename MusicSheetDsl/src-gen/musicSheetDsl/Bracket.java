/**
 */
package musicSheetDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Bracket#getType <em>Type</em>}</li>
 *   <li>{@link musicSheetDsl.Bracket#getStaves <em>Staves</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getBracket()
 * @model
 * @generated
 */
public interface Bracket extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.BracketType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.BracketType
	 * @see #setType(BracketType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getBracket_Type()
	 * @model
	 * @generated
	 */
	BracketType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Bracket#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.BracketType
	 * @see #getType()
	 * @generated
	 */
	void setType(BracketType value);

	/**
	 * Returns the value of the '<em><b>Staves</b></em>' containment reference list.
	 * The list contents are of type {@link musicSheetDsl.Staff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staves</em>' containment reference list.
	 * @see musicSheetDsl.MusicSheetDslPackage#getBracket_Staves()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Staff> getStaves();

} // Bracket
