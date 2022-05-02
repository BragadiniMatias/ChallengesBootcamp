package com.dia19.devplacedia19.repository;

import com.dia19.devplacedia19.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    public Cliente findByDni(long dni);
}
