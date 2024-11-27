package com.example.graphiceditor.model;

public class Text {
    private String fontName;
    private int fontSize;
    private boolean isBold;
    private boolean isItalic;

    public Text() {}

    public Text(String fontName, int fontSize, boolean isBold, boolean isItalic) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.isBold = isBold;
        this.isItalic = isItalic;
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
        return isBold;
    }

    public void setBold(boolean isBold) {
        this.isBold = isBold;
    }

    public boolean isItalic() {
        return isItalic;
    }

    public void setItalic(boolean isItalic) {
        this.isItalic = isItalic;
    }
}

