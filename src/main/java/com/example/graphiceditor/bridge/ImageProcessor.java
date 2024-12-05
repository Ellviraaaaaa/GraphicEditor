package com.example.graphiceditor.bridge;

public interface ImageProcessor {
    void applyEffect(String effectName);
    void resize(int width, int height);
    void save(String filePath);
}

