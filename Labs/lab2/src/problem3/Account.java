package problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum){
        balance += sum;
    }

    public void withdraw(double sum){
        if(balance >= sum){
            balance -= sum;
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getAccNumber(){
        return accNumber;
    }

    public void  transfer(double amount, Account other){
        if(this.balance >= amount){
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    public String toString(){
        return "Account " + accNumber + ": Balance = $" + balance;
    }

    public final void print(){
        System.out.println(toString());
    }


}
