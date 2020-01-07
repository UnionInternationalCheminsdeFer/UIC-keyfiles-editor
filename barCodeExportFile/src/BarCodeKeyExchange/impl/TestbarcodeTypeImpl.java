/**
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.ImagetypeType;
import BarCodeKeyExchange.TestbarcodeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testbarcode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.impl.TestbarcodeTypeImpl#getImagetype <em>Imagetype</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.TestbarcodeTypeImpl#getImagedata <em>Imagedata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestbarcodeTypeImpl extends EObjectImpl implements TestbarcodeType {
	/**
	 * The default value of the '{@link #getImagetype() <em>Imagetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagetype()
	 * @generated
	 * @ordered
	 */
	protected static final ImagetypeType IMAGETYPE_EDEFAULT = ImagetypeType.JPG;

	/**
	 * The cached value of the '{@link #getImagetype() <em>Imagetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagetype()
	 * @generated
	 * @ordered
	 */
	protected ImagetypeType imagetype = IMAGETYPE_EDEFAULT;

	/**
	 * This is true if the Imagetype attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean imagetypeESet;

	/**
	 * The default value of the '{@link #getImagedata() <em>Imagedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagedata()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGEDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagedata() <em>Imagedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagedata()
	 * @generated
	 * @ordered
	 */
	protected byte[] imagedata = IMAGEDATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestbarcodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarCodeKeyExchangePackage.Literals.TESTBARCODE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagetypeType getImagetype() {
		return imagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagetype(ImagetypeType newImagetype) {
		ImagetypeType oldImagetype = imagetype;
		imagetype = newImagetype == null ? IMAGETYPE_EDEFAULT : newImagetype;
		boolean oldImagetypeESet = imagetypeESet;
		imagetypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGETYPE, oldImagetype, imagetype, !oldImagetypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImagetype() {
		ImagetypeType oldImagetype = imagetype;
		boolean oldImagetypeESet = imagetypeESet;
		imagetype = IMAGETYPE_EDEFAULT;
		imagetypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGETYPE, oldImagetype, IMAGETYPE_EDEFAULT, oldImagetypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImagetype() {
		return imagetypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getImagedata() {
		return imagedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagedata(byte[] newImagedata) {
		byte[] oldImagedata = imagedata;
		imagedata = newImagedata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGEDATA, oldImagedata, imagedata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGETYPE:
				return getImagetype();
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGEDATA:
				return getImagedata();
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
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGETYPE:
				setImagetype((ImagetypeType)newValue);
				return;
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGEDATA:
				setImagedata((byte[])newValue);
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
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGETYPE:
				unsetImagetype();
				return;
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGEDATA:
				setImagedata(IMAGEDATA_EDEFAULT);
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
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGETYPE:
				return isSetImagetype();
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE__IMAGEDATA:
				return IMAGEDATA_EDEFAULT == null ? imagedata != null : !IMAGEDATA_EDEFAULT.equals(imagedata);
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
		result.append(" (imagetype: ");
		if (imagetypeESet) result.append(imagetype); else result.append("<unset>");
		result.append(", imagedata: ");
		result.append(imagedata);
		result.append(')');
		return result.toString();
	}

} //TestbarcodeTypeImpl
