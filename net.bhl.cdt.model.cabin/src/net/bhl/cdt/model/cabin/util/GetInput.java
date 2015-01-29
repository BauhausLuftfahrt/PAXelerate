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
public class GetInput extends TitleAreaDialog {

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
		INFORMATION, GET_STRING, GET_INTEGER, GET_VECTOR, WARNING, OPTIONS, GET_BOOLEAN
	}

	private WindowType windowType;
	private String descriptionText;
	private String descriptionText2;
	private String titleString;
	private Text text;
	private Text text2;
	private String stringValue;
	private int integerValue;
	private Vector vectorValue;
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
	public GetInput(WindowType windowType, String message, int messageType) {
		super(null);
		integerValue = 0;
		vectorValue = new Vector(0, 0);
		booleanValue = false;
		stringValue = "";
		switch (windowType) {
		case GET_INTEGER:
			titleString = "Integer Input Required!";
			descriptionText = "value:";
			break;
		case GET_BOOLEAN:
			titleString = "Boolean Input Required!";
			descriptionText = "this should actually not be seen!";
			break;
		case GET_VECTOR:
			titleString = "Vector Input Required!";
			descriptionText = "X dimension:";
			descriptionText2 = "Y dimension:";
			break;
		case GET_STRING:
			titleString = "Text Input Required!";
			descriptionText = "text:";
			break;
		default:
			titleString = "empty title ...";
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
		return new Point(450, 250);
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
		case GET_STRING:
			stringValue = text.getText();
			break;
		case GET_VECTOR:
			vectorValue.setTwoDimensional(Integer.parseInt(text.getText()),
					Integer.parseInt(text2.getText()));
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
				if (FunctionLibrary.isNumeric(text.getText())) {
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
				if (FunctionLibrary.isNumeric(text.getText())
						&& FunctionLibrary.isNumeric(text2.getText())) {
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
