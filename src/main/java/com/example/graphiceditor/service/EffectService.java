package com.example.graphiceditor.service;

import com.example.graphiceditor.model.Effect;
import com.example.graphiceditor.prototype.Filter;
import com.example.graphiceditor.model.Image;

import java.util.List;

public interface EffectService {
    Effect createEffect(Effect effect);

    Effect getEffectById(int id);

    List<Effect> getAllEffects();

    Effect updateEffect(int id, Effect effect);

    void deleteEffect(int id);

    void applyFilter(Filter filter, Image image);
}


