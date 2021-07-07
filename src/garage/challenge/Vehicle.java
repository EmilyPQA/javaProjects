package garage.challenge;

public class Vehicle {

	private int id;

	private Double engineSize;

	private String colour;

	private String make;

	public Vehicle(int id, Double engineSize, String colour, String make) {

		this.setId(id);
		this.setEngineSize(engineSize);
		this.setColour(colour);
		this.setMake(make);
	}

	private void setId(int id) {

	}

	public Vehicle() {

	}

	public int id() {
		return this.id;
	}

	int id(int id) {
		return this.id = id;
	}

	public Double getEngineSize() {
		return this.engineSize;
	}

	Double setEngineSize(Double engineSize) {
		return this.engineSize = engineSize;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;

	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void print() {
		System.out.print("ID: ");
		System.out.println(this.id);
		System.out.print("Engine size: ");
		System.out.println(this.engineSize);
		System.out.print("Colour: ");
		System.out.println(this.colour);
		System.out.print("Make: ");
		System.out.println(this.make);
	}

	public int getId() {

		return id;
	}
}