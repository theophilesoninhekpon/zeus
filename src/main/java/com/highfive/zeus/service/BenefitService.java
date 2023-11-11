package com.highfive.zeus.service;

import java.util.List;

import com.highfive.zeus.domain.Benefit;


public interface BenefitService {
    
    /*
     * Retrieve an benefit
     */
    Benefit getBenefitById(String benefitId);

    /*
     * Retrieve all agencies
     */
    List<Benefit> getAllBenefits();

    /**
     * Create an benefit
     */
    Benefit createBenefit(Benefit benefit);

    /*
     * Update an benefit
     */
    Benefit updateBenefit(Benefit benefit);

    /*
     * Delete an benefit
     */
    void delete(String benefitId);
    
}
