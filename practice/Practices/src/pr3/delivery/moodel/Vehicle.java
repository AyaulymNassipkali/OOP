package pr3.delivery.moodel;

public class Vehicle {
	protected String model;
	protected double baseCost;
	protected Engine engine;
	
	public Vehicle(String model, double baseCost, Engine engine) {
		this.model = model;
		this.baseCost = baseCost;
		this.engine = engine;
	}
	
	public double calculateDeliveryCost() {
		return baseCost * 1.0;
	}
	
	public String getVehicleInfo() {
		return "Vehicle Model :" + model +
				"\nBase Cost: $" + baseCost +
				"\n" + engine.getEngineInfo();
	}
	
	public String getModel() {
		return model;
	}
	
	public double getBaseCost() {
		return baseCost;
	}
	
	public Engine getEngine() {
		return engine;
	}
}
