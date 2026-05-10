package Exercise10_7;

import Utils.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Account[] accounts = initializeAccounts();
        boolean isPowerOn = true;

        while (isPowerOn) {
            int id = getId(accounts, input);
            Account account = accounts[id];

            boolean isSameId = true;
            while (isSameId) {
                isSameId = isSameAccount(account, input);
            }

        }
    }

    public static boolean isSameAccount(Account account, Scanner input){
        printMainMenu();

        int choice = input.nextInt();

        switch (choice){
            case 1 -> {
                System.out.println("The balance is $" + account.getBalance());
                return true;
            }
            case 2 -> {
                System.out.print("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                account.withdraw(amount);
                return true;
            }
            case 3 -> {
                System.out.print("Enter amount to deposit: ");
                double deposit = input.nextDouble();
                account.deposit(deposit);
                return true;
            }
            case 4 -> {
                System.out.println();
                return false;
            }
            default -> {
                System.out.println("Invalid input!");
                return true;
            }
        }
    }

    public static int getId(Account[] accounts, Scanner input){
        boolean flag = true;

        do {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            for (Account account : accounts){
                if (account.getId() == id){
                    return id;
                }
            }

            System.out.println("\n----Invalid id!----");

        }
        while (flag);

        return -1;
    }

    public static void printMainMenu(){
        System.out.println("\nMain menu");
        System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
        System.out.print("Enter a choice: ");
    }

    public static Account[] initializeAccounts(){
        Account[] accounts = new Account[10];

        for (int count = 0; count < accounts.length; count++) {
            accounts[count] = new Account(count, 100);
        }

        return accounts;
    }
}
