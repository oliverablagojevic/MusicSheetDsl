/**
 */
package musicSheetDsl.util;

import musicSheetDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see musicSheetDsl.MusicSheetDslPackage
 * @generated
 */
public class MusicSheetDslSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MusicSheetDslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicSheetDslSwitch() {
		if (modelPackage == null) {
			modelPackage = MusicSheetDslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MusicSheetDslPackage.COMPOSITION: {
			Composition composition = (Composition) theEObject;
			T result = caseComposition(composition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.BRACKET: {
			Bracket bracket = (Bracket) theEObject;
			T result = caseBracket(bracket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.STAFF: {
			Staff staff = (Staff) theEObject;
			T result = caseStaff(staff);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.STAFF_ELEMENT: {
			StaffElement staffElement = (StaffElement) theEObject;
			T result = caseStaffElement(staffElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.TIME_SIGNATURE: {
			TimeSignature timeSignature = (TimeSignature) theEObject;
			T result = caseTimeSignature(timeSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.CLEF: {
			Clef clef = (Clef) theEObject;
			T result = caseClef(clef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.ACCIDENTAL: {
			Accidental accidental = (Accidental) theEObject;
			T result = caseAccidental(accidental);
			if (result == null)
				result = caseStaffElement(accidental);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.ARTICULATION: {
			Articulation articulation = (Articulation) theEObject;
			T result = caseArticulation(articulation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.REPETITION: {
			Repetition repetition = (Repetition) theEObject;
			T result = caseRepetition(repetition);
			if (result == null)
				result = caseStaffElement(repetition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.REST: {
			Rest rest = (Rest) theEObject;
			T result = caseRest(rest);
			if (result == null)
				result = caseStaffElement(rest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.ORNAMENT: {
			Ornament ornament = (Ornament) theEObject;
			T result = caseOrnament(ornament);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MusicSheetDslPackage.NOTE: {
			Note note = (Note) theEObject;
			T result = caseNote(note);
			if (result == null)
				result = caseStaffElement(note);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bracket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBracket(Bracket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaff(Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffElement(StaffElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSignature(TimeSignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClef(Clef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accidental</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accidental</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccidental(Accidental object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Articulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Articulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArticulation(Articulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repetition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repetition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepetition(Repetition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRest(Rest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ornament</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ornament</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrnament(Ornament object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MusicSheetDslSwitch
