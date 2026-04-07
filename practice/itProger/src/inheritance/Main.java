package inheritance;

public class Main {
	public static void main(String[] args) {
//		Car bmw =  new Car(123.7f, 7860, "Red", new byte[] {0,0,0});
//		bmw.engine.setValue(false, 5000);
//		bmw.engine.info();
		
		
//		Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);
//		truck.engine.setValue(true, 100);
//		truck.engine.info();
//		truck.setValues(123.7f, 7860, "Red", new byte[] {0,0,0}, true);
//		System.out.println(truck.getValues());
		
		Car flyCar = new Car(123.7f, 7860, "Red", new byte[] {0,0,0}) {
			@Override
			public void moveObject(float speed) {
				super.moveObject(speed);
				
				this.engine.isReady(true);
				System.out.println("Car is flying");
			}
		};
		
		flyCar.moveObject(450);
		
	}
}
