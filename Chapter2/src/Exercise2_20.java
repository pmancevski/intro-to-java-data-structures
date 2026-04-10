import java.util.Scanner;

public class Exercise2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        System.out.println("The interest is " + (balance * (interestRate/1200)));
    }
}
