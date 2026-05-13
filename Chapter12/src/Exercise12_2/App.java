package Exercise12_2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        boolean goodInput = true;
        int result = 0;
        int a = 0;
        int b = 0;

        do {
            System.out.print("Enter two integers: ");
            try {
                a = input.nextInt();
                b = input.nextInt();

                if (!goodInput) {
                    goodInput = true;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Try again");
                input.nextLine();
                goodInput = false;
            }

        }
        while (!goodInput);

        System.out.println("Sum of two integers is " + (a + b));
    }
}
