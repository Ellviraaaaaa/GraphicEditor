package com.example.graphiceditor.repository;

import com.example.graphiceditor.model.Layer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LayerRepository extends JpaRepository<Layer, Integer> {
}
