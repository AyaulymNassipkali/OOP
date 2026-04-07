package pr4.interfaces.main;
import pr4.interfaces.model.task3.Student;
import pr4.interfaces.model.task3.NameComparator;
import java.util.*;

public class Main3 {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ayaulym", 3.9));
        students.add(new Student("Aida", 3.5));
        students.add(new Student("Yerasyl", 3.8));

        System.out.println("List by using list:" + students);

        Collections.sort(students);
        System.out.println("\nSorted by GPA: " + students);
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name: " + students);
    }
}
