import java.util.Locale;
import java.util.Scanner;

public class Exercise3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter weight and price for package 1: ");
        double weight = input.nextDouble();
        double price = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        double precePerKg1 = price / weight;
        double precePerKg2 = price1 / weight1;

        if (precePerKg1 > precePerKg2){
            System.out.println("Package 2 has better price.");
        }
        else if (precePerKg1 < precePerKg2){
            System.out.println("Package 1 has better price.");
        }
        else {
            System.out.println("Two packages have the same price.");
        }
    }
}
