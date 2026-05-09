package Exercise9_11;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter values for a, b, c, d, e and f: ");
        LinearEquation linearEquation = new LinearEquation(input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        if (!linearEquation.isSolvable()){
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
        }
    }
}
