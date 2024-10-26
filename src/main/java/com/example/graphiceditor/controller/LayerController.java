package com.example.graphiceditor.controller;

import com.example.graphiceditor.model.Layer;
import com.example.graphiceditor.service.LayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/layers")
public class LayerController {

    private final LayerService layerService;

    @Autowired
    public LayerController(LayerService layerService) {
        this.layerService = layerService;
    }

    @PostMapping
    public Layer createLayer(@RequestBody Layer layer) {
        return layerService.createLayer(layer);
    }

    @GetMapping("/{id}")
    public Layer getLayerById(@PathVariable int id) {
        return layerService.getLayerById(id);
    }

    @GetMapping
    public List<Layer> getAllLayers() {
        return layerService.getAllLayers();
    }

    @PutMapping("/{id}")
    public Layer updateLayer(@PathVariable int id, @RequestBody Layer layer) {
        return layerService.updateLayer(id, layer);
    }

    @DeleteMapping("/{id}")
    public void deleteLayer(@PathVariable int id) {
        layerService.deleteLayer(id);
    }
}

