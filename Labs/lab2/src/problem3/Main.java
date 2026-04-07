package problem3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount s = new SavingAccount(1006, 10);
        CheckingAccount c = new CheckingAccount(1007);

        bank.openAccount(s);
        bank.openAccount(c);

        s.deposit(1000);
        c.deposit(500);

        c.withdraw(10); c.withdraw(10); c.withdraw(10); c.withdraw(10); c.withdraw(10);

        System.out.println("---Before updating---");
        bank.displayAccounts();

        bank.update();

        System.out.println("\n---After updating (deductFee % and delete fee)--- ");
        bank.displayAccounts();
    }
}
