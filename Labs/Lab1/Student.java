package Lab1;

public class Student {
	private String name;
    private double grade;
    
    public Student(String name) {
        this.name = name;
        this.grade = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public char getLetterGrade() {
    	if(grade >= 90) return 'A';
    	if(grade >= 80) return 'B';
    	if(grade >= 70) return 'C';
    	if(grade >= 60) return 'D';
    	return 'F';
    }
    
    @Override
    public String toString() {
    	return name + " - " + grade;
    }
}
