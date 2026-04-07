package Practice1;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();
        String repeatedString = "-".repeat(name.length());

        System.out.println("+" + repeatedString + "+");
        System.out.println("|" + name + "|");
        System.out.println("+" + repeatedString + "+");
    }
}
