package Encapsulation;

public class Main {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		String string = "string";
		
		Items item = new Items("Lemons", 23);
		Fruit fruit = new Fruit("Apples", 5, "Fuji");
		
		inventory.addItem(item);
		inventory.addItem(fruit);
		
		inventory.displayInventory();
	}
}
