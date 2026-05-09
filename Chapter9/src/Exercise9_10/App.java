package Exercise9_10;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter values for a, b and c:");
        // its good to have a check here, but for the task this is fine
        QuadraticEquation quadraticEquation =
                new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Equation has 1 root: " + quadraticEquation.getRoot1());
        }
        else if (quadraticEquation.getDiscriminant() > 0){
            System.out.printf("Equation has 2 roots: %n\tRoot 1: %.2f%n\tRoot 2: %.2f%n%n",
                    quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        }
        else {
            System.out.println("The equation has no roots.");
        }
    }
}
