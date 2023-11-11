package com.highfive.zeus.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.highfive.zeus.repository.BenefitRepository;
import com.highfive.zeus.service.BenefitService;
import com.highfive.zeus.domain.Benefit;

@Service
public class BenefitServiceImpl implements BenefitService{

    private BenefitRepository benefitRepository;

    public BenefitServiceImpl(BenefitRepository benefitRepository) {
        this.benefitRepository = benefitRepository;
    }

    @Override
    public List<Benefit> getAllBenefits() {
        
        return this.benefitRepository.findAll();

    }

    @Override
    public Benefit getBenefitById(String benefitId) {
        
        return this.benefitRepository.findById(benefitId).orElse(null);

    }

    @Override
    public Benefit createBenefit(Benefit benefit) {
        
        return this.benefitRepository.save(benefit);
        
    }

    @Override
    public Benefit updateBenefit(Benefit benefit) {
        
        Benefit existingBenefit = this.benefitRepository.findById(benefit.getId()).orElse(null);

        existingBenefit.setName(benefit.getName());
        existingBenefit.setDescription(benefit.getDescription());
        existingBenefit.setTraining(benefit.getTraining());
        existingBenefit.setCreatedAt(benefit.getCreatedAt());
        if(benefit.getUsers() != null) {
            existingBenefit.setUsers(benefit.getUsers());
        }

        return this.benefitRepository.save(existingBenefit);

    }

    @Override
    public void delete(String benefitId) {
        
        this.benefitRepository.deleteById(benefitId);
        
    }

    
}
