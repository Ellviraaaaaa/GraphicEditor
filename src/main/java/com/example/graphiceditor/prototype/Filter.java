package com.example.graphiceditor.prototype;

import com.example.graphiceditor.model.Image;

public class Filter implements Cloneable {
    private String name;
    private double intensity;

    public Filter(String name, double intensity) {
        this.name = name;
        this.intensity = intensity;
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    // Реалізація методу clone
    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning Filter object", e);
        }
    }

    @Override
    public String toString() {
        return "Filter{name='" + name + "', intensity=" + intensity + "}";
    }

    public void setId(int id) {
    }

    public void apply(Image image) {
    }
}
