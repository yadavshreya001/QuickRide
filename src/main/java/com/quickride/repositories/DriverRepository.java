package com.quickride.repositories;

import com.quickride.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Override
    Optional<Driver> findById(Long driverId);
}
