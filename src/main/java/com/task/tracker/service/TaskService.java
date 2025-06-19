package com.task.tracker.service;

import com.task.tracker.domain.entities.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface TaskService {
    List<Task> listTasks(UUID taskListId);
}
