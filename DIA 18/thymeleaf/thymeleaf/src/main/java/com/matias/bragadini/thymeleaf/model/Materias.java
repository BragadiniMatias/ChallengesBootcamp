package com.matias.bragadini.thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "materias")
public class Materias {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private String nombre;


}
