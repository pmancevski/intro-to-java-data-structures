package Exercise11_8;

import Utils.Account;

public class App {
    public static void main(String[] args) {
        Account account = new Account(1122, "George", 1000);
        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account holder: " + account.getName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("\nTransaction history:");

        for (Transaction t : account.getTransactions()) {
            System.out.println(t);
        }
    }
}
