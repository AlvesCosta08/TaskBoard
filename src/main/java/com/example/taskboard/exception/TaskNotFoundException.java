package com.example.taskboard.exception;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("Tarefa com ID " + id + " não encontrada.");
    }
}

