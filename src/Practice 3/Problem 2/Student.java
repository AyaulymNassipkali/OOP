package Practice3.Problem2;

public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);

        isNullOrIsBlank(program);
        isItemNonNegative(year);
        isItemNegative(fee);

        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        isNullOrIsBlank(program);
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        isItemNonNegative(year);
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        isItemNegative(fee);
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() +
                ", program=" + program +
                ", year=" + year +
                ", fee=" + fee + "]";
    }
}
