package com.example.instadeepapi.repository;

import com.example.instadeepapi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<Task,Long> {
}
