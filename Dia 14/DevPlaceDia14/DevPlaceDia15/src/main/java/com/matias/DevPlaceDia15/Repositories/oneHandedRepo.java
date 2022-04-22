package com.matias.DevPlaceDia15.Repositories;

import com.matias.DevPlaceDia15.Domain.oneHanded;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface oneHandedRepo extends JpaRepository<oneHanded,Long> {
}
