/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.AllowedProductOwnerCodesType;
import BarCodeKeyExchange.BarCodeKeyExchangePackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allowed Product Owner Codes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link BarCodeKeyExchange.impl.AllowedProductOwnerCodesTypeImpl#getProductOwnerCode <em>Product Owner Code</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.AllowedProductOwnerCodesTypeImpl#getProductOwnerName <em>Product Owner Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllowedProductOwnerCodesTypeImpl extends EObjectImpl implements AllowedProductOwnerCodesType {
	/**
	 * The cached value of the '{@link #getProductOwnerCode() <em>Product Owner Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOwnerCode()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> productOwnerCode;

	/**
	 * The cached value of the '{@link #getProductOwnerName() <em>Product Owner Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOwnerName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productOwnerName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedProductOwnerCodesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarCodeKeyExchangePackage.Literals.ALLOWED_PRODUCT_OWNER_CODES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BigInteger> getProductOwnerCode() {
		if (productOwnerCode == null) {
			productOwnerCode = new EDataTypeEList<BigInteger>(BigInteger.class, this, BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE);
		}
		return productOwnerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProductOwnerName() {
		if (productOwnerName == null) {
			productOwnerName = new EDataTypeEList<String>(String.class, this, BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME);
		}
		return productOwnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE:
				return getProductOwnerCode();
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME:
				return getProductOwnerName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE:
				getProductOwnerCode().clear();
				getProductOwnerCode().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME:
				getProductOwnerName().clear();
				getProductOwnerName().addAll((Collection<? extends String>)newValue);
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
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE:
				getProductOwnerCode().clear();
				return;
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME:
				getProductOwnerName().clear();
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
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_CODE:
				return productOwnerCode != null && !productOwnerCode.isEmpty();
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE__PRODUCT_OWNER_NAME:
				return productOwnerName != null && !productOwnerName.isEmpty();
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
		result.append(" (productOwnerCode: ");
		result.append(productOwnerCode);
		result.append(", productOwnerName: ");
		result.append(productOwnerName);
		result.append(')');
		return result.toString();
	}

} //AllowedProductOwnerCodesTypeImpl
