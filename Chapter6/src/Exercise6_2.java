import java.util.Locale;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        System.out.println("The sum of digits is: " + sumDigits(number));
    }

    public static int sumDigits(long n){
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
