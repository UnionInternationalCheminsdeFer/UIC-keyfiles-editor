package BarCodeKeyExchange.application;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditor;



public class EditingUtils {
	
	public static EditingDomain getActiveDomain() {
	   	IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		return ((BarCodeKeyExchangeEditor) editor).getEditingDomain();
	}

}
