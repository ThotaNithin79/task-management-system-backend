package com.balajiads.task_management.repository;

import com.balajiads.task_management.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    // Find a role by its name. Useful for assigning roles to new users.
    Optional<Role> findByName(String name);
}
