/**
 */
package BarCodeKeyExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Barcode Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerCode <em>Issuer Code</em>}</li>
 *   <li>{@link BarCodeKeyExchange.BarcodeStructureType#getVersionType <em>Version Type</em>}</li>
 *   <li>{@link BarCodeKeyExchange.BarcodeStructureType#getId <em>Id</em>}</li>
 *   <li>{@link BarCodeKeyExchange.BarcodeStructureType#getBarcodeVersion <em>Barcode Version</em>}</li>
 *   <li>{@link BarCodeKeyExchange.BarcodeStructureType#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType()
 * @model extendedMetaData="name='BarcodeStructureType' kind='elementOnly'"
 * @generated
 */
public interface BarcodeStructureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Name</em>' attribute.
	 * @see #setIssuerName(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType_IssuerName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='issuerName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssuerName();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerName <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Name</em>' attribute.
	 * @see #getIssuerName()
	 * @generated
	 */
	void setIssuerName(String value);

	/**
	 * Returns the value of the '<em><b>Issuer Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer Code</em>' attribute.
	 * @see #isSetIssuerCode()
	 * @see #unsetIssuerCode()
	 * @see #setIssuerCode(int)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType_IssuerCode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='issuerCode' namespace='##targetNamespace'"
	 * @generated
	 */
	int getIssuerCode();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerCode <em>Issuer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Code</em>' attribute.
	 * @see #isSetIssuerCode()
	 * @see #unsetIssuerCode()
	 * @see #getIssuerCode()
	 * @generated
	 */
	void setIssuerCode(int value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerCode <em>Issuer Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIssuerCode()
	 * @see #getIssuerCode()
	 * @see #setIssuerCode(int)
	 * @generated
	 */
	void unsetIssuerCode();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getIssuerCode <em>Issuer Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Issuer Code</em>' attribute is set.
	 * @see #unsetIssuerCode()
	 * @see #getIssuerCode()
	 * @see #setIssuerCode(int)
	 * @generated
	 */
	boolean isSetIssuerCode();

	/**
	 * Returns the value of the '<em><b>Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Type</em>' attribute.
	 * @see #setVersionType(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType_VersionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersionType();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getVersionType <em>Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Type</em>' attribute.
	 * @see #getVersionType()
	 * @generated
	 */
	void setVersionType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Barcode Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Barcode Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Barcode Version</em>' attribute.
	 * @see #isSetBarcodeVersion()
	 * @see #unsetBarcodeVersion()
	 * @see #setBarcodeVersion(int)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType_BarcodeVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='barcodeVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	int getBarcodeVersion();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getBarcodeVersion <em>Barcode Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Barcode Version</em>' attribute.
	 * @see #isSetBarcodeVersion()
	 * @see #unsetBarcodeVersion()
	 * @see #getBarcodeVersion()
	 * @generated
	 */
	void setBarcodeVersion(int value);

	/**
	 * Unsets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getBarcodeVersion <em>Barcode Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBarcodeVersion()
	 * @see #getBarcodeVersion()
	 * @see #setBarcodeVersion(int)
	 * @generated
	 */
	void unsetBarcodeVersion();

	/**
	 * Returns whether the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getBarcodeVersion <em>Barcode Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Barcode Version</em>' attribute is set.
	 * @see #unsetBarcodeVersion()
	 * @see #getBarcodeVersion()
	 * @see #setBarcodeVersion(int)
	 * @generated
	 */
	boolean isSetBarcodeVersion();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage#getBarcodeStructureType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link BarCodeKeyExchange.BarcodeStructureType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // BarcodeStructureType
