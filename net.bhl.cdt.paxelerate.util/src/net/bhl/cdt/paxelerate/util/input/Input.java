/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.input;

import java.util.Objects;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.string.StringHelper;

/**
 * This class generates a dialog which can get various parameters or give output
 * to the user. You decide.
 * 
 * @author marc.engelmann
 *
 */
public class Input extends TitleAreaDialog {

	/**
	 * This class defines the different input dialog types.
	 * 
	 * @author marc.engelmann
	 *
	 */
	public enum WindowType {
		/**
		 * Access the different types using WindowType.CHOOSE_TYPE.
		 */
		INFORMATION, 
 /** The get string. */
 GET_STRING, 
 /** The get integer. */
 GET_INTEGER, 
 /** The get vector. */
 GET_VECTOR, 
 /** The warning. */
 WARNING, 
 /** The options. */
 OPTIONS, 
 /** The get boolean. */
 GET_BOOLEAN, 
 /** The get two vectors. */
 GET_TWO_VECTORS, 
 /** The clone object. */
 CLONE_OBJECT, 
 /** The move object. */
 MOVE_OBJECT
	}

	/** The window type. */
	private WindowType windowType;
	
	/** The string value. */
	private String descriptionText, descriptionText2, descriptionText3, descriptionText4, titleString, stringValue;
	
	/** The text4. */
	private Text text, text2, text3, text4;
	
	/** The integer value. */
	private int integerValue;
	
	/** The vector value2. */
	private Vector vectorValue, vectorValue2;
	
	/** The boolean value. */
	private Boolean booleanValue;
	
	/** The container. */
	private Composite container;
	
	/** The warning label. */
	private Label warningLabel;

	/**
	 * This method generates the input dialog.
	 * 
	 * @param windowType
	 *            is the type of the dialog. USE WindowType.(...)
	 * @param message
	 *            is the message of the dialog
	 * @param messageType
	 *            is the message type. USE IMessageProvider.(...)
	 */
	public Input(WindowType windowType, String message, int messageType) {
		super(null);

		integerValue = 0;
		vectorValue = new Vector2D(0, 0);
		vectorValue2 = new Vector2D(0, 0);
		booleanValue = false;
		stringValue = "";

		switch (windowType) {
		case GET_INTEGER:
			titleString = "Integer Input Required!";
			descriptionText = "value:";
			break;
		case GET_BOOLEAN:
			titleString = "Please confirm the following task!";
			descriptionText = "this should actually not be seen!";
			break;
		case GET_VECTOR:
			titleString = "Vector Input Required!";
			descriptionText = "X dimension:";
			descriptionText2 = "Y dimension:";
			break;
		case GET_TWO_VECTORS:
			titleString = "Vector Input Required!";
			descriptionText = "X position:";
			descriptionText2 = "Y position:";
			descriptionText3 = "X dimension:";
			descriptionText4 = "Y dimension:";
			break;
		case GET_STRING:
			titleString = "Text Input Required!";
			descriptionText = "text:";
			break;
		case OPTIONS:
			titleString = "Please choose one of the following options!";
			descriptionText = "Options:";
			break;

		case CLONE_OBJECT:
			titleString = "Duplicate rows";
			descriptionText = "Number of rows";
			break;
		case MOVE_OBJECT:
			titleString = "Move object";
			descriptionText = "X displacement:";
			descriptionText2 = "Y displacement:";
			break;

		default:
			titleString = "empty title ...";
			descriptionText = "empty description";
			break;
		}
		this.windowType = windowType;
		super.create();
		setMessage(message, messageType);
		setTitle(titleString);
		this.open();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 10;
		layout.verticalSpacing = 10;
		layout.marginHeight = 10;
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);
		if (windowType != WindowType.GET_BOOLEAN) {
			createInputField(container);
			if (windowType == WindowType.GET_VECTOR || windowType == WindowType.MOVE_OBJECT) {
				createAnotherInputField(container);
			}
			if (windowType == WindowType.GET_TWO_VECTORS) {
				createAnotherInputField(container);
				createThirdInputField(container);
				createFourthInputField(container);
			}
		}

