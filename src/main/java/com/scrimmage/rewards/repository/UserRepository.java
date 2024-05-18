package com.scrimmage.rewards.repository;

import com.scrimmage.rewards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
