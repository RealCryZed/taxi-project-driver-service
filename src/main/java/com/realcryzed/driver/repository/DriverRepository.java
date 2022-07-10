package com.realcryzed.driver.repository;

import com.realcryzed.driver.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
    Driver getDriverByDriverId(Integer id);
}
