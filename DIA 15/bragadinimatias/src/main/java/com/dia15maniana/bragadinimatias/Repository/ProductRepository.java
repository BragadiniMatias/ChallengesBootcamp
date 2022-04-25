package com.dia15maniana.bragadinimatias.Repository;

import com.dia15maniana.bragadinimatias.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
}
