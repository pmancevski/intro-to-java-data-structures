import java.util.Locale;
import java.util.Scanner;

public class Exercise5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter saving amount: ");
        double savingAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of months: ");
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double savings = 0;

        for(int month = 1; month <= numberOfMonths; month++) {
            savings = (savingAmount + savings) * (1 + monthlyInterestRate);
        }

        System.out.println("Savings after " + numberOfMonths + " months: " + savings);
    }
}
