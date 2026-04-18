import java.util.Locale;
import java.util.Scanner;

public class Exercise4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string to process: ");
        String string = input.nextLine();

        System.out.printf("Length of the string: %d%nFirst character of the string: %s",
                string.length(), string.charAt(0));
    }
}
