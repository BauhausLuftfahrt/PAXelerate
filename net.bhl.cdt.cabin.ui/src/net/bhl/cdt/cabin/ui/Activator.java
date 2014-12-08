package net.bhl.cdt.cabin.ui;

import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "net.bhl.cdt.cabin.ui"; //$NON-NLS-1$

	private MessageConsole cabinConsole;
	private MessageConsoleStream cabinMessageStream;

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		cabinConsole = new MessageConsole("My Console", null);
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { cabinConsole });
		cabinMessageStream = cabinConsole.newMessageStream();
		Platform.addLogListener(new ILogListener() {

			@Override
			public void logging(IStatus status, String plugin) {
				if (status.getPlugin().equals(("net.bhl.cdt.model.cabin"))) {
					java.util.Date date = new java.util.Date();

					cabinMessageStream.println("[" + date.getTime() + "] Cabin " + ": " + status.getMessage());

				}

			}
		});
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public MessageConsoleStream getMessageConsoleStream() {
		return cabinMessageStream;
	}

	public MessageConsole getMessageConsole() {
		return cabinConsole;
	}

}