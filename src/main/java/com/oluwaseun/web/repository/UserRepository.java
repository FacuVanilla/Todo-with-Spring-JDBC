package com.oluwaseun.web.repository;

import com.oluwaseun.web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
