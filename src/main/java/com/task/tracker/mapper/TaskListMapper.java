package com.task.tracker.mapper;

import com.task.tracker.domain.dto.TaskListDto;
import com.task.tracker.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
