/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.impl;

import java.util.GregorianCalendar;

import BarCodeKeyExchange.AllowedProductOwnerCodesType;
import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.KeyForgedType;
import BarCodeKeyExchange.KeyType;

import BarCodeKeyExchange.PublicKeyType;

import BarCodeKeyExchange.TestbarcodeType;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getIssuerCode <em>Issuer Code</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getVersionType <em>Version Type</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getSignatureAlgorithmOid <em>Signature Algorithm Oid</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getBarcodeVersion <em>Barcode Version</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getBarcodeXsd <em>Barcode Xsd</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getAllowedProductOwnerCodes <em>Allowed Product Owner Codes</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getLastDayOfSale <em>Last Day Of Sale</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getKeyForged <em>Key Forged</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getCommentForEncryptionType <em>Comment For Encryption Type</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeyTypeImpl#getTestbarcode <em>Testbarcode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyTypeImpl extends EObjectImpl implements KeyType {
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
	 * The default value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithm() <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithm = SIGNATURE_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureAlgorithmOid() <em>Signature Algorithm Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithmOid()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ALGORITHM_OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureAlgorithmOid() <em>Signature Algorithm Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureAlgorithmOid()
	 * @generated
	 * @ordered
	 */
	protected String signatureAlgorithmOid = SIGNATURE_ALGORITHM_OID_EDEFAULT;

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
	 * The cached value of the '{@link #getPublicKey() <em>Public Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicKey()
	 * @generated
	 * @ordered
	 */
	protected PublicKeyType publicKey;

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
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarcodeXsd() <em>Barcode Xsd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeXsd()
	 * @generated
	 * @ordered
	 */
	protected static final String BARCODE_XSD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarcodeXsd() <em>Barcode Xsd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeXsd()
	 * @generated
	 * @ordered
	 */
	protected String barcodeXsd = BARCODE_XSD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedProductOwnerCodes() <em>Allowed Product Owner Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedProductOwnerCodes()
	 * @generated
	 * @ordered
	 */
	protected AllowedProductOwnerCodesType allowedProductOwnerCodes;

	/**
	 * The default value of the '{@link #getLastDayOfSale() <em>Last Day Of Sale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDayOfSale()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_DAY_OF_SALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastDayOfSale() <em>Last Day Of Sale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDayOfSale()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastDayOfSale = LAST_DAY_OF_SALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyForged() <em>Key Forged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyForged()
	 * @generated
	 * @ordered
	 */
	protected static final KeyForgedType KEY_FORGED_EDEFAULT = KeyForgedType.FALSE;

	/**
	 * The cached value of the '{@link #getKeyForged() <em>Key Forged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyForged()
	 * @generated
	 * @ordered
	 */
	protected KeyForgedType keyForged = KEY_FORGED_EDEFAULT;

	/**
	 * This is true if the Key Forged attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyForgedESet;

	/**
	 * The default value of the '{@link #getCommentForEncryptionType() <em>Comment For Encryption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentForEncryptionType()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_FOR_ENCRYPTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentForEncryptionType() <em>Comment For Encryption Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentForEncryptionType()
	 * @generated
	 * @ordered
	 */
	protected String commentForEncryptionType = COMMENT_FOR_ENCRYPTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestbarcode() <em>Testbarcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestbarcode()
	 * @generated
	 * @ordered
	 */
	protected TestbarcodeType testbarcode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected KeyTypeImpl() {
		super();
		if (this.getStartDate() == null)  {
			GregorianCalendar c = new GregorianCalendar();
			XMLGregorianCalendar date2 = null;
			try {
				date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			} catch (DatatypeConfigurationException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
			
			this.setStartDate(date2);
		
		}
		
		if (this.getEndDate() == null) {
			GregorianCalendar c = new GregorianCalendar();
			XMLGregorianCalendar date3 = null;
			try {
				date3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			} catch (DatatypeConfigurationException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
			this.setEndDate(date3);	
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarCodeKeyExchangePackage.Literals.KEY_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_NAME, oldIssuerName, issuerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE, oldIssuerCode, issuerCode, !oldIssuerCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE, oldIssuerCode, ISSUER_CODE_EDEFAULT, oldIssuerCodeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__VERSION_TYPE, oldVersionType, versionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureAlgorithm() {
		return signatureAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureAlgorithm(String newSignatureAlgorithm) {
		String oldSignatureAlgorithm = signatureAlgorithm;
		signatureAlgorithm = newSignatureAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM, oldSignatureAlgorithm, signatureAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSignatureAlgorithmOid() {
		return signatureAlgorithmOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignatureAlgorithmOid(String newSignatureAlgorithmOid) {
		String oldSignatureAlgorithmOid = signatureAlgorithmOid;
		signatureAlgorithmOid = newSignatureAlgorithmOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM_OID, oldSignatureAlgorithmOid, signatureAlgorithmOid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.KEY_TYPE__ID, oldId, ID_EDEFAULT, oldIdESet));
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
	public PublicKeyType getPublicKey() {
		return publicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicKey(PublicKeyType newPublicKey, NotificationChain msgs) {
		PublicKeyType oldPublicKey = publicKey;
		publicKey = newPublicKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY, oldPublicKey, newPublicKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicKey(PublicKeyType newPublicKey) {
		if (newPublicKey != publicKey) {
			NotificationChain msgs = null;
			if (publicKey != null)
				msgs = ((InternalEObject)publicKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY, null, msgs);
			if (newPublicKey != null)
				msgs = ((InternalEObject)newPublicKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY, null, msgs);
			msgs = basicSetPublicKey(newPublicKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY, newPublicKey, newPublicKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION, oldBarcodeVersion, barcodeVersion, !oldBarcodeVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION, oldBarcodeVersion, BARCODE_VERSION_EDEFAULT, oldBarcodeVersionESet));
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
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		XMLGregorianCalendar oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBarcodeXsd() {
		return barcodeXsd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBarcodeXsd(String newBarcodeXsd) {
		String oldBarcodeXsd = barcodeXsd;
		barcodeXsd = newBarcodeXsd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_XSD, oldBarcodeXsd, barcodeXsd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedProductOwnerCodesType getAllowedProductOwnerCodes() {
		return allowedProductOwnerCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowedProductOwnerCodes(AllowedProductOwnerCodesType newAllowedProductOwnerCodes, NotificationChain msgs) {
		AllowedProductOwnerCodesType oldAllowedProductOwnerCodes = allowedProductOwnerCodes;
		allowedProductOwnerCodes = newAllowedProductOwnerCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES, oldAllowedProductOwnerCodes, newAllowedProductOwnerCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowedProductOwnerCodes(AllowedProductOwnerCodesType newAllowedProductOwnerCodes) {
		if (newAllowedProductOwnerCodes != allowedProductOwnerCodes) {
			NotificationChain msgs = null;
			if (allowedProductOwnerCodes != null)
				msgs = ((InternalEObject)allowedProductOwnerCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES, null, msgs);
			if (newAllowedProductOwnerCodes != null)
				msgs = ((InternalEObject)newAllowedProductOwnerCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES, null, msgs);
			msgs = basicSetAllowedProductOwnerCodes(newAllowedProductOwnerCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES, newAllowedProductOwnerCodes, newAllowedProductOwnerCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastDayOfSale() {
		return lastDayOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastDayOfSale(XMLGregorianCalendar newLastDayOfSale) {
		XMLGregorianCalendar oldLastDayOfSale = lastDayOfSale;
		lastDayOfSale = newLastDayOfSale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__LAST_DAY_OF_SALE, oldLastDayOfSale, lastDayOfSale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public KeyForgedType getKeyForged() {
		if (keyForged == KeyForgedType._1){
			return KeyForgedType.TRUE;
		} else {
			return KeyForgedType.FALSE;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setKeyForged(KeyForgedType newKeyForged) {
		if (newKeyForged == KeyForgedType._1) {
			newKeyForged = KeyForgedType.TRUE;
		}
		if (newKeyForged == KeyForgedType._0) {
			newKeyForged = KeyForgedType.FALSE;
		}		
		if (newKeyForged == null) {
			newKeyForged = KeyForgedType.FALSE;
		}
		KeyForgedType oldKeyForged = keyForged;
		keyForged = newKeyForged == null ? KEY_FORGED_EDEFAULT : newKeyForged;
		boolean oldKeyForgedESet = keyForgedESet;
		keyForgedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED, oldKeyForged, keyForged, !oldKeyForgedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKeyForged() {
		KeyForgedType oldKeyForged = keyForged;
		boolean oldKeyForgedESet = keyForgedESet;
		keyForged = KEY_FORGED_EDEFAULT;
		keyForgedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED, oldKeyForged, KEY_FORGED_EDEFAULT, oldKeyForgedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKeyForged() {
		return keyForgedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommentForEncryptionType() {
		return commentForEncryptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentForEncryptionType(String newCommentForEncryptionType) {
		String oldCommentForEncryptionType = commentForEncryptionType;
		commentForEncryptionType = newCommentForEncryptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE, oldCommentForEncryptionType, commentForEncryptionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestbarcodeType getTestbarcode() {
		return testbarcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestbarcode(TestbarcodeType newTestbarcode, NotificationChain msgs) {
		TestbarcodeType oldTestbarcode = testbarcode;
		testbarcode = newTestbarcode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE, oldTestbarcode, newTestbarcode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestbarcode(TestbarcodeType newTestbarcode) {
		if (newTestbarcode != testbarcode) {
			NotificationChain msgs = null;
			if (testbarcode != null)
				msgs = ((InternalEObject)testbarcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE, null, msgs);
			if (newTestbarcode != null)
				msgs = ((InternalEObject)newTestbarcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE, null, msgs);
			msgs = basicSetTestbarcode(newTestbarcode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE, newTestbarcode, newTestbarcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY:
				return basicSetPublicKey(null, msgs);
			case BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES:
				return basicSetAllowedProductOwnerCodes(null, msgs);
			case BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE:
				return basicSetTestbarcode(null, msgs);
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
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_NAME:
				return getIssuerName();
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE:
				return getIssuerCode();
			case BarCodeKeyExchangePackage.KEY_TYPE__VERSION_TYPE:
				return getVersionType();
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM:
				return getSignatureAlgorithm();
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM_OID:
				return getSignatureAlgorithmOid();
			case BarCodeKeyExchangePackage.KEY_TYPE__ID:
				return getId();
			case BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY:
				return getPublicKey();
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION:
				return getBarcodeVersion();
			case BarCodeKeyExchangePackage.KEY_TYPE__START_DATE:
				return getStartDate();
			case BarCodeKeyExchangePackage.KEY_TYPE__END_DATE:
				return getEndDate();
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_XSD:
				return getBarcodeXsd();
			case BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES:
				return getAllowedProductOwnerCodes();
			case BarCodeKeyExchangePackage.KEY_TYPE__LAST_DAY_OF_SALE:
				return getLastDayOfSale();
			case BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED:
				return getKeyForged();
			case BarCodeKeyExchangePackage.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE:
				return getCommentForEncryptionType();
			case BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE:
				return getTestbarcode();
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
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_NAME:
				setIssuerName((String)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE:
				setIssuerCode((Integer)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__VERSION_TYPE:
				setVersionType((String)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm((String)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM_OID:
				setSignatureAlgorithmOid((String)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__ID:
				setId((Integer)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY:
				setPublicKey((PublicKeyType)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION:
				setBarcodeVersion((Integer)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__END_DATE:
				setEndDate((XMLGregorianCalendar)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_XSD:
				setBarcodeXsd((String)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES:
				setAllowedProductOwnerCodes((AllowedProductOwnerCodesType)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__LAST_DAY_OF_SALE:
				setLastDayOfSale((XMLGregorianCalendar)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED:
				setKeyForged((KeyForgedType)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE:
				setCommentForEncryptionType((String)newValue);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE:
				setTestbarcode((TestbarcodeType)newValue);
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
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_NAME:
				setIssuerName(ISSUER_NAME_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE:
				unsetIssuerCode();
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__VERSION_TYPE:
				setVersionType(VERSION_TYPE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM:
				setSignatureAlgorithm(SIGNATURE_ALGORITHM_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM_OID:
				setSignatureAlgorithmOid(SIGNATURE_ALGORITHM_OID_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__ID:
				unsetId();
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY:
				setPublicKey((PublicKeyType)null);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION:
				unsetBarcodeVersion();
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_XSD:
				setBarcodeXsd(BARCODE_XSD_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES:
				setAllowedProductOwnerCodes((AllowedProductOwnerCodesType)null);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__LAST_DAY_OF_SALE:
				setLastDayOfSale(LAST_DAY_OF_SALE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED:
				unsetKeyForged();
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE:
				setCommentForEncryptionType(COMMENT_FOR_ENCRYPTION_TYPE_EDEFAULT);
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE:
				setTestbarcode((TestbarcodeType)null);
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
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_NAME:
				return ISSUER_NAME_EDEFAULT == null ? issuerName != null : !ISSUER_NAME_EDEFAULT.equals(issuerName);
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE:
				return isSetIssuerCode();
			case BarCodeKeyExchangePackage.KEY_TYPE__VERSION_TYPE:
				return VERSION_TYPE_EDEFAULT == null ? versionType != null : !VERSION_TYPE_EDEFAULT.equals(versionType);
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM:
				return SIGNATURE_ALGORITHM_EDEFAULT == null ? signatureAlgorithm != null : !SIGNATURE_ALGORITHM_EDEFAULT.equals(signatureAlgorithm);
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM_OID:
				return SIGNATURE_ALGORITHM_OID_EDEFAULT == null ? signatureAlgorithmOid != null : !SIGNATURE_ALGORITHM_OID_EDEFAULT.equals(signatureAlgorithmOid);
			case BarCodeKeyExchangePackage.KEY_TYPE__ID:
				return isSetId();
			case BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY:
				return publicKey != null;
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION:
				return isSetBarcodeVersion();
			case BarCodeKeyExchangePackage.KEY_TYPE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case BarCodeKeyExchangePackage.KEY_TYPE__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_XSD:
				return BARCODE_XSD_EDEFAULT == null ? barcodeXsd != null : !BARCODE_XSD_EDEFAULT.equals(barcodeXsd);
			case BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES:
				return allowedProductOwnerCodes != null;
			case BarCodeKeyExchangePackage.KEY_TYPE__LAST_DAY_OF_SALE:
				return LAST_DAY_OF_SALE_EDEFAULT == null ? lastDayOfSale != null : !LAST_DAY_OF_SALE_EDEFAULT.equals(lastDayOfSale);
			case BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED:
				return isSetKeyForged();
			case BarCodeKeyExchangePackage.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE:
				return COMMENT_FOR_ENCRYPTION_TYPE_EDEFAULT == null ? commentForEncryptionType != null : !COMMENT_FOR_ENCRYPTION_TYPE_EDEFAULT.equals(commentForEncryptionType);
			case BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE:
				return testbarcode != null;
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
		result.append(", signatureAlgorithm: ");
		result.append(signatureAlgorithm);
		result.append(", signatureAlgorithmOid: ");
		result.append(signatureAlgorithmOid);
		result.append(", id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", barcodeVersion: ");
		if (barcodeVersionESet) result.append(barcodeVersion); else result.append("<unset>");
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", barcodeXsd: ");
		result.append(barcodeXsd);
		result.append(", lastDayOfSale: ");
		result.append(lastDayOfSale);
		result.append(", keyForged: ");
		if (keyForgedESet) result.append(keyForged); else result.append("<unset>");
		result.append(", commentForEncryptionType: ");
		result.append(commentForEncryptionType);
		result.append(')');
		return result.toString();
	}

} //KeyTypeImpl
