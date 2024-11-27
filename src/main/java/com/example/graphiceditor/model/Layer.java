package com.example.graphiceditor.model;

import jakarta.persistence.*;

@Entity
public class Layer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int zIndex;
    private boolean visible;
    @Embedded
    private Text text;


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

    public Layer(Text text) {
        this.text = text;
        }

        public Text getText() {
            return text;
        }

        public void setText(Text text) {
            this.text = text;
        }
    }



