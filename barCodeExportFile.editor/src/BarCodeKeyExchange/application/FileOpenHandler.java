/**
 * Copyright (c) 2010 DB Systel GmbH
 */
package BarCodeKeyExchange.application;

import java.io.File;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorAdvisor;



/**
 * Type FileOpenHandler
 *
 * Open file handler
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 *
 * @version 1.0
 * @author ChristophCDobosz
 *
 * <b>History:</b>
 * <pre><!-- Do not use tabs in the history table! Do not extend table width!
 *           rel.inc defines release and increment no -->
 *
 * date        name            rel.inc      changes
 * ----------------------------------------------------------------------------------
 * 15.09.2010  ChristophCDobosz    1.0      created
 * ----------------------------------------------------------------------------------
 * </pre>
 * <small> <P>Copyright (c) 2010 DB Systel GmbH</P> </small>
 *
 */
public class FileOpenHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public FileOpenHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		String[] filePaths = BarCodeKeyExchangeEditorAdvisor.openFilePathDialog(window.getShell(), SWT.OPEN, null);
		if (filePaths.length > 0) {

	        URI fileUri = URI.createFileURI(new File(filePaths[0]).getAbsolutePath());
	        
			BarCodeKeyExchangeEditorAdvisor.openEditor(window.getWorkbench(), fileUri);

		} // if

		return null;
	}
}
