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
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Spinner;
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
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = true;
		rowLayout.center = true;
		rowLayout.type = SWT.VERTICAL;
		rowLayout.marginBottom = rowLayout.marginLeft = rowLayout.marginRight = rowLayout.marginTop = 10;
		outerContainer.setLayout(rowLayout);
		
		// Welcome message
		Label newWelcomeLabel = new Label(outerContainer, SWT.NONE);
		newWelcomeLabel.setLayoutData(new RowData(800,50));
		newWelcomeLabel.setText("Welcome to PAXelerate - an open source passenger flow simulation framework for advanced aircraft cabin layouts!");
		
	    // ExpandBar
		ExpandBar bar = new ExpandBar (outerContainer, SWT.V_SCROLL);
		
		// First item
		//Composite composite = new Composite (bar, SWT.NONE);
		//composite.setLayoutData(new RowData(800,50));
		
		Composite composite = new Composite (bar, SWT.NONE);
		GridLayout layout = new GridLayout ();
		layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
		layout.verticalSpacing = 10;
		composite.setLayout(layout);
		
		Label label0 = new Label (composite, SWT.NONE);
		label0 = new Label (composite, SWT.NONE);
		label0.setText("To get started, create a new project and select EMF Store as a provider. ");
		
		Button newProjectButton = new Button(composite, SWT.PUSH);
		newProjectButton.setText("New Project");
		newProjectButton.setLayoutData(new GridData());
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
		
		ExpandItem item0 = new ExpandItem (bar, SWT.NONE, 0);
		item0.setText("New Project");
		item0.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		item0.setControl(composite);
		item0.setExpanded(true);
		//item0.setImage(image);
			
		// Second item
		
		composite = new Composite (bar, SWT.NONE);
		layout = new GridLayout ();
		layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 10;
		layout.verticalSpacing = 10;
		composite.setLayout(layout);
		
		//composite = new Composite (bar, SWT.NONE);
		//composite.setLayoutData(new RowData(800,50));
		
		ExpandItem item1 = new ExpandItem (bar, SWT.NONE, 1);
		item1.setText("Tutorial");
		item1.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		item1.setControl(composite);
		// item1.setImage(image);
		
	
		item1.setExpanded(true);
		bar.setSpacing(8);
	
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
