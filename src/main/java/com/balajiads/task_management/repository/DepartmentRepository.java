package com.balajiads.task_management.repository;

import com.balajiads.task_management.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<UserDTO.Department, Long> {
    // Basic CRUD methods from JpaRepository are sufficient for now.
}
