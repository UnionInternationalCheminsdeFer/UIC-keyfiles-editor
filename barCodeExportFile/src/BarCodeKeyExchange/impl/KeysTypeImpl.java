/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.impl;

import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.BarcodeStructureType;
import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.KeysType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keys Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.impl.KeysTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link BarCodeKeyExchange.impl.KeysTypeImpl#getBarcodeStructure <em>Barcode Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeysTypeImpl extends EObjectImpl implements KeysType {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyType> key;

	/**
	 * The cached value of the '{@link #getBarcodeStructure() <em>Barcode Structure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarcodeStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<BarcodeStructureType> barcodeStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeysTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BarCodeKeyExchangePackage.Literals.KEYS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyType> getKey() {
		if (key == null) {
			key = new EObjectContainmentEList<KeyType>(KeyType.class, this, BarCodeKeyExchangePackage.KEYS_TYPE__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BarcodeStructureType> getBarcodeStructure() {
		if (barcodeStructure == null) {
			barcodeStructure = new EObjectContainmentEList<BarcodeStructureType>(BarcodeStructureType.class, this, BarCodeKeyExchangePackage.KEYS_TYPE__BARCODE_STRUCTURE);
		}
		return barcodeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BarCodeKeyExchangePackage.KEYS_TYPE__KEY:
				return ((InternalEList<?>)getKey()).basicRemove(otherEnd, msgs);
			case BarCodeKeyExchangePackage.KEYS_TYPE__BARCODE_STRUCTURE:
				return ((InternalEList<?>)getBarcodeStructure()).basicRemove(otherEnd, msgs);
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
			case BarCodeKeyExchangePackage.KEYS_TYPE__KEY:
				return getKey();
			case BarCodeKeyExchangePackage.KEYS_TYPE__BARCODE_STRUCTURE:
				return getBarcodeStructure();
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
			case BarCodeKeyExchangePackage.KEYS_TYPE__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends KeyType>)newValue);
				return;
			case BarCodeKeyExchangePackage.KEYS_TYPE__BARCODE_STRUCTURE:
				getBarcodeStructure().clear();
				getBarcodeStructure().addAll((Collection<? extends BarcodeStructureType>)newValue);
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
			case BarCodeKeyExchangePackage.KEYS_TYPE__KEY:
				getKey().clear();
				return;
			case BarCodeKeyExchangePackage.KEYS_TYPE__BARCODE_STRUCTURE:
				getBarcodeStructure().clear();
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
			case BarCodeKeyExchangePackage.KEYS_TYPE__KEY:
				return key != null && !key.isEmpty();
			case BarCodeKeyExchangePackage.KEYS_TYPE__BARCODE_STRUCTURE:
				return barcodeStructure != null && !barcodeStructure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KeysTypeImpl
