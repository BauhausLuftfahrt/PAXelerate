package net.bhl.cdt.paxelerate.ui.image;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

import net.bhl.cdt.paxelerate.ui.graphics.SWTHelper;

/**
 * 
 * @author marc.engelmann
 *
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
	 * @return the scaled image
	 */
	public static Image resize(Image image, int width, int height, Composite parent) {

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
