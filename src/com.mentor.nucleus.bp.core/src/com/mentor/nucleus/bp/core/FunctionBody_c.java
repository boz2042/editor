package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.FunctionBody_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_FUNCTION_BODY extends genericEvent_c {
	public abstract int getEvtcode();
}

public class FunctionBody_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public FunctionBody_c(ModelRoot modelRoot, java.util.UUID p_m_action_id,
			java.util.UUID p_m_sync_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_sync_id = IdAssigner.preprocessUUID(p_m_sync_id);

		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}
	static public FunctionBody_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_sync_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);
		FunctionBody_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			new_inst = (FunctionBody_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_sync_id = IdAssigner.preprocessUUID(p_m_sync_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new FunctionBody_c(modelRoot, p_m_action_id, p_m_sync_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public FunctionBody_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_sync_id) {
		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);
		FunctionBody_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			source = (FunctionBody_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_sync_id = IdAssigner.preprocessUUID(p_m_sync_id);

				return source;
			}
		}
		// there is no instance matching the id
		FunctionBody_c new_inst = new FunctionBody_c(modelRoot, p_m_action_id,
				p_m_sync_id);
		return new_inst;
	}
	public FunctionBody_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_action_id = IdAssigner.NULL_UUID;
		m_sync_id = IdAssigner.NULL_UUID;
		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_action_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_action_id != p_newKey) {

			m_action_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof FunctionBody_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof FunctionBody_c)) {
			return false;
		}

		FunctionBody_c me = (FunctionBody_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getAction_id()) || IdAssigner.NULL_UUID
				.equals(((FunctionBody_c) elem).getAction_id()))
				&& this != elem) {
			return false;
		}
		if (!getAction_id().equals(((FunctionBody_c) elem).getAction_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof FunctionBody_c)) {
			return false;
		}

		FunctionBody_c me = (FunctionBody_c) elem;
		if (!getAction_idCachedValue().equals(
				((FunctionBody_c) elem).getAction_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_action_id;
	private java.util.UUID m_sync_id;

	// declare association references from this class

	// referring navigation

	Function_c SpecifiesProcessingForFunction;
	public void relateAcrossR695To(Function_c target) {
		relateAcrossR695To(target, true);
	}
	public void relateAcrossR695To(Function_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == SpecifiesProcessingForFunction)
			return; // already related

		if (SpecifiesProcessingForFunction != target) {

			Object oldKey = getInstanceKey();

			if (SpecifiesProcessingForFunction != null) {

				SpecifiesProcessingForFunction.clearBackPointerR695To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"FunctionBody_c.relateAcrossR695To(Function_c target)",
									"Relate performed across R695 from Function Body to Function without unrelate of prior instance.");
				}
			}

			SpecifiesProcessingForFunction = target;
			if (IdAssigner.NULL_UUID.equals(target.getSync_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_sync_id = target.getSync_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR695To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR695From(Function_c target) {
		unrelateAcrossR695From(target, true);
	}
	public void unrelateAcrossR695From(Function_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (SpecifiesProcessingForFunction == null)
			return; // already unrelated

		if (target != SpecifiesProcessingForFunction) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R695",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR695To(this);
		}

		if (SpecifiesProcessingForFunction != null) {

			m_sync_id = SpecifiesProcessingForFunction.getSync_id();
			if (IdAssigner.NULL_UUID.equals(m_sync_id)) {
				m_sync_id = SpecifiesProcessingForFunction
						.getSync_idCachedValue();
			}
			SpecifiesProcessingForFunction = null;
			target.removeRef();
		}
	}

	public static FunctionBody_c getOneACT_FNBOnR695(Function_c[] targets) {
		return getOneACT_FNBOnR695(targets, null);
	}

	public static FunctionBody_c getOneACT_FNBOnR695(Function_c[] targets,
			ClassQueryInterface_c test) {
		FunctionBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_FNBOnR695(targets[i], test);
			}
		}

		return ret_val;
	}

	public static FunctionBody_c getOneACT_FNBOnR695(Function_c target) {
		return getOneACT_FNBOnR695(target, null);
	}

	public static FunctionBody_c getOneACT_FNBOnR695(Function_c target,
			boolean loadComponent) {
		return getOneACT_FNBOnR695(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static FunctionBody_c getOneACT_FNBOnR695(Function_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_FNBOnR695(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static FunctionBody_c getOneACT_FNBOnR695(ModelRoot modelRoot,
			Function_c target, ClassQueryInterface_c test) {
		return getOneACT_FNBOnR695(modelRoot, target, test, true);
	}

	public static FunctionBody_c getOneACT_FNBOnR695(ModelRoot modelRoot,
			Function_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneACT_FNBOnR695(modelRoot, target, test);
	}
	private static FunctionBody_c find_getOneACT_FNBOnR695(ModelRoot modelRoot,
			Function_c target, ClassQueryInterface_c test) {
		if (target != null) {
			FunctionBody_c source = (FunctionBody_c) target.backPointer_FunctionBody_R695;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR695(Function_c[] targets) {
		return getManyACT_FNBsOnR695(targets, null);
	}
	public static FunctionBody_c[] getManyACT_FNBsOnR695(Function_c[] targets,
			boolean loadComponent) {
		return getManyACT_FNBsOnR695(targets, null, loadComponent);
	}
	public static FunctionBody_c[] getManyACT_FNBsOnR695(Function_c[] targets,
			ClassQueryInterface_c test) {
		return getManyACT_FNBsOnR695(targets, test, true);
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR695(Function_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new FunctionBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			FunctionBody_c source = (FunctionBody_c) targets[i].backPointer_FunctionBody_R695;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			FunctionBody_c[] ret_set = new FunctionBody_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new FunctionBody_c[0];
		}
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR695(Function_c target) {
		if (target != null) {
			Function_c[] targetArray = new Function_c[1];
			targetArray[0] = target;
			return getManyACT_FNBsOnR695(targetArray);
		} else {
			FunctionBody_c[] result = new FunctionBody_c[0];
			return result;
		}
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR695(Function_c target,
			boolean loadComponent) {
		if (target != null) {
			Function_c[] targetArray = new Function_c[1];
			targetArray[0] = target;
			return getManyACT_FNBsOnR695(targetArray, loadComponent);
		} else {
			FunctionBody_c[] result = new FunctionBody_c[0];
			return result;
		}
	}

	// referring navigation

	Body_c IsSupertypeBody;
	public void relateAcrossR698To(Body_c target) {
		relateAcrossR698To(target, true);
	}
	public void relateAcrossR698To(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeBody)
			return; // already related

		if (IsSupertypeBody != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeBody != null) {

				IsSupertypeBody.clearBackPointerR698To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"FunctionBody_c.relateAcrossR698To(Body_c target)",
									"Relate performed across R698 from Function Body to Body without unrelate of prior instance.");
				}
			}

			IsSupertypeBody = target;
			m_action_id = target.getAction_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR698To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR698From(Body_c target) {
		unrelateAcrossR698From(target, true);
	}
	public void unrelateAcrossR698From(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeBody == null)
			return; // already unrelated

		if (target != IsSupertypeBody) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R698",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR698To(this);
		}

		if (IsSupertypeBody != null) {

			m_action_id = IsSupertypeBody.getAction_id();
			IsSupertypeBody = null;
			target.removeRef();
		}
	}

	public static FunctionBody_c getOneACT_FNBOnR698(Body_c[] targets) {
		return getOneACT_FNBOnR698(targets, null);
	}

	public static FunctionBody_c getOneACT_FNBOnR698(Body_c[] targets,
			ClassQueryInterface_c test) {
		FunctionBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_FNBOnR698(targets[i], test);
			}
		}

		return ret_val;
	}

	public static FunctionBody_c getOneACT_FNBOnR698(Body_c target) {
		return getOneACT_FNBOnR698(target, null);
	}

	public static FunctionBody_c getOneACT_FNBOnR698(Body_c target,
			boolean loadComponent) {
		return getOneACT_FNBOnR698(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static FunctionBody_c getOneACT_FNBOnR698(Body_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_FNBOnR698(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static FunctionBody_c getOneACT_FNBOnR698(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test) {
		return getOneACT_FNBOnR698(modelRoot, target, test, true);
	}

	public static FunctionBody_c getOneACT_FNBOnR698(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneACT_FNBOnR698(modelRoot, target, test);
	}
	private static FunctionBody_c find_getOneACT_FNBOnR698(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test) {
		if (target != null) {
			FunctionBody_c source = (FunctionBody_c) target.backPointer_IsSubtypeFunctionBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR698(Body_c[] targets) {
		return getManyACT_FNBsOnR698(targets, null);
	}
	public static FunctionBody_c[] getManyACT_FNBsOnR698(Body_c[] targets,
			boolean loadComponent) {
		return getManyACT_FNBsOnR698(targets, null, loadComponent);
	}
	public static FunctionBody_c[] getManyACT_FNBsOnR698(Body_c[] targets,
			ClassQueryInterface_c test) {
		return getManyACT_FNBsOnR698(targets, test, true);
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR698(Body_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new FunctionBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			FunctionBody_c source = (FunctionBody_c) targets[i].backPointer_IsSubtypeFunctionBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			FunctionBody_c[] ret_set = new FunctionBody_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new FunctionBody_c[0];
		}
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR698(Body_c target) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_FNBsOnR698(targetArray);
		} else {
			FunctionBody_c[] result = new FunctionBody_c[0];
			return result;
		}
	}

	public static FunctionBody_c[] getManyACT_FNBsOnR698(Body_c target,
			boolean loadComponent) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_FNBsOnR698(targetArray, loadComponent);
		} else {
			FunctionBody_c[] result = new FunctionBody_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		if (SpecifiesProcessingForFunction == null) {
			// R695
			Function_c relInst56315 = (Function_c) baseRoot.getInstanceList(
					Function_c.class).get(new Object[]{m_sync_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst56315 == null) {
				relInst56315 = (Function_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(Function_c.class)
						.get(new Object[]{m_sync_id});
			}
			if (relInst56315 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst56315 = (Function_c) roots[i].getInstanceList(
							Function_c.class).get(new Object[]{m_sync_id});
					if (relInst56315 != null)
						break;
				}
			}
			//synchronized
			if (relInst56315 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst56315) && !isProxy())) {
					relInst56315.relateAcrossR695To(this, notifyChanges);
				}
			}
		}

		// R698
		Body_c relInst56316 = (Body_c) baseRoot.getInstanceList(Body_c.class)
				.get(new Object[]{m_action_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56316 == null) {
			relInst56316 = (Body_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Body_c.class)
					.get(new Object[]{m_action_id});
		}
		if (relInst56316 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56316 = (Body_c) roots[i].getInstanceList(Body_c.class)
						.get(new Object[]{m_action_id});
				if (relInst56316 != null)
					break;
			}
		}
		//synchronized
		if (relInst56316 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56316) && !isProxy())) {
				relInst56316.relateAcrossR698To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R695
		// S_SYNC
		inst = SpecifiesProcessingForFunction;
		unrelateAcrossR695From(SpecifiesProcessingForFunction, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R698
		// ACT_ACT
		inst = IsSupertypeBody;
		unrelateAcrossR698From(IsSupertypeBody, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(FunctionBody_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final FunctionBody_c inst = (FunctionBody_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static FunctionBody_c FunctionBodyInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		FunctionBody_c result = findFunctionBodyInstance(modelRoot, test,
				loadComponent);
		return result;
	}
	private static FunctionBody_c findFunctionBodyInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				FunctionBody_c x = (FunctionBody_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static FunctionBody_c FunctionBodyInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return FunctionBodyInstance(modelRoot, test, true);
	}

	public static FunctionBody_c FunctionBodyInstance(ModelRoot modelRoot) {
		return FunctionBodyInstance(modelRoot, null, true);
	}

	public static FunctionBody_c[] FunctionBodyInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(FunctionBody_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				FunctionBody_c x = (FunctionBody_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				FunctionBody_c[] ret_set = new FunctionBody_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new FunctionBody_c[0];
			}
		}
	}
	public static FunctionBody_c[] FunctionBodyInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return FunctionBodyInstances(modelRoot, test, true);
	}
	public static FunctionBody_c[] FunctionBodyInstances(ModelRoot modelRoot) {
		return FunctionBodyInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Function Body.dispose call: ";
		Function_c testR695Inst = Function_c.getOneS_SYNCOnR695(this, false);

		if (testR695Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "695 ";
		}
		Body_c testR698Inst4 = Body_c.getOneACT_ACTOnR698(this, false);

		if (testR698Inst4 != null) {
			delete_error = true;
			errorMsg = errorMsg + "698 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Function Body", errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("action_id")) {
			return true;
		}
		if (attributeName.equals("sync_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getAction_idLongBased() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getAction_id() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeBody != null);

	}

	public java.util.UUID getAction_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_action_id))
			return m_action_id;
		else
			return getAction_id();
	}

	public void setAction_id(java.util.UUID newValue) {
		m_action_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getSync_idLongBased() {
		if (SpecifiesProcessingForFunction != null) {
			return SpecifiesProcessingForFunction.getSync_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getSync_id() {
		if (SpecifiesProcessingForFunction != null) {
			return SpecifiesProcessingForFunction.getSync_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getSync_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_sync_id))
			return m_sync_id;
		else
			return getSync_id();
	}

	public void setSync_id(java.util.UUID newValue) {
		m_sync_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Function Body", //$NON-NLS-1$
				" Operation entered: Function Body::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		FunctionBody_c[] objs = FunctionBody_c.FunctionBodyInstances(modelRoot,
				null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Function Body", //$NON-NLS-1$
				" Operation entered: Function Body::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class FunctionBody_c_test56318_c implements ClassQueryInterface_c {
			FunctionBody_c_test56318_c(java.util.UUID p56319) {
				m_p56319 = p56319;
			}
			private java.util.UUID m_p56319;
			public boolean evaluate(Object candidate) {
				FunctionBody_c selected = (FunctionBody_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56319));
				return retval;
			}
		}

		FunctionBody_c[] objs56317 = FunctionBody_c.FunctionBodyInstances(
				modelRoot, new FunctionBody_c_test56318_c(getAction_id()));

		if (((objs56317.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Function Body", //$NON-NLS-1$
								"Consistency: Object: Function Body: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56317.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Function Body: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs56317.length), e);
			}
			retval = false;

		}

		if (((objs56317.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Function Body", //$NON-NLS-1$
								"Consistency: Object: Function Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56317.length)
										+ " Action_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Function Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56317.length)
										+ " Action_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Function Body is a subtype in association: rel.Numb = 698
		// The supertype class is: Body
		class Body_c_test56323_c implements ClassQueryInterface_c {
			Body_c_test56323_c(java.util.UUID p56324) {
				m_p56324 = p56324;
			}
			private java.util.UUID m_p56324;
			public boolean evaluate(Object candidate) {
				Body_c selected = (Body_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56324));
				return retval;
			}
		}

		Body_c[] objs56322 = Body_c.BodyInstances(modelRoot,
				new Body_c_test56323_c(getAction_id()));

		if (((objs56322.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Function Body", //$NON-NLS-1$
								"Consistency: Object: Function Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56322.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Function Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56322.length), e);
			}
			retval = false;

		}

		// Function Body is a referring class in association: rel.Numb = 695
		// The participating class is: Function
		class Function_c_test56326_c implements ClassQueryInterface_c {
			Function_c_test56326_c(java.util.UUID p56327) {
				m_p56327 = p56327;
			}
			private java.util.UUID m_p56327;
			public boolean evaluate(Object candidate) {
				Function_c selected = (Function_c) candidate;
				boolean retval = false;
				retval = (selected.getSync_id().equals(m_p56327));
				return retval;
			}
		}

		Function_c[] objs56325 = Function_c.FunctionInstances(modelRoot,
				new Function_c_test56326_c(getSync_id()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs56325.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Function Body", //$NON-NLS-1$
								"Consistency: Object: Function Body: Association: 695: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56325.length)
										+ " Sync_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Function Body: Association: 695: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56325.length)
										+ " Sync_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Function Body",
				" Operation entered: FunctionBody::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		Function_c v_fnb = Function_c.getOneS_SYNCOnR695(this);

		if (((v_fnb != null))) {

			this.unrelateAcrossR695From(v_fnb);

		}

		delete();

	} // End dispose
	public java.util.UUID Getcontainingcomponentid() {
		Ooaofooa.log.println(ILogger.OPERATION, "Function Body",
				" Operation entered: FunctionBody::Getcontainingcomponentid");
		final ModelRoot modelRoot = getModelRoot();
		Function_c v_function = Function_c.getOneS_SYNCOnR695(this);

		return v_function.Getcontainingcomponentid();

	} // End getContainingComponentId
	public java.util.UUID Getcontainerid() {
		Ooaofooa.log.println(ILogger.OPERATION, "Function Body",
				" Operation entered: FunctionBody::Getcontainerid");
		final ModelRoot modelRoot = getModelRoot();
		Function_c v_function = Function_c.getOneS_SYNCOnR695(this);

		return v_function.Getcontainerid();

	} // End getContainerId
	public String Getpath() {
		Ooaofooa.log.println(ILogger.OPERATION, "Function Body",
				" Operation entered: FunctionBody::Getpath");
		final ModelRoot modelRoot = getModelRoot();
		Function_c v_function = Function_c.getOneS_SYNCOnR695(this);

		String v_fnPath = "";

		String v_fnName = "";

		if (((v_function != null))) {

			v_fnName = v_function.getName();

			PackageableElement_c v_pe_pe = PackageableElement_c
					.getOnePE_PEOnR8001(v_function);

			if (((v_pe_pe != null))) {

				Package_c v_pkg = Package_c.getOneEP_PKGOnR8000(v_pe_pe);

				v_fnPath = v_pkg.Getpath(v_fnName);

			}

			else {

				FunctionPackage_c v_fnPkg = FunctionPackage_c
						.getOneS_FPKOnR31(v_function);

				v_fnPath = v_fnPkg.Getpath() + "::" + v_fnName;

			}

		}

		return v_fnPath;

	} // End getPath

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Function Body