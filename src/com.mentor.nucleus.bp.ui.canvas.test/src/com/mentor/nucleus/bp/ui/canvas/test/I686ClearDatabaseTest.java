//========================================================================
//
// File: com.mentor.nucleus.bp.ui.canvas.test.I686ClearDatabaseTest.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/gen_testClearDatabaseClass.arc
// Version:      $Revision: 1.19 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//========================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//======================================================================== 
package com.mentor.nucleus.bp.ui.canvas.test;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import com.mentor.nucleus.bp.core.common.ClassQueryInterface_c;
import com.mentor.nucleus.bp.core.common.InstanceList;
import com.mentor.nucleus.bp.core.Ooaofooa;
import com.mentor.nucleus.bp.core.Package_c;
import com.mentor.nucleus.bp.test.common.BaseTest;
import com.mentor.nucleus.bp.test.common.TestingUtilities;
import com.mentor.nucleus.bp.ui.canvas.*;

public class I686ClearDatabaseTest extends BaseTest {

	static IFile model = null;
	static Ooaofooa modelRoot = getDefaultTestInstance();

	public I686ClearDatabaseTest(String name) throws Exception {
		super("clearDatabase", name); //$NON-NLS-1$
	}

	public I686ClearDatabaseTest(String projectName, String name)
			throws CoreException {
		super("clearDatabase", name); //$NON-NLS-1$
	}

	protected void setUp() throws Exception {
		super.setUp();
		// load test model
		TestingUtilities.importTestingProjectIntoWorkspace("canvastest");
		BaseTest.dispatchEvents(0);
		m_sys = getSystemModel("canvastest");
		modelRoot = (Ooaofooa) Package_c.getOneEP_PKGOnR1401(m_sys,
				new ClassQueryInterface_c() {

					@Override
					public boolean evaluate(Object candidate) {
						return ((Package_c) candidate).getName().equals(
								"canvastest");
					}
				}).getModelRoot();
	}
	public void testClearDatabase() {
		modelRoot.clearDatabase(new NullProgressMonitor());
		Ooaofgraphics ooaofgraphics = Ooaofgraphics.getInstance(modelRoot
				.getId());

		InstanceList list = null;

		list = ooaofgraphics.getInstanceList(Waypoint_c.class);
		assertTrue("The instances of Waypoint_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Textelement_c.class);
		assertTrue("The instances of Textelement_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics
				.getInstanceList(Simplesemanticmodelelement_c.class);
		assertTrue(
				"The instances of Simplesemanticmodelelement_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Semanticmodelbridge_c.class);
		assertTrue("The instances of Semanticmodelbridge_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Reference_c.class);
		assertTrue("The instances of Reference_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Property_c.class);
		assertTrue("The instances of Property_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Polyline_c.class);
		assertTrue("The instances of Polyline_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Point_c.class);
		assertTrue("The instances of Point_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(Leafelement_c.class);
		assertTrue("The instances of Leafelement_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Image_c.class);
		assertTrue("The instances of Image_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(Graphnode_c.class);
		assertTrue("The instances of Graphnode_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Graphicprimitive_c.class);
		assertTrue("The instances of Graphicprimitive_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Graphelement_c.class);
		assertTrue("The instances of Graphelement_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Graphedge_c.class);
		assertTrue("The instances of Graphedge_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Graphconnector_c.class);
		assertTrue("The instances of Graphconnector_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Ellipse_c.class);
		assertTrue("The instances of Ellipse_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(Element_c.class);
		assertTrue("The instances of Element_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(Diagramlink_c.class);
		assertTrue("The instances of Diagramlink_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Diagramelement_c.class);
		assertTrue("The instances of Diagramelement_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Diagram_c.class);
		assertTrue("The instances of Diagram_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(Coresemanticmodelbridge_c.class);
		assertTrue(
				"The instances of Coresemanticmodelbridge_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics
				.getInstanceList(NoncontainingShapeSpecification_c.class);
		assertTrue(
				"The instances of NoncontainingShapeSpecification_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics
				.getInstanceList(ContainingShapeSpecification_c.class);
		assertTrue(
				"The instances of ContainingShapeSpecification_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Linecolorstyle_c.class);
		assertTrue("The instances of Linecolorstyle_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Fontstyle_c.class);
		assertTrue("The instances of Fontstyle_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Fillcolorstyle_c.class);
		assertTrue("The instances of Fillcolorstyle_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Elementstyle_c.class);
		assertTrue("The instances of Elementstyle_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(WaypointInMove_c.class);
		assertTrue("The instances of WaypointInMove_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(TextInMove_c.class);
		assertTrue("The instances of TextInMove_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Shape_c.class);
		assertTrue("The instances of Shape_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(NoncontainingShape_c.class);
		assertTrue("The instances of NoncontainingShape_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Model_c.class);
		assertTrue("The instances of Model_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(LineSegment_c.class);
		assertTrue("The instances of LineSegment_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Layer_c.class);
		assertTrue("The instances of Layer_c are not cleared", list.isEmpty());
		list = ooaofgraphics.getInstanceList(Graphicalelementinlayer_c.class);
		assertTrue(
				"The instances of Graphicalelementinlayer_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(GraphicalElement_c.class);
		assertTrue("The instances of GraphicalElement_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(FloatingText_c.class);
		assertTrue("The instances of FloatingText_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ElementInSuppression_c.class);
		assertTrue("The instances of ElementInSuppression_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ElementInResize_c.class);
		assertTrue("The instances of ElementInResize_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ElementInMove_c.class);
		assertTrue("The instances of ElementInMove_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ContainingShape_c.class);
		assertTrue("The instances of ContainingShape_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(Connector_c.class);
		assertTrue("The instances of Connector_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(AnchorOnSegment_c.class);
		assertTrue("The instances of AnchorOnSegment_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ToolActivationPolicy_c.class);
		assertTrue("The instances of ToolActivationPolicy_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ShapeTool_c.class);
		assertTrue("The instances of ShapeTool_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(SelectionTool_c.class);
		assertTrue("The instances of SelectionTool_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ScrollTool_c.class);
		assertTrue("The instances of ScrollTool_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ModelTool_c.class);
		assertTrue("The instances of ModelTool_c are not cleared",
				list.isEmpty());
		list = ooaofgraphics.getInstanceList(ConnectorTool_c.class);
		assertTrue("The instances of ConnectorTool_c are not cleared",
				list.isEmpty());

	}
}