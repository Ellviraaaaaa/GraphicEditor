package com.example.graphiceditor.service;

import com.example.graphiceditor.model.Layer;

import java.util.List;

public interface LayerService {
    Layer createLayer(Layer layer);
    Layer getLayerById(int id);
    List<Layer> getAllLayers();
    Layer updateLayer(int id, Layer layer);
    void deleteLayer(int id);
}

