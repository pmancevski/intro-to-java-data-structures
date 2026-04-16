import java.util.Locale;
import java.util.Scanner;

public class Exercise4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        if (numberOfSides <= 0) {
            System.out.println("Invalid input. Please enter a positive integer");
            System.exit(0);
        }

        System.out.print("Enter the side length: ");
        double sideLength = input.nextDouble();

        double area = (numberOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("The area of the polygon is " + area);
    }
}
