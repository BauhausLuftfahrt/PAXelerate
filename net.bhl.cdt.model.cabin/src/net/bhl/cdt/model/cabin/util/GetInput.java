package net.bhl.cdt.model.cabin.util;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
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
		INFORMATION, GET_STRING, GET_INTEGER, GET_VECTOR, WARNING, OPTIONS
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
		stringValue = "";
		switch (windowType) {
		case GET_INTEGER:
			titleString = "Integer Input Required!";
			descriptionText = "Input the value here:";
			break;
		case GET_VECTOR:
			titleString = "Vector Input Required!";
			descriptionText = "Input the x value here:";
			descriptionText2 = "Input the y value here:";
			break;
		case GET_STRING:
			titleString = "Text Input Required!";
			descriptionText = "Input the text here:";
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
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(2, false);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);
		createInputField(container);
		if (windowType == WindowType.GET_VECTOR) {
			createAnotherInputField(container);
		}
		return area;
	}

	private void createInputField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text = new Text(container, SWT.BORDER);
		text.setLayoutData(gridData);
	}

	private void createAnotherInputField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText2);
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text2 = new Text(container, SWT.BORDER);
		text2.setLayoutData(gridData);
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
		String validateString = text.getText();
		String validateString2 = text2.getText();

		switch (windowType) {
		case GET_INTEGER:
			integerValue = Integer.parseInt(InputChecker
					.checkIntegersOnly(validateString));
			break;
		case GET_STRING:
			stringValue = validateString;
			break;
		case GET_VECTOR:
			int xValue = 0;
			int yValue = 0;
			try {
				xValue = Integer.parseInt(validateString);
			} catch (NumberFormatException e) {
				xValue = 0;
			}
			try {
				yValue = Integer.parseInt(validateString2);
			} catch (NumberFormatException e) {
				yValue = 0;
			}
			vectorValue.setTwoDimensional(xValue, yValue);
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
	 * This method returns the stored integer value.
	 * 
	 * @return the integer value
	 */
	public int getIntegerValue() {
		return integerValue;
	}

	/**
	 * This method returns the stored string value.
	 * 
	 * @return the string value
	 */
	public String getStringValue() {
		return stringValue;
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}
}
