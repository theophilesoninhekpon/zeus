package com.highfive.zeus.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.zeus.domain.Agency;
import com.highfive.zeus.service.dto.AgencyDto;
import com.highfive.zeus.service.implementation.AgencyServiceImpl;
import com.highfive.zeus.service.mapper.AgencyMapper;

@RestController
@RequestMapping("/api")
public class AgencyResource {

    private AgencyServiceImpl agencyServiceImpl;

    public AgencyResource(AgencyServiceImpl agencyServiceImpl) {
        this.agencyServiceImpl = agencyServiceImpl;
    }

    @GetMapping("/agency")
    public ResponseEntity<List<AgencyDto>> getAllAgencies() {

        List<Agency> allAgencies = this.agencyServiceImpl.getAllAgencies();

        List<AgencyDto> allAgenciesDto = new ArrayList<AgencyDto>();

        for (Agency agency : allAgencies) {
            allAgenciesDto.add(AgencyMapper.INSTANCE.toDto(agency));
        }

        return ResponseEntity.ok(allAgenciesDto);

    }

    @GetMapping("/agency/{agencyId}")
    public ResponseEntity<AgencyDto> getAgency(@PathVariable String agencyId) {

        Agency agency = this.agencyServiceImpl.getAgencyById(agencyId);

        if (agency != null) {
            AgencyDto agencyDto = AgencyMapper.INSTANCE.toDto(agency);
            return ResponseEntity.ok(agencyDto);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/agency")
    public ResponseEntity<AgencyDto> createAgency(@RequestBody Agency agency) {

        Agency newAgency = this.agencyServiceImpl.createAgency(agency);
        AgencyDto newAgencyDto = AgencyMapper.INSTANCE.toDto(newAgency);

        return ResponseEntity.ok(newAgencyDto);

    }

    @PutMapping("/agency")
    public ResponseEntity<AgencyDto> updateAgency(@RequestBody Agency agency) {

        Agency existingAgency = this.agencyServiceImpl.getAgencyById(agency.getId());

        if (existingAgency != null) {

            Agency updatedAgency = this.agencyServiceImpl.updateAgency(existingAgency);
            AgencyDto updatedAgencyDto = AgencyMapper.INSTANCE.toDto(updatedAgency);

            return ResponseEntity.ok(updatedAgencyDto);

        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/agency/{agencyId}") 
    public ResponseEntity<String> deleteAgency(@PathVariable String agencyId) {

        this.agencyServiceImpl.deleteAgency(agencyId);

        return ResponseEntity.ok("Cet organisme a été supprimé avec succès! ");

    }

}
