package com.example.graphiceditor.bridge;

public class RasterImageEditor extends ImageEditor {

    public RasterImageEditor(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }

    public RasterImageEditor() {
        super();
    }

    @Override
    public void applyEffect(String effectName) {
        imageProcessor.applyEffect(effectName);
    }

    @Override
    public void resize(int width, int height) {
        imageProcessor.resize(width, height);
    }

    @Override
    public void save(String filePath) {
        imageProcessor.save(filePath);
    }
}




