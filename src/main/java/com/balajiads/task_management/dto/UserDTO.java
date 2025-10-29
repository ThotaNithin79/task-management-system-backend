package com.balajiads.task_management.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

public record UserDTO(
        Long id,
        String name,
        String email,
        String departmentName,
        Set<String> roles
) {
    public static record DepartmentDTO(Long id, String name) {
    }

    @Getter
    @Setter
    @Entity
    @Table(name = "departments")
    public static class Department {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true, length = 120)
        private String name;

        @Column(name = "created_at", nullable = false, updatable = false)
        private LocalDateTime createdAt;

        @PrePersist
        protected void onCreate() {
            createdAt = LocalDateTime.now();
        }
    }
}