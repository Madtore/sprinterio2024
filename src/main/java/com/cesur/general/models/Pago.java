package com.cesur.general.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name= "pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="id_medico")
    private Long idMedico;

    @Column(name="id_paciente")
    private Long idPaciente;

    @Column(name="id_cita")
    private Long idCita;

    @Column(name="total")
    private Double total;

    @Column(name="fecha")
    private LocalDateTime fecha;
}