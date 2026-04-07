package Encapsulation;

public class Items {
	private String name;
	private int quantity;
	
	public Items(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantity() {
		return quantity;
	}
}
