package com.example.graphiceditor.service;

import com.example.graphiceditor.prototype.Filter;

import java.util.List;

public interface FilterService {
    Filter createFilter(Filter filter);
    Filter getFilterById(int id);
    List<Filter> getAllFilters();
    Filter updateFilter(int id, Filter filter);
    void deleteFilter(int id);

    Filter cloneFilter(int id);
}
