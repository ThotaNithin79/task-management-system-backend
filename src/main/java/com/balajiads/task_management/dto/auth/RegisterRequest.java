package com.balajiads.task_management.dto.auth;

public record RegisterRequest(String name, String email, String password, Long departmentId) {
}