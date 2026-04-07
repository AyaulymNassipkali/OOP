package problem3;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int a, double rate) {
        super(a);
        this.interestRate = rate;
    }

    public void addInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}


