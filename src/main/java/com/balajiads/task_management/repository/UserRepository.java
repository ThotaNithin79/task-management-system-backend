package com.balajiads.task_management.repository;

import com.balajiads.task_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find a user by their unique email address.
    // This will be crucial for the login process.
    Optional<User> findByEmail(String email);
}
