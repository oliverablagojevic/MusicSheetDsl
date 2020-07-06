/**
 */
package musicSheetDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ornament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Ornament#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getOrnament()
 * @model
 * @generated
 */
public interface Ornament extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link musicSheetDsl.OrnamentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.OrnamentType
	 * @see #setType(OrnamentType)
	 * @see musicSheetDsl.MusicSheetDslPackage#getOrnament_Type()
	 * @model
	 * @generated
	 */
	OrnamentType getType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Ornament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see musicSheetDsl.OrnamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(OrnamentType value);

} // Ornament
