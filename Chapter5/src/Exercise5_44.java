import java.util.Locale;
import java.util.Scanner;

// this exercise is also skipped
public class Exercise5_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
    }
}
