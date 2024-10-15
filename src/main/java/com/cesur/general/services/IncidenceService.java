package com.cesur.general.services;


import java.util.List;
import com.cesur.general.models.dtos.IncidenceDTO;




public interface IncidenceService {

    void storeIncidence(IncidenceDTO datos);

    void deleteIncidence(Long id);

    IncidenceDTO getIncidenceById(Long id);

    List<IncidenceDTO> getIncidenceByUserName(String username);

    void addIncidentence(Integer id);
    
} 