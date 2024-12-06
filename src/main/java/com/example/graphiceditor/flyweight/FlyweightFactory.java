package com.example.graphiceditor.flyweight;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FlyweightFactory {
    private final Map<String, Flyweight> effects = new HashMap<>();

    public Flyweight getEffect(String name) {
        return effects.computeIfAbsent(name, ConcreteFlyweight::new);
    }

    public int getFlyweightCount() {
        return effects.size();
    }
}



