package mathOperation;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("Number is 1");
			break;
		case 2:
			System.out.println("Number is 2");
			break;
		case 3:
			System.out.println("Number is 3");
			break;
		case 4:
			System.out.println("Number is 4");
			break;
		case 10:
			System.out.println("Number is 10");
			break;
		default:
			System.out.println("default");
			
	}
}
}
