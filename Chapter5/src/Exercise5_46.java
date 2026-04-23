import java.util.Locale;
import java.util.Scanner;

public class Exercise5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String newString = "";

        for (int count = str.length() - 1; count >= 0 ; count--) {
            newString += str.charAt(count);
        }

        System.out.println("The reversed string is " + newString);
    }
}
