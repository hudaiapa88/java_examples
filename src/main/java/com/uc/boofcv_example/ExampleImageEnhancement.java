package com.uc.boofcv_example;

import boofcv.alg.enhance.EnhanceImageOps;
import boofcv.alg.enhance.GEnhanceImageOps;
import boofcv.alg.misc.ImageStatistics;
import boofcv.gui.ListDisplayPanel;
import boofcv.gui.image.ShowImages;
import boofcv.io.UtilIO;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.io.image.UtilImageIO;
import boofcv.struct.image.GrayU8;
import boofcv.struct.image.ImageType;
import boofcv.struct.image.Planar;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public class ExampleImageEnhancement {
    static String imagePath = "D:/erbakir-ml/newImage/savedImage/qr8.png";
//	static String imagePath = "enhance/dull.jpg";

    static ListDisplayPanel mainPanel = new ListDisplayPanel();

    /**
     * Histogram adjustment algorithms aim to spread out pixel intensity values uniformly across the allowed range.
     * This if an image is dark, it will have greater contrast and be brighter.
     */
    public static void histogram() throws IOException {
        BufferedImage buffered = ImageIO.read(Path.of(imagePath).toUri().toURL());
        GrayU8 gray = ConvertBufferedImage.convertFrom(buffered, (GrayU8)null);
        GrayU8 adjusted = gray.createSameShape();

        int[] histogram = new int[256];
        int[] transform = new int[256];

        ListDisplayPanel panel = new ListDisplayPanel();

        ImageStatistics.histogram(gray, 0, histogram);
        EnhanceImageOps.equalize(histogram, transform);
        EnhanceImageOps.applyTransform(gray, transform, adjusted);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null), "Global");

        EnhanceImageOps.equalizeLocal(gray, 50, adjusted, 256, null);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null), "Local");

        panel.addImage(ConvertBufferedImage.convertTo(gray, null), "Original");

        panel.setPreferredSize(new Dimension(gray.width, gray.height));
        mainPanel.addItem(panel, "Histogram");
    }

    /**
     * Same as above but on a color image.
     */
    public static void histogramColor() throws IOException {
        BufferedImage buffered = ImageIO.read(Path.of(imagePath).toUri().toURL());
        Planar<GrayU8> color = ConvertBufferedImage.convertFrom(buffered, true, ImageType.PL_U8);
        Planar<GrayU8> adjusted = color.createSameShape();

        int[] histogram = new int[256];
        int[] transform = new int[256];

        ListDisplayPanel panel = new ListDisplayPanel();

        // Apply the correction to each color band independently. Alternatively, you could compute the adjustment
        // on a gray scale image then apply the same transform to each band
        for (int bandIdx = 0; bandIdx < color.getNumBands(); bandIdx++) {
            ImageStatistics.histogram(color.getBand(bandIdx), 0, histogram);
            EnhanceImageOps.equalize(histogram, transform);
            EnhanceImageOps.applyTransform(color.getBand(bandIdx), transform, adjusted.getBand(bandIdx));
        }
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null, true), "Global");

        GEnhanceImageOps.equalizeLocal(color, 50, adjusted, 256, null);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null, true), "Local");
        panel.addImage(buffered, "Original");

        panel.setPreferredSize(new Dimension(color.width, color.height));
        mainPanel.addItem(panel, "Histogram Color");
    }

    /**
     * When an image is sharpened the intensity of edges are made more extreme while flat regions remain unchanged.
     */
    public static void sharpen() throws IOException {
        BufferedImage buffered= ImageIO.read(Path.of(imagePath).toUri().toURL());
        GrayU8 gray = ConvertBufferedImage.convertFrom(buffered, (GrayU8)null);
        GrayU8 adjusted = gray.createSameShape();


        ListDisplayPanel panel = new ListDisplayPanel();

        EnhanceImageOps.sharpen4(gray, adjusted);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null), "Sharpen-4");

        EnhanceImageOps.sharpen8(gray, adjusted);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null), "Sharpen-8");

        panel.addImage(ConvertBufferedImage.convertTo(gray, null), "Original");

        panel.setPreferredSize(new Dimension(gray.width, gray.height));
        mainPanel.addItem(panel, "Sharpen");
    }

    /**
     * Same as above but on a color image
     */
    public static void sharpenColor() throws IOException {
        BufferedImage buffered = ImageIO.read(Path.of(imagePath).toUri().toURL());
        Planar<GrayU8> color = ConvertBufferedImage.convertFrom(buffered, true, ImageType.PL_U8);
        Planar<GrayU8> adjusted = color.createSameShape();

        ListDisplayPanel panel = new ListDisplayPanel();

        GEnhanceImageOps.sharpen4(color, adjusted);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null, true), "Sharpen-4");

        GEnhanceImageOps.sharpen8(color, adjusted);
        panel.addImage(ConvertBufferedImage.convertTo(adjusted, null, true), "Sharpen-8");

        panel.addImage(buffered, "Original");

        panel.setPreferredSize(new Dimension(color.width, color.height));
        mainPanel.addItem(panel, "Sharpen Color");
    }

    public static void main( String[] args ) throws IOException {
        histogram();
        histogramColor();
        sharpen();
        sharpenColor();
        ShowImages.showWindow(mainPanel, "Enhancement", true);
    }
}
