package com.example.graphiceditor.controller;

import com.example.graphiceditor.model.Image;
import com.example.graphiceditor.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    public Image createImage(@RequestBody Image image) {
        return imageService.createImage(image);
    }

    @GetMapping("/{id}")
    public Image getImageById(@PathVariable int id) {
        return imageService.getImageById(id);
    }

    @GetMapping
    public List<Image> getAllImages() {
        return imageService.getAllImages();
    }

    @PutMapping("/{id}")
    public Image updateImage(@PathVariable int id, @RequestBody Image image) {
        return imageService.updateImage(id, image);
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable int id) {
        imageService.deleteImage(id);
    }
}

