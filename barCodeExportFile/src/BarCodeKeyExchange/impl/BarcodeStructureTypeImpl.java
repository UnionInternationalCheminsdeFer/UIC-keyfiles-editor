/**
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.BarcodeStructureType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Barcode Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl#getIssuerCode <em>Issuer Code</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl#getVersionType <em>Version Type</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl#getBarcodeVersion <em>Barcode Version</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarcodeStructureTypeImpl extends EObjectImpl implements BarcodeStructureType {
	/**
	 * The default value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuerName() <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerName()
	 * @generated
	 * @ordered
	 */
	protected String issuerName = ISSUER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuerCode() <em>Issuer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerCode()
	 * @generated
	 * @ordered
	 */
	protected static final int ISSUER_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIssuerCode() <em>Issuer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuerCode()
	 * @generated
	 * @ordered
	 */
	protected int issuerCode = ISSUER_CODE_EDEFAULT;

	/**
	 * This is true if the Issuer Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean issuerCodeESet;

	/**
	 * The default value of the '{@link #getVersionType() <em>Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionType()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionType() <em>Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionType()
	 * @generated
	 * @ordered
	 */
	protected String versionType = VERSION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getBarcodeVersion() <em>Barcode Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int BARCODE_VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBarcodeVersion() <em>Barcode Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeVersion()
	 * @generated
	 * @ordered
	 */
	protected int barcodeVersion = BARCODE_VERSION_EDEFAULT;

	/**
	 * This is true if the Barcode Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barcodeVersionESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarcodeStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssuerName() {
		return issuerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuerName(String newIssuerName) {
		String oldIssuerName = issuerName;
		issuerName = newIssuerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_NAME, oldIssuerName, issuerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIssuerCode() {
		return issuerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuerCode(int newIssuerCode) {
		int oldIssuerCode = issuerCode;
		issuerCode = newIssuerCode;
		boolean oldIssuerCodeESet = issuerCodeESet;
		issuerCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE, oldIssuerCode, issuerCode, !oldIssuerCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIssuerCode() {
		int oldIssuerCode = issuerCode;
		boolean oldIssuerCodeESet = issuerCodeESet;
		issuerCode = ISSUER_CODE_EDEFAULT;
		issuerCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE, oldIssuerCode, ISSUER_CODE_EDEFAULT, oldIssuerCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIssuerCode() {
		return issuerCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionType() {
		return versionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionType(String newVersionType) {
		String oldVersionType = versionType;
		versionType = newVersionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__VERSION_TYPE, oldVersionType, versionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBarcodeVersion() {
		return barcodeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBarcodeVersion(int newBarcodeVersion) {
		int oldBarcodeVersion = barcodeVersion;
		barcodeVersion = newBarcodeVersion;
		boolean oldBarcodeVersionESet = barcodeVersionESet;
		barcodeVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION, oldBarcodeVersion, barcodeVersion, !oldBarcodeVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBarcodeVersion() {
		int oldBarcodeVersion = barcodeVersion;
		boolean oldBarcodeVersionESet = barcodeVersionESet;
		barcodeVersion = BARCODE_VERSION_EDEFAULT;
		barcodeVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION, oldBarcodeVersion, BARCODE_VERSION_EDEFAULT, oldBarcodeVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBarcodeVersion() {
		return barcodeVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_NAME:
				return getIssuerName();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE:
				return getIssuerCode();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__VERSION_TYPE:
				return getVersionType();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID:
				return getId();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION:
				return getBarcodeVersion();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__DESCRIPTION:
				return getDescription();
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
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_NAME:
				setIssuerName((String)newValue);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE:
				setIssuerCode((Integer)newValue);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__VERSION_TYPE:
				setVersionType((String)newValue);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID:
				setId((Integer)newValue);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION:
				setBarcodeVersion((Integer)newValue);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_NAME:
				setIssuerName(ISSUER_NAME_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE:
				unsetIssuerCode();
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__VERSION_TYPE:
				setVersionType(VERSION_TYPE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID:
				unsetId();
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION:
				unsetBarcodeVersion();
				return;
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_NAME:
				return ISSUER_NAME_EDEFAULT == null ? issuerName != null : !ISSUER_NAME_EDEFAULT.equals(issuerName);
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE:
				return isSetIssuerCode();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__VERSION_TYPE:
				return VERSION_TYPE_EDEFAULT == null ? versionType != null : !VERSION_TYPE_EDEFAULT.equals(versionType);
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID:
				return isSetId();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION:
				return isSetBarcodeVersion();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (issuerName: ");
		result.append(issuerName);
		result.append(", issuerCode: ");
		if (issuerCodeESet) result.append(issuerCode); else result.append("<unset>");
		result.append(", versionType: ");
		result.append(versionType);
		result.append(", id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", barcodeVersion: ");
		if (barcodeVersionESet) result.append(barcodeVersion); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BarcodeStructureTypeImpl
