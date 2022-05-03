package com.example.pairProgramming.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pairProgramming.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
