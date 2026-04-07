package Lab1;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature(){
		this.value = 0.0;
		this.scale = 'C';
	}
	
	public Temperature(double value) {
		this.value = value;
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0.0;
		this.scale = checkScale(scale);
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = checkScale(scale);
	}
	
	private char checkScale(char scale) {
		if(scale == 'C' || scale == 'F') {
			return scale;
		}
		else {
			return 'C';
		}
	}
	
	
	public double getCelsius() {
		if (scale == 'C'){
			return value;
		} else {
			return 5.0 * (value - 32.0) / 9.0;
		}
	}
	
	public double getFahrenheit() {
		if(scale == 'F') {
			return value;
		}else {
			return (9.0 * value / 5.0) + 32.0;
		}
		}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setScale(char scale) {
		this.scale = checkScale(scale);
	}
	
	public void setBoth(double value, char scale) {
		this.value = value;
		this.scale = checkScale(scale);
	}
	
	public char getScale() {
		return scale;
	}
	
	
//Testing
	
	public static void main(String[] srgs) {
		Temperature t1 = new Temperature();
		Temperature t2 = new Temperature(25.0);
		Temperature t3 = new Temperature('F');
		Temperature t4 = new Temperature(98.6, 'F');
		
		System.out.println("t1: " + t1.getCelsius() + 'C');
		System.out.println("t2: " + t2.getFahrenheit() + 'F');
		System.out.println("t3: " + t3.getCelsius() + "C");
		System.out.println("t4: " + t4.getCelsius() + "C");
		
		t1.setValue(100.0);
		t1.setScale('F');
		System.out.println("t1 after changing: " + t1.getCelsius() + 'C');
		
		System.out.println("Scale of t4: " + t4.getScale());
	}
}


