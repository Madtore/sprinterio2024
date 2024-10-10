package com.cesur.general.services;


import java.util.List;
import org.springframework.stereotype.Service;
import com.cesur.general.models.dtos.IncidenceDTO;



@Service
public interface IncidenceService {

    void storeIncidence(IncidenceDTO datos);

    void deleteIncidence(Long id);

    IncidenceDTO getIncidenceById(Long id);

    List<IncidenceDTO> getIncidenceByUserName(String username);
    
} 