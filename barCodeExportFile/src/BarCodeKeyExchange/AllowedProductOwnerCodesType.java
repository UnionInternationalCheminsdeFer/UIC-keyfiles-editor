/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Product Owner Codes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.AllowedProductOwnerCodesType#getProductOwnerCode <em>Product Owner Code</em>}</li>
 *   <li>{@link BarCodeKeyExchange.AllowedProductOwnerCodesType#getProductOwnerName <em>Product Owner Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getAllowedProductOwnerCodesType()
 * @model extendedMetaData="name='allowedProductOwnerCodes_._type' kind='elementOnly'"
 * @generated
 */
public interface AllowedProductOwnerCodesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Owner Code</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Owner Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Owner Code</em>' attribute list.
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getAllowedProductOwnerCodesType_ProductOwnerCode()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='element' name='productOwnerCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BigInteger> getProductOwnerCode();

	/**
	 * Returns the value of the '<em><b>Product Owner Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Owner Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Owner Name</em>' attribute list.
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getAllowedProductOwnerCodesType_ProductOwnerName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='productOwnerName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getProductOwnerName();

} // AllowedProductOwnerCodesType
