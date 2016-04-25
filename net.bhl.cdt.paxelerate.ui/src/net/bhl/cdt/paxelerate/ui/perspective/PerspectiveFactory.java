/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.perspective;

import org.eclipse.emf.ecp.ui.views.ModelExplorerView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

/**
 * A factory for creating Perspective objects.
 *
 * @author raoul.rothfeld, Michael Schmidt
 */
public class PerspectiveFactory implements IPerspectiveFactory {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	@Override
	public void createInitialLayout(IPageLayout layout) {

		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, layout.getEditorArea());
		topLeft.addView(ModelExplorerView.ID);

		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.5f, "topLeft");
		bottomLeft.addView("net.bhl.cdt.paxelerate.ui.propertyview");
		;

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.7f, layout.getEditorArea());
		right.addView("net.bhl.cdt.paxelerate.ui.views.cabinview");

		// TODO: is it possible to freeze the aspect ratio here?

		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.70f, layout.getEditorArea());
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
	}

}
