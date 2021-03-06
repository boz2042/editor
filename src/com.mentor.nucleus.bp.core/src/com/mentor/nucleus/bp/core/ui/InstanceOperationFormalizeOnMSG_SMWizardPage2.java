package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    InstanceOperationFormalizeOnMSG_SMWizardPage2.java
//
// WARNING: Do not edit this generated file
// Generated by arc/page.inc
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//====================================================================
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.ClassQueryInterface_c;

import java.util.ArrayList;
import java.util.List;

public class InstanceOperationFormalizeOnMSG_SMWizardPage2 extends PtWizardPage
		implements
			Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo MessageCombo;
	public Label MessageLabel;

	// cache for user choices
	Operation_c Message = null;
	Operation_c[] MessageInstances;

	/**
	 * Constructors for InstanceOperationFormalizeOnMSG_SMWizardPage2.
	 */
	public InstanceOperationFormalizeOnMSG_SMWizardPage2() {
		super("");
		init();
	}

	public InstanceOperationFormalizeOnMSG_SMWizardPage2(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the message to send");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((InstanceOperationFormalizeOnMSG_SMWizard) getWizard())
						.getSelection());

		// cache for context
		SynchronousMessage_c v_syncMessage = ((InstanceOperationFormalizeOnMSG_SMWizard) getWizard()).v_syncMessage;

		Operation_c v_operation = Operation_c
				.getOneO_TFROnR1011(OperationMessage_c
						.getOneMSG_OOnR1020(v_syncMessage));

		java.util.UUID v_existingId = Gd_c.Null_unique_id();

		if (((v_operation != null))) {

			v_existingId = v_operation.getTfr_id();

		}

		Message_c v_message = Message_c.getOneMSG_MOnR1018(v_syncMessage);

		InteractionParticipant_c v_participant = InteractionParticipant_c
				.getOneSQ_POnR1007(v_message);

		Lifespan_c v_ls = Lifespan_c.getOneSQ_LSOnR930(v_participant);

		ModelClass_c v_mclass = (ModelClass_c) modelRoot.getInstanceList(
				ModelClass_c.class).getGlobal(null, Gd_c.Null_unique_id());

		if (((v_ls != null))) {

			ClassInstanceParticipant_c v_cip = ClassInstanceParticipant_c
					.getOneSQ_CIPOnR930(InteractionParticipant_c
							.getOneSQ_POnR940(v_ls));

			if (((v_cip != null))) {

				v_mclass = ModelClass_c.getOneO_OBJOnR934(v_cip);

			}

		}

		else {

			ClassInstanceParticipant_c v_cip = ClassInstanceParticipant_c
					.getOneSQ_CIPOnR930(InteractionParticipant_c
							.getOneSQ_POnR1007(v_message));

			if (((v_cip != null))) {

				Communication_c v_communication = Communication_c
						.getOneCOMM_COMMOnR1126(ParticipantInCommunication_c
								.getOneCOMM_PICOnR1126(InteractionParticipant_c
										.getOneSQ_POnR930(v_cip)));

				if (((v_communication != null) || v_message
						.getParticipatesincommunication())) {

					v_mclass = ModelClass_c.getOneO_OBJOnR934(v_cip);

				}

			}

		}

		if (((v_mclass != null))) {

			// select related by where USER::selectOne
			Operation_c[] v_MessageInstances = Operation_c
					.getManyO_TFRsOnR115(v_mclass);
			Operation_c v_Message = null;
			int MessageInstCount;
			int MessageResultCount = 0;
			for (MessageInstCount = 0; MessageInstCount < v_MessageInstances.length; MessageInstCount++) {
				Operation_c selected = v_MessageInstances[MessageInstCount];
				if (User_c.Selectone(selected.getTfr_id())
						&& ((selected.getInstance_based() == Scope_c.Instance) && (!selected
								.getTfr_id().equals(v_existingId)))) {
					MessageResultCount++;
				}
			}
			this.MessageInstances = new Operation_c[MessageResultCount];
			MessageResultCount = 0;
			for (MessageInstCount = 0; MessageInstCount < v_MessageInstances.length; MessageInstCount++) {
				Operation_c selected = v_MessageInstances[MessageInstCount];
				if (User_c.Selectone(selected.getTfr_id())
						&& ((selected.getInstance_based() == Scope_c.Instance) && (!selected
								.getTfr_id().equals(v_existingId)))) {
					this.MessageInstances[MessageResultCount] = selected;
					MessageResultCount++;
				}
			}
			MessageCombo.removeAll();
			for (MessageInstCount = 0; MessageInstCount < MessageResultCount; MessageInstCount++)
				MessageCombo
						.add(((Operation_c) this.MessageInstances[MessageInstCount])
								.getName());
			if (MessageResultCount == 1) {
				MessageCombo.select(0);
				updateSelectedMessage();
			}

			if (((v_Message != null))) {

			}

		}

	}

	public void createControl(Composite parent) {
		// create the composite to hold the widgets   
		GridData gd = null;
		Composite composite = new Composite(parent, SWT.NULL);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 5;
		gl.numColumns = ncol;
		composite.setLayout(gl);

		MessageLabel = new Label(composite, SWT.NONE);
		MessageLabel.setText("Message");
		MessageCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		MessageCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		MessageCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedMessage() {
		this.Message = MessageInstances[MessageCombo.getSelectionIndex()];
		((InstanceOperationFormalizeOnMSG_SMWizard) getWizard()).v_Message = this.Message;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == MessageCombo) {
			updateSelectedMessage();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (Message == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((InstanceOperationFormalizeOnMSG_SMWizard) getWizard()).v_Message = Message;
		PtWizardPage page = (PtWizardPage) getWizard().getNextPage(this);
		page.onPageEntry();
		return page;
	}

	/**
	 * @see IWizardPage#canFlipToNextPage()
	 */
	public boolean canFlipToNextPage() {
		if ((PtWizardPage) getWizard().getNextPage(this) == null)
			return false;
		if (Message == null)
			return false;
		return true;
	}

}
