package Exercise12_6;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            if (!((hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || (hex.charAt(i) >= 'a' && hex.charAt(i) <= 'f'))) {
                throw new NumberFormatException("String " + hex + " contains invalid characters");
            }

            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
