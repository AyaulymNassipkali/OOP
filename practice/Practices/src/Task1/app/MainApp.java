package app;

import pr3.animal.model.Animal;
import pr3.animal.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		
		Animal animal1 = new Dog("Rex", 3, "German Shepherd");
		
		Dog dog1 = new Dog("Aq-taban", 2, "Golden Retriever");
        Dog dog2 = new Dog("Tory", 5, "Beagle"); 
        
        animals.add(animal1);
        animals.add(dog1);
        animals.add(dog2);
        
        System.out.println("Demonstrating Polymorphism \n");
        
        for (Animal animal : animals) {
            System.out.println("Processing animal:");
            animal.getInfo();
            animal.makeSound();
            animal.eat();
            animal.eat("dog food");
            System.out.println("--------------------\n");
        }
        System.out.println("=== Accessing Dog-specific methods ===");
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal; 
                System.out.println(dog.getBreed() + " is a specific breed.");
            }
        }
    }
}
