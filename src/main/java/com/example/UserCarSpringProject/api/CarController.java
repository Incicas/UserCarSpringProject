package com.example.UserCarSpringProject.api;


import com.example.UserCarSpringProject.dao.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users/{user_id}/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<CarEntity> createCar(@PathVariable long user_id, @RequestBody CarEntity carEntity){
        carService.addCar(user_id, carEntity);

        return new ResponseEntity<>(carEntity, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<CarEntity>> getAllCars(@PathVariable long user_id){
        return new ResponseEntity<>(carService.getAllCars(user_id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarEntity> getCarById(@PathVariable long user_id, @PathVariable long id){
        carService.getCarById(user_id, id);

        return new ResponseEntity<>()

    }
}
