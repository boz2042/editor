package com.mentor.nucleus.bp.core.ui;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/ui/NewInterfaceOnIP_IPAction.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_action.inc
// Version:      $Revision: 1.30 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is the main BridgePoint entry point for the action that
// creates new Interfaces.
//
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.OoaofgraphicsUtil;
import com.mentor.nucleus.bp.core.util.RenameActionUtil;
import com.mentor.nucleus.bp.core.util.TransactionUtil;
import com.mentor.nucleus.bp.core.util.UIUtil;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;

public class NewInterfaceOnIP_IPAction implements IObjectActionDelegate {

	/**
	 * Constructor for NewInterfaceOnIP_IPAction.
	 */
	public NewInterfaceOnIP_IPAction() {
		super();
	}
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// The part is mainly needed to locate the selection provider, and
		// we cache our selection in core so no action is needed here.
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection structuredSelection = Selection.getInstance()
				.getStructuredSelection();
		IP_IP_NewInterface(structuredSelection);

	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		action.setImageDescriptor(CorePlugin.getImageDescriptorFor(
				"Interface_c", false));
	}
	private void IP_IP_NewInterface(IStructuredSelection selection) {
		// Assign the context selection variables with the action context 
		// Assign the context selection variable with the action context 
		Object context = selection.iterator().next();
		InterfacePackage_c v_diagram = (InterfacePackage_c) context;
		PersistableModelComponent.ensureCoreDataTypesAvailable(v_diagram
				.getModelRoot());

		TransactionUtil.TransactionGroup transactionGroup = TransactionUtil
				.startTransactionsOnSelectedModelRoots("New Interface");
		try {
			// Ensure that actions take place between Verifier Activity executions
			Ooaofooa.beginSaveOperation();
			if (((v_diagram != null))) {

				if (v_diagram != null) {
					v_diagram.Newinterface();
				} else {
					Throwable t = new Throwable();
					t.fillInStackTrace();
					CorePlugin
							.logError(
									"Attempted to call an operation on a null instance.",
									t);
				}

			}

			// end critical section
			Ooaofooa.endSaveOperation();
			// catch all exceptions and cancel the transactions
		} catch (Exception e) {
			Ooaofooa.endSaveOperation();
			TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin.logError("Transaction: New Interface failed", e);//$NON-NLS-1$
		}
		TransactionUtil.endTransactions(transactionGroup);

	}
} // end NewInterfaceOnIP_IPAction
