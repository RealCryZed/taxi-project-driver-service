package com.realcryzed.driver.controller;

import com.realcryzed.driver.model.Driver;
import com.realcryzed.driver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/save-driver")
    public Driver saveDriver(@RequestBody Driver driver) {
        return driverService.saveDriver(driver);
    }

    @GetMapping("/driver/{id}")
    public Driver getDriverById(@PathVariable Integer id) {
        return driverService.getDriverByDriverId(id);
    }

    @GetMapping("/drivers")
    public List<Driver> getDriverById() {
        return driverService.getAllDrivers();
    }
}
