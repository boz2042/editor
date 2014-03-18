package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.StateMachineEventDataItemActionFilter.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================
import org.eclipse.ui.IActionFilter;
import com.mentor.nucleus.bp.core.StateMachineEventDataItem_c;

public class StateMachineEventDataItemActionFilter implements IActionFilter {
	private static StateMachineEventDataItemActionFilter singleton;

	public static StateMachineEventDataItemActionFilter getSingleton() {
		if (singleton == null)
			singleton = new StateMachineEventDataItemActionFilter();
		return singleton;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionFilter#testAttribute(java.lang.Object, java.lang.String, java.lang.String)
	 */
	public boolean testAttribute(Object target, String name, String value) {
		StateMachineEventDataItem_c x = (StateMachineEventDataItem_c) target;
		return x.Actionfilter(name, value);
	}

}