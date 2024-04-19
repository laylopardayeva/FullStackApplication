package com.laylo.dev.fullstack.backend.repository;

import com.laylo.dev.fullstack.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
