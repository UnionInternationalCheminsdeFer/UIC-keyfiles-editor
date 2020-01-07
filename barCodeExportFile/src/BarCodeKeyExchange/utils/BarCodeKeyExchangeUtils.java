package BarCodeKeyExchange.utils;

import java.io.File;
import java.io.IOException;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import barcode.sealing.UicPublicKey;

import BarCodeKeyExchange.BarCodeKeyExchangeFactory;
import BarCodeKeyExchange.DocumentRoot;
import BarCodeKeyExchange.KeyForgedType;
import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.KeysType;
import BarCodeKeyExchange.PublicKeyType;



public class BarCodeKeyExchangeUtils {
	
	public static void exportToFile(String filename, UicPublicKey uicKey){

		DocumentRoot doc = BarCodeKeyExchangeFactory.eINSTANCE.createDocumentRoot();
		KeysType keys = BarCodeKeyExchangeFactory.eINSTANCE.createKeysType();

		KeyType key = BarCodeKeyExchangeFactory.eINSTANCE.createKeyType();
		key.setBarcodeVersion(3);
		key.setCommentForEncryptionType("UIC Test Implementation");


		 GregorianCalendar calFrom = new GregorianCalendar();
		 calFrom.setTime(uicKey.getValidFrom());
		 try {
			key.setStartDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calFrom));
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 GregorianCalendar calUntil = new GregorianCalendar();
		 calUntil.setTime(uicKey.getValidUntil());
		 try {
			key.setEndDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calUntil));
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		key.setSignatureAlgorithm("SHA224-DSA2048-NoASN1");

		key.setId(uicKey.getVersion());
		key.setIssuerCode(uicKey.getIssuerCode());
		key.setIssuerName("Test");
		PublicKeyType keyType =  BarCodeKeyExchangeFactory.eINSTANCE.createPublicKeyType();
		keyType.setValue(uicKey.getEncoded());
		keyType.setKeytype("PUBLIC KEY");
		key.setPublicKey(keyType);
		key.setKeyForged(KeyForgedType.FALSE);
		key.setVersionType("UIC 918-2");
		keys.getKey().add(key);

		doc.setKeys(keys);

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());

        File file = new File(filename);
        String path = file.getAbsolutePath();
        if (path == null|| path.length() == 0){
        	return;
        }
        URI fileUri = URI.createFileURI(path);
        Resource res = resourceSet.createResource(fileUri);
        res.getContents().add(doc);
        try {
			Map<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XMLResource.NO_NAMESPACE_SCHEMA_LOCATION, Boolean.TRUE);
			options.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			options.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);
			options.put(XMIResource.OPTION_SAVE_DOCTYPE, Boolean.FALSE);
        	res.save(options);
        } catch (IOException e) {
        	e.printStackTrace();

        }



	}

}
