package garage.challenge;

public class Motorbike extends Vehicle {
	private int id;

	private Double engineSize;

	private String colour;

	private String make;

	private boolean throttle;

	public Motorbike(int id, Double engineSize, String colour, String make, boolean throttle) {
		super(id, engineSize, colour, make);
		this.setId(id);
		this.setEngineSize(engineSize);
		this.setColour(colour);
		this.setMake(make);
		this.setThrottle(throttle);
	}

	public Motorbike() {

	}

	@Override
	public int getId() {
		return this.id;
	}

	int setId(int id) {
		return this.id = id;
	}

	@Override
	public Double getEngineSize() {
		return this.engineSize;
	}

	@Override
	Double setEngineSize(Double engineSize) {
		return this.engineSize = engineSize;
	}

	@Override
	public String getColour() {
		return this.colour;
	}

	@Override
	public void setColour(String colour) {
		this.colour = colour;

	}

	@Override
	public String getMake() {
		return this.make;
	}

	@Override
	public void setMake(String make) {
		this.make = make;
	}

	public boolean getThrottle() {
		return this.throttle;
	}

	public void setThrottle(boolean throttle) {
		this.throttle = throttle;
	}

	@Override
	public void print() {
		System.out.print("ID: ");
		System.out.print(this.id);
		System.out.print(", Engine size: ");
		System.out.print(this.engineSize);
		System.out.print(", Colour: ");
		System.out.println(this.colour);
		System.out.print(", Make: ");
		System.out.println(this.make);
		System.out.print(", Throttle: ");
		System.out.println(this.throttle);
	}

}
