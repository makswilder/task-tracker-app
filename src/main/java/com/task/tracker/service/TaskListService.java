package com.task.tracker.service;

import com.task.tracker.domain.entities.TaskList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskListService {
    List<TaskList> listTaskLists();
}
