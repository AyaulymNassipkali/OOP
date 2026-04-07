package mathOperation;

public class Conditionals {
	public static void main(String[] args) {
		int a = 15, b= 15;
		char sym1= 'A', sym2 = 'A';
		boolean isHasCar = false;
		if(!isHasCar) {
			System.out.println("True");
		}
		else if ( a>= b) {
			System.out.println("Second test");
		}
		else if ( a<= b) {
			System.out.println("Second test");
		}
		else if ( a == b) System.out.println("Second test");
		else System.out.println("False");
	}
}
