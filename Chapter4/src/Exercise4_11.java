import java.util.Locale;
import java.util.Scanner;

public class Exercise4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal < 0 || decimal > 15) {
            System.out.println(decimal + " is an invalid input");
            System.exit(0);
        }

        String hexValue;

        switch (decimal) {
            case 10 -> hexValue = "A";
            case 11 -> hexValue = "B";
            case 12 -> hexValue = "C";
            case 13 -> hexValue = "D";
            case 14 -> hexValue = "E";
            case 15 -> hexValue = "F";
            default -> hexValue = String.valueOf(decimal);
        }

        System.out.println("The hex value is " + hexValue);
    }
}
