package com.uc.boofcv_example;

import boofcv.alg.color.ColorHsv;
import boofcv.alg.color.ColorYuv;
import boofcv.io.UtilIO;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.io.image.UtilImageIO;
import boofcv.struct.image.GrayF32;
import boofcv.struct.image.Planar;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public class ExampleColorSpace {
    public static void main( String[] args ) throws IOException {
        String imagePath = "D:/erbakir-ml/newImage/savedImage/qr8.png";
        BufferedImage image = ImageIO.read(Path.of(imagePath).toUri().toURL());

        // Convert input image into a BoofCV RGB image
        Planar<GrayF32> rgb = ConvertBufferedImage.convertFromPlanar(image, null, true, GrayF32.class);

        //---- convert RGB image into different color formats
        Planar<GrayF32> hsv = rgb.createSameShape();
        ColorHsv.rgbToHsv(rgb, hsv);

        Planar<GrayF32> yuv = rgb.createSameShape();
        ColorYuv.yuvToRgb(rgb, yuv);

        //---- Convert individual pixels into different formats
        float[] pixelHsv = new float[3];
        ColorHsv.rgbToHsv(10, 50.6f, 120, pixelHsv);
        System.out.printf("Found RGB->HSV = %5.2f %5.3f %5.1f\n", pixelHsv[0], pixelHsv[1], pixelHsv[2]);

        float[] pixelRgb = new float[3];
        ColorHsv.hsvToRgb(pixelHsv[0], pixelHsv[1], pixelHsv[2], pixelRgb);
        System.out.printf("Found HSV->RGB = %5.1f %5.1f %5.1f expected 10 50.6 120\n",
                pixelRgb[0], pixelRgb[1], pixelRgb[2]);

        float[] pixelYuv = new float[3];
        ColorYuv.rgbToYuv(10, 50.6f, 120, pixelYuv);
        System.out.printf("Found RGB->YUV = %5.1f %5.1f %5.1f\n", pixelYuv[0], pixelYuv[1], pixelYuv[2]);

        ColorYuv.yuvToRgb(pixelYuv[0], pixelYuv[1], pixelYuv[2], pixelRgb);
        System.out.printf("Found YUV->RGB = %5.1f %5.1f %5.1f expected 10 50.6 120\n",
                pixelRgb[0], pixelRgb[1], pixelRgb[2]);
    }
}
