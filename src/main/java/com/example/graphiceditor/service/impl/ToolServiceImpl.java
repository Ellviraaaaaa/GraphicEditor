package com.example.graphiceditor.service.impl;

import com.example.graphiceditor.model.Tool;
import com.example.graphiceditor.repository.ToolRepository;
import com.example.graphiceditor.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToolServiceImpl implements ToolService {

    private final ToolRepository toolRepository;

    @Autowired
    public ToolServiceImpl(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    @Override
    public Tool createTool(Tool tool) {
        return toolRepository.save(tool);
    }

    @Override
    public Tool getToolById(int id) {
        return toolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tool not found with id " + id));
    }

    @Override
    public List<Tool> getAllTools() {
        return toolRepository.findAll();
    }

    @Override
    public Tool updateTool(int id, Tool tool) {
        if (toolRepository.existsById(id)) {
            tool.setId(id);
            return toolRepository.save(tool);
        } else {
            throw new RuntimeException("Tool not found with id " + id);
        }
    }

    @Override
    public void deleteTool(int id) {
        if (toolRepository.existsById(id)) {
            toolRepository.deleteById(id);
        } else {
            throw new RuntimeException("Tool not found with id " + id);
        }
    }
}
