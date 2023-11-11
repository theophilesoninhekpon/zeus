package com.highfive.zeus.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.highfive.zeus.domain.Agency;
import com.highfive.zeus.repository.AgencyRepository;
import com.highfive.zeus.service.AgencyService;

@Service
public class AgencyServiceImpl implements AgencyService{

    private AgencyRepository agencyRepository;

    public AgencyServiceImpl(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    @Override
    public List<Agency> getAllAgencies() {
        
        return this.agencyRepository.findAll();

    }

    @Override
    public Agency getAgencyById(String agencyId) {
        
        return this.agencyRepository.findById(agencyId).orElse(null);

    }

    @Override
    public Agency createAgency(Agency agency) {
        
        return this.agencyRepository.save(agency);
        
    }

    @Override
    public Agency updateAgency(Agency agency) {
        
        Agency existingAgency = this.agencyRepository.findById(agency.getId()).orElse(null);

        existingAgency.setName(agency.getName());
        existingAgency.setMail(agency.getMail());
        existingAgency.setManager(agency.getManager());
        existingAgency.setDescription(agency.getDescription());
        if(agency.getTrainings() != null) {
            existingAgency.setTrainings(agency.getTrainings());
        } 
        existingAgency.setCreatedAt(agency.getCreatedAt());

        return this.agencyRepository.save(existingAgency);

    }

    @Override
    public void deleteAgency(String agencyId) {
        
        this.agencyRepository.deleteById(agencyId);
        
    }

    
}
