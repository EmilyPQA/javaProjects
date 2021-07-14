package com.bae.cars.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.bae.cars.data.Car;

@Service
@Primary

public class CarServiceList implements CarService {

	private List<Car> cars = new ArrayList<>();

	@Override
	public void createCar(Car car) {
		System.out.println(car);
		this.cars.add(car);

	}

	@Override
	public List<Car> getAllCars() {
		return this.cars;
	}

	@Override
	public Car getCar(int id) {
		Car found = this.cars.get(id);
		return found;
	}

	@Override
	public Car replaceCar(int id, Car newCar) {
		return this.cars.set(id, newCar);
	}

	@Override
	public String deleteCar(int id) {
		this.cars.remove(id);

		return "Deleted car at index: " + id;
	}

}
