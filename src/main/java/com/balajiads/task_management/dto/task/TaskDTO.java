package com.balajiads.task_management.dto.task;

import java.time.LocalDateTime;

public record TaskDTO(
        Long id,
        String title,
        String description,
        String status,
        LocalDateTime createdAt,
        LocalDateTime dueDate,
        LocalDateTime completedAt,
        String assignedDepartmentName,
        String assignedUserName,
        String assignedByUserName
) {
}