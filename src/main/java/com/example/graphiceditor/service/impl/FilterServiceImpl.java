package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.prototype.Filter;
import com.example.graphiceditor.repository.FilterRepository;
import com.example.graphiceditor.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterServiceImpl implements FilterService {

    private final FilterRepository filterRepository;

    @Autowired
    public FilterServiceImpl(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }

    @Override
    public Filter createFilter(Filter filter) {
        return filterRepository.save(filter);
    }

    @Override
    public Filter getFilterById(int id) {
        return filterRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Filter not found with id " + id));
    }

    @Override
    public List<Filter> getAllFilters() {
        return filterRepository.findAll();
    }

    @Override
    public Filter updateFilter(int id, Filter filter) {
        if (filterRepository.existsById(id)) {
            filter.setId(id);
            return filterRepository.save(filter);
        } else {
            throw new RuntimeException("Filter not found with id " + id);
        }
    }

    @Override
    public void deleteFilter(int id) {
        if (filterRepository.existsById(id)) {
            filterRepository.deleteById(id);
        } else {
            throw new RuntimeException("Filter not found with id " + id);
        }
    }

    @Override
    public Filter cloneFilter(int id) {
        Filter originalFilter = getFilterById(id);
        return originalFilter.clone(); // Клонування за допомогою Prototype
    }
}
