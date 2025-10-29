package com.balajiads.task_management.dto.stats;

public record EmployeeDashboardStatsDTO(
        long tasksAssignedToday,
        long tasksCompletedToday,
        long totalPendingTasks,
        long totalInProgressTasks
) {
}