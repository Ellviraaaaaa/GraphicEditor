package com.example.graphiceditor.decorator;

public class FilterEffectDecorator extends EffectDecorator {

    public FilterEffectDecorator(EffectComponent effectComponent) {
        super(effectComponent);
    }

    @Override
    public String applyEffect() {
        return super.applyEffect() + " Filter applied.";
    }
}

