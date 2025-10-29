package com.balajiads.task_management.dto.proof;

import java.time.LocalDateTime;

public record TaskProofDTO(
        Long id,
        Long taskId,
        String uploadedByUserName,
        String fileUrl,
        String note,
        LocalDateTime uploadedAt
) {
}