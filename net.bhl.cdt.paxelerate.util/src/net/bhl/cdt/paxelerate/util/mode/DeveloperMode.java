/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.util.mode;

/**
 * Class to broadcast whether the program is in developer mode (additional
 * logging) or not.
 * 
 * @author raoul.rothfeld
 *
 */
public class DeveloperMode {
	
	/**
	 * Protect constructor since it is a static only class
	 */
	protected DeveloperMode() {
	}
	
	public static final boolean ACTIVE = true;
	
}
