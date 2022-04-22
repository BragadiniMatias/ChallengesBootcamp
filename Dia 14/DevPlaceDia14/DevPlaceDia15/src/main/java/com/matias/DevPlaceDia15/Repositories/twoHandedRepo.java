package com.matias.DevPlaceDia15.Repositories;

import com.matias.DevPlaceDia15.Domain.twoHanded;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface twoHandedRepo extends JpaRepository<twoHanded, Long> {
}
