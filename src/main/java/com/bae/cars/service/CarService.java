package com.bae.cars.service;

import java.util.List;

import com.bae.cars.data.Car;

public interface CarService {

	public void createCar(Car car);

	public List<Car> getAllCars();

	public Car getCar(int id);

	public Car replaceCar(int id, Car newCar);

	public String deleteCar(int id);

}
