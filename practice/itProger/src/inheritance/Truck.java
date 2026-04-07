package inheritance;

import inheritance.Transport.Engine;

public class Truck extends Transport {
	
	private boolean isLoaded;
	public Engine engine = new Engine();
	
	public Truck(int weight, byte[] coordinate) {
		super(weight, coordinate);
	}
	
	public Truck(int weight, byte[] coordinate, boolean osLoaded) {
		super(weight, coordinate);
		this.isLoaded = isLoaded;
	}
	

	public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
		super.setValues(speed, weight, color, coordinate);
		this.isLoaded = isLoaded;
	}
	
	@Override
	protected String getValues() {
		System.out.println(super.getValues());
		return getLoaded();
	}
	
	public void setLoaded(boolean loaded) {
		isLoaded = loaded;
	}
	
	public String getLoaded() {
		if(isLoaded) return "Truck is loaded";
		else return "Truck is not loaded";
	}

	@Override
	public void moveObject(float speed) {
		System.out.println("Our oblect move with speed: " + speed);
		
	}

	@Override
	public boolean stopObject() {
		this.speed = 0;
		return true;
	}
	
}
