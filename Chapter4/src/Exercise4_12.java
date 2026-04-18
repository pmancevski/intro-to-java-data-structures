import java.util.Locale;
import java.util.Scanner;

public class Exercise4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a hex digit: ");
        char hexDigit = input.next().charAt(0);

        hexDigit = Character.toUpperCase(hexDigit);

        if (!(((int)hexDigit >= 65 && (int)hexDigit <= 70) || ((int)hexDigit >= 48 && (int)hexDigit <= 57))) {
            System.out.println(hexDigit + " is invalid input");
            System.exit(1);
        }

        String binaryDigit = "";

        // there is a method for conversion toBinary, but started user input as char
        switch (hexDigit) {
            case '0' -> binaryDigit = "0000";
            case '1' -> binaryDigit = "0001";
            case '2' -> binaryDigit = "0010";
            case '3' -> binaryDigit = "0011";
            case '4' -> binaryDigit = "0100";
            case '5' -> binaryDigit = "0101";
            case '6' -> binaryDigit = "0110";
            case '7' -> binaryDigit = "0111";
            case '8' -> binaryDigit = "1000";
            case '9' -> binaryDigit = "1001";
            case 'A' -> binaryDigit = "1010";
            case 'B' -> binaryDigit = "1011";
            case 'C' -> binaryDigit = "1100";
            case 'D' -> binaryDigit = "1101";
            case 'E' -> binaryDigit = "1110";
            case 'F' -> binaryDigit = "1111";
        }

        System.out.println("The binary value is " + binaryDigit);
    }
}
