package Practice1;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the balance: ");
        double initialBalance = myScanner.nextDouble();
        double interestRate = 10.0;

        double interest = initialBalance * interestRate / 100.0;
        double newBalance = initialBalance + interest;

        System.out.println("New balance is: " + newBalance);
    }
}
