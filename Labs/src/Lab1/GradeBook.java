package Lab1;

import Lab1.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {
	private Course course;
    private ArrayList<Student> students;
    
    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }
    
    public void displayMessage() {
        System.out.println("\nWelcome to the grade book for " + course.getName());
    }
    
    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input grades for students:");
        
        for (Student student : students) {
            System.out.print("Grade for " + student.getName() + ": ");
            double grade = scanner.nextDouble();
            student.setGrade(grade);
        }
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    public void determineClassAverage() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        double average = sum / students.size();
        System.out.printf("Class average: %.2f%n", average);
    }
    
    public void determineBestAndLowest() {
        Student best = students.get(0);
        Student lowest = students.get(0);
        
        for (Student student : students) {
            if (student.getGrade() > best.getGrade()) {
                best = student;
            }
            if (student.getGrade() < lowest.getGrade()) {
                lowest = student;
            }
        }
        System.out.println("Highest grade: " + best.getGrade() + " (" + best.getName() + ")");
        System.out.println("Lowest grade: " + lowest.getGrade() + " (" + lowest.getName() + ")");
    }
    
    public void displayGradeStatistics() {
        int a=0, b=0, c=0, d=0, f=0;
        
        for (Student student : students) {
            char letter = student.getLetterGrade();
            if (letter == 'A') a++;
            else if (letter == 'B') b++;
            else if (letter == 'C') c++;
            else if (letter == 'D') d++;
            else f++;
        }        
        System.out.println("A: " + a + " students");
        System.out.println("B: " + b + " students");
        System.out.println("C: " + c + " students");
        System.out.println("D: " + d + " students");
        System.out.println("F: " + f + " students");
    }
    public void outputBarChart() {
        System.out.println("\nGrade distribution:");
        int[] ranges = new int[10]; // 0-9, 10-19, ..., 90-99
        
        for (Student student : students) {
            int grade = (int)student.getGrade();
            int index = grade / 10;
            if (index >= 0 && index < 10) {
                ranges[index]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d-%02d: ", i*10, i*10+9);
            for (int j = 0; j < ranges[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void displayGradeReport() {
        System.out.println("\nGrade Report");
        determineClassAverage();
        determineBestAndLowest();
        displayGradeStatistics();
        outputBarChart();
    }  
    @Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
}
