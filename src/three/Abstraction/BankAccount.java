package three.Abstraction;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public BankAccount(String accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance= balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
