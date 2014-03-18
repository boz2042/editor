//======================================================================
//
// File: ComponentInstancesI_EXEPropertySource.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/BuildPropertySource.arc
// Version:      $Revision: 1.66 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.ui.properties;
import org.eclipse.ui.views.properties.*;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.DimensionsUtil;

public class ComponentInstancesI_EXEPropertySource implements IPropertySource {
	private ComponentInstance_c m_inst;
	private PropertyDescriptor[] m_propertyDescriptors;

	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public ComponentInstancesI_EXEPropertySource(ComponentInstance_c inst) {
		m_inst = inst;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
		// do nothing
	}

	public String toString() {
		return super.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (m_inst == null || m_inst.isOrphaned())
			return new IPropertyDescriptor[0];
		if (m_propertyDescriptors == null || 4 != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[4];
			boolean readonly = false;

			m_propertyDescriptors[0] = new BooleanPropertyDescriptor("Running",
					"", readonly);
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new IntegerPropertyDescriptor(
					"Next_Unique_ID", "", Integer.MIN_VALUE, Integer.MAX_VALUE,
					readonly);
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[2] = new IntegerPropertyDescriptor(
					"Next_Instance_ID", "", Integer.MIN_VALUE,
					Integer.MAX_VALUE, readonly);
			m_propertyDescriptors[2]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[3] = new PropertyDescriptor("Label", "");
			m_propertyDescriptors[3]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

		}
		return m_propertyDescriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (m_inst.isOrphaned()) {
			return "";
		}
		if (id.equals("Running")) {
			return new Boolean(m_inst.getRunning());
		} else if (id.equals("Next_Unique_ID")) {
			return String.valueOf(m_inst.getNext_unique_id());
		} else if (id.equals("Next_Instance_ID")) {
			return String.valueOf(m_inst.getNext_instance_id());
		} else if (id.equals("Label")) {
			return m_inst.getLabel();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		boolean value_changed = false;
		String trans_name = "";
		Transaction tr = null;
		Ooaofooa modelRoot = (Ooaofooa) m_inst.getModelRoot();
		TransactionManager tm = TransactionManager.getSingleton();
		try {
			if (id.equals("Running")) {
				boolean new_val = ((Boolean) value).booleanValue();
				if (new_val != m_inst.getRunning()) {
					trans_name = "Change in property: 'Running' of Component Instance"; //$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setRunning(new_val);
				}
			} else if (id.equals("Next_Unique_ID")) {
				int new_val = Integer.parseInt(value.toString());
				if (new_val != m_inst.getNext_unique_id()) {
					trans_name = "Change in property: 'Next_Unique_ID' of Component Instance";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setNext_unique_id(new_val);
				}
			} else if (id.equals("Next_Instance_ID")) {
				int new_val = Integer.parseInt(value.toString());
				if (new_val != m_inst.getNext_instance_id()) {
					trans_name = "Change in property: 'Next_Instance_ID' of Component Instance";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setNext_instance_id(new_val);
				}
			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			// this can be null if there was
			// an exception starting the
			// transaction
			if (tr != null) {
				tm.cancelTransaction(tr, e);
				tr = null;
			}
			CorePlugin.logError("Transaction: " + trans_name
					+ " could not complete", e);
		}
		if (tr != null) {
			if (value_changed)
				tm.endTransaction(tr);
			else
				tm.cancelTransaction(tr);
		}
	}
}