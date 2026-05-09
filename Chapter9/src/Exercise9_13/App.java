package Exercise9_13;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array:");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);
        System.out.println("The location of the largest element is 45 at (" + location.row + "," + location.column + ").");
    }
}
