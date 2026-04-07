package pr3.delivery.moodel;

import pr3.delivery.moodel.Vehicle;
import pr3.delivery.moodel.Car;
import pr3.delivery.moodel.Truck;
import java.util.List;

public class DeliveryService {
	public void printAllVehicles(List<Vehicle> vehicles) {
        System.out.println("-ALL VEHICLES INFORMATION-\n");
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("Vehicle #" + (i + 1) + ":");
            System.out.println(vehicles.get(i).getVehicleInfo());
            System.out.println("------------------\n");
        }
	}
	public void calculateAllDeliveries(List<Vehicle> vehicles) {
        System.out.println("-DELIVERY COST CALCULATIONS-\n");
        
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            System.out.println(v.getModel() + " - Standard Delivery: $" + 
                             String.format("%.2f", v.calculateDeliveryCost()));
            
            if (v instanceof Car) {
                Car car = (Car) v;
                double extraWeightCost = car.calculateDeliveryCost(50.0);
                
                System.out.println("   With extra weight (50kg): $" + 
                        String.format("%.2f", extraWeightCost));
   } else if (v instanceof Truck) {
       Truck truck = (Truck) v;
       double longDistanceCost = truck.calculateDeliveryCost(100.0, 2.5);
       System.out.println("   Long distance (100km): $" + 
               String.format("%.2f", longDistanceCost));
}
System.out.println();
}
}
	public double calculateTotalCost(List<Vehicle> vehicles) {
        double totalCost = 0.0;
        
        for (Vehicle v : vehicles) {
            totalCost += v.calculateDeliveryCost();
        }
        
        return totalCost;
    }
}
