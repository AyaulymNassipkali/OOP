package pr3.delivery.moodel;

public class Car extends Vehicle {
	private int numberOfSeats;
	
	Car(String model, double baseCost, Engine engine, int numberOfSeats) {
		super(model, baseCost, engine);
		this.numberOfSeats = numberOfSeats;
	}
	
	@Override
	public double calculateDeliveryCost() {
		return super.calculateDeliveryCost() + (numberOfSeats * 5.0);
	}
	
	public double calculateDeliveryCost(double extraWeight) {
		return calculateDeliveryCost() + (extraWeight * 5.0);
	}
	
	@Override
	public String getVehicleInfo() {
		return super.getVehicleInfo() + 
	            "\nNumber of Seats: " + numberOfSeats +
	            "\nVehicle Type: Car";
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
}
