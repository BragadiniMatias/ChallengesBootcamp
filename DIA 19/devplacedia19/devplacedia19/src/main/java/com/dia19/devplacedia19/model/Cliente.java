package com.dia19.devplacedia19.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id //SOY UNA CLAVE PRIMARIA, Y NO PUEDO SER NULA.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long dni;

    private String nombre;

    private String apellido;

    private String email;

    private String direccion;



}
