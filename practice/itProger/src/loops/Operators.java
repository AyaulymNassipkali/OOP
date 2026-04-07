package loops;

public class Operators {
	public static void main(String[] args) {
		for(int i=5; i < 25; i += 2) {
			if(i % 3 == 0) continue;
			
			if(i >= 17) break;
			
			System.out.println("Element: " + i);
		}
	}
}
