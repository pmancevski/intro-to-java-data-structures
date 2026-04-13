import java.util.Locale;
import java.util.Scanner;

public class Exercise3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int originalNumber = number;

        int digit3 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number % 10;

        System.out.println(originalNumber + (digit1 == digit3 ? " is " : " is not ") + "a palindrome");
    }
}
