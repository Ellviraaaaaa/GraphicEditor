package com.example.graphiceditor.decorator;

public class ContrastEffectDecorator extends EffectDecorator {

    public ContrastEffectDecorator(EffectComponent effectComponent) {
        super(effectComponent);
    }

    @Override
    public String applyEffect() {
        return super.applyEffect() + " Contrast adjusted.";
    }
}

