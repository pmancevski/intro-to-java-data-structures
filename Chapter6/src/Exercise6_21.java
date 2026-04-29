import java.util.Locale;
import java.util.Scanner;

public class Exercise6_21 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter a phone string: ");
        String phoneString = input.nextLine();

        phoneString = phoneString.toUpperCase();

        String convertedPhoneString = "";

        for (int count = 0; count < phoneString.length(); count++) {
            if (Character.isLetter(phoneString.charAt(count))) {
                convertedPhoneString += String.valueOf(getNumber(phoneString.charAt(count)));
            }
            else {
                convertedPhoneString += phoneString.charAt(count);
            }
        }

        System.out.println(convertedPhoneString);
    }

    public static int getNumber(char uppercaseLetter){
        int number;
        switch (uppercaseLetter){
            case 'A', 'B', 'C' -> number = 2;
            case 'D', 'E', 'F' -> number = 3;
            case 'G', 'H', 'I' -> number = 4;
            case 'J', 'K', 'L' -> number = 5;
            case 'M', 'N', 'O' -> number = 6;
            case 'P', 'Q', 'R', 'S' -> number = 7;
            case 'T', 'U', 'V' -> number = 8;
            case 'W', 'Z', 'Y', 'X' -> number = 9;
            default -> {
                System.out.println("Invalid Input");
                System.exit(0);
                number = 0;
            }
        }

        return number;
    }
}
