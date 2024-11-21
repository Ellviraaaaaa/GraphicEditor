package com.example.graphiceditor.proxy;

public class RealImage implements ImageProxy {
    private final String name;
    private final String format;

    public RealImage(String name, String format) {
        this.name = name;
        this.format = format;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Завантаження зображення з диску: " + name + "." + format);
    }

    @Override
    public void display() {
        System.out.println("Відображення зображення: " + name + "." + format);
    }

    @Override
    public String getName() {
        return name;
    }
}

