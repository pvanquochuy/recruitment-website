package com.example.recruitmentweb.jobportal.repository;

import com.example.recruitmentweb.jobportal.domain.enums.RoleName;
import com.example.recruitmentweb.jobportal.domain.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
