package com.cesur.general.models.dtos;

import com.cesur.general.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncidenceDTO {

    private Long id;

    private String category;

    private String description;

    private String priority;

    private User userCreated;

}
