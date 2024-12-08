package com.example.instadeepapi.controller;

import com.example.instadeepapi.entity.Task;
import com.example.instadeepapi.services.ITaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskRestController {

    private final ITaskService taskService;


    @PostMapping("/add")
    public Task addCourse(@RequestBody Task task){
        return  taskService.addTask(task);
    }


    @GetMapping("/all")
    public List<Task> getAllCourses(){
        return taskService.retrieveAllCourses();
    }

    @PutMapping("/update")
    public Task updateCourse(@RequestBody Task task){
        return  taskService.updateCourse(task);
    }

}
