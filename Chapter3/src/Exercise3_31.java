import java.util.Locale;
import java.util.Scanner;

public class Exercise3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        if (choice < 0 || choice > 1) {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

        System.out.print("Enter the"+ (choice == 0 ? " dollars " : " RMB") +" amount: ");
        double amount = input.nextDouble();

        if (choice == 0) {
            System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan");
        }
        else {
            System.out.println(amount + " yuan is $" + (amount / exchangeRate));
        }
    }
}
