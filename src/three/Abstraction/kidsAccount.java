package three.Abstraction;

public class kidsAccount extends BankAccount{
    public kidsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        IO.println("deposited to kids account");
    }
    @Override
    public void withdraw(double amount){
        IO.println("withdraw amount from kids account");
    }

}
