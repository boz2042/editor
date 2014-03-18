package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    ComponentFormalizeOnC_CWizardPage3.java
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

public class ComponentFormalizeOnC_CWizardPage3 extends PtWizardPage
		implements
			Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo DomainCombo;
	public Label DomainLabel;

	// cache for user choices
	Domain_c Domain = null;
	Domain_c[] DomainInstances;

	/**
	 * Constructors for ComponentFormalizeOnC_CWizardPage3.
	 */
	public ComponentFormalizeOnC_CWizardPage3() {
		super("");
		init();
	}

	public ComponentFormalizeOnC_CWizardPage3(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the domain that should describe the structure of this component");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((ComponentFormalizeOnC_CWizard) getWizard())
						.getSelection());

		// cache for context
		Component_c v_component = ((ComponentFormalizeOnC_CWizard) getWizard()).v_component;

		if (((v_component != null))) {

			ComponentPackage_c v_componentPackage = ComponentPackage_c
					.getOneCP_CPOnR4604(v_component);

			if (((v_componentPackage == null))) {

				Component_c v_componentParent = Component_c
						.getOneC_COnR4202(ComponentInComponent_c
								.getOneCN_CICOnR4203(v_component));

				while (((v_componentPackage == null))) {

					v_componentPackage = ComponentPackage_c
							.getOneCP_CPOnR4604(v_componentParent);

					v_componentParent = Component_c
							.getOneC_COnR4202(ComponentInComponent_c
									.getOneCN_CICOnR4203(v_componentParent));

				}

			}

			if ((!(v_componentPackage == null))) {

				SystemModel_c v_system = SystemModel_c
						.getOneS_SYSOnR4606(v_componentPackage);

				// select related by where USER::selectOne
				Domain_c[] v_DomainInstances = Domain_c
						.getManyS_DOMsOnR28(v_system);
				Domain_c v_Domain = null;
				int DomainInstCount;
				int DomainResultCount = 0;
				for (DomainInstCount = 0; DomainInstCount < v_DomainInstances.length; DomainInstCount++) {
					Domain_c selected = v_DomainInstances[DomainInstCount];
					if (User_c.Selectone(selected.getDom_id())) {
						DomainResultCount++;
					}
				}
				this.DomainInstances = new Domain_c[DomainResultCount];
				DomainResultCount = 0;
				for (DomainInstCount = 0; DomainInstCount < v_DomainInstances.length; DomainInstCount++) {
					Domain_c selected = v_DomainInstances[DomainInstCount];
					if (User_c.Selectone(selected.getDom_id())) {
						this.DomainInstances[DomainResultCount] = selected;
						DomainResultCount++;
					}
				}
				DomainCombo.removeAll();
				for (DomainInstCount = 0; DomainInstCount < DomainResultCount; DomainInstCount++)
					DomainCombo
							.add(((Domain_c) this.DomainInstances[DomainInstCount])
									.getName());
				if (DomainResultCount == 1) {
					DomainCombo.select(0);
					updateSelectedDomain();
				}

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

		DomainLabel = new Label(composite, SWT.NONE);
		DomainLabel.setText("Domain");
		DomainCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		DomainCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		DomainCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedDomain() {
		this.Domain = DomainInstances[DomainCombo.getSelectionIndex()];
		((ComponentFormalizeOnC_CWizard) getWizard()).v_Domain = this.Domain;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == DomainCombo) {
			updateSelectedDomain();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (Domain == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((ComponentFormalizeOnC_CWizard) getWizard()).v_Domain = Domain;
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
		if (Domain == null)
			return false;
		return true;
	}

}