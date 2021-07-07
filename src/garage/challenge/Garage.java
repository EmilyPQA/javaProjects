package garage.challenge;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.listOfVehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		this.listOfVehicles.remove(vehicle);
	}

	public int CalculatePrice() {
		int price = 0;
		for (Vehicle vehicle : listOfVehicles)
			;

		return price;
	}

//	public int findById(int id) {
//		Object vehicles;
//		for (int i = 0; i < vehicles.length; i++) {
//			int id1 = vehicles.length;
//			if (getId() == id1) {
//				return id1;
//			}
//		}
//		return id;
//	}
//
//	private int getId() {
//
//		return 0;

//	public void print() {
//		System.out.println("Garage:");
//		System.out.println("Vehciles");
//		for (Vehicle vehicle : this.vehicles) {
//			vehicle.print();
//		}
}
