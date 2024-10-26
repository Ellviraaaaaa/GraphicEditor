package com.example.graphiceditor.controller;

import com.example.graphiceditor.model.Tool;
import com.example.graphiceditor.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tools")
public class ToolController {

    private final ToolService toolService;

    @Autowired
    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }

    @PostMapping
    public Tool createTool(@RequestBody Tool tool) {
        return toolService.createTool(tool);
    }

    @GetMapping("/{id}")
    public Tool getToolById(@PathVariable int id) {
        return toolService.getToolById(id);
    }

    @GetMapping
    public List<Tool> getAllTools() {
        return toolService.getAllTools();
    }

    @PutMapping("/{id}")
    public Tool updateTool(@PathVariable int id, @RequestBody Tool tool) {
        return toolService.updateTool(id, tool);
    }

    @DeleteMapping("/{id}")
    public void deleteTool(@PathVariable int id) {
        toolService.deleteTool(id);
    }
}
