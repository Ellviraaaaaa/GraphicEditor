package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.model.Effect;
import com.example.graphiceditor.repository.EffectRepository;
import com.example.graphiceditor.service.EffectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EffectServiceImpl implements EffectService {

    private final EffectRepository effectRepository;

    @Autowired
    public EffectServiceImpl(EffectRepository effectRepository) {
        this.effectRepository = effectRepository;
    }

    @Override
    public Effect createEffect(Effect effect) {
        return effectRepository.save(effect);
    }

    @Override
    public Effect getEffectById(int id) {
        return effectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Effect not found with id " + id));
    }

    @Override
    public List<Effect> getAllEffects() {
        return effectRepository.findAll();
    }

    @Override
    public Effect updateEffect(int id, Effect effect) {
        if (effectRepository.existsById(id)) {
            effect.setId(id);
            return effectRepository.save(effect);
        } else {
            throw new RuntimeException("Effect not found with id " + id);
        }
    }

    @Override
    public void deleteEffect(int id) {
        if (effectRepository.existsById(id)) {
            effectRepository.deleteById(id);
        } else {
            throw new RuntimeException("Effect not found with id " + id);
        }
    }
}

