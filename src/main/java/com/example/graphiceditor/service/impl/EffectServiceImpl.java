package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.flyweight.Flyweight;
import com.example.graphiceditor.flyweight.FlyweightFactory;
import com.example.graphiceditor.model.Effect;
import com.example.graphiceditor.model.Image;
import com.example.graphiceditor.prototype.Filter;
import com.example.graphiceditor.repository.EffectRepository;
import com.example.graphiceditor.service.EffectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EffectServiceImpl implements EffectService {

    private final FlyweightFactory flyweightFactory;
    private final EffectRepository effectRepository;

    public EffectServiceImpl(FlyweightFactory flyweightFactory, EffectRepository effectRepository) {
        this.flyweightFactory = flyweightFactory;
        this.effectRepository = effectRepository;
    }

    @Override
    public Effect createEffect(Effect effect) {
        // Отримуємо Flyweight-об'єкт
        Flyweight flyweightEffect = flyweightFactory.getEffect(effect.getName());

        // Використовуємо метод apply (щоб уникнути попередження)
        flyweightEffect.apply("Image for effect " + effect.getName());

        System.out.println("Flyweight count: " + flyweightFactory.getFlyweightCount());

        // Зберігаємо ефект у репозиторії
        return effectRepository.save(effect);
    }

    @Override
    public Effect getEffectById(int id) {
        return effectRepository.findById(id).orElseThrow(() -> new RuntimeException("Effect not found"));
    }

    @Override
    public List<Effect> getAllEffects() {
        return effectRepository.findAll();
    }

    @Override
    public Effect updateEffect(int id, Effect effect) {
        Effect existingEffect = getEffectById(id);
        existingEffect.setName(effect.getName());
        return effectRepository.save(existingEffect);
    }

    @Override
    public void deleteEffect(int id) {
        effectRepository.deleteById(id);
    }

    @Override
    public void applyFilter(Filter filter, Image image) {
        // Реалізація для застосування фільтру
        filter.apply(image);
    }
}




