/**
 */
package musicSheetDsl.impl;

import java.util.Collection;

import musicSheetDsl.Bracket;
import musicSheetDsl.BracketType;
import musicSheetDsl.MusicSheetDslPackage;
import musicSheetDsl.Staff;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.impl.BracketImpl#getType <em>Type</em>}</li>
 *   <li>{@link musicSheetDsl.impl.BracketImpl#getStaves <em>Staves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BracketImpl extends MinimalEObjectImpl.Container implements Bracket {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BracketType TYPE_EDEFAULT = BracketType.SQUARE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BracketType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStaves() <em>Staves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaves()
	 * @generated
	 * @ordered
	 */
	protected EList<Staff> staves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BracketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicSheetDslPackage.Literals.BRACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BracketType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(BracketType newType) {
		BracketType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.BRACKET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Staff> getStaves() {
		if (staves == null) {
			staves = new EObjectContainmentEList<Staff>(Staff.class, this, MusicSheetDslPackage.BRACKET__STAVES);
		}
		return staves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicSheetDslPackage.BRACKET__STAVES:
			return ((InternalEList<?>) getStaves()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MusicSheetDslPackage.BRACKET__TYPE:
			return getType();
		case MusicSheetDslPackage.BRACKET__STAVES:
			return getStaves();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MusicSheetDslPackage.BRACKET__TYPE:
			setType((BracketType) newValue);
			return;
		case MusicSheetDslPackage.BRACKET__STAVES:
			getStaves().clear();
			getStaves().addAll((Collection<? extends Staff>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MusicSheetDslPackage.BRACKET__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MusicSheetDslPackage.BRACKET__STAVES:
			getStaves().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MusicSheetDslPackage.BRACKET__TYPE:
			return type != TYPE_EDEFAULT;
		case MusicSheetDslPackage.BRACKET__STAVES:
			return staves != null && !staves.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BracketImpl
