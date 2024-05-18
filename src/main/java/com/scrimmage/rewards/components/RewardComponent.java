package com.scrimmage.rewards.components;

import com.scrimmage.rewards.model.Reward;
import com.scrimmage.rewards.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RewardComponent {
    private final RewardService rewardService;

    @Autowired
    public RewardComponent(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    public List<Reward> getRewards() {
        return rewardService.getAllRewards();
    }
}