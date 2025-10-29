package com.balajiads.task_management.dto.stats;

public record ManagerDashboardStatsDTO(
        long totalTasks,
        long totalCompleted,
        long totalPending,
        long totalInProgress,
        long totalOverdue
) {
}