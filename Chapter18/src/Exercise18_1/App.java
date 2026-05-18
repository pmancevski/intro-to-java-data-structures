package Exercise18_1;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a nonnegative integer: ");
        BigInteger integer = input.nextBigInteger();

        System.out.println("Factorial of " + integer + " is " + factorial(integer));
    }

    public static BigInteger factorial(BigInteger number) {
        if (number.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }
        else {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }
    }
}
