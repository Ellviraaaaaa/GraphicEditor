package com.example.graphiceditor.prototype;

public class FontStyle implements Cloneable {
    private String fontName;
    private int fontSize;
    private boolean bold;
    private boolean italic;

    public FontStyle(String fontName, int fontSize, boolean bold, boolean italic) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.bold = bold;
        this.italic = italic;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
    }

    // Реалізація методу clone
    @Override
    public FontStyle clone() {
        try {
            return (FontStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning FontStyle object", e);
        }
    }

    @Override
    public String toString() {
        return "FontStyle{fontName='" + fontName + "', fontSize=" + fontSize +
                ", bold=" + bold + ", italic=" + italic + "}";
    }
}
