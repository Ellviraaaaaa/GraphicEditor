package com.example.graphiceditor.service;

import com.example.graphiceditor.bridge.ImageEditor;
import com.example.graphiceditor.proxy.ImageProxy;
import com.example.graphiceditor.model.Image;

import java.util.List;

public interface ImageService {
    ImageProxy loadImage(String fileName);

    Image createImage(Image image);
    Image getImageById(int id);
    List<Image> getAllImages();
    Image updateImage(int id, Image image);
    void deleteImage(int id);
    void applyEffectToImage(int id, String effectName);
    void resizeImage(int id, int width, int height);
    void saveImage(int id, String filePath);
    void setImageEditor(String imageType);
}


