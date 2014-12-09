package net.bhl.cdt.model.astar;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Logger {
	/**
	 * This method adds a string to the log.
	 * 
	 * @param s
	 *            is the string which is submitted to the log
	 */
	public void addToLog(String s) {
		ILog logger = Platform.getLog(Platform
				.getBundle("net.bhl.cdt.model.cabin"));
		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin", s));
	}
}
