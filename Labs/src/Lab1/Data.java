package Lab1;

public class Data {
	private double sum;
	private int count;
	private double maximum;
	
	public Data() {
		sum = 0.0;
		count = 0;
		maximum = Double.NEGATIVE_INFINITY;
	}
	
	public void add(double value) {
		sum += value;
		count++;
		
		if (value > maximum) {
			maximum = value;
		}
	}
	
	
	public double average(double value) {
		
		if (count == 0.0) {
			return 0.0;
		}
		return sum/count;
	}
	
	
	public double maximum() {
		if(count == 0) {
			return 0.0;
		}
		return maximum;
	}
	
	public int getCount() {
		return count;
	}
}