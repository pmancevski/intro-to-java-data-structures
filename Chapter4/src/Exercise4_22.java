import java.util.Locale;
import java.util.Scanner;

public class Exercise4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string s1: ");
        String s1 = input.nextLine();
        System.out.print("Enter a string s2: ");
        String s2 = input.nextLine();

        System.out.printf("%s is %s a substring of %s%n", s2, (s1.contains(s2) ? "" : " not "), s1);
    }
}
