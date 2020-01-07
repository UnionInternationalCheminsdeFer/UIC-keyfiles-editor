/**
 * Copyright (c) 2010 DB Systel GmbH
 */

package BarCodeKeyExchange.application;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import BarCodeKeyExchange.presentation.BarCodeKeyExchangeModelWizard;




/**
 *
 * Empty command handler.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 *
 * @version 1.0
 * @author Clemens Gantert
 *
 *  *
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
 * @param <E>
 *
 */
public class NewModelHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public NewModelHandler() {
	}

	/**
	 * the command has been executed, so extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

			BarCodeKeyExchangeModelWizard wizard = new BarCodeKeyExchangeModelWizard();
			wizard.init(PlatformUI.getWorkbench(), StructuredSelection.EMPTY);
			WizardDialog wizardDialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
			wizardDialog.setPageSize(300, 100);
			wizardDialog.open();
			
			return null;

	}

}
