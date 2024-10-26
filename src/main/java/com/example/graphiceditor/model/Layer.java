package com.example.graphiceditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Layer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int zIndex;
    private boolean visible;

    public Layer() {}

    public Layer(String name, int zIndex, boolean visible) {
        this.name = name;
        this.zIndex = zIndex;
        this.visible = visible;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZIndex() {
        return zIndex;
    }

    public void setZIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}

