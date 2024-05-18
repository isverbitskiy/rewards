package com.scrimmage.rewards.service;

import com.scrimmage.rewards.model.Reward;
import com.scrimmage.rewards.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardService {
    @Autowired
    private RewardRepository rewardRepository;

    public List<Reward> getAllRewards() {
        return rewardRepository.findAll();
    }
}