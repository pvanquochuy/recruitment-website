package com.example.recruitmentweb.jobportal.repository;

import com.example.recruitmentweb.jobportal.domain.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepositoryCustom {
    Page<User> getAllAcount(Pageable pageable);
}
