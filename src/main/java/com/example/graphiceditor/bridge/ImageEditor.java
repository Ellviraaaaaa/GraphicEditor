package com.example.graphiceditor.bridge;

public abstract class ImageEditor {
    protected ImageProcessor imageProcessor;

    public ImageEditor(ImageProcessor imageProcessor) {
        this.imageProcessor = imageProcessor;
    }

    public ImageEditor() {
    }

    public abstract void applyEffect(String effectName);

    public abstract void resize(int width, int height);

    public abstract void save(String filePath);

    public ImageEditor getEditor(String imageType) {
        return null;
    }
}



