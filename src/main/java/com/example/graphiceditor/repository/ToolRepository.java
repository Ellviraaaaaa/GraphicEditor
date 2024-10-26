package com.example.graphiceditor.repository;

import com.example.graphiceditor.model.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository extends JpaRepository<Tool, Integer> {
}
