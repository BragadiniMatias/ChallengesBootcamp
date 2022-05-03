package com.example.pairProgramming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long dni;
	private String nombre;
	private String apellido;
	private long idCelular;
	
	
}
