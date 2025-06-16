package com.task.tracker.controller;

import com.task.tracker.domain.dto.TaskListDto;
import com.task.tracker.mapper.TaskListMapper;
import com.task.tracker.service.TaskListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/task-lists")
public class TaskListController {
    private final TaskListService taskListService;
    private final TaskListMapper taskListMapper;

    public TaskListController(TaskListService taskListService, TaskListMapper taskListMapper) {
        this.taskListService = taskListService;
        this.taskListMapper = taskListMapper;
    }

    @GetMapping
    public List<TaskListDto> listTasksLists() {
        return taskListService.listTaskLists()
                .stream().map(taskListMapper::toDto)
                .toList();
    }
}