package mathOperation;

import java.util.Scanner;

public class Fisrt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String username = scan.nextLine();
//		System.out.println("Hello, " + username);
//		int num1 = scan.nextInt();
//		byte num2 = scan.nextByte();
//		boolean b = scan.nextBoolean()
		
		short num1 = 50, num2 = 10;
		int res = num1  % num2;
		
		res += 10;
		res ++;
		res--;
		System.out.println("Result: "  + res);
	}
}
