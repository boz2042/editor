package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.DataTypeInPackage_c.java
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
abstract class EV_DATA_TYPE_IN_PACKAGE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class DataTypeInPackage_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public DataTypeInPackage_c(ModelRoot modelRoot,
			java.util.UUID p_m_package_id, java.util.UUID p_m_dt_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

		Object[] key = {m_package_id, m_dt_id};
		addInstanceToMap(key);
	}
	static public DataTypeInPackage_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_package_id, java.util.UUID p_m_dt_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);
		DataTypeInPackage_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_package_id, p_m_dt_id};
			new_inst = (DataTypeInPackage_c) instances.get(key);
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
				new_inst.m_package_id = IdAssigner
						.preprocessUUID(p_m_package_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new DataTypeInPackage_c(modelRoot, p_m_package_id,
					p_m_dt_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public DataTypeInPackage_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_package_id, java.util.UUID p_m_dt_id) {
		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);
		DataTypeInPackage_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_package_id, p_m_dt_id};
			source = (DataTypeInPackage_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

				return source;
			}
		}
		// there is no instance matching the id
		DataTypeInPackage_c new_inst = new DataTypeInPackage_c(modelRoot,
				p_m_package_id, p_m_dt_id);
		return new_inst;
	}
	public DataTypeInPackage_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_package_id = IdAssigner.NULL_UUID;
		m_dt_id = IdAssigner.NULL_UUID;
		Object[] key = {m_package_id, m_dt_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_package_id, m_dt_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_package_id != p_newKey) {

			m_package_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof DataTypeInPackage_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof DataTypeInPackage_c)) {
			return false;
		}

		DataTypeInPackage_c me = (DataTypeInPackage_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getPackage_id()) || IdAssigner.NULL_UUID
				.equals(((DataTypeInPackage_c) elem).getPackage_id()))
				&& this != elem) {
			return false;
		}
		if (!getPackage_id().equals(
				((DataTypeInPackage_c) elem).getPackage_id()))
			return false;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getDt_id()) || IdAssigner.NULL_UUID
				.equals(((DataTypeInPackage_c) elem).getDt_id()))
				&& this != elem) {
			return false;
		}
		if (!getDt_id().equals(((DataTypeInPackage_c) elem).getDt_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof DataTypeInPackage_c)) {
			return false;
		}

		DataTypeInPackage_c me = (DataTypeInPackage_c) elem;
		if (!getPackage_idCachedValue().equals(
				((DataTypeInPackage_c) elem).getPackage_idCachedValue()))
			return false;
		if (!getDt_idCachedValue().equals(
				((DataTypeInPackage_c) elem).getDt_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_package_id;
	private java.util.UUID m_dt_id;

	// declare association references from this class

	// referring navigation

	DataTypePackage_c IsContainedInDataTypePackage;
	public void relateAcrossR39To(DataTypePackage_c target) {
		relateAcrossR39To(target, true);
	}
	public void relateAcrossR39To(DataTypePackage_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsContainedInDataTypePackage)
			return; // already related

		if (IsContainedInDataTypePackage != target) {

			Object oldKey = getInstanceKey();

			if (IsContainedInDataTypePackage != null) {

				IsContainedInDataTypePackage.clearBackPointerR39To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"DataTypeInPackage_c.relateAcrossR39To(DataTypePackage_c target)",
									"Relate performed across R39 from Data Type in Package to Data Type Package without unrelate of prior instance.");
				}
			}

			IsContainedInDataTypePackage = target;
			if (IdAssigner.NULL_UUID.equals(target.getPackage_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_package_id = target.getPackage_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR39To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "39", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR39From(DataTypePackage_c target) {
		unrelateAcrossR39From(target, true);
	}
	public void unrelateAcrossR39From(DataTypePackage_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsContainedInDataTypePackage == null)
			return; // already unrelated

		if (target != IsContainedInDataTypePackage) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin
					.logError(
							"Tried to unrelate from non-related instance across R39",
							e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR39To(this);
		}

		if (IsContainedInDataTypePackage != null) {

			m_package_id = IsContainedInDataTypePackage.getPackage_id();
			if (IdAssigner.NULL_UUID.equals(m_package_id)) {
				m_package_id = IsContainedInDataTypePackage
						.getPackage_idCachedValue();
			}
			IsContainedInDataTypePackage = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "39", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	// referring navigation

	DataType_c ContainsDataType;
	public void relateAcrossR39To(DataType_c target) {
		relateAcrossR39To(target, true);
	}
	public void relateAcrossR39To(DataType_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == ContainsDataType)
			return; // already related

		if (ContainsDataType != target) {

			Object oldKey = getInstanceKey();

			if (ContainsDataType != null) {

				ContainsDataType.clearBackPointerR39To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"DataTypeInPackage_c.relateAcrossR39To(DataType_c target)",
									"Relate performed across R39 from Data Type in Package to Data Type without unrelate of prior instance.");
				}
			}

			ContainsDataType = target;
			if (IdAssigner.NULL_UUID.equals(target.getDt_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_dt_id = target.getDt_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR39To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "39", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR39From(DataType_c target) {
		unrelateAcrossR39From(target, true);
	}
	public void unrelateAcrossR39From(DataType_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (ContainsDataType == null)
			return; // already unrelated

		if (target != ContainsDataType) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin
					.logError(
							"Tried to unrelate from non-related instance across R39",
							e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR39To(this);
		}

		if (ContainsDataType != null) {

			m_dt_id = ContainsDataType.getDt_id();
			if (IdAssigner.NULL_UUID.equals(m_dt_id)) {
				m_dt_id = ContainsDataType.getDt_idCachedValue();
			}
			ContainsDataType = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "39", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(
			DataTypePackage_c[] targets) {
		return getOneS_DIPOnR39(targets, null);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(
			DataTypePackage_c[] targets, ClassQueryInterface_c test) {
		DataTypeInPackage_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneS_DIPOnR39(targets[i], test);
			}
		}

		return ret_val;
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(DataTypePackage_c target) {
		return getOneS_DIPOnR39(target, null);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(
			DataTypePackage_c target, boolean loadComponent) {
		return getOneS_DIPOnR39(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(
			DataTypePackage_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneS_DIPOnR39(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(ModelRoot modelRoot,
			DataTypePackage_c target, ClassQueryInterface_c test) {
		return getOneS_DIPOnR39(modelRoot, target, test, true);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(ModelRoot modelRoot,
			DataTypePackage_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneS_DIPOnR39(modelRoot, target, test);
	}
	private static DataTypeInPackage_c find_getOneS_DIPOnR39(
			ModelRoot modelRoot, DataTypePackage_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_ContainsDataTypeInPackageContains_R39) {
				for (int i = 0; i < target.backPointer_ContainsDataTypeInPackageContains_R39
						.size(); ++i) {
					DataTypeInPackage_c source = (DataTypeInPackage_c) target.backPointer_ContainsDataTypeInPackageContains_R39
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c[] targets) {
		return getManyS_DIPsOnR39(targets, null);
	}
	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c[] targets, boolean loadComponent) {
		return getManyS_DIPsOnR39(targets, null, loadComponent);
	}
	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c[] targets, ClassQueryInterface_c test) {
		return getManyS_DIPsOnR39(targets, test, true);
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new DataTypeInPackage_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_ContainsDataTypeInPackageContains_R39) {
				for (int j = 0; j < targets[i].backPointer_ContainsDataTypeInPackageContains_R39
						.size(); ++j) {
					DataTypeInPackage_c source = (DataTypeInPackage_c) targets[i].backPointer_ContainsDataTypeInPackageContains_R39
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			DataTypeInPackage_c[] ret_set = new DataTypeInPackage_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DataTypeInPackage_c[0];
		}
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c target) {
		return getManyS_DIPsOnR39(target, null);
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c target, boolean loadComponent) {
		return getManyS_DIPsOnR39(target, null, loadComponent);
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c target, ClassQueryInterface_c test) {
		return getManyS_DIPsOnR39(target, test, true);
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataTypePackage_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target == null)
			return new DataTypeInPackage_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_ContainsDataTypeInPackageContains_R39) {
			for (int i = 0; i < target.backPointer_ContainsDataTypeInPackageContains_R39
					.size(); ++i) {
				DataTypeInPackage_c source = (DataTypeInPackage_c) target.backPointer_ContainsDataTypeInPackageContains_R39
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			DataTypeInPackage_c[] ret_set = new DataTypeInPackage_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DataTypeInPackage_c[0];
		}
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(DataType_c[] targets) {
		return getOneS_DIPOnR39(targets, null);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(DataType_c[] targets,
			ClassQueryInterface_c test) {
		DataTypeInPackage_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneS_DIPOnR39(targets[i], test);
			}
		}

		return ret_val;
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(DataType_c target) {
		return getOneS_DIPOnR39(target, null);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(DataType_c target,
			boolean loadComponent) {
		return getOneS_DIPOnR39(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(DataType_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneS_DIPOnR39(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test) {
		return getOneS_DIPOnR39(modelRoot, target, test, true);
	}

	public static DataTypeInPackage_c getOneS_DIPOnR39(ModelRoot modelRoot,
			DataType_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneS_DIPOnR39(modelRoot, target, test);
	}
	private static DataTypeInPackage_c find_getOneS_DIPOnR39(
			ModelRoot modelRoot, DataType_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_IsContainedInDataTypeInPackageIsContainedIn_R39) {
				for (int i = 0; i < target.backPointer_IsContainedInDataTypeInPackageIsContainedIn_R39
						.size(); ++i) {
					DataTypeInPackage_c source = (DataTypeInPackage_c) target.backPointer_IsContainedInDataTypeInPackageIsContainedIn_R39
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(DataType_c[] targets) {
		return getManyS_DIPsOnR39(targets, null);
	}
	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataType_c[] targets, boolean loadComponent) {
		return getManyS_DIPsOnR39(targets, null, loadComponent);
	}
	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataType_c[] targets, ClassQueryInterface_c test) {
		return getManyS_DIPsOnR39(targets, test, true);
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(
			DataType_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new DataTypeInPackage_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_IsContainedInDataTypeInPackageIsContainedIn_R39) {
				for (int j = 0; j < targets[i].backPointer_IsContainedInDataTypeInPackageIsContainedIn_R39
						.size(); ++j) {
					DataTypeInPackage_c source = (DataTypeInPackage_c) targets[i].backPointer_IsContainedInDataTypeInPackageIsContainedIn_R39
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			DataTypeInPackage_c[] ret_set = new DataTypeInPackage_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new DataTypeInPackage_c[0];
		}
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(DataType_c target) {
		if (target != null) {
			DataType_c[] targetArray = new DataType_c[1];
			targetArray[0] = target;
			return getManyS_DIPsOnR39(targetArray);
		} else {
			DataTypeInPackage_c[] result = new DataTypeInPackage_c[0];
			return result;
		}
	}

	public static DataTypeInPackage_c[] getManyS_DIPsOnR39(DataType_c target,
			boolean loadComponent) {
		if (target != null) {
			DataType_c[] targetArray = new DataType_c[1];
			targetArray[0] = target;
			return getManyS_DIPsOnR39(targetArray, loadComponent);
		} else {
			DataTypeInPackage_c[] result = new DataTypeInPackage_c[0];
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

		// R39
		DataTypePackage_c relInst55157 = (DataTypePackage_c) baseRoot
				.getInstanceList(DataTypePackage_c.class).get(
						new Object[]{m_package_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst55157 == null) {
			relInst55157 = (DataTypePackage_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(DataTypePackage_c.class)
					.get(new Object[]{m_package_id});
		}
		if (relInst55157 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst55157 = (DataTypePackage_c) roots[i].getInstanceList(
						DataTypePackage_c.class)
						.get(new Object[]{m_package_id});
				if (relInst55157 != null)
					break;
			}
		}
		//synchronized
		if (relInst55157 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst55157) && !isProxy())) {
				relInst55157.relateAcrossR39To(this, notifyChanges);
			}
		}

		DataType_c relInst55158 = (DataType_c) baseRoot.getInstanceList(
				DataType_c.class).get(new Object[]{m_dt_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst55158 == null) {
			relInst55158 = (DataType_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(DataType_c.class)
					.get(new Object[]{m_dt_id});
		}
		if (relInst55158 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst55158 = (DataType_c) roots[i].getInstanceList(
						DataType_c.class).get(new Object[]{m_dt_id});
				if (relInst55158 != null)
					break;
			}
		}
		//synchronized
		if (relInst55158 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst55158) && !isProxy())) {
				relInst55158.relateAcrossR39To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R39
		// S_DPK
		inst = IsContainedInDataTypePackage;
		unrelateAcrossR39From(IsContainedInDataTypePackage, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// S_DT
		inst = ContainsDataType;
		unrelateAcrossR39From(ContainsDataType, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(DataTypeInPackage_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final DataTypeInPackage_c inst = (DataTypeInPackage_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static DataTypeInPackage_c DataTypeInPackageInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		DataTypeInPackage_c result = findDataTypeInPackageInstance(modelRoot,
				test, loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					DataTypeInPackage_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findDataTypeInPackageInstance(modelRoot, test,
								loadComponent);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}
		if (result != null && loadComponent) {
			result.loadProxy();
		}
		return result;
	}
	private static DataTypeInPackage_c findDataTypeInPackageInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DataTypeInPackage_c x = (DataTypeInPackage_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static DataTypeInPackage_c DataTypeInPackageInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DataTypeInPackageInstance(modelRoot, test, true);
	}

	public static DataTypeInPackage_c DataTypeInPackageInstance(
			ModelRoot modelRoot) {
		return DataTypeInPackageInstance(modelRoot, null, true);
	}

	public static DataTypeInPackage_c[] DataTypeInPackageInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					DataTypeInPackage_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(DataTypeInPackage_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				DataTypeInPackage_c x = (DataTypeInPackage_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				DataTypeInPackage_c[] ret_set = new DataTypeInPackage_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new DataTypeInPackage_c[0];
			}
		}
	}
	public static DataTypeInPackage_c[] DataTypeInPackageInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return DataTypeInPackageInstances(modelRoot, test, true);
	}
	public static DataTypeInPackage_c[] DataTypeInPackageInstances(
			ModelRoot modelRoot) {
		return DataTypeInPackageInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Data Type in Package.dispose call: ";
		DataType_c testR39Inst = DataType_c.getOneS_DTOnR39(this, false);

		if (testR39Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "39 ";
		}

		DataTypePackage_c testR39InstOth = DataTypePackage_c.getOneS_DPKOnR39(
				this, false);

		if (testR39InstOth != null) {
			delete_error = true;
			errorMsg = errorMsg + "39 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Data Type in Package",
						errorMsg);
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
		if (attributeName.equals("package_id")) {
			return true;
		}
		if (attributeName.equals("dt_id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getPackage_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getPackage_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		tempID = getDt_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getDt_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public long getPackage_idLongBased() {
		if (IsContainedInDataTypePackage != null) {
			return IsContainedInDataTypePackage.getPackage_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getPackage_id() {
		if (IsContainedInDataTypePackage != null) {
			return IsContainedInDataTypePackage.getPackage_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getPackage_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_package_id))
			return m_package_id;
		else
			return getPackage_id();
	}

	public void setPackage_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_package_id)) {
				return;
			}
		} else if (m_package_id != null) {
			if (m_package_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Package_id", m_package_id, newValue, true);
		m_package_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getDt_idLongBased() {
		if (ContainsDataType != null) {
			return ContainsDataType.getDt_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getDt_id() {
		if (ContainsDataType != null) {
			return ContainsDataType.getDt_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getDt_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_dt_id))
			return m_dt_id;
		else
			return getDt_id();
	}

	public void setDt_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_dt_id)) {
				return;
			}
		} else if (m_dt_id != null) {
			if (m_dt_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Dt_id",
				m_dt_id, newValue, true);
		m_dt_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Data Type in Package", //$NON-NLS-1$
						" Operation entered: Data Type in Package::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		DataTypeInPackage_c[] objs = DataTypeInPackage_c
				.DataTypeInPackageInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Data Type in Package", //$NON-NLS-1$
				" Operation entered: Data Type in Package::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class DataTypeInPackage_c_test55160_c implements ClassQueryInterface_c {
			DataTypeInPackage_c_test55160_c(java.util.UUID p55161,
					java.util.UUID p55162) {
				m_p55161 = p55161;
				m_p55162 = p55162;
			}
			private java.util.UUID m_p55161;
			private java.util.UUID m_p55162;
			public boolean evaluate(Object candidate) {
				DataTypeInPackage_c selected = (DataTypeInPackage_c) candidate;
				boolean retval = false;
				retval = (selected.getPackage_id().equals(m_p55161))
						& (selected.getDt_id().equals(m_p55162));
				return retval;
			}
		}

		DataTypeInPackage_c[] objs55159 = DataTypeInPackage_c
				.DataTypeInPackageInstances(modelRoot,
						new DataTypeInPackage_c_test55160_c(getPackage_id(),
								getDt_id()));

		if (((objs55159.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Data Type in Package", //$NON-NLS-1$
								"Consistency: Object: Data Type in Package: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs55159.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Data Type in Package: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55159.length), e);
			}
			retval = false;

		}

		if (((objs55159.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Data Type in Package", //$NON-NLS-1$
								"Consistency: Object: Data Type in Package: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs55159.length)
										+ " Package_ID: " + "Not Printable" + " DT_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Data Type in Package: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55159.length)
										+ " Package_ID: " + "Not Printable" + " DT_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Data Type in Package is a link class in association: rel.Numb = 39
		// Other side
		// The other side class in the association is: Data Type Package
		class DataTypePackage_c_test55166_c implements ClassQueryInterface_c {
			DataTypePackage_c_test55166_c(java.util.UUID p55167) {
				m_p55167 = p55167;
			}
			private java.util.UUID m_p55167;
			public boolean evaluate(Object candidate) {
				DataTypePackage_c selected = (DataTypePackage_c) candidate;
				boolean retval = false;
				retval = (selected.getPackage_id().equals(m_p55167));
				return retval;
			}
		}

		DataTypePackage_c[] objs55165 = DataTypePackage_c
				.DataTypePackageInstances(modelRoot,
						new DataTypePackage_c_test55166_c(getPackage_id()));

		if (((objs55165.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Data Type in Package", //$NON-NLS-1$
								"Consistency: Object: Data Type in Package: Association: 39: Cardinality of other side of link is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs55165.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Data Type in Package: Association: 39: Cardinality of other side of link is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs55165.length), e);
			}
			retval = false;

		}

		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Data Type in Package
