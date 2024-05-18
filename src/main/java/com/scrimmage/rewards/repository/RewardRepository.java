package com.scrimmage.rewards.repository;

import com.scrimmage.rewards.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward, Long> {
}