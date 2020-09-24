/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BarCodeKeyExchange.util;

import BarCodeKeyExchange.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage
 * @generated
 */
public class BarCodeKeyExchangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BarCodeKeyExchangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarCodeKeyExchangeSwitch() {
		if (modelPackage == null) {
			modelPackage = BarCodeKeyExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE: {
				AllowedProductOwnerCodesType allowedProductOwnerCodesType = (AllowedProductOwnerCodesType)theEObject;
				T result = caseAllowedProductOwnerCodesType(allowedProductOwnerCodesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE: {
				BarcodeStructureType barcodeStructureType = (BarcodeStructureType)theEObject;
				T result = caseBarcodeStructureType(barcodeStructureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BarCodeKeyExchangePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BarCodeKeyExchangePackage.KEYS_TYPE: {
				KeysType keysType = (KeysType)theEObject;
				T result = caseKeysType(keysType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BarCodeKeyExchangePackage.KEY_TYPE: {
				KeyType keyType = (KeyType)theEObject;
				T result = caseKeyType(keyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE: {
				PublicKeyType publicKeyType = (PublicKeyType)theEObject;
				T result = casePublicKeyType(publicKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE: {
				TestbarcodeType testbarcodeType = (TestbarcodeType)theEObject;
				T result = caseTestbarcodeType(testbarcodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Product Owner Codes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Product Owner Codes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedProductOwnerCodesType(AllowedProductOwnerCodesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barcode Structure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barcode Structure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarcodeStructureType(BarcodeStructureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keys Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keys Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeysType(KeysType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyType(KeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicKeyType(PublicKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testbarcode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testbarcode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestbarcodeType(TestbarcodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BarCodeKeyExchangeSwitch
