package com.example.graphiceditor.controller;

import com.example.graphiceditor.model.Effect;
import com.example.graphiceditor.prototype.Filter;
import com.example.graphiceditor.model.Image;
import com.example.graphiceditor.service.EffectService;
import com.example.graphiceditor.service.impl.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/effects")
public class EffectController {

    private final EffectService effectService;
    private final ImageServiceImpl imageService;

    @Autowired
    public EffectController(EffectService effectService, ImageServiceImpl imageService) {
        this.effectService = effectService;
        this.imageService = imageService;
    }

    // Створення нового ефекту
    @PostMapping
    public Effect createEffect(@RequestBody Effect effect) {
        return effectService.createEffect(effect);
    }

    // Отримання ефекту за ID
    @GetMapping("/{id}")
    public Effect getEffectById(@PathVariable int id) {
        return effectService.getEffectById(id);
    }

    // Отримання всіх ефектів
    @GetMapping
    public List<Effect> getAllEffects() {
        return effectService.getAllEffects();
    }

    // Оновлення ефекту за ID
    @PutMapping("/{id}")
    public Effect updateEffect(@PathVariable int id, @RequestBody Effect effect) {
        return effectService.updateEffect(id, effect);
    }

    // Видалення ефекту за ID
    @DeleteMapping("/{id}")
    public void deleteEffect(@PathVariable int id) {
        effectService.deleteEffect(id);
    }

    @PostMapping("/{imageId}/filter")
    public void applyFilter(@PathVariable int imageId, @RequestBody Filter filter) {
        Image image = imageService.getImageById(imageId); // отримання зображення
        effectService.applyFilter(filter, image);
    }

}

