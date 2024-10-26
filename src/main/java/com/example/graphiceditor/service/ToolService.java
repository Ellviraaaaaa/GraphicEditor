package com.example.graphiceditor.service;

import com.example.graphiceditor.model.Tool;
import java.util.List;

public interface ToolService {
    Tool createTool(Tool tool);
    Tool getToolById(int id);
    List<Tool> getAllTools();
    Tool updateTool(int id, Tool tool);
    void deleteTool(int id);
}

