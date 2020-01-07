package BarCodeKeyExchange.application;

import org.eclipse.osgi.util.NLS;

public class LocalLanguageSupport extends NLS {
	
	/**
	 * The base name of a fully qualified message properties file (i.e. the
	 * properties file name will be "plugin.properties" and
	 * "plugin_de.properties" e.g. for the german version if the base name is
	 * "plugin").
	 */
	private static final String BASE_NAME = "plugin"; //$NON-NLS-1$
	public static String xxx;
	
	public static String _Action_AddTestBarCode;
	public static String _Action_SelectTestBarcodeFile;
	public static String _Action_DisplayPublicKeyContent;
	public static String _Action_DisplayTestBarcode;
	public static String _Action_DisplayTestBarCodeHeader;
	public static String _Action_ExportPublicKeyAsPemFile;
	public static String _Action_ExportCertificateKeyAsPemFile;	
	public static String _Action_ExportToPem;
	public static String _Action_ImportCertificateFromPemFile;
	public static String _Action_ImportPublicKeyFromPemFile;
	public static String _Action_DownloadKeysFileName;
	public static String _Action_DownloadPKMWmissing;
	public static String _Action_SaveTestBarcode;
	public static String _Action_SaveTestBarcodeFileName;
	public static String _Action_DownloadKeys;
	
	public static String _Dialog_DisplayPublicKey;
	public static String _Dialog_DisplayPublicKeyContent;
	public static String _Dialog_DisplayPublicKeyKey;
	public static String _Dialog_DisplayPublicKeyAlg;
	public static String _Dialog_DisplayPublicKeyFormat;
    public static String _Dialog_DisplayPublicKeyParaG;
	public static String _Dialog_DisplayPublicKeyParaP;
	public static String _Dialog_DisplayPublicKeyParaQ;
	public static String _Dialog_DisplayTestBarCode;
	public static String _Dialog_DisplayCertificateContent;	
	public static String _Dialog_DisplayCertificate;	
	public static String _Dialog_DisplayCertificateAlgotrithm;
	public static String _Dialog_DisplayCertificatetype;
	public static String _Dialog_DisplayCertificateVersion;
	public static String _Dialog_DisplayCertificateAlgotrithmId;
	public static String _Dialog_DisplayCertificateSigned;
	public static String _Dialog_DisplayCertificateValidFrom;
	public static String _Dialog_DisplayCertificateValidUntil;
	public static String _Dialog_DisplayCertificateIssuer;
	public static String _Dialog_DisplayCertificateSerialNumber; 
	public static String _Dialog_DisplayCertificateKeyUsageBits;
	public static String _Dialog_DisplayCertificateKeyUsage;	
	public static String _Dialog_DisplayCertificateNotProvided;
	public static String _Dialog_DisplayCertificateSubject;
	public static String _Dialog_DisplayCertificateNoKey;
	public static String _Dialog_DisplayCertificateNoDSAKey;

	public static String _Page_PreferencePKMW;

	public static String _Generic_Error;
	public static String _Generic_FileCreate; 
	public static String _Generic_ContentError;
	public static String _Generic_True;
	public static String _Generic_False;
	public static String _Generic_LocalFileSelect;
	public static String _Error_CouldNotReadFile;
	public static String _Error_CouldNotReadFileContent;
	
	public static String _Error_CouldNotLoadImageFile;
	public static String _Error_CouldNotReadImageFile;
	public static String _Error_CouldNotAccessImageFile;
	public static String _Error_CouldNotExtractImage; 
	public static String _Error_CouldNotSaveImage;
	 
	public static String _Error_ConnectionNotEstablished;
	public static String _Error_HttpReplyCode; 
	public static String _Error_DownloadError;  
	public static String _Error_CouldNotWriteKeysFile;
	public static String _Error_KeysFileNotReadable; 
	public static String _Error_DownloadFailed; 
	public static String _Error_KeyFileCreation;
	public static String _Action_ExportAllToPem; 
	
	


	/**
	 * Upon first use of a string from this class, this will be executed when
	 * loading the class.
	 */
	static
	{
		// initialize internationalized messages.
		NLS.initializeMessages(BASE_NAME, LocalLanguageSupport.class);
	}


}
