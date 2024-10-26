package com.example.graphiceditor.service;

import com.example.graphiceditor.model.Image;

import java.util.List;

public interface ImageService {
    Image createImage(Image image);
    Image getImageById(int id);
    List<Image> getAllImages();
    Image updateImage(int id, Image image);
    void deleteImage(int id);
}

