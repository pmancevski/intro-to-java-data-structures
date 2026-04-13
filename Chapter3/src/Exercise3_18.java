import java.util.Locale;
import java.util.Scanner;

public class Exercise3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the weight of the package for shipping: ");
        double weight = input.nextDouble();

        double shippingCost = 0;

        if (weight <= 0){
            System.out.println("Invalid input.");
            System.exit(0);
        }
        else if (weight > 20){
            System.out.println("The package cannot be shipped.");
            System.exit(0);
        }
        else if (weight > 0 && 1 >= weight){
            shippingCost = weight * 3.5;
        }
        else if (weight > 1 && 3 >= weight){
            shippingCost = weight * 5.5;
        }
        else if (weight > 3 && 10 >= weight){
            shippingCost = weight * 8.5;
        }
        else {
            shippingCost = weight * 10.5;
        }

        System.out.println("Cost of shipping for package of " + weight + " is: " + shippingCost);
    }
}
