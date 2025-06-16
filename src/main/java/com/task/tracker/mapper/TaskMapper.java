package com.task.tracker.mapper;

import com.task.tracker.domain.dto.TaskDto;
import com.task.tracker.domain.entities.Task;

public interface TaskMapper {
    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
