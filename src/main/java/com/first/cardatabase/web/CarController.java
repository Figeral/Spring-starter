package com.first.cardatabase.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.cardatabase.domain.Car;
import com.first.cardatabase.domain.CarRepository;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepo;
    
    @RequestMapping(value="/cars")
    Iterable<Car> getCars(){
        return carRepo.findAll();
    }
}
