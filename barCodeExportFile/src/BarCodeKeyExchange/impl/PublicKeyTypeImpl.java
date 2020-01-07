/**
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.PublicKeyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.impl.PublicKeyTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.PublicKeyTypeImpl#getKeytype <em>Keytype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicKeyTypeImpl extends EObjectImpl implements PublicKeyType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected byte[] value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeytype() <em>Keytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeytype()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYTYPE_EDEFAULT = "CERTIFICATE";

	/**
	 * The cached value of the '{@link #getKeytype() <em>Keytype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeytype()
	 * @generated
	 * @ordered
	 */
	protected String keytype = KEYTYPE_EDEFAULT;

	/**
	 * This is true if the Keytype attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keytypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicKeyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarCodeKeyExchangePackage.Literals.PUBLIC_KEY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(byte[] newValue) {
		byte[] oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeytype() {
		return keytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeytype(String newKeytype) {
		String oldKeytype = keytype;
		keytype = newKeytype;
		boolean oldKeytypeESet = keytypeESet;
		keytypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__KEYTYPE, oldKeytype, keytype, !oldKeytypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeytype() {
		String oldKeytype = keytype;
		boolean oldKeytypeESet = keytypeESet;
		keytype = KEYTYPE_EDEFAULT;
		keytypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__KEYTYPE, oldKeytype, KEYTYPE_EDEFAULT, oldKeytypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeytype() {
		return keytypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__VALUE:
				return getValue();
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__KEYTYPE:
				return getKeytype();
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
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__VALUE:
				setValue((byte[])newValue);
				return;
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__KEYTYPE:
				setKeytype((String)newValue);
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
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__KEYTYPE:
				unsetKeytype();
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
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE__KEYTYPE:
				return isSetKeytype();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", keytype: ");
		if (keytypeESet) result.append(keytype); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PublicKeyTypeImpl
