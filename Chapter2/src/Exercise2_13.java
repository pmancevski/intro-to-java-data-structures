import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double monthlyInterestRate = 1 + ((5.0 / 100) / 12);

        double result = monthlySaving * monthlyInterestRate;
        result = (result + monthlySaving) * monthlyInterestRate;
        result = (result + monthlySaving) * monthlyInterestRate;
        result = (result + monthlySaving) * monthlyInterestRate;
        result = (result + monthlySaving) * monthlyInterestRate;
        result = (result + monthlySaving) * monthlyInterestRate;

        System.out.println("After the sixth month, the account value is $" + result);
    }
}
