package pr3.delivery.moodel;

import pr3.delivery.moodel.*;
import pr3.delivery.service.DeliveryService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
        Engine engine1 = new Engine("V6", 250);
        Engine engine2 = new Engine("V8", 350);
        Engine engine3 = new Engine("Diesel", 400);

        Car car1 = new Car("Sedan", 100.0, engine1, 5);
        
        Truck truck1 = new Truck("Freightliner", 200.0, engine2, 10.5);

        Car car2 = new Car("SUV", 150.0, engine3, 7);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(truck1);
        vehicles.add(car2);

        DeliveryService deliveryService = new DeliveryService();

        System.out.println("---   VEHICLE DELIVERY SYSTEM    ---");
        
        deliveryService.printAllVehicles(vehicles);

        deliveryService.calculateAllDeliveries(vehicles);

        double totalCost = deliveryService.calculateTotalCost(vehicles);
        System.out.println("=== TOTAL COST ===");
        System.out.println("Total delivery cost for all vehicles: $" + 
                         String.format("%.2f", totalCost));

        System.out.println("\n=== DIRECT ENGINE ACCESS DEMONSTRATION ===");
        for (Vehicle v : vehicles) {
            System.out.println(v.getModel() + " has " + v.getEngine().getEngineInfo());
        }
    }
}
