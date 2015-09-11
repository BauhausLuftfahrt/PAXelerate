package net.bhl.cdt.model.cabin.util;

import java.awt.Color;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

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
		INFORMATION, GET_STRING, GET_INTEGER, GET_VECTOR, WARNING, OPTIONS, GET_BOOLEAN, GET_TWO_VECTORS
	}

	private WindowType windowType;
	private String descriptionText;
	private String descriptionText2;
	private String descriptionText3;
	private String descriptionText4;
	private String titleString;
	private Text text;
	private Text text2;
	private Text text3;
	private Text text4;
	private String stringValue;
	private int integerValue;
	private Vector vectorValue;
	private Vector vectorValue2;
	private Boolean booleanValue;
	private Composite container;
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
			descriptionText3 = "width:";
			descriptionText4 = "height:";
			break;
		case GET_STRING:
			titleString = "Text Input Required!";
			descriptionText = "text:";
			break;

		case OPTIONS:
			titleString = "Please choose one of the following options!";
			descriptionText = "Options:";
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
			if (windowType == WindowType.GET_VECTOR) {
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

	private void createWarningLabel(Composite container) {
		warningLabel = new Label(container, SWT.NONE);
		warningLabel
				.setText("You entered a character that is not allowed here.");
		warningLabel.setVisible(false);
		warningLabel.setForeground(new org.eclipse.swt.graphics.Color(null,
				255, 0, 0));
	}

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
			integerValue = Integer.parseInt(text.getText());
			break;
		case OPTIONS:
			integerValue = Integer.parseInt(text.getText());
			break;
		case GET_STRING:
			stringValue = text.getText();
			break;
		case GET_VECTOR:
			((Vector2D) vectorValue).set(Integer.parseInt(text.getText()),
					Integer.parseInt(text2.getText()));
			break;
		case GET_TWO_VECTORS:
			((Vector2D) vectorValue).set(Integer.parseInt(text.getText()),
					Integer.parseInt(text2.getText()));
			((Vector2D) vectorValue2).set(Integer.parseInt(text3.getText()),
					Integer.parseInt(text4.getText()));
			break;
		case GET_BOOLEAN:
			booleanValue = true;
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
		case GET_INTEGER:
			if (text.getText() != "") {
				if (FuncLib.isNumeric(text.getText())) {
					return true;
				} else {
					warningLabel
							.setText("You entered a character that is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit.");
				warningLabel.setVisible(true);
				return false;
			}
		case OPTIONS:
			if (text.getText() != "") {
				if (FuncLib.isNumeric(text.getText())) {
					return true;
				} else {
					warningLabel
							.setText("You entered a character that is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_STRING:
			if (text.getText() != "") {
				return true;
			} else {
				warningLabel.setText("Please enter a string.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_VECTOR:
			if (text.getText() != "" && text2.getText() != "") {
				if (FuncLib.isNumeric(text.getText())
						&& FuncLib.isNumeric(text2.getText())) {
					return true;
				} else {
					warningLabel
							.setText("One of the two values is not a digit.");
					warningLabel.setVisible(true);
					return false;
				}
			} else {
				warningLabel.setText("Please enter a digit in every field.");
				warningLabel.setVisible(true);
				return false;
			}
		case GET_TWO_VECTORS:
			if (text.getText() != "" && text2.getText() != ""
					&& text3.getText() != "" && text4.getText() != "") {
				if (FuncLib.isNumeric(text.getText())
						&& FuncLib.isNumeric(text2.getText())
						&& FuncLib.isNumeric(text3.getText())
						&& FuncLib.isNumeric(text4.getText())) {
					return true;
				} else {
					warningLabel
							.setText("One of the two values is not a digit.");
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

	@Override
	protected void okPressed() {
		if (inputCheckOK()) {
			saveInput();
			super.okPressed();
		}
	}
}
