package Practice3.Problem2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Set<Person> people = new HashSet<>();

    static void main(String[] args) {
        // Adding Person
        System.out.println("Adding Preson");
        System.out.println("Name: ");
        String namePerson = scanner.nextLine();
        System.out.println("Address: ");
        String addressPerson = scanner.nextLine();

        people.add(new Person(namePerson, addressPerson));
        System.out.println("Person added.");

        // Adding Student
        System.out.println("Adding Student");
        System.out.print("Name: ");
        String nameStudent = scanner.nextLine();
        System.out.print("Address: ");
        String addressStudent = scanner.nextLine();
        System.out.print("Program: ");
        String programStudent = scanner.nextLine();
        System.out.print("Year: ");
        int yearStudent = scanner.nextInt();
        System.out.print("Fee: ");
        double feeStudent = scanner.nextDouble();
        scanner.nextLine();

        people.add(new Student(nameStudent, addressStudent, programStudent, yearStudent, feeStudent));
        System.out.println("Student added.");

        // Adding Employee
        System.out.println("Adding Employee");
        System.out.print("Name: ");
        String nameEmployee = scanner.nextLine();
        System.out.print("Address: ");
        String addressEmployee = scanner.nextLine();
        System.out.print("School: ");
        String schoolEmployee = scanner.nextLine();
        System.out.print("Pay: ");
        double payEmployee = scanner.nextDouble();
        scanner.nextLine();

        people.add(new Employee(nameEmployee, addressEmployee, schoolEmployee, payEmployee));
        System.out.println("Employee added.");

        printAll();
    }

    private static void printAll() {
        if (people.isEmpty()) {
            System.out.println("No users added yet.");
            return;
        }
        System.out.println("\n--- All Users ---");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println("Total: " + people.size());
    }
}
