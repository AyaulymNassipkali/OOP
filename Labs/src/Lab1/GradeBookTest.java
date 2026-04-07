package Lab1;

public class GradeBookTest {
	public static void main(String[] args) {
        Course course = new Course(
            "CS101 Object-oriented Programming",
            "OOP basics in Java",
            3,
            "CS100"
        );
        
        GradeBook gradeBook = new GradeBook(course);

        gradeBook.addStudent(new Student("A"));
        gradeBook.addStudent(new Student("B"));
        gradeBook.addStudent(new Student("C"));
        gradeBook.addStudent(new Student("D"));
        gradeBook.addStudent(new Student("E"));
        gradeBook.addStudent(new Student("F"));

        
        gradeBook.displayMessage();

        gradeBook.inputGrades();

        gradeBook.displayGradeReport();

        System.out.println("\n" + course);
        System.out.println(gradeBook);
    }
}
