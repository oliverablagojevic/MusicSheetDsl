/**
 */
package musicSheetDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.Staff#getNumber <em>Number</em>}</li>
 *   <li>{@link musicSheetDsl.Staff#getElements <em>Elements</em>}</li>
 *   <li>{@link musicSheetDsl.Staff#getTime <em>Time</em>}</li>
 *   <li>{@link musicSheetDsl.Staff#getClef <em>Clef</em>}</li>
 * </ul>
 *
 * @see musicSheetDsl.MusicSheetDslPackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see musicSheetDsl.MusicSheetDslPackage#getStaff_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Staff#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link musicSheetDsl.StaffElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see musicSheetDsl.MusicSheetDslPackage#getStaff_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StaffElement> getElements();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeSignature)
	 * @see musicSheetDsl.MusicSheetDslPackage#getStaff_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeSignature getTime();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Staff#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeSignature value);

	/**
	 * Returns the value of the '<em><b>Clef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clef</em>' containment reference.
	 * @see #setClef(Clef)
	 * @see musicSheetDsl.MusicSheetDslPackage#getStaff_Clef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Clef getClef();

	/**
	 * Sets the value of the '{@link musicSheetDsl.Staff#getClef <em>Clef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clef</em>' containment reference.
	 * @see #getClef()
	 * @generated
	 */
	void setClef(Clef value);

} // Staff
