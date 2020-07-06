/**
 */
package musicSheetDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Articulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Articulation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getArticulation()
 * @model
 * @generated
 */
public interface Articulation extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.ArticulationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.ArticulationType
	 * @see #setType(ArticulationType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getArticulation_Type()
	 * @model
	 * @generated
	 */
	ArticulationType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Articulation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.ArticulationType
	 * @see #getType()
	 * @generated
	 */
	void setType(ArticulationType value);

} // Articulation
