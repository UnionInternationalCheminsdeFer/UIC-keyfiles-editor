/**
 */
package BarCodeKeyExchange.presentation;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;

import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import BarCodeKeyExchange.application.AddTestBarcodeAction;
import BarCodeKeyExchange.application.DisplayBinaryContentAction;
import BarCodeKeyExchange.application.DisplayTestBarcodeAction;
import BarCodeKeyExchange.application.ExportAllKeysToPemAction;
import BarCodeKeyExchange.application.ExportCertificateToPemAction;
import BarCodeKeyExchange.application.ExportPublicKeyToPemAction;
import BarCodeKeyExchange.application.ExportToPemAction;
import BarCodeKeyExchange.application.ImportCertificateFromPemAction;
import BarCodeKeyExchange.application.ImportFromPemAction;
import BarCodeKeyExchange.application.SaveTestBarcodeAction;

/**
 * This is the action bar contributor for the BarCodeKeyExchange model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BarCodeKeyExchangeActionBarContributor
	extends EditingDomainActionBarContributor
	implements ISelectionChangedListener {
	/**
	 * Action to create objects from the BarCodeKeyExchange model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class NewAction extends WorkbenchWindowActionDelegate {
		
				
		/**
		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void run(IAction action) {
			BarCodeKeyExchangeModelWizard wizard = new BarCodeKeyExchangeModelWizard();
			wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.open();
		}
	}
	
	/**
	 * Action to create objects from the BarCodeKeyExchange model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static class LoadAction extends WorkbenchWindowActionDelegate {
		
				
		/**
		 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public void run(IAction action) {
			BarCodeKeyExchangeLoadUicWizard wizard = new BarCodeKeyExchangeLoadUicWizard();
			wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.open();
		}
	}	

	/**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction showPropertiesViewAction =
		new Action(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet");
				}
				catch (PartInitException exception) {
					BarCodeKeyExchangeEditorPlugin.INSTANCE.log(exception);
				}
			}
		};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction refreshViewerAction =
		new Action(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
			@Override
			public boolean isEnabled() {
				return activeEditorPart instanceof IViewerProvider;
			}

			@Override
			public void run() {
				if (activeEditorPart instanceof IViewerProvider) {
					Viewer viewer = ((IViewerProvider)activeEditorPart).getViewer();
					if (viewer != null) {
						viewer.refresh();
					}
				}
			}
		};

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createChildActions;

	/**
	 * This will contain a map of {@link org.eclipse.emf.edit.ui.action.CreateChildAction}s, keyed by sub-menu text.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map<String, Collection<IAction>> createChildSubmenuActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createSiblingActions;

	/**
	 * This will contain a map of {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction}s, keyed by submenu text.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map<String, Collection<IAction>> createSiblingSubmenuActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createSiblingMenuManager;

	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ExportToPemAction exportToPemAction = new ExportToPemAction("export as pem file...");	

	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ExportAllKeysToPemAction exportAllToPemAction = new ExportAllKeysToPemAction("export all keys as pem files...");		
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ExportCertificateToPemAction exportCertificateToPemAction = new ExportCertificateToPemAction("export certificat as pem file...");	
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ExportPublicKeyToPemAction exportPublicKeyToPemAction = new ExportPublicKeyToPemAction("export public key as pem file...");		
	

	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ImportFromPemAction importFromPemAction = new ImportFromPemAction("import from pem file...");		

	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ImportCertificateFromPemAction importCertificateFromPemAction = new ImportCertificateFromPemAction("import public key from pem file...");		
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DisplayBinaryContentAction displayBinaryContentAction = new DisplayBinaryContentAction("display public key content...certificate ");			

	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AddTestBarcodeAction addTestBarcodeAction = new AddTestBarcodeAction("add test bar code... ");		
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DisplayTestBarcodeAction displayTestBarcodeAction = new DisplayTestBarcodeAction("display test bar code... ");		

	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SaveTestBarcodeAction saveTestBarcodeAction = new SaveTestBarcodeAction("save test bar code... ");
	
	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarCodeKeyExchangeActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new LoadResourceAction();
		validateAction = new ValidateAction();
		controlAction = new ControlAction();
	}
	
	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void contributeToToolBarGen(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("barcodekeyexchange-settings"));
		toolBarManager.add(new Separator("barcodekeyexchange-additions"));
	}	

	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		contributeToToolBarGen(toolBarManager);
		/*
		toolBarManager.insertAfter("metamodel-additions", exportCertificateToPemAction); //$NON-NLS-1$
		toolBarManager.insertAfter("metamodel-additions", exportPublicKeyToPemAction); //$NON-NLS-1$
		toolBarManager.insertAfter("metamodel-additions", importFromPemAction); //$NON-NLS-1$
		
		toolBarManager.insertAfter("metamodel-additions", saveTestBarcodeAction); //$NON-NLS-1$
		toolBarManager.insertAfter("metamodel-additions", addTestBarcodeAction);//$NON-NLS-1$
		toolBarManager.insertAfter("metamodel-additions", displayTestBarcodeAction);//$NON-NLS-1$
		*/
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_BarCodeKeyExchangeEditor_menu"), "BarCodeKeyExchangeMenuID");
		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		submenuManager.insertBefore("additions", createChildMenuManager);

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		submenuManager.insertBefore("additions", createSiblingMenuManager);

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener
			(new IMenuListener() {
				 public void menuAboutToShow(IMenuManager menuManager) {
					 menuManager.updateAll(true);
				 }
			 });

		addGlobalActions(submenuManager);
	}

	/**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		} else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
			}
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
	 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
	 * that can be added to the selected object and updating the menus accordingly.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildSubmenuActions);
			depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			depopulateManager(createSiblingMenuManager, createSiblingSubmenuActions);
			depopulateManager(createSiblingMenuManager, createSiblingActions);
		}

		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1) {
			Object object = ((IStructuredSelection)selection).getFirstElement();

			EditingDomain domain = ((IEditingDomainProvider)activeEditorPart).getEditingDomain();

			newChildDescriptors = domain.getNewChildDescriptors(object, null);
			newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(newChildDescriptors, selection);
		createChildSubmenuActions = extractSubmenuActions(createChildActions);
		createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);
		createSiblingSubmenuActions = extractSubmenuActions(createSiblingActions);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildSubmenuActions, null);
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingSubmenuActions, null);
			populateManager(createSiblingMenuManager, createSiblingActions, null);
			createSiblingMenuManager.update(true);
		}
		
		exportToPemAction.selectionChanged(event);
		exportAllToPemAction.selectionChanged(event);		
		exportCertificateToPemAction.selectionChanged(event);		
		exportPublicKeyToPemAction.selectionChanged(event);				
		importFromPemAction.selectionChanged(event);
		importCertificateFromPemAction.selectionChanged(event);		
		displayBinaryContentAction.selectionChanged(event);	
		addTestBarcodeAction.selectionChanged(event);
		displayTestBarcodeAction.selectionChanged(event);
		saveTestBarcodeAction.selectionChanged(event);		
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				}
				else {
					manager.add(action);
				}
			}
		}
	}
		
	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem)contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This extracts those actions in the <code>submenuActions</code> collection whose text is qualified and returns
	 * a map of these actions, keyed by submenu text.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map<String, Collection<IAction>> extractSubmenuActions(Collection<IAction> createActions) {
		Map<String, Collection<IAction>> createSubmenuActions = new LinkedHashMap<String, Collection<IAction>>();
		if (createActions != null) {
			for (Iterator<IAction> actions = createActions.iterator(); actions.hasNext(); ) {
				IAction action = actions.next();
				StringTokenizer st = new StringTokenizer(action.getText(), "|");
				if (st.countTokens() == 2) {
					String text = st.nextToken().trim();
					Collection<IAction> submenuActions = createSubmenuActions.get(text);
					if (submenuActions == null) {
						createSubmenuActions.put(text, submenuActions = new ArrayList<IAction>());
					}
					action.setText(st.nextToken().trim());
					submenuActions.add(action);
					actions.remove();
				}
			}
		}
		return createSubmenuActions;
	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.MenuManager}s containing
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the {@link org.eclipse.jface.action.IAction}s
	 * contained in the <code>submenuActions</code> collection, by inserting them before the specified contribution
	 * item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void populateManager(IContributionManager manager, Map<String, Collection<IAction>> submenuActions, String contributionID) {
		if (submenuActions != null) {
			for (Map.Entry<String, Collection<IAction>> entry : submenuActions.entrySet()) {
				MenuManager submenuManager = new MenuManager(entry.getKey());
				if (contributionID != null) {
					manager.insertBefore(contributionID, submenuManager);
				}
				else {
					manager.add(submenuManager);
				}
				populateManager(submenuManager, entry.getValue(), null);
			}
		}
	}

	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.MenuManager}s and their
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the {@link org.eclipse.jface.action.IAction}s
	 * contained in the <code>submenuActions</code> map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager, Map<String, Collection<IAction>> submenuActions) {
		if (submenuActions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				IContributionItem contributionItem = items[i];
				if (contributionItem instanceof MenuManager) {
					MenuManager submenuManager = (MenuManager)contributionItem;
					if (submenuActions.containsKey(submenuManager.getMenuText())) {
						depopulateManager(submenuManager, submenuActions.get(contributionItem));
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		populateManager(submenuManager, createChildSubmenuActions, null);
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("edit", submenuManager);

		submenuManager = new MenuManager(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		populateManager(submenuManager, createSiblingSubmenuActions, null);
		populateManager(submenuManager, createSiblingActions, null);
		menuManager.insertBefore("edit", submenuManager);
	}

	
	/**
	 * This inserts global actions before the "additions-end" separator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", refreshViewerAction);

		exportToPemAction.setEnabled(exportToPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", exportToPemAction);	
		
		exportToPemAction.setEnabled(exportAllToPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", exportAllToPemAction);			

		exportCertificateToPemAction.setEnabled(exportCertificateToPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", exportCertificateToPemAction);		
		
		exportPublicKeyToPemAction.setEnabled(exportPublicKeyToPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", exportPublicKeyToPemAction);				
		
		importFromPemAction.setEnabled(importFromPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", importFromPemAction);		
		
		importCertificateFromPemAction.setEnabled(importCertificateFromPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", importCertificateFromPemAction);		
		
		importFromPemAction.setEnabled(importFromPemAction.isEnabled());		
		menuManager.insertAfter("ui-actions", displayBinaryContentAction);		
		
		addTestBarcodeAction.setEnabled(addTestBarcodeAction.isEnabled());
		menuManager.insertAfter("ui-actions", addTestBarcodeAction);
		
		displayTestBarcodeAction.setEnabled(displayTestBarcodeAction.isEnabled());
		menuManager.insertAfter("ui-actions", displayTestBarcodeAction);

		saveTestBarcodeAction.setEnabled(saveTestBarcodeAction.isEnabled());
		menuManager.insertAfter("ui-actions", saveTestBarcodeAction);		

		super.addGlobalActions(menuManager);
	}	
	
	/**
	 * This inserts global actions before the "additions-end" separator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalActionsGen(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", refreshViewerAction);

		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

}
