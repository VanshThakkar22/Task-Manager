package com.example.TaskManager.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TaskManager.model.Task;
import com.example.TaskManager.repository.TaskRepository;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    public Task createTask(Task task){
        task.setCreatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }
    //or
    // public Optional<Task> getTaskById(Long id){
    //     return taskRepository.findById(id);
    // }

    public Task updateTask(Long id, Task updatedTask){
        Task existingTask = taskRepository.findById(id).orElse(null);

        if(existingTask == null){
            return null;
        }
        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setCompleted(updatedTask.isCompleted());

        return taskRepository.save(existingTask);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