		createWarningLabel(container);
		return area;
	}

	/**
	 * Creates the input field.
	 *
	 * @param container the container
	 */
	private void createInputField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text = new Text(container, SWT.BORDER);
		text.setText("0");
		text.setLayoutData(gridData);

	}

	/**
	 * Creates the another input field.
	 *
	 * @param container the container
	 */
	private void createAnotherInputField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText2);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text2 = new Text(container, SWT.BORDER);
		text2.setText("0");
		text2.setLayoutData(gridData);
	}

	/**
	 * Creates the third input field.
	 *
	 * @param container the container
	 */
	private void createThirdInputField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText3);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text3 = new Text(container, SWT.BORDER);
		text3.setText("0");
		text3.setLayoutData(gridData);
	}

	/**
	 * Creates the fourth input field.
	 *
	 * @param container the container
	 */
	private void createFourthInputField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText4);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text4 = new Text(container, SWT.BORDER);
		text4.setText("0");
		text4.setLayoutData(gridData);
	}

	/**
	 * Creates the warning label.
	 *
	 * @param container the container
	 */
	private void createWarningLabel(Composite container) {
		warningLabel = new Label(container, SWT.NONE);
		warningLabel.setText("You entered a character that is not allowed here.");
		warningLabel.setVisible(false);
		// TODO util should not set UI
		warningLabel.setForeground(new org.eclipse.swt.graphics.Color(null, 255, 0, 0));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#getInitialSize()
	 */
	@Override
	protected Point getInitialSize() {
		switch (windowType) {
		case GET_BOOLEAN:
			return new Point(450, 150);
		case GET_TWO_VECTORS:
			return new Point(450, 350);
		default:
			return new Point(450, 250);
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#isResizable()
	 */
	@Override
	protected boolean isResizable() {
		return false;
	}

	/**
	 * save content of the Text fields because they get disposed as soon as the
	 * Dialog closes.
	 */
	private void saveInput() {
		switch (windowType) {
		case GET_INTEGER:
		case OPTIONS:
		case CLONE_OBJECT:
			integerValue = Integer.parseInt(text.getText());
			break;
		case GET_STRING:
			stringValue = text.getText();
			break;
		case GET_VECTOR:
		case MOVE_OBJECT:
			vectorValue = new Vector2D(Integer.parseInt(text.getText()), Integer.parseInt(text2.getText()));
			break;
		case GET_TWO_VECTORS:
			vectorValue = new Vector2D(Integer.parseInt(text.getText()), Integer.parseInt(text2.getText()));
			vectorValue2 = new Vector2D(Integer.parseInt(text3.getText()), Integer.parseInt(text4.getText()));
			break;
		case GET_BOOLEAN:
			booleanValue = true;
			break;
		default:
			break;
		}
	}

	/**
	 * This method returns the stored vector.
	 * 
	 * @return the vector
	 */
	public Vector getVectorValue() {
		return vectorValue;
	}

	/**
	 * This method returns the stored vector.
	 * 
	 * @return the vector
	 */
	public Vector getSecondVectorValue() {
		return vectorValue2;
	}

	/**
	 * This method returns the stored integer value.
	 * 
	 * @return the integer value
	 */
	public int getIntegerValue() {
		return integerValue;
	}

	/**
	 * Gets the boolean value.
	 *
	 * @return the boolean value
	 */
	public boolean getBooleanValue() {
		return booleanValue;
	}

	/**
	 * This method returns the stored string value.
	 * 
	 * @return the string value
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * This method checks if the input is ok.
	 * 
	 * @return returns if input is ok
	 */
	public boolean inputCheckOK() {
		switch (windowType) {
		case CLONE_OBJECT:
		case GET_INTEGER:
			if (text.getText() != null && !text.getText().isEmpty()){
				if (StringHelper.isInteger(text.getText())) {
					return true;
				} else {
					warningLabel.setText("You entered a character that is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit.");
				warningLabel.setVisible(true);
				return false;
			}
		case OPTIONS:
			if (text.getText() != null && !text.getText().isEmpty()){
				if (StringHelper.isInteger(text.getText())) {
					return true;
				} else {
					warningLabel.setText("You entered a character that is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_STRING:
			if (text.getText() != null && !text.getText().isEmpty()){
				return true;
			} else {
				warningLabel.setText("Please enter a string.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_VECTOR:
		case MOVE_OBJECT:
			if ((text.getText() != null && !text.getText().isEmpty()) 
					&& (text2.getText() != null && !text2.getText().isEmpty())) {
				if (StringHelper.isInteger(text.getText()) && StringHelper.isInteger(text2.getText())) {
					return true;
				} else {
					warningLabel.setText("One of the two values is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit in every field.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_TWO_VECTORS:
			if ((text.getText() != null && !text.getText().isEmpty()) 
					&& (text2.getText() != null && !text2.getText().isEmpty()) 
					&& (text3.getText() != null && !text3.getText().isEmpty())
					&& (text4.getText() != null && !text4.getText().isEmpty())){
					if (StringHelper.isInteger(text.getText()) && StringHelper.isInteger(text2.getText())
						&& StringHelper.isInteger(text3.getText()) && StringHelper.isInteger(text4.getText())) {
					return true;
				} else {
					warningLabel.setText("One of the two values is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit in every field.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_BOOLEAN:
			return true;
		default:
			return true;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		if (inputCheckOK()) {
			saveInput();
			super.okPressed();
		}
	}
}
