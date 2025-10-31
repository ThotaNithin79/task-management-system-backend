package com.balajiads.task_management.config;

import com.balajiads.task_management.entity.Role;
import com.balajiads.task_management.entity.User;
import com.balajiads.task_management.repository.RoleRepository;
import com.balajiads.task_management.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DataSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public DataSeeder(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        // This method will be executed on application startup.

        // 1. Create Roles if they don't exist
        Role adminRole = createRoleIfNotFound("Super Admin", "Full system access");
        Role headRole = createRoleIfNotFound("Department Head", "Manages a department");
        Role employeeRole = createRoleIfNotFound("Employee", "Standard user");

        // 2. Create a Super Admin user if they don't exist
        if (userRepository.findByEmail("admin@example.com").isEmpty()) {
            User adminUser = new User();
            adminUser.setName("Admin User");
            adminUser.setEmail("admin@example.com");
            // VERY IMPORTANT: Hash the password before saving!
            adminUser.setPasswordHash(passwordEncoder.encode("admin123"));

            Set<Role> roles = new HashSet<>();
            roles.add(adminRole);
            adminUser.setRoles(roles);

            userRepository.save(adminUser);
            System.out.println(">>> Super Admin user created!");
        }
    }

    private Role createRoleIfNotFound(String name, String description) {
        return roleRepository.findByName(name)
                .orElseGet(() -> {
                    Role role = new Role();
                    role.setName(name);
                    role.setDescription(description);
                    return roleRepository.save(role);
                });
    }
}