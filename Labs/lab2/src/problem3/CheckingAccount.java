package problem3;

public class CheckingAccount extends Account {
    private int transactionCount = 0;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int a){
        super(a);
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee(){
        if(transactionCount > FREE_TRANSACTIONS){
            int billableTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = billableTransactions * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

}
