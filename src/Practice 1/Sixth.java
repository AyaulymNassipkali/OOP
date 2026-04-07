package Practice1;

import java.util.Scanner;

/*
Why StringBuilder?
Because Java String is immutable (you can’t change its characters in-place),
but StringBuilder is mutable and has a built-in .reverse() method.
 */

public class Sixth {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String name = myScanner.nextLine();
        System.out.println(isPalindrome(name));
    }

    public static boolean isPalindrome(String myStr) {
        String reversedString = new StringBuilder(myStr).reverse().toString();
        return myStr.equals(reversedString);
    }
}
