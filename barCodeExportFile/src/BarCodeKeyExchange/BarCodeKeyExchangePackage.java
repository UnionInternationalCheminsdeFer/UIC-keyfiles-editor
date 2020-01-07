/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BarCodeKeyExchange.BarCodeKeyExchangeFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface BarCodeKeyExchangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BarCodeKeyExchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/barCodeExportFile/schema/barCodeKeyExchange.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BarCodeKeyExchange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BarCodeKeyExchangePackage eINSTANCE = BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl.init();

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.AllowedProductOwnerCodesTypeImpl <em>Allowed Product Owner Codes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.AllowedProductOwnerCodesTypeImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getAllowedProductOwnerCodesType()
	 * @generated
	 */
	int ALLOWED_PRODUCT_OWNER_CODES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Product Owner Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE = 0;

	/**
	 * The feature id for the '<em><b>Product Owner Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Allowed Product Owner Codes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_PRODUCT_OWNER_CODES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl <em>Barcode Structure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.BarcodeStructureTypeImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getBarcodeStructureType()
	 * @generated
	 */
	int BARCODE_STRUCTURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE__ISSUER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Issuer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE__ISSUER_CODE = 1;

	/**
	 * The feature id for the '<em><b>Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE__VERSION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Barcode Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE__BARCODE_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Barcode Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARCODE_STRUCTURE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.DocumentRootImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.KeysTypeImpl <em>Keys Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.KeysTypeImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeysType()
	 * @generated
	 */
	int KEYS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Barcode Structure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_TYPE__BARCODE_STRUCTURE = 1;

	/**
	 * The number of structural features of the '<em>Keys Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.KeyTypeImpl <em>Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.KeyTypeImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeyType()
	 * @generated
	 */
	int KEY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__ISSUER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Issuer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__ISSUER_CODE = 1;

	/**
	 * The feature id for the '<em><b>Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__VERSION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__SIGNATURE_ALGORITHM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__PUBLIC_KEY = 5;

	/**
	 * The feature id for the '<em><b>Barcode Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__BARCODE_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__START_DATE = 7;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__END_DATE = 8;

	/**
	 * The feature id for the '<em><b>Barcode Xsd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__BARCODE_XSD = 9;

	/**
	 * The feature id for the '<em><b>Allowed Product Owner Codes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES = 10;

	/**
	 * The feature id for the '<em><b>Last Day Of Sale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__LAST_DAY_OF_SALE = 11;

	/**
	 * The feature id for the '<em><b>Key Forged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__KEY_FORGED = 12;

	/**
	 * The feature id for the '<em><b>Comment For Encryption Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Testbarcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE__TESTBARCODE = 14;

	/**
	 * The number of structural features of the '<em>Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_TYPE_FEATURE_COUNT = 15;


	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.PublicKeyTypeImpl <em>Public Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.PublicKeyTypeImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getPublicKeyType()
	 * @generated
	 */
	int PUBLIC_KEY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_KEY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Keytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_KEY_TYPE__KEYTYPE = 1;

	/**
	 * The number of structural features of the '<em>Public Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_KEY_TYPE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.impl.TestbarcodeTypeImpl <em>Testbarcode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.impl.TestbarcodeTypeImpl
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getTestbarcodeType()
	 * @generated
	 */
	int TESTBARCODE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Imagetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBARCODE_TYPE__IMAGETYPE = 0;

	/**
	 * The feature id for the '<em><b>Imagedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBARCODE_TYPE__IMAGEDATA = 1;

	/**
	 * The number of structural features of the '<em>Testbarcode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBARCODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.ImagetypeType <em>Imagetype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.ImagetypeType
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getImagetypeType()
	 * @generated
	 */
	int IMAGETYPE_TYPE = 7;

	/**
	 * The meta object id for the '{@link BarCodeKeyExchange.KeyForgedType <em>Key Forged Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.KeyForgedType
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeyForgedType()
	 * @generated
	 */
	int KEY_FORGED_TYPE = 8;

	/**
	 * The meta object id for the '<em>Imagetype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.ImagetypeType
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getImagetypeTypeObject()
	 * @generated
	 */
	int IMAGETYPE_TYPE_OBJECT = 9;

	/**
	 * The meta object id for the '<em>Key Forged Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BarCodeKeyExchange.KeyForgedType
	 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeyForgedTypeObject()
	 * @generated
	 */
	int KEY_FORGED_TYPE_OBJECT = 10;


	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.AllowedProductOwnerCodesType <em>Allowed Product Owner Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Product Owner Codes Type</em>'.
	 * @see BarCodeKeyExchange.AllowedProductOwnerCodesType
	 * @generated
	 */
	EClass getAllowedProductOwnerCodesType();

	/**
	 * Returns the meta object for the attribute list '{@link BarCodeKeyExchange.AllowedProductOwnerCodesType#getProductOwnerCode <em>Product Owner Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Product Owner Code</em>'.
	 * @see BarCodeKeyExchange.AllowedProductOwnerCodesType#getProductOwnerCode()
	 * @see #getAllowedProductOwnerCodesType()
	 * @generated
	 */
	EAttribute getAllowedProductOwnerCodesType_ProductOwnerCode();

	/**
	 * Returns the meta object for the attribute list '{@link BarCodeKeyExchange.AllowedProductOwnerCodesType#getProductOwnerName <em>Product Owner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Product Owner Name</em>'.
	 * @see BarCodeKeyExchange.AllowedProductOwnerCodesType#getProductOwnerName()
	 * @see #getAllowedProductOwnerCodesType()
	 * @generated
	 */
	EAttribute getAllowedProductOwnerCodesType_ProductOwnerName();

	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.BarcodeStructureType <em>Barcode Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barcode Structure Type</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType
	 * @generated
	 */
	EClass getBarcodeStructureType();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType#getIssuerName()
	 * @see #getBarcodeStructureType()
	 * @generated
	 */
	EAttribute getBarcodeStructureType_IssuerName();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerCode <em>Issuer Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Code</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType#getIssuerCode()
	 * @see #getBarcodeStructureType()
	 * @generated
	 */
	EAttribute getBarcodeStructureType_IssuerCode();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.BarcodeStructureType#getVersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Type</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType#getVersionType()
	 * @see #getBarcodeStructureType()
	 * @generated
	 */
	EAttribute getBarcodeStructureType_VersionType();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.BarcodeStructureType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType#getId()
	 * @see #getBarcodeStructureType()
	 * @generated
	 */
	EAttribute getBarcodeStructureType_Id();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.BarcodeStructureType#getBarcodeVersion <em>Barcode Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barcode Version</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType#getBarcodeVersion()
	 * @see #getBarcodeStructureType()
	 * @generated
	 */
	EAttribute getBarcodeStructureType_BarcodeVersion();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.BarcodeStructureType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BarCodeKeyExchange.BarcodeStructureType#getDescription()
	 * @see #getBarcodeStructureType()
	 * @generated
	 */
	EAttribute getBarcodeStructureType_Description();

	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see BarCodeKeyExchange.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link BarCodeKeyExchange.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see BarCodeKeyExchange.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link BarCodeKeyExchange.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see BarCodeKeyExchange.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link BarCodeKeyExchange.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see BarCodeKeyExchange.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link BarCodeKeyExchange.DocumentRoot#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keys</em>'.
	 * @see BarCodeKeyExchange.DocumentRoot#getKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Keys();

	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.KeysType <em>Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keys Type</em>'.
	 * @see BarCodeKeyExchange.KeysType
	 * @generated
	 */
	EClass getKeysType();

	/**
	 * Returns the meta object for the containment reference list '{@link BarCodeKeyExchange.KeysType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see BarCodeKeyExchange.KeysType#getKey()
	 * @see #getKeysType()
	 * @generated
	 */
	EReference getKeysType_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link BarCodeKeyExchange.KeysType#getBarcodeStructure <em>Barcode Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Barcode Structure</em>'.
	 * @see BarCodeKeyExchange.KeysType#getBarcodeStructure()
	 * @see #getKeysType()
	 * @generated
	 */
	EReference getKeysType_BarcodeStructure();

	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Type</em>'.
	 * @see BarCodeKeyExchange.KeyType
	 * @generated
	 */
	EClass getKeyType();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getIssuerName <em>Issuer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Name</em>'.
	 * @see BarCodeKeyExchange.KeyType#getIssuerName()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_IssuerName();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getIssuerCode <em>Issuer Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuer Code</em>'.
	 * @see BarCodeKeyExchange.KeyType#getIssuerCode()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_IssuerCode();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getVersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Type</em>'.
	 * @see BarCodeKeyExchange.KeyType#getVersionType()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_VersionType();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getSignatureAlgorithm <em>Signature Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature Algorithm</em>'.
	 * @see BarCodeKeyExchange.KeyType#getSignatureAlgorithm()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_SignatureAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see BarCodeKeyExchange.KeyType#getId()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link BarCodeKeyExchange.KeyType#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Public Key</em>'.
	 * @see BarCodeKeyExchange.KeyType#getPublicKey()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_PublicKey();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getBarcodeVersion <em>Barcode Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barcode Version</em>'.
	 * @see BarCodeKeyExchange.KeyType#getBarcodeVersion()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_BarcodeVersion();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see BarCodeKeyExchange.KeyType#getStartDate()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see BarCodeKeyExchange.KeyType#getEndDate()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getBarcodeXsd <em>Barcode Xsd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Barcode Xsd</em>'.
	 * @see BarCodeKeyExchange.KeyType#getBarcodeXsd()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_BarcodeXsd();

	/**
	 * Returns the meta object for the containment reference '{@link BarCodeKeyExchange.KeyType#getAllowedProductOwnerCodes <em>Allowed Product Owner Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Product Owner Codes</em>'.
	 * @see BarCodeKeyExchange.KeyType#getAllowedProductOwnerCodes()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_AllowedProductOwnerCodes();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getLastDayOfSale <em>Last Day Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Day Of Sale</em>'.
	 * @see BarCodeKeyExchange.KeyType#getLastDayOfSale()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_LastDayOfSale();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getKeyForged <em>Key Forged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Forged</em>'.
	 * @see BarCodeKeyExchange.KeyType#getKeyForged()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_KeyForged();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.KeyType#getCommentForEncryptionType <em>Comment For Encryption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment For Encryption Type</em>'.
	 * @see BarCodeKeyExchange.KeyType#getCommentForEncryptionType()
	 * @see #getKeyType()
	 * @generated
	 */
	EAttribute getKeyType_CommentForEncryptionType();

	/**
	 * Returns the meta object for the containment reference '{@link BarCodeKeyExchange.KeyType#getTestbarcode <em>Testbarcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testbarcode</em>'.
	 * @see BarCodeKeyExchange.KeyType#getTestbarcode()
	 * @see #getKeyType()
	 * @generated
	 */
	EReference getKeyType_Testbarcode();

	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.PublicKeyType <em>Public Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Key Type</em>'.
	 * @see BarCodeKeyExchange.PublicKeyType
	 * @generated
	 */
	EClass getPublicKeyType();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.PublicKeyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see BarCodeKeyExchange.PublicKeyType#getValue()
	 * @see #getPublicKeyType()
	 * @generated
	 */
	EAttribute getPublicKeyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.PublicKeyType#getKeytype <em>Keytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keytype</em>'.
	 * @see BarCodeKeyExchange.PublicKeyType#getKeytype()
	 * @see #getPublicKeyType()
	 * @generated
	 */
	EAttribute getPublicKeyType_Keytype();

	/**
	 * Returns the meta object for class '{@link BarCodeKeyExchange.TestbarcodeType <em>Testbarcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testbarcode Type</em>'.
	 * @see BarCodeKeyExchange.TestbarcodeType
	 * @generated
	 */
	EClass getTestbarcodeType();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.TestbarcodeType#getImagetype <em>Imagetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imagetype</em>'.
	 * @see BarCodeKeyExchange.TestbarcodeType#getImagetype()
	 * @see #getTestbarcodeType()
	 * @generated
	 */
	EAttribute getTestbarcodeType_Imagetype();

	/**
	 * Returns the meta object for the attribute '{@link BarCodeKeyExchange.TestbarcodeType#getImagedata <em>Imagedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imagedata</em>'.
	 * @see BarCodeKeyExchange.TestbarcodeType#getImagedata()
	 * @see #getTestbarcodeType()
	 * @generated
	 */
	EAttribute getTestbarcodeType_Imagedata();

	/**
	 * Returns the meta object for enum '{@link BarCodeKeyExchange.ImagetypeType <em>Imagetype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Imagetype Type</em>'.
	 * @see BarCodeKeyExchange.ImagetypeType
	 * @generated
	 */
	EEnum getImagetypeType();

	/**
	 * Returns the meta object for enum '{@link BarCodeKeyExchange.KeyForgedType <em>Key Forged Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Key Forged Type</em>'.
	 * @see BarCodeKeyExchange.KeyForgedType
	 * @generated
	 */
	EEnum getKeyForgedType();

	/**
	 * Returns the meta object for data type '{@link BarCodeKeyExchange.ImagetypeType <em>Imagetype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Imagetype Type Object</em>'.
	 * @see BarCodeKeyExchange.ImagetypeType
	 * @model instanceClass="BarCodeKeyExchange.ImagetypeType"
	 *        extendedMetaData="name='imagetype_._type:Object' baseType='imagetype_._type'"
	 * @generated
	 */
	EDataType getImagetypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link BarCodeKeyExchange.KeyForgedType <em>Key Forged Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Key Forged Type Object</em>'.
	 * @see BarCodeKeyExchange.KeyForgedType
	 * @model instanceClass="BarCodeKeyExchange.KeyForgedType"
	 *        extendedMetaData="name='keyForged_._type:Object' baseType='keyForged_._type'"
	 * @generated
	 */
	EDataType getKeyForgedTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BarCodeKeyExchangeFactory getBarCodeKeyExchangeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.AllowedProductOwnerCodesTypeImpl <em>Allowed Product Owner Codes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.AllowedProductOwnerCodesTypeImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getAllowedProductOwnerCodesType()
		 * @generated
		 */
		EClass ALLOWED_PRODUCT_OWNER_CODES_TYPE = eINSTANCE.getAllowedProductOwnerCodesType();

		/**
		 * The meta object literal for the '<em><b>Product Owner Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE = eINSTANCE.getAllowedProductOwnerCodesType_ProductOwnerCode();

		/**
		 * The meta object literal for the '<em><b>Product Owner Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME = eINSTANCE.getAllowedProductOwnerCodesType_ProductOwnerName();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.BarcodeStructureTypeImpl <em>Barcode Structure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.BarcodeStructureTypeImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getBarcodeStructureType()
		 * @generated
		 */
		EClass BARCODE_STRUCTURE_TYPE = eINSTANCE.getBarcodeStructureType();

		/**
		 * The meta object literal for the '<em><b>Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_STRUCTURE_TYPE__ISSUER_NAME = eINSTANCE.getBarcodeStructureType_IssuerName();

		/**
		 * The meta object literal for the '<em><b>Issuer Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_STRUCTURE_TYPE__ISSUER_CODE = eINSTANCE.getBarcodeStructureType_IssuerCode();

		/**
		 * The meta object literal for the '<em><b>Version Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_STRUCTURE_TYPE__VERSION_TYPE = eINSTANCE.getBarcodeStructureType_VersionType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_STRUCTURE_TYPE__ID = eINSTANCE.getBarcodeStructureType_Id();

		/**
		 * The meta object literal for the '<em><b>Barcode Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_STRUCTURE_TYPE__BARCODE_VERSION = eINSTANCE.getBarcodeStructureType_BarcodeVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARCODE_STRUCTURE_TYPE__DESCRIPTION = eINSTANCE.getBarcodeStructureType_Description();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.DocumentRootImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYS = eINSTANCE.getDocumentRoot_Keys();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.KeysTypeImpl <em>Keys Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.KeysTypeImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeysType()
		 * @generated
		 */
		EClass KEYS_TYPE = eINSTANCE.getKeysType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYS_TYPE__KEY = eINSTANCE.getKeysType_Key();

		/**
		 * The meta object literal for the '<em><b>Barcode Structure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYS_TYPE__BARCODE_STRUCTURE = eINSTANCE.getKeysType_BarcodeStructure();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.KeyTypeImpl <em>Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.KeyTypeImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeyType()
		 * @generated
		 */
		EClass KEY_TYPE = eINSTANCE.getKeyType();

		/**
		 * The meta object literal for the '<em><b>Issuer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__ISSUER_NAME = eINSTANCE.getKeyType_IssuerName();

		/**
		 * The meta object literal for the '<em><b>Issuer Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__ISSUER_CODE = eINSTANCE.getKeyType_IssuerCode();

		/**
		 * The meta object literal for the '<em><b>Version Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__VERSION_TYPE = eINSTANCE.getKeyType_VersionType();

		/**
		 * The meta object literal for the '<em><b>Signature Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__SIGNATURE_ALGORITHM = eINSTANCE.getKeyType_SignatureAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__ID = eINSTANCE.getKeyType_Id();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__PUBLIC_KEY = eINSTANCE.getKeyType_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Barcode Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__BARCODE_VERSION = eINSTANCE.getKeyType_BarcodeVersion();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__START_DATE = eINSTANCE.getKeyType_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__END_DATE = eINSTANCE.getKeyType_EndDate();

		/**
		 * The meta object literal for the '<em><b>Barcode Xsd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__BARCODE_XSD = eINSTANCE.getKeyType_BarcodeXsd();

		/**
		 * The meta object literal for the '<em><b>Allowed Product Owner Codes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES = eINSTANCE.getKeyType_AllowedProductOwnerCodes();

		/**
		 * The meta object literal for the '<em><b>Last Day Of Sale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__LAST_DAY_OF_SALE = eINSTANCE.getKeyType_LastDayOfSale();

		/**
		 * The meta object literal for the '<em><b>Key Forged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__KEY_FORGED = eINSTANCE.getKeyType_KeyForged();

		/**
		 * The meta object literal for the '<em><b>Comment For Encryption Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE = eINSTANCE.getKeyType_CommentForEncryptionType();

		/**
		 * The meta object literal for the '<em><b>Testbarcode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_TYPE__TESTBARCODE = eINSTANCE.getKeyType_Testbarcode();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.PublicKeyTypeImpl <em>Public Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.PublicKeyTypeImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getPublicKeyType()
		 * @generated
		 */
		EClass PUBLIC_KEY_TYPE = eINSTANCE.getPublicKeyType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_KEY_TYPE__VALUE = eINSTANCE.getPublicKeyType_Value();

		/**
		 * The meta object literal for the '<em><b>Keytype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_KEY_TYPE__KEYTYPE = eINSTANCE.getPublicKeyType_Keytype();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.impl.TestbarcodeTypeImpl <em>Testbarcode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.impl.TestbarcodeTypeImpl
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getTestbarcodeType()
		 * @generated
		 */
		EClass TESTBARCODE_TYPE = eINSTANCE.getTestbarcodeType();

		/**
		 * The meta object literal for the '<em><b>Imagetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTBARCODE_TYPE__IMAGETYPE = eINSTANCE.getTestbarcodeType_Imagetype();

		/**
		 * The meta object literal for the '<em><b>Imagedata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTBARCODE_TYPE__IMAGEDATA = eINSTANCE.getTestbarcodeType_Imagedata();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.ImagetypeType <em>Imagetype Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.ImagetypeType
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getImagetypeType()
		 * @generated
		 */
		EEnum IMAGETYPE_TYPE = eINSTANCE.getImagetypeType();

		/**
		 * The meta object literal for the '{@link BarCodeKeyExchange.KeyForgedType <em>Key Forged Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.KeyForgedType
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeyForgedType()
		 * @generated
		 */
		EEnum KEY_FORGED_TYPE = eINSTANCE.getKeyForgedType();

		/**
		 * The meta object literal for the '<em>Imagetype Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.ImagetypeType
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getImagetypeTypeObject()
		 * @generated
		 */
		EDataType IMAGETYPE_TYPE_OBJECT = eINSTANCE.getImagetypeTypeObject();

		/**
		 * The meta object literal for the '<em>Key Forged Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BarCodeKeyExchange.KeyForgedType
		 * @see BarCodeKeyExchange.impl.BarCodeKeyExchangePackageImpl#getKeyForgedTypeObject()
		 * @generated
		 */
		EDataType KEY_FORGED_TYPE_OBJECT = eINSTANCE.getKeyForgedTypeObject();

	}

} //BarCodeKeyExchangePackage
