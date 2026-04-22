import java.util.Locale;
import java.util.Scanner;

public class Exercise5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.nextLine();

        if (number.length() != 9){
            System.out.println("Invalid ISBN number");
            System.exit(0);
        }

        int number1 = Integer.parseInt(number);

        int checksum = 0;

        for (int counter = 9; counter > 0; counter--) {
            checksum += (number1 % 10) * counter;
            number1 = number1 / 10;
        }

        checksum %= 11;

        if (checksum == 10){
            System.out.print("The ISBN-10 number is " + number + "X");
        }
        else {
            System.out.print("The ISBN-10 number is " + number + checksum);
        }
    }
}
