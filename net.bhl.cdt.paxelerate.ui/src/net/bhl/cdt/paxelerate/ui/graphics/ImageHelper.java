/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.graphics;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * The Class ImageHelper.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
public class ImageHelper {

	/**
	 * This method resizes an image.
	 *
	 * @param image
	 *            the image
	 * @param width
	 *            the desired width
	 * @param height
	 *            the desired height
	 * @param parent
	 *            the parent
	 * @return the scaled image
	 */
	public static Image resize(final Image image, final int width, final int height, final Composite parent) {

		if (width == 0 || height == 0) {
			return image;
		}

		Image scaledImage = new Image(parent.getDisplay(), width, height);

		GC gc = new GC(scaledImage);

		gc = SWTHelper.getQualitySettings(gc);

		gc.drawImage(image, 0, 0, image.getBounds().width, image.getBounds().height, 0, 0, width, height);
		gc.dispose();
		return scaledImage;
	}

}
