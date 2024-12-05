package com.example.graphiceditor.bridge;

public class VectorImageEditor extends ImageEditor {

    public VectorImageEditor(ImageProcessor imageProcessor) {
        super(imageProcessor);
    }

    public VectorImageEditor() {

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




