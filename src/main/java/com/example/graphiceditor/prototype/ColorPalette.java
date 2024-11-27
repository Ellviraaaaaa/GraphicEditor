package com.example.graphiceditor.prototype;

import java.util.ArrayList;
import java.util.List;

public class ColorPalette implements Cloneable {
    private List<String> colors;

    public ColorPalette(List<String> colors) {
        this.colors = new ArrayList<>(colors); // Уникаємо мутації
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = new ArrayList<>(colors);
    }

    public void addColor(String color) {
        colors.add(color);
    }

    public void removeColor(String color) {
        colors.remove(color);
    }

    // Реалізація методу clone
    @Override
    public ColorPalette clone() {
        try {
            ColorPalette cloned = (ColorPalette) super.clone();
            cloned.colors = new ArrayList<>(this.colors); // Копіюємо список кольорів
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning ColorPalette object", e);
        }
    }

    @Override
    public String toString() {
        return "ColorPalette{colors=" + colors + "}";
    }
}
