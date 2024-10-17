package com.cesur.general.models.dtos;

import java.time.LocalDateTime;

import com.cesur.general.models.utils.Roles;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class UserDAO {

    private Long id;

    private String name;

    private String email;
    
    private String password;

    private Roles rol;

    private LocalDateTime createUpdate;
    
    private Boolean active;
    

    private LocalDateTime deleteAt;

    private LocalDateTime updateAt;

    private LocalDateTime lastConnection;
}


    


