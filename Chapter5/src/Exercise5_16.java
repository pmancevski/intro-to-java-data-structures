import java.util.Locale;
import java.util.Scanner;

public class Exercise5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter integer: ");
        int number = input.nextInt();

        System.out.print("Following numbers are smallest factors: ");
        for (int i = 2; i <= number; i++) {

            while (number % i == 0) {
                number = number / i;
                System.out.print(i + " ");
            }
        }
    }
}
