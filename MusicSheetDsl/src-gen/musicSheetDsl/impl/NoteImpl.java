/**
 */
package musicSheetDsl.impl;

import musicSheetDsl.Accidental;
import musicSheetDsl.Articulation;
import musicSheetDsl.MusicSheetDslPackage;
import musicSheetDsl.Note;
import musicSheetDsl.NoteDuration;
import musicSheetDsl.NoteName;
import musicSheetDsl.Ornament;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getName <em>Name</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getLyrics <em>Lyrics</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#isFermata <em>Fermata</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#isDot <em>Dot</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getOrnament <em>Ornament</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getArticulation <em>Articulation</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link musicSheetDsl.impl.NoteImpl#getAccidental <em>Accidental</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends StaffElementImpl implements Note {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final NoteName NAME_EDEFAULT = NoteName.C;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NoteName name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLyrics() <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyrics()
	 * @generated
	 * @ordered
	 */
	protected static final String LYRICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLyrics() <em>Lyrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLyrics()
	 * @generated
	 * @ordered
	 */
	protected String lyrics = LYRICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final NoteDuration DURATION_EDEFAULT = NoteDuration.WHOLE;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected NoteDuration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFermata() <em>Fermata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFermata()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FERMATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFermata() <em>Fermata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFermata()
	 * @generated
	 * @ordered
	 */
	protected boolean fermata = FERMATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isDot() <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDot() <em>Dot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDot()
	 * @generated
	 * @ordered
	 */
	protected boolean dot = DOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrnament() <em>Ornament</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrnament()
	 * @generated
	 * @ordered
	 */
	protected Ornament ornament;

	/**
	 * The cached value of the '{@link #getArticulation() <em>Articulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticulation()
	 * @generated
	 * @ordered
	 */
	protected Articulation articulation;

	/**
	 * The default value of the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected String dynamic = DYNAMIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccidental() <em>Accidental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidental()
	 * @generated
	 * @ordered
	 */
	protected Accidental accidental;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicSheetDslPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NoteName newName) {
		NoteName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLyrics() {
		return lyrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLyrics(String newLyrics) {
		String oldLyrics = lyrics;
		lyrics = newLyrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__LYRICS, oldLyrics,
					lyrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteDuration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(NoteDuration newDuration) {
		NoteDuration oldDuration = duration;
		duration = newDuration == null ? DURATION_EDEFAULT : newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__POSITION, oldPosition,
					position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFermata() {
		return fermata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFermata(boolean newFermata) {
		boolean oldFermata = fermata;
		fermata = newFermata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__FERMATA, oldFermata,
					fermata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDot() {
		return dot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDot(boolean newDot) {
		boolean oldDot = dot;
		dot = newDot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__DOT, oldDot, dot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ornament getOrnament() {
		return ornament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrnament(Ornament newOrnament, NotificationChain msgs) {
		Ornament oldOrnament = ornament;
		ornament = newOrnament;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicSheetDslPackage.NOTE__ORNAMENT, oldOrnament, newOrnament);
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
	public void setOrnament(Ornament newOrnament) {
		if (newOrnament != ornament) {
			NotificationChain msgs = null;
			if (ornament != null)
				msgs = ((InternalEObject) ornament).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.NOTE__ORNAMENT, null, msgs);
			if (newOrnament != null)
				msgs = ((InternalEObject) newOrnament).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.NOTE__ORNAMENT, null, msgs);
			msgs = basicSetOrnament(newOrnament, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__ORNAMENT, newOrnament,
					newOrnament));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Articulation getArticulation() {
		return articulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticulation(Articulation newArticulation, NotificationChain msgs) {
		Articulation oldArticulation = articulation;
		articulation = newArticulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicSheetDslPackage.NOTE__ARTICULATION, oldArticulation, newArticulation);
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
	public void setArticulation(Articulation newArticulation) {
		if (newArticulation != articulation) {
			NotificationChain msgs = null;
			if (articulation != null)
				msgs = ((InternalEObject) articulation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.NOTE__ARTICULATION, null, msgs);
			if (newArticulation != null)
				msgs = ((InternalEObject) newArticulation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.NOTE__ARTICULATION, null, msgs);
			msgs = basicSetArticulation(newArticulation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__ARTICULATION,
					newArticulation, newArticulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDynamic() {
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic(String newDynamic) {
		String oldDynamic = dynamic;
		dynamic = newDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__DYNAMIC, oldDynamic,
					dynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accidental getAccidental() {
		return accidental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccidental(Accidental newAccidental, NotificationChain msgs) {
		Accidental oldAccidental = accidental;
		accidental = newAccidental;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MusicSheetDslPackage.NOTE__ACCIDENTAL, oldAccidental, newAccidental);
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
	public void setAccidental(Accidental newAccidental) {
		if (newAccidental != accidental) {
			NotificationChain msgs = null;
			if (accidental != null)
				msgs = ((InternalEObject) accidental).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.NOTE__ACCIDENTAL, null, msgs);
			if (newAccidental != null)
				msgs = ((InternalEObject) newAccidental).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MusicSheetDslPackage.NOTE__ACCIDENTAL, null, msgs);
			msgs = basicSetAccidental(newAccidental, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicSheetDslPackage.NOTE__ACCIDENTAL, newAccidental,
					newAccidental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MusicSheetDslPackage.NOTE__ORNAMENT:
			return basicSetOrnament(null, msgs);
		case MusicSheetDslPackage.NOTE__ARTICULATION:
			return basicSetArticulation(null, msgs);
		case MusicSheetDslPackage.NOTE__ACCIDENTAL:
			return basicSetAccidental(null, msgs);
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
		case MusicSheetDslPackage.NOTE__NAME:
			return getName();
		case MusicSheetDslPackage.NOTE__LYRICS:
			return getLyrics();
		case MusicSheetDslPackage.NOTE__DURATION:
			return getDuration();
		case MusicSheetDslPackage.NOTE__POSITION:
			return getPosition();
		case MusicSheetDslPackage.NOTE__FERMATA:
			return isFermata();
		case MusicSheetDslPackage.NOTE__DOT:
			return isDot();
		case MusicSheetDslPackage.NOTE__ORNAMENT:
			return getOrnament();
		case MusicSheetDslPackage.NOTE__ARTICULATION:
			return getArticulation();
		case MusicSheetDslPackage.NOTE__DYNAMIC:
			return getDynamic();
		case MusicSheetDslPackage.NOTE__ACCIDENTAL:
			return getAccidental();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MusicSheetDslPackage.NOTE__NAME:
			setName((NoteName) newValue);
			return;
		case MusicSheetDslPackage.NOTE__LYRICS:
			setLyrics((String) newValue);
			return;
		case MusicSheetDslPackage.NOTE__DURATION:
			setDuration((NoteDuration) newValue);
			return;
		case MusicSheetDslPackage.NOTE__POSITION:
			setPosition((Integer) newValue);
			return;
		case MusicSheetDslPackage.NOTE__FERMATA:
			setFermata((Boolean) newValue);
			return;
		case MusicSheetDslPackage.NOTE__DOT:
			setDot((Boolean) newValue);
			return;
		case MusicSheetDslPackage.NOTE__ORNAMENT:
			setOrnament((Ornament) newValue);
			return;
		case MusicSheetDslPackage.NOTE__ARTICULATION:
			setArticulation((Articulation) newValue);
			return;
		case MusicSheetDslPackage.NOTE__DYNAMIC:
			setDynamic((String) newValue);
			return;
		case MusicSheetDslPackage.NOTE__ACCIDENTAL:
			setAccidental((Accidental) newValue);
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
		case MusicSheetDslPackage.NOTE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__LYRICS:
			setLyrics(LYRICS_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__POSITION:
			setPosition(POSITION_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__FERMATA:
			setFermata(FERMATA_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__DOT:
			setDot(DOT_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__ORNAMENT:
			setOrnament((Ornament) null);
			return;
		case MusicSheetDslPackage.NOTE__ARTICULATION:
			setArticulation((Articulation) null);
			return;
		case MusicSheetDslPackage.NOTE__DYNAMIC:
			setDynamic(DYNAMIC_EDEFAULT);
			return;
		case MusicSheetDslPackage.NOTE__ACCIDENTAL:
			setAccidental((Accidental) null);
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
		case MusicSheetDslPackage.NOTE__NAME:
			return name != NAME_EDEFAULT;
		case MusicSheetDslPackage.NOTE__LYRICS:
			return LYRICS_EDEFAULT == null ? lyrics != null : !LYRICS_EDEFAULT.equals(lyrics);
		case MusicSheetDslPackage.NOTE__DURATION:
			return duration != DURATION_EDEFAULT;
		case MusicSheetDslPackage.NOTE__POSITION:
			return position != POSITION_EDEFAULT;
		case MusicSheetDslPackage.NOTE__FERMATA:
			return fermata != FERMATA_EDEFAULT;
		case MusicSheetDslPackage.NOTE__DOT:
			return dot != DOT_EDEFAULT;
		case MusicSheetDslPackage.NOTE__ORNAMENT:
			return ornament != null;
		case MusicSheetDslPackage.NOTE__ARTICULATION:
			return articulation != null;
		case MusicSheetDslPackage.NOTE__DYNAMIC:
			return DYNAMIC_EDEFAULT == null ? dynamic != null : !DYNAMIC_EDEFAULT.equals(dynamic);
		case MusicSheetDslPackage.NOTE__ACCIDENTAL:
			return accidental != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lyrics: ");
		result.append(lyrics);
		result.append(", duration: ");
		result.append(duration);
		result.append(", position: ");
		result.append(position);
		result.append(", fermata: ");
		result.append(fermata);
		result.append(", dot: ");
		result.append(dot);
		result.append(", dynamic: ");
		result.append(dynamic);
		result.append(')');
		return result.toString();
	}

} //NoteImpl
