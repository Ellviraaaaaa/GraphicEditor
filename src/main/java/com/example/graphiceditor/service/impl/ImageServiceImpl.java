package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.model.Image;
import com.example.graphiceditor.repository.ImageRepository;
import com.example.graphiceditor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
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
        if (imageRepository.existsById(id)) {
            image.setId(id);
            return imageRepository.save(image);
        } else {
            throw new RuntimeException("Image not found with id " + id);
        }
    }

    @Override
    public void deleteImage(int id) {
        if (imageRepository.existsById(id)) {
            imageRepository.deleteById(id);
        } else {
            throw new RuntimeException("Image not found with id " + id);
        }
    }
}

