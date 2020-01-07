package BarCodeKeyExchange.application;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
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
import java.text.DateFormat;
import java.util.Date;

import javax.security.auth.x500.X500Principal;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;


import barcode.barCodeData.SecurityUtils;


public class DisplayBinaryContentDialog extends Dialog {

	
    private FormToolkit toolkit = null;
    private byte[] binaryContent;
    private boolean isCertificate = false;
    private boolean isPublicKey = false;
    private String title;
	
	public DisplayBinaryContentDialog(byte[] binaryContent, String title) {
		super(Display.getDefault().getActiveShell());
		toolkit = new FormToolkit(Display.getDefault());
		this.binaryContent = binaryContent;
		checkBinaryContent();		
		this.title = title;
	}
	
	 protected void configureShell(Shell newShell) {
		    super.configureShell(newShell);
		    newShell.setText(title);
	}
	
	
	protected Control createDialogArea(Composite parent)
	{
		Composite container = (Composite) super.createDialogArea(parent);

		GridLayout gridLayout = (GridLayout) container.getLayout();
		gridLayout.numColumns = 3;
		
        GridData contentsGridData = (GridData)container.getLayoutData();
        contentsGridData.horizontalAlignment = SWT.FILL;
        contentsGridData.verticalAlignment = SWT.FILL;
		
        Group contentComposite = new Group(container, SWT.NONE);
        contentComposite.setText(LocalLanguageSupport._Dialog_DisplayPublicKey);
        contentComposite.setLayout(new GridLayout(2, false));
        contentComposite.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false, 3, 1));        

		if (!checkBinaryContent()) {
			Label l1 = toolkit.createLabel(contentComposite,LocalLanguageSupport._Generic_ContentError);
			l1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));	
			return container;
		}
		
		if (isCertificate){
			displayCertificate(contentComposite);
		} else if (isPublicKey) {
			displayPublicKey(contentComposite);
		} 
		

		return container;
	}

	private void displayPublicKey(Composite container) {
		//content type
		Label l1 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyContent);
		l1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l2 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKey);
		l2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));

		
		KeyFactory keyFactory;
		try {
			keyFactory = KeyFactory.getInstance("DSA");
		} catch (NoSuchAlgorithmException e) {
			return;
		}		
    	
		X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(binaryContent);		
				
		DSAPublicKey pubKey;
		try {
			pubKey = (DSAPublicKey) keyFactory.generatePublic(pubKeySpec);
			
			String keyalgorithm = pubKey.getAlgorithm();		
			Label l9 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyAlg);
			l9.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l10 = toolkit.createLabel(container, keyalgorithm);
			l10.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));		
			
			String format = pubKey.getFormat();
			Label l17 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyFormat);
			l17.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l18 = toolkit.createLabel(container, format);
			l18.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));					

	    	DSAParams params = pubKey.getParams();
	    	
	    	BigInteger paramG = params.getG();
			Label l31 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyParaG);
			l31.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l32 = toolkit.createLabel(container, paramG.toString());
			l32.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				    	
	    	
	    	
	    	BigInteger paramP = params.getP();
			Label l33 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyParaP);
			l33.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l34 = toolkit.createLabel(container, paramP.toString());
			l34.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));		
			
	    	BigInteger paramQ = params.getQ();
			Label l35 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyParaQ);
			l35.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l36 = toolkit.createLabel(container, paramQ.toString());
			l36.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));			    	

		} catch (InvalidKeySpecException e1) {
			return;
		}				
		
		
		
		
	}

	private void displayCertificate(Composite container) {
		Label l1 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateContent);
		l1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l2 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificate);
		l2.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		
		ByteArrayInputStream is = new ByteArrayInputStream(binaryContent);
		
		
		CertificateFactory fact;
		try {
			fact = CertificateFactory.getInstance("X.509");
		} catch (CertificateException e) {
			// check was done before			
			return;
		}
		X509Certificate cer;
		try {
			cer = (X509Certificate) fact.generateCertificate(is);
		} catch (CertificateException e) {
			// check was done before	
			return;
		}
		
		String certificateType = cer.getType();
		Label l21 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificatetype);
		l21.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l22 = toolkit.createLabel(container, certificateType);
		l22.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));			
		
		String algorithm = cer.getSigAlgName();		
		Label l3 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateAlgotrithm);
		l3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l4 = toolkit.createLabel(container, algorithm);
		l4.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));		
		
		String algorithmId = cer.getSigAlgOID();
		Label l15 = toolkit.createLabel(container,LocalLanguageSupport._Dialog_DisplayCertificateAlgotrithmId);
		l15.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l16 = toolkit.createLabel(container, algorithmId);
		l16.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));	
		
		byte[] certSignature = cer.getSignature();
		if (certSignature == null || certSignature.length == 0){
			Label l25 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateSigned);
			l25.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l26 = toolkit.createLabel(container, "");
			l26.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
		}		

		int version = cer.getVersion();
		Label l23 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateVersion);
		l23.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l24 = toolkit.createLabel(container, Integer.toString(version));
		l24.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));					
		
		DateFormat df = DateFormat.getDateInstance();		
		Date lastDate = cer.getNotAfter();
		Date firstDate = cer.getNotBefore();		
		Label l5 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateValidFrom);
		l5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l6 = toolkit.createLabel(container, df.format(firstDate));
		l6.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
		
		Label l7 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateValidUntil);
		l7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l8 = toolkit.createLabel(container, df.format(lastDate));
		l8.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
					
		
		X500Principal issuer = cer.getIssuerX500Principal();
		String issuerName = issuer.getName();
		Label l11 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateIssuer);
		l11.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l12 = toolkit.createLabel(container, issuerName);
		l12.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
		
		BigInteger serialNumber = cer.getSerialNumber();
		Label l13 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateSerialNumber);
		l13.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l14 = toolkit.createLabel(container, serialNumber.toString());
		l14.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
		
		boolean[] bits = cer.getKeyUsage();
		
		if (bits == null || bits.length == 0) {
			Label l42 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateKeyUsageBits);
			l42.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l43 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateNotProvided);
			l43.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));					
		} else {	
			Label l41 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateKeyUsage);
			l41.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));		
			if (bits[0]){
				Label l42 = toolkit.createLabel(container, LocalLanguageSupport._Generic_True);
				l42.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
			} else {
				Label l42 = toolkit.createLabel(container, LocalLanguageSupport._Generic_False);
				l42.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
			}
		}

		
		X500Principal subject = cer.getSubjectX500Principal();
		String subjectName = subject.getName();
		Label l25 = toolkit.createLabel(container,LocalLanguageSupport._Dialog_DisplayCertificateSubject);
		l25.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l26 = toolkit.createLabel(container, subjectName);
		l26.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));			
				
		
		PublicKey key = cer.getPublicKey();
		
		if (key == null){
			Label l35 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateNoKey);
			l35.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l36 = toolkit.createLabel(container, "");
			l36.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));	
			return;
		}
		
		
		String keyalgorithm = key.getAlgorithm();		
		Label l9 = toolkit.createLabel(container,LocalLanguageSupport._Dialog_DisplayPublicKeyAlg);
		l9.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l10 = toolkit.createLabel(container, keyalgorithm);
		l10.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));		
		
		String format = key.getFormat();
		Label l17 = toolkit.createLabel(container,LocalLanguageSupport._Dialog_DisplayPublicKeyFormat);
		l17.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		Label l18 = toolkit.createLabel(container, format);
		l18.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				

		if ( key instanceof DSAPublicKey) {
			
			DSAPublicKey pubKey = (DSAPublicKey) key;
			
	    	DSAParams params = pubKey.getParams();
	    	
	    	BigInteger paramG = params.getG();
			Label l31 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyParaG);
			l31.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l32 = toolkit.createLabel(container, paramG.toString());
			l32.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				    	
	    	
	    	
	    	BigInteger paramP = params.getP();
			Label l33 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyParaP);
			l33.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l34 = toolkit.createLabel(container, paramP.toString());
			l34.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));		
			
	    	BigInteger paramQ = params.getQ();
			Label l35 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayPublicKeyParaQ);
			l35.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l36 = toolkit.createLabel(container, paramQ.toString());
			l36.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));			    	
			
			
		} else {
			
			Label l35 = toolkit.createLabel(container, LocalLanguageSupport._Dialog_DisplayCertificateNoDSAKey);
			l35.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			Label l36 = toolkit.createLabel(container, key.getClass().getCanonicalName());
			l36.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));				
			
			
		}

		
	}

	private boolean checkBinaryContent() {
		
		isCertificate = SecurityUtils.testForCertificate(binaryContent);
		isPublicKey = SecurityUtils.testForPublicKey(binaryContent);
				
		if (!isCertificate && !isPublicKey) {
			return false;			
		}
		return true;
	}



}
