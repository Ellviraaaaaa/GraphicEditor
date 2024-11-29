package com.example.graphiceditor.decorator;

public abstract class EffectDecorator extends EffectComponent {
    protected EffectComponent effectComponent;

    public EffectDecorator(EffectComponent effectComponent) {
        this.effectComponent = effectComponent;
    }

    @Override
    public String applyEffect() {
        return effectComponent.applyEffect();
    }
}

