package com.scrimmage.rewards.components;

import com.scrimmage.rewards.model.Reward;
import com.scrimmage.rewards.service.RewardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class RewardComponentTest {

    @Mock
    private RewardService rewardService;

    @InjectMocks
    private RewardComponent rewardComponent;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetRewards() {
        Reward reward1 = new Reward();
        reward1.setId(1L);
        reward1.setName("Reward1");
        reward1.setDescription("Description1");

        Reward reward2 = new Reward();
        reward2.setId(2L);
        reward2.setName("Reward2");
        reward2.setDescription("Description2");

        List<Reward> rewardList = Arrays.asList(reward1, reward2);

        when(rewardService.getAllRewards()).thenReturn(rewardList);

        List<Reward> result = rewardComponent.getRewards();
        assertEquals(2, result.size());
        assertEquals("Reward1", result.get(0).getName());
        assertEquals("Reward2", result.get(1).getName());
    }
}