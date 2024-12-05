package com.example.graphiceditor.bridge;

public class VectorImageProcessor implements ImageProcessor {

    @Override
    public void applyEffect(String effectName) {
        System.out.println("Applying vector effect: " + effectName);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resizing vector image to " + width + "x" + height);
    }

    @Override
    public void save(String filePath) {
        if (filePath.endsWith(".svg")) {
            System.out.println("Saving vector image to: " + filePath);
        } else {
            throw new IllegalArgumentException("Unsupported vector file format: " + filePath);
        }
    }
}
