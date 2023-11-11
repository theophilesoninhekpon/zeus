package com.highfive.zeus.service;

import java.util.List;

import com.highfive.zeus.domain.Training;


public interface TrainingService {
    
    /*
     * Retrieve an training
     */
    Training getTrainingById(String trainingId);

    /*
     * Retrieve all agencies
     */
    List<Training> getAllTrainings();

    /**
     * Create an training
     */
    Training createTraining(Training training);

    /*
     * Update an training
     */
    Training updateTraining(Training training);

    /*
     * Delete an training
     */
    void delete(String trainingId);
    
}
