package classesObjects;

public class Transport {
	public float speed;
	public int weight;
	public String color;
	public byte[] coordinate;
	
	public Transport() {
		//Join to DB
		System.out.println("Object created");
	}
	
	public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
		speed = _speed;
		weight = _weight;
		color = _color;
		coordinate = _coordinate;
	}
	
	public String getValues() {
		String info = "Object speef: " + speed + ". Weight: " + weight + ".Color: " + color + "\n";
		String infoCoordinate = "Coordinates: \n";
		for(int i=0; i < coordinate.length; i++) {
			infoCoordinate += coordinate[i] + "\n";
		}return info + infoCoordinate;
	}
}
