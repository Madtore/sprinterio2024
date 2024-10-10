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
@Table(name="citas")
@AllArgsConstructor
@NoArgsConstructor
public class Cita {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="id_medico")
    private Long idMedico;

    @Column(name="id_paciente")
    private Long idPaciente;

    @Column(name="total")
    private Double total;

    @Column(name="fecha")
    private LocalDateTime fecha;

    @Column(name="valoracion")
    private Integer valoracion;

}
