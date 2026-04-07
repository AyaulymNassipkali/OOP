package Practice1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int a = myScanner.nextInt();

        int area = a * a;
        int perimeter = 4 * a;
        double diagonalLength = Math.sqrt(2) * a;

        System.out.println("Area: " + area + "\nPerimeter: " + perimeter + "\nThe length of a diagonal " + diagonalLength);
    }
}
