package com.matias.bragadini.thymeleaf.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inscripcion")
public class Inscripcion {
    @Id
    private int idInscripcion;
    @ManyToOne
    @JoinColumn(name = "codigo_codigo")
    private Materias codigo;
    @ManyToOne
    @JoinColumn(name = "dni_dni")
    private Student dni;


}
