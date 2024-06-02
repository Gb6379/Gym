package com.paradigmas.gym.controllers;

import com.paradigmas.gym.models.Training;
import com.paradigmas.gym.models.User;
import com.paradigmas.gym.services.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/training")
public class TrainingController {
    @Autowired
    private final TrainingService trainingService;

    @PostMapping
    public Training addTraining(@RequestBody Training training) {
        return trainingService.createTraining(training);
    }
}
