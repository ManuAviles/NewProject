package com.iesemilidarder.maviles.controller;

import com.iesemilidarder.maviles.data.Car;
import com.iesemilidarder.maviles.data.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MyFirstController {

    @RequestMapping("/car")
    public Vehicle getCar(@RequestParam(value = "name", defaultValue = "BrumBrum") String name) {
        Car car = new Car();

        return car;
    }
}
