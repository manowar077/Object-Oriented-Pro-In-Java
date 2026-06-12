package three.Abstraction;

public class savingAccount extends BankAccount{
    public savingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        IO.println("Deposited");
        IO.println(amount);
    }

    @Override
    public void withdraw(double amount) {
        IO.println("withdraw !");
    }
}
