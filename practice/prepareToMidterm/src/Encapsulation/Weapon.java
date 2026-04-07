package Encapsulation;

public class Weapon extends Items {
	private int damage;
	private String type;
	
	public Weapon(String name. int quantity, int damage, String type) {
		super(name, quantity);
		this.damage = damage;
		this.type = type;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getType() {
		return type;
	}
}
