package com.cesur.general.models;


import java.time.LocalDateTime;

import com.cesur.general.models.utils.Priorities;
import com.cesur.general.models.utils.Scopes;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    @Column(name= "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name= "priority")
    private Priorities priority;

    @Enumerated(EnumType.STRING)
    @Column(name= "scope")
    private Scopes scope;

    @Column(name= "createAt")
    private LocalDateTime createdAt;

    @Column(name= "updateAt", nullable = true)
    private LocalDateTime updateAt;

    @Column(name= "deleteAt", nullable = true)
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;
}
