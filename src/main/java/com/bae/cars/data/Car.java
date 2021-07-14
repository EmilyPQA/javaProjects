package com.bae.cars.data;

public class Car {

	private String make;
	private String model;
	private String colour;
	private int year;

	public Car(String make, String model, String colour, int year) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", colour=" + colour + ", year=" + year + "]";
	}

}
