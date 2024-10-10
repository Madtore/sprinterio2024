package com.cesur.general.services.implement;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.general.models.Incidence;
import com.cesur.general.models.dtos.IncidenceDTO;
import com.cesur.general.repositories.IncidenceRepository;
import com.cesur.general.services.IncidenceService;

public class IncidenceServiceImpl implements IncidenceService{

    @Autowired
    private IncidenceRepository incidenceRepository;

    @Override
    public void storeIncidence(IncidenceDTO datos) {
        Incidence incidence = new Incidence();
        incidence.setCategory(datos.getCategory());
        incidence.setPriority(datos.getPriority());
        incidence.setCreatedAt(LocalDateTime.now() );
        incidence.setDescription(datos.getDescription());
        incidence.setUserCreated(null);

        incidenceRepository.save(incidence);
    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public IncidenceDTO getIncidenceById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceById'");
    }

    @Override
    public List<IncidenceDTO> getIncidenceByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidenceByUserName'");
    }
    

}
