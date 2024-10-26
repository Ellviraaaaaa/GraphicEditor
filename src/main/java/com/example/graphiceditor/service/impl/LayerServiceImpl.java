package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.model.Layer;
import com.example.graphiceditor.repository.LayerRepository;
import com.example.graphiceditor.service.LayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LayerServiceImpl implements LayerService {

    private final LayerRepository layerRepository;

    @Autowired
    public LayerServiceImpl(LayerRepository layerRepository) {
        this.layerRepository = layerRepository;
    }

    @Override
    public Layer createLayer(Layer layer) {
        return layerRepository.save(layer);
    }

    @Override
    public Layer getLayerById(int id) {
        return layerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Layer not found with id " + id));
    }

    @Override
    public List<Layer> getAllLayers() {
        return layerRepository.findAll();
    }

    @Override
    public Layer updateLayer(int id, Layer layer) {
        if (layerRepository.existsById(id)) {
            layer.setId(id);
            return layerRepository.save(layer);
        } else {
            throw new RuntimeException("Layer not found with id " + id);
        }
    }

    @Override
    public void deleteLayer(int id) {
        if (layerRepository.existsById(id)) {
            layerRepository.deleteById(id);
        } else {
            throw new RuntimeException("Layer not found with id " + id);
        }
    }
}

