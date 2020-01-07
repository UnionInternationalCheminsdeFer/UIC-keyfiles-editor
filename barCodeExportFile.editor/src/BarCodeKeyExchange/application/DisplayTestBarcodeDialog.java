package BarCodeKeyExchange.application;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
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


import BarCodeKeyExchange.TestbarcodeType;


public class DisplayTestBarcodeDialog extends Dialog {

	
    private FormToolkit toolkit = null;
    private TestbarcodeType testBarcode = null;
    private String title;
	
	public DisplayTestBarcodeDialog(TestbarcodeType testBarcode, String title) {
		super(Display.getDefault().getActiveShell());
		toolkit = new FormToolkit(Display.getDefault());
		this.testBarcode = testBarcode;
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
        contentComposite.setText(LocalLanguageSupport._Action_DisplayTestBarCodeHeader);
        contentComposite.setLayout(new GridLayout(2, false));
        contentComposite.setLayoutData(new GridData(SWT.FILL, SWT.DEFAULT, true, false, 3, 1));    

		displayImage(contentComposite);
		
		return container;
	}	

	private void displayImage(Composite composite) {
		
        final Label barcodeLabel = toolkit.createLabel(composite, LocalLanguageSupport._Action_DisplayTestBarCodeHeader);		
        GridData barCodeLayoutData = new GridData(SWT.CENTER, SWT.CENTER, true,false,3,1);
        barCodeLayoutData.widthHint = 600;
        barcodeLabel.setLayoutData(barCodeLayoutData);

        InputStream input = new ByteArrayInputStream(testBarcode.getImagedata());
        
        
        Display display = Display.getDefault();
        Shell shell = new Shell (display, SWT.SHELL_TRIM | SWT.DOUBLE_BUFFERED);
        shell.setLayout(new FillLayout ());
    	final Image image = new Image(display, input);

        barcodeLabel.setText("");
        barcodeLabel.setImage(image);
		
		
	}
	
   




}
