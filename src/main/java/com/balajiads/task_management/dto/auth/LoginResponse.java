package com.balajiads.task_management.dto.auth;

import java.util.Set;

public record LoginResponse(String jwtToken, String username, Set<String> roles) {
}