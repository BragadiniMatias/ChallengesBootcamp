package com.matias.bragadini.thymeleaf.repository;

import com.matias.bragadini.thymeleaf.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public boolean existsByDni(long dni);
}
