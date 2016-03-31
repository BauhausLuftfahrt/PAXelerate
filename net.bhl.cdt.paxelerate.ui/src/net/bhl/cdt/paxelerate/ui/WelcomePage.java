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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
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
		GridLayout gridLayout = new GridLayout();
		gridLayout.marginLeft = gridLayout.marginTop = gridLayout.marginRight = gridLayout.marginBottom = 10;
		gridLayout.verticalSpacing = 10;
		outerContainer.setLayout(gridLayout);
			
		// Welcome message
		Label newWelcomeLabel = new Label(outerContainer, SWT.NONE);
		GridData gridData = new GridData(SWT.CENTER, SWT.TOP, true, false);
		newWelcomeLabel.setLayoutData(gridData);
		newWelcomeLabel.setText("Welcome to PAXelerate - an open source passenger flow simulation framework "
				+ "for advanced aircraft cabin layouts!");
		
		// Group #1
		Group group1 = new Group(outerContainer, SWT.NONE);
	    group1.setText("New Project");
	    gridData = new GridData(SWT.CENTER, SWT.TOP, true, false);
	    group1.setLayoutData(gridData);
	    
		Label label1 = new Label (group1, SWT.NONE);
		label1.setText("To get started, create a new project and select EMF Store as a provider. ");
		label1.setLocation(10,20);
		label1.pack();
		
		Button newProjectButton = new Button(group1, SWT.PUSH);
		newProjectButton.setText("New Project");
		newProjectButton.setLayoutData(gridData);
		newProjectButton.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		newProjectButton.setLocation(150,40);
		
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
		newProjectButton.pack();
		group1.pack();
		
		
		// Group #2
		Group group2 = new Group(outerContainer, SWT.NONE);
	    group2.setText("First encounter with PAXelerate");
	    gridData = new GridData(SWT.CENTER, SWT.TOP, true, false);
	    group2.setLayoutData(gridData);
	    
	    Label label2 = new Label (group2, SWT.NONE);
		label2.setText("1. Add a new Cabin model element with a right click on the aircraft project folder.");
		label2.setLocation(20,20);
		label2.pack();
		label2 = new Label (group2, SWT.NONE);
		label2.setText("2 Use the Generate New Cabin function to create a first layout.");
		label2.setLocation(20,40);
		label2.pack();
		label2 = new Label (group2, SWT.NONE);
		label2.setText("3. Add passenger with Generate Passengers");
		label2.setLocation(20,60);
		label2.pack();
		label2 = new Label (group2, SWT.NONE);
		label2.setText("4. And finally start the boarding simulation");
		label2.setLocation(20,80);
		label2.pack();
		label2 = new Label (group2, SWT.NONE);
		label2.setText("A more detailed tutorial is provided on the PAXelerate website");
		label2.setLocation(10,100);
		label2.pack();
		group2.pack();			
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
