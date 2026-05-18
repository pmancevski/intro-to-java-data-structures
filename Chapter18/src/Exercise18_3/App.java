package Exercise18_3;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter two numbers: ");
        long a = input.nextLong();
        long b = input.nextLong();

        System.out.println("GCD is " + gcd(a, b));
    }

    public static long gcd(long m, long n) {
        if (m % n == 0) {
            return n;
        }
        else {
            return gcd(n, m % n);
        }
    }
}
