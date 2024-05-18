package com.scrimmage.rewards.service;

import com.scrimmage.rewards.model.Reward;
import com.scrimmage.rewards.repository.RewardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class RewardServiceTest {

    @Mock
    private RewardRepository rewardRepository;

    @InjectMocks
    private RewardService rewardService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllRewards() {
        Reward reward1 = new Reward();
        reward1.setId(1L);
        reward1.setName("Reward1");
        reward1.setDescription("Description1");

        Reward reward2 = new Reward();
        reward2.setId(2L);
        reward2.setName("Reward2");
        reward2.setDescription("Description2");

        List<Reward> rewardList = Arrays.asList(reward1, reward2);

        when(rewardRepository.findAll()).thenReturn(rewardList);

        List<Reward> result = rewardService.getAllRewards();
        assertEquals(2, result.size());
        assertEquals("Reward1", result.get(0).getName());
        assertEquals("Reward2", result.get(1).getName());
    }
}