package com.cesur.general.models;


import java.time.LocalDateTime;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="incidences")
public class Incidence {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String category;

    @Column
    private String description;

    @Column
    private String priority;

    @Column
    private LocalDateTime createdAt;

    @Column
    @Nullable
    private LocalDateTime updateAt;

    @Column
    @Nullable
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;


    
}
