/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.AllowedProductOwnerCodesType;
import BarCodeKeyExchange.BarCodeKeyExchangeFactory;
import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.BarcodeStructureType;
import BarCodeKeyExchange.DocumentRoot;
import BarCodeKeyExchange.ImagetypeType;
import BarCodeKeyExchange.KeyForgedType;
import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.KeysType;

import BarCodeKeyExchange.PublicKeyType;
import BarCodeKeyExchange.TestbarcodeType;
import BarCodeKeyExchange.util.BarCodeKeyExchangeValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BarCodeKeyExchangePackageImpl extends EPackageImpl implements BarCodeKeyExchangePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedProductOwnerCodesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barcodeStructureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keysTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicKeyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testbarcodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imagetypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum keyForgedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imagetypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType keyForgedTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BarCodeKeyExchangePackageImpl() {
		super(eNS_URI, BarCodeKeyExchangeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BarCodeKeyExchangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BarCodeKeyExchangePackage init() {
		if (isInited) return (BarCodeKeyExchangePackage)EPackage.Registry.INSTANCE.getEPackage(BarCodeKeyExchangePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBarCodeKeyExchangePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BarCodeKeyExchangePackageImpl theBarCodeKeyExchangePackage = registeredBarCodeKeyExchangePackage instanceof BarCodeKeyExchangePackageImpl ? (BarCodeKeyExchangePackageImpl)registeredBarCodeKeyExchangePackage : new BarCodeKeyExchangePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBarCodeKeyExchangePackage.createPackageContents();

		// Initialize created meta-data
		theBarCodeKeyExchangePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBarCodeKeyExchangePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BarCodeKeyExchangeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBarCodeKeyExchangePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BarCodeKeyExchangePackage.eNS_URI, theBarCodeKeyExchangePackage);
		return theBarCodeKeyExchangePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllowedProductOwnerCodesType() {
		return allowedProductOwnerCodesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllowedProductOwnerCodesType_ProductOwnerCode() {
		return (EAttribute)allowedProductOwnerCodesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllowedProductOwnerCodesType_ProductOwnerName() {
		return (EAttribute)allowedProductOwnerCodesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBarcodeStructureType() {
		return barcodeStructureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeStructureType_IssuerName() {
		return (EAttribute)barcodeStructureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeStructureType_IssuerCode() {
		return (EAttribute)barcodeStructureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeStructureType_VersionType() {
		return (EAttribute)barcodeStructureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeStructureType_Id() {
		return (EAttribute)barcodeStructureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeStructureType_BarcodeVersion() {
		return (EAttribute)barcodeStructureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBarcodeStructureType_Description() {
		return (EAttribute)barcodeStructureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Keys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeysType() {
		return keysTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeysType_Key() {
		return (EReference)keysTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeysType_BarcodeStructure() {
		return (EReference)keysTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyType() {
		return keyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_IssuerName() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_IssuerCode() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_VersionType() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_SignatureAlgorithm() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_SignatureAlgorithmOid() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_Id() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeyType_PublicKey() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_BarcodeVersion() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_StartDate() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_EndDate() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_BarcodeXsd() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeyType_AllowedProductOwnerCodes() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_LastDayOfSale() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_KeyForged() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyType_CommentForEncryptionType() {
		return (EAttribute)keyTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeyType_Testbarcode() {
		return (EReference)keyTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPublicKeyType() {
		return publicKeyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicKeyType_Value() {
		return (EAttribute)publicKeyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPublicKeyType_Keytype() {
		return (EAttribute)publicKeyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestbarcodeType() {
		return testbarcodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestbarcodeType_Imagetype() {
		return (EAttribute)testbarcodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestbarcodeType_Imagedata() {
		return (EAttribute)testbarcodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImagetypeType() {
		return imagetypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getKeyForgedType() {
		return keyForgedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImagetypeTypeObject() {
		return imagetypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKeyForgedTypeObject() {
		return keyForgedTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarCodeKeyExchangeFactory getBarCodeKeyExchangeFactory() {
		return (BarCodeKeyExchangeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		allowedProductOwnerCodesTypeEClass = createEClass(ALLOWED_PRODUCT_OWNER_CODES_TYPE);
		createEAttribute(allowedProductOwnerCodesTypeEClass, ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE);
		createEAttribute(allowedProductOwnerCodesTypeEClass, ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME);

		barcodeStructureTypeEClass = createEClass(BARCODE_STRUCTURE_TYPE);
		createEAttribute(barcodeStructureTypeEClass, BARCODE_STRUCTURE_TYPE__ISSUER_NAME);
		createEAttribute(barcodeStructureTypeEClass, BARCODE_STRUCTURE_TYPE__ISSUER_CODE);
		createEAttribute(barcodeStructureTypeEClass, BARCODE_STRUCTURE_TYPE__VERSION_TYPE);
		createEAttribute(barcodeStructureTypeEClass, BARCODE_STRUCTURE_TYPE__ID);
		createEAttribute(barcodeStructureTypeEClass, BARCODE_STRUCTURE_TYPE__BARCODE_VERSION);
		createEAttribute(barcodeStructureTypeEClass, BARCODE_STRUCTURE_TYPE__DESCRIPTION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEYS);

		keysTypeEClass = createEClass(KEYS_TYPE);
		createEReference(keysTypeEClass, KEYS_TYPE__KEY);
		createEReference(keysTypeEClass, KEYS_TYPE__BARCODE_STRUCTURE);

		keyTypeEClass = createEClass(KEY_TYPE);
		createEAttribute(keyTypeEClass, KEY_TYPE__ISSUER_NAME);
		createEAttribute(keyTypeEClass, KEY_TYPE__ISSUER_CODE);
		createEAttribute(keyTypeEClass, KEY_TYPE__VERSION_TYPE);
		createEAttribute(keyTypeEClass, KEY_TYPE__SIGNATURE_ALGORITHM);
		createEAttribute(keyTypeEClass, KEY_TYPE__SIGNATURE_ALGORITHM_OID);
		createEAttribute(keyTypeEClass, KEY_TYPE__ID);
		createEReference(keyTypeEClass, KEY_TYPE__PUBLIC_KEY);
		createEAttribute(keyTypeEClass, KEY_TYPE__BARCODE_VERSION);
		createEAttribute(keyTypeEClass, KEY_TYPE__START_DATE);
		createEAttribute(keyTypeEClass, KEY_TYPE__END_DATE);
		createEAttribute(keyTypeEClass, KEY_TYPE__BARCODE_XSD);
		createEReference(keyTypeEClass, KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES);
		createEAttribute(keyTypeEClass, KEY_TYPE__LAST_DAY_OF_SALE);
		createEAttribute(keyTypeEClass, KEY_TYPE__KEY_FORGED);
		createEAttribute(keyTypeEClass, KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE);
		createEReference(keyTypeEClass, KEY_TYPE__TESTBARCODE);

		publicKeyTypeEClass = createEClass(PUBLIC_KEY_TYPE);
		createEAttribute(publicKeyTypeEClass, PUBLIC_KEY_TYPE__VALUE);
		createEAttribute(publicKeyTypeEClass, PUBLIC_KEY_TYPE__KEYTYPE);

		testbarcodeTypeEClass = createEClass(TESTBARCODE_TYPE);
		createEAttribute(testbarcodeTypeEClass, TESTBARCODE_TYPE__IMAGETYPE);
		createEAttribute(testbarcodeTypeEClass, TESTBARCODE_TYPE__IMAGEDATA);

		// Create enums
		imagetypeTypeEEnum = createEEnum(IMAGETYPE_TYPE);
		keyForgedTypeEEnum = createEEnum(KEY_FORGED_TYPE);

		// Create data types
		imagetypeTypeObjectEDataType = createEDataType(IMAGETYPE_TYPE_OBJECT);
		keyForgedTypeObjectEDataType = createEDataType(KEY_FORGED_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(allowedProductOwnerCodesTypeEClass, AllowedProductOwnerCodesType.class, "AllowedProductOwnerCodesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllowedProductOwnerCodesType_ProductOwnerCode(), theXMLTypePackage.getNonNegativeInteger(), "productOwnerCode", null, 0, -1, AllowedProductOwnerCodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllowedProductOwnerCodesType_ProductOwnerName(), theXMLTypePackage.getString(), "productOwnerName", null, 0, -1, AllowedProductOwnerCodesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(barcodeStructureTypeEClass, BarcodeStructureType.class, "BarcodeStructureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBarcodeStructureType_IssuerName(), theXMLTypePackage.getString(), "issuerName", null, 1, 1, BarcodeStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarcodeStructureType_IssuerCode(), theXMLTypePackage.getInt(), "issuerCode", null, 1, 1, BarcodeStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarcodeStructureType_VersionType(), theXMLTypePackage.getString(), "versionType", null, 1, 1, BarcodeStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarcodeStructureType_Id(), theXMLTypePackage.getInt(), "id", null, 1, 1, BarcodeStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarcodeStructureType_BarcodeVersion(), theXMLTypePackage.getInt(), "barcodeVersion", null, 1, 1, BarcodeStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBarcodeStructureType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, BarcodeStructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Keys(), this.getKeysType(), null, "keys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(keysTypeEClass, KeysType.class, "KeysType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeysType_Key(), this.getKeyType(), null, "key", null, 0, -1, KeysType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeysType_BarcodeStructure(), this.getBarcodeStructureType(), null, "barcodeStructure", null, 0, -1, KeysType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyTypeEClass, KeyType.class, "KeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyType_IssuerName(), theXMLTypePackage.getString(), "issuerName", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_IssuerCode(), theXMLTypePackage.getInt(), "issuerCode", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_VersionType(), theXMLTypePackage.getString(), "versionType", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_SignatureAlgorithm(), theXMLTypePackage.getString(), "signatureAlgorithm", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_SignatureAlgorithmOid(), theXMLTypePackage.getString(), "signatureAlgorithmOid", null, 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_Id(), theXMLTypePackage.getInt(), "id", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_PublicKey(), this.getPublicKeyType(), null, "publicKey", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_BarcodeVersion(), theXMLTypePackage.getInt(), "barcodeVersion", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_StartDate(), theXMLTypePackage.getDate(), "startDate", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_EndDate(), theXMLTypePackage.getDate(), "endDate", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_BarcodeXsd(), theXMLTypePackage.getString(), "barcodeXsd", null, 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_AllowedProductOwnerCodes(), this.getAllowedProductOwnerCodesType(), null, "allowedProductOwnerCodes", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_LastDayOfSale(), theXMLTypePackage.getDate(), "lastDayOfSale", null, 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_KeyForged(), this.getKeyForgedType(), "keyForged", "false", 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyType_CommentForEncryptionType(), theXMLTypePackage.getString(), "commentForEncryptionType", null, 1, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyType_Testbarcode(), this.getTestbarcodeType(), null, "testbarcode", null, 0, 1, KeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicKeyTypeEClass, PublicKeyType.class, "PublicKeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicKeyType_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, PublicKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicKeyType_Keytype(), theXMLTypePackage.getString(), "keytype", "CERTIFICATE", 0, 1, PublicKeyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testbarcodeTypeEClass, TestbarcodeType.class, "TestbarcodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestbarcodeType_Imagetype(), this.getImagetypeType(), "imagetype", null, 1, 1, TestbarcodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestbarcodeType_Imagedata(), theXMLTypePackage.getBase64Binary(), "imagedata", null, 1, 1, TestbarcodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(imagetypeTypeEEnum, ImagetypeType.class, "ImagetypeType");
		addEEnumLiteral(imagetypeTypeEEnum, ImagetypeType.JPG);
		addEEnumLiteral(imagetypeTypeEEnum, ImagetypeType.PNG);
		addEEnumLiteral(imagetypeTypeEEnum, ImagetypeType.BMP);

		initEEnum(keyForgedTypeEEnum, KeyForgedType.class, "KeyForgedType");
		addEEnumLiteral(keyForgedTypeEEnum, KeyForgedType.TRUE);
		addEEnumLiteral(keyForgedTypeEEnum, KeyForgedType.FALSE);
		addEEnumLiteral(keyForgedTypeEEnum, KeyForgedType._1);
		addEEnumLiteral(keyForgedTypeEEnum, KeyForgedType._0);
		addEEnumLiteral(keyForgedTypeEEnum, KeyForgedType._);

		// Initialize data types
		initEDataType(imagetypeTypeObjectEDataType, ImagetypeType.class, "ImagetypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(keyForgedTypeObjectEDataType, KeyForgedType.class, "KeyForgedTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (allowedProductOwnerCodesTypeEClass,
		   source,
		   new String[] {
			   "name", "allowedProductOwnerCodes_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAllowedProductOwnerCodesType_ProductOwnerCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "productOwnerCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAllowedProductOwnerCodesType_ProductOwnerName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "productOwnerName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (barcodeStructureTypeEClass,
		   source,
		   new String[] {
			   "name", "BarcodeStructureType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBarcodeStructureType_IssuerName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issuerName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBarcodeStructureType_IssuerCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issuerCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBarcodeStructureType_VersionType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBarcodeStructureType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBarcodeStructureType_BarcodeVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "barcodeVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBarcodeStructureType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Keys(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "keys",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (imagetypeTypeEEnum,
		   source,
		   new String[] {
			   "name", "imagetype_._type"
		   });
		addAnnotation
		  (imagetypeTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "imagetype_._type:Object",
			   "baseType", "imagetype_._type"
		   });
		addAnnotation
		  (keyForgedTypeEEnum,
		   source,
		   new String[] {
			   "name", "keyForged_._type"
		   });
		addAnnotation
		  (keyForgedTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "keyForged_._type:Object",
			   "baseType", "keyForged_._type"
		   });
		addAnnotation
		  (keysTypeEClass,
		   source,
		   new String[] {
			   "name", "keys_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKeysType_Key(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "key",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeysType_BarcodeStructure(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "barcodeStructure",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (keyTypeEClass,
		   source,
		   new String[] {
			   "name", "KeyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKeyType_IssuerName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issuerName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_IssuerCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "issuerCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_VersionType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "versionType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_SignatureAlgorithm(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatureAlgorithm",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_SignatureAlgorithmOid(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "signatureAlgorithmOid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_PublicKey(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "publicKey",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_BarcodeVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "barcodeVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_StartDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "startDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_EndDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "endDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_BarcodeXsd(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "barcodeXsd",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_AllowedProductOwnerCodes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allowedProductOwnerCodes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_LastDayOfSale(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "lastDayOfSale",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_KeyForged(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "keyForged",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_CommentForEncryptionType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "commentForEncryptionType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKeyType_Testbarcode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "testbarcode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (publicKeyTypeEClass,
		   source,
		   new String[] {
			   "name", "publicKeyType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPublicKeyType_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getPublicKeyType_Keytype(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "keytype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (testbarcodeTypeEClass,
		   source,
		   new String[] {
			   "name", "testbarcode_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTestbarcodeType_Imagetype(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "imagetype",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTestbarcodeType_Imagedata(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "imagedata",
			   "namespace", "##targetNamespace"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (keyTypeEClass,
		   source,
		   new String[] {
			   "constraints", "ValidKeyType ValidOidFormat RecommendedOId"
		   });
	}

} //BarCodeKeyExchangePackageImpl
