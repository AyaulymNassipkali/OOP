package constructors;

public class Transports {
	private float speed;
	private int weight;
	private String color;
	private byte[] coordinate;
	
	
	public Transports(float speed, int weight, String color, byte[] coordinate) {
		System.out.println("Object created;");
	    setValues(speed, weight, color, coordinate);
	    System.out.println(getValues());
	}
	
	public Transports(int weight, byte[] coordinate) {
		System.out.println();
		this.weight = weight;
		this.coordinate = coordinate;
		System.out.println(this.getValues());
	}
	
	public void setValues(float speed, int weight, String color, byte[] coordinate) {
		this.speed = speed;
		this.weight = weight;
		this.color = color;
		this.coordinate = coordinate;
	}
	
	public String getValues(){
		String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + "\n";
		String infoCoordinates = "Coordinates: \n";
		
		for(int i=0; i<coordinate.length; i++)
			infoCoordinates += coordinate[i] + "\n";
	return info + infoCoordinates;
	}
}
	
