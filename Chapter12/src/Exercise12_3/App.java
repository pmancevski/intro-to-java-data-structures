package Exercise12_3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Random random = new Random();

        int[] integers = new int[100];
        for (int count = 0; count < integers.length; count++) {
            integers[count] = random.nextInt(100);
        }

        System.out.print("Enter index or the array: ");
        int index = input.nextInt();

        try {
            System.out.println(integers[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + index);
        }
    }
}
