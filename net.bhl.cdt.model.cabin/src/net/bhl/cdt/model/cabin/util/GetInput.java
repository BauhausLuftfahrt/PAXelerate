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

	public enum WindowType {
		INFORMATION, GET_STRING, GET_INTEGER, WARNING, OPTIONS
	}

	private WindowType windowType;
	private String descriptionText;
	private Text text;
	private String stringValue = null;
	private int integerValue = 0;

	/**
	 * This method generates the input dialog.
	 * 
	 * @param windowType
	 *            is the type of the dialog. USE WindowType.(...)
	 * @param title
	 *            is the title of the dialog
	 * @param message
	 *            is the message of the dialog
	 * @param descriptionText
	 *            is the description text of the dialog
	 * @param messageType
	 *            is the message type. USE IMessageProvider.(...)
	 */
	public GetInput(WindowType windowType, String message, String descriptionText,
			int messageType) {
		super(null);
		this.windowType = windowType;
		this.descriptionText = descriptionText;
		super.create();
		switch (windowType) {
		case GET_INTEGER:
			setTitle("Integer Input Required!");
			break;
		case GET_STRING:
			setTitle("Text Input Required!");
			break;
		default:
			setTitle("empty title ...");
			break;
		}
		setMessage(message, messageType);
		this.open();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout layout = new GridLayout(1, false);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		container.setLayout(layout);

		switch (windowType) {
		case GET_INTEGER:
			createIntegerField(container);
			break;
		case GET_STRING:
			createTextField(container);
			break;
		default:

			break;
		}
		return area;
	}

	private void createIntegerField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText);

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(gridData);
	}

	private void createTextField(Composite container) {
		Label label = new Label(container, SWT.NONE);
		label.setText(descriptionText);

		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		text = new Text(container, SWT.BORDER);
		text.setLayoutData(gridData);
	}

	@Override
	protected boolean isResizable() {
		return false;
	}

	// save content of the Text fields because they get disposed
	// as soon as the Dialog closes
	private void saveInput() {
		String validateString = text.getText();
		switch (windowType) {
		case GET_INTEGER:
			integerValue = Integer.parseInt(InputChecker
					.checkIntegersOnly(validateString));
			break;
		case GET_STRING:
			stringValue = validateString;
			break;
		default:

			break;
		}
	}

	public int getIntegerValue() {
		return integerValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}
}
