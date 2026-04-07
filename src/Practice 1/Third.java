package Practice1;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the grade in number: ");
        double grade = myScanner.nextDouble();
        String letterGrade = "";

        if (grade >= 94.5){
            letterGrade = "A";
        } else if (grade >= 89.5) {
            letterGrade = "A-";
        } else if (grade >= 84.5) {
            letterGrade = "B+";
        } else if (grade >= 79.5) {
            letterGrade = "B";
        } else if (grade >= 74.5) {
            letterGrade = "B-";
        } else if (grade >= 69.5) {
            letterGrade = "C+";
        } else if (grade >= 64.5) {
            letterGrade = "C";
        } else if (grade >= 59.5) {
            letterGrade = "C-";
        } else if (grade >= 54.5) {
            letterGrade = "D+";
        } else if (grade >= 49.5) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.println("Your grade in letter is: " + letterGrade);
    }

}
