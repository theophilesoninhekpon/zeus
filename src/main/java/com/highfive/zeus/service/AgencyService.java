package com.highfive.zeus.service;

import java.util.List;

import com.highfive.zeus.domain.Agency;


public interface AgencyService {
    
    /*
     * Retrieve an agency
     */
    Agency getAgencyById(String agencyId);

    /*
     * Retrieve all agencies
     */
    List<Agency> getAllAgencies();

    /**
     * Create an agency
     */
    Agency createAgency(Agency agency);

    /*
     * Update an agency
     */
    Agency updateAgency(Agency agency);

    /*
     * Delete an agency
     */
    void deleteAgency(String agencyId);
    
}
