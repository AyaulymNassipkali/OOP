package classesObjects;

public class Classes {
	public static void main(String[] args) {
		Transport bmw = new Transport();
		bmw.setValues(250.5f,  2500, "White", new byte[] {0,0,0});
		String res1 = bmw.getValues();
		System.out.println(res1);
		
		Transport truck = new Transport();
		truck.speed = 140.5f;
		truck.weight = 5600;
		truck.color = "Red";
		truck.coordinate = new byte[] {100, 0, 100};
		
		String res2 = truck.getValues();
		System.out.println(res2);
		
	}
}
