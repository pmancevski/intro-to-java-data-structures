import java.util.Locale;
import java.util.Scanner;

public class Exercise4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a character: ");
        char unicode = input.next().charAt(0);

        System.out.println("The unicode for character " + unicode + " is " + (int)unicode);
    }
}
