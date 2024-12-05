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
        this.imageService = imageService;  // Ініціалізація через конструктор
    }

    @PostMapping
    public void setImageEditor(@RequestParam String imageType) {
        imageService.setImageEditor(imageType);  // Налаштовуємо редактор в залежності від типу зображення
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
    @PutMapping("/{id}/applyEffect")
    public void applyEffectToImage(@PathVariable int id, @RequestParam String effectName) {
        imageService.applyEffectToImage(id, effectName);
    }

    @PutMapping("/{id}/resize")
    public void resizeImage(@PathVariable int id, @RequestParam int width, @RequestParam int height) {
        imageService.resizeImage(id, width, height);
    }

    @PutMapping("/{id}/save")
    public void saveImage(@PathVariable int id, @RequestParam String filePath) {
        imageService.saveImage(id, filePath);
    }

}

