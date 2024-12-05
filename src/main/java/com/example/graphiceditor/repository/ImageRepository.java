package com.example.graphiceditor.repository;

import com.example.graphiceditor.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    void removeIf(Object o);
}

