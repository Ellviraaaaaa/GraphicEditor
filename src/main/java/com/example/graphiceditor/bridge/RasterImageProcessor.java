package com.example.graphiceditor.bridge;

public class RasterImageProcessor implements ImageProcessor {

    @Override
    public void applyEffect(String effectName) {
        System.out.println("Applying raster effect: " + effectName);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resizing raster image to " + width + "x" + height);
    }

    @Override
    public void save(String filePath) {
        if (filePath.endsWith(".bmp") || filePath.endsWith(".jpg") || filePath.endsWith(".png")) {
            System.out.println("Saving raster image to: " + filePath);
        } else {
            throw new IllegalArgumentException("Unsupported raster file format: " + filePath);
        }
    }
}

