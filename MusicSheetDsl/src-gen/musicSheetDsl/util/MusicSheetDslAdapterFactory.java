/**
 */
package musicSheetDsl.util;

import musicSheetDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see musicSheetDsl.MusicSheetDslPackage
 * @generated
 */
public class MusicSheetDslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MusicSheetDslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MusicSheetDslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MusicSheetDslPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicSheetDslSwitch<Adapter> modelSwitch = new MusicSheetDslSwitch<Adapter>() {
		@Override
		public Adapter caseComposition(Composition object) {
			return createCompositionAdapter();
		}

		@Override
		public Adapter caseBracket(Bracket object) {
			return createBracketAdapter();
		}

		@Override
		public Adapter caseStaff(Staff object) {
			return createStaffAdapter();
		}

		@Override
		public Adapter caseStaffElement(StaffElement object) {
			return createStaffElementAdapter();
		}

		@Override
		public Adapter caseTimeSignature(TimeSignature object) {
			return createTimeSignatureAdapter();
		}

		@Override
		public Adapter caseClef(Clef object) {
			return createClefAdapter();
		}

		@Override
		public Adapter caseAccidental(Accidental object) {
			return createAccidentalAdapter();
		}

		@Override
		public Adapter caseArticulation(Articulation object) {
			return createArticulationAdapter();
		}

		@Override
		public Adapter caseRepetition(Repetition object) {
			return createRepetitionAdapter();
		}

		@Override
		public Adapter caseRest(Rest object) {
			return createRestAdapter();
		}

		@Override
		public Adapter caseOrnament(Ornament object) {
			return createOrnamentAdapter();
		}

		@Override
		public Adapter caseNote(Note object) {
			return createNoteAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Bracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Bracket
	 * @generated
	 */
	public Adapter createBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Staff
	 * @generated
	 */
	public Adapter createStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.StaffElement <em>Staff Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.StaffElement
	 * @generated
	 */
	public Adapter createStaffElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.TimeSignature <em>Time Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.TimeSignature
	 * @generated
	 */
	public Adapter createTimeSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Clef <em>Clef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Clef
	 * @generated
	 */
	public Adapter createClefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Accidental <em>Accidental</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Accidental
	 * @generated
	 */
	public Adapter createAccidentalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Articulation <em>Articulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Articulation
	 * @generated
	 */
	public Adapter createArticulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Repetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Repetition
	 * @generated
	 */
	public Adapter createRepetitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Rest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Rest
	 * @generated
	 */
	public Adapter createRestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Ornament <em>Ornament</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Ornament
	 * @generated
	 */
	public Adapter createOrnamentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link musicSheetDsl.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see musicSheetDsl.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MusicSheetDslAdapterFactory
