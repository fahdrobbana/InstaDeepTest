package com.example.instadeepapi.services;

import com.example.instadeepapi.entity.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.instadeepapi.repository.ITaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TaskService implements ITaskService{
    private static final Logger logger = LogManager.getLogger(TaskService.class);

    private ITaskRepository taskRepository;
    @Override
    public List<Task> retrieveAllCourses() {
        logger.info("Retrieving all courses");
        return taskRepository.findAll();
    }
    public Task addTask(Task task) {
        logger.debug("Adding course: {}", task);
        Task addTask = taskRepository.save(task);
        logger.info("Course e added successfully with Title", addTask.getTitle());
        return addTask;
    }
    public Task updateCourse(Task task) {
        logger.debug("Updating course with ID: {}", task.getTitle());
        Task updatedTask = taskRepository.save(task);
        logger.info("Course updated successfully with ID: {}", task.getTitle());
        return updatedTask;
    }


}
