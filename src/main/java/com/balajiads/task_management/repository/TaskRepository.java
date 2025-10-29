package com.balajiads.task_management.repository;

import com.balajiads.task_management.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Find all tasks assigned to a specific employee.
    List<Task> findByAssignedUserId(Long userId);

    // Find all tasks belonging to a specific department.
    List<Task> findByAssignedDepartmentId(Long departmentId);

    // Find all tasks assigned by a specific manager or admin.
    List<Task> findByAssignedById(Long userId);
}
