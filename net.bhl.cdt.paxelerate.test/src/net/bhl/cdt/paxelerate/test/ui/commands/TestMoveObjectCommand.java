/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.test.ui.commands;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.EmergencyExit;
import net.bhl.cdt.paxelerate.model.MainDoor;
import net.bhl.cdt.paxelerate.model.ObjectOption;
import net.bhl.cdt.paxelerate.model.StandardDoor;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.model.util.CabinGenerator;

/**
 * Test class for MoveObjectCommand.java imported from
 * net.bhl.cdt.paxelerate.ui.commands
 * 
 * @author michael.schmidt
 */

public class TestMoveObjectCommand {

	private static Cabin cabin;
	private static CabinGenerator constructor;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		cabin.setYDimension(364);
		cabin.setXDimension(2460);

		/* ------- Cabin Construction starts here! --------- */
		constructor = new CabinGenerator(cabin);
		// constructor.clearCabin();
		constructor.createDoor(EmergencyExit.class, true, 3, 935);
		constructor.createDoor(EmergencyExit.class, true, 4, 1228);
		constructor.createPhysicalObject(ObjectOption.LAVATORY, 100);
		constructor.createDoor(MainDoor.class, true, 1, -1);
		constructor.createPhysicalObject(ObjectOption.GALLEY, 100);

		/*
		 * Note that the classes are generated in the order that they are
		 * defined in in the enum
		 */
		for (TravelOption option : TravelOption.VALUES) {
			constructor.createClass(option);
		}

		constructor.createPhysicalObject(ObjectOption.GALLEY, 100);
		constructor.createDoor(StandardDoor.class, true, 2, -1);
		constructor.createPhysicalObject(ObjectOption.LAVATORY, 100);
		cabin = constructor.getCabin();
		// cabin.setUsePresetSettings(false);
		/* ------- Cabin Construction ends here! ----------- */
	}

	@Test
	public void modXCoordinate() {
		fail("Not yet implemented");
	}

}
