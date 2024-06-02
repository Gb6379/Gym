package com.paradigmas.gym.services;

import com.paradigmas.gym.models.Training;
import com.paradigmas.gym.repositories.TrainingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    public Training createTraining(Training training) {
        return trainingRepository.save(training);
    }
}
