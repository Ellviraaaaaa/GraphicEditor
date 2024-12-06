package com.example.graphiceditor.flyweight;

import lombok.Getter;

@Getter
public record ConcreteFlyweight(String name) implements Flyweight {

    @Override
    public void apply(String data) {
        System.out.println("Applying effect: " + name + " with data: " + data);
    }
}
