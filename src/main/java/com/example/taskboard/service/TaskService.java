package com.example.taskboard.service;

import com.example.taskboard.entity.Task;
import com.example.taskboard.exception.TaskNotFoundException;
import com.example.taskboard.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Task create(Task task) {
        return repo.save(task);
    }

    public List<Task> listAll() {
        return repo.findAll();
    }

    public Task update(Long id, Task task) {
        Task existing = repo.findById(id).orElseThrow(() -> new TaskNotFoundException(id));
        existing.setTitle(task.getTitle());
        existing.setDescription(task.getDescription());
        existing.setDone(task.isDone());
        return repo.save(existing);
    }

    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new TaskNotFoundException(id);
        }
        repo.deleteById(id);
    }
}
