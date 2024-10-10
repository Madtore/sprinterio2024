package com.cesur.general.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="app_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="username",length = 8)
    private String username;
    
    @Column(name="password",length = 8)
    private String password;
    @Column(name="name",length = 50)
    private String name;
    @Column(name="birthDate")
    private String birthDate;
    //private Role role;
    @Column(name="lastUpdate")
    private LocalDateTime lastUpdate;
    @Column(name="deleteUpdate")
    private LocalDateTime deleteUpdate;
    @Column(name="createUpdate")
    private LocalDateTime createUpdate;

}


    


