package com.balajiads.task_management.dto.task;

import java.time.LocalDateTime;

public record TaskCreateRequest(
        String title,
        String description,
        Long assignedDepartmentId,
        LocalDateTime dueDate
) {
}
