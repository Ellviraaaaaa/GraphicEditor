package com.example.graphiceditor.decorator;

public class BrightnessEffectDecorator extends EffectDecorator {

    public BrightnessEffectDecorator(EffectComponent effectComponent) {
        super(effectComponent);
    }

    @Override
    public String applyEffect() {
        return super.applyEffect() + " Brightness adjusted.";
    }
}

