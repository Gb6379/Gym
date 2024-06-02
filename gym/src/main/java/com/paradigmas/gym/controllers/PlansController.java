package com.paradigmas.gym.controllers;

import com.paradigmas.gym.models.Plans;
import com.paradigmas.gym.models.User;
import com.paradigmas.gym.services.PlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/plans")
public class PlansController {

    @Autowired
    private final PlanService planService;
    @PostMapping
    public Plans addPlan(@RequestBody Plans plan) {
        return planService.createPlan(plan);
    }
}
