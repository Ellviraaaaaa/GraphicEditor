package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.bridge.ImageEditor;
import com.example.graphiceditor.bridge.RasterImageEditor;
import com.example.graphiceditor.bridge.VectorImageEditor;
import com.example.graphiceditor.model.Image;
import com.example.graphiceditor.proxy.ImageProxy;
import com.example.graphiceditor.repository.ImageRepository;
import com.example.graphiceditor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;
    private ImageEditor imageEditor;

    @Override
    public void setImageEditor(String imageType) {
        if (imageType.equalsIgnoreCase("raster")) {
            this.imageEditor = new RasterImageEditor();
        } else if (imageType.equalsIgnoreCase("vector")) {
            this.imageEditor = new VectorImageEditor();
        } else {
            throw new IllegalArgumentException("Unsupported image type: " + imageType);
        }
    }


    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public ImageProxy loadImage(String fileName) {
        return null;
    }

    @Override
    public Image createImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image getImageById(int id) {
        return imageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Image not found with id " + id));
    }

    @Override
    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public Image updateImage(int id, Image image) {
        Image existingImage = getImageById(id);
        existingImage.setName(image.getName());
        existingImage.setType(image.getType());
        return existingImage;
    }

    @Override
    public void deleteImage(int id) {
    }

    @Override
    public void applyEffectToImage(int id, String effectName) {
            if (imageEditor != null) {
                imageEditor.applyEffect(effectName);  // Викликаємо метод для відповідного редактора
            } else {
                throw new IllegalStateException("Image editor is not set.");
            }
    }

    @Override
    public void resizeImage(int id, int width, int height) {
        if (imageEditor != null) {
            imageEditor.resize(width, height);  // Викликаємо метод для відповідного редактора
        } else {
            throw new IllegalStateException("Image editor is not set.");
        }
    }

    @Override
    public void saveImage(int id, String filePath) {
        if (imageEditor != null) {
            imageEditor.save(filePath);  // Викликаємо метод для відповідного редактора
        } else {
            throw new IllegalStateException("Image editor is not set.");
        }
    }

}


