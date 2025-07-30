package com.example.taskboard.controller;

import com.example.taskboard.entity.Task;
import com.example.taskboard.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*") // necessário se for usar com frontend separado
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task create(@Valid @RequestBody Task task) {
        return service.create(task);
    }

    @GetMapping
    public List<Task> list() {
        return service.listAll();
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @Valid @RequestBody Task task) {
        return service.update(id, task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
