/*******************************************************************************
 * Copyright (c) 2011 Google, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Google, Inc. - initial API and implementation
 *******************************************************************************/

package net.bhl.cdt.paxelerate.ui.graphics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

/**
 * The Class ImageImporter.
 *
 * @author Google Inc.W
 */
public class ImageImporter {

	/**
	 * Protect constructor since it is a static only class.
	 */
	protected ImageImporter() {
	}

	/**
	 * Maps image paths to images.
	 */
	private static Map<String, Image> m_imageMap = new HashMap<String, Image>();

	/**
	 * Returns an {@link Image} encoded by the specified {@link InputStream}.
	 *
	 * @param stream            the {@link InputStream} encoding the image data
	 * @return the {@link Image} encoded by the specified input stream
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected static Image getImage(InputStream stream) throws IOException {
		try {
			Display display = Display.getCurrent();
			ImageData data = new ImageData(stream);
			if (data.transparentPixel > 0) {
				return new Image(display, data, data.getTransparencyMask());
			}
			return new Image(display, data);
		} finally {
			stream.close();
		}
	}

	/**
	 * Returns an {@link Image} stored in the file at the specified path.
	 * 
	 * @param path
	 *            the path to the image file
	 * @return the {@link Image} stored in the file at the specified path
	 */
	public static Image getImage(String path) {
		Image image = m_imageMap.get(path);
		if (image == null) {
			try {
				image = getImage(new FileInputStream(path));
				m_imageMap.put(path, image);
			} catch (Exception e) {
				image = getMissingImage();
				m_imageMap.put(path, image);
			}
		}
		return image;
	}

	/**
	 * Returns an {@link Image} stored in the file at the specified path
	 * relative to the specified class.
	 * 
	 * @param clazz
	 *            the {@link Class} relative to which to find the image
	 * @param path
	 *            the path to the image file, if starts with <code>'/'</code>
	 * @return the {@link Image} stored in the file at the specified path
	 */
	public static Image getImage(Class<?> clazz, String path) {
		String key = clazz.getName() + '|' + path;
		Image image = m_imageMap.get(key);
		if (image == null) {
			try {
				image = getImage(clazz.getResourceAsStream(path));
				m_imageMap.put(key, image);
			} catch (Exception e) {
				image = getMissingImage();
				m_imageMap.put(key, image);
			}
		}
		return image;
	}

	/**
	 * Standard size for missing {@link Image}'s.
	 */
	private static final int MISSING_IMAGE_SIZE = 10;

	/**
	 * Gets the missing image.
	 *
	 * @return the small {@link Image} that can be used as placeholder for
	 *         missing image.
	 */

	private static Image getMissingImage() {
		Image image = new Image(Display.getCurrent(), MISSING_IMAGE_SIZE, MISSING_IMAGE_SIZE);
		GC gc = new GC(image);
		gc.setBackground(ColorHelper.ERROR);
		gc.fillRectangle(0, 0, MISSING_IMAGE_SIZE, MISSING_IMAGE_SIZE);
		gc.dispose();

		return image;
	}

	/**
	 * Dispose all of the cached {@link Image}'s.
	 */
	public static void disposeImages() {
		for (Image image : m_imageMap.values())
			image.dispose();
		m_imageMap.clear();
	}

}
