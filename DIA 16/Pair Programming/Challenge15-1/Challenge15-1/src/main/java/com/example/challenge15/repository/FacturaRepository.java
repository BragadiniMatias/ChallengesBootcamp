package com.example.challenge15.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.challenge15.model.FacturaModel;

public interface FacturaRepository extends JpaRepository<FacturaModel,Long> {

}
