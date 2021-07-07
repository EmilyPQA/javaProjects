package garage.challenge;

public class App {

	public static void main(String[] args) {
		Garage vehicle = new Garage();

		Vehicle vehicle1 = new Vehicle(1, 2.0, "Red", "Mercedes");

		vehicle.addVehicle(vehicle1);

//		vehicle.print();

		System.out.println(vehicle1.id());
		System.out.println(vehicle1.getEngineSize());
		System.out.println(vehicle1.getColour());
		System.out.println(vehicle1.getMake());

		Car = new Car(1, 2.0, "Red", "Mercede", "A-Class");

	}
}
