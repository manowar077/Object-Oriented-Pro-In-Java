package three.Abstraction;

public class AbstractionDemo {
    static void main() {
        savingAccount savingAccount = new savingAccount("qwerty",890);
        savingAccount.deposit(100);

        IO.println(savingAccount.getAccountNumber());

        BankAccount savingAccount1 =new savingAccount("zxcvb",564);
        savingAccount1 =new currentAccount("rtyui",899);
        savingAccount1.deposit(300);

        currentAccount currentAccount=new currentAccount("erttrr",678);
        currentAccount.withdraw(500);

        kidsAccount kidsAccount=new kidsAccount("344444",453);
        kidsAccount.deposit(300);
        kidsAccount.withdraw(400);

        savingAccount savingAccount2 =new savingAccount("wert54",4533);
        savingAccount2.deposit(454);
        IO.println(savingAccount2.getAccountNumber());
         savingAccount2 =new savingAccount("34556",453343);
        IO.println(savingAccount2.getAccountNumber());
    }
}
