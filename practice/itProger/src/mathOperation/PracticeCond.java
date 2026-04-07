package mathOperation;

import java.util.Scanner;

public class PracticeCond {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter role: ");
		String role = scan.nextLine();
		System.out.println("Enter password");
		String pass = scan.nextLine();
		if(role.equals("Admin") && pass.equals("12345")) System.out.println("All users");
		else {
			System.out.println("hello, what is your name? ");
			String name = scan.nextLine();
		}
	}
}
