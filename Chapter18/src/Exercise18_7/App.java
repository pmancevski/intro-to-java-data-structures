package Exercise18_7;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static int countFibMethod = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
        System.out.println("Time Fibonacci method was executed: " + countFibMethod);
    }

    public static long fib(long index) {
        countFibMethod++;

        if (index == 0) // Base case
            return 0;
        else if (index == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }
}
