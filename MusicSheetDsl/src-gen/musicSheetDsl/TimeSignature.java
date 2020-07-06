/**
 */
package musicSheetDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.TimeSignature#getBeat <em>Beat</em>}</li>
 *   <li>{@link musicSheetDsl.TimeSignature#getBeatType <em>Beat Type</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getTimeSignature()
 * @model
 * @generated
 */
public interface TimeSignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Beat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat</em>' attribute.
	 * @see #setBeat(int)
	 * @see musicSheetDsl.MusicSheetDslPackage#getTimeSignature_Beat()
	 * @model required="true"
	 * @generated
	 */
	int getBeat();

	/**
	 * Sets the value of the '{@link musicSheetDsl.TimeSignature#getBeat <em>Beat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat</em>' attribute.
	 * @see #getBeat()
	 * @generated
	 */
	void setBeat(int value);

	/**
	 * Returns the value of the '<em><b>Beat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat Type</em>' attribute.
	 * @see #setBeatType(int)
	 * @see musicSheetDsl.MusicSheetDslPackage#getTimeSignature_BeatType()
	 * @model required="true"
	 * @generated
	 */
	int getBeatType();

	/**
	 * Sets the value of the '{@link musicSheetDsl.TimeSignature#getBeatType <em>Beat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat Type</em>' attribute.
	 * @see #getBeatType()
	 * @generated
	 */
	void setBeatType(int value);

} // TimeSignature
