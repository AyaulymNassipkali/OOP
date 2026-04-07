package mathOperation;


import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the fisrt number: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the fisrt number: ");
		int b = scan.nextInt();
		
		int res;
		
		System.out.println("Action: ");
		String action = scan.next();
		
		switch(action) {
		case "+":
			res = a + b;
			System.out.println(res);
			break;
		case "-":
			res = a - b;
			System.out.println(res);
			break;
		case "*":
			res = a * b;
			System.out.println(res);
			break;
		case "/":
			if(b == 0) {
				System.out.println("We cannot divide the number by 0: ");
				break;
			}
			else {
			res = a / b;
			System.out.println(res);
			break;}
		case "%":
			System.out.println(a%b);
			break;
		}
		
		

	}
}
