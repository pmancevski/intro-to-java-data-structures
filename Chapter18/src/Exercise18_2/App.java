package Exercise18_2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    public static long fib(long index) {
        long f0 = 0; // For fib(0)
        long f1 = 1; // For fib(1)

        long currentFib = 0;

        for (int i = 1; i < index; i++) {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
        }

        return currentFib;
    }

//    public static long fib(long index) {
//        if (index == 0) // Base case
//            return 0;
//        else if (index == 1) // Base case
//            return 1;
//        else  // Reduction and recursive calls
//            return fib(index - 1) + fib(index - 2);
//    }
}
