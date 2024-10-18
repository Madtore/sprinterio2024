package com.cesur.general.services;

import com.cesur.general.models.dtos.HistoricalDTO;

public interface HistoricalService {

    void saveHistorical(HistoricalDTO historicalDTO);

    HistoricalDTO getHistoricalById(Long id);

}
