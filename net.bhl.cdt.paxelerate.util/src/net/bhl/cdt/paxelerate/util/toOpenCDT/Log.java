/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.toOpenCDT;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;


/**
 * Class to simplify logging program events
 * 
 * @author marc.engelmann, raoul.rothfeld
 * @version 1.0
 * @since 0.5
 */
public final class Log {

	/**
	 * Enforce static use.
	 */
	private Log() {
	}

	/**
	 * Adds a log entry to the overall program log.
	 *
	 * @param obj
	 *            the object from which the log event is called
	 * @param logEntry
	 *            the message to be recorded in the log
	 */
	public static void add(Object obj, String logEntry) {
		Log.add(FrameworkUtil.getBundle(obj.getClass()), logEntry);
	}

	/**
	 * Adds a log entry to the overall program log.
	 *
	 * @param bundle
	 *            the bundle from which a log event is called
	 * @param logEntry
	 *            the message to be recorded in the log
	 */
	public static void add(Bundle bundle, String logEntry) {
		Log.add(bundle.getSymbolicName().toString(), logEntry);
	}

	/**
	 * Adds a log entry to the overall program log.
	 *
	 * @param bundleName
	 *            the name of the superior bundle from which a log event is
	 *            called
	 * @param logEntry
	 *            the message to be recorded in the log
	 */
	public static void add(String bundleName, String logEntry) {
		ILog bundleLog = Platform.getLog(Platform.getBundle(bundleName));
		bundleLog.log(new Status(IStatus.INFO, bundleName, logEntry));
	}
}