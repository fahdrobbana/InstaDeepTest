package com.example.instadeepapi.services;

import com.example.instadeepapi.entity.Task;

import java.util.List;

public interface ITaskService  {
    public List<Task> retrieveAllCourses();
    public Task addTask(Task task);
    public Task updateCourse(Task course);
}
