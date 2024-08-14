package com.example.recruitmentweb.jobportal.repository;

import com.example.recruitmentweb.jobportal.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}
