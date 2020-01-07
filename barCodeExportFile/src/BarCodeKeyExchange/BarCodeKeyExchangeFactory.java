/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage
 * @generated
 */
public interface BarCodeKeyExchangeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BarCodeKeyExchangeFactory eINSTANCE = BarCodeKeyExchange.impl.BarCodeKeyExchangeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Allowed Product Owner Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Product Owner Codes Type</em>'.
	 * @generated
	 */
	AllowedProductOwnerCodesType createAllowedProductOwnerCodesType();

	/**
	 * Returns a new object of class '<em>Barcode Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Barcode Structure Type</em>'.
	 * @generated
	 */
	BarcodeStructureType createBarcodeStructureType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Keys Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keys Type</em>'.
	 * @generated
	 */
	KeysType createKeysType();

	/**
	 * Returns a new object of class '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Type</em>'.
	 * @generated
	 */
	KeyType createKeyType();

	/**
	 * Returns a new object of class '<em>Public Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Key Type</em>'.
	 * @generated
	 */
	PublicKeyType createPublicKeyType();

	/**
	 * Returns a new object of class '<em>Testbarcode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testbarcode Type</em>'.
	 * @generated
	 */
	TestbarcodeType createTestbarcodeType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BarCodeKeyExchangePackage getBarCodeKeyExchangePackage();

} //BarCodeKeyExchangeFactory
