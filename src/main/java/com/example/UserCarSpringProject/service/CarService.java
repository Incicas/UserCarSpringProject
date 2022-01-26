package com.example.UserCarSpringProject.service;

import com.example.UserCarSpringProject.dao.CarEntity;
import com.example.UserCarSpringProject.dao.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private CarRepository carRepository;
    private UserService userService;

    @Autowired
    public CarService(CarRepository carRepository, UserService userService){
        this.carRepository = carRepository;
        this.userService   = userService;
    }

    public CarEntity addCar(CarEntity newCar, long user_id){
        userService.getUserById(user_id);
        
    }
}
