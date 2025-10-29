package com.balajiads.task_management.dto.auth;

// Using a record automatically provides private final fields, a public constructor,
// getters, equals(), hashCode(), and toString(). Perfect for a DTO.
public record LoginRequest(String email, String password) {
}