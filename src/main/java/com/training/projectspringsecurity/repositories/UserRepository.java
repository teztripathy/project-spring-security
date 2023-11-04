package com.training.projectspringsecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.projectspringsecurity.entities.Role;
import com.training.projectspringsecurity.entities.User;


@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    Optional<User> findByEmail(String email);
    User findByRole(Role role);
}
