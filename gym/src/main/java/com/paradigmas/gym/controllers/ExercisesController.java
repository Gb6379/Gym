package com.paradigmas.gym.controllers;

import com.paradigmas.gym.models.Exercises;
import com.paradigmas.gym.models.Plans;
import com.paradigmas.gym.models.User;
import com.paradigmas.gym.services.ExerciseService;
import com.paradigmas.gym.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
@RequestMapping("/exercices")
public class ExercisesController {

    @Autowired
    private final ExerciseService exerciseService;

    @PostMapping
    public Exercises addExercise(@RequestBody Exercises exercises) {
        return exerciseService.create(exercises);
    }

}
