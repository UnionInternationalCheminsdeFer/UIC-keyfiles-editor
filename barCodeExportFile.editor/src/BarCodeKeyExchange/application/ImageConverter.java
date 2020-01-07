package BarCodeKeyExchange.application;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;

import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;


public class ImageConverter {
	
    /**
     * Converts a given Image into a BufferedImage
     *
     * @param img The Image to be converted
     * @return The converted BufferedImage
     */
    public static BufferedImage toBufferedImage(Image img)
    {
        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }
    
    static BufferedImage convertToAWT(ImageData data) {
    	ColorModel colorModel = null;
    	PaletteData palette = data.palette;
    	if (palette.isDirect) {
    		colorModel = new DirectColorModel(data.depth, palette.redMask, palette.greenMask, palette.blueMask);
    		BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
    		for (int y = 0; y < data.height; y++) {
    			for (int x = 0; x < data.width; x++) {
    				int pixel = data.getPixel(x, y);
    				RGB rgb = palette.getRGB(pixel);
    				bufferedImage.setRGB(x, y,  rgb.red << 16 | rgb.green << 8 | rgb.blue);
    			}
    		}
    		return bufferedImage;
    	} else {
    		RGB[] rgbs = palette.getRGBs();
    		byte[] red = new byte[rgbs.length];
    		byte[] green = new byte[rgbs.length];
    		byte[] blue = new byte[rgbs.length];
    		for (int i = 0; i < rgbs.length; i++) {
    			RGB rgb = rgbs[i];
    			red[i] = (byte)rgb.red;
    			green[i] = (byte)rgb.green;
    			blue[i] = (byte)rgb.blue;
    		}
    		if (data.transparentPixel != -1) {
    			colorModel = new IndexColorModel(data.depth, rgbs.length, red, green, blue, data.transparentPixel);
    		} else {
    			colorModel = new IndexColorModel(data.depth, rgbs.length, red, green, blue);
    		}
    		BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
    		WritableRaster raster = bufferedImage.getRaster();
    		int[] pixelArray = new int[1];
    		for (int y = 0; y < data.height; y++) {
    			for (int x = 0; x < data.width; x++) {
    				int pixel = data.getPixel(x, y);
    				pixelArray[0] = pixel;
    				raster.setPixel(x, y, pixelArray);
    			}
    		}
    		return bufferedImage;
    	}
    }    

}
