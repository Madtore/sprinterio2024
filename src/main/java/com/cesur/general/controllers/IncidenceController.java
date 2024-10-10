package com.cesur.general.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cesur.general.models.dtos.IncidenceDTO;
import com.cesur.general.services.IncidenceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    private IncidenceService incidenceService;

  
    @PostMapping("/incidence")
    public ResponseEntity<?> storeIncidence(@Validated @RequestBody IncidenceDTO incidence) {
    try{ 
    incidenceService.storeIncidence(incidence);
        return new ResponseEntity<IncidenceDTO>(incidence,HttpStatus.CREATED);
    }catch(Exception e){
        return
    }
    }
        
}
