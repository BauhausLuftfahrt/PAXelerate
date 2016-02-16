/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui;

import org.eclipse.emf.ecp.spi.ui.util.ECPHandlerHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.intro.IIntroPart;
import org.eclipse.ui.part.IntroPart;


/**
 * PAXWelcome page which will be shown at the first start.
 * 
 * @author Michael Kagel, Michael Schmidt
 */
public class WelcomePage extends IntroPart implements IIntroPart {

	@Override
	public void createPartControl(Composite parent) {
		Composite outerContainer = new Composite(parent, SWT.NONE);
		outerContainer.setLayout(new GridLayout());
		
		Label newWelcomeLabel = new Label(outerContainer, SWT.NONE);
		newWelcomeLabel.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));
		newWelcomeLabel.setText("Welcome to PAXelerate - an open source passenger flow simulation framework for advanced aircraft cabin layouts!");

		Composite buttonContainer = new Composite(outerContainer, SWT.NONE);
		buttonContainer.setLayout(new GridLayout(2, true));
		buttonContainer.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));

		Button newProjectButton = new Button(buttonContainer, SWT.CENTER);
		newProjectButton.setText("New Project");
		newProjectButton.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));
		newProjectButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		newProjectButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				dispose();

				ECPHandlerHelper.createProject(PlatformUI.getWorkbench().getDisplay().getActiveShell());

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// do nothing
			}
		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void standbyStateChanged(boolean standby) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		super.dispose();
		this.getIntroSite().getWorkbenchWindow().getWorkbench().getIntroManager().closeIntro(this);
	}

}