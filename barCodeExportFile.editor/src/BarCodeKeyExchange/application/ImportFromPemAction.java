package BarCodeKeyExchange.application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;


import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import BarCodeKeyExchange.BarCodeKeyExchangeFactory;
import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.PublicKeyType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;




public class ImportFromPemAction extends BaseSelectionListenerAction {
	


	public ImportFromPemAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_ImportPublicKeyFromPemFile);	
		this.setToolTipText(this.getText());			
	}


    public boolean updateSelection (IStructuredSelection selection)
    {
  		this.setEnabled(false);

  		if (checkSelection(selection)) 	{
  			this.setEnabled(true);
  			return true;
  		}
  		return false;
    }

	public void run() {
		run( this.getStructuredSelection() );
		return;
	}

	private boolean checkSelection(IStructuredSelection selection)
	{
		if (selection == null) return false;
    	if (selection.size() == 0)   return false;
    	if (selection.size() > 1)   return false;    	
    	if (!(selection.getFirstElement() instanceof KeyType || 
        	  selection.getFirstElement() instanceof PublicKeyType)) return false;
		return true;
	}
	

	public void runExternal (IStructuredSelection selection)
	{
		if (!checkSelection(selection)) return;
		run (selection);
	}

	public void run (IStructuredSelection selection)
	{
		if (!checkSelection(selection)) return;
		
		KeyType key = null;
    	if (selection.getFirstElement() instanceof KeyType){
    		key = (KeyType) selection.getFirstElement();  		
    	} else {
    		return;
    	}    	

		
		
		try {
			Shell shell = Display.getDefault().getActiveShell();
            FileDialog fd = new FileDialog(shell, SWT.READ_ONLY);
            fd.setText(this.getText());
            String[] filterExt = {"*.pem" };
            fd.setFilterExtensions(filterExt);
            String path = fd.open();
            
            if (path== null || path.length() < 1) {
           	 return;
            }
			
            try {
				loadPEMKey(key, path);
			} catch (CertificateException e) {
				MessageDialog.openError(
						Display.getDefault().getActiveShell(),
						LocalLanguageSupport._Generic_Error,
						LocalLanguageSupport._Error_CouldNotReadFileContent + '\n' + e.getMessage());										
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
			}
            

		} catch (FileNotFoundException e) {
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_CouldNotReadFile + '\n' + e.getMessage());										
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}
	}

	public void loadPEMKey(KeyType key, String fileName) throws CertificateException, FileNotFoundException {
		

			try {
				loadCertificatePEMKey(key, fileName);			
			} catch (Exception e) {
				// try loading certificate
				try {
					loadPublicKeyPemFile(key, fileName);
				} catch (IOException e1) {
					MessageDialog.openError(
							Display.getDefault().getActiveShell(),
							LocalLanguageSupport._Generic_Error,
							LocalLanguageSupport._Error_CouldNotReadFileContent + '\n' + e.getMessage());										
					BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
				}
				MessageDialog.openError(
						Display.getDefault().getActiveShell(),
						LocalLanguageSupport._Generic_Error,
						LocalLanguageSupport._Error_CouldNotReadFileContent + '\n' + e.getMessage());										
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
			}
	}


	public void loadCertificatePEMKey(KeyType key2, String fileName) throws CertificateException, FileNotFoundException {

		FileInputStream inputStream;
		try {
				inputStream = new FileInputStream(fileName);

				try {
					CertificateFactory fact = CertificateFactory.getInstance("X.509");
					X509Certificate cer = (X509Certificate) fact.generateCertificate(inputStream);
					PublicKey key = cer.getPublicKey();
				
					updatePublicKey(key2, key.getEncoded(), "PUBLIC KEY");					

				} catch (CertificateException e1) {
					throw e1;
				}
			} catch (FileNotFoundException e) {
				throw e;
			}
	}
	
	public void loadPublicKeyPemFile(KeyType key2, String fileName) throws IOException{
		
		FileInputStream in = new FileInputStream(fileName);
		byte[] fileContent = new byte[in.available()];
		in.read(fileContent);
		in.close();
		


		String base64EncodedKey = new String(fileContent, "UTF-8");
		
		if (!base64EncodedKey.contains("BEGIN PUBLIC KEY")){
			return;
		}
		
		base64EncodedKey = base64EncodedKey.replaceAll("(-+BEGIN PUBLIC KEY-+\\r?\\n|-+END PUBLIC KEY-+\\r?\\n?)", "");
		base64EncodedKey = base64EncodedKey.replaceAll("(\\n)", "");
		base64EncodedKey = base64EncodedKey.replaceAll("(\\r)", "");
		
		byte[] key = Base64Coder.decode(base64EncodedKey);
		
		updatePublicKey(key2, key, "PUBLIC KEY");

		
	}
	
	private void updatePublicKey(KeyType key, byte[] value, String type) {
		EditingDomain domain = EditingUtils.getActiveDomain();
		
		CompoundCommand com = new CompoundCommand();
		
		PublicKeyType publicKey = BarCodeKeyExchangeFactory.eINSTANCE.createPublicKeyType();
		publicKey.setKeytype(type);
		publicKey.setValue(value);
		
		
		Command com1 = SetCommand.create(domain, key, BarCodeKeyExchange.BarCodeKeyExchangePackage.Literals.KEY_TYPE__PUBLIC_KEY, publicKey);
		if (com1.canExecute()) {
			com.append(com1);
		}			

		if (com.canExecute()) {
			domain.getCommandStack().execute(com);
		}		
	}
	


}
