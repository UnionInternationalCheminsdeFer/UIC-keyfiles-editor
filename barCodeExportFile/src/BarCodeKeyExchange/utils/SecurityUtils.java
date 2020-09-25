package BarCodeKeyExchange.utils;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.bouncycastle.asn1.x509.TBSCertificate;





public class SecurityUtils {
	
	public static Set<String> uicAlgorithms = Stream.of(
			   "SHA224withDSA(2048,224)",
	           "SHA256withDSA(2048,256)",
	           "SHA1withDSA(1024,160)",
	           "SHA1withDSA(512,160)",
	           "SHA224-DSA2048-NoASN1",
	           "SHA256-DSA2048-NoASN1",
	           "SHA224-DSA2048-ASN1",
	           "SHA160-DSA1024-ASN1",
	           "SHA160-DSA512-ASN1",
	           "SHA256withECDSA-P256").collect(Collectors.toSet());

	public static Set<String> uicAlgorithmOids = Stream.of(
			  "2.16.840.1.101.3.4.3.1",
			  "2.16.840.1.101.3.4.3.2",
			  "1.2.840.10040.4.3",
			  "1.2.840.10045.4.3.2").collect(Collectors.toSet());
	
	
	
	
	public static boolean testForCertificate(byte[] securityFeature){
		
		if (securityFeature == null || securityFeature.length == 0){
			return false;
		}
		
		ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);		

			CertificateFactory fact;
			try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
				PublicKey key = cer.getPublicKey();		
				if (key == null){
					return false;
				}
			} catch (CertificateException e) {
				return false;
			}
		
		return true;
	}

	public static boolean testForCertificateValidFormDate(byte[] securityFeature, Date date){		
		
		ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);
		

			CertificateFactory fact;
			try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
				
				Date date1 = removeTime(date);				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(date1);
				
				Date date2 = removeTime(cer.getNotBefore());
				Calendar cal2 = Calendar.getInstance();
				cal2.setTime(date2);
				
				if (cal1.equals(cal2)){
					return true;
				} else {
					return false;
				}
	
				
			} catch (CertificateException e) {
				return false;
			}
			
	}	
	

	public static boolean testForCertificateValidToDate(byte[] securityFeature, Date date){		
		
		ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);
		

			CertificateFactory fact;
			try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
				
				Date date1 = removeTime(date);				
				Calendar cal1 = Calendar.getInstance();
				cal1.setTime(date1);
				
				Date date2 = removeTime(cer.getNotAfter());
				Calendar cal2 = Calendar.getInstance();
				cal2.setTime(date2);
				
				if (cal1.equals(cal2)){
					return true;
				} else {
					return false;
				}
	
				
			} catch (CertificateException e) {
				return false;
			}
			
	}		
	
	public static Date getValidFromDateFromCertificate(byte[] securityFeature){		
		
		ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);
		

			CertificateFactory fact;
			try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);								
			
				Date date2 = removeTime(cer.getNotBefore());				
				return date2;
				
			} catch (CertificateException e) {
				return null;
			}
			
	}		
	
	public static Date getValidUntilDateFromCertificate(byte[] securityFeature){		
		
		ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);
		

			CertificateFactory fact;
			try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
								
			
				Date date2 = removeTime(cer.getNotAfter());				
				return date2;
				
			} catch (CertificateException e) {
				return null;
			}
			
	}		
	
	public static boolean testForPublicKey(byte[] securityFeature){
		
		if (securityFeature == null || securityFeature.length == 0) {
			return false;
		}
		
	    KeyFactory keyFactory;
		try {
			keyFactory = KeyFactory.getInstance("DSA");
		} catch (NoSuchAlgorithmException e) {
			return false;
		}
    	
		X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(securityFeature);
				
		DSAPublicKey pubKey;
		try {
			pubKey = (DSAPublicKey) keyFactory.generatePublic(pubKeySpec);

	    	DSAParams params = pubKey.getParams();
	    	if (params == null){
	    		return false;
	    	}

		} catch (InvalidKeySpecException e1) {
			return false;
		}

		
		return true;
	}	


	public static String getAlgorithm(byte[] securityFeature) {
	
		if (SecurityUtils.testForCertificate(securityFeature)){
			
			ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);				
			
			CertificateFactory fact;
			try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
				return cer.getPublicKey().getAlgorithm();
				
			} catch (CertificateException e) {
				return null;
			}			
			
		} 
		
		if (SecurityUtils.testForPublicKey(securityFeature)) {
			
		    KeyFactory keyFactory;
			try {
				keyFactory = KeyFactory.getInstance("DSA");
			} catch (NoSuchAlgorithmException e) {
				return "";
			}
	    	
			X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(securityFeature);
					
			DSAPublicKey pubKey;
			try {
				pubKey = (DSAPublicKey) keyFactory.generatePublic(pubKeySpec);

		    	DSAParams params = pubKey.getParams();
		    	if (params == null){
		    		return "";
		    	}

			} catch (InvalidKeySpecException e1) {
				return "";
			}
			
	    	return pubKey.getAlgorithm();		    		
		
		}
		

		return "";
	}
	
	
	public static PublicKey extractPublicKey (InputStream inputStream) throws CertificateException {

		CertificateFactory fact = CertificateFactory.getInstance("X.509");
		X509Certificate cer = (X509Certificate) fact.generateCertificate(inputStream);
		
		PublicKey key = cer.getPublicKey();
		
		return key;
	}
	
	
	public static PublicKey extractValidFromDate (InputStream inputStream) throws CertificateException {

		CertificateFactory fact = CertificateFactory.getInstance("X.509");
		X509Certificate cer = (X509Certificate) fact.generateCertificate(inputStream);
		
		byte[] sc = cer.getTBSCertificate();
		ByteArrayInputStream is = new ByteArrayInputStream(sc);
		fact.generateCertificate(is);				
		
		TBSCertificate.getInstance(cer.getTBSCertificate());
		
		PublicKey key = cer.getPublicKey();
		
		return key;
	}
	
	public static String convertToPem(byte[] securityFeature){
		
		 boolean isCertificate = testForCertificate(securityFeature);
		 boolean isPublicKey = testForPublicKey(securityFeature);
		 
		 if (!isCertificate && !isPublicKey) {
			 return null;
		 }
		 
		 
		 Encoder encoder = Base64.getEncoder();
		 byte[] base64 = encoder.encode(securityFeature);
		 String sBase64 = String.valueOf(base64);
		 StringBuilder sb = new StringBuilder();
		 if ( isCertificate ) {
			 sb.append("-----BEGIN CERTIFICATE-----\n");
		 } else {
			 sb.append("-----BEGIN PUBLIC KEY-----\n");
		 }
		 for (int i = 0; i < sBase64.length(); i = i + 76){
			 if (i + 76 <= sBase64.length()) {
				 String line = sBase64.substring(i, i + 76);
				 sb.append(line).append('\n');		
			 } else {
				 String line = sBase64.substring(i);
				 sb.append(line).append('\n');					 
			 }
		 }
		 if (isCertificate) {
			 sb.append("-----END CERTIFICATE-----\n");
		 } else {
			 sb.append("-----END PUBLIC KEY-----\n");
		 }		 
		 return sb.toString();
	}	
	

	public static Date removeTime(Date date){
		
		if (date == null) return null;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	


}
