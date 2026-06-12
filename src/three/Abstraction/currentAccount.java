package three.Abstraction;

public class currentAccount extends BankAccount {
    public currentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        IO.println("deposited");
    }

    @Override
    public void withdraw(double amount) {
        IO.println("withdraw !");
    }
}
