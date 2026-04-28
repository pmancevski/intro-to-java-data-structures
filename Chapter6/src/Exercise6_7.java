import java.util.Locale;
import java.util.Scanner;

public class Exercise6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.printf("%2s%15s%n", "Years", "Future value");

        for (int year = 1; year <= 30; year++) {
            System.out.printf("%2d%15.2f%n", year,
                    futureInvestmentValue(investmentAmount, monthlyInterestRate, year));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, (years * 12));
    }
}
