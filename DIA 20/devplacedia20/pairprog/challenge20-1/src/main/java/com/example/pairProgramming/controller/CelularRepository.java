package com.example.pairProgramming.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pairProgramming.model.Celular;

@Repository
public interface CelularRepository extends JpaRepository<Celular,Long> {
	
}
