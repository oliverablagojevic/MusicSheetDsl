/**
 */
package musicSheetDsl.impl;

import java.util.Collection;

import musicSheetDsl.Clef;
import musicSheetDsl.MusicSheetDslPackage;
import musicSheetDsl.Staff;
import musicSheetDsl.StaffElement;
import musicSheetDsl.TimeSignature;

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
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.impl.StaffImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link musicSheetDsl.impl.StaffImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link musicSheetDsl.impl.StaffImpl#getTime <em>Time</em>}</li>
 *   <li>{@link musicSheetDsl.impl.StaffImpl#getClef <em>Clef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffImpl extends MinimalEObjectImpl.Container implements Staff {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffElement> elements;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TimeSignature time;

	/**
	 * The cached value of the '{@link #getClef() <em>Clef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClef()
	 * @generated
	 * @ordered
	 */
	protected Clef clef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicSheetDslPackage.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.STAFF__NUMBER, oldNumber,
					number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StaffElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<StaffElement>(StaffElement.class, this,
					MusicSheetDslPackage.STAFF__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSignature getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeSignature newTime, NotificationChain msgs) {
		TimeSignature oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicSheetDslPackage.STAFF__TIME, oldTime, newTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(TimeSignature newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject) time).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.STAFF__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject) newTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.STAFF__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.STAFF__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clef getClef() {
		return clef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClef(Clef newClef, NotificationChain msgs) {
		Clef oldClef = clef;
		clef = newClef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicSheetDslPackage.STAFF__CLEF, oldClef, newClef);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClef(Clef newClef) {
		if (newClef != clef) {
			NotificationChain msgs = null;
			if (clef != null)
				msgs = ((InternalEObject) clef).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.STAFF__CLEF, null, msgs);
			if (newClef != null)
				msgs = ((InternalEObject) newClef).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.STAFF__CLEF, null, msgs);
			msgs = basicSetClef(newClef, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.STAFF__CLEF, newClef, newClef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicSheetDslPackage.STAFF__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case MusicSheetDslPackage.STAFF__TIME:
			return basicSetTime(null, msgs);
		case MusicSheetDslPackage.STAFF__CLEF:
			return basicSetClef(null, msgs);
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
		case MusicSheetDslPackage.STAFF__NUMBER:
			return getNumber();
		case MusicSheetDslPackage.STAFF__ELEMENTS:
			return getElements();
		case MusicSheetDslPackage.STAFF__TIME:
			return getTime();
		case MusicSheetDslPackage.STAFF__CLEF:
			return getClef();
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
		case MusicSheetDslPackage.STAFF__NUMBER:
			setNumber((Integer) newValue);
			return;
		case MusicSheetDslPackage.STAFF__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends StaffElement>) newValue);
			return;
		case MusicSheetDslPackage.STAFF__TIME:
			setTime((TimeSignature) newValue);
			return;
		case MusicSheetDslPackage.STAFF__CLEF:
			setClef((Clef) newValue);
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
		case MusicSheetDslPackage.STAFF__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case MusicSheetDslPackage.STAFF__ELEMENTS:
			getElements().clear();
			return;
		case MusicSheetDslPackage.STAFF__TIME:
			setTime((TimeSignature) null);
			return;
		case MusicSheetDslPackage.STAFF__CLEF:
			setClef((Clef) null);
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
		case MusicSheetDslPackage.STAFF__NUMBER:
			return number != NUMBER_EDEFAULT;
		case MusicSheetDslPackage.STAFF__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case MusicSheetDslPackage.STAFF__TIME:
			return time != null;
		case MusicSheetDslPackage.STAFF__CLEF:
			return clef != null;
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
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
