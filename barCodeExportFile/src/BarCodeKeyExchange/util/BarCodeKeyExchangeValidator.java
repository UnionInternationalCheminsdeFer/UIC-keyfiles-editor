/**
 */
package BarCodeKeyExchange.util;

import BarCodeKeyExchange.*;
import BarCodeKeyExchange.utils.SecurityUtils;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;


import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see BarCodeKeyExchange.BarCodeKeyExchangePackage
 * @generated
 */
public class BarCodeKeyExchangeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BarCodeKeyExchangeValidator INSTANCE = new BarCodeKeyExchangeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "BarCodeKeyExchange";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarCodeKeyExchangeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BarCodeKeyExchangePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BarCodeKeyExchangePackage.ALLOWED_PRODUCT_OWNER_CODES_TYPE:
				return validateAllowedProductOwnerCodesType((AllowedProductOwnerCodesType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE:
				return validateBarcodeStructureType((BarcodeStructureType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case BarCodeKeyExchangePackage.KEYS_TYPE:
				return validateKeysType((KeysType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.KEY_TYPE:
				return validateKeyType((KeyType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.PUBLIC_KEY_TYPE:
				return validatePublicKeyType((PublicKeyType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.TESTBARCODE_TYPE:
				return validateTestbarcodeType((TestbarcodeType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.IMAGETYPE_TYPE:
				return validateImagetypeType((ImagetypeType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.KEY_FORGED_TYPE:
				return validateKeyForgedType((KeyForgedType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.IMAGETYPE_TYPE_OBJECT:
				return validateImagetypeTypeObject((ImagetypeType)value, diagnostics, context);
			case BarCodeKeyExchangePackage.KEY_FORGED_TYPE_OBJECT:
				return validateKeyForgedTypeObject((KeyForgedType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllowedProductOwnerCodesType(AllowedProductOwnerCodesType allowedProductOwnerCodesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(allowedProductOwnerCodesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBarcodeStructureType(BarcodeStructureType barcodeStructureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(barcodeStructureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeysType(KeysType keysType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keysType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType(KeyType keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keyType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeyType_ValidKeyType(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeyType_ValidOidFormat(keyType, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeyType_RecommendedOId(keyType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidKeyType constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateKeyType_ValidKeyType(KeyType key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		

	
		boolean result = true;
		
		if (key.getPublicKey() == null){
			return true;
		}
		
		byte[] securityFeature = key.getPublicKey().getValue();
		
		boolean isCertificate = SecurityUtils.testForCertificate(securityFeature);
		//boolean isPublicKey = SecurityUtils.testForPublicKey(securityFeature);

		if (isCertificate){
			
			Date fromDate = SecurityUtils.getValidFromDateFromCertificate(securityFeature);
			Date untilDate = SecurityUtils.getValidFromDateFromCertificate(securityFeature);
			
			DateFormat dateFormatter;
			dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
			
			
			if (fromDate != null && key.getStartDate() != null){
				
				Date date1 = SecurityUtils.removeTime(key.getStartDate().toGregorianCalendar().getTime());				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(date1);
				
				Date date2 = SecurityUtils.removeTime(fromDate);
				Calendar cal2 = Calendar.getInstance();
				cal2.setTime(date2);

				
				if (!cal1.equals(cal2)){	
					if (diagnostics != null) {
						diagnostics.add
							(createDiagnostic
								(Diagnostic.WARNING,
								 DIAGNOSTIC_SOURCE,
								 0,
								 "_UI_GenericConstraint_diagnostic",
								 new Object[] { "Public Key invalid","The " + getName(key) + "the valid from dates of the key and the certificate are different" + dateFormatter.format(date1) + " " + dateFormatter.format(date2) },
								 new Object[] { key },
								 context));
					}						
				}
				
			}
			
			if (untilDate != null){
				
				Date date1 = SecurityUtils.removeTime(key.getStartDate().toGregorianCalendar().getTime());				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(date1);
				
				Date date2 = SecurityUtils.removeTime(untilDate);
				Calendar cal2 = Calendar.getInstance();
				cal2.setTime(date2);

				
				if (!cal1.equals(cal2)){	
					if (diagnostics != null) {
						diagnostics.add
							(createDiagnostic
								(Diagnostic.WARNING,
								 DIAGNOSTIC_SOURCE,
								 0,
								 "_UI_GenericConstraint_diagnostic",
								 new Object[] { "Public Key invalid","The " + getName(key) + "the valid until dates of the key and the certificate are different" + dateFormatter.format(date1) + " " + dateFormatter.format(date2) },
								 new Object[] { key },
								 context));
					}						
				}				
				
			}			
		}
		
		if (key.getSignatureAlgorithm()!= null && 
			key.getSignatureAlgorithm().length() !=0 &&
			!SecurityUtils.uicAlgorithms.contains(key.getSignatureAlgorithm()) )     {
			
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Signature Algorithm non standard in: ", 
								         getName(key) + " - algorithm " + key.getSignatureAlgorithm()},
						 new Object[] { key },
						 context));
			}			
			result = false;
		}
		
		
		if (key.getSignatureAlgorithm()!= null && 
			key.getSignatureAlgorithm().length() !=0 &&
			!SecurityUtils.uicAlgorithms.contains(key.getSignatureAlgorithm()) &&
			!key.getSignatureAlgorithm().startsWith("NonUIC")       
		     )     {
				
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "Invalid name of the signature algorithm in: ", 
									         getName(key) + " - algorithm " + key.getSignatureAlgorithm()},
							 new Object[] { key },
							 context));
				}			
				result = false;
			}		

		if (key.getSignatureAlgorithm() == null || 
			key.getSignatureAlgorithm().length() ==0){
				
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.WARNING,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "Signature Algorithm not indicated in: ", getName(key)},
							 new Object[] { key },
							 context));
				}			
				result = false;
			}		
		
		

		
		return result;
	}
	
	/**
	 * Validates the ValidOidFormat constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateKeyType_ValidOidFormat(KeyType key, DiagnosticChain diagnostics, Map<Object, Object> context) {
		
		if (key.getSignatureAlgorithmOid() == null) {
			//warning
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Signature Algorithm OID is missing: ", getName(key)},
						 new Object[] { key },
						 context));
			}
			return true;
		}

		
		Pattern pattern = Pattern.compile("^([0-2])((\\.0)|(\\.[1-9][0-9]*))*$");

		Matcher matcher = pattern.matcher(key.getSignatureAlgorithmOid());	
		
		if (!matcher.matches()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Signature Algorithm OID has wrong format: ", getName(key)},
						 new Object[] { key },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the RecommendedOId constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateKeyType_RecommendedOId(KeyType key, DiagnosticChain diagnostics, Map<Object, Object> context) {

        if (key.getSignatureAlgorithmOid() == null) return true;
        
		
        if (!SecurityUtils.uicAlgorithmOids.contains(key.getSignatureAlgorithmOid())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Signature Algorithm OID not amoung the recommended algorithms: ", getName(key)},
						 new Object[] { key },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DeprecBarcodeXds constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateKeyType_DeprecBarcodeXds(KeyType key, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (key.getBarcodeXsd() != null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.WARNING,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "barcode xsd is depecated: ", getName(key)},
						 new Object[] { key },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ValidKeyType constraint of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private String getName(KeyType key){
		StringBuffer sb = new StringBuffer();
		
		sb.append("Key of Issuer: ").append(key.getIssuerCode()).append(" ");
		
		return sb.toString();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePublicKeyType(PublicKeyType publicKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryDefaultConstraint(publicKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePublicKeyType_PublikKeyConstraint(publicKeyType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTestbarcodeType(TestbarcodeType testbarcodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(testbarcodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagetypeType(ImagetypeType imagetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyForgedType(KeyForgedType keyForgedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagetypeTypeObject(ImagetypeType imagetypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyForgedTypeObject(KeyForgedType keyForgedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Validates the PublikKeyConstraint constraint of '<em>Public Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePublicKeyType_PublikKeyConstraint(PublicKeyType publicKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		byte[] securityFeature = publicKey.getValue();
		
		KeyType key = (KeyType) publicKey.eContainer();
		
		boolean result = true;
		
		boolean isCertificate = SecurityUtils.testForCertificate(securityFeature);
		boolean isPublicKey = SecurityUtils.testForPublicKey(securityFeature);
		
		
		if (!isPublicKey && !isCertificate){
			
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Public Key invalid","The " + getName(key) + "does not contain a valid certificate nor a valid public key"},
						 new Object[] { key },
						 context));
			}			
			result = false;
		}
		
		
		if (publicKey != null && 
			(publicKey.getKeytype().equals("CERTIFICATE") ||
			 publicKey.getKeytype().length() == 0) && 
			isPublicKey){
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Public Key invalid","The " + getName(key) + "indicates to contain a certificate but contains a public key"},
						 new Object[] { key },
						 context));
			}			
			result = false;			
		}
		
		if (publicKey != null && publicKey.getKeytype().equals("PUBLIC KEY")) {
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.WARNING,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "Public Key should be provided as Certificate: ", getName(key)},
							 new Object[] { key },
							 context));
				}			
				result = false;			
		}	
		
		if ( (publicKey == null || 
			  publicKey.getKeytype().equals("PUBLIC KEY") )
			&& isCertificate){
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Public Key invalid","The " + getName(key) + "indicates to contain a public key but contains a certificate"},
						 new Object[] { key },
						 context));
			}			
			result = false;			
		}		
		
		if (   publicKey != null && 
			   publicKey.getKeytype().length() != 0 &&
			   !publicKey.getKeytype().equals("PUBLIC KEY") && 
			   !publicKey.getKeytype().equals("CERTIFICATE")	)  {
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "Public Key invalid","The " + getName(key) + "indicates a wrong type of securits feature: " + key.getPublicKey().getKeytype() },
							 new Object[] { key },
							 context));
				}			
				result = false;			
		}		
			
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BarCodeKeyExchangeValidator
