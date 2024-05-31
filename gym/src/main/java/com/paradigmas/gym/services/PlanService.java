package com.paradigmas.gym.services;

import com.paradigmas.gym.models.Plans;
import com.paradigmas.gym.repositories.PlanRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlanService {

    @Autowired
    private PlanRepository planRepository;

    public Plans createPlan(Plans plan) {
        return planRepository.save(plan);
    }
}
