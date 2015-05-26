/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

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
