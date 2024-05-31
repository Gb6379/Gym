package com.paradigmas.gym.services;

import com.paradigmas.gym.models.Exercises;
import com.paradigmas.gym.repositories.ExercisesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExerciseService {
    @Autowired
    private ExercisesRepository exercisesRepository;

    public Exercises create(Exercises exercises) {
        return exercisesRepository.save(exercises);
    }
}
