import java.util.Locale;
import java.util.Scanner;

public class Exercise5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");

        for (double interestRate = 5.000; interestRate <= 8.000; interestRate += 0.125){

            double monthlyInterestRate = interestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    ( 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%8.3f%%\t\t%13.2f\t\t%13.2f%n",  interestRate, monthlyPayment, totalPayment);
        }
    }
}
