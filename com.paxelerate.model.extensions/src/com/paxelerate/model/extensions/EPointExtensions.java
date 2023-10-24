/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.ModelFactory;

import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.vector.DoubleVector;
import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface EPointExtensions {

	/**
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	static EPoint create(double x, double y) {
		EPoint point = ModelFactory.eINSTANCE.createEPoint();
		point.setX(x);
		point.setY(y);
		point.setZ(0);
		return point;
	}

	/**
	 *
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	static EPoint create(double x, double y, double z) {
		EPoint point = ModelFactory.eINSTANCE.createEPoint();
		point.setX(x);
		point.setY(y);
		point.setZ(z);
		return point;
	}

	/**
	 *
	 * @param point
	 * @return
	 */
	static DoubleVector transform(EPoint point) {
		return new DoubleVector(point.getX(), point.getY(), point.getZ());
	}

	/**
	 *
	 * @param vector
	 * @return
	 */
	static EPoint transform(DoubleVector vector) {
		EPoint point = ModelFactory.eINSTANCE.createEPoint();

		point.setX(vector.getX());
		point.setY(vector.getY());
		if (vector.getZ() == null) {
			point.setZ(0);
		} else {
			point.setZ(vector.getZ());
		}

		return point;
	}

	/**
	 * @param intVector
	 * @return
	 */
	static EPoint transformIntVector(IntVector intVector) {
		EPoint point = ModelFactory.eINSTANCE.createEPoint();

		point.setX(intVector.getX());
		point.setY(intVector.getY());
		point.setZ(0);

		return point;
	}

	/**
	 * @param intVector
	 * @return
	 */
	static IntVector transformIntVector(EPoint point) {
		return new IntVector(BHLMath.toInt(point.getX()), BHLMath.toInt(point.getY()));
	}
}
