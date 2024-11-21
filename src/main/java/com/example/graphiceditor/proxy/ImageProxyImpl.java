package com.example.graphiceditor.proxy;

public class ImageProxyImpl implements ImageProxy {
    private final String name;
    private final String format;
    private RealImage realImage;

    public ImageProxyImpl(String name, String format) {
        this.name = name;
        this.format = format;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(name, format);
        }
        realImage.display();
    }

    @Override
    public String getName() {
        return name;
    }
}

