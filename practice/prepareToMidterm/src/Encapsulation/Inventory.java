package Encapsulation;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Items> items;

	public Inventory() {
		items = new ArrayList<>();
}
	public void addItem(Items item) {
		items.add(item);
	}
	
	public void displayInventory() {
		for(Items item : items) {
			System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
		}
	}
	
}
