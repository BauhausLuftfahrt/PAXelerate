/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.perspective;

import org.eclipse.emf.ecp.ui.views.ModelExplorerView;
import org.eclipse.emf.ecp.ui.views.ModelRepositoriesView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;


/**
 * 
 * @author raoul.rothfeld
 *
 */
public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.25f, layout.getEditorArea());
		left.addView(ModelExplorerView.ID);

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.70f, layout.getEditorArea());
		right.addView("net.bhl.cdt.paxelerate.ui.views.cabinview");
		right.addView(ModelRepositoriesView.ID);
		

		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.70f, layout.getEditorArea());
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
	}

}
