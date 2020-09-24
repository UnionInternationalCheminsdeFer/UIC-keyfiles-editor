/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BarCodeKeyExchangeFactoryImpl extends EFactoryImpl implements BarCodeKeyExchangeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BarCodeKeyExchangeFactory init() {
		try {
			BarCodeKeyExchangeFactory theBarCodeKeyExchangeFactory = (BarCodeKeyExchangeFactory)EPackage.Registry.INSTANCE.getEFactory(BarCodeKeyExchangePackage.eNS_URI);
			if (theBarCodeKeyExchangeFactory != null) {
				return theBarCodeKeyExchangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BarCodeKeyExchangeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarCodeKeyExchangeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE: return createAllowedProductOwnerCodesType();
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE: return createBarcodeStructureType();
			case BarCodeKeyExchangePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BarCodeKeyExchangePackage.KEYS_TYPE: return createKeysType();
			case BarCodeKeyExchangePackage.KEY_TYPE: return createKeyType();
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE: return createPublicKeyType();
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE: return createTestbarcodeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BarCodeKeyExchangePackage.IMAGETYPE_TYPE:
				return createImagetypeTypeFromString(eDataType, initialValue);
			case BarCodeKeyExchangePackage.KEY_FORGED_TYPE:
				return createKeyForgedTypeFromString(eDataType, initialValue);
			case BarCodeKeyExchangePackage.IMAGETYPE_TYPE_OBJECT:
				return createImagetypeTypeObjectFromString(eDataType, initialValue);
			case BarCodeKeyExchangePackage.KEY_FORGED_TYPE_OBJECT:
				return createKeyForgedTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BarCodeKeyExchangePackage.IMAGETYPE_TYPE:
				return convertImagetypeTypeToString(eDataType, instanceValue);
			case BarCodeKeyExchangePackage.KEY_FORGED_TYPE:
				return convertKeyForgedTypeToString(eDataType, instanceValue);
			case BarCodeKeyExchangePackage.IMAGETYPE_TYPE_OBJECT:
				return convertImagetypeTypeObjectToString(eDataType, instanceValue);
			case BarCodeKeyExchangePackage.KEY_FORGED_TYPE_OBJECT:
				return convertKeyForgedTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedProductOwnerCodesType createAllowedProductOwnerCodesType() {
		AllowedProductOwnerCodesTypeImpl allowedProductOwnerCodesType = new AllowedProductOwnerCodesTypeImpl();
		return allowedProductOwnerCodesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarcodeStructureType createBarcodeStructureType() {
		BarcodeStructureTypeImpl barcodeStructureType = new BarcodeStructureTypeImpl();
		return barcodeStructureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeysType createKeysType() {
		KeysTypeImpl keysType = new KeysTypeImpl();
		return keysType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyType createKeyType() {
		KeyTypeImpl keyType = new KeyTypeImpl();
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicKeyType createPublicKeyType() {
		PublicKeyTypeImpl publicKeyType = new PublicKeyTypeImpl();
		return publicKeyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestbarcodeType createTestbarcodeType() {
		TestbarcodeTypeImpl testbarcodeType = new TestbarcodeTypeImpl();
		return testbarcodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagetypeType createImagetypeTypeFromString(EDataType eDataType, String initialValue) {
		ImagetypeType result = ImagetypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagetypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyForgedType createKeyForgedTypeFromString(EDataType eDataType, String initialValue) {
		KeyForgedType result = KeyForgedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyForgedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagetypeType createImagetypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImagetypeTypeFromString(BarCodeKeyExchangePackage.Literals.IMAGETYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImagetypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImagetypeTypeToString(BarCodeKeyExchangePackage.Literals.IMAGETYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyForgedType createKeyForgedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKeyForgedTypeFromString(BarCodeKeyExchangePackage.Literals.KEY_FORGED_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeyForgedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKeyForgedTypeToString(BarCodeKeyExchangePackage.Literals.KEY_FORGED_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BarCodeKeyExchangePackage getBarCodeKeyExchangePackage() {
		return (BarCodeKeyExchangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BarCodeKeyExchangePackage getPackage() {
		return BarCodeKeyExchangePackage.eINSTANCE;
	}

} //BarCodeKeyExchangeFactoryImpl
