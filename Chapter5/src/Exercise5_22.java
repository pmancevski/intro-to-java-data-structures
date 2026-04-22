import java.util.Locale;
import java.util.Scanner;

public class Exercise5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                ( 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.printf("%nMonthly Payment: %.2f%nTotal Payment: %.2f%n%n", monthlyPayment, totalPayment);

        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");

        double interest;
        double principal;

        for (int count = 1; count <= numberOfYears * 12; count++) {
            interest = loanAmount * monthlyInterestRate;
            principal = monthlyPayment - interest;
            loanAmount = loanAmount - principal;

            System.out.printf("%3d\t\t%15.2f\t\t%12.2f\t\t%8.2f%n", count, interest, principal, loanAmount);
        }
    }
}
