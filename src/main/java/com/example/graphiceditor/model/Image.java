package com.example.graphiceditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String format; // bmp, png, jpg
    private byte[] data;


    public Image() {}


    public Image(String name, String format, byte[] data) {
        this.name = name;
        this.format = format;
        this.data = data;
    }


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


    public String getFormat() {
        return format;
    }


    public void setFormat(String format) {
        this.format = format;
    }


    public byte[] getData() {
        return data;
    }


    public void setData(byte[] data) {
        this.data = data;
    }
}


