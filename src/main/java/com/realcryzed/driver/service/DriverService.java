package com.realcryzed.driver.service;

import com.realcryzed.driver.model.Driver;
import com.realcryzed.driver.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver getDriverByDriverId(Integer id) {
        return driverRepository.getDriverByDriverId(id);
    }

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }
}
