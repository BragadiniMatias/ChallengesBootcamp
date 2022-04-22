package com.matias.DevPlaceDia15.Repositories;

import com.matias.DevPlaceDia15.Domain.Staffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffsRepo extends JpaRepository<Staffs, Long> {
}
