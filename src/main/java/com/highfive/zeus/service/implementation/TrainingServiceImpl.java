package com.highfive.zeus.service.implementation;

import java.util.List;

import com.highfive.zeus.domain.Training;
import com.highfive.zeus.repository.TrainingRepository;
import com.highfive.zeus.service.TrainingService;

public class TrainingServiceImpl implements TrainingService{

    private TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> getAllTrainings() {
        
        return this.trainingRepository.findAll();

    }

    @Override
    public Training getTrainingById(String trainingId) {
        
        return this.trainingRepository.findById(trainingId).orElse(null);

    }

    @Override
    public Training createTraining(Training training) {
        
        return this.trainingRepository.save(training);
        
    }

    @Override
    public Training updateTraining(Training training) {
        
        Training existingTraining = this.trainingRepository.findById(training.getId()).orElse(null);

        existingTraining.setName(training.getName());
        existingTraining.setDescription(training.getDescription());
        existingTraining.setDuration(training.getDuration());
        existingTraining.setCreatedAt(training.getCreatedAt());
        if(training.getAgencies() != null) {
            existingTraining.setAgencies(training.getAgencies());
        }
        if(training.getBenefits() != null) {
            existingTraining.setBenefits(training.getBenefits());
        }
        if(training.getUsers() != null) {
            existingTraining.setUsers(training.getUsers());
        }

        return this.trainingRepository.save(existingTraining);

    }

    @Override
    public void delete(String trainingId) {
        
        this.trainingRepository.deleteById(trainingId);
        
    }

    
}
