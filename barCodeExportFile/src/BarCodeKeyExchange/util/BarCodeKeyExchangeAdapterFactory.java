/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.util;

import BarCodeKeyExchange.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage
 * @generated
 */
public class BarCodeKeyExchangeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BarCodeKeyExchangePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarCodeKeyExchangeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BarCodeKeyExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarCodeKeyExchangeSwitch<Adapter> modelSwitch =
		new BarCodeKeyExchangeSwitch<Adapter>() {
			@Override
			public Adapter caseAllowedProductOwnerCodesType(AllowedProductOwnerCodesType object) {
				return createAllowedProductOwnerCodesTypeAdapter();
			}
			@Override
			public Adapter caseBarcodeStructureType(BarcodeStructureType object) {
				return createBarcodeStructureTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseKeysType(KeysType object) {
				return createKeysTypeAdapter();
			}
			@Override
			public Adapter caseKeyType(KeyType object) {
				return createKeyTypeAdapter();
			}
			@Override
			public Adapter casePublicKeyType(PublicKeyType object) {
				return createPublicKeyTypeAdapter();
			}
			@Override
			public Adapter caseTestbarcodeType(TestbarcodeType object) {
				return createTestbarcodeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.AllowedProductOwnerCodesType <em>Allowed Product Owner Codes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.AllowedProductOwnerCodesType
	 * @generated
	 */
	public Adapter createAllowedProductOwnerCodesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.BarcodeStructureType <em>Barcode Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.BarcodeStructureType
	 * @generated
	 */
	public Adapter createBarcodeStructureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.KeysType <em>Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.KeysType
	 * @generated
	 */
	public Adapter createKeysTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.KeyType
	 * @generated
	 */
	public Adapter createKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.PublicKeyType <em>Public Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.PublicKeyType
	 * @generated
	 */
	public Adapter createPublicKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BarCodeKeyExchange.TestbarcodeType <em>Testbarcode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BarCodeKeyExchange.TestbarcodeType
	 * @generated
	 */
	public Adapter createTestbarcodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BarCodeKeyExchangeAdapterFactory
