package com.bae.cars.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.cars.data.Car;
import com.bae.cars.service.CarService;

@RestController
public class CarsController {

	private CarService service;

	public CarsController(CarService service) {
		super();
		this.service = service;
	}

	@GetMapping("/") // MAPS a GET request to "/" to this method)
	public String hello() {
		return "Hello, World!";
	}

	@PostMapping("/createCar")
	public void createCar(@RequestBody Car car) {
		this.service.createCar(car);

	}

	@GetMapping("/getAllCars")
	public List<Car> getAllCars() {
		return this.service.getAllCars();
	}

	@GetMapping("/getCar")
	public Car getCar(@PathVariable int id) {
		return this.service.getCar(id);
	}

	@DeleteMapping("/deleteCar/{id}")
	public String deleteCar(@PathVariable int id) {

		return this.service.deleteCar(id);
	}
}