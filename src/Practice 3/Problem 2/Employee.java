package Practice3.Problem2;

public class Employee extends Person {

    private String school;
    private double pay;

    public Employee(String name, String address, String school, double pay) {
        super(name, address);

        isNullOrIsBlank(school);

        isItemNegative(pay);

        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        isNullOrIsBlank(school);
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        isItemNegative(pay);
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() +
                ", school=" + school +
                ", pay=" + pay + "]";
    }
}
