package Lab1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data dataSet = new Data();
		
		System.out.println("Enter number to analyze Type 'Q' to quit.");
		
		while (true) {
			System.out.println("Enter number (Q to quit): ");
			
			if(!scanner.hasNext()) {
				break;
			}
			
			if(scanner.hasNextDouble()) {
				double number = scanner.nextDouble();
				dataSet.add(number);
			}
			else {
				String input = scanner.next();
				
				if(input.equalsIgnoreCase("Q")) {
					break;
				}
				else {
					System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
				}
			}
		}
		
		System.out.println("\nResults:");
		System.out.println("Average = " + dataSet.average());
		System.out.println("Maximum = " + dataSet.maximum());
		
		scanner.close();
		
	}
}
