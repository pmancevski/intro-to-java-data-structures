import java.util.Locale;
import java.util.Scanner;

public class Exercise5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double annualPercentage = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int numberOfMonths = input.nextInt();

        double monthlyInterestRate = annualPercentage / 1200;

        System.out.println("Month\t\t\tCD Value");
        for(int i = 1; i <= numberOfMonths; i++) {
            depositAmount = depositAmount + depositAmount * monthlyInterestRate;

            System.out.printf("%3d%22.2f%n", i, depositAmount);
        }
    }
}
