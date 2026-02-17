
package BarCodeKeyExchange.application;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import BarCodeKeyExchange.presentation.BarCodeKeyExchangeModelWizard;
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
