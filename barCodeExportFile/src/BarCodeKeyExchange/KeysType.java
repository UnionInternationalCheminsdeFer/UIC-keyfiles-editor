/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keys Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.KeysType#getKey <em>Key</em>}</li>
 *   <li>{@link BarCodeKeyExchange.KeysType#getBarcodeStructure <em>Barcode Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeysType()
 * @model extendedMetaData="name='keys_._type' kind='elementOnly'"
 * @generated
 */
public interface KeysType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference list.
	 * The list contents are of type {@link BarCodeKeyExchange.KeyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference list.
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeysType_Key()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeyType> getKey();

	/**
	 * Returns the value of the '<em><b>Barcode Structure</b></em>' containment reference list.
	 * The list contents are of type {@link BarCodeKeyExchange.BarcodeStructureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barcode Structure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcode Structure</em>' containment reference list.
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getKeysType_BarcodeStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='barcodeStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BarcodeStructureType> getBarcodeStructure();

} // KeysType
