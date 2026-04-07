package pr3.delivery.moodel;

public class Truck extends Vehicle {
	private double maxLoad;
	
	public Truck(String model, double baseCost, Engine engine, double maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }
        
    @Override
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() * 1.2;
    }
    
    public double calculateDeliveryCost(double distance, double fuelPrice) {
        double fuelCost = distance * fuelPrice * (maxLoad / 10);
        return calculateDeliveryCost() + fuelCost;
    }
    
    @Override
    public String getVehicleInfo() {
        return super.getVehicleInfo() + 
               "\nMax Load: " + maxLoad + " tons" +
               "\nVehicle Type: Truck";
    }
    
    public double getMaxLoad() {
        return maxLoad;
    }
}
