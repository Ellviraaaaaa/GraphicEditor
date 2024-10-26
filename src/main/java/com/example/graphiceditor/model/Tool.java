package com.example.graphiceditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String icon;

    public Tool() {}


    public Tool(String name, String icon) {
        this.name = name;
        this.icon = icon;
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


    public String getIcon() {
        return icon;
    }


    public void setIcon(String icon) {
        this.icon = icon;
    }
}
