package Practice2;

public class Student {
    String name;
    int id;
    int year;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        year = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public void incrementYear() {
        this.year++;
    }
}
